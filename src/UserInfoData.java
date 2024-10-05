import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class UserInfoData {
    private final ArrayList<String> namesArrayList = new ArrayList<>();
    private final LinkedList<String> namesLinkedList = new LinkedList<>();

    public LinkedList<String> getNamesLinkedList() {
        return namesLinkedList;
    }

    public ArrayList<String> getNamesArrayList() {
        return namesArrayList;
    }

    public void AddItemToLists(String item){
        namesArrayList.add(item);
        namesLinkedList.add(item);
    }

    //test addons to make Lists bigger
    public void AddSomeRandomValues(int count){
        Random random = new Random();
        for (int i = 0; i < count; i++){
            String testVal = new TestRandomStringGen().TestMySimpleRandomStringGen(random);
            AddItemToLists(testVal);
        }
    }
}
