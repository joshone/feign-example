package cl.joshone.feignexample.model;

import java.util.Date;

public class User {

    private long id;
    private String username;
    private String password;
    private String twoFactorMode;
    private String twoFactorKey;
    private String twoFactorPin;
    private Date dateAdded;

    public User() {
    }

    public User(long id, String username, String password, String twoFactorMode, String twoFactorKey, String twoFactorPin, Date dateAdded) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.twoFactorMode = twoFactorMode;
        this.twoFactorKey = twoFactorKey;
        this.twoFactorPin = twoFactorPin;
        this.dateAdded = dateAdded;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTwoFactorMode() {
        return twoFactorMode;
    }

    public void setTwoFactorMode(String twoFactorMode) {
        this.twoFactorMode = twoFactorMode;
    }

    public String getTwoFactorKey() {
        return twoFactorKey;
    }

    public void setTwoFactorKey(String twoFactorKey) {
        this.twoFactorKey = twoFactorKey;
    }

    public String getTwoFactorPin() {
        return twoFactorPin;
    }

    public void setTwoFactorPin(String twoFactorPin) {
        this.twoFactorPin = twoFactorPin;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
