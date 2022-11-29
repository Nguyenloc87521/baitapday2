import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // bài 2


        Scanner sc = new Scanner(System.in);

        System.out.print("Xin chào các bạn, mình tên là ");
        String name = sc.nextLine();
        System.out.print(",năm nay mình ");
        String age = sc.nextLine();
        System.out.print("giới tính");
        String sex = sc.nextLine();
        System.out.print("Hiện tại mình đang sống và làm việc tại");
        String address = sc.nextLine();

        System.out.print("Xin chào các bạn, mình tên là" + name +",năm nay mình"+ age + ","+"giới tính"
        +sex +"."+"Hiện tại mình đang sống và làm việc tại"+ address);
    }
}
