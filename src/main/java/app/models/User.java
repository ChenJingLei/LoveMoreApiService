package app.models;

import ch.qos.logback.core.joran.spi.DefaultClass;
import org.hibernate.annotations.Check;

import javax.persistence.*;

/**
 * Created by cjl20 on 2015/11/24.
 */
@Entity
@Table(name = "UserTable")
public class User {

    @Id
    //主键自动增加
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Uid", columnDefinition = "INT")
    String id;

    @Column(name = "Uname", columnDefinition = "VARCHAR(50)", length = 50)
    String name;//昵称

    @Column(name = "Usex", columnDefinition = "TINYINT", length = 1)
    @Check(constraints = "sex >=0 AND sex <= 1")
    int sex;//性别

    @Column(name = "Uaddress", columnDefinition = "VARCHAR(200)", unique = true)
    String address;

    @Column(name = "Umail", columnDefinition = "VARCHAR(50)")
    String mail;

    @Column(name = "Uqq", columnDefinition = "VARCHAR(50)")
    String qq;

    @Column(name = "Uphone", columnDefinition = "VARCHAR(11)")
    String phone;

    @Column(name = "Uusername", columnDefinition = "VARCHAR(50)", length = 50)
    String username;//账户

    @Column(name = "Upassword", columnDefinition = "VARCHAR(50)")
    String password;//密码

    public User() {
    }

    public User(String name, int sex, String address, String mail, String qq, String phone, String username, String password) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.mail = mail;
        this.qq = qq;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}