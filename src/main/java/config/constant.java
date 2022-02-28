package config;

import io.github.cdimascio.dotenv.Dotenv;

public interface constant {

    Dotenv dotenv = Dotenv.load();

    String CHROME_PATH = dotenv.get("CHROME_PATH");
    String WEBDRIVER_CHROME = dotenv.get("WEBDRIVER_CHROME");
    String CHROME = "Chrome";
    String PRODUCTION = "Production";
}
