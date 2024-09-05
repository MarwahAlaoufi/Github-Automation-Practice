package GithubTest;

import Base.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RepositoriesPage;
import io.qameta.allure.*;
import org.testng.annotations.*;

//execution done here
public class GithubTest extends BaseClass {

    @Test (testName ="TS-001")
    public void LoginPageMethod () throws InterruptedException{
        //create an object (instence) for login page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openURL();
        loginPage.UserNameField();
        loginPage.PasswordField();
        loginPage.LoginButton();
        //Thread.sleep(5000);
    }

    @Test (testName ="TS-002")
    public void HomePageMethod () throws InterruptedException{
        LoginPageMethod();
        HomePage homepage = new HomePage(driver);
        homepage.UserNavButton();
        homepage.RepositoriesBut();
        //Thread.sleep(5000);
    }

    @Test (testName ="TS-003")
    public void RepositoriesPageMethod () throws InterruptedException{
        HomePageMethod();
        RepositoriesPage RepoPage = new RepositoriesPage(driver);
        RepoPage.addRepoButton();
        RepoPage.RepoNameField();
        Thread.sleep(3000);
        RepoPage.CreateRepoBut();
        Thread.sleep(3000);
    }

/*
    @Test (testName ="TS-003")
    public void ProfilePageMethod () throws InterruptedException{
        LoginPageMethod();
        HomePage homepage = new HomePage(driver);
        homepage.UserNavButton();
        homepage.ProfileBut();
        homepage.RepositoriesBut();
        Thread.sleep(5000);
    }
*/
}
