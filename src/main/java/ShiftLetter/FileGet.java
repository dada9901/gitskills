package ShiftLetter;

import java.io.*;
public class FileGet{
    StringBuffer s;
    public boolean check(String s) {
        boolean b = false;
 
        String tmp = s;
        tmp = tmp.replaceAll("\\p{P}", "");
        if (s.length() != tmp.length()) {
            b = true;
        }
 
        return b;
    }
    public FileGet(String fileName){
        s=new StringBuffer("");
        
        try {
            FileReader fr = new FileReader(fileName);
            int ch;
            while((ch=fr.read())!=-1)
            {
                s.append((char)ch);

            }
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println(e.toString());
        }
    }

    public String toString(){
        return s.toString();
    }
}