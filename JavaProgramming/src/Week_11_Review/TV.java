package Week_11_Review;

public class TV {
    public int channel = 1;
    public int volume = 1;
   public boolean on = false;

    public TV(){



    }
    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel (int newChannel){
        if(on&&newChannel>=1 && newChannel<=120){
            channel=newChannel;
        }
    }
    public void setVolume(int newVolume){
        if(on&&newVolume>=1 && newVolume <=7){
            volume=newVolume;
        }
    }

    public void channelUp(){
        if(on&&channel<120)
            channel++;
    }
    public void channelDown(){
        if(on&&channel>1)
            channel--;
    }
    public void volumeUp(){
        if(on&&volume<7)
            volume++;
    }
    public void volumeDown(){
        if(on&&volume>1)
            volume--;
    }

    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", on=" + on +
                '}';
    }
}
