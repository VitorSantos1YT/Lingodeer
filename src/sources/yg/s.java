package yg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57844b;

    public s(String name, boolean z11) {
        kotlin.jvm.internal.m.f(name, "name");
        this.f57843a = name;
        this.f57844b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.m.a(this.f57843a, sVar.f57843a) && this.f57844b == sVar.f57844b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + defpackage.e.e(this.f57843a.hashCode() * 31, 31, this.f57844b);
    }

    public final String toString() {
        return "FeatureDetail(name=" + this.f57843a + ", inFree=" + this.f57844b + ", inPremium=true)";
    }
}
