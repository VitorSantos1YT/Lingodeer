package jc;

import gc.o;
import wb.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36295b;

    public a(int i11) {
        this.f36295b = i11;
        if (i11 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // jc.e
    public final f a(j jVar, gc.j jVar2) {
        if (jVar2 instanceof o) {
            return ((o) jVar2).f29063c == xb.e.MEMORY_CACHE ? new d(jVar, jVar2) : new b(jVar, jVar2, this.f36295b);
        }
        return new d(jVar, jVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f36295b == ((a) obj).f36295b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f36295b * 31);
    }
}
