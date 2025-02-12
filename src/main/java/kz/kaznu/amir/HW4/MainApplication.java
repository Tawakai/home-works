package kz.kaznu.amir.HW4;

public class MainApplication {
    public static void main(String[] args) {
        User[] user = new User[10];
        user[0] = new User("Hernandez", "Rodrigo", "Cascante", 1996, "rodri@gmail.com");
        user[1] = new User("Messi", "Lionel", "Andres", 1987, "barca@icloud.com");
        user[2] = new User("Benzema", "Karim", "Mostafa", 1987, "alitihad@gmail.com");
        user[3] = new User("Ronaldo", "Cristiano", "dos Santos", 1985, "best@gmail.com");
        user[4] = new User("Modric", "Luka", "Poni", 1985, "croatioa@icloud.com");
        user[5] = new User("Kaka", "Ricardo", "dos Santos", 1982, "brasil@firstmail.com");
        user[6] = new User("Cannavaro", "Fabio", "?", 1973, "italia@gmail.com");
        user[7] = new User("Moreira", "Ronaldinho", "de Assis", 1980, "ronni@gmail.com");
        user[8] = new User("Shevchenko", "Andrei", "Nikolaevich", 1976, "urkainecoach@icloud.com");
        user[9] = new User("Nedved", "Pavel", "?", 1972, "ooooldguy@gmail.com");
        int year = 2025;
        for (int i = 0; i < user.length; i++) {
            if ((year - user[i].birthYear) > 40) {
                user[i].info();
            }
        }
        Box box = new Box ("10x10x10", "red");
        box.info();
        box.itemInIt();
        box.open();
        box.info();
        box.itemInIt();
        box.info();



    }

}
