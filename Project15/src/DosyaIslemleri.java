import java.io.* ;

public class DosyaIslemleri {
    public static void main(String[] args) throws IOException{
        File file=new File("Metin.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        else{
            
        }

        String val="Merhaba Dunya";
        FileWriter fWriter=new FileWriter(file,false);
        BufferedWriter bWriter=new BufferedWriter(fWriter);
        bWriter.write(val);
        bWriter.close();
        String line;
        FileReader fReader=new FileReader(file);
        BufferedReader bReader=new BufferedReader(fReader);
        while((line=bReader.readLine())!=null){
            System.out.println(line);

        }
        bReader.close();

    }
}
