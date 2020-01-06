import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserApp {
    User user = new User();
    File file = new File("data.txt");

    public void add(){
        Scanner scanner = new Scanner(System.in);

    System.out.println("Name: ");
    user.setName(scanner.nextLine());
    System.out.println("Surename: ");
    user.setSurename(scanner.nextLine());
    System.out.println("ID: ");
    user.setiD(scanner.nextInt());

    try {
        FileWriter fileWriter = new FileWriter("data.txt", true);
        fileWriter.write(user.toString());
        fileWriter.close();



    } catch (IOException e) {
        e.printStackTrace();
    }

}
public void find() throws FileNotFoundException {
    Scanner scanner = new Scanner(file);
    String Content = scanner.nextLine();
    if (Content.equals(user)) {
        System.out.println(Content);

    }

}

    public static void printOption(){
        System.out.println("1. Add");
        System.out.println("2. Find");
        System.out.println("3. Exit");
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            UserApp userApp = new UserApp();
            int userOption;
            do {
                printOption();
                userOption = scanner.nextInt();
                scanner.nextLine();

                switch (userOption) {
                    case 1:userApp.add();
                        break;
                    case 2:userApp.find();
                        break;
                    case 3:
                        break;

                }
            } while (userOption != 3);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    }

