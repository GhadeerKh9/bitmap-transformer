package bitmap.transformer;

import java.io.File;
//import java.awt.image.BufferedImage;

public class Bitmap {

    public static void main(String[] args) {
        System.out.println("hello");
    }

    private String inputFilePath;
    private String outputFilePath;
    private String transformName;
    private String BufferedImage img= null;

//    public Bitmap(String inputFilePath, String outputFilePath, String transformName) {
//        this.inputFilePath = inputFilePath;
//        this.outputFilePath = outputFilePath;
//        this.transformName = transformName;
//    }

    public boolean toRead() {
        File file = new File(this.inputFilePath);
        this.img = 
        return true;
    }
}
