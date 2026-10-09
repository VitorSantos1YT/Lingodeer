package t1;

import qx.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51988a = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f51988a);
        sb2.append(")@");
        int iHashCode = hashCode();
        p.k(16);
        String string = Integer.toString(iHashCode, 16);
        kotlin.jvm.internal.m.e(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }
}
