/*
 This Java source file was generated by test-to-java.xsl
 and is a derived work from the source document.
 The source document contained the following notice:



 Copyright (c) 2001-2004 World Wide Web Consortium,
 (Massachusetts Institute of Technology, Institut National de
 Recherche en Informatique et en Automatique, Keio University).  All
 Rights Reserved.  This program is distributed under the W3C's Software
 Intellectual Property License.  This program is distributed in the
 hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 PURPOSE.

 See W3C License http://www.w3.org/Consortium/Legal/ for more details.


 */

package tests.org.w3c.dom;

import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Attr;

import javax.xml.parsers.DocumentBuilder;

/**
 * The "getAttributeNodeNS(namespaceURI,localName)" method retrieves an
 * attribute node by local name and NamespaceURI.
 *
 * Retrieve the first emp:address element node. The getAttributeNodeNS method
 * returns an Attr node, the "value" can be examined to ensure the proper
 * attribute node was retrieved. This attribute value should be null since there
 * is no such attribute.
 *
 * @author NIST
 * @author Mary Brady
 * @see <a
 *      href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-ElGetAtNodeNS">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-ElGetAtNodeNS</a>
 */
public final class GetAttributeNodeNS extends DOMTestCase {

    DOMDocumentBuilderFactory factory;

    DocumentBuilder builder;

    protected void setUp() throws Exception {
        super.setUp();
        try {
            factory = new DOMDocumentBuilderFactory(DOMDocumentBuilderFactory
                    .getConfiguration2());
            builder = factory.getBuilder();
        } catch (Exception e) {
            fail("Unexpected exception" + e.getMessage());
        }
    }

    protected void tearDown() throws Exception {
        factory = null;
        builder = null;
        super.tearDown();
    }

    /**
     * Runs the test case.
     *
     * @throws Throwable
     *             Any uncaught exception causes test to fail
     */
    public void testGetAttributeNodeNS1() throws Throwable {
        String namespaceURI = "http://www.nist.gov";
        String localName = "invalidlocalname";
        Document doc;
        NodeList elementList;
        Element testAddr;
        Attr attribute;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("emp:address");
        testAddr = (Element) elementList.item(0);
        assertNotNull("empAddrNotNull", testAddr);
        attribute = testAddr.getAttributeNodeNS(namespaceURI, localName);
        assertNull("throw_Null", attribute);
    }
    public void testGetAttributeNodeNS2() throws Throwable {
        Document doc;
        NodeList elementList;
        Element testAddr;
        Attr attribute;
        String attrName;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("emp:address");
        testAddr = (Element) elementList.item(0);
        assertNotNull("empAddrNotNull", testAddr);
        attribute = testAddr.getAttributeNodeNS("http://www.nist.gov",
                "domestic");
        attrName = attribute.getNodeName();
        assertEquals("attrName", "emp:domestic", attrName);
    }
}