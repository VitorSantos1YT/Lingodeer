package m0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40540a;

    public a(float f5) {
        this.f40540a = f5;
        if (v3.f.a(f5, 0) > 0) {
            return;
        }
        i0.a.a("Provided min size should be larger than zero.");
    }

    @Override // m0.c
    public final ArrayList a(v3.c cVar, int i11, int i12) {
        return md.a.b(i11, Math.max((i11 + i12) / (cVar.n0(this.f40540a) + i12), 1), i12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return v3.f.b(this.f40540a, ((a) obj).f40540a);
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f40540a);
    }
}
