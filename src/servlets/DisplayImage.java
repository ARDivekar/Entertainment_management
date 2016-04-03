package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayImage extends HttpServlet {
    public final String imagesBase = "F:\\Workspaces\\Java\\Projects\\Entertainment_mgmt\\src\\images/";
    
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String URLAfterWebDomain = request.getRequestURI();
        
        //Only accept mappings as src="/images/whatever.jpg"
        if(URLAfterWebDomain.startsWith("/images/") == false)   
            return;
        
        //get the image name, or even directory, e.g. /images/music/beethoven.jpg
        String relativeImagePath = URLAfterWebDomain.substring("/images/".length());
        System.out.println("\nrelativeImagePath="+relativeImagePath);
        
        System.out.println("\nFetching image from "+imagesBase+relativeImagePath);
        response.setContentType("image/jpeg"); //as far as I know, this works for PNG as well. You might want to change the mapping to /images/*.jpg if it's giving problems
        ServletOutputStream outStream;
        outStream = response.getOutputStream();
        FileInputStream fin = new FileInputStream(imagesBase+relativeImagePath);

        BufferedInputStream bin = new BufferedInputStream(fin);
        BufferedOutputStream bout = new BufferedOutputStream(outStream);
        int ch =0; ;
        while((ch=bin.read())!=-1)
            bout.write(ch);

        bin.close();
        fin.close();
        bout.close();
        outStream.close();
	}
}