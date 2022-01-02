package konstante;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista {

    public static final List list() {
        List l = new ArrayList();
        for(int i = 0; i< 5; i++){
            int a = 2*i;
            l.add(a);
        }
        return l;
    }

    public static final Integer[] IntegerArr(){
      Integer[] a =  new Integer[]{45, 5, 5, 3, 2, 1};
      return a;
    }

    public static final int[] intArr(){
        int[] a =  new int[]{45, 5, 5, 3, 2, 1};
        return a;
    }

    public static final List  stringList(){
        List l = new ArrayList();
        for(int i = 0; i< 5; i++){
            String a ="" + Lista.randomChar()+ Lista.randomChar() + i;
            l.add(a);
        }
        return l;
    }

    public static char randomChar(){
        String abc = "abcdefghijklmnopqrstuwvxyz";
        Random r = new Random();
        char c = abc.charAt(r.nextInt(abc.length()));
        return c;
    }
}
