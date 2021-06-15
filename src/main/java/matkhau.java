import java.util.Scanner;

public class matkhau {
    void nhapmatkhau() {
        System.out.println("Nhập mật khẩu: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() < 10) {
            System.out.println("Mật khẩu yếu");
        } else if (!str.matches("[A-Z]+[0-9]+[.,-_...]+")) {
            System.out.println("Mật khẩu chưa đủ mạnh");
        } else {
            System.out.println("Nhập mật khẩu thành công");
        }
    }
    }
