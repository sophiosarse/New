import java.util.*;

public class Main {
    public static void main(String[] args) {

        //1

//        BasketballPlayer player1 = new BasketballPlayer("LeBron", "James", 30, 10, 5, 7, 3);
//        BasketballPlayer player2 = new BasketballPlayer("Stephen", "Curry", 28, 5, 1, 8, 2);
//        BasketballPlayer player3 = new BasketballPlayer("Giannis", "Antetokounmpo", 25, 13, 3, 6, 4);
//        BasketballPlayer player4 = new BasketballPlayer("Kevin", "Durant", 27, 6, 2, 4, 1);
//
//        ArrayList<BasketballPlayer> players = new ArrayList<>();
//        players.add(player1);
//        players.add(player2);
//        players.add(player3);
//        players.add(player4);
//
//        Collections.sort(players, new Comparator<BasketballPlayer>() {
//            @Override
//            public int compare(BasketballPlayer p1, BasketballPlayer p2) {
//                return Double.compare(p2.calculateRating(), p1.calculateRating());
//            }
//        });
//
//        System.out.println("Players sorted by rating (Descending):");
//        for (BasketballPlayer player : players) {
//            System.out.println(player);
//        }
//        Collections.sort(players, new Comparator<BasketballPlayer>() {
//            @Override
//            public int compare(BasketballPlayer p1, BasketballPlayer p2) {
//                return Double.compare(p1.calculateRating(), p2.calculateRating());
//            }
//        });
//
//        System.out.println("\nPlayers sorted by rating (Ascending):");
//        for (BasketballPlayer player : players) {
//            System.out.println(player);
//        }

//        //2
//
//        ArrayList<Double> grades1 = new ArrayList<>(Arrays.asList(7.5, 8.0, 9.5));
//        ArrayList<Double> grades2 = new ArrayList<>(Arrays.asList(6.0, 7.0, 6.5));
//        ArrayList<Double> grades3 = new ArrayList<>(Arrays.asList(9.0, 9.5, 8.5));
//        ArrayList<Double> grades4 = new ArrayList<>(Arrays.asList(5.5, 6.0, 6.5));
//
//        Student student1 = new Student("Name1", "LastName1", new GregorianCalendar(2000, Calendar.MAY, 15).getTime(), grades1);
//        Student student2 = new Student("Name2", "LastName2", new GregorianCalendar(1998, Calendar.AUGUST, 30).getTime(), grades2);
//        Student student3 = new Student("Name3", "LastName3", new GregorianCalendar(2002, Calendar.FEBRUARY, 20).getTime(), grades3);
//        Student student4 = new Student("Name4", "LastName4", new GregorianCalendar(1999, Calendar.NOVEMBER, 10).getTime(), grades4);
//
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//
//        System.out.println("Unsorted List:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        students.sort(Comparator.comparing(Student::getFullName));
//        System.out.println("\nSorted by name (Lexicographically):");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        students.sort(Comparator.comparingDouble(Student::calculateAverageGrade));
//        System.out.println("\nSorted by average grade:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        students.sort(Comparator.comparing(Student::getBirthDate));
//        System.out.println("\nSorted by birth date:");
//        for (Student student : students) {
//            System.out.println(student);
//        }

//        //3
//
//        Engine engine1 = new Engine("Gasoline", 4, 1.8);
//        Engine engine2 = new Engine("Diesel", 6, 3.0);
//        Engine engine3 = new Engine("Electric", 0, 0.0);
//        Engine engine4 = new Engine("Gasoline", 4, 2.0);
//
//        Car car1 = new Car("Toyota", "Corolla", 2015, 150000, engine1);
//        Car car2 = new Car("BMW", "X5", 2020, 50000, engine2);
//        Car car3 = new Car("Tesla", "Model 3", 2021, 30000, engine3);
//        Car car4 = new Car("Audi", "A4", 2018, 120000, engine4);
//
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(car1);
//        cars.add(car2);
//        cars.add(car3);
//        cars.add(car4);
//
//        System.out.println("Unsorted List:");
//        for (Car car : cars) {
//            System.out.println(car);
//        }
//
//        cars.sort(Comparator.comparingInt(Car::getYear));
//        System.out.println("\nSorted by year of release:");
//        for (Car car : cars) {
//            System.out.println(car);
//        }
//
//        cars.sort(Comparator.comparingDouble(Car::getMileage));
//        System.out.println("\nSorted by mileage:");
//        for (Car car : cars) {
//            System.out.println(car);
//        }
//
//        cars.sort(Comparator.comparingDouble(car -> car.getEngine().getVolume()));
//        System.out.println("\nSorted by engine volume:");
//        for (Car car : cars) {
//            System.out.println(car);
//        }
    }
}
