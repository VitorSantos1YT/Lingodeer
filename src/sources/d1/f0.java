package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0.g0 f22901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f22903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22904d;

    public f0(s0.g0 g0Var, long j11, e0 e0Var, boolean z11) {
        this.f22901a = g0Var;
        this.f22902b = j11;
        this.f22903c = e0Var;
        this.f22904d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f22901a == f0Var.f22901a && f2.b.c(this.f22902b, f0Var.f22902b) && this.f22903c == f0Var.f22903c && this.f22904d == f0Var.f22904d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22904d) + ((this.f22903c.hashCode() + defpackage.e.f(this.f22902b, this.f22901a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f22901a);
        sb2.append(", position=");
        sb2.append((Object) f2.b.j(this.f22902b));
        sb2.append(", anchor=");
        sb2.append(this.f22903c);
        sb2.append(", visible=");
        return ep.a.l(sb2, this.f22904d, ')');
    }
}
