package colorblindness.librerias.pruebas;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import colorblindness.colorblindness;

public class PruebasImagenIO {

	public static int metodoImageRead(String imageName){
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(imageName));
			return 1;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public static BufferedImage open(String imageName){
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(imageName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}

	public static int imageIoWrite(String ruta, String formato, String salida) {
		BufferedImage bImage = open(ruta);
		String newOut = salida + "." + formato;
		File outputFile = new File(newOut);
		try {
			ImageIO.write(bImage, formato, outputFile);
			return 1;
		} catch (IOException e) {
			System.out.println("Exception occured :" + e.getMessage());
		}
		return 0;
	}



}
