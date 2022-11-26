package publicTransport;

public class Bus extends publicTransport {
    //필드
    //최대 승객 수
    int MaxMember = 30;
    //현재 승객 수
    int passenger;
    //요금
    int money;
    //버스번호
    int BusNumber1;
    //주유량
    int refuelingAmount = 100;
    //현재 속도
    int currentSpeed;
    //운행 상태
    String situation1 = "운행";
    //차고지 행
    String situation2 = "차고지행";
    //수입
    private int intake;

    //매개변수가 없는 기본생성자(생성자는 공장의 버튼같은 존재이다. 공장에서 생성자라는 버튼을 누르면 객체들이 나오는 것이다. main페이지의 Bus myBus = new Bus();가 객체를 만든 것이다.)
    public Bus() {

    }
    //기능
    //버스번호 초기화, 매개변수가 1개있는 생성자
    public Bus(int BusNumber1)
    {
        this.BusNumber1 = BusNumber1;
    }


    //메소드
    //궁금한 점 : 메소드의 if절 같은 곳에 System.out.print에서 글자출력이 잘 안됨.
    // 버스 상태 변경
    public void situation() {
        if(refuelingAmount >= 10) {
            System.out.println(situation1);
        }else {
            System.out.println(situation2);
            System.out.println("주유가 필요합니다.");
        }
    }
    //주유량 변경
    public void refuelingAmount(int refuelingAmount)
    {
        this.refuelingAmount += refuelingAmount;
    }
    //승객 탑승
    public void passengerBoarding(int passenger)
    {
        this.passenger += passenger;
        if(this.passenger > MaxMember) {
            this.passenger -= passenger;
            System.out.println("탑승 불가합니다");
        }
    }
    //탑승 상태
    public void boardingStatus() {}

    //속도 변경
    public void speedChange(int speed) {
        currentSpeed += speed;
    }
}