import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import com.pojo.Person;
import com.impl.PersonIoImpl;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		PersonIoImpl personimpl = new PersonIoImpl();
		List<Person> persons= personimpl.getPersons();

		int choice, id;
		try {
			do{
				System.out.println("\n1. find by id\n2. Remove Person\n3. update name\n4. Add Person\n5. display all\nEnter Your Choice:");
				choice=Integer.parseInt(reader.readLine());
				
				switch(choice)
				{
					case 1: System.out.println("Enter id to find person : ");
							id=Integer.parseInt(reader.readLine());
							Person p= personimpl.findById(id, persons);
							if(p!=null)
								System.out.println(p.getpId()+ "\t"+p.getpName());
							break;
					case 2:System.out.println("Enter id to remove person : ");
							id=Integer.parseInt(reader.readLine());
							boolean b=personimpl.removePerson(id, persons);
							if(b)
								System.out.println("Person removed");
							break;
					case 3:System.out.println("Enter id to update name of a  person : ");
							id=Integer.parseInt(reader.readLine());
							System.out.println("Enter new name : ");
							String newName=reader.readLine();
							Person per=personimpl.updatePerson(persons, id, newName);
							if(per!=null)
								System.out.println(per.getpId()+ "\t"+per.getpName());
							break;
					case 4 :  System.out.println("Enter id to add person : ");
							id=Integer.parseInt(reader.readLine());
							System.out.println("Enter name : ");
							String name=reader.readLine();
							persons=personimpl.addPerson(persons, new Person(id,name));
							System.out.println("Person added");
							break;
					case 5: System.out.println("\n*********Display**********\n");
							personimpl.displayPersons(persons);
							break;
					case 0:System.out.println("End...");
							break;
					default: break;
					
				}

			
			}while(choice!=0);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
	}

}
