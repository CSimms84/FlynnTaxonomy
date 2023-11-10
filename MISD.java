public class MISD {
    public static void main(String[] args) {
        int data = 5;
        int result = pipelineOperation(data);
        System.out.println("Result: " + result);
    }

    private static int pipelineOperation(int data) {
        // Simulating a pipeline of different operations on the same data
        int step1 = data * 2;
        int step2 = step1 + 3;
        int step3 = step2 / 2;
        return step3;
    }
}
