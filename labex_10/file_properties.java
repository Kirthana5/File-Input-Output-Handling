/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_10;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class file_properties {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //to get input (file name) from user using DataInputStream
        DataInputStream dr=new DataInputStream(System.in);
        System.out.println("Enter File name:");
        String filename=dr.readLine();
        
        //file class to process it
        File f=new File(filename);
        
        // to checking availability of file
        System.out.println("================================\nChecking Availability of file:");
        System.out.println("Does file exists??\n"+(f.exists()));
        
        //to checking readability,writablity and executability
        System.out.println("================================\nChecking Readability,Writablity and Executability:");
        System.out.println("Is the file readable??\n"+(f.canRead()));
        System.out.println("Is the file writable??\n"+(f.canWrite()));
        System.out.println("Is the file executable??\n"+(f.canExecute()));
        
        //to get the name of the file
        System.out.println("================================\nGetting the Name of the file:");
        System.out.println("File name is:\n"+(f.getName()));
        
        //to get the type of the file
        System.out.println("================================\nGetting the Type of the file:");
        if(f.getName().contains("."))
        {
            int i=f.getName().indexOf(".");
            System.out.println("Type of file is:\n"+(f.getName().substring((i+1))));
                    
        }
        else
            System.out.println("Unrecognized file type!!");
        
        //to find the length of the file in bytes
        System.out.println("================================\nLength of the file is:\n"+f.length()+" bytes");
        
    }
    
}
