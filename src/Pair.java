public class Pair <T, U> {
    T firstParameter;
    U secondParameter;
    public Pair(T firstParameter, U secondParameter){
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }
    public void getFirst(){
        System.out.println("Перший параметер: " + firstParameter);
    }
    public void getSecond(){
        System.out.println("Другий параметр: " + secondParameter);
    }
}
