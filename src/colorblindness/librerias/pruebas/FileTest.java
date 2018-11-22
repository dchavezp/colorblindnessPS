package colorblindness.librerias.pruebas;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileTest {

	//PRUEBAS DE EQUIVALENCIA

	@Test
	//PARA CUANDO LA RUTA ES CORRECTA
	public void File_CP_1() {
		String  resultadoEsperado="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		File file=new File("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg");
		String valorActual= file.getPath();
		System.out.println("dsad"+valorActual);
		assertEquals(resultadoEsperado, valorActual);
	}
	//PARA CUANDO LA RUTA ES ERRONEA
	@Test
	public void File_CP_2() {
		String  resultadoEsperado="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		File file=new File("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\imagenes\\manzana.jpg");
		String valorActual= file.getPath();
		System.out.println(valorActual);
		assertEquals(resultadoEsperado, valorActual);
	}
	//PARA CUANDO LA RUTA ES UN NUMERO
	@Test
	public void File_CP_3() {
		String  resultadoEsperado="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		File file=new File("123213");
		String valorActual= file.getPath();
		System.out.println(valorActual);
		assertEquals(resultadoEsperado, valorActual);
	}
	//PARA CUANDO LA RUTA ESTA VACIA
	@Test
	public void File_CP_4() {
		String  resultadoEsperado="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";
		File file=new File("");
		String valorActual= file.getPath();
		System.out.println(valorActual);
		assertEquals(resultadoEsperado, valorActual);
	}

}
