package wd;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f55073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f55075c;

    public d(e eVar) {
        this.f55073a = eVar;
    }

    @Override // wd.g
    public final void a() {
        this.f55073a.i0(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f55074b == dVar.f55074b && this.f55075c == dVar.f55075c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f55074b * 31;
        Class cls = this.f55075c;
        return i11 + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f55074b + "array=" + this.f55075c + '}';
    }
}
