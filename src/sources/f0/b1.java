package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26196c;

    public b1(long j11, long j12, boolean z11) {
        this.f26194a = j11;
        this.f26195b = j12;
        this.f26196c = z11;
    }

    public final b1 a(b1 b1Var) {
        return new b1(f2.b.h(this.f26194a, b1Var.f26194a), Math.max(this.f26195b, b1Var.f26195b), this.f26196c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return f2.b.c(this.f26194a, b1Var.f26194a) && this.f26195b == b1Var.f26195b && this.f26196c == b1Var.f26196c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26196c) + defpackage.e.f(this.f26195b, Long.hashCode(this.f26194a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MouseWheelScrollDelta(value=");
        sb2.append((Object) f2.b.j(this.f26194a));
        sb2.append(", timeMillis=");
        sb2.append(this.f26195b);
        sb2.append(", shouldApplyImmediately=");
        return ep.a.l(sb2, this.f26196c, ')');
    }
}
