package ys;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f58143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f58145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f58146e;

    public l3(int i11, String title, int i12, long j11, n0 type) {
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(type, "type");
        this.f58142a = i11;
        this.f58143b = title;
        this.f58144c = i12;
        this.f58145d = j11;
        this.f58146e = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return this.f58142a == l3Var.f58142a && kotlin.jvm.internal.m.a(this.f58143b, l3Var.f58143b) && this.f58144c == l3Var.f58144c && g2.x.d(this.f58145d, l3Var.f58145d) && this.f58146e == l3Var.f58146e;
    }

    public final int hashCode() {
        int iB = defpackage.e.b(this.f58144c, defpackage.e.d(Integer.hashCode(this.f58142a) * 31, 31, this.f58143b), 31);
        int i11 = g2.x.f28623j;
        return this.f58146e.hashCode() + defpackage.e.f(this.f58145d, iB, 31);
    }

    public final String toString() {
        return "MetricData(icon=" + this.f58142a + ", title=" + this.f58143b + ", value=" + this.f58144c + ", color=" + g2.x.j(this.f58145d) + ", type=" + this.f58146e + ")";
    }
}
