package app.models;

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
    String name;

    @Column(name = "Usex", columnDefinition = "TINYINT", length = 1)
    @Check(constraints = "sex >=0 AND sex <= 1")
    int sex;

    @Column(name = "Uage", columnDefinition = "INT", length = 3)
    int age;

    @Column(name = "Umail", columnDefinition = "VARCHAR(50)", length = 50)
    String mail;

    public User(String name, int sex, int age, String mail) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.mail = mail;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                '}';
    }
}