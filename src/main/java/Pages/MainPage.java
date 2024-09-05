package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.MainObjeacts.*;

public class MainPage {
    WebDriver driver=null;

    public MainPage(WebDriver driver){
        this.driver=driver;
    }
    public void openURL(){
        driver.get("https://github.com/");
    }

    public void NavigateToDoc(){
        WebElement Doc = driver.findElement(DocsLink);
        Doc.sendKeys(Keys.END);
        Doc.click();
    }

    public void SignIN(){
        WebElement signIN = driver.findElement(signIn);;
        signIN.click();
    }

    public void ScrollToPosition(int x,int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0],arguments[1]);", x, y);
    }

    public void Search() throws InterruptedException {
        WebElement search = driver.findElement(Search);;
        search.click();
        WebElement searchinput = driver.findElement(SearchInput);;
        Thread.sleep(1000);
        searchinput.sendKeys("github desktop");
        searchinput.submit();
    }

    public void DownloadGithubMoblieLink() {
        WebElement downloadGithubMoblieLink = driver.findElement(DownloadGithubMoblieLink);;
        downloadGithubMoblieLink.click();
    }

    public void ProductButton() {
        WebElement productButton = driver.findElement(ProductButton);;
        productButton.click();
    }

    public void ActionsOption() {
        WebElement actionsOption = driver.findElement(ActionsOption);;
        actionsOption.click();
    }




}
