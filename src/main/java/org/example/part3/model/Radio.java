package org.example.part3.model;

public class Radio implements RemoteControl {

    private int channel_Num = 47;
    private int volume = 30;

    @Override
    public void chUp() {
        if(channel_Num < RemoteControl.MAXCH) {
            channel_Num++;
            System.out.println("라디오 채널 번호 : " + channel_Num);
        }
    }

    @Override
    public void chDown() {
        if(channel_Num > RemoteControl.MINCH) {
            channel_Num--;
            System.out.println("라디오 채널 번호 : " + channel_Num);
        }
    }

    @Override
    public void volUp() {
        if(volume < RemoteControl.MAXVOL) {
            volume += 10;
            System.out.println("라디오 볼륨 : " + volume);
        }
    }

    @Override
    public void volDown() {
        if(volume > RemoteControl.MINVOL) {
            volume -= 10;
            System.out.println("라디오 볼륨 : " + volume);
        }
    }

    @Override
    public void internet() {
        System.out.println(getClass().getSimpleName() + "에서는 인터넷 지원이 안됨");
    }
}
