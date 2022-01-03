package alghoritms.konstante;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lista {

    public static final String WARNING_MESSAGE ="0.0  **Wrong input**  Input pattern must be in pattern '11 + 12'";
    public static final void OPTIONS_MENU(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("*  Welcome to my java calculator in console: *");
        System.out.println("*                                            *");
        System.out.println("*               Press button:                *");
        System.out.println("*               1. for instructions          *");
        System.out.println("*               2. to calculate              *");
        System.out.println("*               3. to quit                   *");
        System.out.println("*                                            *");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static final String[] names = {"Mike", "John", "Josip", "Marija", "Tina", "Ivana", "Aofie", "Boris", "Drago", "Lucky", "Steven" };

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
        int[] a =  new int[100];
        int n = 1;
        for (int i =0; i<a.length; i++){
            a[i] = n++;
        }
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
