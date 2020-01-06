import java.math.BigInteger;
import java.util.Objects;

public class User {
    private String name;
    private String surename;
    private Integer iD;

    public User(String name, String surename, int iD) {
        this.name = name;
        this.surename = surename;
        this.iD = iD;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return iD == user.iD &&
                Objects.equals(name, user.name) &&
                Objects.equals(surename, user.surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename, iD);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", iD=" + iD +
                '}';
    }
}
