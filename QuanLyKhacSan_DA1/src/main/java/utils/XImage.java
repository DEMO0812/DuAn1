/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author DEMO
 */
public class XImage {
    public static Image getAppIcon(){
        URL url =XImage.class.getResource("/icon/logodemo.png");
        return new ImageIcon(url).getImage();
    }
    
    
    
    
    public static boolean save(File src){
        File dst = new File("src\\main\\resources\\icons", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();// tạo thư mục
        }
        
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to,StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
            return false;
        }
    }

    public static ImageIcon readImg(String fileName) {
        File path = new File("src\\main\\java\\icon", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
     public static ImageIcon sizeImg(ImageIcon img,int width,int height) {
        Image image=img.getImage();
        Image ii=image.getScaledInstance(width, height,Image.SCALE_SMOOTH);
        ImageIcon ii2=new ImageIcon(ii);
        return ii2;
    }
}





