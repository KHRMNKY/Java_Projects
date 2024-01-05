/*
Bir isimler.txt dosyasında satır satır isimler yazmaktadır. Adi ve soyadi arasında en
az 1 boşluk vardır, satır başında ve sonunda da boşluklar olabilir. Bu isimler.txt
dosyasını giriş olarak alan ve her satırdaki isimleri "SAYIN ADI1 SOYADI1" şekline
(aralarda sadece 1 boşluk var) getirip SN_ISIMLER.txt dosyasına kaydeden Java
programını yazınız.
*/

import java.io.* ;

public class DosyaOdev {
    public static void main(String[] args) throws IOException{
        File file=new File("isimler.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        else{
        }

        File file1=new File("SN_ISIMLER.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }

        else{
        }

        FileWriter fWriter1=new FileWriter(file1,false);
        BufferedWriter bWriter1=new BufferedWriter(fWriter1);
        
        String line;
        FileReader fReader=new FileReader(file);
        BufferedReader bReader=new BufferedReader(fReader);

        while((line=bReader.readLine())!=null){
            line =line.trim();
            bWriter1.write("\nSAYIN " + line);
        }
        bReader.close();
        bWriter1.close();


    }
}
