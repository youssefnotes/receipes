package guru.springframework.recipeproject.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Project")
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "projectCode")
    private Integer projectCode;
    private String description;
    private Date validFrom;
    private String cCode;
    private String phase;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp created_at;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp updated_at;

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
    private Set<Building> buildings = new HashSet<>();

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY)
    private Set<Unit> units = new HashSet<>();

    public void addUnit(Unit unit) {
        getUnits().add(unit);
        unit.setProject(this);
    }
    public void addBuilding(Building building) {
        getBuildings().add(building);
        building.setProject(this);
    }
    public Project() {
    }


    public Project(Integer projectCode, String description, Date validFrom, String cCode, String phase, Timestamp created_at, Timestamp updated_at, Set<Building> buildings, Set<Unit> units) {
        this.projectCode = projectCode;
        this.description = description;
        this.validFrom = validFrom;
        this.cCode = cCode;
        this.phase = phase;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.buildings = buildings;
        this.units = units;
    }


    public Set<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(Set<Building> buildings) {
        this.buildings = buildings;
    }

    public Set<Unit> getUnits() {
        return units;
    }

    public void setUnits(Set<Unit> units) {
        this.units = units;
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
