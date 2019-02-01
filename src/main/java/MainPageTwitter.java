import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageTwitter {

    private WebDriver driver;

    public MainPageTwitter(WebDriver driver) {
        this.driver = driver;
    }

        @FindBy(xpath = "(//input[@autocomplete='username'])[1]")
        private WebElement telMainPageSignIn;
        @FindBy(xpath = "(//input[@name='session[password]'])[1]")
        private WebElement pasMainPageSignIn;
        @FindBy(xpath = "(//input[@value='Войти'])[1]")
        private WebElement buttSignInHead;
        @FindBy(xpath = "(//div[@class='StaticLoggedOutHomePage-buttons']/a[1])")
        private WebElement buttSignUp;
        @FindBy(xpath = "(//div[@class='StaticLoggedOutHomePage-buttons']/a[2])")
        private WebElement buttSignInMain;



        public MainPageTwitter sendTelorMail(String telOrMailOrName) {
            telMainPageSignIn.sendKeys(telOrMailOrName);
            return this;
        }

        public MainPageTwitter sendPass(String userPass) {
            pasMainPageSignIn.sendKeys(userPass);
            return this;
        }

        public LoginPage clickButtSignIn(){
            buttSignInHead.click();
            return new LoginPage(driver);
        }

        public LoginPage typeLoginPage(String userNameOrMail, String userPass) {
            this.sendTelorMail(userNameOrMail);
            this.sendPass(userPass);
            this.clickButtSignIn();
            return new LoginPage(driver);
        }


}
