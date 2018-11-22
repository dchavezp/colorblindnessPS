package colorblindness.metodos.pruebas;

import static org.junit.Assert.*;
import java.awt.image.BufferedImage;
import java.io.File;

import org.junit.Test;
import colorblindness.colorblindness;

public class saveImageTest {

	@Test
	public void open_CP_1() {
		File file1=new File("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg");
		File file2=new File("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg");
		String  imageName1 = file1.getPath();
		String  imageName2 = file2.getPath();
		colorblindness.saveImage(imageName1,colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg"));
		colorblindness.saveImage(imageName2,colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg"));
		assertEquals(imageName1, imageName2);
	}
	@Test
	public void open_CP_2() {

		File file1=new File("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg");
		File file2=new File("");
		String  imageName1 = file1.getPath();
		String  imageName2 = file2.getPath();
		colorblindness.saveImage(imageName1,colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg"));
		colorblindness.saveImage(imageName2,colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg"));
		assertEquals(imageName1, imageName2);

	}
	@Test
	public void open_CP_3() {

		File file1=new File("");
		File file2=new File("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg");
		String  imageName1 = file1.getPath();
		String  imageName2 = file2.getPath();
		colorblindness.saveImage(imageName1,colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg"));
		colorblindness.saveImage(imageName2,colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg"));
		assertEquals(imageName1, imageName2);

	}
	@Test
	public void open_CP_4() {

		File file1=new File("");
		File file2=new File("");
		String  imageName1 = file1.getPath();
		String  imageName2 = file2.getPath();
		colorblindness.saveImage(imageName1,colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg"));
		colorblindness.saveImage(imageName2,colorblindness.open("C:\\Users\\roy\\git\\colorblindnessPS\\imagesTest\\manzana.jpg"));
		assertEquals(imageName1, imageName2);

	}

}
