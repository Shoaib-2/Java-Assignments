package csc8011;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


//MuseumIO class
public class MuseumIO {

    //Path Of the CSV file.
    public static String path = "C:\\Users\\shoai\\Documents\\CSC-8011 CourseWork\\src\\csc8011\\Exhibit.csv";


    //Main method with menu options.
    public static void main(String[] args) {
        String ans = "1";
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------Main Menu-----------------");
        System.out.println("Enter the name of the Museum: ");
        String museumName = sc.nextLine();
        Museum museum = new Museum();
        museum.setNameOfTheMuseum(museumName);
        FillMuseumData(museum);
        do {
            System.out.println("-------------Museum Options-------------");
            System.out.println("1. Read in the information on the exhibits");
            System.out.println("2. Print the summary of the museum");
            System.out.println("3. Print statistics on the exhibits");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    ReadCSVFile();
                    break;
                case "2":
                    System.out.println(museum.toString());
                    break;
                case "3":
                    System.out.println(museum.getStatisticsOnTheExhibits());
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println("Press 1 to Continue!");
            System.out.println("Press any other Key To Exit!");
            ans = sc.nextLine();
        }
        while (ans.equals("1"));

    }

    //Reads the CSV file data and Prints To Console.
    public static void ReadCSVFile() {
        try {
            File exhibits
                    = new File(path);
            Scanner myReader = new Scanner(exhibits);
            while (myReader.hasNext()) {
                System.out.println(myReader.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Fills the Museum Exhibit list, from exhibits, from the CSV file.
    public static void FillMuseumData(Museum museum){
        try{
            File file = new File(path);
            Scanner myReader = new Scanner(file);
            ArrayList<Exhibit> exhibits = new ArrayList<Exhibit>();
            while(myReader.hasNext()){
                String[] tmp = myReader.nextLine().split(",");
                Exhibit exhibit = new Exhibit(tmp[0],tmp[1],Integer.parseInt(tmp[2]), Double.parseDouble(tmp[3]));
                exhibits.add(exhibit);
            }
            museum.setExhibits(exhibits);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

}












