package by.bsu.zenko.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by 123 on 02.10.2016.
 */
public class InfoFactory {
    private static final Logger LOGGER = LoggerFactory.getLogger(InfoFactory.class);
    public AppInfo getAppInfo(){
        Properties prop = new Properties();
        AppInfo tmp = new AppInfo();
        try {
            prop.load(getClass().getResourceAsStream("/my.properties"));
        } catch (IOException e) {
            LOGGER.error("Error reading properties:",e);
        }
        tmp.setVersion(prop.getProperty("version"));
        tmp.setGroupId(prop.getProperty("groupId"));
        tmp.setArtifactId(prop.getProperty("artifactId"));
        return tmp;
    }
}
