package m0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40542a;

    public b(int i11) {
        this.f40542a = i11;
        if (i11 > 0) {
            return;
        }
        i0.a.a("Provided count should be larger than zero");
    }

    @Override // m0.c
    public final ArrayList a(v3.c cVar, int i11, int i12) {
        return md.a.b(i11, this.f40542a, i12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f40542a == ((b) obj).f40542a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f40542a;
    }
}
