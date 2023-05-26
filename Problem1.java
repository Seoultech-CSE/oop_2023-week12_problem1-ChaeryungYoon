import java.util.*;

public class week13_1 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<>();

        System.out.print("Enter five integers and five doubles: ");

        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        sort(list);

        for (Number number : list) {
            System.out.print(number + " ");
        }
    }

    public static void sort(ArrayList<Number> list) {
        Collections.sort(list, new Comparator<Number>() {
            public int compare(Number num1, Number num2) {
                return Double.compare(num1.doubleValue(), num2.doubleValue());
            }
        });
    }
}
