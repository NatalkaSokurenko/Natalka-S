package task2;

public class Rectangle extends Figure{
    private float height;
    private float width;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if(height>=0){
        this.height = height;
        }
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float square(){
        return height * width;
    }
}
