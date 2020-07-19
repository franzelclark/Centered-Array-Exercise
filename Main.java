public class Main {
    static int myMethod(int x[]) {

        if (x.length % 2 == 0) {            // If the array is Even
            return 0;                       // Not centered (no middle element)
        }

        int middleIndex;
        middleIndex = x.length / 2;
        int middleValue = x[middleIndex];

        for (int i = 0; i < x.length; i++) {
            if (i != middleIndex && x[i] <= middleValue) {
                return 0;                   // Something's lower than my middle element, not centered
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] myArray = {3, 2, 1, 4, 5};
        System.out.println(myMethod(myArray));
    }
}