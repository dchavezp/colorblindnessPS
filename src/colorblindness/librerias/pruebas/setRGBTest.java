package colorblindness.librerias.pruebas;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.image.BufferedImage;

import org.junit.Test;

import colorblindness.colorblindness;

public class setRGBTest {
	String imageName="C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg";

	@Test
	public void setRGB_CP01() {
		
		BufferedImage img = colorblindness.open(imageName);
		 img.setRGB(100,200,128);
	}
	
	@Test
	public void setRGB_CP02() {
		
		BufferedImage img = colorblindness.open(imageName);
		 img.setRGB(1,1,0);
	}
	
	@Test
	public void setRGB_CP03() {
		
		BufferedImage img = colorblindness.open(imageName);
		 img.setRGB(1,1,255);
	}
	
	@Test
	public void setRGB_CP04() {
		
		BufferedImage img = colorblindness.open(imageName);
		 img.setRGB(1,1,-1);
	}
	
	@Test
	public void setRGB_CP05() {
		
		BufferedImage img = colorblindness.open(imageName);
		 img.setRGB(1,1,256);
	}
	
	@Test
	public void setRGB_CP06() {
		
		BufferedImage img = colorblindness.open(imageName);
		 img.setRGB(0,1,128);
	}
	
	@Test
	public void setRGB_CP07() {
		
		BufferedImage img = colorblindness.open(imageName);
		 img.setRGB(1,0,128);
	}
	
	@Test
	public void setRGB_CP08() {
		
		BufferedImage img = colorblindness.open(imageName);
		 img.setRGB(0,0,128);
	}

}
