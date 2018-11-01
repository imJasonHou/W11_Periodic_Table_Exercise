package com.example.jason.w11_periodic_table_exercise;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity (tableName = "element")
// Creating an annotated class that describes a database table e.g. we have a PrimaryKey and one column in this table
public class Element {

    @SerializedName("atomic_number")
    @Expose
    @PrimaryKey
    private Integer atomicNumber;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("atomic_weight")
    @Expose
    private Integer atomicWeight;
    @SerializedName("period")
    @Expose
    private Integer period;
    @SerializedName("group")
    @Expose
    private Integer group;
    @SerializedName("phase")
    @Expose
    private String phase;
    @SerializedName("most_stable_crystal")
    @Expose
    private String mostStableCrystal;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("ionic_radius")
    @Expose
    private Double ionicRadius;
    @SerializedName("atomic_radius")
    @Expose
    private Double atomicRadius;
    @SerializedName("electronegativity")
    @Expose
    private Double electronegativity;
    @SerializedName("first_ionization_potential")
    @Expose
    private Double firstIonizationPotential;
    @SerializedName("density")
    @Expose
    private Double density;
    @SerializedName("melting_point")
    @Expose
    private Double meltingPoint;
    @SerializedName("boiling_point")
    @Expose
    private Double boilingPoint;
    @SerializedName("isotopes")
    @Expose
    private Integer isotopes;
    @SerializedName("discoverer")
    @Expose
    private String discoverer;
    @SerializedName("year_of_discovery")
    @Expose
    private String yearOfDiscovery;
    @SerializedName("specific_heat_capacity")
    @Expose
    private Double specificHeatCapacity;
    @SerializedName("electron_configuration")
    @Expose
    private String electronConfiguration;
    @SerializedName("display_row")
    @Expose
    private Integer displayRow;
    @SerializedName("display_column")
    @Expose
    private Integer displayColumn;

    public Integer getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(Integer atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getAtomicWeight() {
        return atomicWeight;
    }

    public void setAtomicWeight(Integer atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getMostStableCrystal() {
        return mostStableCrystal;
    }

    public void setMostStableCrystal(String mostStableCrystal) {
        this.mostStableCrystal = mostStableCrystal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getIonicRadius() {
        return ionicRadius;
    }

    public void setIonicRadius(Double ionicRadius) {
        this.ionicRadius = ionicRadius;
    }

    public Double getAtomicRadius() {
        return atomicRadius;
    }

    public void setAtomicRadius(Double atomicRadius) {
        this.atomicRadius = atomicRadius;
    }

    public Double getElectronegativity() {
        return electronegativity;
    }

    public void setElectronegativity(Double electronegativity) {
        this.electronegativity = electronegativity;
    }

    public Double getFirstIonizationPotential() {
        return firstIonizationPotential;
    }

    public void setFirstIonizationPotential(Double firstIonizationPotential) {
        this.firstIonizationPotential = firstIonizationPotential;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public Double getMeltingPoint() {
        return meltingPoint;
    }

    public void setMeltingPoint(Double meltingPoint) {
        this.meltingPoint = meltingPoint;
    }

    public Double getBoilingPoint() {
        return boilingPoint;
    }

    public void setBoilingPoint(Double boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public Integer getIsotopes() {
        return isotopes;
    }

    public void setIsotopes(Integer isotopes) {
        this.isotopes = isotopes;
    }

    public String getDiscoverer() {
        return discoverer;
    }

    public void setDiscoverer(String discoverer) {
        this.discoverer = discoverer;
    }

    public String getYearOfDiscovery() {
        return yearOfDiscovery;
    }

    public void setYearOfDiscovery(String yearOfDiscovery) {
        this.yearOfDiscovery = yearOfDiscovery;
    }

    public Double getSpecificHeatCapacity() {
        return specificHeatCapacity;
    }

    public void setSpecificHeatCapacity(Double specificHeatCapacity) {
        this.specificHeatCapacity = specificHeatCapacity;
    }

    public String getElectronConfiguration() {
        return electronConfiguration;
    }

    public void setElectronConfiguration(String electronConfiguration) {
        this.electronConfiguration = electronConfiguration;
    }

    public Integer getDisplayRow() {
        return displayRow;
    }

    public void setDisplayRow(Integer displayRow) {
        this.displayRow = displayRow;
    }

    public Integer getDisplayColumn() {
        return displayColumn;
    }

    public void setDisplayColumn(Integer displayColumn) {
        this.displayColumn = displayColumn;
    }

    @Override
    public String toString() {
        return "Element{" +
                "atomicNumber=" + atomicNumber +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", yearOfDiscovery='" + yearOfDiscovery + '\'' +
                '}';
    }
}