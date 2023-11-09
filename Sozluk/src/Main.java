import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        HashMap<String,String> dictionary = new HashMap<String,String>();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Java Projects\\Sozluk\\src\\english.turkhis.csv"));

        String line;

        while ((line = reader.readLine())!=null){
            String[] word = line.split(",");
            if (word.length>=2){
                dictionary.put(word[0].toLowerCase(),word[1]);
                dictionary.put(word[1].toLowerCase(),word[0]);
            }else{
                System.out.println("Hatalı Satır..." + line);
            }
        }

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Bir Kelime Giriniz: ");
            System.out.println("Çıkış Yapmak İçin Q'a Tuşuna Basınız ");
            String word = scanner.nextLine();

            if (word.equals("q")){
                System.out.println("Çıkış Yapılıyor...");
                break;
            }
            else if(dictionary.containsKey(word.toLowerCase())) {
                String mean = dictionary.get(word.toLowerCase());

                if (word.equals(mean)) {
                    System.out.println("Anlamı = " + mean);
                }else {
                    System.out.println("Anlamı = " + mean);
                }
            }
            else {
                System.out.println("Bu Kelime Sözlükte Bulunamadı.");
            }
        }
        scanner.close();
    }
}

