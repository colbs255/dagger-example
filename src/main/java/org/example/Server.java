package org.example;

import jakarta.inject.Inject;

public class Server {
    private final UserCache userCache;
    private final StorageSessionFactory sessionFactory;

    @Inject
    public Server(UserCache userCache, StorageSessionFactory sessionFactory) {
        this.userCache = userCache;
        this.sessionFactory = sessionFactory;
    }
}
