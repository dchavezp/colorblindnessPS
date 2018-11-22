package colorblindness.librerias.pruebas;

import static org.junit.Assert.*;

import org.junit.Test;
import java.awt.Color;
public class ColorTest {

	// Color-Caso de Prueba CP1 - Part-Equiv
		@Test
		public void testCP1() {
			Color color = new Color(30);
			int valActual=color.getRGB();
			int valEsperado=-16777186;
			assertEquals(valActual,valEsperado);
		}

		// Color-Caso de Prueba CP2 Part-Equiv
		@Test
		public void testCP2() {
			Color color = new Color(30,169,220);
			String valActual= color.getRed()+" "+color.getGreen()+" "+color.getBlue();
			String valEsperado= 30+" "+169+" "+220;
			assertEquals(valActual,valEsperado);
		}
		// Color-Caso de Prueba CP3 Part-Equiv
		@Test
		public void testCP3() {
			Color color = new Color(30,169,220);
			int valActual= color.getRed();
			int valEsperado= 30;
			assertEquals(valActual,valEsperado);
		}
		// Color-Caso de Prueba CP4 Part-Equiv
		@Test
		public void testCP4() {
			Color color = new Color(30,169,220);
			int valActual= color.getGreen();
			int valEsperado= 169;
			assertEquals(valActual,valEsperado);
		}
		// Color-Caso de Prueba CP5 Part-Equiv
		@Test
		public void testCP5() {
			Color color = new Color(30,169,220);
			int valActual= color.getBlue();
			int valEsperado= 220;
			assertEquals(valActual,valEsperado);
		}
		// Color-Caso de Prueba CP6 Part-Equiv
		@Test
		public void testCP6() {
			Color color = new Color(-5,-23,-45);
			String valActual= color.getRed()+" "+color.getGreen()+" "+color.getBlue();
			String valEsperado= -5+" "+-23+" "+-45;
			assertEquals(valActual,valEsperado);
		}
		// Color-Caso de Prueba CP7 Part-Equiv
		@Test
		public void testCP7() {
			Color color = new Color(256,350,630);
			String valActual= color.getRed()+" "+color.getGreen()+" "+color.getBlue();
			String valEsperado= 256+" "+350+" "+630;
			assertEquals(valActual,valEsperado);
		}
		//Valor Límite-Color(int,int,int)
		// Color-Caso de prueba Válido
		@Test
		public void testVLCP1() {
			Color color = new Color(255,255,255);
			int[] valActual = new int[3];
			valActual[0]=color.getBlue();
			valActual[1]=color.getRed();
			valActual[2]=color.getGreen();
			int[] valEsperado = new int[3];
			valEsperado[0]=255;
			valEsperado[1]=255;
			valEsperado[2]=255;
			String valAct=valActual[0]+" "+valActual[1]+" "+valActual[2];
			String valEsp=valEsperado[0]+" "+valEsperado[1]+" "+valEsperado[2];
			assertEquals(valAct, valEsp);
		}
		// Color-Caso de Prueba válido
		@Test
		public void testVLCP2() {
			Color color = new Color(0,0,0);
			int[] valActual = new int[3];
			valActual[0]=color.getBlue();
			valActual[1]=color.getRed();
			valActual[2]=color.getGreen();
			int[] valEsperado = new int[3];
			valEsperado[0]=0;
			valEsperado[1]=0;
			valEsperado[2]=0;
			String valAct=valActual[0]+" "+valActual[1]+" "+valActual[2];
			String valEsp=valEsperado[0]+" "+valEsperado[1]+" "+valEsperado[2];
			assertEquals(valAct, valEsp);
		}
		// Color-Caso de Prueba inválido
		@Test
		public void testVLCP3() {
			Color valActual = new Color(256,256,256);
			Color valEsperado = valActual;
			assertEquals(valActual.getRGB(), valEsperado.getRGB());
		}
		// Color-Caso de Prueba inválido
		@Test
		public void testVLCP4() {
			Color valActual = new Color(-1,-1,-1);
			Color valEsperado = valActual;
			assertEquals(valActual.getRGB(), valEsperado.getRGB());
		}
}