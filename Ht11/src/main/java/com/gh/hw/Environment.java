package com.gh.hw;



import java.io.InputStream;
import java.util.Properties;

public class Environment {

    private final Properties properties;

    public Environment(String propertyFileName)  {
    this.properties = null;
    }

    public String getProperty(String property)   {
      

        return properties.getProperty(property);
    }
}
