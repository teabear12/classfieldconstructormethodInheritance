package publicTransport;


public class publicTransportExample {
    public static void main(String[] args) {
        //버스를 밑에 3개 만들었음. 번호가 있는 것은 기본 생성자가 아닌 매개변수가 1개있는 생성자로 만든 것이다.
        //버스
        Bus myBus = new Bus(1);
        System.out.println("myBus.버스번호 : " + myBus.BusNumber1);
        Bus myBus2 = new Bus(2);
        System.out.println("myBus.버스번호 : " + myBus2.BusNumber1);
        //위에 BusNumber1가 같은 것은 myBus, myBus2안에 50과 23을 BusNumber1로 저장했기 때문이다.

        myBus.refuelingAmount(-95);
        myBus.situation();
        myBus.refuelingAmount(30);
        System.out.println("myBus.주유량 : " + myBus.refuelingAmount);
        myBus.passengerBoarding(31);
        System.out.println("myBus.탑승자 수 : " + myBus.passenger);
        myBus.speedChange(10);
        System.out.println("myBus.현제속력 : " + myBus.currentSpeed);

        //택시
        Taxi myTaxi1 = new Taxi(1234);
        System.out.println("myTaxi1.택시번호 : " + myTaxi1.TaxiNumber);
        Taxi myTaxi2 = new Taxi(5678);
        System.out.println("myTaxi2.택시번호 : " + myTaxi2.TaxiNumber);
        Taxi.situation();
        Taxi.refuelingAmount(-95);
        System.out.println("myTaxi1.refuelingAmount : " + Taxi.refuelingAmount);
    }
}