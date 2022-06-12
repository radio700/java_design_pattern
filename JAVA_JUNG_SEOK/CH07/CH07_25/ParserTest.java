package JAVA_JUNG_SEOK.CH07.CH07_25;

interface Parseable{
    public abstract void parse (String fileName);
}

class ParserManager{
    public static Parseable getParser (String type){
        if (type.equals("XML")){
            return new XMLParser();//xml이 들어 오면 xmlparser 인스턴스를 생성한다!!!!!!!! 오 리턴으로 이게 가능하다고?
        }else{
            Parseable p = new HTMLParser();//위에꺼 하고 동일하다!
            return p;
        }
    }
}
//#region xml, html parser
class XMLParser implements Parseable{

    @Override
    public void parse(String fileName) {
        // TODO Auto-generated method stub
        System.out.println(fileName+"- XML parseing complete.");
    }
}

class HTMLParser implements Parseable{

    @Override
    public void parse(String fileName) {
        // TODO Auto-generated method stub
        System.out.println(fileName+"- HTML parseing complete.");
    }
}
//#endregion
public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");//위에 xml 타면 인스턴스 생성한다 이건 => new XMLParser(); 적혀 있지?
        parser.parse("document.xml");

        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
