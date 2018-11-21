package colorblindness.librerias.pruebas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImagenWriteTest {
	
	private PruebasImagenIO p1;
	
	@Test
	public void pruebaWritePNG() {
		String rutaImg = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.png";
		String formato = "png";
		String out = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana2";
		assertTrue( p1.imageIoWrite(rutaImg, formato , out) == 1 );
	}
	
	@Test
	public void pruebaWriteJPG() {
		String rutaImg = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String formato = "jpg";
		String out = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana2";
		assertTrue( p1.imageIoWrite(rutaImg, formato , out) == 1 );
	}
	
	@Test
	public void pruebaWriteJPEG() {
		String rutaImg = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpeg";
		String formato = "jpeg";
		String out = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana2";
		assertTrue( p1.imageIoWrite(rutaImg, formato , out) == 1 );
	}
	
	@Test
	public void pruebaWriteNulo() {
		String rutaImg = " ";
		String formato = "jpeg";
		String out = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana2";
		assertTrue( p1.imageIoWrite(rutaImg, formato , out) == 1 );
	}
	
	@Test
	public void pruebaWriteRutaErronea() {
		String rutaImg = " Ruta/erronea/manzana.png";
		String formato = "png";
		String out = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana2";
		assertTrue( p1.imageIoWrite(rutaImg, formato , out) == 1 );
	}

}
