import java.util.*;
public class MainProgram {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));

        Map<String, String> hashNames = new HashMap<>();
        hashNames.put("1", "first");
        hashNames.put("2", "second");

        System.out.println(returnSize(hashNames));

        Set<String> setNames = new HashSet<>();
        setNames.add("first");
        setNames.add("first");
        setNames.add("second");
        setNames.add("second");
        setNames.add("second");

        System.out.println(returnSize(setNames));
    }

    public static int returnSize(List<String> names) {
        return names.size();
    }

    public static int returnSize(Map<String, String> hashNames) {
        return hashNames.size();
    }

    public static int returnSize(Set<String> setNames) {
        return setNames.size();
    }


}
