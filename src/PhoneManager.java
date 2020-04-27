import java.util.List;
import java.util.Scanner;

public class PhoneManager {
    Scanner sc = new Scanner(System.in);
    private List<Phone> phoneList;
    private LishPhone lishPhone;
    public PhoneManager(){
        lishPhone = new LishPhone();
    }
    public int inputNumber(){
        System.out.println("Nhập SĐT: ");
        while (true){
            try {
                int number = Integer.parseInt(sc.nextLine());
                return number;
            }catch (NumberFormatException e){
                System.out.println("SĐT không hợp lệ! \n" +
                        "Nhập lại SĐT");
            }
        }
    }
    private String inputName(){
        System.out.print("Nhập tên: ");
        return sc.nextLine();
    }
    private byte inputAge(){
        System.out.print("Nhập độ tuổi: ");
        while (true){
            try {
                byte age = Byte.parseByte(sc.nextLine());
                if (age < 0 && age > 100){
                    throw new NumberFormatException();
                }
                return age;
            }catch (NumberFormatException e){
                System.out.print("Độ tuổi không hợp lệ! \n" +
                        "Nhập lại độ tuổi: ");
            }
        }
    }
    private String inputContact(){
        System.out.println("Nhập nhóm: ");
        return sc.nextLine();
    }
    private String inputSex(){
        System.out.println("Nhập giới tính: ");
        return sc.nextLine();
    }
    private String inputAddress(){
        System.out.println("Nhập địa chỉ: ");
        return sc.nextLine();
    }
    private String inputEmail(){
        System.out.println("Nhập Email: ");
        return sc.nextLine();
    }
    public void add(){
        String contact = inputContact();
        String name = inputName();
        int number = inputNumber();
        String sex = inputSex();
        String address = inputAddress();
        byte age = inputAge();
        String email = inputEmail();
        Phone phone = new Phone(number,name,contact,sex,address,age,email);
        phoneList.add(phone);
        lishPhone.write(phoneList);
    }
    public void delete(int number){
        Phone phone = null;
        int size = phoneList.size();
        String choice = null;
        for (int i = 0; i < size;i++){
            if (phoneList.get(i).getNumber() == number) {
                phone = phoneList.get(i);
                if (phone != null) {
                    switch (choice) {
                        case "Y":
                            phoneList.remove(phone);
                            lishPhone.write(phoneList);
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("SĐT: " + number + " Không có");
                }
            }
        }
    }
    public void edit(int number){
        boolean isExisted = false;
        int size = phoneList.size();
        for (int i =0; i < size;i++){
            if (phoneList.get(i).getNumber() == number){
                isExisted = true;
                phoneList.get(i).setAddress(inputAddress());
                phoneList.get(i).setName(inputName());
                phoneList.get(i).setSex(inputSex());
                phoneList.get(i).setAge(inputAge());
                phoneList.get(i).setAddress(inputAddress());
                phoneList.get(i).setEmail(inputEmail());
                break;
            } else {
                System.out.println("SĐT không hợp lệ");
            }
        }
    }
    public void write(){
        lishPhone.write(phoneList);
    }
    public void show(){
        for (Phone phone : phoneList){
            System.out.format("%5d | ", phone.getNumber());
            System.out.format("%10s | ", phone.getContact());
            System.out.format("%10s | ", phone.getName());
            System.out.format("%5s | ",phone.getSex());
            System.out.format("%10s | ",phone.getAddress());
            System.out.format("%5d | ", phone.getAge());
            System.out.format("%15s | ",phone.getEmail());
        }
    }
}
