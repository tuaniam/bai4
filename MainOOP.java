import java.util.Scanner;

public class MainOOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so sv: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao sinh vien thu: " + (i + 1) + ": ");
            String thongTin = scanner.nextLine();
            String[] thongTins = thongTin.split("");
            students[i] = new Student(thongTins[0], Integer.valueOf(thongTins[1]), Float.valueOf(thongTins[2]));
        }
        Student temp = null;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].getDiem() < students[j].getDiem()) {
                    temp = students[i];
                    students[i] = students[j];
                    students[i] = temp;
                }

            }
        }
        System.out.println("Danh sach sinh vien theo diem: ");
        for (Student student : students) {
            System.out.println("Ten: " + student.setTen() + "Tuoi: " + student.setTuoi() + "Diem: " + student.getDiem());
        }
    }
}
