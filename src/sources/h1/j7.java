package h1;

import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30484a = g2.x.f28622i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j7) {
            return g2.x.d(this.f30484a, ((j7) obj).f30484a);
        }
        return false;
    }

    public final int hashCode() {
        int i11 = g2.x.f28623j;
        return Long.hashCode(this.f30484a) * 31;
    }

    public final String toString() {
        return tcppUUQxZjFdy.lfUDUTQuAusWvZq + ((Object) g2.x.j(this.f30484a)) + ", rippleAlpha=null)";
    }
}
