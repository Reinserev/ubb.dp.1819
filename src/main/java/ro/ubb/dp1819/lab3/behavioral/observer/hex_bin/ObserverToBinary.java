package ro.ubb.dp1819.lab3.behavioral.observer.hex_bin;

class ObserverToBinary extends Observer {
    public ObserverToBinary(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}