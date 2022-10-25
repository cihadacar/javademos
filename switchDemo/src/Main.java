public class Main {

    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel, geçtiniz.");
                break;
            case 'B':
                System.out.println("Çok güzel, geçtiniz.");
                break;
            case 'C':
            case 'D':
                System.out.println("İyi, geçtiniz.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");
        }
    }
}
