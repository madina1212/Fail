import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        myMetods();
        myMetodss();
    }
    private static void myMetodss() {
        try (FileReader fileReader = new FileReader("Ырчы.Kg.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println( scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("No suhc fail");
        }
    }
    private static void myMetods() {
        try (FileWriter fileWriter = new FileWriter("Ырчы.Kg.txt")) {
            fileWriter.write("""
                    text::::
                    \n I can buy myself flowers
                       Write my name in the sand
                       Talk to myself for hours
                       Say things you don't understand
                       I can take myself dancing
                       And I can hold my own hand
                       Yeah, I can love me better than you can
                    """);
            Song song = new Song(" Miley Cyrus","Flowers", fileWriter);
            System.out.println("author: "+song.getAuthor()+"\n"+"title"+ song.getTitle());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

