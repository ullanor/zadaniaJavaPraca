import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        int initialArg = 10;

        Scanner scanner = new Scanner(System.in);
        UserInfoData userInfoData = new UserInfoData();
        AcquireUserInfo acquireUserInfo = new AcquireUserInfo(initialArg);

        System.out.println(acquireUserInfo.getInitialMessage());

        for (int i = 0; i < acquireUserInfo.getAskCount(); i++){
           System.out.println(acquireUserInfo.getQuestionMessage(i));
           String userInput = scanner.nextLine();
           //-
           if(Objects.equals(userInput, "def")) {
               userInfoData.AddSomeRandomValues(1000);
               break;
           }
           //-
           userInfoData.AddItemToLists(userInput);
        }

        System.out.println(acquireUserInfo.getEndMessage());

        PrintArrayWithElapsedTime(userInfoData.getNamesArrayList(),System.currentTimeMillis());
        PrintArrayWithElapsedTime(userInfoData.getNamesLinkedList(),System.currentTimeMillis());
    }

    public static void PrintArrayWithElapsedTime(List<String> userArray,long startTime){
        System.out.println("\n-----------");
        for (String arrayVal : userArray) {
            System.out.print((arrayVal.isEmpty() ? "-" : arrayVal) + " ");
        }

        String output = "\n" + userArray.getClass().getSimpleName() +
                " (" + userArray.size() + "): " +
                (System.currentTimeMillis() - startTime) + "ms";
        System.out.println(output);
    }
}
