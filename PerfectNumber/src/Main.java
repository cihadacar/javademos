public class Main {
    public static void main(String[] args) {
        int number = 28;
        int total=0;
        for (int i=1; i<24; i ++)
            if (number % i ==0)
                total +=i;
        if (total == number)
            System.out.println("Perfect Number.");
        else
            System.out.println("Not Perfect Number");
    }
}