package guru.springframework.recipeproject.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table

public class PasswordResets implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer  token;
    private String email;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp created_at;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp updated_at;

    public PasswordResets() {
    }

    public PasswordResets(Integer token, String email, Timestamp created_at, Timestamp updated_at) {
        this.token = token;
        this.email = email;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

