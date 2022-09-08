package fruitguy;

public class Block {
    int width;
    int length;
    int height;
    int volume;
    int surfaceArea;

    public Block(int[] dimension) {
        this.width = dimension[0];
        this.length = dimension[1];
        this.height = dimension[2];
        this.volume = width*height*length;
        this.surfaceArea = (width*length + width*height + length*height)*2;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume(){
        return volume;
    }
//    [width, length, height]
    public int getSurfaceArea(){
        return surfaceArea;
    }



}
