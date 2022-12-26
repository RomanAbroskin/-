import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Program {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);


        System.out.println("Выбирите тип алфавита:\n1 - только латинские строчные буквы \n" +
                "2 - латинские буквы обоих регистров \n" +
                "3 - латинские буквы обоих регистров и цифры");
        int namber = s.nextInt();
        s.nextLine();
         if (namber == 1) {
            System.out.println("Введите имя файла");
           String file = s.nextLine();
             new PasswordsGenerator(""+file);
            String[] out = file.split( "[^a-z]");
            if (file.equals(out[0])) {
                System.out.println("Введите пароль");
                String Password = s.nextLine();
                String[] Pass = Password.split("[^a-z]");
                int b=Password.length();
                System.out.println(b);
                if (Password.equals(Pass[0])) {
                    String[]pa=Password.split("");
                    List<String> alphabet = Arrays.asList(pa);
                    PasswordsGenerator generator = new PasswordsGenerator(alphabet);
                    generator.generate(b);
                } else {
                    System.out.println("не правильный ввод");
                }
            } else {
                System.out.println("не правильный ввод");
            }
        } else if (namber == 2) {
            System.out.println("Введите имя файла");
            String file = s.nextLine();
             new PasswordsGenerator(""+file);
            String[] out = file.split("[^a-zA-Z]");
            if (file.equals(out[0])) {
                System.out.println("Введите пароль");
                String Password = s.nextLine();
                String[] Pass = Password.split("[^a-zA-Z]");
                int b=Password.length();
                if (Password.equals(Pass[0])) {
                    String[]pa=Password.split("");
                    List<String> alphabet = Arrays.asList(pa);
                    PasswordsGenerator generator = new PasswordsGenerator(alphabet);
                    generator.generate(b);
                } else {
                    System.out.println("не правильный ввод");
                }
            } else {
                System.out.println("не правильный ввод");
            }
        } else if (namber == 3) {
            System.out.println("Введите имя файла");
           String  file = s.nextLine();
             new PasswordsGenerator(""+file);
            String[] out = file.split("[^a-zA-Z0-9]");
            if (file.equals(out[0])) {
                System.out.println("Введите пароль");
                String Password = s.nextLine();
                String[] Pass = Password.split("[^a-zA-Z0-9]");
                int b=Password.length();
                if (Password.equals(Pass[0])) {
                    String[]pa=Password.split("");
                    List<String> alphabet = Arrays.asList(pa);
                    PasswordsGenerator generator = new PasswordsGenerator(alphabet);
                    generator.generate(b);
                } else {
                    System.out.println("не правильный ввод");
                }
            } else {
                System.out.println("не правильный ввод");
            }
        }else {System.out.println("не правильный ввод");
            }
    }
}