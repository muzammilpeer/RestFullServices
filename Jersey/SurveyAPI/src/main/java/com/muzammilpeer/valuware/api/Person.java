package com.muzammilpeer.valuware.api;

/**
 * Created by muzammilpeer on 05/07/15.
 */
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Arul Dhesiaseelan (aruld@acm.org)
 */
@XmlRootElement
public class Person {
    private String name;
    private String uid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}