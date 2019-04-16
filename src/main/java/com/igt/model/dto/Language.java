
package com.igt.model.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Language.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Language">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dutch"/>
 *     &lt;enumeration value="french"/>
 *     &lt;enumeration value="german"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Language", namespace = "http://schemas.lonalo.local/BizTalk/2015/services/notification/")
@XmlEnum
public enum Language {

    @XmlEnumValue("dutch")
    DUTCH("dutch"),
    @XmlEnumValue("french")
    FRENCH("french"),
    @XmlEnumValue("german")
    GERMAN("german"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    Language(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Language fromValue(String v) {
        for (Language c: Language.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
