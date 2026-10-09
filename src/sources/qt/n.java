package qt;

import hh.p0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f48335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f48337c;

    public n(c cVar, long j11, List list) {
        this.f48335a = cVar;
        this.f48336b = j11;
        this.f48337c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f48335a == nVar.f48335a && this.f48336b == nVar.f48336b && this.f48337c.equals(nVar.f48337c);
    }

    public final int hashCode() {
        return Integer.hashCode(1) + p0.b(defpackage.e.f(this.f48336b, this.f48335a.hashCode() * 31, 31), 31, this.f48337c);
    }

    public final String toString() {
        return "RawTestConfig(elemType=" + this.f48335a + ", elemId=" + this.f48336b + ", modelTypes=" + this.f48337c + ", count=1)";
    }
}
