//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.10.29 at 11:58:36 PM ALMT 
//


package com.example.demo.generatedFiles;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sha" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sha"
})
@XmlRootElement(name = "storeDocumentResponse")
public class StoreDocumentResponse {

    @XmlElement(required = true)
    protected String sha;

    /**
     * Gets the value of the sha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSha() {
        return sha;
    }

    /**
     * Sets the value of the sha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSha(String value) {
        this.sha = value;
    }

}
