public class Mystery {
    public static void main(String[] args) {
        recur(2, 7);
    }

    public static void recur(int x, int y){
        System.out.println(x + " " +y);
        x++;
        if (y < 3) {
            return;
        }
            x = x + y;


            System.out.println(x + " " + y);
        }
    }


