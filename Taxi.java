package publicTransport;

public class Taxi extends publicTransport {
    //필드
    //택시 번호
    int TaxiNumber;
    //주유량
    static int refuelingAmount = 100;
    //현재 속도
    int currentSpeed;
    //목적지
    String destination;
    //기본 거리
    int basicDistance = 1;
    //목적지까지 거리
    int distanceToDestination;
    //기본 요금
    int basicMoney = 3000;
    //거리당 요금
    int FaresPerDistance = 1000;
    //상태
    static String situation = "일반";
    //현재 승객 수
    int CurrentNumberOfPassengers;
    //최대 승객 수
    int MaxMember = 4;
    //결제 금액
    int payMoney;


    //기본생성자
    public Taxi() {

    }
    //매개변수가 1개있는 생성자
    public Taxi(int TaxiNumber)
    {
        this.TaxiNumber = TaxiNumber;
    }


    //기능(메소드)
    //운행시작
    public static void situation()
    {
        System.out.println(situation);
        if(refuelingAmount < 10) {
            System.out.println("운행불가");
        }
    }
    //주유량
    public static void refuelingAmount(int refuelingAmount)
    {
        Taxi.refuelingAmount += refuelingAmount;
    }
    //승객탑승
    public void CurrentNumberOfPassengers(int CurrentNumberOfPassengers)
    {
        this.CurrentNumberOfPassengers += CurrentNumberOfPassengers;
        if(MaxMember >= 5) {
            System.out.println("인원초가");
        }
    }
    //속도변경
    public void speedChange(int speed)
    {
        currentSpeed += speed;
    }
    //목적지
    public void destination(String destination)
    {
        this.destination = destination;
    }
    //목적지까지 거리
    public void distanceToDestination(int distanceToDestination)
    {
        this.distanceToDestination = distanceToDestination;
    }
    //거리당 요금 추가
    public void FaresPerDistance(int FaresPerDistance)
    {
        this.FaresPerDistance = FaresPerDistance;
    }
    //요금결제
    public void payMoney()
    {
        this.payMoney = basicMoney + FaresPerDistance*(distanceToDestination-1);
    }
}
