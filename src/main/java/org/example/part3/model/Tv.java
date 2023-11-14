package org.example.part3.model;

public class Tv implements RemoteControl {

    private int channel_Num = 5;
    private int volume = 20;

    @Override
    public void chUp() {
        if(channel_Num < RemoteControl.MAXCH) {
            channel_Num++;
            System.out.println("TV 채널 번호 : " + channel_Num);
        }
    }

    @Override
    public void chDown() {
        if(channel_Num > RemoteControl.MINCH) {
            channel_Num--;
            System.out.println("TV 채널 번호 : " + channel_Num);
        }
    }

    @Override
    public void volUp() {
        if(volume < RemoteControl.MAXVOL) {
            volume += 5;
            System.out.println("TV 볼륨 : " + volume);
        }

    }

    @Override
    public void volDown() {
        if(volume > RemoteControl.MINVOL) {
            volume -= 5;
            System.out.println("TV 볼륨 : " + volume);
        }
    }

    @Override
    public void internet() {
        System.out.println(getClass().getSimpleName() + "에서는 인터넷 지원이 안됨");
    }
}
