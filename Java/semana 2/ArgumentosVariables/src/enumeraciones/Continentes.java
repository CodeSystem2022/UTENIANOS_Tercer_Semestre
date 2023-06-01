package enumeraciones;
public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "1.1 billones"),
    ASIA(44, "4.5 billones"),
    AMERICA(34, "1.0 billones"),
    OCEANIA(14, "0.04 billones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises() {
        return paises;
    }
    
    public String getHabitantes() {
        return habitantes;
    }
    
    public void setHabitantes(String habitantes) {
        this.habitantes = habitantes;
    }
}


