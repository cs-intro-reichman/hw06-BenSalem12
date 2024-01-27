import java.awt.Color;

/**
 * this action transforms the colored image into a black and white image
 */
public class Editor4 {

	public static void main (String[] args) {
		String fileName = args[0];
		int n = Integer.parseInt(args[1]);

		Color[][] imageIn = Runigram.read(fileName);

        int numRows = imageIn.length;
		int numCols = imageIn[0].length;

		Color[][] imageGray = new Color[numRows][numCols];

		Runigram.setCanvas(imageIn);
        imageGray = Runigram.grayScaled(imageIn);
        Runigram.morph(imageIn, imageGray, n);
	}
}