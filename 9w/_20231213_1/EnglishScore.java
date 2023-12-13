public class EnglishScore implements Comparable<EnglishScore> {
    private String name;
    int score;

    public EnglishScore(String name, int score) {//생성자
        this.name = name;
        this.score = score;
    }

    @Override//toString 메서드 재정의
    public String toString() {
        return "이름: " + name + ", 점수: " + score;
    }

    @Override//Comparable 인터페이스의 compareTo 메서드 구현
    public int compareTo(EnglishScore other) {
        // 점수를 기준으로 비교
        return Integer.compare(this.score, other.getScore());
    }

    public int getScore() {//점수 반환 메서드
        return score;
    }

    public String getName() {//이름 반환 메서드
        return name;
    }
}