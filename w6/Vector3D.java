package w6;

public class Vector3D {
	private double x;
	private double y;
	private double z;
	
	public Vector3D(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public double getR(){
		return Math.sqrt(x*x+y*y+z*z);
	}
	public double getTheta(){
		return Math.acos(z/getR());
	}
	public double getPhi(){
		return Math.atan2(y,x);
	}
	public static Vector3D add(Vector3D lhs, Vector3D rhs){
		return new Vector3D(lhs.getR()*Math.sin(lhs.getTheta())*Math.cos(lhs.getPhi())+rhs.getR()*Math.sin(rhs.getTheta())*Math.cos(rhs.getPhi()),
							lhs.getR()*Math.sin(lhs.getTheta())*Math.sin(lhs.getPhi())+rhs.getR()*Math.sin(rhs.getTheta())*Math.sin(rhs.getPhi()),
							lhs.getR()*Math.cos(lhs.getTheta())+rhs.getR()*Math.cos(rhs.getTheta()));
	}
	public static Vector3D subtract(Vector3D lhs, Vector3D rhs){
		return new Vector3D(lhs.getR()*Math.sin(lhs.getTheta())*Math.cos(lhs.getPhi())-rhs.getR()*Math.sin(rhs.getTheta())*Math.cos(rhs.getPhi()),
							lhs.getR()*Math.sin(lhs.getTheta())*Math.sin(lhs.getPhi())-rhs.getR()*Math.sin(rhs.getTheta())*Math.sin(rhs.getPhi()),
							lhs.getR()*Math.cos(lhs.getTheta())-rhs.getR()*Math.cos(rhs.getTheta()));	
	}
	public static Vector3D scale( Vector3D v, double scaleFactor){
		return new Vector3D((v.getR()*Math.sin(v.getTheta())*Math.cos(v.getPhi()))*scaleFactor,
							(v.getR()*Math.sin(v.getTheta())*Math.sin(v.getPhi()))*scaleFactor,
							(v.getR()*Math.cos(v.getTheta())*scaleFactor));
	}
}
