package tp1;

public class EX6{

	public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Donnez exactement 6 entiers");
            return;
        }
        
        int max = Integer.parseInt(args[0]);
        for (int i = 1; i < 6; i++) {
            int val = Integer.parseInt(args[i]);
            if (val > max) {
                max = val;
            }
        }
        
        System.out.println("Le maximum est = " + max);
    }

}
