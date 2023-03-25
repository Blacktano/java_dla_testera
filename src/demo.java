import model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class demo {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Bartek","Biały", "bartek@test.com", 10));
        users.add(new User("Tomek","Czarny", "tomek@test.com", 12));
        users.add(new User("Marcin","Niebiecki", "marcin@test.com", 13));
        users.add(new User("Jacek","Fioletowy", "jacek@test.com", 14));
        users.add(new User("ASia","Zielony", "asia@test.com", 16));
        users.add(new User("MArta","Czerwony", "marta@test.com", 17));
        users.add(new User("Kasia","Pomarańczowy", "kasia@test.com", 18));

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(user -> user.getFirstName()))
                .collect(Collectors.toList());

        for (User user : sortedUsers) {
            System.out.println(user.getFirstName()+ " "+ user.getLastName()+ " "+ user.getAge());
        }



    }
}
