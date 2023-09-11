import java.util.Arrays;
import java.util.List;


public class Person201Farthest {
   public static void main(String[] args) throws Exception {
       String file = "data/large.txt";
       double max = 0;
       Person201 a = null;
       Person201 b = null;
       //Person201[] people = Person201Utilities.readFile(file);
       Person201[] peopleArray = Person201Utilities.readFile(file);
       List<Person201> people = Arrays.asList(peopleArray);
       for (int i = 0; i < people.size(); i++ ) {
           for (int j = i + 1; j < people.size(); j++) {
               double distance = people.get(i).distanceFrom(people.get(j));
               if (distance > max) {
                   max = distance;
                   a = people.get(i);
                   b = people.get(j);
               }
           }
       }


      System.out.printf("farthest distance is %3.2f between %s and %s\n",max,a.getName(),b.getName());
   }
}
