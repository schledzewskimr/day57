import java.util.HashMap;
public class Nicknames {
    public static void main(String[] args) throws Exception {
        
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        String nickname = nicknames.get("matthew");
        System.out.println(nickname);
    }
}
