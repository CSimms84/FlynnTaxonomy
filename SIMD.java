import java.util.Arrays;

public class SIMD {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(data).parallel().map(i -> i * 2).toArray(); // Simulating SIMD
        System.out.println("Result: " + Arrays.toString(result));
    }
}
