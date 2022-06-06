package JAVA_JUNG_SEOK.CH07_02;

class shape{
    String color = "black";
    void draw(){
        System.out.printf("[color=%s]\n",color);
    }
}

class Point{
    int x ;
    int y ;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){//아무것도 없이 생성자 생성시 Point(int x, int y)를 호출해서 x=0 y=0을 넣어서 초기화 시킨다
        this(0, 0);
    }

    String getXY(){
        return "("+x+","+y+")";
    }
}

class Circle extends shape{//★★★★ 상속관계 Circle은 모양이다 Circle is a shape [O]
    Point center;//원의 원점좌표?? 이게 된다고?? ★★★★포함관계 Circle은 점(point)를 가지고 있다 [O]   Circle has a point
    int r;

    Circle(){
        this(new Point(0,0), 100);
    }

    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    void draw(){
        System.out.printf("[center = (%d,%d), r=%d color=%s]\n",center.x, center.y,r,color);
    }

}

class Triangle extends shape{
    Point[] p = new Point[3];

    Triangle(Point[] p){
        this.p = p;
    }

    void draw(){
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}




class DrawShape {
    public static void main(String[] args) {
        Point[] p = { new Point(100,100), new Point(140, 50), new Point(200, 100)  };//포인트 생성

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150,150), 50);

        t.draw();
        c.draw();

    }
}
