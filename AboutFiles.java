import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class AboutFiles {

    public static void main(String[] args) {

        // CREATE A FILE
        try {
            File myFile = new File("filename.md");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }

        // WRITE IN FILE
        try {
            FileWriter myWriter = new FileWriter("filename.md");
            myWriter.write("# Java API's");
            myWriter.write("\n\nFileReader");
            myWriter.write("\nBufferedReader");
            myWriter.write("\nFiles");
            myWriter.write("\nScanner");
            myWriter.write("\nFileInputStream");
            myWriter.write("\nFileWriter");
            myWriter.write("\nBufferedWriter");
            myWriter.write("\nFileOutputStream\n");
            myWriter.close(); // REMEMBER TO CLOSE
            System.out.println("Successfully wrote to the file.");
        } catch (Exception e) {
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }

        // READ A FILE
        try {
            File myFile = new File("filename.md");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("displaying: " + data);
            }
            myReader.close(); // REMEMBER TO CLOSE
        } catch (Exception e) {
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