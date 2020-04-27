import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LishPhone {
    private static String FILE_LIST_PHONE = "phonelist.cvs";
    public void write(List<Phone> phoneList){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_LIST_PHONE));
            for (Phone phone : phoneList){
                bw.write(phone.toString());
                bw.write("\n");
            }
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
//    public List<Phone> read() {
//        List<Phone> phoneList = new ArrayList<>();
//        FileInputStream fis = null;
//        BufferedInputStream bis = null;
//        try {
//            fis = new FileInputStream(FILE_LIST_PHONE);
//            bis = new BufferedInputStream(fis);
//            phoneList = (List<Phone>) bis.read();
//            bis.close();
//            fis.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return phoneList;
//    }
}
