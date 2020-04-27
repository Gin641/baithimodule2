import java.io.Serializable;

public class Phone implements Serializable {
    private String contact;
    private String name;
    private int number;
    private String sex;
    private String address;
    private byte age;
    private String email;
    public Phone(){
    }
    public Phone(int number,String contact,String name,String sex,String address,byte age,String email){
        this.number=number;
        this.contact=contact;
        this.name=name;
        this.sex=sex;
        this.address=address;
        this.age=age;
        this.email=email;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "contact='" + contact + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
