public class Professor extends Persona {

    private long sou;
    private String departament;
    
    public Professor(String nom, String dni, int edat, String poblacio, long sou, String departament) {
        super(nom, dni, edat, poblacio);
        this.sou = sou;
        this.departament = departament;
    }
    
}