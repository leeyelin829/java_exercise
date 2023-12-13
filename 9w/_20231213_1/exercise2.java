public class exercise2 {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();//Integer 타입 보관 Box
        i.set(new Integer(100));
        System.out.println(i.get());

        Box<String> s = new Box<>();//String 타입을 보관 Box
        s.set("만능이네!");
        System.out.println(s.get());
    }
}

class Box<T> {
    private T value;

    public void set(T value) {//값 설정 메서드
        this.value = value;
    }

    public T get() {//값 반환 메서드
        return value;
    }
}

