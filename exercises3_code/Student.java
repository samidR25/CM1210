public class Student {

   private static int nextAvailableNumber = 0;

   // Data members.
   private String forename;
   private String surname;
   private int number;
   private float averageMark;

   public Student(String inForename, String inSurname) {
	   number = nextAvailableNumber++;
	   forename = inForename;
	   surname = inSurname;
   }

   public String getForename() {
      return forename;
   }

   public String getSurname() {
      return surname;
   }

   public int getNumber() {
      return number;
   }

   public float getAverageMark() {
   public String toString() {
      String s = surname + ", " + forename + " (" + number + ")";
      s += ": mean = " + averageMark;
      return s;
   }
}