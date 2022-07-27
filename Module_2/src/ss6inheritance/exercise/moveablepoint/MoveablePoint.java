package ss6inheritance.exercise.moveablepoint;

public class MoveablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    public MoveablePoint(){

    }
    public MoveablePoint(float x,float y ,float xSpeed ,float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float arrspeed[]=new float[2];
        arrspeed[0]=xSpeed;
        arrspeed[1]=ySpeed;
        return arrspeed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MoveablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
