/**
 * Created by shafai on 2017-03-28.
 */
public class Person {

        // the person’s name and year of birth
        private String    name;
        private int       birthYear;

        public Person (String name, int birthYear)
        {
            this.name = name;
            this.birthYear = birthYear;
        }

        public String toString ()
        {
            return  "<"  + this.name +  ", " + this.birthYear + ">";
        }

        public int age ()
        {
            java.time.LocalDate    currentDate = java.time.LocalDate.now ();
            int    currentYear = currentDate.getYear ();

            return  currentYear - birthYear;
        }

        public static double averAge(Person[] persons){
            int sum = persons[0].age();
            for(int i = 1; i < persons.length; i++){
               sum  += persons[i].age();
            }
            double avg = (double)sum / persons.length;
            return avg;
        }

        public static Person youngestPerson(Person[] persons){
            Person youngestPerson = persons[0];
            for(int i = 1; i < persons.length; i++){
                if(persons[i].age() < youngestPerson.age())
                    youngestPerson = persons[i];
            }
            return youngestPerson;
        }



        public static void main(String[] args){
            Person[] persons = {
                    new Person("Adam",1986),
                    new Person("Adila",1986),
                    new Person("Lovisa",2012),
                    new Person("Latifa",1996),
                    new Person("Abdulla",1991),
                    new Person("Khatima",1966),
                    };
        double AverageAge = averAge(persons);
        Person youngest = youngestPerson(persons);

        System.out.println("The yougest person is : " +youngest +"\nThe average age is "+ AverageAge );
        }
    }

