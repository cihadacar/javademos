public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,5,7,9,0,12,13};
        boolean isAvailable = false;
        int number = 13;

        /*for (int i = 0; i < numbers.length; i++)
            if (number == numbers[i])
                isAvailable = true;*/

        for (int num : numbers)
            if (num == number)
                isAvailable=true;

        if (isAvailable)
            System.out.println("Number found.");
        else
            System.out.println("Number couldn't find.");

    }
}