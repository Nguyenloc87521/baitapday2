import java.util.Scanner;
public class baitap {
    public static void main(String[] args) {
//        bài 1
       float dai,rong ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài:");
        dai = scanner.nextFloat();
        System.out.println("Nhập vào chiều rộng");
        rong = scanner.nextFloat();

       float chuvi = (dai + rong )* 2;
        float dientich = dai * rong;

        System.out.printf("Hình chữ nhật có chiều dài %f và chiều rộng %f", dai, rong);
        System.out.printf("chu vi %f va dien tich %f cua hinh ", chuvi, dientich);

    }




}
