import java.io.File;

public class FileCreatingFolder {

    public static void main(String[] args) {

        // CREATE A FOLDER
        File myFile = new Folder("myFolder");

        if (myFile.createNewFile())
            System.out.println("File created: " + myFile.getName());
        else
            System.out.println("File already exists.");

    }
}
