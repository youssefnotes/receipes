package guru.springframework.recipeproject.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Arrays;

@Entity
public class Unit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String UnitNumber;
    private String description;
    private String status;

    private DecimalFormat floor;
    private DecimalFormat priceAmount;
    private String priceCurr;
    private DecimalFormat size;
    private String unitOfMeasurement;
    private byte[] layoutImage;
    private Timestamp created_at;
    private Timestamp updated_at;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "projectCode", referencedColumnName = "projectCode")
    private Project project;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "buildingCode", referencedColumnName = "buildingCode")
    private Building building;

    public Unit() {
    }

    public Unit(String unitNumber, String description, String status, DecimalFormat floor, DecimalFormat priceAmount, String priceCurr, DecimalFormat size, String unitOfMeasurement, byte[] layoutImage, Timestamp created_at, Timestamp updated_at, Project project, Building building) {
        UnitNumber = unitNumber;
        this.description = description;
        this.status = status;
        this.floor = floor;
        this.priceAmount = priceAmount;
        this.priceCurr = priceCurr;
        this.size = size;
        this.unitOfMeasurement = unitOfMeasurement;
        this.layoutImage = layoutImage;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.project = project;
        this.building = building;
    }

    public String getUnitNumber() {
        return UnitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        UnitNumber = unitNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DecimalFormat getFloor() {
        return floor;
    }

    public void setFloor(DecimalFormat floor) {
        this.floor = floor;
    }

    public DecimalFormat getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(DecimalFormat priceAmount) {
        this.priceAmount = priceAmount;
    }

    public String getPriceCurr() {
        return priceCurr;
    }

    public void setPriceCurr(String priceCurr) {
        this.priceCurr = priceCurr;
    }

    public DecimalFormat getSize() {
        return size;
    }

    public void setSize(DecimalFormat size) {
        this.size = size;
    }

    public String getUnitOfMeasurement() {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement) {
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public byte[] getLayoutImage() {
        return layoutImage;
    }

    public void setLayoutImage(byte[] layoutImage) {
        this.layoutImage = layoutImage;
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

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "UnitNumber='" + UnitNumber + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", floor=" + floor +
                ", priceAmount=" + priceAmount +
                ", priceCurr='" + priceCurr + '\'' +
                ", size=" + size +
                ", unitOfMeasurement='" + unitOfMeasurement + '\'' +
                ", layoutImage=" + Arrays.toString(layoutImage) +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", project=" + project +
                ", building=" + building +
                '}';
    }
}