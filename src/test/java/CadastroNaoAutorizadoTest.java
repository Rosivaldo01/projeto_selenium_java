import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class CadastroNaoAutorizadoTest {
    String home = "https://bugbank.netlify.app/#";
    String acessar = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[1]";
    String email = "teste@terra.com.br";
    String campoEmail= "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input";
    String campoDigitacao = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input";
    String senha = "123456";
    String registrar = "//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[3]/button[2]";
    String campCdastroEmail = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input";
    String campoNome = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[3]/input";
    String nome = "Fulano de Tal de Oliveria ";
    String compoSenha = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input";
    String confirmacaoSenha = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[5]/div/input";
    String senhaNaoValida = "0123456";
    String botaoCadastra = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/button";
    String mensagemAtencao=  "//*[@id=\"modalText\"]";

// Este método testa o não preenchimento dos campos obrigatórios.
    @Test
    public void camposObrigatoriosNaoPreenchidos(){
     System.setProperty("webdriver.chrome.driver","C://Users//deniz//Downloads//chromedriver.exe");
     ChromeDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      driver.get(home);
      driver.manage().window().fullscreen();
      driver.findElement(By.xpath(acessar)).click();

    }

 // Este método testa o não Registro de senha difenrente no Cadastro do usuário.
@Test
    public void naoCadastroComSenhaDiferente(){
    System.setProperty("webdriver.chrome.driver","C://Users//deniz//Downloads//chromedriver_win32//chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    driver.get(home);
    driver.manage().window().fullscreen();
    driver.findElement(By.xpath(registrar)).click();
    driver.findElement(By.xpath(campCdastroEmail)).click();
    driver.findElement(By.xpath(campCdastroEmail)).sendKeys(email);
    driver.findElement(By.xpath(campoNome)).click();
    driver.findElement(By.xpath(campoNome)).sendKeys(nome);
    driver.findElement(By.xpath(compoSenha)).click();
    driver.findElement(By.xpath(compoSenha)).sendKeys(senha);
    driver.findElement(By.xpath(confirmacaoSenha)).click();
    driver.findElement(By.xpath(confirmacaoSenha)).sendKeys(senhaNaoValida);
    driver.findElement(By.xpath(botaoCadastra)).click();
    driver.findElement(By.xpath(mensagemAtencao)).sendKeys("As senhas não são iguais.");
    driver.findElement(By.id("btnCloseModal")).click();

    }


}
