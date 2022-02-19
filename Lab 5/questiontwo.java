import java.util.Scanner;

class Rectangle {

    public void area(int l, int w) {
        System.out.println(l * w);
    }

    public void perim(int l, int w) {
        System.out.println(2 * (l + w));
    }

}

public class questiontwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        Rectangle obj = new Rectangle();
        obj.area(length, width);
        obj.perim(length, width);
        sc.close();
    }
}

