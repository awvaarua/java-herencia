public class PersonalAdministracio extends Persona {

    private long sou;
    private String carreg;
    
    public PersonalAdministracio (String nom, String dni, int edat, String poblacio, long sou, String carreg) {
        super(nom, dni, edat, poblacio);
        this.sou = sou;
        this.carreg = carreg;
    }
    
}