package com.javacode.qspider_assignment.day1;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
class MaharajahPattern {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Ashutosh Mishra\\Desktop\\Java Learning\\src\\com\\javacode\\qspider_assignment\\day1\\image.jpg");
        try{
            BufferedImage image = ImageIO.read(file);
            for(int i = 0; i < image.getHeight(); i++)
            {
                for(int j = 0; j < image.getWidth(); j++)
                {
                    Color clr = new Color(image.getRGB(j, i));
                    if((clr.getRed() == 0) && (clr.getGreen() == 0) && (clr.getBlue() == 0)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        catch(Exception e){
            System.out.println("Exception Occurred");
        }
    }
}
