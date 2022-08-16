import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        try {
            String line;
            String PATH_FILE = "C:\\Users\\WINDOWS\\IdeaProjects\\MD2-bai16-BT2-ghi file csv\\src\\quocgia.csv";
            br = new BufferedReader(new FileReader(PATH_FILE));
            while ((line = br.readLine()) != null){
                printCountry(parsecsvLine(line));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (br !=null)
                br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<String> parsecsvLine(String csvLine){
        List<String> result = new ArrayList<>();
        if (csvLine != null){
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }
    private static void printCountry(List<String> country){
        System.out.println(
                "Country [id= "
                +country.get(0)
                +",code= " + country.get(1)
                + ",name=" + country.get(2)
                + "]");
    }
}
