//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.20 at 09:44:32 AM CST 
//


package com.mastercard.api.fraud.merchantscoring.v1.scorelookup.domain;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RequestTimestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TransactionDetail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="MerchantIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="AccountPrefix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="AccountSuffix" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="TransactionTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="BankNetReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Stan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ScoreResponse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MatchIndicator" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="FraudScore" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RulesAdjustedScore" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="RulesAdjustedReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="RulesAdjustedReasonCodeSecondary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerIdentifier",
    "requestTimestamp",
    "transactionDetail",
    "scoreResponse"
})
@XmlRootElement(name = "ScoreLookup")
public class ScoreLookup {

    @XmlElement(name = "CustomerIdentifier", required = true)
    protected String customerIdentifier;
    @XmlElement(name = "RequestTimestamp", required = true)
    protected String requestTimestamp;
    @XmlElement(name = "TransactionDetail", required = true)
    protected TransactionDetail transactionDetail;
    @XmlElement(name = "ScoreResponse", required = true)
    protected ScoreResponse scoreResponse;

    /**
     * Gets the value of the customerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIdentifier() {
        return customerIdentifier;
    }

    /**
     * Sets the value of the customerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIdentifier(String value) {
        this.customerIdentifier = value;
    }

    /**
     * Gets the value of the requestTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Sets the value of the requestTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTimestamp(String value) {
        this.requestTimestamp = value;
    }

    /**
     * Gets the value of the transactionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.fraud.merchantscoring.v1.scorelookup.domain.ScoreLookup.TransactionDetail }
     *     
     */
    public TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.fraud.merchantscoring.v1.scorelookup.domain.ScoreLookup.TransactionDetail }
     *     
     */
    public void setTransactionDetail(TransactionDetail value) {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the scoreResponse property.
     * 
     * @return
     *     possible object is
     *     {@link com.mastercard.api.fraud.merchantscoring.v1.scorelookup.domain.ScoreLookup.ScoreResponse }
     *     
     */
    public ScoreResponse getScoreResponse() {
        return scoreResponse;
    }

    /**
     * Sets the value of the scoreResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.mastercard.api.fraud.merchantscoring.v1.scorelookup.domain.ScoreLookup.ScoreResponse }
     *     
     */
    public void setScoreResponse(ScoreResponse value) {
        this.scoreResponse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MatchIndicator" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="FraudScore" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RulesAdjustedScore" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="RulesAdjustedReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="RulesAdjustedReasonCodeSecondary" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "matchIndicator",
        "fraudScore",
        "reasonCode",
        "rulesAdjustedScore",
        "rulesAdjustedReasonCode",
        "rulesAdjustedReasonCodeSecondary"
    })
    public static class ScoreResponse {

        @XmlElement(name = "MatchIndicator")
        protected short matchIndicator;
        @XmlElement(name = "FraudScore")
        protected short fraudScore;
        @XmlElement(name = "ReasonCode", required = true)
        protected String reasonCode;
        @XmlElement(name = "RulesAdjustedScore")
        protected short rulesAdjustedScore;
        @XmlElement(name = "RulesAdjustedReasonCode", required = true)
        protected String rulesAdjustedReasonCode;
        @XmlElement(name = "RulesAdjustedReasonCodeSecondary", required = true)
        protected String rulesAdjustedReasonCodeSecondary;

        /**
         * Gets the value of the matchIndicator property.
         * 
         */
        public short getMatchIndicator() {
            return matchIndicator;
        }

        /**
         * Sets the value of the matchIndicator property.
         * 
         */
        public void setMatchIndicator(short value) {
            this.matchIndicator = value;
        }

        /**
         * Gets the value of the fraudScore property.
         * 
         */
        public short getFraudScore() {
            return fraudScore;
        }

        /**
         * Sets the value of the fraudScore property.
         * 
         */
        public void setFraudScore(short value) {
            this.fraudScore = value;
        }

        /**
         * Gets the value of the reasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonCode() {
            return reasonCode;
        }

        /**
         * Sets the value of the reasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonCode(String value) {
            this.reasonCode = value;
        }

        /**
         * Gets the value of the rulesAdjustedScore property.
         * 
         */
        public short getRulesAdjustedScore() {
            return rulesAdjustedScore;
        }

        /**
         * Sets the value of the rulesAdjustedScore property.
         * 
         */
        public void setRulesAdjustedScore(short value) {
            this.rulesAdjustedScore = value;
        }

        /**
         * Gets the value of the rulesAdjustedReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRulesAdjustedReasonCode() {
            return rulesAdjustedReasonCode;
        }

        /**
         * Sets the value of the rulesAdjustedReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRulesAdjustedReasonCode(String value) {
            this.rulesAdjustedReasonCode = value;
        }

        /**
         * Gets the value of the rulesAdjustedReasonCodeSecondary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRulesAdjustedReasonCodeSecondary() {
            return rulesAdjustedReasonCodeSecondary;
        }

        /**
         * Sets the value of the rulesAdjustedReasonCodeSecondary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRulesAdjustedReasonCodeSecondary(String value) {
            this.rulesAdjustedReasonCodeSecondary = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CustomerIdentifier" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="MerchantIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="AccountPrefix" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="AccountSuffix" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="TransactionAmount" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="TransactionTime" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="BankNetReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Stan" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customerIdentifier",
        "merchantIdentifier",
        "accountNumber",
        "accountPrefix",
        "accountSuffix",
        "transactionAmount",
        "transactionDate",
        "transactionTime",
        "bankNetReferenceNumber",
        "stan"
    })
    public static class TransactionDetail {

        @XmlElement(name = "CustomerIdentifier")
        protected long customerIdentifier;
        @XmlElement(name = "MerchantIdentifier", required = true)
        protected BigInteger merchantIdentifier;
        @XmlElement(name = "AccountNumber")
        protected long accountNumber;
        @XmlElement(name = "AccountPrefix")
        protected int accountPrefix;
        @XmlElement(name = "AccountSuffix")
        protected short accountSuffix;
        @XmlElement(name = "TransactionAmount")
        protected long transactionAmount;
        @XmlElement(name = "TransactionDate")
        protected short transactionDate;
        @XmlElement(name = "TransactionTime")
        protected String transactionTime;
        @XmlElement(name = "BankNetReferenceNumber", required = true)
        protected String bankNetReferenceNumber;
        @XmlElement(name = "Stan")
        protected int stan;

        /**
         * Gets the value of the customerIdentifier property.
         * 
         */
        public long getCustomerIdentifier() {
            return customerIdentifier;
        }

        /**
         * Sets the value of the customerIdentifier property.
         * 
         */
        public void setCustomerIdentifier(long value) {
            this.customerIdentifier = value;
        }

        /**
         * Gets the value of the merchantIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigInteger }
         *     
         */
        public BigInteger getMerchantIdentifier() {
            return merchantIdentifier;
        }

        /**
         * Sets the value of the merchantIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigInteger }
         *     
         */
        public void setMerchantIdentifier(BigInteger value) {
            this.merchantIdentifier = value;
        }

        /**
         * Gets the value of the accountNumber property.
         * 
         */
        public long getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         * 
         */
        public void setAccountNumber(long value) {
            this.accountNumber = value;
        }

        /**
         * Gets the value of the accountPrefix property.
         * 
         */
        public int getAccountPrefix() {
            return accountPrefix;
        }

        /**
         * Sets the value of the accountPrefix property.
         * 
         */
        public void setAccountPrefix(int value) {
            this.accountPrefix = value;
        }

        /**
         * Gets the value of the accountSuffix property.
         * 
         */
        public short getAccountSuffix() {
            return accountSuffix;
        }

        /**
         * Sets the value of the accountSuffix property.
         * 
         */
        public void setAccountSuffix(short value) {
            this.accountSuffix = value;
        }

        /**
         * Gets the value of the transactionAmount property.
         * 
         */
        public long getTransactionAmount() {
            return transactionAmount;
        }

        /**
         * Sets the value of the transactionAmount property.
         * 
         */
        public void setTransactionAmount(long value) {
            this.transactionAmount = value;
        }

        /**
         * Gets the value of the transactionDate property.
         * 
         */
        public short getTransactionDate() {
            return transactionDate;
        }

        /**
         * Sets the value of the transactionDate property.
         * 
         */
        public void setTransactionDate(short value) {
            this.transactionDate = value;
        }

        /**
         * Gets the value of the transactionTime property.
         * 
         */
        public String getTransactionTime() {
            return transactionTime;
        }

        /**
         * Sets the value of the transactionTime property.
         * 
         */
        public void setTransactionTime(String value) {
            this.transactionTime = value;
        }

        /**
         * Gets the value of the bankNetReferenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankNetReferenceNumber() {
            return bankNetReferenceNumber;
        }

        /**
         * Sets the value of the bankNetReferenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankNetReferenceNumber(String value) {
            this.bankNetReferenceNumber = value;
        }

        /**
         * Gets the value of the stan property.
         * 
         */
        public int getStan() {
            return stan;
        }

        /**
         * Sets the value of the stan property.
         * 
         */
        public void setStan(int value) {
            this.stan = value;
        }

    }

}
