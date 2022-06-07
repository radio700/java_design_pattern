package JAVA_JUNG_SEOK.CH07.CH07_07;

class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D(1, 2, 3);
    }
}

class Point{
    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    String getLoc(){
        return "x : "+ x +", y : "+y;
    }
}

class Point3D extends Point{
    
    Point3D(int x, int y, int z){
        super(x, y);// 조상클래스에 생성자가 있어서 상속을 받는다면 자손클래스에는 super라고 명시해야 한다
        this.x = x;
    }

}
