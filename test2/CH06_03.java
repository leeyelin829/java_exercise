// Employee 클래스 정의
class Employee {
    private String name;
    private String address;
    protected int salary; // protected로 선언

    private String rrn; // private로 선언

    // 생성자
    public Employee(String name, String address, int salary, String rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    // 접근자 및 설정자 메서드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Employee 정보 출력 메서드
    public void printEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
        System.out.println("RRN: " + rrn);
    }
}

// Manager 클래스 정의 (Employee 클래스 상속)
class Manager extends Employee {
    private int bonus;

    // 생성자
    public Manager(String name, String address, int salary, String rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    // test 메서드에서 부모 클래스 필드 값을 출력
    public void test() {
        // 아래 주석 처리된 코드는 주민등록번호를 직접 참조하려 하면 에러가 발생함
        // System.out.println("RRN in test method: " + rrn);

        // 부모 클래스의 메서드를 이용하여 출력
        System.out.println("Employee Info in Manager's test method:");
        printEmployeeInfo();
    }

    // Manager 정보 출력 메서드
    public void printManagerInfo() {
        // Manager 클래스의 필드와 부모 클래스의 필드 출력
        System.out.println("Bonus: " + bonus);
        printEmployeeInfo();
    }
}

// Main 클래스 정의
public class CH06_03 {
    public static void main(String[] args) {
        // Manager 객체 생성 및 초기화
        Manager manager = new Manager("Tom", "Wonju", 1000000, "123456", 50000);

        // Manager 정보 출력
        System.out.println("=== Manager Info ===");
        manager.printManagerInfo();

        // Manager의 test 메서드 호출
        manager.test();
    }
}