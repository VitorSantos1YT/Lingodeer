package b2;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f3874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hd.d f3875d;

    public j(int i11, long j11, k kVar, hd.d dVar) {
        this.f3872a = i11;
        this.f3873b = j11;
        this.f3874c = kVar;
        this.f3875d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f3872a == jVar.f3872a && this.f3873b == jVar.f3873b && this.f3874c == jVar.f3874c && m.a(this.f3875d, jVar.f3875d);
    }

    public final int hashCode() {
        int iHashCode = (this.f3874c.hashCode() + defpackage.e.f(this.f3873b, Integer.hashCode(this.f3872a) * 31, 31)) * 31;
        hd.d dVar = this.f3875d;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f3872a + ", timestamp=" + this.f3873b + ", type=" + this.f3874c + ", structureCompat=" + this.f3875d + ')';
    }
}
