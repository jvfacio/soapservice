
package com.hxw.soap.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.hxw.entity.Person;

@XmlRootElement(name = "createNewPerson", namespace = "http://service.soap.hxw.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createNewPerson", namespace = "http://service.soap.hxw.com/")
public class CreateNewPerson {

    @XmlElement(name = "arg0", namespace = "")
    private Person arg0;

    /**
     * 
     * @return
     *     returns Person
     */
    public Person getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Person arg0) {
        this.arg0 = arg0;
    }

}
