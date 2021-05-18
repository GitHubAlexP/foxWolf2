import java.io.File;

public class FileDeleting {

    public static void main(String[] args) {

        // DELETE FILE
        File myFile = new File("filename.md");
        if (myFile.delete()) {
            System.out.println("File deleted: " + myFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

    }

}
