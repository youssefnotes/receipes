package guru.springframework.recipeproject.models;

import jakarta.persistence.*;
import org.apache.tomcat.util.json.Token;

import java.security.Timestamp;
import java.text.DecimalFormat;
@Entity
public class Users {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String name;
        @Column(unique=true)
        private String email;
        private String password;
        private Token rememberToken;
        private Timestamp created_at;
        private Timestamp updated_at;

    public Users() {
    }


    public Users(Long id, String name, String email, String password, Token rememberToken, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.rememberToken = rememberToken;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Token getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(Token rememberToken) {
        this.rememberToken = rememberToken;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", rememberToken=" + rememberToken +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}

