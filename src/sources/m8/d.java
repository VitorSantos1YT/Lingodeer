package m8;

import y6.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41048b;

    public d(int i11, float f5) {
        this.f41047a = f5;
        this.f41048b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f41047a == dVar.f41047a && this.f41048b == dVar.f41048b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f41047a).hashCode() + 527) * 31) + this.f41048b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f41047a + ", svcTemporalLayerCount=" + this.f41048b;
    }
}
