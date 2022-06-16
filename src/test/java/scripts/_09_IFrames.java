package scripts;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonHomePage;
import utilities.Waiter;

public class _09_IFrames extends Base{

    /*
    Go to http://the-internet.herokuapp.com/
    Click on "Frames" link
    Click on "iFrame" link
    Clear text "Your content goes here." in the content box
    Enter "Hello World" in the content box
    Validate the text of the content box is "Hello World"
    Validate the heading3 as "An iFrame containing the TinyMCE WYSIWYG Editor"
     */

    @Test(priority = 1)
    public void testIFrame1(){
        driver.get("http://the-internet.herokuapp.com/");
        Waiter.pause(2);
        heroAppPage.clickOnLink("Frames");
        Waiter.pause(2);
        heroAppPage.iFrameLink.click();
        Waiter.pause(2);

        //switch to inner html - iframe
        //driver.switchTo().frame(0);
        //driver.switchTo().frame("mce_0_ifr");
        driver.switchTo().frame(heroAppPage.innerIFrame);

        heroAppPage.contentBox.clear();
        Waiter.pause(2);
        heroAppPage.contentBox.sendKeys("Hello World");
        Assert.assertEquals(heroAppPage.contentBox.getText(), "Hello World");

        //Switch back to parent html - outer
        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        Assert.assertEquals(heroAppPage.iFrameHeading3.getText(), "An iFrame containing the TinyMCE WYSIWYG Editor");
    }

    @Test(priority = 2)
    public void testIFrame2(){
        driver.get("https://www.rediff.com/");

        driver.switchTo().frame(rediffHomePage.moneyIFrame);
        //driver.switchTo().frame(0);
        //driver.switchTo().frame("moneyiframe");

        for(WebElement element : rediffHomePage.moneyCells){
            Assert.assertTrue(element.isDisplayed());
        }
    }

    /*
    TASK-5 - Amazon Address Modal
    Go to https://www.amazon.com/
    Click on "Select your address" link in the top navigation bar
    Validate "Choose your location" modal is displayed
    Enter your zip code to input box
    Click on "Apply" button
    Validate the zip code entered displayed in the delivery message
     */

    @Test(priority = 5, description = "TASK-5 - Amazon Address Modal")
    public void testAmazonAddressModal(){
        driver.get("https://www.amazon.com/");
        Waiter.pause(2);
        amazonHomePage.selectAddressLink.click();
        Waiter.pause(2);
        Assert.assertTrue(amazonHomePage.addressModal.isDisplayed());
        Waiter.pause(2);
        String zipCode = "60018";

        amazonHomePage.zipCodeInputBox.sendKeys(zipCode);
        Waiter.pause(2);
        amazonHomePage.applyButton.click();

        Assert.assertTrue(amazonHomePage.deliveryMessage.getText().contains(zipCode));
        Waiter.pause(2);
    }
}