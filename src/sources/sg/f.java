package sg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f51637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f51640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f51641e;

    public f(char c11, int i11, int i12, String str, String str2) {
        this.f51637a = c11;
        this.f51638b = i11;
        this.f51639c = i12;
        this.f51640d = str;
        this.f51641e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f51637a == fVar.f51637a && this.f51638b == fVar.f51638b && this.f51639c == fVar.f51639c && kotlin.jvm.internal.m.a(this.f51640d, fVar.f51640d) && kotlin.jvm.internal.m.a(this.f51641e, fVar.f51641e);
    }

    public final int hashCode() {
        return this.f51641e.hashCode() + defpackage.e.d(defpackage.e.b(this.f51639c, defpackage.e.b(this.f51638b, Character.hashCode(this.f51637a) * 31, 31), 31), 31, this.f51640d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AstFencedCodeBlock(fenceChar=");
        sb2.append(this.f51637a);
        sb2.append(", fenceLength=");
        sb2.append(this.f51638b);
        sb2.append(", fenceIndent=");
        sb2.append(this.f51639c);
        sb2.append(", info=");
        sb2.append(this.f51640d);
        sb2.append(", literal=");
        return ep.a.k(sb2, this.f51641e, ")");
    }
}
