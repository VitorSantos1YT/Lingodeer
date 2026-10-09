package com.lingodeer.data.model;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class MFSource {

    /* JADX INFO: renamed from: ar, reason: collision with root package name */
    private Main f22312ar;

    /* JADX INFO: renamed from: cn, reason: collision with root package name */
    private Main f22313cn;
    private Main cnup;
    private Main deoc;

    /* JADX INFO: renamed from: en, reason: collision with root package name */
    private Main f22314en;
    private Main enes;
    private Main esoc;
    private Main esus;
    private Main froc;
    private Main frus;
    private Main gre;

    /* JADX INFO: renamed from: hi, reason: collision with root package name */
    private Main f22315hi;
    private Main itoc;

    /* JADX INFO: renamed from: jp, reason: collision with root package name */
    private Main f22316jp;
    private Main jpup;

    /* JADX INFO: renamed from: kr, reason: collision with root package name */
    private Main f22317kr;
    private Main krup;

    /* JADX INFO: renamed from: pt, reason: collision with root package name */
    private Main f22318pt;
    private Main ruoc;
    private Main thai;
    private Main tur;
    private Main ukr;

    /* JADX INFO: renamed from: vt, reason: collision with root package name */
    private Main f22319vt;

    public MFSource() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public static /* synthetic */ MFSource copy$default(MFSource mFSource, Main main, Main main2, Main main3, Main main4, Main main5, Main main6, Main main7, Main main8, Main main9, Main main10, Main main11, Main main12, Main main13, Main main14, Main main15, Main main16, Main main17, Main main18, Main main19, Main main20, Main main21, Main main22, Main main23, int i11, Object obj) {
        Main main24;
        Main main25;
        Main main26 = (i11 & 1) != 0 ? mFSource.f22313cn : main;
        Main main27 = (i11 & 2) != 0 ? mFSource.f22316jp : main2;
        Main main28 = (i11 & 4) != 0 ? mFSource.f22317kr : main3;
        Main main29 = (i11 & 8) != 0 ? mFSource.f22314en : main4;
        Main main30 = (i11 & 16) != 0 ? mFSource.esoc : main5;
        Main main31 = (i11 & 32) != 0 ? mFSource.froc : main6;
        Main main32 = (i11 & 64) != 0 ? mFSource.deoc : main7;
        Main main33 = (i11 & 128) != 0 ? mFSource.f22318pt : main8;
        Main main34 = (i11 & 256) != 0 ? mFSource.f22319vt : main9;
        Main main35 = (i11 & 512) != 0 ? mFSource.ruoc : main10;
        Main main36 = (i11 & 1024) != 0 ? mFSource.itoc : main11;
        Main main37 = (i11 & 2048) != 0 ? mFSource.cnup : main12;
        Main main38 = (i11 & 4096) != 0 ? mFSource.jpup : main13;
        Main main39 = (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? mFSource.krup : main14;
        Main main40 = main26;
        Main main41 = (i11 & 16384) != 0 ? mFSource.esus : main15;
        Main main42 = (i11 & 32768) != 0 ? mFSource.enes : main16;
        Main main43 = (i11 & 65536) != 0 ? mFSource.frus : main17;
        Main main44 = (i11 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? mFSource.f22312ar : main18;
        Main main45 = (i11 & 262144) != 0 ? mFSource.thai : main19;
        Main main46 = (i11 & 524288) != 0 ? mFSource.tur : main20;
        Main main47 = (i11 & 1048576) != 0 ? mFSource.f22315hi : main21;
        Main main48 = (i11 & 2097152) != 0 ? mFSource.ukr : main22;
        if ((i11 & 4194304) != 0) {
            main25 = main48;
            main24 = mFSource.gre;
        } else {
            main24 = main23;
            main25 = main48;
        }
        return mFSource.copy(main40, main27, main28, main29, main30, main31, main32, main33, main34, main35, main36, main37, main38, main39, main41, main42, main43, main44, main45, main46, main47, main25, main24);
    }

    public final Main component1() {
        return this.f22313cn;
    }

    public final Main component10() {
        return this.ruoc;
    }

    public final Main component11() {
        return this.itoc;
    }

    public final Main component12() {
        return this.cnup;
    }

    public final Main component13() {
        return this.jpup;
    }

    public final Main component14() {
        return this.krup;
    }

    public final Main component15() {
        return this.esus;
    }

    public final Main component16() {
        return this.enes;
    }

    public final Main component17() {
        return this.frus;
    }

    public final Main component18() {
        return this.f22312ar;
    }

    public final Main component19() {
        return this.thai;
    }

    public final Main component2() {
        return this.f22316jp;
    }

    public final Main component20() {
        return this.tur;
    }

    public final Main component21() {
        return this.f22315hi;
    }

    public final Main component22() {
        return this.ukr;
    }

    public final Main component23() {
        return this.gre;
    }

    public final Main component3() {
        return this.f22317kr;
    }

    public final Main component4() {
        return this.f22314en;
    }

    public final Main component5() {
        return this.esoc;
    }

    public final Main component6() {
        return this.froc;
    }

    public final Main component7() {
        return this.deoc;
    }

    public final Main component8() {
        return this.f22318pt;
    }

    public final Main component9() {
        return this.f22319vt;
    }

    public final MFSource copy(Main cn2, Main jp2, Main kr2, Main en2, Main esoc, Main froc, Main deoc, Main pt2, Main vt2, Main ruoc, Main itoc, Main cnup, Main jpup, Main krup, Main esus, Main enes, Main frus, Main ar2, Main thai, Main tur, Main hi2, Main ukr, Main gre) {
        m.f(cn2, "cn");
        m.f(jp2, "jp");
        m.f(kr2, "kr");
        m.f(en2, "en");
        m.f(esoc, "esoc");
        m.f(froc, "froc");
        m.f(deoc, "deoc");
        m.f(pt2, "pt");
        m.f(vt2, "vt");
        m.f(ruoc, "ruoc");
        m.f(itoc, "itoc");
        m.f(cnup, "cnup");
        m.f(jpup, "jpup");
        m.f(krup, "krup");
        m.f(esus, "esus");
        m.f(enes, "enes");
        m.f(frus, "frus");
        m.f(ar2, "ar");
        m.f(thai, "thai");
        m.f(tur, "tur");
        m.f(hi2, "hi");
        m.f(ukr, "ukr");
        m.f(gre, "gre");
        return new MFSource(cn2, jp2, kr2, en2, esoc, froc, deoc, pt2, vt2, ruoc, itoc, cnup, jpup, krup, esus, enes, frus, ar2, thai, tur, hi2, ukr, gre);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MFSource)) {
            return false;
        }
        MFSource mFSource = (MFSource) obj;
        return m.a(this.f22313cn, mFSource.f22313cn) && m.a(this.f22316jp, mFSource.f22316jp) && m.a(this.f22317kr, mFSource.f22317kr) && m.a(this.f22314en, mFSource.f22314en) && m.a(this.esoc, mFSource.esoc) && m.a(this.froc, mFSource.froc) && m.a(this.deoc, mFSource.deoc) && m.a(this.f22318pt, mFSource.f22318pt) && m.a(this.f22319vt, mFSource.f22319vt) && m.a(this.ruoc, mFSource.ruoc) && m.a(this.itoc, mFSource.itoc) && m.a(this.cnup, mFSource.cnup) && m.a(this.jpup, mFSource.jpup) && m.a(this.krup, mFSource.krup) && m.a(this.esus, mFSource.esus) && m.a(this.enes, mFSource.enes) && m.a(this.frus, mFSource.frus) && m.a(this.f22312ar, mFSource.f22312ar) && m.a(this.thai, mFSource.thai) && m.a(this.tur, mFSource.tur) && m.a(this.f22315hi, mFSource.f22315hi) && m.a(this.ukr, mFSource.ukr) && m.a(this.gre, mFSource.gre);
    }

    public final Main getAr() {
        return this.f22312ar;
    }

    public final Main getCn() {
        return this.f22313cn;
    }

    public final Main getCnup() {
        return this.cnup;
    }

    public final Main getDeoc() {
        return this.deoc;
    }

    public final Main getEn() {
        return this.f22314en;
    }

    public final Main getEnes() {
        return this.enes;
    }

    public final Main getEsoc() {
        return this.esoc;
    }

    public final Main getEsus() {
        return this.esus;
    }

    public final Main getFroc() {
        return this.froc;
    }

    public final Main getFrus() {
        return this.frus;
    }

    public final Main getGre() {
        return this.gre;
    }

    public final Main getHi() {
        return this.f22315hi;
    }

    public final Main getItoc() {
        return this.itoc;
    }

    public final Main getJp() {
        return this.f22316jp;
    }

    public final Main getJpup() {
        return this.jpup;
    }

    public final Main getKr() {
        return this.f22317kr;
    }

    public final Main getKrup() {
        return this.krup;
    }

    public final Main getPt() {
        return this.f22318pt;
    }

    public final Main getRuoc() {
        return this.ruoc;
    }

    public final Main getThai() {
        return this.thai;
    }

    public final Main getTur() {
        return this.tur;
    }

    public final Main getUkr() {
        return this.ukr;
    }

    public final Main getVt() {
        return this.f22319vt;
    }

    public int hashCode() {
        return this.gre.hashCode() + d.d(this.ukr, d.d(this.f22315hi, d.d(this.tur, d.d(this.thai, d.d(this.f22312ar, d.d(this.frus, d.d(this.enes, d.d(this.esus, d.d(this.krup, d.d(this.jpup, d.d(this.cnup, d.d(this.itoc, d.d(this.ruoc, d.d(this.f22319vt, d.d(this.f22318pt, d.d(this.deoc, d.d(this.froc, d.d(this.esoc, d.d(this.f22314en, d.d(this.f22317kr, d.d(this.f22316jp, this.f22313cn.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setAr(Main main) {
        m.f(main, "<set-?>");
        this.f22312ar = main;
    }

    public final void setCn(Main main) {
        m.f(main, "<set-?>");
        this.f22313cn = main;
    }

    public final void setCnup(Main main) {
        m.f(main, "<set-?>");
        this.cnup = main;
    }

    public final void setDeoc(Main main) {
        m.f(main, "<set-?>");
        this.deoc = main;
    }

    public final void setEn(Main main) {
        m.f(main, "<set-?>");
        this.f22314en = main;
    }

    public final void setEnes(Main main) {
        m.f(main, "<set-?>");
        this.enes = main;
    }

    public final void setEsoc(Main main) {
        m.f(main, "<set-?>");
        this.esoc = main;
    }

    public final void setEsus(Main main) {
        m.f(main, "<set-?>");
        this.esus = main;
    }

    public final void setFroc(Main main) {
        m.f(main, "<set-?>");
        this.froc = main;
    }

    public final void setFrus(Main main) {
        m.f(main, "<set-?>");
        this.frus = main;
    }

    public final void setGre(Main main) {
        m.f(main, "<set-?>");
        this.gre = main;
    }

    public final void setHi(Main main) {
        m.f(main, "<set-?>");
        this.f22315hi = main;
    }

    public final void setItoc(Main main) {
        m.f(main, "<set-?>");
        this.itoc = main;
    }

    public final void setJp(Main main) {
        m.f(main, "<set-?>");
        this.f22316jp = main;
    }

    public final void setJpup(Main main) {
        m.f(main, "<set-?>");
        this.jpup = main;
    }

    public final void setKr(Main main) {
        m.f(main, "<set-?>");
        this.f22317kr = main;
    }

    public final void setKrup(Main main) {
        m.f(main, "<set-?>");
        this.krup = main;
    }

    public final void setPt(Main main) {
        m.f(main, "<set-?>");
        this.f22318pt = main;
    }

    public final void setRuoc(Main main) {
        m.f(main, "<set-?>");
        this.ruoc = main;
    }

    public final void setThai(Main main) {
        m.f(main, "<set-?>");
        this.thai = main;
    }

    public final void setTur(Main main) {
        m.f(main, "<set-?>");
        this.tur = main;
    }

    public final void setUkr(Main main) {
        m.f(main, "<set-?>");
        this.ukr = main;
    }

    public final void setVt(Main main) {
        m.f(main, "<set-?>");
        this.f22319vt = main;
    }

    public String toString() {
        return "MFSource(cn=" + this.f22313cn + ", jp=" + this.f22316jp + ", kr=" + this.f22317kr + ", en=" + this.f22314en + ", esoc=" + this.esoc + ", froc=" + this.froc + ", deoc=" + this.deoc + ", pt=" + this.f22318pt + ", vt=" + this.f22319vt + ", ruoc=" + this.ruoc + ", itoc=" + this.itoc + ", cnup=" + this.cnup + ", jpup=" + this.jpup + ", krup=" + this.krup + ", esus=" + this.esus + ", enes=" + this.enes + ", frus=" + this.frus + ", ar=" + this.f22312ar + ", thai=" + this.thai + ", tur=" + this.tur + ", hi=" + this.f22315hi + ", ukr=" + this.ukr + ", gre=" + this.gre + ")";
    }

    public MFSource(Main cn2, Main jp2, Main main, Main en2, Main esoc, Main froc, Main deoc, Main pt2, Main vt2, Main ruoc, Main itoc, Main cnup, Main jpup, Main krup, Main esus, Main enes, Main frus, Main ar2, Main thai, Main tur, Main hi2, Main ukr, Main gre) {
        m.f(cn2, "cn");
        m.f(jp2, "jp");
        m.f(main, IMCc.Ayh);
        m.f(en2, "en");
        m.f(esoc, "esoc");
        m.f(froc, "froc");
        m.f(deoc, "deoc");
        m.f(pt2, "pt");
        m.f(vt2, "vt");
        m.f(ruoc, "ruoc");
        m.f(itoc, "itoc");
        m.f(cnup, "cnup");
        m.f(jpup, "jpup");
        m.f(krup, "krup");
        m.f(esus, "esus");
        m.f(enes, "enes");
        m.f(frus, "frus");
        m.f(ar2, "ar");
        m.f(thai, "thai");
        m.f(tur, "tur");
        m.f(hi2, "hi");
        m.f(ukr, "ukr");
        m.f(gre, "gre");
        this.f22313cn = cn2;
        this.f22316jp = jp2;
        this.f22317kr = main;
        this.f22314en = en2;
        this.esoc = esoc;
        this.froc = froc;
        this.deoc = deoc;
        this.f22318pt = pt2;
        this.f22319vt = vt2;
        this.ruoc = ruoc;
        this.itoc = itoc;
        this.cnup = cnup;
        this.jpup = jpup;
        this.krup = krup;
        this.esus = esus;
        this.enes = enes;
        this.frus = frus;
        this.f22312ar = ar2;
        this.thai = thai;
        this.tur = tur;
        this.f22315hi = hi2;
        this.ukr = ukr;
        this.gre = gre;
    }

    public /* synthetic */ MFSource(Main main, Main main2, Main main3, Main main4, Main main5, Main main6, Main main7, Main main8, Main main9, Main main10, Main main11, Main main12, Main main13, Main main14, Main main15, Main main16, Main main17, Main main18, Main main19, Main main20, Main main21, Main main22, Main main23, int i11, f fVar) {
        this((i11 & 1) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main, (i11 & 2) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main2, (i11 & 4) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main3, (i11 & 8) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main4, (i11 & 16) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main5, (i11 & 32) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main6, (i11 & 64) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main7, (i11 & 128) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main8, (i11 & 256) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main9, (i11 & 512) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main10, (i11 & 1024) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main11, (i11 & 2048) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main12, (i11 & 4096) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main13, (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main14, (i11 & 16384) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main15, (i11 & 32768) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main16, (i11 & 65536) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main17, (i11 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main18, (i11 & 262144) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main19, (i11 & 524288) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main20, (i11 & 1048576) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main21, (i11 & 2097152) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main22, (i11 & 4194304) != 0 ? new Main(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null) : main23);
    }
}
