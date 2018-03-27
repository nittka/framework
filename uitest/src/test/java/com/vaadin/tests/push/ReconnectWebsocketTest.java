package com.vaadin.tests.push;

import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ReconnectWebsocketTest extends ReconnectTest {

    @Override
    public List<DesiredCapabilities> getBrowsersToTest() {
        return getBrowsersSupportingWebSocket();
    }

    @Override
    protected Class<?> getUIClass() {
        return BasicPushWebsocket.class;
    }

}
