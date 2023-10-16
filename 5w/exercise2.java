class Korean{//2023245065 소프트웨어학부 이예린
    String nation = "대한민국";//필드 선언
    String name;
    String id;
    public Korean(String n, String s){//생성자 선언
        name = n;
        id = s;
    }

}
class KoreanExample{
    public static void main(String[] args) {
        Korean k1 = new Korean("연세","011225-1234567");//k1 생성
        Korean k2 = new Korean("믿음","930525-0654321");//k2 생성
        System.out.print("이름:"+k1.name + ", ");
        System.out.println("id:"+k1.id);
        System.out.print("이름:"+k2.name + ", ");
        System.out.println("id:"+k2.id);
    }
}
public class exercise2 {
    public static void main(String[] args) {
        KoreanExample.main(args);//KoreanExample의 메인 메서드 호출
    }
}
