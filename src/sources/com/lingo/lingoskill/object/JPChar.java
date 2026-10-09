package com.lingo.lingoskill.object;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class JPChar extends o00.a {
    public String CharPath;
    public String Character;
    public String LuoMa;
    public String Pian;
    public String Ping;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public long f21932id;

    public JPChar() {
        super(12);
    }

    public long getCharId() {
        return getId();
    }

    public String getCharPath() {
        return this.CharPath;
    }

    public String getCharacter() {
        return this.Character;
    }

    public String getDisplayLuoMa() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String str = x.n().jsLuomaDisplay == 0 ? this.LuoMa.split("#")[1] : this.LuoMa.split("#")[0];
        return (getPing().equals("を") && str.equals("o")) ? "wo" : str;
    }

    public long getId() {
        return this.f21932id;
    }

    public String getLuoMa() {
        return this.LuoMa;
    }

    public String getPian() {
        return this.Pian;
    }

    public String getPing() {
        return this.Ping;
    }

    public String getZhuyin() {
        return getDisplayLuoMa();
    }

    public void setCharPath(String str) {
        this.CharPath = str;
    }

    public void setCharacter(String str) {
        this.Character = str;
    }

    public void setId(long j11) {
        this.f21932id = j11;
    }

    public void setLuoMa(String str) {
        this.LuoMa = str;
    }

    public void setPian(String str) {
        this.Pian = str;
    }

    public void setPing(String str) {
        this.Ping = str;
    }

    public JPChar(long j11, String str, String str2, String str3, String str4, String str5) {
        super(12);
        this.f21932id = j11;
        this.Ping = str;
        this.Pian = str2;
        this.LuoMa = str3;
        this.CharPath = str4;
        this.Character = str5;
    }
}
