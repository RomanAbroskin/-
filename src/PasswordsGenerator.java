import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

//Класс генерирует всевозможные комбинации паролей из допустимого множества символов.
public class PasswordsGenerator {
    private List<String> alphabet;       //Допустимое множество символов

    public PasswordsGenerator(List<String> alphabet) {
        this.alphabet = alphabet;
    }

    //backtracking - рекурсивный перебор
    private void generateHelper(int length, String cur) throws IOException {
        ArrayList<String> cv=new ArrayList<>();

        if(cur.length() == length) {
            cv.add(cur);
            System.out.println(cur);
            try {
                FileOutputStream fos = new FileOutputStream("C:/javadef/combinations-master/readme.txt");
                Scanner s=new Scanner(cur);
                String sdf=s.next();
                fos.write(sdf.toString().getBytes());
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
            return;
        }



        for(String c : alphabet) {
            generateHelper(length, cur + c);
        }
    }

    public void generate(int length) throws IOException {
        generateHelper(length, "");
    }


}
