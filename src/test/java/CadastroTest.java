import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;


public class CadastroTest {
        String home = "https://bugbank.netlify.app/#";
        String botaoAcessar = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]";
        String campoEmail = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input";
        String campoDigitaEmail = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input";
        String email = "teste@terra.com.br";
        String campoNome = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[3]/input";
        String nome = "Fulano de Tal de Oliveira Quatro";
        String campoSenha = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input";
        String senha = "123456";
        String campoConfirmacaoSenha = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[5]/div/input";
        String botaoContaComSaldo = "//*[@id=\"toggleAddBalance\"]";
        String botaoCadastar = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button";
        String botaoFechar = "btnCloseModal";

    //Este método testa o cadastro do bugBank
    @Test

    public void cadastroComSucesso(){
        System.setProperty("webdriver.chrome.driver","C://Users//deniz//Downloads//chromedriver_win32//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.get(home);
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath(botaoAcessar)).click();
        driver.findElement(By.xpath(campoEmail)).click();
        driver.findElement(By.xpath(campoDigitaEmail)).sendKeys(email);
        driver.findElement(By.xpath(campoNome)).click();
        driver.findElement(By.xpath(campoNome)).sendKeys(nome);
        driver.findElement(By.xpath(campoSenha)).click();
        driver.findElement(By.xpath(campoSenha)).sendKeys(senha);
        driver.findElement(By.xpath(campoConfirmacaoSenha)).click();
        driver.findElement(By.xpath(campoConfirmacaoSenha)).sendKeys(senha);
        driver.findElement(By.xpath(botaoContaComSaldo)).click();
        driver.findElement(By.xpath(botaoCadastar)).click();
        driver.findElement(By.id(botaoFechar)).click();

    }

    // Este método testa o campo obrigatório
    public void verificarCamposObrigatorios(){

    }

    //Eeste método valida o método de caracteris de senhas
    public void vallidarNumeroDeCaracteresNaSenha(){

    }

    //Este método valida que o cadastro não aconteca com os campos em branco
    public void naoCadastrarCampoEmBranco(){

    }

    //Este método testa o cadastro com o saldo
    public void cadastroContaComSaldo(){

    }
}
