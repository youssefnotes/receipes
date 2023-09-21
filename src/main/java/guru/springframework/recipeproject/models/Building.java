package guru.springframework.recipeproject.models;

import jakarta.persistence.*;

import java.security.Timestamp;
import java.text.DecimalFormat;
import java.util.Date;
@Entity
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String buildingCode;
    private String description;
    private DecimalFormat type;
    private DecimalFormat zone;
    private String cCode;
    private Timestamp created_at;
    private Timestamp updated_at;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "projectCode", referencedColumnName = "projectCode")
    private Project project;

    @OneToOne(mappedBy = "building")
    private Unit unit;


    public Building() {
    }

    public Building(String buildingCode, String description, DecimalFormat type, DecimalFormat zone, String cCode, Timestamp created_at, Timestamp updated_at, Project project) {
        this.buildingCode = buildingCode;
        this.description = description;
        this.type = type;
        this.zone = zone;
        this.cCode = cCode;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.project = project;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DecimalFormat getType() {
        return type;
    }

    public void setType(DecimalFormat type) {
        this.type = type;
    }

    public DecimalFormat getZone() {
        return zone;
    }

    public void setZone(DecimalFormat zone) {
        this.zone = zone;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingCode='" + buildingCode + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", zone=" + zone +
                ", cCode='" + cCode + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", project=" + project +
                '}';
    }
}
