package com.lingo.lingoskill.object;

import c00.e;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class SplashPopPageConfig {

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private SplashPopLanConfig f21970ar;

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    private SplashPopLanConfig f21971cn;
    private SplashPopLanConfig de;

    /* JADX INFO: renamed from: en, reason: collision with root package name */
    private SplashPopLanConfig f21972en;

    /* JADX INFO: renamed from: es, reason: collision with root package name */
    private SplashPopLanConfig f21973es;

    /* JADX INFO: renamed from: fr, reason: collision with root package name */
    private SplashPopLanConfig f21974fr;
    private SplashPopLanConfig idn;
    private SplashPopLanConfig it;

    /* JADX INFO: renamed from: jp, reason: collision with root package name */
    private SplashPopLanConfig f21975jp;

    /* JADX INFO: renamed from: kr, reason: collision with root package name */
    private SplashPopLanConfig f21976kr;

    /* JADX INFO: renamed from: pt, reason: collision with root package name */
    private SplashPopLanConfig f21977pt;

    /* JADX INFO: renamed from: ru, reason: collision with root package name */
    private SplashPopLanConfig f21978ru;

    /* JADX INFO: renamed from: vt, reason: collision with root package name */
    private SplashPopLanConfig f21979vt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return SplashPopPageConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public SplashPopPageConfig() {
        this((SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, (SplashPopLanConfig) null, 8191, (f) null);
    }

    public static /* synthetic */ SplashPopPageConfig copy$default(SplashPopPageConfig splashPopPageConfig, SplashPopLanConfig splashPopLanConfig, SplashPopLanConfig splashPopLanConfig2, SplashPopLanConfig splashPopLanConfig3, SplashPopLanConfig splashPopLanConfig4, SplashPopLanConfig splashPopLanConfig5, SplashPopLanConfig splashPopLanConfig6, SplashPopLanConfig splashPopLanConfig7, SplashPopLanConfig splashPopLanConfig8, SplashPopLanConfig splashPopLanConfig9, SplashPopLanConfig splashPopLanConfig10, SplashPopLanConfig splashPopLanConfig11, SplashPopLanConfig splashPopLanConfig12, SplashPopLanConfig splashPopLanConfig13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            splashPopLanConfig = splashPopPageConfig.f21971cn;
        }
        return splashPopPageConfig.copy(splashPopLanConfig, (i11 & 2) != 0 ? splashPopPageConfig.f21975jp : splashPopLanConfig2, (i11 & 4) != 0 ? splashPopPageConfig.f21976kr : splashPopLanConfig3, (i11 & 8) != 0 ? splashPopPageConfig.f21972en : splashPopLanConfig4, (i11 & 16) != 0 ? splashPopPageConfig.f21973es : splashPopLanConfig5, (i11 & 32) != 0 ? splashPopPageConfig.f21974fr : splashPopLanConfig6, (i11 & 64) != 0 ? splashPopPageConfig.de : splashPopLanConfig7, (i11 & 128) != 0 ? splashPopPageConfig.f21977pt : splashPopLanConfig8, (i11 & 256) != 0 ? splashPopPageConfig.f21979vt : splashPopLanConfig9, (i11 & 512) != 0 ? splashPopPageConfig.f21978ru : splashPopLanConfig10, (i11 & 1024) != 0 ? splashPopPageConfig.it : splashPopLanConfig11, (i11 & 2048) != 0 ? splashPopPageConfig.f21970ar : splashPopLanConfig12, (i11 & 4096) != 0 ? splashPopPageConfig.idn : splashPopLanConfig13);
    }

    public static final /* synthetic */ void write$Self$app_release(SplashPopPageConfig splashPopPageConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.f21971cn, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 0, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.f21971cn);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.f21975jp, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 1, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.f21975jp);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.f21976kr, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 2, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.f21976kr);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.f21972en, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 3, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.f21972en);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.f21973es, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 4, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.f21973es);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.f21974fr, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 5, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.f21974fr);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.de, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 6, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.de);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.f21977pt, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 7, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.f21977pt);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.f21979vt, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 8, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.f21979vt);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.f21978ru, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 9, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.f21978ru);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.it, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 10, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.it);
        }
        if (bVar.G(gVar) || !m.a(splashPopPageConfig.f21970ar, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            bVar.A(gVar, 11, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.f21970ar);
        }
        if (!bVar.G(gVar) && m.a(splashPopPageConfig.idn, new SplashPopLanConfig(false, (String) null, 3, (f) null))) {
            return;
        }
        bVar.A(gVar, 12, SplashPopLanConfig$$serializer.INSTANCE, splashPopPageConfig.idn);
    }

    public final SplashPopLanConfig component1() {
        return this.f21971cn;
    }

    public final SplashPopLanConfig component10() {
        return this.f21978ru;
    }

    public final SplashPopLanConfig component11() {
        return this.it;
    }

    public final SplashPopLanConfig component12() {
        return this.f21970ar;
    }

    public final SplashPopLanConfig component13() {
        return this.idn;
    }

    public final SplashPopLanConfig component2() {
        return this.f21975jp;
    }

    public final SplashPopLanConfig component3() {
        return this.f21976kr;
    }

    public final SplashPopLanConfig component4() {
        return this.f21972en;
    }

    public final SplashPopLanConfig component5() {
        return this.f21973es;
    }

    public final SplashPopLanConfig component6() {
        return this.f21974fr;
    }

    public final SplashPopLanConfig component7() {
        return this.de;
    }

    public final SplashPopLanConfig component8() {
        return this.f21977pt;
    }

    public final SplashPopLanConfig component9() {
        return this.f21979vt;
    }

    public final SplashPopPageConfig copy(SplashPopLanConfig cn2, SplashPopLanConfig jp2, SplashPopLanConfig kr2, SplashPopLanConfig en2, SplashPopLanConfig es2, SplashPopLanConfig fr2, SplashPopLanConfig de, SplashPopLanConfig pt2, SplashPopLanConfig vt2, SplashPopLanConfig ru2, SplashPopLanConfig it, SplashPopLanConfig ar2, SplashPopLanConfig idn) {
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
        return new SplashPopPageConfig(cn2, jp2, kr2, en2, es2, fr2, de, pt2, vt2, ru2, it, ar2, idn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplashPopPageConfig)) {
            return false;
        }
        SplashPopPageConfig splashPopPageConfig = (SplashPopPageConfig) obj;
        return m.a(this.f21971cn, splashPopPageConfig.f21971cn) && m.a(this.f21975jp, splashPopPageConfig.f21975jp) && m.a(this.f21976kr, splashPopPageConfig.f21976kr) && m.a(this.f21972en, splashPopPageConfig.f21972en) && m.a(this.f21973es, splashPopPageConfig.f21973es) && m.a(this.f21974fr, splashPopPageConfig.f21974fr) && m.a(this.de, splashPopPageConfig.de) && m.a(this.f21977pt, splashPopPageConfig.f21977pt) && m.a(this.f21979vt, splashPopPageConfig.f21979vt) && m.a(this.f21978ru, splashPopPageConfig.f21978ru) && m.a(this.it, splashPopPageConfig.it) && m.a(this.f21970ar, splashPopPageConfig.f21970ar) && m.a(this.idn, splashPopPageConfig.idn);
    }

    public final SplashPopLanConfig getAr() {
        return this.f21970ar;
    }

    public final SplashPopLanConfig getCn() {
        return this.f21971cn;
    }

    public final SplashPopLanConfig getDe() {
        return this.de;
    }

    public final SplashPopLanConfig getEn() {
        return this.f21972en;
    }

    public final SplashPopLanConfig getEs() {
        return this.f21973es;
    }

    public final SplashPopLanConfig getFr() {
        return this.f21974fr;
    }

    public final SplashPopLanConfig getIdn() {
        return this.idn;
    }

    public final SplashPopLanConfig getIt() {
        return this.it;
    }

    public final SplashPopLanConfig getJp() {
        return this.f21975jp;
    }

    public final SplashPopLanConfig getKr() {
        return this.f21976kr;
    }

    public final SplashPopLanConfig getPt() {
        return this.f21977pt;
    }

    public final SplashPopLanConfig getRu() {
        return this.f21978ru;
    }

    public final SplashPopLanConfig getVt() {
        return this.f21979vt;
    }

    public int hashCode() {
        return this.idn.hashCode() + ((this.f21970ar.hashCode() + ((this.it.hashCode() + ((this.f21978ru.hashCode() + ((this.f21979vt.hashCode() + ((this.f21977pt.hashCode() + ((this.de.hashCode() + ((this.f21974fr.hashCode() + ((this.f21973es.hashCode() + ((this.f21972en.hashCode() + ((this.f21976kr.hashCode() + ((this.f21975jp.hashCode() + (this.f21971cn.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final void setAr(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.f21970ar = splashPopLanConfig;
    }

    public final void setCn(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.f21971cn = splashPopLanConfig;
    }

    public final void setDe(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.de = splashPopLanConfig;
    }

    public final void setEn(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.f21972en = splashPopLanConfig;
    }

    public final void setEs(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.f21973es = splashPopLanConfig;
    }

    public final void setFr(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.f21974fr = splashPopLanConfig;
    }

    public final void setIdn(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.idn = splashPopLanConfig;
    }

    public final void setIt(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.it = splashPopLanConfig;
    }

    public final void setJp(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.f21975jp = splashPopLanConfig;
    }

    public final void setKr(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.f21976kr = splashPopLanConfig;
    }

    public final void setPt(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.f21977pt = splashPopLanConfig;
    }

    public final void setRu(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.f21978ru = splashPopLanConfig;
    }

    public final void setVt(SplashPopLanConfig splashPopLanConfig) {
        m.f(splashPopLanConfig, "<set-?>");
        this.f21979vt = splashPopLanConfig;
    }

    public String toString() {
        return "SplashPopPageConfig(cn=" + this.f21971cn + ", jp=" + this.f21975jp + ", kr=" + this.f21976kr + ", en=" + this.f21972en + ", es=" + this.f21973es + ", fr=" + this.f21974fr + ", de=" + this.de + ", pt=" + this.f21977pt + ", vt=" + this.f21979vt + ", ru=" + this.f21978ru + ", it=" + this.it + ", ar=" + this.f21970ar + ", idn=" + this.idn + ")";
    }

    public /* synthetic */ SplashPopPageConfig(int i11, SplashPopLanConfig splashPopLanConfig, SplashPopLanConfig splashPopLanConfig2, SplashPopLanConfig splashPopLanConfig3, SplashPopLanConfig splashPopLanConfig4, SplashPopLanConfig splashPopLanConfig5, SplashPopLanConfig splashPopLanConfig6, SplashPopLanConfig splashPopLanConfig7, SplashPopLanConfig splashPopLanConfig8, SplashPopLanConfig splashPopLanConfig9, SplashPopLanConfig splashPopLanConfig10, SplashPopLanConfig splashPopLanConfig11, SplashPopLanConfig splashPopLanConfig12, SplashPopLanConfig splashPopLanConfig13, o1 o1Var) {
        this.f21971cn = (i11 & 1) == 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig;
        if ((i11 & 2) == 0) {
            this.f21975jp = new SplashPopLanConfig(false, (String) null, 3, (f) null);
        } else {
            this.f21975jp = splashPopLanConfig2;
        }
        if ((i11 & 4) == 0) {
            this.f21976kr = new SplashPopLanConfig(false, (String) null, 3, (f) null);
        } else {
            this.f21976kr = splashPopLanConfig3;
        }
        if ((i11 & 8) == 0) {
            this.f21972en = new SplashPopLanConfig(false, (String) null, 3, (f) null);
        } else {
            this.f21972en = splashPopLanConfig4;
        }
        if ((i11 & 16) == 0) {
            this.f21973es = new SplashPopLanConfig(false, (String) null, 3, (f) null);
        } else {
            this.f21973es = splashPopLanConfig5;
        }
        if ((i11 & 32) == 0) {
            this.f21974fr = new SplashPopLanConfig(false, (String) null, 3, (f) null);
        } else {
            this.f21974fr = splashPopLanConfig6;
        }
        if ((i11 & 64) == 0) {
            this.de = new SplashPopLanConfig(false, (String) null, 3, (f) null);
        } else {
            this.de = splashPopLanConfig7;
        }
        if ((i11 & 128) == 0) {
            this.f21977pt = new SplashPopLanConfig(false, (String) null, 3, (f) null);
        } else {
            this.f21977pt = splashPopLanConfig8;
        }
        if ((i11 & 256) == 0) {
            this.f21979vt = new SplashPopLanConfig(false, (String) null, 3, (f) null);
        } else {
            this.f21979vt = splashPopLanConfig9;
        }
        if ((i11 & 512) == 0) {
            this.f21978ru = new SplashPopLanConfig(false, (String) null, 3, (f) null);
        } else {
            this.f21978ru = splashPopLanConfig10;
        }
        this.it = (i11 & 1024) == 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig11;
        this.f21970ar = (i11 & 2048) == 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig12;
        this.idn = (i11 & 4096) == 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig13;
    }

    public SplashPopPageConfig(SplashPopLanConfig cn2, SplashPopLanConfig jp2, SplashPopLanConfig kr2, SplashPopLanConfig en2, SplashPopLanConfig es2, SplashPopLanConfig fr2, SplashPopLanConfig de, SplashPopLanConfig pt2, SplashPopLanConfig vt2, SplashPopLanConfig ru2, SplashPopLanConfig it, SplashPopLanConfig ar2, SplashPopLanConfig idn) {
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
        this.f21971cn = cn2;
        this.f21975jp = jp2;
        this.f21976kr = kr2;
        this.f21972en = en2;
        this.f21973es = es2;
        this.f21974fr = fr2;
        this.de = de;
        this.f21977pt = pt2;
        this.f21979vt = vt2;
        this.f21978ru = ru2;
        this.it = it;
        this.f21970ar = ar2;
        this.idn = idn;
    }

    public /* synthetic */ SplashPopPageConfig(SplashPopLanConfig splashPopLanConfig, SplashPopLanConfig splashPopLanConfig2, SplashPopLanConfig splashPopLanConfig3, SplashPopLanConfig splashPopLanConfig4, SplashPopLanConfig splashPopLanConfig5, SplashPopLanConfig splashPopLanConfig6, SplashPopLanConfig splashPopLanConfig7, SplashPopLanConfig splashPopLanConfig8, SplashPopLanConfig splashPopLanConfig9, SplashPopLanConfig splashPopLanConfig10, SplashPopLanConfig splashPopLanConfig11, SplashPopLanConfig splashPopLanConfig12, SplashPopLanConfig splashPopLanConfig13, int i11, f fVar) {
        this((i11 & 1) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig, (i11 & 2) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig2, (i11 & 4) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig3, (i11 & 8) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig4, (i11 & 16) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig5, (i11 & 32) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig6, (i11 & 64) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig7, (i11 & 128) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig8, (i11 & 256) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig9, (i11 & 512) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig10, (i11 & 1024) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig11, (i11 & 2048) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig12, (i11 & 4096) != 0 ? new SplashPopLanConfig(false, (String) null, 3, (f) null) : splashPopLanConfig13);
    }
}
