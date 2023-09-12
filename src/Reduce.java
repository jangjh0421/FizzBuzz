public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int init = 100;
        while (init != 0){
            if (init % 2 == 0){
                init /= 2;
            }
            else init -= 1;
            count ++;
        }
        System.out.println("It takes " + count + " steps to get to 0 from 100.");
    }
}