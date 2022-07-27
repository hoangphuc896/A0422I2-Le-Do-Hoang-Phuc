package ss6inheritance.exercise.point;

public class Point2d {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point2d() {

    }

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] arr= new float[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }

    @Override
    public String toString() {
        return "point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}