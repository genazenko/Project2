package by.bsu.zenko.model;

/**
 * Created by 123 on 28.09.2016.
 */
public class AppInfo {
    private String version;
    private String groupId;
    private String artifactId;

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
