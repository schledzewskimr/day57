import java.util.HashMap;
public class Abbreviations {
    private HashMap<String, String> abbreviations;

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");
        abbreviations.addAbbreviation("lol", "laugh out loud");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }
            System.out.print(part);
            System.out.print(" ");
        }
        System.out.println();
    }

    public Abbreviations() {
        this.abbreviations = new HashMap<String, String>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviations.get(abbreviation) != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation);
    }
}
