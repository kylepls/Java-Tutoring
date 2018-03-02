package enumeration;


// boolean: true/false
public enum Genders {
    
    MALE("male"),
    FEMALE("female"),
    OTHER("other"),
    GENDER_QUEER("gender queer"),
    TRANS_GENDER("zach");
    
    private final String lowerCaseName;
    
    Genders(String lowerCaseName) {
        this.lowerCaseName = lowerCaseName;
    }
    
    public boolean isMale() {
        return this == MALE;
    }
    
    public boolean isMale(boolean flag) {
        return this == MALE;
    }
    
    public String getLowerCaseName() {
        return lowerCaseName;
    }
}
