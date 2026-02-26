public class User {
    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        User[] users = {
                new User("John", 20),
                new User("Anna", 35),
                new User("Mark", 42),
                new User("Sophie", 18),
                new User("David", 30)
        };


        double totalAge = 0;
        for (int i = 0; i < users.length; i++) {
            totalAge += users[i].age;
        }


        double averageAge = totalAge / users.length;
        System.out.println("The average age is: " + averageAge);


        System.out.println("Users younger than the average:");
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].name);
            }
        }
    }
}