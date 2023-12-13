public class exercise5 {
    public static void main(String[] args) {
        EnglishScore[] englishScores = {//영어 점수 배열
                new EnglishScore("김삿갓", 77),
                new EnglishScore("장영실", 88),
                new EnglishScore("홍길동", 99)
        };

        MathScore[] mathScores = {//수학 점수 배열
                new MathScore("김삿갓", 80),
                new MathScore("장영실", 98),
                new MathScore("홍길동", 70)
        };
        //최고 점수 출력
        System.out.println("영어 최고 점수: " + findBest(englishScores));
        System.out.println("수학 최고 점수: " + findBest(mathScores));
    }

    static <T extends Comparable<T>> String findBest(T[] scores) {//제네릭 메소드로 최고 점수를 찾는 메소드
        if (scores == null || scores.length == 0) {
            return null;
        }

        T bestScore = scores[0];//초기에 최고 점수를 배열의 첫 번째 원소로 설정

        for (T score : scores) {//배열을 순회하면서 최고 점수를 찾음
            if (score.compareTo(bestScore) > 0) {
                bestScore = score;
            }
        }

        if (bestScore instanceof EnglishScore) {//학생의 이름과 최고 점수 반환
            return formatOutput((EnglishScore) bestScore);
        } else if (bestScore instanceof MathScore) {
            return formatOutput((MathScore) bestScore);
        } else {
            return null;
        }
    }

    static String formatOutput(EnglishScore EnglishScore) {//EnglishScore 객체를 문자열로 포맷팅하여 반환하는 메소드
        return EnglishScore.getName() + ", " + EnglishScore.getScore();
    }

    static String formatOutput(MathScore MathScore) {//MathScore 객체를 문자열로 포맷팅하여 반환하는 메소드
        return MathScore.getName() + ", " + MathScore.getScore();
    }
}

class EnglishScore1 implements Comparable<EnglishScore> {//영어 점수 클래스
    private String name;
    private int score;

    public EnglishScore1(String name, int score) {//생성자
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(EnglishScore other) {//Comparable 인터페이스의 compareTo 메소드 구현
        return Integer.compare(this.score, other.score);
    }

    public String getName() {//이름 반환
        return name;
    }

    public int getScore() {//점수 반환
        return score;
    }
}

class MathScore implements Comparable<MathScore> {//수학 점수 클래스
    private String name;
    private int score;

    public MathScore(String name, int score) {//생성자
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(MathScore other) {//Comparable 인터페이스 compareTo 메소드 구현
        return Integer.compare(this.score, other.score);
    }

    public String getName() {//이름 반환
        return name;
    }

    public int getScore() {//점수 반환
        return score;
    }
}
