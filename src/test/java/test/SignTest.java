package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignTest {

    @Test
    public void testOpenWindow(){
        System.setProperty("webdriver.chrome.driver","/home/vinicius/Downloads/chromedriver");
        WebDriver navegador = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(navegador,10);

        //Fazer login
        navegador.get("http://homologacao.mobilis.com.br:8080/mobiweb/#/login");
        navegador.findElement(By.id("md-input-1")).sendKeys("04257709901");
        navegador.findElement(By.id("md-input-3")).sendKeys("123abc");
        navegador.findElement(By.className("sign-card")).findElement(By.className("mat-raised-button")).click();

        //Selecionar a CFC
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/md-sidenav-container/div[2]/div/login/login-view/div/md-card/md-card-content/div[2]/md-nav-list/md-list-item[1]/div/a")));
        navegador.findElement(By.xpath("/html/body/app-root/md-sidenav-container/div[2]/div/login/login-view/div/md-card/md-card-content/div[2]/md-nav-list/md-list-item[1]/div/a")).click();

        //Selecionar o Cadastro
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/md-sidenav-container/md-sidenav[1]/cdk-focus-trap/div/div/md-nav-list/div[3]/div/md-list-item[1]/div/div/a/span")));
        navegador.findElement(By.xpath("/html/body/app-root/md-sidenav-container/md-sidenav[1]/cdk-focus-trap/div/div/md-nav-list/div[3]/div/md-list-item[1]/div/div/a/span")).click();

        //Selecionar o aluno no cadastro
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/md-sidenav-container/md-sidenav[1]/cdk-focus-trap/div/div/md-nav-list/div[3]/div/md-list-item[2]/div/div/a/span")));
        navegador.findElement(By.xpath("/html/body/app-root/md-sidenav-container/md-sidenav[1]/cdk-focus-trap/div/div/md-nav-list/div[3]/div/md-list-item[2]/div/div/a/span")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Adicionar novo Aluno')]")));
        navegador.findElement(By.xpath("//button[contains(.,'Adicionar novo Aluno')]")).click();

        //Preenche os campos do cadastro
        navegador.findElement(By.xpath("//input[@placeholder='CPF']")).sendKeys("53806167044");
        navegador.findElement(By.xpath("//input[@placeholder='RENACH']")).sendKeys("163460527294");
        navegador.findElement(By.xpath("//input[@placeholder='Nome completo']")).sendKeys("Aluno aluno");

        navegador.findElement(By.xpath("//button[contains(.,'Salvar')]")).click();



    }
}
