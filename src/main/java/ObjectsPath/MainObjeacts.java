package ObjectsPath;

import org.openqa.selenium.By;

public class MainObjeacts {
    public static final By DocsLink = By.xpath("//a[text()='Docs']");

    public static final By signIn  = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div/div/div/a");

    public static final By Search = By.xpath("//span[@class='flex-1']");
    public static final By SearchInput = By.xpath("//input[@id='query-builder-test']");

    public static final By DownloadGithubMoblieLink = By.xpath("//a[contains(text(),'Download GitHub Mobile')]");
    public static final By ProductButton= By.xpath("//button[contains(text(),'Product')]");
    public static final By ActionsOption = By.xpath("//div[text()='Actions']");



}
