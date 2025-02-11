package WriteFiles;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // How to write a file using java (4 popular Options)

        //FileWriter = Good for small or medium-size text file.
        //BufferedWriter = Better performance for large amount of text.
        //PrintWriter = Best for structure data, like reports or logs.
        //fileOutputStream = Best for binary files (e.g.,images,audio files).

        //How to read a file using Java (# popular options)

        //BufferedReader + FileReader = Best for reading text files line-by-line;
        //FileInputStream = Best for binary files (e.g.,images,audio files)
        //RandomAccessFile = Best for read/write specific portions of a large file.

        String filePath = "C:\\Users\\USER02\\IdeaProjects\\Object-Oriented-programming\\src\\WriteFiles\\test3.txt";



        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("That file exist");


        }catch(FileNotFoundException e){
            System.out.println("Could not locate file");

        }catch (IOException e){
            System.out.println("Something went wrong");
        }


        /*
        String filePath ="C:\\Users\\USER02\\IdeaProjects\\Object-Oriented-programming\\src\\WriteFiles\\test3.txt";
        String textContent = """
                Roses are Red
                Violets are Blue
                BOOTY BOOTY BOOTY
                ROCKIN' EVERYWHERE!
                """;

        try(FileWriter writer = new FileWriter(filePath);) {
            writer.write(textContent);
            System.out.println("File has been written");

        }catch (FileNotFoundException e){
            System.out.println("Could not locate fle location");

        }catch (IOException e){
            System.out.println("Could not write file");
        }

         */

    }
}
