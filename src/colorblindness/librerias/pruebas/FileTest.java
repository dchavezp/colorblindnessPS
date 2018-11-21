package colorblindness.librerias.pruebas;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileTest {

	//PRUEBAS DE EQUIVALENCIA
	
	@Test
	//PARA CUANDO LA RUTA ES CORRECTA
	public void File_CP_1() {
		String  resultadoEsperado="Q:\\UNSA\\PSoft\\manzana.jpg";
		File file=new File("Q:\\UNSA\\PSoft\\manzana.jpg");
		String valorActual= file.getPath();
		System.out.println("dsad"+valorActual);
		assertEquals(resultadoEsperado, valorActual);
	}

}
