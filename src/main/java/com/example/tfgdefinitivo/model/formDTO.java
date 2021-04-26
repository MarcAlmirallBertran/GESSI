package com.example.tfgdefinitivo.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "formDTO")
public class formDTO implements Serializable {
    private String path;
    private int dlNum;

    public formDTO(String path, int dl) {
        this.path = path;
        this.dlNum = dl;
    }
    public formDTO() { }

    public String getPath() { return path; }

    @XmlElement
    public void setPath(String path) {
        this.path = path;
    }

    public int getDl() {
        return dlNum;
    }

    @XmlElement
    public void setDl(int dl) {
        this.dlNum = dl;
    }
}