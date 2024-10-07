class TV {
    TV(){
        System.out.println("TV Initialised");
    }

    public void changeChannel(){
        System.out.println("Channel Channed in TV");
    }
    
    public void setVolume(){
        System.out.println("Volume set in TV");
    }
}

class SmartTV extends TV {
    SmartTV(){
        System.out.println("SmartTV Initialised");
    }

    public void changeChannel(){
        System.out.println("Channel Channed in SmartTV");
    }
    
    public void setVolume(){
        System.out.println("Volume set in SmartTV");
    }
}

public class TVSmartTV {
    public static void main(String[] args) {
        TV tv = new SmartTV();
        tv.changeChannel(); // This is also Called as dynamic method dispatch as method of smartTV is called instead of TV

    }
}
