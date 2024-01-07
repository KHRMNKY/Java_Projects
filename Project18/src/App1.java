public class App1 {
    public static void main(String[] args){
        
        String[] aylar={"ocak","şubat","mart","nisan","mayıs","haziran","temmuz","agustos","eylül","ekım","kasım","aralık"};
        
        /*
         * elemanlrı yazdıralım.
         */

        for(int i=0; i<aylar.length; i++){
            System.out.println(aylar[i]);
    }


    /*
     *foreach döngüsü denilen bir döngü ile tüm elemanlara ulaşalım.
     * kısa yoldan bu şekilde de tüm elemanlara ulaşılabilir.
     */

    for (String ay: aylar){
        System.out.println(ay);
        }






    }

}
