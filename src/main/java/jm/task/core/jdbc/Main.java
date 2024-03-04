package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService USER_SERVICE = new UserServiceImpl();

    public static void main(String[] args) {
        USER_SERVICE.createUsersTable();
        USER_SERVICE.saveUser("Илон", "Маск", (byte) 50);
        USER_SERVICE.saveUser("Джеф", "Безос", (byte) 51);
        USER_SERVICE.saveUser("Билл", "Гейтс", (byte) 53);
        USER_SERVICE.saveUser("Джон", "Доу", (byte) 30);
        USER_SERVICE.getAllUsers();
        USER_SERVICE.cleanUsersTable();
        USER_SERVICE.dropUsersTable();


    }
}
