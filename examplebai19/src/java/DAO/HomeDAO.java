/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.sun.net.httpserver.HttpServer;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author chellong
 */
public class HomeDAO {

    private static final int MaxMemorySize = 3 * 1024 * 1024;
    private static final int MaxRequestSize = 50 * 1024 * 1024;
    private static String pathFile = "/home/chellong/GIT/JavaWebTutorial/examplebai19/FileUpload";

    public static void uploadSingleFile(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //check loi thieu multimpart file

        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
            request.setAttribute("message", "not have enctype: multiform/data ");
        }

        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(MaxMemorySize);
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
        ServletFileUpload upload = new ServletFileUpload(factory);
// 
        upload.setSizeMax(MaxRequestSize);

        try {
            System.out.println(">>>>>>>>>>>");
            List<FileItem> list = upload.parseRequest(request);
            System.out.println(">>>>>>>");
            Iterator<FileItem> iterator = list.iterator();
            while (iterator.hasNext()) {
                FileItem item = iterator.next();
                
                
                if (!item.isFormField()) {
                    String fieldName = item.getFieldName();
                    String fileName = item.getName();
                    String path = pathFile+ File.separator + fileName;
                    File upLoad = new File(path);
                    request.setAttribute("message", "upload file success");
                    item.write(upLoad);
                } else {
                    request.setAttribute("message", "upload file fail");
                }
         
            }
        } catch (Exception e) {
            request.setAttribute("message", e.getMessage());
        }
        RequestDispatcher rd = request.getRequestDispatcher("View/result.jsp");
        rd.forward(request, response);
    }
}
