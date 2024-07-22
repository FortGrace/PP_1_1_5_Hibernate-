package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Nonna", "Vasilyeva", (byte) 13);
        userService.saveUser("Petr", "Svetlov", (byte) 33);
        userService.saveUser("Natalia", "Ahmedjanova", (byte) 43);
        userService.saveUser("Vladelita", "Bekmamdetova", (byte) 42);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
