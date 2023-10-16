public class Calciatore extends Persona {
    private String ruolo;
    private int numeroMaglia;
    private int numeroGoal;

    public Calciatore(String ruolo, int numeroMaglia, int numeroGoal, String nome, String dataNascita, String sesso){
        super(nome, dataNascita, sesso);
        this.ruolo = ruolo;
        this.numeroMaglia = numeroMaglia;
        this.numeroGoal = numeroGoal;
    }
    public Calciatore(Calciatore calciatore){
        super(calciatore.getNome(), calciatore.getDataNascita(), calciatore.getSesso());
        this.ruolo = calciatore.ruolo;
        this.numeroMaglia = calciatore.numeroMaglia;
        this.numeroGoal = calciatore.numeroGoal;
    }
    public String getRuolo(){
        return this.ruolo;
    }
    public void setRuolo(String ruolo){
        this.ruolo = ruolo;
    }
    public int getNumeroMaglia(){
        return this.numeroMaglia;
    }
    public int getNumeroGoal(){
        return this.numeroGoal;
    }
    public void incrementaNumeroGoal(){
        this.numeroGoal++;
    }
    public Object clone(){
        return new Calciatore(this);
    }
    public String toString(){
        return "{" + this.toStringInner() + "\"ruolo\": \"" + this.ruolo + "\", \"numeroMaglia\": " + this.numeroMaglia + ", \"numeroGoal\": " + this.numeroGoal + "}";
    }
}
