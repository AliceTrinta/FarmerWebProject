package br.pro.turing.farmerproject.dto;

import br.pro.turing.farmerproject.domain.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

public class DataDTO implements Serializable {

    private LocalDateTime instant;
    private String deviceName;
    private String resourceName;
    private String value;

    public DataDTO() {
    }

    public DataDTO(Data obj) {
        this.instant = obj.getInstant();
        this.deviceName = obj.getDeviceName();
        this.resourceName = obj.getResourceName();
        this.value = obj.getValue();
    }

    public LocalDateTime getInstant() {
        return instant;
    }

    public void setInstant(LocalDateTime instant) {
        this.instant = instant;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
