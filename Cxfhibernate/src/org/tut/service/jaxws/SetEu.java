
package org.tut.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Sat Sep 03 21:29:08 PDT 2016
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "setEu", namespace = "http://service.tut.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setEu", namespace = "http://service.tut.org/")

public class SetEu {

    @XmlElement(name = "arg0")
    private org.tut.dao.UserUtil arg0;

    public org.tut.dao.UserUtil getArg0() {
        return this.arg0;
    }

    public void setArg0(org.tut.dao.UserUtil newArg0)  {
        this.arg0 = newArg0;
    }

}

