/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktailshop;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author barah
 */
  public class MyLogger implements Logger{
   private String filePath;

    public MyLogger(String filePath) {
        this.filePath = filePath;
    }
   
    @Override
   public void log(String msg) {
       try {
           FileWriter fw=new FileWriter(this.filePath,true);
          
           fw.write(msg + "\n");
           fw.close();
       } catch (IOException ex) {
           System.out.println(ex.getMessage());
       }
   }
    
}

