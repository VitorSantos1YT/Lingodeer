package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f38531b;

    public m0(int i11, h0 h0Var) {
        this.f38530a = i11;
        this.f38531b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f38530a == m0Var.f38530a && kotlin.jvm.internal.m.a(this.f38531b, m0Var.f38531b);
    }

    public final int hashCode() {
        return this.f38531b.hashCode() + (Integer.hashCode(this.f38530a) * 31);
    }

    public final String toString() {
        return "Success(keyLanguage=" + this.f38530a + ", settings=" + this.f38531b + ")";
    }
}
