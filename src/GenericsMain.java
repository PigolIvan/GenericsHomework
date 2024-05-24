public class GenericsMain {
    public static void main(String[] args){
        Pair<String, Integer> generic = new Pair<>("hello", 123);
        generic.getFirst();
        generic.getSecond();
    }
}
