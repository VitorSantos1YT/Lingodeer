package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ir.b f38410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f38415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f38416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f38417h;

    public a1(ir.b bVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i11) {
        this.f38410a = bVar;
        this.f38411b = z11;
        this.f38412c = z12;
        this.f38413d = z13;
        this.f38414e = z14;
        this.f38415f = z15;
        this.f38416g = z16;
        this.f38417h = i11;
    }

    public static a1 a(a1 a1Var, ir.b bVar, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, int i12) {
        if ((i12 & 1) != 0) {
            bVar = a1Var.f38410a;
        }
        ir.b bVar2 = bVar;
        if ((i12 & 2) != 0) {
            z11 = a1Var.f38411b;
        }
        boolean z16 = z11;
        if ((i12 & 4) != 0) {
            z12 = a1Var.f38412c;
        }
        boolean z17 = z12;
        if ((i12 & 8) != 0) {
            z13 = a1Var.f38413d;
        }
        boolean z18 = z13;
        if ((i12 & 16) != 0) {
            z14 = a1Var.f38414e;
        }
        boolean z19 = z14;
        boolean z20 = (i12 & 32) != 0 ? a1Var.f38415f : true;
        if ((i12 & 64) != 0) {
            z15 = a1Var.f38416g;
        }
        boolean z21 = z15;
        int i13 = (i12 & 128) != 0 ? a1Var.f38417h : i11;
        a1Var.getClass();
        return new a1(bVar2, z16, z17, z18, z19, z20, z21, i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return kotlin.jvm.internal.m.a(this.f38410a, a1Var.f38410a) && this.f38411b == a1Var.f38411b && this.f38412c == a1Var.f38412c && this.f38413d == a1Var.f38413d && this.f38414e == a1Var.f38414e && this.f38415f == a1Var.f38415f && this.f38416g == a1Var.f38416g && this.f38417h == a1Var.f38417h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38417h) + defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(defpackage.e.e(this.f38410a.hashCode() * 31, 31, this.f38411b), 31, this.f38412c), 31, this.f38413d), 31, this.f38414e), 31, this.f38415f), 31, this.f38416g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StorySpeakingSentence(storySentence=");
        sb2.append(this.f38410a);
        sb2.append(", isPlaying=");
        sb2.append(this.f38411b);
        sb2.append(", isRecording=");
        ep.a.B(", isPlayingUserRecord=", ", isGettingSpeechScore=", sb2, this.f38412c, this.f38413d);
        ep.a.B(", hasUserRecord=", ", isCurrentOpen=", sb2, this.f38414e, this.f38415f);
        sb2.append(this.f38416g);
        sb2.append(", currentPlayWordIndex=");
        sb2.append(this.f38417h);
        sb2.append(")");
        return sb2.toString();
    }
}
