package com.vinfast.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CarDTO {

    private Integer id;
    private String name;
    private int year;
    private String status;
    private double odo;
    private String original;
    private String style;
    private String gear;
    private String engine;
    private String colorOut;
    private String colorIn;
    private int slotSeats;
    private int slotDoor;
    private String driveTrain;
    private long price;
    private String carStatus;
    private Integer inventoryId;
    private String inventoryName;
    private List<LibraryDTO> libraries;

    public CarDTO() {
    }

    @JsonCreator
    public CarDTO(
            @JsonProperty("id") Integer id,
            @JsonProperty("name") String name,
            @JsonProperty("year") int year,
            @JsonProperty("status") String status,
            @JsonProperty("odo") double odo,
            @JsonProperty("original") String original,
            @JsonProperty("style") String style,
            @JsonProperty("gear") String gear,
            @JsonProperty("engine") String engine,
            @JsonProperty("colorOut") String colorOut,
            @JsonProperty("colorIn") String colorIn,
            @JsonProperty("slotSeats") int slotSeats,
            @JsonProperty("slotDoor") int slotDoor,
            @JsonProperty("driveTrain") String driveTrain,
            @JsonProperty("price") long price,
            @JsonProperty("inventoryId") Integer inventoryId,
            @JsonProperty("inventoryName") String inventoryName,
            @JsonProperty("libraries") List<LibraryDTO> libraries) {

        this.id = id;
        this.name = name;
        this.year = year;
        this.status = status;
        this.odo = odo;
        this.original = original;
        this.style = style;
        this.gear = gear;
        this.engine = engine;
        this.colorOut = colorOut;
        this.colorIn = colorIn;
        this.slotSeats = slotSeats;
        this.slotDoor = slotDoor;
        this.driveTrain = driveTrain;
        this.price = price;
        this.inventoryId = inventoryId;
        this.inventoryName = inventoryName;
        this.libraries = libraries;
    }

    // Getter và Setter cho tất cả các trường
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getOdo() {
        return odo;
    }

    public void setOdo(double odo) {
        this.odo = odo;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColorOut() {
        return colorOut;
    }

    public void setColorOut(String colorOut) {
        this.colorOut = colorOut;
    }

    public String getColorIn() {
        return colorIn;
    }

    public void setColorIn(String colorIn) {
        this.colorIn = colorIn;
    }

    public int getSlotSeats() {
        return slotSeats;
    }

    public void setSlotSeats(int slotSeats) {
        this.slotSeats = slotSeats;
    }

    public int getSlotDoor() {
        return slotDoor;
    }

    public void setSlotDoor(int slotDoor) {
        this.slotDoor = slotDoor;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public List<LibraryDTO> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<LibraryDTO> libraries) {
        this.libraries = libraries;
    }
}
