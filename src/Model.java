import java.util.ArrayList;

public class Model {
    ArrayList<String> data = new ArrayList<>();

    void addData(String item){
        data.add(item);
    }
    String getdata(){
        int i = data.size();
        String input2 = data.get(i-1);
        return input2;
    }
}
