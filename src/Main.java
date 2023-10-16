public class Main {
    public static void main(String[] args) {
        System.out.println("Test classe Persona");

        Persona persona1 = new Persona("giovanni", "20/11/2020", "lgbtaykugabhjsfdhjasdfscds,maskjdQWHKSASD,NJ,MXFC");
        System.out.println(persona1.toString());

        Persona persona2 = (Persona) persona1.clone();
        System.out.println(persona2.toString());


        System.out.println("Test classe Calciatore");

        Calciatore calciatore1 = new Calciatore("centro", 2, 3, "pietro", "5/35/2344", "dfkjslfklklhjsdf");
        System.out.println(calciatore1.toString());

        Calciatore calciatore2 = (Calciatore) calciatore1.clone();
        System.out.println(calciatore2.toString());
    }
}