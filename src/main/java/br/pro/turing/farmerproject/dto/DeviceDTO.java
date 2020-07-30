package br.pro.turing.farmerproject.dto;

import br.pro.turing.farmerproject.domain.ConnectionState;
import br.pro.turing.farmerproject.domain.Device;
import br.pro.turing.farmerproject.domain.Resource;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DeviceDTO implements Serializable {

    private String deviceName;
    private String UUID;
    private String description;
    private String connectionState = ConnectionState.OFFLINE.getState();
    private List<Resource> resourceList = new ArrayList<>();
    private ObjectId environmentId;

    public DeviceDTO() {
    }

    public DeviceDTO(Device obj) {
        this.deviceName = obj.getDeviceName();
        this.UUID = obj.getUUID();
        this.description = obj.getDescription();
        this.connectionState = obj.getConnectionState();
        this.resourceList = obj.getResourceList();
        this.environmentId = obj.getEnvironmentId();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConnectionState() {
        return connectionState;
    }

    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList.clear();
        if (resourceList != null) {
            this.resourceList = resourceList;
        }
    }

    public ObjectId getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(ObjectId environmentId) {
        this.environmentId = environmentId;
    }
}
