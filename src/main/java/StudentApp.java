import java.util.Scanner;
import java.io.*;

public class StudentApp {
    public static void main(String[] args) {
        System.out.println("Enter Student name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Student shapestud = new Student();
        shapestud.setName(name);
        System.out.println("You Entered the name: " + shapestud.getName());

        System.out.println("Enter Student ID: ");
        Scanner input2 = new Scanner(System.in);
        int id = input2.nextInt();
        Student shapeid = new Student();
        shapeid.setId(id);
        System.out.println("You Entered the ID: " + shapeid.getId());

        System.out.println("Enter Student Age: ");
        Scanner input3 = new Scanner(System.in);
        int age = input3.nextInt();
        Student shapeage = new Student();
        shapeage.setAge(age);
        System.out.println("You Entered the Age: " + shapeage.getAge());

        System.out.println("Enter Student Address: ");
        Scanner input4 = new Scanner(System.in);
        String add = input4.nextLine();
        Student shapeadd = new Student();
        shapeadd.setAdd(add);
        System.out.println("You Entered the Address: " + shapeadd.getAdd());

        File myFile = new File("Info.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());
        try{
            Scanner myfile = new Scanner(System.in);
            System.out.println("Enter the filename");
            String str = myfile.nextLine();
            Scanner inputFile = new Scanner(new File("info.txt"));
            FileWriter myWriter = new FileWriter(myFile,true);
            PrintWriter outputFile = new PrintWriter("info.txt");
            myWriter.write("\nYou Entered the name: " + shapestud.getName());
            myWriter.write("\nYou Entered the ID: " + shapeid.getId());
            myWriter.write("\nYou Entered the Age: " + shapeage.getAge());
            myWriter.write("\nYou Entered the Address: " + shapeadd.getAdd());
            myWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("!!You info has been saved!!");
    }
}
