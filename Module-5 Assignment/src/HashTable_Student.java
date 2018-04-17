import java.util.Enumeration;
import java.util.Hashtable;


public class HashTable_Student {

	public static void main(String[] args) {
		 student s1 = new student(1, "Divya deep", 98);
		 student s2 = new student(2, "Arun", 65);
		 student s3 = new student(3, "Rohit devgun", 99);
		 student s4 = new student(4, "Balaji", 65);
		 student s5 = new student(5, "Varun sandesh", 80);
		 
		 Hashtable <Integer, student> ht = new Hashtable <Integer, student>();
		 ht.put(1, s1);
		 ht.put(2, s2);
		 ht.put(3, s3);
		 ht.put(4, s4);
		 ht.put(5, s5);
		 
		Enumeration names = ht.keys();
		int id, big=0, big_id=0;
			while(names.hasMoreElements()) 
			{
				id = (int) names.nextElement();
				
				student student = ht.get(id);
				if (big < student.marks)
				{
					big = student.marks;
					big_id = id;
				}			
				
			}
			
			//Display the largest student marks data...
			student student_marks = ht.get(big_id);
			System.out.println("Student id " + student_marks.id);
			System.out.println ("Name : "+student_marks.name);
			System.out.println("Marks : "+student_marks.marks );
	}

}
