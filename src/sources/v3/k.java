package v3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f53493e = new k(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f53495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f53496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f53497d;

    public k(int i11, int i12, int i13, int i14) {
        this.f53494a = i11;
        this.f53495b = i12;
        this.f53496c = i13;
        this.f53497d = i14;
    }

    public final long a() {
        int iD = (d() / 2) + this.f53494a;
        return (((long) ((b() / 2) + this.f53495b)) & 4294967295L) | (((long) iD) << 32);
    }

    public final int b() {
        return this.f53497d - this.f53495b;
    }

    public final long c() {
        return (((long) this.f53494a) << 32) | (((long) this.f53495b) & 4294967295L);
    }

    public final int d() {
        return this.f53496c - this.f53494a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f53494a == kVar.f53494a && this.f53495b == kVar.f53495b && this.f53496c == kVar.f53496c && this.f53497d == kVar.f53497d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53497d) + defpackage.e.b(this.f53496c, defpackage.e.b(this.f53495b, Integer.hashCode(this.f53494a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRect.fromLTRB(");
        sb2.append(this.f53494a);
        sb2.append(", ");
        sb2.append(this.f53495b);
        sb2.append(", ");
        sb2.append(this.f53496c);
        sb2.append(", ");
        return ep.a.j(sb2, this.f53497d, ')');
    }
}
