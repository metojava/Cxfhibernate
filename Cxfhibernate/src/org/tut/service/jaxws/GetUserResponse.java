
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

@XmlRootElement(name = "getUserResponse", namespace = "http://service.tut.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserResponse", namespace = "http://service.tut.org/")

public class GetUserResponse {

    @XmlElement(name = "return")
    private org.tut.model.User _return;

    public org.tut.model.User getReturn() {
        return this._return;
    }

    public void setReturn(org.tut.model.User new_return)  {
        this._return = new_return;
    }

}

