package gc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc.h f28993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.f f28994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jc.e f28995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc.d f28996d;

    public d(hc.h hVar, hc.f fVar, jc.e eVar, hc.d dVar) {
        this.f28993a = hVar;
        this.f28994b = fVar;
        this.f28995c = eVar;
        this.f28996d = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f28993a, dVar.f28993a) && this.f28994b == dVar.f28994b && kotlin.jvm.internal.m.a(this.f28995c, dVar.f28995c) && this.f28996d == dVar.f28996d;
    }

    public final int hashCode() {
        hc.h hVar = this.f28993a;
        int iHashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        hc.f fVar = this.f28994b;
        int iHashCode2 = (iHashCode + (fVar != null ? fVar.hashCode() : 0)) * 28629151;
        jc.e eVar = this.f28995c;
        int iHashCode3 = (iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        hc.d dVar = this.f28996d;
        return (iHashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 887503681;
    }
}
