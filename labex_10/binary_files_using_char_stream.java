/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class binary_files_using_char_stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        //FileReader,FileWriter--->can NOT read BINARY FILES(img,audio,video)-->Bcoz they comes under Character Stream
        
        FileReader fr=new FileReader("src img.jpg");
        FileWriter fw=new FileWriter("des img1.jpg");
        int read;
        while((read=fr.read())!=-1)
        {
            fw.write(read);
        }
        
        
       
    }
    
}
