import java.util.Arrays;
public class exercise4_2 {
    public static void main(String[] args) {
        EnglishScore[] scores = {//영어 성적을 나타내는 객체 배열 생성
                new EnglishScore("Alice", 90),
                new EnglishScore("Bob", 85),
                new EnglishScore("Charlie", 95),
        };

        Arrays.sort(scores);//배열을 정렬하여 최고 점수를 가진 학생 찾기
        System.out.println("최고 점수를 가진 학생: " + scores[scores.length - 1]);// 결과 출력
    }
}
