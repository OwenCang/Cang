package cn.seehoo.store.bean;

import org.apache.commons.logging.LogFactory;
import sun.rmi.runtime.Log;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    public static Log log = (Log) LogFactory.getLog(User.class);
    private static final long serialVersionUID = -5032824154764967499L;
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String image;
    private Integer gender;
    private String creditetUser;
    private Date credittedTime;
    private String modifiedUser;
    private String modifiedTime;

    public User(){

    }

    public User(Integer id, String username, String password, String email, String phone, String image, Integer gender, String creditetUser, Date credittedTime, String modifiedUser, String modifiedTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.image = image;
        this.gender = gender;
        this.creditetUser = creditetUser;
        this.credittedTime = credittedTime;
        this.modifiedUser = modifiedUser;
        this.modifiedTime = modifiedTime;
    }

    public static Log getLog() {
        return log;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getImage() {
        return image;
    }

    public Integer getGender() {
        return gender;
    }

    public String getCreditetUser() {
        return creditetUser;
    }

    public Date getCredittedTime() {
        return credittedTime;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public static void setLog(Log log) {
        User.log = log;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setCreditetUser(String creditetUser) {
        this.creditetUser = creditetUser;
    }

    public void setCredittedTime(Date credittedTime) {
        this.credittedTime = credittedTime;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (image != null ? !image.equals(user.image) : user.image != null) return false;
        if (gender != null ? !gender.equals(user.gender) : user.gender != null) return false;
        if (creditetUser != null ? !creditetUser.equals(user.creditetUser) : user.creditetUser != null) return false;
        if (credittedTime != null ? !credittedTime.equals(user.credittedTime) : user.credittedTime != null)
            return false;
        if (modifiedUser != null ? !modifiedUser.equals(user.modifiedUser) : user.modifiedUser != null) return false;
        return modifiedTime != null ? modifiedTime.equals(user.modifiedTime) : user.modifiedTime == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (creditetUser != null ? creditetUser.hashCode() : 0);
        result = 31 * result + (credittedTime != null ? credittedTime.hashCode() : 0);
        result = 31 * result + (modifiedUser != null ? modifiedUser.hashCode() : 0);
        result = 31 * result + (modifiedTime != null ? modifiedTime.hashCode() : 0);
        return result;
    }
}
