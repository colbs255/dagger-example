package org.example;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void verify() {
        var component = DaggerServerComponent.create();
        var server = component.buildServer();
    }

}