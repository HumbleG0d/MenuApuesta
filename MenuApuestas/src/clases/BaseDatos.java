
package clases;

import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.*;
import java.io.*;

public class BaseDatos {
    public static void createFile(String nameFile , String nameDir){
        Path filePath = Paths.get(nameDir , nameFile);
        try{
            if(Files.notExists(filePath)){Files.createFile(filePath);}
        }catch(IOException e){
            System.out.println(e.toString() + "\n");
            e.printStackTrace();
        }
    }
    
    public static void writeFile(String nameFile , String nameDir , ArrayList<RegisterUser> r) throws IOException{
        Path filePath = Paths.get(nameDir , nameFile);
        if(Files.exists(filePath)){
            File file = filePath.toFile();
            try(PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
                for(RegisterUser reg : r){
                    write.println(reg.getUser() + "\t" + reg.getPassword() + "\t" + reg.getPasswordC());
                }
            }catch(IOException e){
            System.out.println(e);
        }
        }
    }
    
    public String[] readFile(String nameFile , String nameDir){
        Path filePath = Paths.get(nameDir , nameFile);
        String [] pas = null;
        if(Files.exists(filePath)){
            File file = filePath.toFile();
            try(BufferedReader read = new BufferedReader(new FileReader(file))){
                pas = read.readLine().split("\t");
        }catch(IOException e){
            System.out.println(e);
        }
    }
    return pas;
}
    
}
