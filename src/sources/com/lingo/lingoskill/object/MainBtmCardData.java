package com.lingo.lingoskill.object;

import c00.e;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class MainBtmCardData {
    private String ara;
    private String de;

    /* JADX INFO: renamed from: en, reason: collision with root package name */
    private String f21951en;

    /* JADX INFO: renamed from: es, reason: collision with root package name */
    private String f21952es;

    /* JADX INFO: renamed from: fr, reason: collision with root package name */
    private String f21953fr;

    /* JADX INFO: renamed from: hi, reason: collision with root package name */
    private String f21954hi;
    private String idn;
    private String it;

    /* JADX INFO: renamed from: jp, reason: collision with root package name */
    private String f21955jp;

    /* JADX INFO: renamed from: kr, reason: collision with root package name */
    private String f21956kr;

    /* JADX INFO: renamed from: pl, reason: collision with root package name */
    private String f21957pl;

    /* JADX INFO: renamed from: pt, reason: collision with root package name */
    private String f21958pt;

    /* JADX INFO: renamed from: ru, reason: collision with root package name */
    private String f21959ru;
    private String tch;
    private String thai;

    /* JADX INFO: renamed from: tr, reason: collision with root package name */
    private String f21960tr;

    /* JADX INFO: renamed from: vt, reason: collision with root package name */
    private String f21961vt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return MainBtmCardData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public MainBtmCardData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null);
    }

    public static final /* synthetic */ void write$Self$app_release(MainBtmCardData mainBtmCardData, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(mainBtmCardData.tch, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, mainBtmCardData.tch);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.f21955jp, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, mainBtmCardData.f21955jp);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.f21956kr, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, mainBtmCardData.f21956kr);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.f21951en, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, mainBtmCardData.f21951en);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.f21952es, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 4, mainBtmCardData.f21952es);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.f21953fr, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 5, mainBtmCardData.f21953fr);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.de, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 6, mainBtmCardData.de);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.f21958pt, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 7, mainBtmCardData.f21958pt);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.f21961vt, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 8, mainBtmCardData.f21961vt);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.f21959ru, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 9, mainBtmCardData.f21959ru);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.it, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 10, mainBtmCardData.it);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.f21960tr, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 11, mainBtmCardData.f21960tr);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.idn, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 12, mainBtmCardData.idn);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.f21957pl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 13, mainBtmCardData.f21957pl);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.thai, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 14, mainBtmCardData.thai);
        }
        if (bVar.G(gVar) || !m.a(mainBtmCardData.ara, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 15, mainBtmCardData.ara);
        }
        if (!bVar.G(gVar) && m.a(mainBtmCardData.f21954hi, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 16, mainBtmCardData.f21954hi);
    }

    public final String getAra() {
        return this.ara;
    }

    public final String getDe() {
        return this.de;
    }

    public final String getEn() {
        return this.f21951en;
    }

    public final String getEs() {
        return this.f21952es;
    }

    public final String getFr() {
        return this.f21953fr;
    }

    public final String getHi() {
        return this.f21954hi;
    }

    public final String getIdn() {
        return this.idn;
    }

    public final String getIt() {
        return this.it;
    }

    public final String getJp() {
        return this.f21955jp;
    }

    public final String getKr() {
        return this.f21956kr;
    }

    public final String getPicUrl(int i11) {
        if (i11 == 51) {
            return this.ara;
        }
        if (i11 == 57) {
            return this.thai;
        }
        if (i11 == 61) {
            return this.f21954hi;
        }
        switch (i11) {
            case 1:
                return this.f21955jp;
            case 2:
                return this.f21956kr;
            case 3:
                return this.f21951en;
            case 4:
                return this.f21952es;
            case 5:
                return this.f21953fr;
            case 6:
                return this.de;
            case 7:
                return this.f21961vt;
            case 8:
                return this.f21958pt;
            case 9:
                return this.tch;
            case 10:
                return this.f21959ru;
            default:
                switch (i11) {
                    case 18:
                        return this.idn;
                    case 19:
                        return this.f21957pl;
                    case 20:
                        return this.it;
                    case 21:
                        return this.f21960tr;
                    default:
                        return this.f21951en;
                }
        }
    }

    public final String getPl() {
        return this.f21957pl;
    }

    public final String getPt() {
        return this.f21958pt;
    }

    public final String getRu() {
        return this.f21959ru;
    }

    public final String getTch() {
        return this.tch;
    }

    public final String getThai() {
        return this.thai;
    }

    public final String getTr() {
        return this.f21960tr;
    }

    public final String getVt() {
        return this.f21961vt;
    }

    public final void setAra(String str) {
        m.f(str, "<set-?>");
        this.ara = str;
    }

    public final void setDe(String str) {
        m.f(str, "<set-?>");
        this.de = str;
    }

    public final void setEn(String str) {
        m.f(str, "<set-?>");
        this.f21951en = str;
    }

    public final void setEs(String str) {
        m.f(str, "<set-?>");
        this.f21952es = str;
    }

    public final void setFr(String str) {
        m.f(str, "<set-?>");
        this.f21953fr = str;
    }

    public final void setHi(String str) {
        m.f(str, "<set-?>");
        this.f21954hi = str;
    }

    public final void setIdn(String str) {
        m.f(str, "<set-?>");
        this.idn = str;
    }

    public final void setIt(String str) {
        m.f(str, "<set-?>");
        this.it = str;
    }

    public final void setJp(String str) {
        m.f(str, "<set-?>");
        this.f21955jp = str;
    }

    public final void setKr(String str) {
        m.f(str, "<set-?>");
        this.f21956kr = str;
    }

    public final void setPl(String str) {
        m.f(str, "<set-?>");
        this.f21957pl = str;
    }

    public final void setPt(String str) {
        m.f(str, "<set-?>");
        this.f21958pt = str;
    }

    public final void setRu(String str) {
        m.f(str, "<set-?>");
        this.f21959ru = str;
    }

    public final void setTch(String str) {
        m.f(str, "<set-?>");
        this.tch = str;
    }

    public final void setThai(String str) {
        m.f(str, "<set-?>");
        this.thai = str;
    }

    public final void setTr(String str) {
        m.f(str, "<set-?>");
        this.f21960tr = str;
    }

    public final void setVt(String str) {
        m.f(str, "<set-?>");
        this.f21961vt = str;
    }

    public /* synthetic */ MainBtmCardData(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.tch = BuildConfig.VERSION_NAME;
        } else {
            this.tch = str;
        }
        if ((i11 & 2) == 0) {
            this.f21955jp = BuildConfig.VERSION_NAME;
        } else {
            this.f21955jp = str2;
        }
        if ((i11 & 4) == 0) {
            this.f21956kr = BuildConfig.VERSION_NAME;
        } else {
            this.f21956kr = str3;
        }
        if ((i11 & 8) == 0) {
            this.f21951en = BuildConfig.VERSION_NAME;
        } else {
            this.f21951en = str4;
        }
        if ((i11 & 16) == 0) {
            this.f21952es = BuildConfig.VERSION_NAME;
        } else {
            this.f21952es = str5;
        }
        if ((i11 & 32) == 0) {
            this.f21953fr = BuildConfig.VERSION_NAME;
        } else {
            this.f21953fr = str6;
        }
        if ((i11 & 64) == 0) {
            this.de = BuildConfig.VERSION_NAME;
        } else {
            this.de = str7;
        }
        if ((i11 & 128) == 0) {
            this.f21958pt = BuildConfig.VERSION_NAME;
        } else {
            this.f21958pt = str8;
        }
        if ((i11 & 256) == 0) {
            this.f21961vt = BuildConfig.VERSION_NAME;
        } else {
            this.f21961vt = str9;
        }
        if ((i11 & 512) == 0) {
            this.f21959ru = BuildConfig.VERSION_NAME;
        } else {
            this.f21959ru = str10;
        }
        if ((i11 & 1024) == 0) {
            this.it = BuildConfig.VERSION_NAME;
        } else {
            this.it = str11;
        }
        if ((i11 & 2048) == 0) {
            this.f21960tr = BuildConfig.VERSION_NAME;
        } else {
            this.f21960tr = str12;
        }
        if ((i11 & 4096) == 0) {
            this.idn = BuildConfig.VERSION_NAME;
        } else {
            this.idn = str13;
        }
        if ((i11 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) {
            this.f21957pl = BuildConfig.VERSION_NAME;
        } else {
            this.f21957pl = str14;
        }
        if ((i11 & 16384) == 0) {
            this.thai = BuildConfig.VERSION_NAME;
        } else {
            this.thai = str15;
        }
        if ((32768 & i11) == 0) {
            this.ara = BuildConfig.VERSION_NAME;
        } else {
            this.ara = str16;
        }
        if ((i11 & 65536) == 0) {
            this.f21954hi = BuildConfig.VERSION_NAME;
        } else {
            this.f21954hi = str17;
        }
    }

    public MainBtmCardData(String tch, String jp2, String kr2, String en2, String es2, String fr2, String de, String pt2, String vt2, String str, String it, String tr2, String idn, String pl2, String thai, String ara, String hi2) {
        m.f(tch, "tch");
        m.f(jp2, "jp");
        m.f(kr2, "kr");
        m.f(en2, "en");
        m.f(es2, "es");
        m.f(fr2, "fr");
        m.f(de, "de");
        m.f(pt2, "pt");
        m.f(vt2, "vt");
        m.f(str, OCBJEWZHh.RWDt);
        m.f(it, "it");
        m.f(tr2, "tr");
        m.f(idn, "idn");
        m.f(pl2, "pl");
        m.f(thai, "thai");
        m.f(ara, "ara");
        m.f(hi2, "hi");
        this.tch = tch;
        this.f21955jp = jp2;
        this.f21956kr = kr2;
        this.f21951en = en2;
        this.f21952es = es2;
        this.f21953fr = fr2;
        this.de = de;
        this.f21958pt = pt2;
        this.f21961vt = vt2;
        this.f21959ru = str;
        this.it = it;
        this.f21960tr = tr2;
        this.idn = idn;
        this.f21957pl = pl2;
        this.thai = thai;
        this.ara = ara;
        this.f21954hi = hi2;
    }

    public /* synthetic */ MainBtmCardData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i11 & 32) != 0 ? BuildConfig.VERSION_NAME : str6, (i11 & 64) != 0 ? BuildConfig.VERSION_NAME : str7, (i11 & 128) != 0 ? BuildConfig.VERSION_NAME : str8, (i11 & 256) != 0 ? BuildConfig.VERSION_NAME : str9, (i11 & 512) != 0 ? BuildConfig.VERSION_NAME : str10, (i11 & 1024) != 0 ? BuildConfig.VERSION_NAME : str11, (i11 & 2048) != 0 ? BuildConfig.VERSION_NAME : str12, (i11 & 4096) != 0 ? BuildConfig.VERSION_NAME : str13, (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str14, (i11 & 16384) != 0 ? BuildConfig.VERSION_NAME : str15, (i11 & 32768) != 0 ? BuildConfig.VERSION_NAME : str16, (i11 & 65536) != 0 ? BuildConfig.VERSION_NAME : str17);
    }
}
