import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chose;
        boolean exit = false;
        PhoneManager phoneManager = new PhoneManager();
        int phoneNumber;
        showMenu();
        while (true){
            chose = sc.nextLine();
            switch (chose){
                case "1":
                    phoneManager.add();
                    break;
                case "2":
                    phoneNumber = phoneManager.inputNumber();
                    phoneManager.delete(phoneNumber);
                    break;
                case "3":
                    phoneNumber = phoneManager.inputNumber();
                    phoneManager.edit(phoneNumber);
                    break;
                case "4":
                    phoneManager.show();
                    break;
                case "5":
                    phoneManager.write();
                    break;
                case "0":
                    System.out.println("Thoát");
                    exit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ \n" +
                            "Mời chọn lại: ");
                    break;
            }
            if (exit){
                break;
            }
            showMenu();
            }
        }
    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Thêm SĐT");
        System.out.println("2. Xóa SĐT");
        System.out.println("3. Sửa SĐT");
        System.out.println("4. Xem danh sách SĐT");
        System.out.println("5. Ghi danh sách sang dạng csv");
        System.out.println("6. Đọc danh sách từ dạng csv");
        System.out.println("0. Thoát.");
        System.out.print("Nhập: ");
    }
}
