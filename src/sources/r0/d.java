package r0;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f48728a;

    public d(float f5) {
        this.f48728a = f5;
    }

    @Override // r0.a
    public final float a(long j11, v3.c cVar) {
        return this.f48728a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Float.compare(this.f48728a, ((d) obj).f48728a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f48728a);
    }

    public final String toString() {
        return p.h(this.f48728a, ".px)", new StringBuilder("CornerSize(size = "));
    }
}
