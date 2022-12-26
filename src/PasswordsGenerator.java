import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

//Класс генерирует всевозможные комбинации паролей из допустимого множества символов.

public class PasswordsGenerator {

   private static String pop;
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
            String pub="C:/javadef/combinations-master/"+pop;
            try {
                FileOutputStream fos = new FileOutputStream(pub+"",true);
                Scanner s=new Scanner(cur);
                String sdf=s.next();
                String gdhf=sdf+"\n";
                fos.write(gdhf.getBytes());
                fos.close();
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

    public PasswordsGenerator(String pop) {
        this.pop = pop;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }
}
