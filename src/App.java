public class App {

    static <T> boolean twoEqual(T[] a) {

        boolean difference = true;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i]).equals((a[j]))) {
                    difference = false;
                }
            }
        }
            
        return difference;
    }
    public static void main(String[] args) {        	
        	
        Double[] a = {0.0, 0.0, 0.0, 0.0, 0.0}; // Change this to test your procedure.
        for (int i = 0; i < a.length; i++) {
            System.out.println((a[i]));
        }
        System.out.println(twoEqual(a));
    }
}
