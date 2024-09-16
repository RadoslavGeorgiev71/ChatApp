import java.util.Objects;

public class User {
    private String password;
    private String name;
    private String nickname;
    private String email;

    public User(String password, String name, String nickname, String email) {
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(password, user.password) &&
            Objects.equals(name, user.name) &&
            Objects.equals(nickname, user.nickname) &&
            Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, name, nickname, email);
    }
}
