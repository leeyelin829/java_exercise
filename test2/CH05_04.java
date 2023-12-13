class TV {//2023245065 소프트웨어학부 이예린
    int channel;
    int volumeLevel;
    boolean on;

    public TV() {//기본 값
        channel = 27;
        volumeLevel = 5;
        on = false;
    }

    void turnOn() {//전원 끄기
        this.on = true;
    }

    void turnOff() {//전원 켜기
        this.on = false;
    }

    void setChannel(int num) {//채널 설정
        this.channel = num;
    }

    void channelUp() {
        channel += 1;//채널 올리기
        if (channel > 120) {
            channel = 1;
        }
    }

    void channelDown() {//채널 내리기
        channel -= 1;
        if (channel < 1) {
            channel = 120;
        }
    }

    void volumeUp() {//불륨 증가
        volumeLevel += 1;
        if (volumeLevel > 7) {
            volumeLevel = 7;
        }
    }

    void volumeDown() {
        volumeLevel -= 1;//불륨 감소
        if (volumeLevel < 0) {
            volumeLevel = 0;
        }
    }

    class CH05_04 {
        public static void main(String[] args) {
            TV T1 = new TV();//새로운 객체 선언
            System.out.println("채널:" + T1.channel);
            System.out.println("불륨:" + T1.volumeLevel);
            System.out.println("전원:" + T1.on);

            System.out.println(" ");

            T1.turnOn();//전원 켜기
            T1.setChannel(100);//채널 설정
            T1.volumeUp();//불륨 증가
            System.out.println("채널:" + T1.channel);
            System.out.println("불륨:" + T1.volumeLevel);
            System.out.println("전원:" + T1.on);

            System.out.println(" ");

            T1.turnOff();//전원 끄기
            T1.channelUp();//채널 올리기
            T1.volumeDown();//불륨 낮추기
            T1.volumeDown();//불륨 낮추기
            T1.volumeDown();//불륨 낮추기
            System.out.println("채널:" + T1.channel);
            System.out.println("불륨:" + T1.volumeLevel);
            System.out.println("전원:" + T1.on);
            System.out.println(" ");

            T1.channelDown();//채널 내리기
            System.out.println("채널:" + T1.channel);
            System.out.println("불륨:" + T1.volumeLevel);
            System.out.println("전원:" + T1.on);
        }
    }
}
