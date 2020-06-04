import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LishPhone {
    private final String COMMA_DELIMITER = "|";

    public List<Phone> read() {
        List<Phone> phoneList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader("phonelist.csv"));
            while ((line = bufferedReader.readLine()) != null) {
                printContry(parseCvsLine(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return phoneList;
    }
    private List<String> parseCvsLine(String csvLine) {
        List<String> result =new ArrayList<>();
        if (csvLine != null){
            String[] splitData = csvLine.split(COMMA_DELIMITER);
            for (int i = 0;i < splitData.length; i++){
                result.add(splitData[i]);
            }
        }
        return result;
    }
    private void printContry(List<String> country){
        System.out.println(country.get(0) + "|" +
                country.get(1) + "|" +
                country.get(2) + "|" +
                country.get(3) + "|" +
                country.get(4) + "|" +
                country.get(5) + "|" +
                country.get(6) + "|");
    }
    public void write(List<Phone> phoneList){
        try {
            FileWriter fileWriter = new FileWriter("phonelist.csv");
            for (Phone phone : phoneList){
                fileWriter.write(phone.toString());
                fileWriter.write("\n");
            }
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
