package hashmap1;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Hashtab<String, Integer> hashtab = new Hashtab<>();
        hashtab.hashtabAdd("КНИГА", rand.nextInt(10));
        hashtab.hashtabAdd("МАШИНА", rand.nextInt(8));
        hashtab.hashtabAdd("КЕГЛЯ", rand.nextInt(10));
        hashtab.hashtabAdd("МИР", rand.nextInt(10));
        hashtab.hashtabAdd("ЯБЛОКО", rand.nextInt(8));
        hashtab.hashtabAdd("МЫШЬ", 7);
        hashtab.hashtabAdd("КОМПЬЮТЕР", rand.nextInt(10));
        hashtab.hashtabAdd("ВУЗ", rand.nextInt(10));
        hashtab.hashtabAdd("ФУТБОЛ", rand.nextInt(8));
        hashtab.hashtabAdd("ОКНО", rand.nextInt(10));
        hashtab.print();

        hashtab.hashtabDelete("ВУЗ");
        hashtab.print();

        System.out.println(hashtab.hashtabLookup("ОКНО"));
        hashtab.clear();

    }
}
