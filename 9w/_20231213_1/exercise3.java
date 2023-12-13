public class exercise3 {
    public static void main(String[] args) {
        Pair<Integer> p1 = new Pair<>(10, 20);
        Pair<Double> p2 = new Pair<>(10.0, 20.0);

        System.out.println(p1.first());
        System.out.println(p2.second());
    }
}

class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second){//생성자
        this.first = first;
        this.second = second;
    }

    public T first(){//첫 번째 필드 값 반환 메소드
        return first;
    }

    public T second(){//두 번째 필드 값 반환 메소드
        return second;
    }
}
