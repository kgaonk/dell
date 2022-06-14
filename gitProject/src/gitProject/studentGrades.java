package gitProject;
/**
 * 
 * @author R/BCA-20-129
 *
 */
public class studentGrades {
 String name;
String address;
int datacommMarks, dbmsMarks, casetoolsMarks;
double avg;
/**
 * 
 * @param datacommMarks scored in data communication
 * @param dbmsMarks scored in dbms
 * @param casetoolsMarks scored in case tools
 */
 public studentGrades(int datacommMarks, int dbmsMarks, int casetoolsMarks)
{
this.datacommMarks = datacommMarks;
this.dbmsMarks = dbmsMarks;
this.casetoolsMarks = casetoolsMarks;
}
 /**
  * this is a function to display grades
  * @return to return the grades
  */
public char displayGrades() {
char grade;

//compute average
avg = (datacommMarks + dbmsMarks + casetoolsMarks)/3;

//compute grades
if (avg>=80)
grade = 'A';
else if (avg>=70 && avg<80)
grade = 'B';
else if (avg>=60 && avg<70)
grade = 'C';
else
grade = 'D';
//System.out.println("Grade is " + grade);

return grade;
}

/**
 * This is a main function
 * @param args String
 */


public static void main(String[] args) {
// TODO Auto-generated method stub
}
String getName() {
	return name;
}
void setName(String name) {
	this.name = name;
}
}


