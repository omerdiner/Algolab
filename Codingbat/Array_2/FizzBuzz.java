package Array_2;

public class FizzBuzz {
    public String[] fizzBuzz(int start, int end) {
        String arr[] = new String[end - start];

        for (int i = start; i < end; i++) {
            if (i % 15 == 0) {
                arr[i - start] = "FizzBuzz";
            } else if (i % 5 == 0) {
                arr[i - start] = "Buzz";
            } else if (i % 3 == 0) {
                arr[i - start] = "Fizz";
            } else {
                arr[i - start] = String.valueOf(i);
            }
        }
        return arr;
    }
}
