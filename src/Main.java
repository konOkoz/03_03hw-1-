import java.io.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(result("file.txt"));

    }
/*
Написать метод, читающий текстовый файл и возвращающий строку, состояшую из всех прочитанных строчек.
Пример: В файле имеется
aaa
bbbb
cc
Метод вернет aaa bbbb cc
 */
    public static String result (String file){
        String text= "";
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String res = "";
            while((res=br.readLine())!=null){
                text+=res+" ";
            }

            }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return text;
    }
}