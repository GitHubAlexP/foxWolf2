import java.io.File;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {

        // READ A FILE
        try 
        {    
            File myFile = new File("filename.md");
            Scanner myReader = new Scanner(myFile);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("displaying: " + data);
            }

            myReader.close(); // REMEMBER TO CLOSE
        }
        catch (Exception e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // MORE FILE INFO
        try {

            File myFile = new File("filename.md");

            if (myFile.exists()) {
                System.out.println("");
                System.out.println("File name: " + myFile.getName());
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
                System.out.println("Writeable: " + myFile.canWrite());
                System.out.println("Readable " + myFile.canRead());
                System.out.println("File size in bytes " + myFile.length());
            }

        } catch (Exception e) {
            System.out.println("The file does not exists");
            e.printStackTrace();
        }

    }
}
