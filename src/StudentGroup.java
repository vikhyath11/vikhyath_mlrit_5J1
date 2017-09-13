import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
			
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		int i;
		Student[0]=1;
		Student[1]=4;
		Student[2]=23;
		Student[3]=34;
		Student[4]=44;
	}

	@Override
	public Student getStudent(int index) {
		int element;
		element=Student[index];
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		int target;
		target=Student[index];
	}

	@Override
	public void addFirst(Student student) {
		
	}

	@Override
	public void addLast(Student student) {
		
	}

	@Override
	public void add(Student student, int index) {
		Student[index]=77;
	}

	@Override
	public void remove(int index) {
		Student[index]=0;
	}

	@Override
	public void remove(Student student) {
		Student[index]=0;
	}

	@Override
	public void removeFromIndex(int index) {
		Student[index]=0;
	}

	@Override
	public void removeFromElement(Student student) {
		
	}

	@Override
	public void removeToIndex(int index) {
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
