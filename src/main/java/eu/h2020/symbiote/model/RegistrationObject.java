package eu.h2020.symbiote.model;

/**
 * Created by mateuszl on 03.10.2016.
 */
public class RegistrationObject {
    String regObject;
    RegistrationObjectType type;
    String parentID;

    public RegistrationObject(String regObject, RegistrationObjectType type, String parentID) {
        this.regObject = regObject;
        this.type = type;
        this.parentID = parentID;
    }

    public String getRegObject() {
        return regObject;
    }

    public void setRegObject(String regObject) {
        this.regObject = regObject;
    }

    public RegistrationObjectType getType() {
        return type;
    }

    public void setType(RegistrationObjectType type) {
        this.type = type;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

}