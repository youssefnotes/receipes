package guru.springframework.recipeproject.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table

public class PasswordResets implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String email;
    private String token;
    private Timestamp created_at;
    private Timestamp updated_at;

    public PasswordResets() {
    }

    public PasswordResets(String email, String token, Timestamp created_at, Timestamp updated_at) {
        this.email = email;
        this.token = token;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
        return "PasswordResets{" +
                "email='" + email + '\'' +
                ", token='" + token + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}

