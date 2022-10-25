public class main {
    public static void main(String[] args){
            System.out.println("Hello World!");

            String middleText = "İlginizi çekebilir";

            String subtext = "Vade Süresi";

            System.out.println(subtext);

            int expiry = 12;

            double dolarYesterday = 18.20;
            double dolarToday = 18.20;

            boolean isDolarDown = false;

            String okYonu = "";

            if (dolarToday < dolarYesterday){
                okYonu = "down.swg";
                System.out.println(okYonu);
            } else if (dolarToday>dolarYesterday) {
                okYonu="up.swg";
                System.out.println(okYonu);
            } else{
                okYonu="equal.swg";
                System.out.println(okYonu);
            }

        String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};

        System.out.println(krediler[0]);
        System.out.println(krediler[1]);
        System.out.println(krediler[2]);

        for (int i=0; i < krediler.length; i++){
            System.out.println(krediler[i]);
        }

    }

}
