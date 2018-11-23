package colorblindness.metodos.pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import colorblindness.labHelper;
import colorblindness.matrixOperators;

public class labToRgbTest {


	@Test
	//Cuchuyrume Fico
	public void labToRgb_CP_1() {
		
		int l=50;
		int a=45;
		int b=11;
		int resp[] = {191 ,83,102};

		
		assertTrue(compare(labHelper.labToRgb(l, a, b),resp)) ;
	}
	
	@Test
	//Cuchuyrume Fico
	public void labToRgb_CP_2() {
		
		int l=50;
		int a=-150;
		int b=111;
		int resp[] = {191 ,83,102};

		
		assertTrue(compare(labHelper.labToRgb(l, a, b),resp)) ;
	}
	
	@Test
	public void labToRgb_CP_3() {
		
		int l=-50;
		int a=500;
		int b=-221;
		int resp[] = {191 ,83,102};

		
		assertTrue(compare(labHelper.labToRgb(l, a, b),resp)) ;
	}
	
	@Test
	public void labToRgb_CP_4() {
		
		int l=-50;
		int a=-150;
		int b=524;
		int resp[] = {191 ,83,102};

		
		assertTrue(compare(labHelper.labToRgb(l, a, b),resp)) ;
	}
	
	@Test
	public void labToRgb_CP_5() {
		
		int l=-50;
		int a=45;
		int b=111;
		int resp[] = {191 ,83,102};

		
		assertTrue(compare(labHelper.labToRgb(l, a, b),resp)) ;
	}
	
	@Test
	public void labToRgb_CP_6() {
		
		int l=250;
		int a=-150;
		int b=111;
		int resp[] = {191 ,83,102};

		
		assertTrue(compare(labHelper.labToRgb(l, a, b),resp)) ;
	}
	
	@Test
	public void labToRgb_CP_7() {
		
		int l=250;
		int a=-150;
		int b=-221;
		int resp[] = {191 ,83,102};

		
		assertTrue(compare(labHelper.labToRgb(l, a, b),resp)) ;
	}
	
	@Test
	public void labToRgb_CP_8() {
		
		int l=250;
		int a=45;
		int b=111;
		int resp[] = {191 ,83,111};

		
		assertTrue(compare(labHelper.labToRgb(l, a, b),resp)) ;
	}
	
	@Test
	public void labToRgb_CP_9() {
		
		int l=250;
		int a=500;
		int b=111;
		int resp[] = {191 ,83,102};

		
		assertTrue(compare(labHelper.labToRgb(l, a, b),resp)) ;
	}
	
	@Test
	public void labToRgb_CP_10() {
		
		int l=-50;
		int a=45;
		int b=-221;
		int resp[] = {234 ,83,102};

		
		assertTrue(compare(labHelper.labToRgb(l, a, b),resp)) ;
	}
	
	
	   private static boolean compare( int[] left, int[] right )
	   {

	      
	      if( !(left[0]>=0 && left[0]<=100) && !(left[1]>=-128 && left[1]<=128) 
	    		  && !(left[2]>=-128 && left[2]<=128) ) {
	    	  System.out.println("cccc");
		         return false;
		  }
	      
	      if( left.length != right.length ) {
		         return false;
		      }

	      for( int i = 0; i < left.length; ++i ) {
	            if( left[i] != right[i] ) {
		               return false;
		            }

	      }
	      return true;
	   }
	
}
