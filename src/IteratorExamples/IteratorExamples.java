package IteratorExamples;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorExamples {

	public static void main(String[] args) {
			LinkedList<String> names=new LinkedList<String>();					//Φτιάχνει μια λίστα με όνομα names και βάζει μέσα τα ονόματα Mike,Eirhnh,Danai,Sofia
			names.push("Mike");													
			names.push("Eirhnh");
			names.push("Danai");
			names.push("Sofia");
			
			
			ListIterator<String> it= names.listIterator(); 						//Φτιάχνει ενα Iterator τύπου String και το χρτησιμοποιεί στη λίστα names
			it.next();										//Πάει τον κέρσορα ενα βήμα κάτω. Αν υπολογίσουμε οτι ειναι LIFO περνάει το Sofia 		
			//it.next();										//Πάει τον κέρσορα ενα βήμα κάτω. Αν υπολογίσουμε οτι ειναι LIFO περνάει το Danai 	
			it.add("Giai");										//Προσθέτει ενα ονομά Giai μετα το Danai. To ListIterator.add(),  ειναι αντίστοιχο LinkedList.push();  
			
			
			for(String s: names) {									//For. Συντόμευση. Σημαίνει για όσο ειναι το μήκος του names, εκτύπωσε μου τα s, οπου s η τιμή κάθε κελιού του πίνακα 
				System.out.println(s);
			}

			}

}

/*----------------------------------!!!!!!οι Iterators έχουν αυτες τις 3 μεθόδους!!!!!! --------------------------------------------------------------
		1. hasNext(): 
			Returns true if the iteration has more elements.             
			public boolean hasNext();
		2. next(): 
			Returns the next element in the iteration. It throws NoSuchElementException if no more element is present.      
			public Object next();
		3. remove():
			Removes the next element in the iteration. This method can be called only once per call to next().
			public void remove();

-----------------------------------------------------------------------------------------------------------------------------------------------*/


