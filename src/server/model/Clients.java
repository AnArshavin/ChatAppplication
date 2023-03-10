package server.model;

import java.util.ArrayList;
import java.util.HashMap;
import sharedClasses.*;

/**
 * This class stores a synchronized object collection for the connected clients, it stores each user-object with
 * its corresponding clientAddress. It uses a hashMap and some of the important functions usually associated with it.
 */
public class Clients {
    private HashMap<User, ClientAddress> clientMap = new HashMap<>();

    public synchronized void put(User user, ClientAddress clientAddress) {
        clientMap.put(user, clientAddress);
    }

    public synchronized void remove(User user) {
        clientMap.remove(user);
    }

    public synchronized ClientAddress getClient(User user) {
        return clientMap.get(user);
    }

    public synchronized int size() {
        return clientMap.size();
    }

    public synchronized ArrayList<User> getKeySet() {
        return new ArrayList<User>(clientMap.keySet());
    }

    public synchronized Boolean contains(User user) {
        return clientMap.containsKey(user);
    }
}

