package publicTransport;

public class Bus extends publicTransport {
    //필드
    //최대 승객 수
    int MaxMember = 30;
    //현재 승객 수
    int CurrentNumberOfPassengers;
    //요금
    int money;
    //버스번호
    int BusNumber;
    //주유량
    int refuelingAmount = 100;
    //현재 속도
    int currentSpeed;
    //운행 상태
    String situation1 = "운행";
    //차고지 행
    String situation2 = "차고지행";
    //승객
    private int passenger;
    //수입
    private int intake;



    //기능
    //버스번호 초기화
    public Bus(int BusNumber)
    {
        this.BusNumber = BusNumber;
    }
    // 버스 상태 변경
    public void situation(String situation1, String situation2) {

    }
    //승객 탑승

    //속도 변경
    
}
