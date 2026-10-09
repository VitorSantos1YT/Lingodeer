package com.lingo.lingoskill.im.Messages;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessage {
    public static final int BUG_REPORT = 2;
    public static final int FEEDBACK = 1;
    public static final int GENERAL = 0;
    public static final int SYSTEM_MESSAGE = 3;
    private String audio;
    private String image;
    private String message;
    private String others;
    private String owner;
    private String system;
    private long timestamp;
    private int type;
    private String video;

    public String getAudio() {
        return this.audio;
    }

    public String getImage() {
        return this.image;
    }

    public String getMessage() {
        return this.message;
    }

    public String getOthers() {
        return this.others;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getSystem() {
        return this.system;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getType() {
        return this.type;
    }

    public String getVideo() {
        return this.video;
    }

    public void setAudio(String str) {
        this.audio = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setOthers(String str) {
        this.others = str;
    }

    public void setOwner(String str) {
        this.owner = str;
    }

    public void setSystem(String str) {
        this.system = str;
    }

    public void setTimestamp(long j11) {
        this.timestamp = j11;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public void setVideo(String str) {
        this.video = str;
    }
}
