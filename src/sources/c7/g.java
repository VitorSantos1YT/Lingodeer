package c7;

import y6.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6654b;

    public g(float f5, float f11) {
        b7.a.c("Invalid latitude or longitude", f5 >= -90.0f && f5 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f);
        this.f6653a = f5;
        this.f6654b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f6653a == gVar.f6653a && this.f6654b == gVar.f6654b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.valueOf(this.f6654b).hashCode() + ((Float.valueOf(this.f6653a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f6653a + ", longitude=" + this.f6654b;
    }
}
