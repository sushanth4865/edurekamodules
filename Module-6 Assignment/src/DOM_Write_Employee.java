 
//package xml1;
import javax.xml.parsers.*;

import org.w3c.dom.*;

import java.io.*;

import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class DOM_Write_Employee 
{
public static void main(String args[])throws Exception
{
    DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
    DocumentBuilder b=f.newDocumentBuilder();
    Document doc=b.newDocument();
    
    Element rootele=doc.createElement("Employee");
 
    Element employeeele=doc.createElement("employee");
    Element idele=doc.createElement("id");
    Element nameele=doc.createElement("name");
    Element deptele=doc.createElement("Dept");
 
    Text t1=doc.createTextNode("01");
    Text t2=doc.createTextNode("Pranav");
    Text t3=doc.createTextNode("R&D");
    
    idele.appendChild(t1); 
    nameele.appendChild(t2);
    deptele.appendChild(t3);
 
    
    employeeele.appendChild(idele);
    employeeele.appendChild(nameele);
    employeeele.appendChild(deptele);
 
   
   rootele.appendChild(employeeele);
   doc.appendChild(rootele);
   Transformer t=TransformerFactory.newInstance().newTransformer();
   t.transform(new DOMSource(doc),new StreamResult(new FileOutputStream("c:/Data Files/employee.xml")));
   System.out.println("XML file generated..");
    
}
}
