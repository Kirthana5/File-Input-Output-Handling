/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class copy_contents_of_file {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
         //source file where initally contents are going to be written 
         FileOutputStream fs=new FileOutputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Lab programs\\src\\labex_10\\file");
         
         //contents to be written in source file
         String s= "Java is a Object Oriented Programming Language.\nIt is more secure.\nIt works on Bottom up approach.";
         
         //to write in file we've to convert into bytes
         byte b[]=s.getBytes();
         
         //writing into source file
         fs.write(b);
         
         //closing FileOutputStream
         fs.close();
         
         //reading the source file whose contents are to be copied
         FileInputStream fr=new FileInputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Lab programs\\src\\labex_10\\file");
         
         //file where the contents of source file are to be copied
         FileOutputStream fw=new FileOutputStream("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Lab programs\\src\\labex_10\\file1");
         
         //writing into destination file (by removing unnecessary spaces in source file)
         int read;
         while((read=fr.read())!=-1)
         {
             //condition to remove unnecessary spaces
             if((char)read!=' ')
                 fw.write(read);
           
             
         }
         
         //closing FileInputStream
         fr.close();
         
         //closing FileOutputStream
         fw.close();
         
    }
    
}
