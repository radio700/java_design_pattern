package JAVA_JUNG_SEOK.CH06.CH06_30;

class Document{

    static int count = 0;
    String name;

    Document(){
        this("Noname"+ ++count);//이 줄은 Document(String name)을 호출하는거다(생성자에서 생성자를 호출하는 것)
    }

    Document(String name){
        this.name = name;
        System.out.println("한글파일 "+ this.name +"가 생성 됐습니다");
    }

}


public class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();//문서 1생성 (제목없이)
        Document d2 = new Document("자바.txt");//문서 2생성(제목적음)
        Document d3 = new Document();//문서 3생성 (제목 없이)
    }
}
