package d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3.j f22999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23001c;

    public v(u3.j jVar, int i11, long j11) {
        this.f22999a = jVar;
        this.f23000b = i11;
        this.f23001c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f22999a == vVar.f22999a && this.f23000b == vVar.f23000b && this.f23001c == vVar.f23001c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23001c) + defpackage.e.b(this.f23000b, this.f22999a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f22999a + ", offset=" + this.f23000b + ", selectableId=" + this.f23001c + ')';
    }
}
