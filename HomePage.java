package br.senai.sp.automacaoteste;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	private WebDriver driver;
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void TesteNavParaGoogle() throws InterruptedException {

		driver.get("https://online.sp.senai.br/");
		
		WebElement tHome      = driver.findElement(By.cssSelector("[title='Institucional']"));
		tHome.click();
		Thread.sleep(3000);
		
		
		WebElement tCursos  = driver.findElement(By.cssSelector("[title='Cursos'"));
		tCursos.click();
		
		
		WebElement tCursosGratuitos  = driver.findElement(By.cssSelector("[title='Cursos Gratuitos'"));
		tCursosGratuitos.click();
		Thread.sleep(3000);
		
		
		WebElement tCursos2  = driver.findElement(By.cssSelector("[title='Cursos'"));
		tCursos2.click();
		
		
		WebElement tCursosLivres  = driver.findElement(By.cssSelector("[title='Cursos Livres'"));
		tCursosLivres.click();
		Thread.sleep(3000);
		
		WebElement tCursos3  = driver.findElement(By.cssSelector("[title='Cursos'"));
		tCursos3.click();
		
		
		WebElement tCursosTecnicos  = driver.findElement(By.cssSelector("[title='Cursos Técnicos'"));
		tCursosTecnicos.click();
		Thread.sleep(3000);
		
		
		WebElement tCursos4  = driver.findElement(By.cssSelector("[title='Cursos'"));
		tCursos4.click();
		
		
		WebElement tCursosPos  = driver.findElement(By.cssSelector("[title='Pós Graduação'"));
		tCursosPos.click();
		Thread.sleep(3000);
		
		WebElement tEmpresas  = driver.findElement(By.cssSelector("[title='Atendimento às Empresas'"));
		tEmpresas.click();
		Thread.sleep(3000);	
		
		
		WebElement tVideos  = driver.findElement(By.cssSelector("[title='Galeria de Vídeos'"));
		tVideos.click();
		Thread.sleep(3000);
		
		
		WebElement tTransparencia  = driver.findElement(By.cssSelector("[title='TRANSPARÊNCIA'"));
		tTransparencia.click();
		Thread.sleep(3000);
		
		
		WebElement tBoleto  = driver.findElement(By.cssSelector("[title='2ª VIA DE BOLETO'"));
		tBoleto.click();
		Thread.sleep(3000);
		
		
		WebElement tFaleConosco  = driver.findElement(By.cssSelector("[title='Fale Conosco'"));
		tFaleConosco.click();
		Thread.sleep(3000);
		
		
	}
	
	@After
	public void fechaNavegador() {
		driver.quit();
	}
}
