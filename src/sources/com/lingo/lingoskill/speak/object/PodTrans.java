package com.lingo.lingoskill.speak.object;

import android.text.TextUtils;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PodTrans {
    private String ara;

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    private String f22026cn;
    private String de;

    /* JADX INFO: renamed from: en, reason: collision with root package name */
    private String f22027en;

    /* JADX INFO: renamed from: fr, reason: collision with root package name */
    private String f22028fr;
    private String idn;
    private String it;

    /* JADX INFO: renamed from: jp, reason: collision with root package name */
    private String f22029jp;

    /* JADX INFO: renamed from: kr, reason: collision with root package name */
    private String f22030kr;

    /* JADX INFO: renamed from: pt, reason: collision with root package name */
    private String f22031pt;

    /* JADX INFO: renamed from: ru, reason: collision with root package name */
    private String f22032ru;

    /* JADX INFO: renamed from: sp, reason: collision with root package name */
    private String f22033sp;
    private String tch;
    private String thai;
    private String tur;

    /* JADX INFO: renamed from: vt, reason: collision with root package name */
    private String f22034vt;

    public String getAra() {
        return this.ara;
    }

    public String getCn() {
        return this.f22026cn;
    }

    public String getDe() {
        return this.de;
    }

    public String getEn() {
        return this.f22027en;
    }

    public String getFr() {
        return this.f22028fr;
    }

    public String getIdn() {
        return this.idn;
    }

    public String getIt() {
        return this.it;
    }

    public String getJp() {
        return this.f22029jp;
    }

    public String getKr() {
        return this.f22030kr;
    }

    public String getPt() {
        return this.f22031pt;
    }

    public String getRu() {
        return this.f22032ru;
    }

    public String getSp() {
        return this.f22033sp;
    }

    public String getTch() {
        return this.tch;
    }

    public String getThai() {
        return this.thai;
    }

    public String getTrans() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().locateLanguage;
        if (i11 == 1) {
            return TextUtils.isEmpty(getJp()) ? getEn() : getJp();
        }
        if (i11 == 2) {
            return TextUtils.isEmpty(getKr()) ? getEn() : getKr();
        }
        if (i11 == 18) {
            return TextUtils.isEmpty(getIdn()) ? getEn() : getIdn();
        }
        if (i11 == 51) {
            return TextUtils.isEmpty(getAra()) ? getEn() : getAra();
        }
        if (i11 == 57) {
            return TextUtils.isEmpty(getThai()) ? getEn() : getThai();
        }
        if (i11 == 20) {
            return TextUtils.isEmpty(getIt()) ? getEn() : getIt();
        }
        if (i11 == 21) {
            return TextUtils.isEmpty(getTur()) ? getEn() : getTur();
        }
        switch (i11) {
            case 4:
                return TextUtils.isEmpty(getSp()) ? getEn() : getSp();
            case 5:
                return TextUtils.isEmpty(getFr()) ? getEn() : getFr();
            case 6:
                return TextUtils.isEmpty(getDe()) ? getEn() : getDe();
            case 7:
                return TextUtils.isEmpty(getVt()) ? getEn() : getVt();
            case 8:
                return TextUtils.isEmpty(getPt()) ? getEn() : getPt();
            case 9:
                return TextUtils.isEmpty(getTch()) ? getEn() : getTch();
            case 10:
                return TextUtils.isEmpty(getRu()) ? getEn() : getRu();
            default:
                return getEn();
        }
    }

    public String getTur() {
        return this.tur;
    }

    public String getVt() {
        return this.f22034vt;
    }

    public void setAra(String str) {
        this.ara = str;
    }

    public void setCn(String str) {
        this.f22026cn = str;
    }

    public void setDe(String str) {
        this.de = str;
    }

    public void setEn(String str) {
        this.f22027en = str;
    }

    public void setFr(String str) {
        this.f22028fr = str;
    }

    public void setIdn(String str) {
        this.idn = str;
    }

    public void setIt(String str) {
        this.it = str;
    }

    public void setJp(String str) {
        this.f22029jp = str;
    }

    public void setKr(String str) {
        this.f22030kr = str;
    }

    public void setPt(String str) {
        this.f22031pt = str;
    }

    public void setRu(String str) {
        this.f22032ru = str;
    }

    public void setSp(String str) {
        this.f22033sp = str;
    }

    public void setTch(String str) {
        this.tch = str;
    }

    public void setThai(String str) {
        this.thai = str;
    }

    public void setTur(String str) {
        this.tur = str;
    }

    public void setVt(String str) {
        this.f22034vt = str;
    }
}
