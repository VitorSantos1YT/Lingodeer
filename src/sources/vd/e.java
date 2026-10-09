package vd;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements td.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final td.g f53871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final td.g f53872c;

    public e(td.g gVar, td.g gVar2) {
        this.f53871b = gVar;
        this.f53872c = gVar2;
    }

    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        this.f53871b.a(messageDigest);
        this.f53872c.a(messageDigest);
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f53871b.equals(eVar.f53871b) && this.f53872c.equals(eVar.f53872c)) {
                return true;
            }
        }
        return false;
    }

    @Override // td.g
    public final int hashCode() {
        return this.f53872c.hashCode() + (this.f53871b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f53871b + ", signature=" + this.f53872c + '}';
    }
}
