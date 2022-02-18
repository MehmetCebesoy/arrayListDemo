import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//	int [] sayilar = new int[]{1,2,3};
//    sayilar = new int[4];
//    System.out.println(sayilar[0]);
//    //yeni eleman eklendiğinde eskileri siler
//        // koleksiyonlarda Eski değerleri tutar
        //size:eleman sayısı
        ArrayList sayilar=new ArrayList();
        System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add(10);
        System.out.println(sayilar.size());
        sayilar.add("Ankara");

System.out.println(sayilar.get(0));
        System.out.println(sayilar.get(2));

        //set:değiştirme
        sayilar.set(0,100);
        System.out.println(sayilar.get(0));

        //remove:silmek, slindiğinde kayarak ilerler
        sayilar.remove(0);
        System.out.println(sayilar.get(0));

        //clear:listeyi tamamen siler
        //sayilar.clear();-şeklinde yazılır
        for(Object i:sayilar){
            System.out.println(i);
        }




    }
}
