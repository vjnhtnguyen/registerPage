package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class registerPage extends testBase {
    public WebDriver driver = wd;

    public registerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href,'/sg/register')]")
    public WebElement btnNavigateRegister;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement txtFullName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement txtEmail;

    @FindBy(xpath = "//input[@name='phone']/preceding-sibling::div")
    public WebElement startWithPhoneNumber;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement txtPhoneNumber;

    @FindBy(xpath = "//div[text()='Appointed director']")
    public WebElement ckbRoleOnCompany;

    @FindBy(xpath = "//input[@placeholder='Select any of the following']")
    public WebElement txtPrefer;

    @FindBy(xpath = "//div[text()='Others']")
    public WebElement optionOther;

    @FindBy(xpath = "//div[text()='I have read and agree with the ']//preceding-sibling::div/div/div")
    public WebElement ckbAgree;

    @FindBy(xpath = "//button[@type='submit']//span[text()='Continue']")
    public WebElement btnContinue;

    @FindBy(xpath = "    //div[contains(@class,'q-pb-md incorporated_selector__column incorporated_selector__separator')]//button")
    public WebElement btnContinue2;

    @FindBy(xpath = "//span[contains(text(),'Standard Registration')]/parent::div/following-sibling::button/span/span")
    public WebElement btnStandardGetStarted;

    @FindBy(xpath = "//span[text()='Get Started']")
    public WebElement btnGetStarted;

    @FindBy(xpath = "//div[contains(text(),'Date of Birth')]/parent::div/following-sibling::label/div")
    public WebElement labelDateOfBirth;


    @FindBy(xpath = "//button/span/span/span[@class='block' and contains(text(),'202')]")
    public WebElement labelYear;

    @FindBy(xpath = "//div[contains(@class,'q-date__main')]//button//i[contains(@class,'fas fa-chevron-left q-icon notranslate')]")
    public WebElement btnLeftArrow;

    @FindBy(xpath = "//span[text()='2000']")
    public WebElement labelYear2000;

    @FindBy(xpath = "//span[text()='1']")
    public WebElement labelDate1;

    @FindBy(xpath = "//div[@label='Nationality']/label")
    public WebElement labelNationality;

    @FindBy(xpath = "//div[text()='Afghanistan']")
    public WebElement optionAfghanistan;
    //div[text()='Male']
    @FindBy(xpath = "//div[@label='Gender']/label")
    public WebElement labelGender;

    @FindBy(xpath = "//div[text()='Male']")
    public WebElement optionMale;

    @FindBy(xpath = "    //div[@label='Which products are you interested in?']/label")
    public WebElement labelProduct;

    @FindBy(xpath = "  //div[text()='Credit Line']")
    public WebElement optionCreditLine;

    @FindBy(xpath = "//span[text()='Submit']/parent::span")
    public WebElement btnSubmit;

    @FindBy(xpath = "//p[contains(text(),'You have successfully verified your email. You’re on to a great start!')]")
    public WebElement labelVerifiedEmail;

    @FindBy(xpath = "//p[contains(text(),'You have successfully verified your phone number. You’re on to a great start!')]")
    public WebElement labelVerifiedPhoneNumber;

    @FindBy(xpath = "//span[text()='Resend OTP']")
    public WebElement resendOPT;

    @FindBy(xpath = "//div[contains(@class,'digit-input__box flex justify-between no-wrap')]")
    public WebElement inputOPT;

    @FindBy(xpath = "//input[@placeholder='Business Registration Number UEN']")
    public WebElement txtUEN;

    @FindBy(xpath = "//input[@placeholder='The full legal business name']")
    public WebElement txtBusinessName;

    @FindBy(xpath = "//div[contains(text(),'Registration Type')]/parent::div/following-sibling::label//i")
    public WebElement labelRegistrationType;

    @FindBy(xpath = "//div[text()='Company (Public company, Pte Ltd, LLC)']")
    public WebElement optionCompany;

    @FindBy(xpath = "//div[contains(text(),'Industry')]/parent::div/following-sibling::label//i")
    public WebElement labelIndustry;

    @FindBy(xpath = "//div[text()='Retail Services']")
    public WebElement optionRetailServices;

    @FindBy(xpath = "//div[contains(text(),'Sub Industry')]/parent::div/following-sibling::label//i")
    public WebElement labelSubIndustry;

    @FindBy(xpath = "//div[text()='Accommodation & Hotels']")
    public WebElement optionHotel;

    @FindBy(xpath = "//div[contains(text(),'Business Registration Number (UEN) is invalid')]")
    public WebElement labelErrorUNE;

}
