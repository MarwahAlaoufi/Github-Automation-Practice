package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.HomeObjeacts.*;

public class HomePage {

    WebDriver driver=null;

    // create constructors that initialize the web driver element
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    //Method to click on user navg button
    public void UserNavButton(){
        WebElement UserNavgButton=driver.findElement(UserNavButton);
        UserNavgButton.click();
    }
    //Method to click on user repositories
    public void RepositoriesBut(){
        WebElement repositoriesButton=driver.findElement(RepositoriesButton);
        repositoriesButton.click();
    }

    public void ProfileBut(){
        WebElement profileButton=driver.findElement(ProfileButton);
        profileButton.click();
    }

}
