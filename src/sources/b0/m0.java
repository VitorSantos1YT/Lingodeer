package b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f3606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f3607b;

    public m0(Float f5, z zVar) {
        this.f3606a = f5;
        this.f3607b = zVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return m0Var.f3606a.equals(this.f3606a) && kotlin.jvm.internal.m.a(m0Var.f3607b, this.f3607b);
    }

    public final int hashCode() {
        return this.f3607b.hashCode() + defpackage.e.b(0, this.f3606a.hashCode() * 31, 31);
    }
}
