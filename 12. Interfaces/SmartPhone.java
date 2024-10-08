class Phone{
    public void call(){
        System.out.println("Phone Call");
    }

    public void sms(){
        System.out.println("Phone SMS");
    }
}

interface Camera{
     void click();
     void record();
}

interface MusicPlayer{
    void play();
    void pause();
    void stop();
}

public class SmartPhone extends Phone implements Camera, MusicPlayer {
    
    @Override
    public void click(){
        System.out.println("Smartphone Click");
    }    

    @Override
    public void record(){
        System.out.println("Smartphone record");
    }    

    @Override
    public void play(){
        System.out.println("Smartphone play");
    }    

    @Override
    public void stop(){
        System.out.println("Smartphone stop");
    }   

    @Override
    public void pause(){
        System.out.println("Smartphone pause");
    }    

    @Override
    public void call(){
        System.out.println("Smartphone call");
    }    

    @Override
    public void sms(){
        System.out.println("Smartphone sms");
    }    

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
    }
}
