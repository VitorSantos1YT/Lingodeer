package com.lingo.lingoskill.object;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LoginHistory {
    private String accountType;
    private String email;
    private Boolean isMember;
    private Long lastLogOutTime;
    private Integer learningLan;
    private String nickName;
    private Integer uiLan;
    private String uid;

    public LoginHistory(String str, String str2, String str3, String str4, Boolean bool, Integer num, Integer num2, Long l9) {
        this.uid = str;
        this.nickName = str2;
        this.email = str3;
        this.accountType = str4;
        this.isMember = bool;
        this.learningLan = num;
        this.uiLan = num2;
        this.lastLogOutTime = l9;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String getEmail() {
        return this.email;
    }

    public Boolean getIsMember() {
        return this.isMember;
    }

    public Long getLastLogOutTime() {
        return this.lastLogOutTime;
    }

    public Integer getLearningLan() {
        return this.learningLan;
    }

    public String getNickName() {
        return this.nickName;
    }

    public Integer getUiLan() {
        return this.uiLan;
    }

    public String getUid() {
        return this.uid;
    }

    public void setAccountType(String str) {
        this.accountType = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setIsMember(Boolean bool) {
        this.isMember = bool;
    }

    public void setLastLogOutTime(Long l9) {
        this.lastLogOutTime = l9;
    }

    public void setLearningLan(Integer num) {
        this.learningLan = num;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setUiLan(Integer num) {
        this.uiLan = num;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public LoginHistory() {
    }
}
