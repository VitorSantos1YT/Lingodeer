package bv;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6300b;

    public g0(int i11, String str) {
        this.f6299a = i11;
        this.f6300b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f6299a == g0Var.f6299a && kotlin.jvm.internal.m.a(this.f6300b, g0Var.f6300b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f6299a) * 31;
        String str = this.f6300b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Error(errId=" + this.f6299a + ", message=" + this.f6300b + ")";
    }
}
