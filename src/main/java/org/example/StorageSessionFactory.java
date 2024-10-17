package org.example;

public interface StorageSessionFactory {
    interface Session {
        void save(Object object);
    }

    Session openSession();
}