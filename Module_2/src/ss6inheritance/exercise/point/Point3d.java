package ss6inheritance.exercise.point;

public class Point3d extends Point2d {
    protected float z = 0.0f;

    public Point3d() {

    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z=z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z = z ;
    }
    public float[] getXYZ(){
        float[] arr = new float[3];
        arr[0]=x;
        arr[1]=y;
        arr[2]=z;
        return arr;
    }
    public void setXYZ(float x , float y , float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
}
