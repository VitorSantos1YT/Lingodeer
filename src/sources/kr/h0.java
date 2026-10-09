package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f38483h;

    public h0(int i11, int i12, boolean z11, boolean z12, int i13, int i14, int i15, boolean z13) {
        this.f38476a = i11;
        this.f38477b = i12;
        this.f38478c = z11;
        this.f38479d = z12;
        this.f38480e = i13;
        this.f38481f = i14;
        this.f38482g = i15;
        this.f38483h = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f38476a == h0Var.f38476a && this.f38477b == h0Var.f38477b && this.f38478c == h0Var.f38478c && this.f38479d == h0Var.f38479d && this.f38480e == h0Var.f38480e && this.f38481f == h0Var.f38481f && this.f38482g == h0Var.f38482g && this.f38483h == h0Var.f38483h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38483h) + defpackage.e.b(this.f38482g, defpackage.e.b(this.f38481f, defpackage.e.b(this.f38480e, defpackage.e.e(defpackage.e.e(defpackage.e.b(this.f38477b, Integer.hashCode(this.f38476a) * 31, 31), 31, this.f38478c), 31, this.f38479d), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("StorySettings(scriptStyle=", this.f38476a, ", scriptShortcutDisplay=", this.f38477b, ", soundEffect=");
        ep.a.B(", animation=", ", fontSizeStyle=", sbK, this.f38478c, this.f38479d);
        ep.a.v(this.f38480e, this.f38481f, ", backgroundStyle=", ", audioSpeed=", sbK);
        sbK.append(this.f38482g);
        sbK.append(", showStoryTrans=");
        sbK.append(this.f38483h);
        sbK.append(")");
        return sbK.toString();
    }
}
