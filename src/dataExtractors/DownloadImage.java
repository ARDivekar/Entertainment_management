/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataExtractors;

import java.net.*;
import javax.imageio.*;
import java.io.*;

public abstract class DownloadImage {
    public static boolean download(String inputURL, String imagePath) { 
        //e.g. download("http://www.yahoo.com/image_to_read.jpg", "C:/yahoo_image.jpg")
        URL url = null;
        InputStream in = null;
        byte[] buf=null;
        ByteArrayOutputStream out=null;
        byte[] response=null;
        
        try{
            url = new URL(inputURL);
        }catch(MalformedURLException e){
            e.printStackTrace();
            System.out.println("ERROR in DownloadImage.download(): URL is invalid: '"+inputURL+"'");
            return false;
        }
        
        try{
            in = new BufferedInputStream(url.openStream());
        }
        catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR in DownloadImage.download(): cannot open input stream.");
            return false;
        }
            
        try{
            out = new ByteArrayOutputStream();
            buf = new byte[1024];
            int n = 0;
            while (-1!=(n=in.read(buf)))
                out.write(buf, 0, n);

        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR in DownloadImage.download(): cannot write InputStream to ByteArrayOutputStream.");
            return false;
        }
        
        try{
            out.close();
            in.close();
            response = out.toByteArray();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR in DownloadImage.download(): cannot close InputStream and OutputStream.");
            return false;
        }
        
        try{
            writeToFile(response, imagePath);
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("ERROR in DownloadImage.download(): cannot write image to file '"+imagePath+"'");
            return false;
        }
        return true;
    }
    
    private static void writeToFile(byte[] response, String imagePath) throws IOException{
         
        FileOutputStream fos = new FileOutputStream(imagePath);
        fos.write(response);
        fos.close();
    }
}
