package hashmap2_2;

public class Main {
    public static void main(String[] args) {

        Map map = new Map();


        map.Add("Коренев","Владислав");
        map.Add("Алексей","Наумов");
        map.Add("Алексей","Холодков");
        map.Add("Торяник","Александр");
        map.Add("Билялетдинов","Хамит");
        map.Add("Билялетдинов","Айрат");
        map.Add("Делибалтов","Костас");
        map.Add("Прудченко","Роман");
        map.Add("Бичиков","Никита");
        map.Add("Янул","Алексей");


        System.out.println(map.getSameFirstNameCount());
        System.out.println(map.getSameLastNameCount());
        map.CreateMap();
    }
}
