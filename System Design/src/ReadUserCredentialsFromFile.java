import java.util.*;

interface FileType {

    Credentials getCredentials(String file);
}

class PropertyFile implements FileType {

    @Override
    public Credentials getCredentials(String file) {
        return null;
    }

}

class LogFile implements FileType {

    @Override
    public Credentials getCredentials(String file) {
        return null;
    }
}

enum FileExtension {
    PROPERTY("properties"), LOG("log");

    private String extension;

    private LogFile logFile = new LogFile();
    private PropertyFile propertyFile = new PropertyFile();

    FileExtension(String extension) {
        this.extension = extension;
    }

    public FileType getFileType(String extension) {

        switch(FileExtension.valueOf(extension)) {
            case LOG: return logFile;
            case PROPERTY: return propertyFile;
            default:return null;
        }

    }
}

class Credentials {
    String userid;
    String password;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class UserCredentials {

    public static void main(String[] args) {

        // Main Code to read user credentials

        String fileA = "system.log";
        String fileB = "app.properties";
        String fileC = "file.txt";

        UserCredentials userCredentials = new UserCredentials();

        userCredentials.extractExtension(fileA);
        userCredentials.extractExtension(fileB);


    }

    public void extractExtension(String filename) {

        String[] split = filename.split("");

        FileType fileType = getFileType(split[1]);


    }

    public FileType getFileType(String extension) {
        return null;
    }

    public Credentials getCredentials (FileType fileType) {
        return fileType.getCredentials("");
    }

}
