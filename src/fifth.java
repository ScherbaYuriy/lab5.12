public class fifth{
    public static void main(String[] args) {
        int array[] = new int[15];
        int parni = 0;
        for(int i = 0; i < 15; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.println(array[i] + " ");

            if (array[i] % 2 == 0) {
                parni++;
            }
        }
        System.out.println();
        System.out.println("Парні : " + parni);
    }
}