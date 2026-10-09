package com.lingo.lingoskill.object;

import c00.e;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import vf.eq.EHjhWcesDUIsIw;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class IntroPage {

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private LanConfig f21922ar;

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    private LanConfig f21923cn;
    private String colorAccent;
    private String colorAccentButton;
    private String colorAccentTitle1;
    private String colorAccentTitle2;
    private LanConfig de;

    /* JADX INFO: renamed from: en, reason: collision with root package name */
    private LanConfig f21924en;

    /* JADX INFO: renamed from: es, reason: collision with root package name */
    private LanConfig f21925es;

    /* JADX INFO: renamed from: fr, reason: collision with root package name */
    private LanConfig f21926fr;
    private LanConfig idn;
    private LanConfig it;

    /* JADX INFO: renamed from: jp, reason: collision with root package name */
    private LanConfig f21927jp;

    /* JADX INFO: renamed from: kr, reason: collision with root package name */
    private LanConfig f21928kr;

    /* JADX INFO: renamed from: pt, reason: collision with root package name */
    private LanConfig f21929pt;

    /* JADX INFO: renamed from: ru, reason: collision with root package name */
    private LanConfig f21930ru;

    /* JADX INFO: renamed from: vt, reason: collision with root package name */
    private LanConfig f21931vt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return IntroPage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public IntroPage() {
        this((LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null);
    }

    public static final /* synthetic */ void write$Self$app_release(IntroPage introPage, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(introPage.f21923cn, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 0, LanConfig$$serializer.INSTANCE, introPage.f21923cn);
        }
        if (bVar.G(gVar) || !m.a(introPage.f21927jp, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 1, LanConfig$$serializer.INSTANCE, introPage.f21927jp);
        }
        if (bVar.G(gVar) || !m.a(introPage.f21928kr, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 2, LanConfig$$serializer.INSTANCE, introPage.f21928kr);
        }
        if (bVar.G(gVar) || !m.a(introPage.f21924en, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 3, LanConfig$$serializer.INSTANCE, introPage.f21924en);
        }
        if (bVar.G(gVar) || !m.a(introPage.f21925es, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 4, LanConfig$$serializer.INSTANCE, introPage.f21925es);
        }
        if (bVar.G(gVar) || !m.a(introPage.f21926fr, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 5, LanConfig$$serializer.INSTANCE, introPage.f21926fr);
        }
        if (bVar.G(gVar) || !m.a(introPage.de, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 6, LanConfig$$serializer.INSTANCE, introPage.de);
        }
        if (bVar.G(gVar) || !m.a(introPage.f21929pt, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 7, LanConfig$$serializer.INSTANCE, introPage.f21929pt);
        }
        if (bVar.G(gVar) || !m.a(introPage.f21931vt, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 8, LanConfig$$serializer.INSTANCE, introPage.f21931vt);
        }
        if (bVar.G(gVar) || !m.a(introPage.f21930ru, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 9, LanConfig$$serializer.INSTANCE, introPage.f21930ru);
        }
        if (bVar.G(gVar) || !m.a(introPage.it, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 10, LanConfig$$serializer.INSTANCE, introPage.it);
        }
        if (bVar.G(gVar) || !m.a(introPage.f21922ar, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 11, LanConfig$$serializer.INSTANCE, introPage.f21922ar);
        }
        if (bVar.G(gVar) || !m.a(introPage.idn, new LanConfig((String) null, (String) null, 3, (f) null))) {
            bVar.A(gVar, 12, LanConfig$$serializer.INSTANCE, introPage.idn);
        }
        if (bVar.G(gVar) || !m.a(introPage.colorAccent, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 13, introPage.colorAccent);
        }
        if (bVar.G(gVar) || !m.a(introPage.colorAccentTitle1, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 14, introPage.colorAccentTitle1);
        }
        if (bVar.G(gVar) || !m.a(introPage.colorAccentTitle2, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 15, introPage.colorAccentTitle2);
        }
        if (!bVar.G(gVar) && m.a(introPage.colorAccentButton, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 16, introPage.colorAccentButton);
    }

    public final LanConfig getAr() {
        return this.f21922ar;
    }

    public final LanConfig getCn() {
        return this.f21923cn;
    }

    public final String getColorAccent() {
        return this.colorAccent;
    }

    public final String getColorAccentButton() {
        return this.colorAccentButton;
    }

    public final String getColorAccentTitle1() {
        return this.colorAccentTitle1;
    }

    public final String getColorAccentTitle2() {
        return this.colorAccentTitle2;
    }

    public final LanConfig getDe() {
        return this.de;
    }

    public final LanConfig getEn() {
        return this.f21924en;
    }

    public final LanConfig getEs() {
        return this.f21925es;
    }

    public final LanConfig getFr() {
        return this.f21926fr;
    }

    public final LanConfig getIdn() {
        return this.idn;
    }

    public final LanConfig getIt() {
        return this.it;
    }

    public final LanConfig getJp() {
        return this.f21927jp;
    }

    public final LanConfig getKr() {
        return this.f21928kr;
    }

    public final LanConfig getPt() {
        return this.f21929pt;
    }

    public final LanConfig getRu() {
        return this.f21930ru;
    }

    public final LanConfig getVt() {
        return this.f21931vt;
    }

    public final void setAr(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.f21922ar = lanConfig;
    }

    public final void setCn(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.f21923cn = lanConfig;
    }

    public final void setColorAccent(String str) {
        m.f(str, "<set-?>");
        this.colorAccent = str;
    }

    public final void setColorAccentButton(String str) {
        m.f(str, "<set-?>");
        this.colorAccentButton = str;
    }

    public final void setColorAccentTitle1(String str) {
        m.f(str, "<set-?>");
        this.colorAccentTitle1 = str;
    }

    public final void setColorAccentTitle2(String str) {
        m.f(str, "<set-?>");
        this.colorAccentTitle2 = str;
    }

    public final void setDe(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.de = lanConfig;
    }

    public final void setEn(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.f21924en = lanConfig;
    }

    public final void setEs(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.f21925es = lanConfig;
    }

    public final void setFr(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.f21926fr = lanConfig;
    }

    public final void setIdn(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.idn = lanConfig;
    }

    public final void setIt(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.it = lanConfig;
    }

    public final void setJp(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.f21927jp = lanConfig;
    }

    public final void setKr(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.f21928kr = lanConfig;
    }

    public final void setPt(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.f21929pt = lanConfig;
    }

    public final void setRu(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.f21930ru = lanConfig;
    }

    public final void setVt(LanConfig lanConfig) {
        m.f(lanConfig, "<set-?>");
        this.f21931vt = lanConfig;
    }

    public /* synthetic */ IntroPage(int i11, LanConfig lanConfig, LanConfig lanConfig2, LanConfig lanConfig3, LanConfig lanConfig4, LanConfig lanConfig5, LanConfig lanConfig6, LanConfig lanConfig7, LanConfig lanConfig8, LanConfig lanConfig9, LanConfig lanConfig10, LanConfig lanConfig11, LanConfig lanConfig12, LanConfig lanConfig13, String str, String str2, String str3, String str4, o1 o1Var) {
        this.f21923cn = (i11 & 1) == 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig;
        if ((i11 & 2) == 0) {
            this.f21927jp = new LanConfig((String) null, (String) null, 3, (f) null);
        } else {
            this.f21927jp = lanConfig2;
        }
        if ((i11 & 4) == 0) {
            this.f21928kr = new LanConfig((String) null, (String) null, 3, (f) null);
        } else {
            this.f21928kr = lanConfig3;
        }
        if ((i11 & 8) == 0) {
            this.f21924en = new LanConfig((String) null, (String) null, 3, (f) null);
        } else {
            this.f21924en = lanConfig4;
        }
        if ((i11 & 16) == 0) {
            this.f21925es = new LanConfig((String) null, (String) null, 3, (f) null);
        } else {
            this.f21925es = lanConfig5;
        }
        if ((i11 & 32) == 0) {
            this.f21926fr = new LanConfig((String) null, (String) null, 3, (f) null);
        } else {
            this.f21926fr = lanConfig6;
        }
        if ((i11 & 64) == 0) {
            this.de = new LanConfig((String) null, (String) null, 3, (f) null);
        } else {
            this.de = lanConfig7;
        }
        if ((i11 & 128) == 0) {
            this.f21929pt = new LanConfig((String) null, (String) null, 3, (f) null);
        } else {
            this.f21929pt = lanConfig8;
        }
        if ((i11 & 256) == 0) {
            this.f21931vt = new LanConfig((String) null, (String) null, 3, (f) null);
        } else {
            this.f21931vt = lanConfig9;
        }
        if ((i11 & 512) == 0) {
            this.f21930ru = new LanConfig((String) null, (String) null, 3, (f) null);
        } else {
            this.f21930ru = lanConfig10;
        }
        if ((i11 & 1024) == 0) {
            this.it = new LanConfig((String) null, (String) null, 3, (f) null);
        } else {
            this.it = lanConfig11;
        }
        this.f21922ar = (i11 & 2048) == 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig12;
        this.idn = (i11 & 4096) == 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig13;
        if ((i11 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) {
            this.colorAccent = BuildConfig.VERSION_NAME;
        } else {
            this.colorAccent = str;
        }
        if ((i11 & 16384) == 0) {
            this.colorAccentTitle1 = BuildConfig.VERSION_NAME;
        } else {
            this.colorAccentTitle1 = str2;
        }
        if ((32768 & i11) == 0) {
            this.colorAccentTitle2 = BuildConfig.VERSION_NAME;
        } else {
            this.colorAccentTitle2 = str3;
        }
        if ((i11 & 65536) == 0) {
            this.colorAccentButton = BuildConfig.VERSION_NAME;
        } else {
            this.colorAccentButton = str4;
        }
    }

    public IntroPage(LanConfig cn2, LanConfig jp2, LanConfig kr2, LanConfig en2, LanConfig es2, LanConfig fr2, LanConfig de, LanConfig pt2, LanConfig vt2, LanConfig ru2, LanConfig it, LanConfig ar2, LanConfig idn, String colorAccent, String colorAccentTitle1, String colorAccentTitle2, String str) {
        m.f(cn2, "cn");
        m.f(jp2, "jp");
        m.f(kr2, "kr");
        m.f(en2, "en");
        m.f(es2, "es");
        m.f(fr2, "fr");
        m.f(de, "de");
        m.f(pt2, "pt");
        m.f(vt2, "vt");
        m.f(ru2, "ru");
        m.f(it, "it");
        m.f(ar2, "ar");
        m.f(idn, "idn");
        m.f(colorAccent, "colorAccent");
        m.f(colorAccentTitle1, "colorAccentTitle1");
        m.f(colorAccentTitle2, "colorAccentTitle2");
        m.f(str, EHjhWcesDUIsIw.xckClYTFcBP);
        this.f21923cn = cn2;
        this.f21927jp = jp2;
        this.f21928kr = kr2;
        this.f21924en = en2;
        this.f21925es = es2;
        this.f21926fr = fr2;
        this.de = de;
        this.f21929pt = pt2;
        this.f21931vt = vt2;
        this.f21930ru = ru2;
        this.it = it;
        this.f21922ar = ar2;
        this.idn = idn;
        this.colorAccent = colorAccent;
        this.colorAccentTitle1 = colorAccentTitle1;
        this.colorAccentTitle2 = colorAccentTitle2;
        this.colorAccentButton = str;
    }

    public /* synthetic */ IntroPage(LanConfig lanConfig, LanConfig lanConfig2, LanConfig lanConfig3, LanConfig lanConfig4, LanConfig lanConfig5, LanConfig lanConfig6, LanConfig lanConfig7, LanConfig lanConfig8, LanConfig lanConfig9, LanConfig lanConfig10, LanConfig lanConfig11, LanConfig lanConfig12, LanConfig lanConfig13, String str, String str2, String str3, String str4, int i11, f fVar) {
        this((i11 & 1) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig, (i11 & 2) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig2, (i11 & 4) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig3, (i11 & 8) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig4, (i11 & 16) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig5, (i11 & 32) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig6, (i11 & 64) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig7, (i11 & 128) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig8, (i11 & 256) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig9, (i11 & 512) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig10, (i11 & 1024) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig11, (i11 & 2048) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig12, (i11 & 4096) != 0 ? new LanConfig((String) null, (String) null, 3, (f) null) : lanConfig13, (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 16384) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 32768) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 65536) != 0 ? BuildConfig.VERSION_NAME : str4);
    }
}
