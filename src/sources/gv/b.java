package gv;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f29866b;

    public b(String error, Exception exc) {
        m.f(error, "error");
        this.f29865a = error;
        this.f29866b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f29865a, bVar.f29865a) && m.a(this.f29866b, bVar.f29866b);
    }

    public final int hashCode() {
        int iHashCode = this.f29865a.hashCode() * 31;
        Throwable th2 = this.f29866b;
        return iHashCode + (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        return "Error(error=" + this.f29865a + ", exception=" + this.f29866b + ")";
    }
}
