public class Person {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl("Remote Control device");
        Device digitalReceiver = new DigitalReceiver("Digital Receiver device", "M-812");
        Device tv = new TV("Tv device", "T-867");
        Device audioSystem = new AudioSystem("Audio System device", "");
        Device mp3player = new MP3Player("MP3Player device", "MP-8");
        Device dvdPlayer = new DVDPlayer("DVDPlayer device", "DV-09");
        
        remoteControl.showAllDevicesInSystem();
        System.out.println();

        remoteControl.addInSystem(digitalReceiver);
        remoteControl.showAllDevicesInSystem();
        System.out.println();
        
        remoteControl.addInSystem(tv);
        remoteControl.showAllDevicesInSystem();
        System.out.println();
        
        remoteControl.addInSystem(audioSystem);
        remoteControl.showAllDevicesInSystem();
        System.out.println();

        remoteControl.addInSystem(mp3player);
        remoteControl.showAllDevicesInSystem();
        System.out.println();

        remoteControl.addInSystem(dvdPlayer);
        remoteControl.showAllDevicesInSystem();
        System.out.println();

        remoteControl.turnOff();
        remoteControl.turnOn();
        System.out.println();

        remoteControl.chooseDevice("Digital Receiver device");
        remoteControl.turnOn();
        remoteControl.getActiveDevice().doSomething();
        remoteControl.turnOff();
        remoteControl.getActiveDevice().doSomething();
        System.out.println();

        remoteControl.chooseDevice("Audio System device");
        remoteControl.turnOn();
        remoteControl.getActiveDevice().doSomething();
        remoteControl.turnOff();
        remoteControl.getActiveDevice().doSomething();
        System.out.println();

        remoteControl.chooseDevice("TV device");
        remoteControl.turnOn();
        remoteControl.getActiveDevice().doSomething();
        remoteControl.turnOff();
        remoteControl.getActiveDevice().doSomething();
        System.out.println();

        remoteControl.chooseDevice("MP3Player device");
        remoteControl.turnOn();
        remoteControl.getActiveDevice().doSomething();
        remoteControl.turnOff();
        remoteControl.getActiveDevice().doSomething();
        System.out.println();


        remoteControl.chooseDevice("DVDPlayer device");
        remoteControl.turnOn();
        remoteControl.getActiveDevice().doSomething();
        remoteControl.turnOff();
        remoteControl.getActiveDevice().doSomething();
        System.out.println();

    }
}

