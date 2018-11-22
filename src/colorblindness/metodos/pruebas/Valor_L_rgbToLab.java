package colorblindness.metodos.pruebas;

import static org.junit.Assert.*;

import org.junit.Test;
import colorblindness.labHelper;
public class Valor_L_rgbToLab {

	labHelper labhelper = new labHelper();
	 double[] la = new double[3];
	
		
	@Test
	public void testArgumentosMaximos() {
		//Valor Limite valido
		la = labhelper.rgbToLab(255,255,255);
		System.out.println("Maximos");
		System.out.println(la[0]); //100
		System.out.println(la[1]); //0.00526049995830391
		System.out.println(la[2]); //-0.010408184525267927	
		System.out.println();
		assertTrue(la[0]== 100);
	}
	
	@Test
	public void testArgumentosMinimos() {
		//Valor Limite valido
		la = labhelper.rgbToLab(0,0,0);
		System.out.println("Minimos");
		System.out.println(la[0]); //0
		System.out.println(la[1]); //0
		System.out.println(la[2]); //0
		System.out.println();
		assertTrue(la[0] == 0.0);
	}
	
	
	@Test
	public void testArgumentosSuperiores() {
		//Valor Limite invalido
		la = labhelper.rgbToLab(256,256,256);
		System.out.println("Superiores");
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
		System.out.println();
		assertTrue(la[0] <= 100);
	}
	
	@Test
	public void testArgumentosInferior() {
		//Valor Limite invalido
		la = labhelper.rgbToLab(-1,-1,-1);
		System.out.println("Inferiores");
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
		System.out.println();
		assertTrue(la[0] >= 0.0);
	}
}
