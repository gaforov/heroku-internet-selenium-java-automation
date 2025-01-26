package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    private static final Properties properties = new Properties();

    static {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/config.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file", e);
        }
    }

    // Method to get a property with a default value
    public static String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    // Overloaded method to get a property without a default value
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    // Method to get the URL for the current environment
    public static String getEnvironmentUrl() {
        String env = System.getProperty("env", "qa"); // Default to 'dev' if not specified
        String envUrlKey = env + ".url"; // Construct key like "dev.url"
        return getProperty(envUrlKey, "https://the-internet.herokuapp.com/"); // Provide a default URL
    }
}
