package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.RepositoriesObjects.*;

public class RepositoriesPage {
    WebDriver driver=null;

    public RepositoriesPage(WebDriver driver){
        this.driver=driver;
    }
    public void addRepoButton(){
        WebElement AddRepo=driver.findElement(NewRepoButton);
        AddRepo.click();
    }

    public void RepoNameField(){
        WebElement EnterRepoNamefield =driver.findElement(RepoNamefield);
        EnterRepoNamefield.sendKeys("Github- test232342");
        //EnterRepoNamefield.sendKeys(Keys.END);
    }

    public void CreateRepoBut(){
        WebElement CreateRepobutton=driver.findElement(CreateRepoButton);
        CreateRepobutton.click();

    }

}
