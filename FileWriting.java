
public class FileWriting {

    public static void main(String[] args) {

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

    }
}
