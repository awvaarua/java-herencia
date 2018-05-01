public class Alumne extends Persona {

    private String curs;
    private String grup;

    public Alumne(String nom, String dni, int edat, String poblacio, String curs, String grup) {
        super(nom, dni, edat, poblacio);
        this.curs = curs;
        this.grup = grup;
    }
    
}