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
			it.next();															//Πάει τον κέρσορα ενα βήμα κάτω. Αν υπολογίσουμε οτι ειναι LIFO περνάει το Sofia 		
			//it.next();														//Πάει τον κέρσορα ενα βήμα κάτω. Αν υπολογίσουμε οτι ειναι LIFO περνάει το Danai 	
			it.add("Giai");														//Προσθέτει ενα ονομά Giai μετα το Danai. To ListIterator.add(),  ειναι αντίστοιχο LinkedList.push();  
			
			
			for(String s: names) {												//For. Συντόμευση. Σημαίνει για όσο ειναι το μήκος του names, εκτύπωσε μου τα s, οπου s η τιμή κάθε κελιού του πίνακα 
				System.out.println(s);
			}
			

	}

}
