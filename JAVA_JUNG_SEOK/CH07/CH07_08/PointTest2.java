package JAVA_JUNG_SEOK.CH07.CH07_08;

class PointTest2 {
    public static void main(String[] args) {
        Point3d p3 = new Point3d();
        System.out.println("p3.x="+p3.x);
        System.out.println("p3.y="+p3.y);
        System.out.println("p3.z="+p3.z);
    }
}

class Point{
    int x = 10;
    int y = 20;

    Point(int x, int y){
        //생성자 첫 줄에서 다른 생성자가 없기에 .super를 자동으로 삽입한다 (컴파일 할 때는)
        this.x = x;
        this.y = y;
    }
}

class Point3d extends Point{

    int z = 30;

    Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    Point3d(){
        this(100,200,300);
    }
}

