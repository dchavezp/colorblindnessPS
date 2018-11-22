package colorblindness.metodos.pruebas;

import static org.junit.Assert.*;
import colorblindness.*;
import org.junit.Test;
import java.awt.image.BufferedImage;


public class ParticionE_CorrectImage {

	@Test
	public void testJPG() {
		BufferedImage img = colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg");
		colorblindness.correctImage("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg", img,"C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana1.jpg");
		assertNotEquals(img,null);
	}
	
	@Test
	public void testPNG() {
		BufferedImage img = colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg");
		colorblindness.correctImage("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg", img,"C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana1.png");
		assertNotEquals(img,null);
	}
	
	@Test
	public void testJPEG() {
		BufferedImage img = colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg");
		colorblindness.correctImage("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg", img,"C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana1.jpeg");
		assertNotEquals(img,null);
	}
	
	@Test
	public void testBufferedImgNull() {
		BufferedImage img = null;
		colorblindness.correctImage("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg", img,"C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana1.jpg");
		assertNotEquals(img,null);
	}
	
	@Test
	public void testBufferedNombre() {
		BufferedImage img = colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg");
		colorblindness.correctImage("“?\\\\\\*<>:|", img,"C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana1.jpg");
		assertNotEquals(img,null);
	}
	
	@Test
	public void testBufferedNombreNul0() {
		BufferedImage img = colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg");
		colorblindness.correctImage("", img,"C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana1.jpg");
		assertNotEquals(img,null);
	}
	
	@Test
	public void testBufferedRutaLetra() {
		BufferedImage img = colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg");
		colorblindness.correctImage("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg", img,"a");
		assertNotEquals(img,null);
	}
	
	@Test
	public void testBufferedNombreLetra() {
		BufferedImage img = colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg");
		colorblindness.correctImage("e",img,"C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana1.jpg");
		assertNotEquals(img,null);
	}
	
	@Test
	public void testBufferedNombreLetraPNG() {		
		BufferedImage img = colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg");
		colorblindness.correctImage("e",img,"C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana1.png");
		assertNotEquals(img,null);
	}
	
	@Test
	public void testBuffered() {
		BufferedImage img = colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg");
		colorblindness.correctImage("e",img,"");
		assertNotEquals(img,null);
	}
	
	@Test
	public void testBufferedLetras() {
		BufferedImage img = colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\src\\colorblindness\\metodos\\pruebas\\manzana.jpg");
		colorblindness.correctImage("e",img,"hlhlhlh");
		assertNotEquals(img,null);
	}	
}