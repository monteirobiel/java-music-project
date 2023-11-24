package br.com.monteiro.mymusics.models;

public class Podcast extends Audio {

    private String host;
    private String desc;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
