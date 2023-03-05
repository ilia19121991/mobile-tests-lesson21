package config;

import io.appium.java_client.internal.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public class WebDriverConfig extends Config {

    @Key("browserstack.user")
    String getBrowserstackUser();

    @Key("browserstack.key")
    String getBrowserstackKey();

    @Key("Url")
    String getUrl();

    @Key("App")
    String getApp();

    @Key("device.name")
    String getDeviceName();

    @Key("platform.version")
    String getPlatformVersion();

}
