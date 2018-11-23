package colorblindness.metodos.pruebas;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;

import colorblindness.matrixOperators;

public class matrixOperatorsTest {

	double M1[][] = {{6,7,5}, {3, 8, 4}, {1,0,2}, {9,5,2}};
	double M2[][] = {{6.8,7.8,5.5}, {1.1, 5.8, 3.4}, {8.9,0.8,2}, {3.9,8.5,5.2}};
	double M3[][] = {{},{}};
	double M4[][] = {{'a','b','c'}, {'d','e', 'f'}, {'g','h','i'}};
	double M5[][] = {{8,7,6}, {8, 8, 4}, {6,3,2}};
	double M6[][] = {{7.8,7.8,5.5}, {6.1, 5.8, 3.4}, {5.9,0.8,2}, {3.9,8.5,5.2}};
	double M7[][] = {{},{}};
	double M8[][] = {{'a','b','c'}, {'d','e', 'f'}, {'g','h','i'}};
	
	
	
	@Test
	//Cuchuyrume Fico
	public void Matriz_CP_1() {
		

		double resp[][] = { {134 ,113 ,74 }, {112 ,97 ,58},{20 ,13 ,10},{124 ,109 ,78} };

		assertTrue( compare( matrixOperators.multiplyMatrices(M1, M5), resp) );
	}
	
	@Test
	//Cuchuyrume Fico
	public void Matriz_CP_2() {
		

		double resp[][] = { {11, 26}, {26 , 62} };
		
		assertTrue( compare( matrixOperators.multiplyMatrices(M1,M6), resp) );
	}
	
	@Test
	//Cuchuyrume Fico
	public void Matriz_CP_3() {

		double resp[][] = { {11, 26}, {26 , 62} };
		
		assertTrue( compare( matrixOperators.multiplyMatrices(M1, M7), resp) );
	}
	
	
	@Test
	//Cuchuyrume Fico
	public void Matriz_CP_4() {
		

		double resp[][] = { {11, 26}, {26 , 62} };
		

		assertTrue( compare( matrixOperators.multiplyMatrices(M1, M8), null) );
	}
	
	@Test
	//Cuchuyrume Fico
	public void Matriz_CP_5() {


		double resp[][] = { 
				{149.8 ,126.5 ,83}, 
				{75.6 ,64.3 ,36.6} ,
				{89.6 ,74.7 ,60.6 },
				{130.4 ,110.9 ,67.8 }};
		

		assertTrue( compare( matrixOperators.multiplyMatrices(M2, M5), resp) );
	}
	
	@Test
	//Cuchuyrume Fico
	public void Matriz_CP_6() {
		

		double resp[][] = { {11, 26}, {26 , 62} };
	
		assertTrue( compare( matrixOperators.multiplyMatrices(M2, M6), resp) );
	}
	
	@Test
	//Cuchuyrume Fico
	public void Matriz_CP_7() {
		
		double resp[][] = { {11, 26}, {26 , 62} };
		
		assertTrue( compare( matrixOperators.multiplyMatrices(M3, M6), resp) );
	}
	
	@Test
	//Cuchuyrume Fico
	public void Matriz_CP_8() {
		

		double resp[][] = { {11, 26}, {26 , 62} };
		
		assertTrue( compare( matrixOperators.multiplyMatrices(M3, M8), resp) );
	}
	
	@Test
	//Cuchuyrume Fico
	public void Matriz_CP_9() {
		
		double resp[][] = { {11, 26}, {26 , 62} };
	
		assertTrue( compare( matrixOperators.multiplyMatrices(M4, M5), null) );
	}
	
	@Test
	//Cuchuyrume Fico
	public void Matriz_CP_10() {
		
		double resp[][] = { {11, 26}, {26 , 62} };
		
		assertTrue( compare( matrixOperators.multiplyMatrices(M4, M8), null) );
	}
	

	

	   private static boolean compare( double[][] left, double[][] right )
	   {
	      if( left.length != right.length ) {
	         return false;
	      }
	      for( int i = 0; i < left.length; ++i ) {
	         if( left[i].length != right[i].length ) {
	            return false;
	         }
	         for( int j = 0; j < left[i].length; ++j ) {
	            if( left[i][j] != right[i][j] ) {
	               return false;
	            }
	         }
	      }
	      return true;
	   }


}
