package com.lingo.lingoskill.object;

import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LanguageTransVersion {

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    private int f21941cn;
    private int de;

    /* JADX INFO: renamed from: en, reason: collision with root package name */
    private int f21942en;

    /* JADX INFO: renamed from: es, reason: collision with root package name */
    private int f21943es;

    /* JADX INFO: renamed from: fr, reason: collision with root package name */
    private int f21944fr;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f21945id;
    private Integer idn;
    private Integer it;

    /* JADX INFO: renamed from: jp, reason: collision with root package name */
    private int f21946jp;

    /* JADX INFO: renamed from: kr, reason: collision with root package name */
    private int f21947kr;
    private Integer pol;

    /* JADX INFO: renamed from: pt, reason: collision with root package name */
    private int f21948pt;

    /* JADX INFO: renamed from: ru, reason: collision with root package name */
    private int f21949ru;
    private int tch;
    private Integer tur;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    private int f21950vi;

    public LanguageTransVersion(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f21945id = str;
        this.f21941cn = i11;
        this.f21946jp = i12;
        this.f21947kr = i13;
        this.f21942en = i14;
        this.f21943es = i15;
        this.de = i16;
        this.f21944fr = i17;
        this.f21948pt = i18;
        this.f21950vi = i19;
        this.f21949ru = i21;
        this.tch = i22;
        this.idn = num;
        this.pol = num2;
        this.it = num3;
        this.tur = num4;
    }

    public int getCn() {
        return this.f21941cn;
    }

    public int getCurLanVersion() {
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i11 = x.n().locateLanguage;
        if (i11 == 0) {
            return getCn();
        }
        if (i11 == 1) {
            return getJp();
        }
        if (i11 == 2) {
            return getKr();
        }
        if (i11 == 3) {
            return getEn();
        }
        if (i11 == 4) {
            return getEs();
        }
        if (i11 == 5) {
            return getFr();
        }
        if (i11 == 7) {
            return getVi();
        }
        if (i11 == 9) {
            return getTch();
        }
        if (i11 == 10) {
            return getRu();
        }
        switch (i11) {
            case 18:
                return getIdn().intValue();
            case 19:
                return getPol().intValue();
            case 20:
                return getIt().intValue();
            case 21:
                return getTur().intValue();
            default:
                return getEn();
        }
    }

    public int getDe() {
        return this.de;
    }

    public int getEn() {
        return this.f21942en;
    }

    public int getEs() {
        return this.f21943es;
    }

    public int getFr() {
        return this.f21944fr;
    }

    public String getId() {
        return this.f21945id;
    }

    public Integer getIdn() {
        Integer num = this.idn;
        if (num == null) {
            return -1;
        }
        return num;
    }

    public Integer getIt() {
        Integer num = this.it;
        if (num == null) {
            return -1;
        }
        return num;
    }

    public int getJp() {
        return this.f21946jp;
    }

    public int getKr() {
        return this.f21947kr;
    }

    public Integer getPol() {
        Integer num = this.pol;
        if (num == null) {
            return -1;
        }
        return num;
    }

    public int getPt() {
        return this.f21948pt;
    }

    public int getRu() {
        return this.f21949ru;
    }

    public int getTch() {
        return this.tch;
    }

    public Integer getTur() {
        Integer num = this.tur;
        if (num == null) {
            return -1;
        }
        return num;
    }

    public int getVi() {
        return this.f21950vi;
    }

    public void setCn(int i11) {
        this.f21941cn = i11;
    }

    public void setDe(int i11) {
        this.de = i11;
    }

    public void setEn(int i11) {
        this.f21942en = i11;
    }

    public void setEs(int i11) {
        this.f21943es = i11;
    }

    public void setFr(int i11) {
        this.f21944fr = i11;
    }

    public void setId(String str) {
        this.f21945id = str;
    }

    public void setIdn(Integer num) {
        this.idn = num;
    }

    public void setIt(Integer num) {
        this.it = num;
    }

    public void setJp(int i11) {
        this.f21946jp = i11;
    }

    public void setKr(int i11) {
        this.f21947kr = i11;
    }

    public void setPol(Integer num) {
        this.pol = num;
    }

    public void setPt(int i11) {
        this.f21948pt = i11;
    }

    public void setRu(int i11) {
        this.f21949ru = i11;
    }

    public void setTch(int i11) {
        this.tch = i11;
    }

    public void setTur(Integer num) {
        this.tur = num;
    }

    public void setVi(int i11) {
        this.f21950vi = i11;
    }

    public LanguageTransVersion() {
    }
}
