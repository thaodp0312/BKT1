import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws thaoexcetption {

        demtu dt = new demtu();
        String str = "You Only Live Once. But if You do it right. once is Enough";
        System.out.println("Số từ viết in hoa là: " + dt.sotu(str));
        System.out.println("Chuỗi in hoa đầu câu: " + dt.inhoa(str));
        System.out.println("Chuỗi sau khi chuyển ký tự đầu và sau dấu chấm thành viết hoa: " + dt.chuyenkytu(str));
        matkhau mk = new matkhau();
        mk.nhapmatkhau();
        nhapthang nt = new nhapthang();
        nt.nhapthangtrongnam();
    }


}

