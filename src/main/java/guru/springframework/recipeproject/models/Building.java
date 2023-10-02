package guru.springframework.recipeproject.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import java.util.Set;

@Entity
@Table(name="buildings")
public class Building implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "buildingCode")
    private long buildingCode;
    private String description;
    private BigDecimal type;
    private BigDecimal zone;
    private String cCode;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "projectCode", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Project project;

    public Building() {
    }

    public Building(Integer buildingCode, String description, BigDecimal type, BigDecimal zone, String cCode, Timestamp created_at, Timestamp updated_at, Set<Unit> units, Project project) {
        this.buildingCode = buildingCode;
        this.description = description;
        this.type = type;
        this.zone = zone;
        this.cCode = cCode;

        this.project = project;
    }

    public Long getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(Integer buildingCode) {
        this.buildingCode = buildingCode;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getType() {
        return type;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public BigDecimal getZone() {
        return zone;
    }

    public void setZone(BigDecimal zone) {
        this.zone = zone;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
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
                ", project=" + project +
                '}';
    }
}
