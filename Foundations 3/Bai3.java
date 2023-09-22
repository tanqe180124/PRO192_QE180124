import java.util.Scanner;
// nhap diem chuyen can, giua ky, cuoi ky va in ra diem hoc phan
public class Bai3 {
    public static void main(String[] args) {
        Double chuyen_can, giua_ky, cuoi_ky, hoc_phan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem chuyen can (10%): ");
        chuyen_can = sc.nextDouble();
        System.out.println("Nhap diem giua ky (40%): ");
        giua_ky =  sc.nextDouble();
        System.out.println("Nhap diem cuoi ky (50%): ");
        cuoi_ky = sc.nextDouble();
        hoc_phan = chuyen_can*0.1 + giua_ky*0.4 + cuoi_ky*0.5;
        System.out.println(hoc_phan);
    }
}
