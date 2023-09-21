package guru.springframework.recipeproject.models;

import jakarta.persistence.*;

import java.security.Timestamp;
import java.util.Date;
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String projectCode;
    private String description;
    private Date validFrom;
    private String cCode;
    private String phase;
    private Timestamp created_at;
    private Timestamp updated_at;

    @OneToOne(mappedBy = "project")
    private Building building;

    @OneToOne(mappedBy = "project")
    private Unit unit;

    public Project() {
    }
    public Project(String projectCode, String description, Date validFrom, String cCode, String phase, Timestamp created_at, Timestamp updated_at) {
        this.projectCode = projectCode;
        this.description = description;
        this.validFrom = validFrom;
        this.cCode = cCode;
        this.phase = phase;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
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
        return "Project{" +
                "projectCode='" + projectCode + '\'' +
                ", description='" + description + '\'' +
                ", validFrom=" + validFrom +
                ", cCode='" + cCode + '\'' +
                ", phase='" + phase + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
