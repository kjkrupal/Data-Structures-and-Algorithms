import java.util.*;

interface FileType {

    Credentials getCredentials(String file);
}

class PropertyFile implements FileType {

    @Override
    public Credentials getCredentials(String file) {
        System.out.println("Reading credentials from properties file.");
        return null;
    }

}

class LogFile implements FileType {

    @Override
    public Credentials getCredentials(String file) {
        System.out.println("Reading credentials from log file.");
        return null;
    }
}

enum FileExtension {
    PROPERTIES, LOG;

    private static final LogFile logFile = new LogFile();
    private static final PropertyFile propertyFile = new PropertyFile();

    public static FileType getFileTypeFromExtension(String extension) {

        switch(FileExtension.valueOf(extension)) {
            case LOG: return logFile;
            case PROPERTIES: return propertyFile;
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

        Credentials userA = userCredentials.readCredentials(fileA);
        Credentials userB = userCredentials.readCredentials(fileB);


    }

    public Credentials readCredentials(String filename) {

        String[] splits = filename.split("[.]");

        FileType fileType = getFileType(splits[1]);

        Credentials userCred = getCredentials(fileType, filename);

        return userCred;

    }

    public FileType getFileType(String extension) {

        return FileExtension.getFileTypeFromExtension(extension.toUpperCase());

    }

    public Credentials getCredentials (FileType fileType, String filename) {

        return fileType.getCredentials(filename);
    }

}
