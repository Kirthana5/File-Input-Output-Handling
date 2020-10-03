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
public class binary_files_using_byte_stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        // FileInputStream & FileOutPutStream --(it can deal with BINARYFILES)--they comes under Byte Stream
        
        //can also process Audio(mp3) and Video(mp4) files
        FileInputStream fr=new FileInputStream("src img.jpg");
        FileOutputStream fw=new FileOutputStream("des img.jpg");
        int read;
        while((read=fr.read())!=-1)
        {
            fw.write(read);
        }
    }
    
}
