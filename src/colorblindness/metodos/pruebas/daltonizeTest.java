
//Autor: Condori Huarca Andres
package colorblindness.metodos.pruebas;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import colorblindness.colorblindness;
import processing.core.PApplet;

public class daltonizeTest {
	
	@Test
	public void prueba1() {
		int tipo = 2;
		String rutaOrigen = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String rutaDestino = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana2.jpg";
		boolean value = true;
		colorblindness.daltonize(tipo,rutaOrigen, rutaDestino, value);

	}
	
	@Test
	public void prueba2() {
		int tipo = 2;
		String rutaOrigen = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String rutaDestino = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana2.jpg";
		boolean value = false;
		colorblindness.daltonize(tipo,rutaOrigen, rutaDestino, value);
	}
	
	@Test
	public void prueba3() {
		int tipo = 2;
		String rutaOrigen = "C:\\ERROR\\imagesTest\\manzana.jpg";
		String rutaDestino = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana2.jpg";
		boolean value = true;
		colorblindness.daltonize(tipo,rutaOrigen, rutaDestino, value);
	}
	
	@Test
	public void prueba4() {
		int tipo = 2;
		String rutaOrigen = "";
		String rutaDestino = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana2.jpg";
		boolean value = false;
		colorblindness.daltonize(tipo,rutaOrigen, rutaDestino, value);
	}
	
	@Test
	public void prueba5() {
		int tipo = 0;
		String rutaOrigen = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String rutaDestino = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana2.jpg";
		boolean value = true;
		colorblindness.daltonize(tipo,rutaOrigen, rutaDestino, value);
	}
	
	@Test
	public void prueba6() {
		int tipo = 5;
		String rutaOrigen = "C:\\ERROR\\imagesTest\\manzana.jpg";
		String rutaDestino = "";
		boolean value = true;
		colorblindness.daltonize(tipo,rutaOrigen, rutaDestino, value);
	}
	
	@Test
	public void prueba7() {
		int tipo = -1;
		String rutaOrigen = "C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		String rutaDestino = "C:\\ERROR\\imagesTest\\manzana.jpg";
		boolean value = true;
		colorblindness.daltonize(tipo,rutaOrigen, rutaDestino, value);
	}

}
