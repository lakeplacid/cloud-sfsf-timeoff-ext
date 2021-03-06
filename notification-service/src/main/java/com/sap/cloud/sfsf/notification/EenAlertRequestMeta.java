/**
 * Copyright 2016 SAP SE
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.09.26 at 11:44:06 AM EEST
//


package com.sap.cloud.sfsf.notification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eenAlertRequestMeta complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="eenAlertRequestMeta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="externalEventId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="publishedAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="publishedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="effective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="repost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eenAlertRequestMeta", propOrder = {
    "externalEventId",
    "type",
    "publishedAt",
    "publishedBy",
    "effective",
    "repost"
})
public class EenAlertRequestMeta {

    protected String externalEventId;
    protected String type;
    protected String publishedAt;
    protected String publishedBy;
    protected String effective;
    protected Boolean repost;

    /**
     * Gets the value of the externalEventId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExternalEventId() {
        return externalEventId;
    }

    /**
     * Sets the value of the externalEventId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExternalEventId(final String value) {
        externalEventId = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setType(final String value) {
        type = value;
    }

    /**
     * Gets the value of the publishedAt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPublishedAt() {
        return publishedAt;
    }

    /**
     * Sets the value of the publishedAt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPublishedAt(final String value) {
        publishedAt = value;
    }

    /**
     * Gets the value of the publishedBy property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPublishedBy() {
        return publishedBy;
    }

    /**
     * Sets the value of the publishedBy property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPublishedBy(final String value) {
        publishedBy = value;
    }

    /**
     * Gets the value of the effective property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEffective() {
        return effective;
    }

    /**
     * Sets the value of the effective property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEffective(final String value) {
        effective = value;
    }

    /**
     * Gets the value of the repost property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isRepost() {
        return repost;
    }

    /**
     * Sets the value of the repost property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setRepost(final Boolean value) {
        repost = value;
    }

}
