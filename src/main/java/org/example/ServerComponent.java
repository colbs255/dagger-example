package org.example;

import dagger.Component;
import jakarta.inject.Singleton;

@Singleton
@Component(modules = ServerModule.class)
public interface ServerComponent {
    Server buildServer();
}
