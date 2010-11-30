package me.mailee;

import java.io.IOException;
import java.util.Date;

import org.json.JSONException;
import org.json.JSONObject;
import org.restlet.Client;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.MediaType;
import org.restlet.data.Method;
import org.restlet.data.Preference;
import org.restlet.ext.json.JsonRepresentation;

import org.jactiveresource.*;

public class Contact extends ActiveResource {
    private String id;
    private String name;
    private Date birthdate;
    private Date createdOn;
    private Date updatedOn;

    public String getId() {
        return id;
    }

    public void setId( String id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate( Date birthdate ) {
        this.birthdate = birthdate;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn( Date createdOn ) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn( Date updatedOn ) {
        this.updatedOn = updatedOn;
    }
}
