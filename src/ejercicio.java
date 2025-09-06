public class ejercicio {
    public static void main(String[] args) {
        int num1 = 3, num2 = 5, num3 = 1;
        int numMax;

        for (int i = 0; i < 5; i++){
            if (num1 > num2 && num1 > num3){
                numMax = num1;
            } else if (num2 > num1 && num2 > num3){
                numMax = num2;
            } else {
                numMax = num3; 
            }
        }
    }
}
