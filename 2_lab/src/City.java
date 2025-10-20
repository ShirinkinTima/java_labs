import java.util.HashMap;
import java.util.Map;

public class City {
    private String city;
    private Map<City, Integer> routes;

    // конструкторы
    public City(String city) {
        this.city = city;
        this.routes = new HashMap<>();
    }

    public City(String city, Map<City, Integer> routes) {
        setCityName(city);
        this.routes = routes;
    }

    //  свойства
    public String getCityName() {
        return city;
    }

    public void setCityName(String city) {
        this.city = city;
    }

    // методы
    public void addRoute(City targetCity, int weight) {
        routes.put(targetCity, weight);
    }

    public void removeRoute(City targetCity) {
        if (routes.containsKey(targetCity)) {
            routes.remove(targetCity);
        }
        else {
            System.out.println("Из города " + city + " нет пути в город " + targetCity.city);
        }
    }

    public Map<City, Integer> getRoutes() {
        return new HashMap<>(routes);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Город: ").append(city);
        if (!routes.isEmpty()) {
            stringBuilder.append("\nСвязанные города:");
            for (Map.Entry<City, Integer> entry : routes.entrySet()) { // .entrySet() возвращает все значения в нашей Мапе
                stringBuilder.append("\n  ")
                             .append(entry.getKey().getCityName())         // по ключу обращаемся к Названию города
                             .append(":")
                             .append(entry.getValue());                // обращаемся по ключу
            }
        }
        else {
            stringBuilder.append("\nНет связанных городов :(");
        }
        return stringBuilder.toString();
    }
}
