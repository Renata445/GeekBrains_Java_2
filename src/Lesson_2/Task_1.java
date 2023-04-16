package Lesson_2;
import java.io.FileWriter;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] array = {5, 7, -1, 0, 11, 18, 8, 3, 9, 2};
        int temp;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
                sb.append(Arrays.toString(array)).append("\n");
                try {
                    FileWriter fw = new FileWriter("log_task1.txt", false);
                    fw.write(sb.toString());
                    fw.close();
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }
        }
    }
}

