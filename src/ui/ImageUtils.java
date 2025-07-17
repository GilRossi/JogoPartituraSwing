package ui;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageUtils {
	public static ImageIcon load(String path, int width, int height) {
		ImageIcon icon = new ImageIcon(ImageUtils.class.getResource(path));
		Image scaled = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return new ImageIcon(scaled);
	}

}
