package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f25040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25042c;

    public s(e1 e1Var, int i11, int i12) {
        this.f25040a = e1Var;
        this.f25041b = i11;
        this.f25042c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f25040a == sVar.f25040a && this.f25041b == sVar.f25041b && this.f25042c == sVar.f25042c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25042c) + defpackage.e.b(this.f25041b, this.f25040a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.f25040a + ", horizontalAlignment=" + ((Object) k6.a.b(this.f25041b)) + ", verticalAlignment=" + ((Object) k6.b.b(this.f25042c)) + ')';
    }
}
