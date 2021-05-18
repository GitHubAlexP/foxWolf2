import java.io.File;

public class FileDeletingFolder {

    public static void main(String[] args) {

        // DELETING A FOLDER
        File myFile = new File("aFolder");

        if (myFile.delete())
            System.out.println("Deleted folder: " + myFile.getName());
        else    
            System.out.println("Failed to delete folder");

    }
}
