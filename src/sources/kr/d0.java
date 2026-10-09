package kr;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f38445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f38446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f38448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ir.a f38449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f38450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f38451l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f38452n;

    public d0(List sentences, List picArray, int i11, int i12, boolean z11, long j11, long j12, boolean z12, int i13, ir.a aVar, boolean z13, boolean z14, boolean z15, boolean z16) {
        kotlin.jvm.internal.m.f(sentences, "sentences");
        kotlin.jvm.internal.m.f(picArray, "picArray");
        this.f38440a = sentences;
        this.f38441b = picArray;
        this.f38442c = i11;
        this.f38443d = i12;
        this.f38444e = z11;
        this.f38445f = j11;
        this.f38446g = j12;
        this.f38447h = z12;
        this.f38448i = i13;
        this.f38449j = aVar;
        this.f38450k = z13;
        this.f38451l = z14;
        this.m = z15;
        this.f38452n = z16;
    }

    public static d0 a(d0 d0Var, int i11, int i12, boolean z11, long j11, long j12, boolean z12, int i13, ir.a aVar, boolean z13, boolean z14, boolean z15, boolean z16, int i14) {
        List sentences = d0Var.f38440a;
        List picArray = d0Var.f38441b;
        int i15 = (i14 & 4) != 0 ? d0Var.f38442c : i11;
        int i16 = (i14 & 8) != 0 ? d0Var.f38443d : i12;
        boolean z17 = (i14 & 16) != 0 ? d0Var.f38444e : z11;
        long j13 = (i14 & 32) != 0 ? d0Var.f38445f : j11;
        long j14 = (i14 & 64) != 0 ? d0Var.f38446g : j12;
        boolean z18 = (i14 & 128) != 0 ? d0Var.f38447h : z12;
        int i17 = (i14 & 256) != 0 ? d0Var.f38448i : i13;
        ir.a aVar2 = (i14 & 512) != 0 ? d0Var.f38449j : aVar;
        boolean z19 = (i14 & 1024) != 0 ? d0Var.f38450k : z13;
        boolean z20 = (i14 & 2048) != 0 ? d0Var.f38451l : z14;
        int i18 = i15;
        boolean z21 = (i14 & 4096) != 0 ? d0Var.m : z15;
        boolean z22 = (i14 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? d0Var.f38452n : z16;
        kotlin.jvm.internal.m.f(sentences, "sentences");
        kotlin.jvm.internal.m.f(picArray, "picArray");
        return new d0(sentences, picArray, i18, i16, z17, j13, j14, z18, i17, aVar2, z19, z20, z21, z22);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.m.a(this.f38440a, d0Var.f38440a) && kotlin.jvm.internal.m.a(this.f38441b, d0Var.f38441b) && this.f38442c == d0Var.f38442c && this.f38443d == d0Var.f38443d && this.f38444e == d0Var.f38444e && this.f38445f == d0Var.f38445f && this.f38446g == d0Var.f38446g && this.f38447h == d0Var.f38447h && this.f38448i == d0Var.f38448i && kotlin.jvm.internal.m.a(this.f38449j, d0Var.f38449j) && this.f38450k == d0Var.f38450k && this.f38451l == d0Var.f38451l && this.m == d0Var.m && this.f38452n == d0Var.f38452n;
    }

    public final int hashCode() {
        int iB = defpackage.e.b(this.f38448i, defpackage.e.e(defpackage.e.f(this.f38446g, defpackage.e.f(this.f38445f, defpackage.e.e(defpackage.e.b(this.f38443d, defpackage.e.b(this.f38442c, hh.p0.b(this.f38440a.hashCode() * 31, 31, this.f38441b), 31), 31), 31, this.f38444e), 31), 31), 31, this.f38447h), 31);
        ir.a aVar = this.f38449j;
        return Boolean.hashCode(this.f38452n) + defpackage.e.e(defpackage.e.e(defpackage.e.e((iB + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f38450k), 31, this.f38451l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(sentences=");
        sb2.append(this.f38440a);
        sb2.append(", picArray=");
        sb2.append(this.f38441b);
        sb2.append(", currentIndex=");
        ep.a.v(this.f38442c, this.f38443d, ", currentPlayWordIndex=", ", isPlaying=", sb2);
        sb2.append(this.f38444e);
        sb2.append(", playingPosition=");
        sb2.append(this.f38445f);
        ep.a.y(this.f38446g, ", audioDuration=", ", showTranslation=", sb2);
        sb2.append(this.f38447h);
        sb2.append(", audioSpeed=");
        sb2.append(this.f38448i);
        sb2.append(", currentQuestion=");
        sb2.append(this.f38449j);
        sb2.append(", showQuestion=");
        sb2.append(this.f38450k);
        sb2.append(", hasPrevious=");
        ep.a.B(", hasNext=", ", isFinishing=", sb2, this.f38451l, this.m);
        return hh.p0.p(sb2, this.f38452n, ")");
    }
}
