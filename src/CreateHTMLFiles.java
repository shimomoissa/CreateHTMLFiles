import java.io.FileWriter;
import java.io.IOException;

public class CreateHTMLFiles {

    public static void main(String[] args) {
    	
        if (args.length > 0 && isNumeric(args[0])) {
            int numberOfFiles = Integer.parseInt(args[0]);
            createHTMLFiles(numberOfFiles);
        } else {
            System.out.println("Please provide a valid number of files to create.");
        }
    }

    
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
    

    public static void createHTMLFiles(int numberOfFiles) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        for (int i = 1; i <= numberOfFiles; i++) {
            String filename = "file" + i + ".html";
            String filepath = desktopPath + "/" + filename;

            try (FileWriter fileWriter = new FileWriter(filepath)) {
                fileWriter.write("<!DOCTYPE html>\n<html>\n<head>\n<title>Empty HTML</title>\n</head>\n<body>\n</body>\n</html>");
                System.out.println("Created: " + filename);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



//  2023/6/3
