package r0;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f48726a;

    public b(float f5) {
        this.f48726a = f5;
    }

    @Override // r0.a
    public final float a(long j11, v3.c cVar) {
        return cVar.e0(this.f48726a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && v3.f.b(this.f48726a, ((b) obj).f48726a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f48726a);
    }

    public final String toString() {
        return p.h(this.f48726a, ".dp)", new StringBuilder("CornerSize(size = "));
    }
}
