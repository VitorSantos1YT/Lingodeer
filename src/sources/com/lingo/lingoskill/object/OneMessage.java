package com.lingo.lingoskill.object;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class OneMessage {
    private String uid = BuildConfig.VERSION_NAME;
    private int type = 0;
    private String message = BuildConfig.VERSION_NAME;
    private String image = BuildConfig.VERSION_NAME;
    private String lan_learning = BuildConfig.VERSION_NAME;
    private String lan_speaking = BuildConfig.VERSION_NAME;
    private String lan_ui = BuildConfig.VERSION_NAME;
    private String device = BuildConfig.VERSION_NAME;
    private String cwsid = BuildConfig.VERSION_NAME;
    private String uversion = BuildConfig.VERSION_NAME;

    public String getCwsid() {
        return this.cwsid;
    }

    public String getDevice() {
        return this.device;
    }

    public String getImage() {
        return this.image;
    }

    public String getLan_learning() {
        return this.lan_learning;
    }

    public String getLan_speaking() {
        return this.lan_speaking;
    }

    public String getLan_ui() {
        return this.lan_ui;
    }

    public String getMessage() {
        return this.message;
    }

    public int getType() {
        return this.type;
    }

    public String getUid() {
        return this.uid;
    }

    public String getUversion() {
        return this.uversion;
    }

    public void setCwsid(String str) {
        this.cwsid = str;
    }

    public void setDevice(String str) {
        this.device = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setLan_learning(String str) {
        this.lan_learning = str;
    }

    public void setLan_speaking(String str) {
        this.lan_speaking = str;
    }

    public void setLan_ui(String str) {
        this.lan_ui = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setType(int i11) {
        this.type = i11;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setUversion(String str) {
        this.uversion = str;
    }
}
