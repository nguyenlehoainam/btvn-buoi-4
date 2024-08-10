
import java.util.Scanner;

class Student {
    private String ten;
    private int namsinh;
    private String diachi;
    private double tx1;
    private double tx2;
    private double kthp;
    private int sotietnghi;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten: ");
        ten = scanner.nextLine();
        System.out.print("Nam sinh: ");
        namsinh = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Dia chi: ");
        diachi = scanner.nextLine();
        System.out.print("Diem TX1: ");
        tx1 = scanner.nextDouble();
        System.out.print("Diem TX2: ");
        tx2 = scanner.nextDouble();
        System.out.print("Diem KTHP: ");
        kthp = scanner.nextDouble();
        System.out.print("So tiet nghi: ");
        sotietnghi = scanner.nextInt();
        scanner.nextLine();
    }

    public void hienthi() {
        int tuoi = 2024 - namsinh;
        double gpa = tx1 * 0.2 + tx2 * 0.3 + kthp * 0.5;
        System.out.printf("%-20s %-20d %-20s %-20.1f %-20.1f %-20.1f %-20.2f %-20d\n",
                ten, tuoi, diachi, tx1, tx2, kthp, gpa, sotietnghi);
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ":");
            students[i] = new Student();
            students[i].nhap();
        }

        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",
                "Ten", "Tuoi", "Dia chi", "Diem TX1", "Diem TX2", "Diem KTHP", "Diem GPA", "Nghi");

        for (Student student : students) {
            student.hienthi();
        }
    }
}
