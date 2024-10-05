import java.util.Random;
//import java.util.stream.IntStream;

public class TestRandomStringGen {
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int limitRange = rightLimit-leftLimit;
    int targetStringLength = 10;

    /*public String TestFuncGetFromWebRandomStringGen(Random random){
        IntStream intStream = random.ints(leftLimit,rightLimit+1)
                .limit(targetStringLength);
        return intStream.collect(() -> new StringBuilder(),
                (stringBuilder,elem) -> stringBuilder.appendCodePoint(elem),
                (stringBuilder,elem) -> stringBuilder.append(elem)).toString();
    }*/

    public String TestMySimpleRandomStringGen(Random random){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < targetStringLength; i++){
            stringBuilder.appendCodePoint(leftLimit + random.nextInt(limitRange+1));
        }

        return stringBuilder.toString();
    }
}