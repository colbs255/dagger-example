package org.example;

import dagger.Module;
import dagger.Provides;
import jakarta.inject.Singleton;

@Module
public class ServerModule {
    @Provides
    public UserCache newUserCache() {
        return new UserCache() {
            @Override
            public User get(String username) {
                return new User("dch", "colby", "chance");
            }
        };
    }

    @Provides
    @Singleton
    public StorageSessionFactory newStorageSessionFactory() {
        return new StorageSessionFactory() {
            @Override
            public Session openSession() {
                return new Session() {
                    @Override
                    public void save(Object object) {

                    }
                };
            }
        };
    }
}
