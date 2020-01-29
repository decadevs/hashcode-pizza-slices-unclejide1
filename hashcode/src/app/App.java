package app;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.IOException;

public class App {
    public static void readingAndWritingWithNio() {
        Path path = Paths.get("hashcode\\src\\app\\input.txt");
        int maxOrder = 0;
        int typesOfPizza = 0;
        ArrayList<String> slicesInEachPizza = new ArrayList<>(); 
        int sum = 0;
        try {
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            System.out.println(lines);
        
            System.out.println();
            for (String line : lines) {
                String[] newLine = line.split(" ");
                if(newLine.length == 2){
                    maxOrder =Integer.parseInt(newLine[0]);
                    typesOfPizza =Integer.parseInt( newLine[1]);
                }else{
                    slicesInEachPizza.addAll(Arrays.asList(newLine));
                }
               System.out.println(Arrays.toString(newLine));
          
            }
          } catch (IOException e) {
            System.err.println("IOExcetion : " + e.getMessage());
          }
        System.out.println(maxOrder);
        System.out.println(typesOfPizza);
        System.out.println(slicesInEachPizza);
        

    }
    public static void main(String[] args) throws Exception {
       readingAndWritingWithNio();
    }
}