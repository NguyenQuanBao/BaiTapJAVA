import java.util.Scanner;

public class quydoitiente {
    public static void main(String[] args) {
        double VND = 23000;
        double USD;
        Scanner gia = new Scanner(System.in);
        System.out.print("Nhập mệnh giá USD: ");
        USD = gia.nextDouble();
        double quydoi = USD * 23000 ;
        System.out.print("Số tiền sau quy đổi: " + quydoi);
    }
}
