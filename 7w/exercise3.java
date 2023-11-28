//2023245065 소프트웨어학부 이예린
import java.util.Arrays;

class Book implements Comparable<Book> {// Book 클래스 정의 (Comparable 인터페이스 구현)
    private int price;

    public Book(int price) {//생성자
        this.price = price;
    }

    public int getPrice() {//Getter 메소드
        return price;
    }

    @Override
    public int compareTo(Book other) {//Comparable 인터페이스의 compareTo 메소드 구현
        return Integer.compare(this.price, other.price);//가격을 기준으로 오름차순 정렬
    }

    @Override
    public String toString() {
        return "Book [price=" + price + "]";
    }
}

class BookTest {//테스트
    public static void main(String[] args) {
        Book[] books = {//Book 객체 배열 생성
                new Book(15000),
                new Book(50000),
                new Book(20000)
        };

        System.out.println("정렬 전\n");
        for (Book book : books) {
            System.out.println(book);//정렬 전 출력
        }

        Arrays.sort(books);//가격을 기준으로 배열 정렬

        System.out.println("----------------------");//정렬 전과 정렬 후를 나눠주기 위한 선

        System.out.println("\n정렬 후\n");
        for (Book book : books) {
            System.out.println(book);//정렬 후 출력
        }
    }
}
public class exercise3 {
    public static void main(String[] args) {
        BookTest.main(args);
    }
}
