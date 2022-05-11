
public class fourth {
        public static void main(String[] args) {
            int array_one[] = new int[10];
            int array_two[] = new int[10];
            int array_three[] = new int[10];
            for (int i = 0; i < 10; i++) {
                array_one[i] = (int) Math.round(Math.random() * 10);
                System.out.print(array_one[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < 10; i++) {
                array_two[i] = (int) Math.round(Math.random() * 10);
                System.out.print(array_two[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < 10; i++) {
                array_three[i] = array_one[i] + array_two[i];
                System.out.print(array_three[i] + " ");
            }
        }
    }
