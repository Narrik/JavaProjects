package mock;
import java.util.ArrayList;
import java.util.HashMap;
public class Student extends Person{
	private ArrayList<Course> activeCourses = new ArrayList<Course>();
	private ArrayList<Course> completedCourses = new ArrayList<Course>();
	private int maxCourses;
	
	public int getMaxCourses() {
		return maxCourses;
	}
	
	public void setMaxCourses(int maxCourses) {
		this.maxCourses = maxCourses;
	}

	public Student(String firstName,String lastName,ArrayList<Course> activeCourses, ArrayList<Course> completedCourses, int maxCourses){
		super(firstName,lastName);
		this.activeCourses = activeCourses;
		this.completedCourses = completedCourses;
		this.maxCourses = maxCourses;
	}
	public boolean canEnroll(Course course){
		if (completedCourses.contains(course.getPrerequisiteCourses()) 
				&& !(activeCourses.contains(course)) 
				&& !(completedCourses.contains(course))
				&& (activeCourses.size()<maxCourses)){
			return true;
		}
			else return false;	
		}
	public boolean enroll(Course course){
		if (canEnroll(course)){
			activeCourses.add(course);
			return true;
		}
		else return false;
	}
	public boolean complete(String courseName){
		for (int i = 0;i<activeCourses.size();i++){
			if (activeCourses.get(i).getName().equals(courseName)){
					activeCourses.remove(activeCourses.get(i));
					completedCourses.add(activeCourses.get(i));
					return true;
				}
		}
		 return false;
		}
	public HashMap<Course,String> getAllCourses(){
		HashMap<Course,String> h1 = new HashMap<Course,String>();
		for (int i = 0;i<activeCourses.size();i++){
			h1.put(activeCourses.get(i),"active");
		}
		for (int i = 0;i<completedCourses.size();i++){
			h1.put(completedCourses.get(i),"completed");
		}	
		return h1;
		}
	public String summary(){
		String s2 = "";
		for (Course course:getAllCourses().keySet()){
			String s1 = (course.getName()+" ("+getAllCourses().get(course)+")\n");
			s2 = s2+s1;
		}
		return s2;
	}
	

}
