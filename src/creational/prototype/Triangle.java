package creational.prototype;

class Triangle implements Shape {
    private int x, y, base, height;

    public Triangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    public Triangle clone() {
        return new Triangle(x, y, base, height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle at (" + x + ", " + y + ") with base " + base + " and height " + height);
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setSize(int size) {
        this.base = size;
        this.height = size;
    }
}

