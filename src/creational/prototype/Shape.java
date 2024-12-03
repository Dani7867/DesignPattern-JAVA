package creational.prototype;

public interface Shape extends Cloneable{
	Shape clone();
	void draw();
	void setPosition(int x, int y);
    void setSize(int size);
}
