import java.util.Scanner;

public class nhapthang {
    public void nhapthangtrongnam() throws thaoexcetption {
        System.out.println("Nhập số nguyên dương");
        Scanner sc = new Scanner(System.in);
        int so;
        try {
            so = Integer.valueOf(sc.nextLine());
            if (so >= 12 || so <= 0) throw new thaoexcetption("Số nhập vào không phải là tháng trong năm");
            else {
                System.out.println("Số nhập vào là tháng trong năm");
                hienthi(so);
            }
        } catch (Exception e) {
            System.out.println("Không được nhập chữ");
        }

    }

    void hienthi(int so) {
        switch (so) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Có 31 ngày");
                break;
            case 2:
                System.out.println("Có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Có 30 ngày");
                break;


        }

    }
}
