
public class third {

    public static void main(String[] args){
        double a = 0, b = 0, c = 0;
        int array[] = new int [5];
        for(int i = 0; i < 5; i++){
            array[i] = (int) Math.round(Math.random() * 5);
            a = a + array[i];
            System.out.println(array[i] + "");
        }
        System.out.println("");
        int array_2[] = new int [5];
        for(int j = 0; j < 5; j++) {
            array_2[j] = (int) Math.round(Math.random() * 5);
            b = b + array_2[j];
            System.out.println("" + array_2[j] + "");
        }
        System.out.println("");
        int array_3[] = new int [5];
        for(int k = 0; k < 5; k++) {
            array_3[k] = (int) Math.round(Math.random() * 5);
            c = c + array_3[k];
            System.out.println(array_3[k] + "");
        }
        System.out.println("first array " + a/5);
        System.out.println("second array " + b/5);
        System.out.println("third array " + c/5);
        double f = Math.max(a/5, b/5);
        System.out.println(Math.max(f, a/5 ));

    }
}
