package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.LoginObjects.*;

public class LoginPage {

    //declares web driver
    WebDriver driver=null;

    // create constructors that initialize the web driver element
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    //method to open url
    public void openURL(){
        driver.get("https://github.com/login");
    }

    //Method to enter username
    public void  UserNameField(){
        WebElement username=driver.findElement(UserNamefield);
        username.sendKeys("******");
    }

    //Method to enter password
    public void  PasswordField(){
        WebElement password=driver.findElement(Passwordfield);
        password.sendKeys("*******");
    }

    //Method to click login button
    public void LoginButton(){
        WebElement loginButton=driver.findElement(LoginButton);
        loginButton.click();
    }
}
