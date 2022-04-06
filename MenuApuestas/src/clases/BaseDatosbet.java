
package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class BaseDatosbet {
    public static void createFile(String nameFile , String nameDir){
        Path filePath = Paths.get(nameDir , nameFile);
        try{
            if(Files.notExists(filePath)){Files.createFile(filePath);}
        }catch(IOException e){
            System.out.println(e.toString() + "\n");
            e.printStackTrace();
        }
    }
    
    public static void addFile(String nameFile , String nameDir , ArrayList<RegisterAdd> r) throws IOException{
        Path filePath = Paths.get(nameDir , nameFile);
        if(Files.exists(filePath)){
            File file = filePath.toFile();
            try(PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(file , true)))){
                int n = r.size()-1;
                write.println(r.get(n).ID + "\t" + r.get(n).getName() + "\t" + r.get(n).getApellido() + "\t" + r.get(n).getNumero() + "\t" + r.get(n).getYape());
            }catch(IOException e){
            System.out.println(e);
        }
        }
    }
    
    
    public static void writeTable(String nameFile , String nameDir , DefaultTableModel c){
        Path filePath = Paths.get(nameDir , nameFile);
        String pas [];
        if(Files.exists(filePath)){
            File file = filePath.toFile();
            try(BufferedReader read = new BufferedReader(new FileReader(file))){
                String line = read.readLine();
                while(line!=null){
                pas = line.split("\t");
                c.addRow(pas);
                line = read.readLine();
                }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
       

public static void actFile(String nameFile , String nameDir , ArrayList<RegisterAdd> r , int numerO) throws IOException{
    //deleteFile(String name , String nameDir);
    
    Path filePath = Paths.get(nameDir , nameFile);
     File file = filePath.toFile();
            try(PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
                int n;
                for(int i = 0 ; i < r.size() ; i++){
                    if(r.get(i).numero == numerO){
                        n = i;
                        r.remove(n);
                        break;
                    }
                }
                for(RegisterAdd re : r){
                 write.println(re.ID + "\t" + re.getName() + "\t" + re.getApellido() + "\t" + re.getNumero() + "\t" + re.getYape());   
                }
            }catch(IOException e){
            System.out.println(e);
        }  
   }

    public static void FileWin(String nameFile , String nameDir , ArrayList<RegisterAdd> r) throws IOException{
        Path filePath = Paths.get(nameDir , nameFile);
        File file = filePath.toFile();
            try(PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
                for(RegisterAdd re : r){
                 write.println(re.ID + "\t" + re.getName() + "\t" + re.getApellido() + "\t" + re.getNumero() + "\t" + re.getYape());   
                }
            }catch(IOException e){
            System.out.println(e);
        }
    }

    public static void FileLose(String nameFile , String nameDir , ArrayList<RegisterAdd> r) throws IOException{
        Path filePath = Paths.get(nameDir , nameFile);
         File file = filePath.toFile();
            try(PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
                for(RegisterAdd re : r){
                 write.println(re.ID + "\t" + re.getName() + "\t" + re.getApellido() + "\t" + re.getNumero() + "\t" + re.getYape() + "\t" + re.getYape()*2);   
                }
            }catch(IOException e){
            System.out.println(e);
        }
    }



    public static void deleteFile(String nameFile , String nameDir){
        Path filePath = Paths.get(nameDir , nameFile);
        File file = filePath.toFile();
        file.delete();
    }
}
