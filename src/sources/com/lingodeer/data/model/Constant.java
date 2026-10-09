package com.lingodeer.data.model;

import c00.a;
import c00.e;
import com.google.android.material.datepicker.d;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.d1;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
@e
public final class Constant {
    public static final Companion Companion = new Companion(null);
    private final String VCV1;
    private final String VCV2;
    private final String VCV3;
    private final String cluster1;
    private final String cluster2;
    private final String cluster3;
    private final String coda1;
    private final String coda2;
    private final String coda3;
    private final String ipa;
    private final String onset1;
    private final String onset2;
    private final String onset3;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final a serializer() {
            return Constant$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public /* synthetic */ Constant(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, o1 o1Var) {
        if (1023 != (i11 & 1023)) {
            d1.k(i11, 1023, Constant$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.ipa = str;
        this.onset1 = str2;
        this.onset2 = str3;
        this.onset3 = str4;
        this.cluster1 = str5;
        this.cluster2 = str6;
        this.cluster3 = str7;
        this.coda1 = str8;
        this.coda2 = str9;
        this.coda3 = str10;
        if ((i11 & 1024) == 0) {
            this.VCV1 = BuildConfig.VERSION_NAME;
        } else {
            this.VCV1 = str11;
        }
        if ((i11 & 2048) == 0) {
            this.VCV2 = BuildConfig.VERSION_NAME;
        } else {
            this.VCV2 = str12;
        }
        if ((i11 & 4096) == 0) {
            this.VCV3 = BuildConfig.VERSION_NAME;
        } else {
            this.VCV3 = str13;
        }
    }

    public static /* synthetic */ Constant copy$default(Constant constant, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = constant.ipa;
        }
        return constant.copy(str, (i11 & 2) != 0 ? constant.onset1 : str2, (i11 & 4) != 0 ? constant.onset2 : str3, (i11 & 8) != 0 ? constant.onset3 : str4, (i11 & 16) != 0 ? constant.cluster1 : str5, (i11 & 32) != 0 ? constant.cluster2 : str6, (i11 & 64) != 0 ? constant.cluster3 : str7, (i11 & 128) != 0 ? constant.coda1 : str8, (i11 & 256) != 0 ? constant.coda2 : str9, (i11 & 512) != 0 ? constant.coda3 : str10, (i11 & 1024) != 0 ? constant.VCV1 : str11, (i11 & 2048) != 0 ? constant.VCV2 : str12, (i11 & 4096) != 0 ? constant.VCV3 : str13);
    }

    public static final /* synthetic */ void write$Self$data_release(Constant constant, b bVar, g gVar) {
        bVar.w(gVar, 0, constant.ipa);
        bVar.w(gVar, 1, constant.onset1);
        bVar.w(gVar, 2, constant.onset2);
        bVar.w(gVar, 3, constant.onset3);
        bVar.w(gVar, 4, constant.cluster1);
        bVar.w(gVar, 5, constant.cluster2);
        bVar.w(gVar, 6, constant.cluster3);
        bVar.w(gVar, 7, constant.coda1);
        bVar.w(gVar, 8, constant.coda2);
        bVar.w(gVar, 9, constant.coda3);
        if (bVar.G(gVar) || !m.a(constant.VCV1, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 10, constant.VCV1);
        }
        if (bVar.G(gVar) || !m.a(constant.VCV2, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 11, constant.VCV2);
        }
        if (!bVar.G(gVar) && m.a(constant.VCV3, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 12, constant.VCV3);
    }

    public final String component1() {
        return this.ipa;
    }

    public final String component10() {
        return this.coda3;
    }

    public final String component11() {
        return this.VCV1;
    }

    public final String component12() {
        return this.VCV2;
    }

    public final String component13() {
        return this.VCV3;
    }

    public final String component2() {
        return this.onset1;
    }

    public final String component3() {
        return this.onset2;
    }

    public final String component4() {
        return this.onset3;
    }

    public final String component5() {
        return this.cluster1;
    }

    public final String component6() {
        return this.cluster2;
    }

    public final String component7() {
        return this.cluster3;
    }

    public final String component8() {
        return this.coda1;
    }

    public final String component9() {
        return this.coda2;
    }

    public final Constant copy(String ipa, String onset1, String onset2, String onset3, String cluster1, String cluster2, String cluster3, String coda1, String coda2, String coda3, String VCV1, String VCV2, String VCV3) {
        m.f(ipa, "ipa");
        m.f(onset1, "onset1");
        m.f(onset2, "onset2");
        m.f(onset3, "onset3");
        m.f(cluster1, "cluster1");
        m.f(cluster2, "cluster2");
        m.f(cluster3, "cluster3");
        m.f(coda1, "coda1");
        m.f(coda2, "coda2");
        m.f(coda3, "coda3");
        m.f(VCV1, "VCV1");
        m.f(VCV2, "VCV2");
        m.f(VCV3, "VCV3");
        return new Constant(ipa, onset1, onset2, onset3, cluster1, cluster2, cluster3, coda1, coda2, coda3, VCV1, VCV2, VCV3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Constant)) {
            return false;
        }
        Constant constant = (Constant) obj;
        return m.a(this.ipa, constant.ipa) && m.a(this.onset1, constant.onset1) && m.a(this.onset2, constant.onset2) && m.a(this.onset3, constant.onset3) && m.a(this.cluster1, constant.cluster1) && m.a(this.cluster2, constant.cluster2) && m.a(this.cluster3, constant.cluster3) && m.a(this.coda1, constant.coda1) && m.a(this.coda2, constant.coda2) && m.a(this.coda3, constant.coda3) && m.a(this.VCV1, constant.VCV1) && m.a(this.VCV2, constant.VCV2) && m.a(this.VCV3, constant.VCV3);
    }

    public final String getCluster1() {
        return this.cluster1;
    }

    public final String getCluster2() {
        return this.cluster2;
    }

    public final String getCluster3() {
        return this.cluster3;
    }

    public final String getCoda1() {
        return this.coda1;
    }

    public final String getCoda2() {
        return this.coda2;
    }

    public final String getCoda3() {
        return this.coda3;
    }

    public final String getIpa() {
        return this.ipa;
    }

    public final String getOnset1() {
        return this.onset1;
    }

    public final String getOnset2() {
        return this.onset2;
    }

    public final String getOnset3() {
        return this.onset3;
    }

    public final String getVCV1() {
        return this.VCV1;
    }

    public final String getVCV2() {
        return this.VCV2;
    }

    public final String getVCV3() {
        return this.VCV3;
    }

    public int hashCode() {
        return this.VCV3.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(this.ipa.hashCode() * 31, 31, this.onset1), 31, this.onset2), 31, this.onset3), 31, this.cluster1), 31, this.cluster2), 31, this.cluster3), 31, this.coda1), 31, this.coda2), 31, this.coda3), 31, this.VCV1), 31, this.VCV2);
    }

    public String toString() {
        String str = this.ipa;
        String str2 = this.onset1;
        String str3 = this.onset2;
        String str4 = this.onset3;
        String str5 = this.cluster1;
        String str6 = this.cluster2;
        String str7 = this.cluster3;
        String str8 = this.coda1;
        String str9 = this.coda2;
        String str10 = this.coda3;
        String str11 = this.VCV1;
        String str12 = this.VCV2;
        String str13 = this.VCV3;
        StringBuilder sbS = defpackage.e.s("Constant(ipa=", str, ", onset1=", str2, ", onset2=");
        d.w(sbS, str3, ", onset3=", str4, ", cluster1=");
        d.w(sbS, str5, ", cluster2=", str6, ", cluster3=");
        d.w(sbS, str7, ", coda1=", str8, ", coda2=");
        d.w(sbS, str9, ", coda3=", str10, ", VCV1=");
        d.w(sbS, str11, ", VCV2=", str12, ", VCV3=");
        return ep.a.k(sbS, str13, ")");
    }

    public Constant(String ipa, String onset1, String onset2, String onset3, String cluster1, String cluster2, String cluster3, String coda1, String str, String coda3, String VCV1, String str2, String VCV3) {
        m.f(ipa, "ipa");
        m.f(onset1, "onset1");
        m.f(onset2, "onset2");
        m.f(onset3, "onset3");
        m.f(cluster1, "cluster1");
        m.f(cluster2, "cluster2");
        m.f(cluster3, "cluster3");
        m.f(coda1, "coda1");
        m.f(str, kHfjNGauVgdF.GgygsB);
        m.f(coda3, "coda3");
        m.f(VCV1, "VCV1");
        m.f(str2, anrPHlQ.fMlgNYnUaIT);
        m.f(VCV3, "VCV3");
        this.ipa = ipa;
        this.onset1 = onset1;
        this.onset2 = onset2;
        this.onset3 = onset3;
        this.cluster1 = cluster1;
        this.cluster2 = cluster2;
        this.cluster3 = cluster3;
        this.coda1 = coda1;
        this.coda2 = str;
        this.coda3 = coda3;
        this.VCV1 = VCV1;
        this.VCV2 = str2;
        this.VCV3 = VCV3;
    }

    public /* synthetic */ Constant(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i11, f fVar) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i11 & 1024) != 0 ? BuildConfig.VERSION_NAME : str11, (i11 & 2048) != 0 ? BuildConfig.VERSION_NAME : str12, (i11 & 4096) != 0 ? BuildConfig.VERSION_NAME : str13);
    }
}
