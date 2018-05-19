/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.sun.net.httpserver.HttpServer;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author chellong
 */
public class HomeDAO {
      public static void uploadSingleFile(HttpServletRequest request) {
          //check loi thieu multimpart file
          boolean isMultipart = ServletFileUpload.isMultipartContent(request);
          
      }
}
