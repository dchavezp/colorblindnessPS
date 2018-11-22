package colorblindness.metodos.pruebas;

import static org.junit.Assert.*;

import org.junit.Test;
import colorblindness.*;

public class ParticionE_rgbToLab {

	labHelper labhelper = new labHelper();
	 double[] la = new double[3];
	
	@Test
	public void testArgumentosValidos1() {
		//CP1
		la = labhelper.rgbToLab(21,45 ,211);
		System.out.println(la[0]); // 31.20601424768627		
		System.out.println(la[1]); // 54.177543110270314
		System.out.println(la[2]); //-84.5974234828719
		assertTrue(la[0]>0);
	}
	
	@Test
	public void testArgumentosInvalidos1() {
		//CP2
		la = labhelper.rgbToLab(21,-100, 211);
		assertTrue(la[0]>0);
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
	}
	
	@Test
	public void testArgumentosInvalidos2() {
		//CP3
		la = labhelper.rgbToLab(-34, 344, -21);
		assertTrue(la[0]>0);
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
	}
	
	@Test
	public void testArgumentosInvalidos3() {
		//CP4
		la = labhelper.rgbToLab(-34, -100, 301);
		assertTrue(la[0]>0);
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
	}
	
	@Test
	public void testArgumentosInvalidos4() {
		//CP5
		la = labhelper.rgbToLab(-34, 45, 211);
		assertTrue(la[0]>0);
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
	}
	
	@Test
	public void testArgumentosInvalidos5() {
		//CP6
		la = labhelper.rgbToLab(567, -100, 211);
		assertTrue(la[0]>0);
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
	}
	
	@Test
	public void testArgumentosInvalidos6() {
		//CP7
		la = labhelper.rgbToLab(567, -100, -21);
		assertTrue(la[0]>0);
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
	}
	
	@Test
	public void testArgumentosInvalidos7() {
		//CP8
		la = labhelper.rgbToLab(567, 45, 211);
		assertTrue(la[0]>0);
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
	}
	
	@Test
	public void testArgumentosInvalidos8() {
		//CP9
		la = labhelper.rgbToLab(567, 344, 211);
		assertTrue(la[0]>0);
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
	}
	
	@Test
	public void testArgumentosInvalidos9() {
		//CP10
		la = labhelper.rgbToLab(-34, 45, -21);
		assertTrue(la[0]>0);
		System.out.println(la[0]);
		System.out.println(la[1]);
		System.out.println(la[2]);
	}

}
