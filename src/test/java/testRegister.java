package test.java;

import main.java.registerPage;
import main.java.testBase;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class testRegister extends testBase {
    @Test
    void testRegister() throws InterruptedException {
        registerPage loginPage = new registerPage();
        String str = String.valueOf(new Date().getTime()).substring(3);

        wd.get("https://feature-qa.customer-frontend.staging.aspireapp.com/sg");
        checkPageIsReady();
        waitElement(loginPage.txtPhoneNumber);
        waitElement(loginPage.startWithPhoneNumber);
        loginPage.txtPhoneNumber.sendKeys(str);

        waitAndClick(loginPage.btnNavigateRegister);
        waitElement(loginPage.txtFullName);
        loginPage.txtFullName.sendKeys("Test" + str);
        loginPage.txtEmail.sendKeys("Test" + str + "@gmail.com");
        waitAndClick(loginPage.ckbRoleOnCompany);
        waitAndClick(loginPage.ckbAgree);
        waitAndClick(loginPage.btnContinue);
        waitElement(loginPage.resendOPT);
        Thread.sleep(1000);
        Actions actions = new Actions(wd);
        actions.sendKeys("1");
        actions.sendKeys("2");
        actions.sendKeys("3");
        actions.sendKeys("4");
        actions.build().perform();
        wait.until(ExpectedConditions.textToBePresentInElement(loginPage.labelVerifiedPhoneNumber,
                "You have successfully verified your phone number. You’re on to a great start!"));
        waitElement(loginPage.labelVerifiedPhoneNumber);
        waitAndClick(loginPage.btnContinue);
        waitAndClick(loginPage.btnContinue2);
        waitAndClick(loginPage.btnStandardGetStarted);
        waitAndClick(loginPage.btnGetStarted);
        waitAndClick(loginPage.labelDateOfBirth);
        waitAndClick(loginPage.labelYear);
        Thread.sleep(1000);
        waitAndClick(loginPage.btnLeftArrow);
        waitAndClick(loginPage.labelYear2000);
        waitAndClick(loginPage.labelDate1);
        waitAndClick(loginPage.labelNationality);
        waitAndClick(loginPage.optionAfghanistan);
        waitAndClick(loginPage.labelGender);
        waitAndClick(loginPage.optionMale);
        waitAndClick(loginPage.labelProduct);
        waitAndClick(loginPage.optionCreditLine);
        waitAndClick(loginPage.btnSubmit);
        waitAndClick(loginPage.inputOPT);
        Thread.sleep(1000);
        actions = new Actions(wd);
        actions.sendKeys("1");
        actions.sendKeys("2");
        actions.sendKeys("3");
        actions.sendKeys("4");
        actions.build().perform();
        waitAndClick(loginPage.btnGetStarted);
        loginPage.txtBusinessName.sendKeys(str);
        waitAndClick(loginPage.labelRegistrationType);
        waitAndClick(loginPage.optionCompany);
        waitElement(loginPage.txtUEN);
        loginPage.txtUEN.clear();
        loginPage.txtUEN.sendKeys( "12312312a");

        scrollIntoView(loginPage.labelIndustry);
        waitAndClick(loginPage.labelIndustry);
        waitAndClick(loginPage.optionRetailServices);

        scrollIntoView(loginPage.labelSubIndustry);
        waitAndClick(loginPage.labelSubIndustry);
        waitAndClick(loginPage.optionHotel);
        waitAndClick(loginPage.btnSubmit);
        Assert.assertTrue(loginPage.labelErrorUNE.isDisplayed());

        // 12312312a


    }
}
