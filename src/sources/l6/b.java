package l6;

import c6.k;
import kotlin.jvm.internal.m;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f39771a;

    public b(a aVar) {
        this.f39771a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && m.a(this.f39771a, ((b) obj).f39771a);
    }

    public final int hashCode() {
        return this.f39771a.hashCode();
    }

    public final String toString() {
        return anrPHlQ.VMGySywYhilXpX + this.f39771a + ')';
    }
}
