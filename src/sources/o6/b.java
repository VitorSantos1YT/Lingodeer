package o6;

import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44717a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f44717a == ((b) obj).f44717a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44717a);
    }

    public final String toString() {
        return p.o("FontWeight(value=", this.f44717a, ')');
    }
}
