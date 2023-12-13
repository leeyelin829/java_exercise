public class exercise4 {
    public static void main(String[] args) {
        EnglishScore[] scores = {//영어 성적을 나타내는 객체 배열 생성
                new EnglishScore("Alice", 90),
                new EnglishScore("Bob", 85),
                new EnglishScore("Charlie", 95),
        };

        EnglishScore highestScoreStudent = findHighestScoreStudent(scores);//최고 점수를 가진 학생 찾기

        System.out.println("최고 점수를 가진 학생: " + highestScoreStudent);//결과
    }

    private static EnglishScore findHighestScoreStudent(EnglishScore[] scores) {//최고 점수를 가진 학생을 찾는 메서드
        if (scores == null || scores.length == 0) {
            return null;
        }

        EnglishScore highestScoreStudent = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i].getScore() > highestScoreStudent.getScore()) {
                highestScoreStudent = scores[i];
            }
        }

        return highestScoreStudent;
    }
}
