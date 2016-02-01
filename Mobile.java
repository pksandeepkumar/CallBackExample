public class Mobile implements BatteryCallBacks {

    Battery battery;

    public Mobile() {
        battery = new Battery(this);
    }

    public void chargeMobile() {
        battery.doCharging();
    }

    public void onBatteryChanging(){
        System.out.println("Mobile is charging.. " + battery.chargeInPercentage + "%");
    }

    public void onBatteryFull(){
        System.out.println("Mobile fully charged!!!!!");
    }
}
