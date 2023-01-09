package org.example;

import org.example.entity.*;
import org.example.service.CarService;
import org.example.service.ClientService;
import org.example.service.FriendService;
import org.example.service.LicenseService;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        CarService carService = new CarService();
        ClientService clientService = new ClientService();
        FriendService friendService = new FriendService();
        HashSet<Car> cars = new HashSet<>();
        HashSet<Friend> friends = new HashSet<>();

        for (SexFriend sexFriend : SexFriend.values()) {
            Friend friend = new Friend();
            friend.setSexFriend(sexFriend);
            friends.add(friend);
            friendService.save(friend);
        }

        License license = new License();
        license.setCategory(Category.B);

        Client client = new Client();
        client.setName("Steve");
        client.setEmail("steve@gmail.com");
        client.setPhone(991348742);
        client.setAbout("He like sport");
        client.setLicense(license);
        client.setCars(cars);
        client.setFriend(friends);
        clientService.save(client);

        Car car = new Car();
        car.setModel("Toyota");
        car.setVinCode("PM12956DF394575665");
        car.setClient(client);
        carService.save(car);
    }
}
