//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.13 at 09:45:43 AM CST 
//


package com.hpe.application.automation.tools.results.parser.nunit;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Message_QNAME = new QName("", "message");
    private final static QName _TestResults_QNAME = new QName("", "test-results");
    private final static QName _StackTrace_QNAME = new QName("", "stack-trace");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link FailureType }
     * 
     */
    public FailureType createFailureType() {
        return new FailureType();
    }

    /**
     * Create an instance of {@link TestSuiteType }
     * 
     */
    public TestSuiteType createTestSuiteType() {
        return new TestSuiteType();
    }

    /**
     * Create an instance of {@link ReasonType }
     * 
     */
    public ReasonType createReasonType() {
        return new ReasonType();
    }

    /**
     * Create an instance of {@link TestCaseType }
     * 
     */
    public TestCaseType createTestCaseType() {
        return new TestCaseType();
    }

    /**
     * Create an instance of {@link CategoriesType }
     * 
     */
    public CategoriesType createCategoriesType() {
        return new CategoriesType();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link ResultsType }
     * 
     */
    public ResultsType createResultsType() {
        return new ResultsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "test-results")
    public JAXBElement<ResultType> createTestResults(ResultType value) {
        return new JAXBElement<ResultType>(_TestResults_QNAME, ResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "stack-trace")
    public JAXBElement<String> createStackTrace(String value) {
        return new JAXBElement<String>(_StackTrace_QNAME, String.class, null, value);
    }

}
