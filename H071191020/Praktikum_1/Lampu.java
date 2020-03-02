class Lampu {

    private boolean blueIsOn;
    private boolean redIsOn;

    public void turnOn() {
        if (blueIsOn && redIsOn) {
            blueIsOn = true;
            redIsOn= false;
        } else if(blueIsOn && !redIsOn) {
            blueIsOn = false;
            redIsOn = true;
        } else {
            blueIsOn = true;
            redIsOn = false;
        }
    }
    public void turnOff() {
        blueIsOn = false;
        redIsOn = false;
    }

    public void getState() {
        System.out.println(blueIsOn ? "Biru ON" : "Biru OFF");
        System.out.println(redIsOn ? "Merah ON" : "Merah OFF");
        System.out.println();
    }
}