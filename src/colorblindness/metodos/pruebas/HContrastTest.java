package colorblindness.metodos.pruebas;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeNotNull;

import java.awt.image.BufferedImage;

import org.junit.Test;

import colorblindness.colorblindness;

public class HContrastTest {
	
	@Test
	public void cp1Test() {
		String pathImagen="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC.jpg";
		int factor=110;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assumeNotNull(imgSalida);
	}
	@Test
	public void cp2Test() {
		String pathImagen="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String pathSave="";
		int factor=110;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assertTrue(imgSalida==null);
	}
	@Test
	public void cp3Test() {
		String pathImagen="";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC.jpg";
		int factor=110;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assertTrue(imgSalida==null);
	}
	@Test
	public void cp4Test() {
		String pathImagen="$users#escritorio";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC.jpg";
		int factor=110;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assertTrue(imgSalida==null);
	}
	@Test
	public void cp5Test() {
		String pathImagen="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String pathSave="$users#escritorio";
		int factor=110;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assertTrue(imgSalida==null);
	}
	@Test
	public void cp6Test() {
		String pathImagen="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC1.jpg";
		int factor=456;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assertTrue(imgSalida==null);
	}
	@Test
	public void cp7Test() {
		String pathImagen="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC2.jpg";
		int factor=-6;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assertTrue(imgSalida==null);
	}

	//Casos de Prueba Valor limite
	@Test
	public void cp1VLTest() {
		String pathImagen="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC1.jpg";
		int factor=1;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assumeNotNull(imgSalida);
	}
	@Test
	public void cp2VLTest() {
		String pathImagen="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC1.jpg";
		int factor=128;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assumeNotNull(imgSalida);
	}
	@Test
	public void cp3VLTest() {
		String pathImagen="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC1.jpg";
		int factor=0;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assertTrue(imgSalida==null);
	}
	@Test
	public void cp4VLTest() {
		String pathImagen="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC1.jpg";
		int factor=129;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assertTrue(imgSalida==null);
	}
	@Test
	public void cp5VLTest() {
		String pathImagen="C:\\a.jpg";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC1.jpg";
		int factor=128;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assumeNotNull(imgSalida);
	}
	@Test
	public void cp6VLTest() {
		String pathImagen="C:\\a.jp";
		String pathSave="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzanaHC1.jpg";
		int factor=128;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assertTrue(imgSalida==null);
	}
	@Test
	public void cp7VLTest() {
		String pathImagen="C:\\a.jpg";
		String pathSave="C:\\a.jpg";
		int factor=128;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assumeNotNull(imgSalida);
	}
	@Test
	public void cp8VLTest() {
		String pathImagen="C:\\a.jpg";
		String pathSave="C:\\a.jp";
		int factor=128;
		colorblindness.hContrast(pathImagen, pathSave, factor);
		BufferedImage imgSalida=colorblindness.open(pathSave);
		assertTrue(imgSalida==null);
	}

}
