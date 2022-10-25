public class Main {

    public static void main(String[] args) {
	int sayi1 = 15;
    int sayi2 = 2;
    int sayi3 = 20;

    int enKucuk = sayi3;
    int enBuyuk;

    if(sayi1<sayi2){
        enBuyuk=sayi2;
    }else if(sayi1<sayi3){
        enBuyuk = sayi3;
    }else{
        enBuyuk = sayi1;
    }

    if(enKucuk>sayi1) {
        enKucuk = sayi1;
    }if(enKucuk>sayi2){
        enKucuk = sayi2;
        }
    System.out.println("En küçük sayı: " + enKucuk);
    System.out.println("En büyük sayi: " + enBuyuk);
    }
}
