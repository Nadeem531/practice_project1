package project22_filehandling;

import java.io.File;
import java.io.IOException;

  public class FileHandling {

    public static void main(String[] args) {
    
      File file = new File("C:\\Users\\Nadeem\\git\\file_handling\\Filehanling\\src\\fhandling");
      try {
        boolean createFile = file.createNewFile();
        if (createFile) {
          System.out.println("New File is created.");
        }else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        e.printStackTrace();
      }

    }

  }