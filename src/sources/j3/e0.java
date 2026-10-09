package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f35687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35688c;

    public e0(long j11, int i11, long j12) {
        this.f35686a = j11;
        this.f35687b = j12;
        this.f35688c = i11;
        v3.p[] pVarArr = v3.o.f53500b;
        if ((j11 & 1095216660480L) == 0) {
            p3.a.a("width cannot be TextUnit.Unspecified");
        }
        if ((j12 & 1095216660480L) == 0) {
            p3.a.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return v3.o.a(this.f35686a, e0Var.f35686a) && v3.o.a(this.f35687b, e0Var.f35687b) && this.f35688c == e0Var.f35688c;
    }

    public final int hashCode() {
        v3.p[] pVarArr = v3.o.f53500b;
        return Integer.hashCode(this.f35688c) + defpackage.e.f(this.f35687b, Long.hashCode(this.f35686a) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Placeholder(width=");
        sb2.append((Object) v3.o.f(this.f35686a));
        sb2.append(", height=");
        sb2.append((Object) v3.o.f(this.f35687b));
        sb2.append(", placeholderVerticalAlign=");
        int i11 = this.f35688c;
        if (i11 == 1) {
            str = "AboveBaseline";
        } else if (i11 == 2) {
            str = "Top";
        } else if (i11 == 3) {
            str = "Bottom";
        } else if (i11 == 4) {
            str = "Center";
        } else if (i11 == 5) {
            str = "TextTop";
        } else if (i11 == 6) {
            str = "TextBottom";
        } else {
            str = i11 == 7 ? "TextCenter" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
