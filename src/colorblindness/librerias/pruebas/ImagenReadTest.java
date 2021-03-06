package colorblindness.librerias.pruebas;

import static org.junit.Assert.*;

import java.awt.image.BufferedImage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImagenReadTest {

	private PruebasImagenIO p1;
	
	@Before
	public void setUp() throws Exception {
		BufferedImage img = null;
		p1 = new PruebasImagenIO();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(" :: Fin :: ");
		p1 = null;
		assertNull(p1);
	}

	@Test
	public void pruebaReadPNG() {
		String rutaImg = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.png";
		assertTrue( p1.metodoImageRead(rutaImg) == 1 );
	}
	
	@Test
	public void pruebaReadJPG() {
		String rutaImg = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		assertTrue( p1.metodoImageRead(rutaImg) == 1 );
	}
	
	@Test
	public void pruebaReadJPEG() {
		String rutaImg = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpeg";
		assertTrue( p1.metodoImageRead(rutaImg) == 1 );
	}
	
	@Test
	public void pruebaReadNulo() {
		String rutaImg = " ";
		assertTrue( p1.metodoImageRead(rutaImg) == 1 );
	}
	
	@Test
	public void pruebaReadFail() {
		String rutaImg = "ruta/errenea";
		assertTrue( p1.metodoImageRead(rutaImg) == 1 );
	}

}
