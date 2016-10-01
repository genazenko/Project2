package by.bsu.zenko.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by 123 on 28.09.2016.
 */
public class AppInfo {
    private String version;
    private String groupId;
    private String artifactId;
    public AppInfo(){
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("target/classes/my.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        version = prop.getProperty("version");
        groupId = prop.getProperty("groupId");
        artifactId = prop.getProperty("artifactId");
    }

    public String getVersion() {
        return version;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return version+" "+groupId+" "+artifactId;
    }
}
