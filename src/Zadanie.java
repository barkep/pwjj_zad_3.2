public class Zadanie {
    public static void main(String[] args) {
        try {
            Wyrazenie wyr = new Wyrazenie("(3*((1+2)-1))");
            System.out.println("" + wyr.oblicz());
        } catch (DzieleniePrzezZero e) {
            System.out.println("Nie dziel przez 0!!!");
        } catch (ZleWyrazenie zleWyrazenie) {
            System.out.println("Złe wyrażenie");
        }
    }
}