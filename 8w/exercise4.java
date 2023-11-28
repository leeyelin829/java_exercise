//소프트웨어학부 2023245065 이예린
class Hotel {
    private Room[] rooms;

    public Hotel() {//Hotel 생성자
        rooms = new Room[10];
        for (int i = 0; i < 10; i++) {
            rooms[i] = new Room(i + 1);
        }
    }

    public void add(int roomNumber, String guestName) {//객실 예약을 처리하는 add 메소드
        if (roomNumber < 1 || roomNumber > 10) {
            System.out.println("잘못된 객실 번호입니다.");
            return;
        }

        rooms[roomNumber - 1].reserve(guestName);
    }

    public void show() {//현재 예약 상황을 보여주는 show 메소드
        for (int i = 0; i < 10; i++) {
            rooms[i].displayReservation();
        }
    }

    private class Room {//객실을 나타내는 내부 클래스
        private int roomNumber;
        private String guestName;

        public Room(int roomNumber) {
            this.roomNumber = roomNumber;
        }//Room 생성자

        public void reserve(String guestName) {//객실 예약을 처리
            this.guestName = guestName;
            System.out.println(roomNumber + "번 방을 " + guestName + "가 예약했습니다.");
        }

        public void displayReservation() {//현재 예약 상황
            if (guestName != null) {
                System.out.println(roomNumber + "번 방은 현재 " + guestName + "에게 예약되어 있습니다.");
            }
        }
    }
}

class HotelTest {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();//Hotel 객체 생성
        hotel.add(5, "호돌이");//객실 예약
        hotel.add(7, "길동이");//객실 예약
        hotel.show();
    }
}

public class exercise4 {
    public static void main(String[] args) {
        HotelTest.main(args);
    }
}
