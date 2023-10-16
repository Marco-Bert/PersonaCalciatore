public class Persona {
    private String nome;
    private String dataNascita;
    private String sesso;

    public Persona(String nome, String dataNascita, String sesso){
        this.nome = nome;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
    }
    public Persona(Persona persona){
        this.nome = persona.nome;
        this.dataNascita = persona.dataNascita;
        this.sesso = persona.sesso;
    }
    public String getNome(){
        return this.nome;
    }
    public String getDataNascita(){
        return dataNascita;
    }
    public String getSesso(){
        return this.sesso;
    }
    public void setSesso(String sesso){
        this.sesso = sesso;
    }
    public Object clone(){
        return (Object) new Persona(this.nome, this.dataNascita, this.sesso);
    }
    public String toString(){
        return "{\"nome\": \"" + this.nome + "\", \"dataNascita\": \"" + this.dataNascita + "\", \"sesso\": \"" + this.sesso + "\"}";
    }
}
