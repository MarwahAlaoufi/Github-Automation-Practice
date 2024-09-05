package GithubTest;

import Base.BaseClass;
import Pages.MainPage;
import Pages.LoginPage;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class MainPageTest extends BaseClass {

    @Test(testName ="TS-001")
    public void SignInMethod () throws InterruptedException{
        //create an object (instence) for Main page
        MainPage MainPage = new MainPage(driver);
        MainPage.openURL();
        MainPage.SignIN();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.UserNameField();
        loginPage.PasswordField();
        loginPage.LoginButton();
        Thread.sleep(5000);
    }

    @Test (testName = "TS-002")
//    @Epic("Docs flow")
//    @Feature("Docs Feature")
//    @Story("User shall view documentaions")
    @Owner("Marwah")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This is a method to verify that user is able to view and navigate to docs")
    public void NavigateToDocs () throws InterruptedException{
        //create an object (instence) for Main page
        MainPage githubPage = new MainPage(driver);
        githubPage.openURL();
        githubPage.NavigateToDoc();
        Thread.sleep(5000);
    }

    @Test (testName = "TS-003")
    public void Search () throws InterruptedException{
        //create an object (instence) for MainPage page
        MainPage githubPage = new MainPage(driver);
        githubPage.openURL();
        githubPage.Search();
        Thread.sleep(3000);
        githubPage.ScrollToPosition(0,600);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
    }

    @Test (testName = "TS-004")
    public void DownlodGithibMobile () throws InterruptedException{
        //create an object (instence) for MainPage page
        MainPage githubPage = new MainPage(driver);
        githubPage.openURL();
        githubPage.DownloadGithubMoblieLink();
        Thread.sleep(3000);
    }

    @Test (testName = "TS-005")
    public void ProductButton () throws InterruptedException{
        //create an object (instence) for MainPage page
        MainPage githubPage = new MainPage(driver);
        githubPage.openURL();
        githubPage.ProductButton();
        //Thread.sleep(3000);
        githubPage.ActionsOption();
        Thread.sleep(4000);
        githubPage.ScrollToPosition(0,600);
        Thread.sleep(3000);
    }


}
