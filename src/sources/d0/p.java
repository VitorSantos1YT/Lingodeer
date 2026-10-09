package d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g2.h f22770a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2.c f22771b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i2.b f22772c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g2.k f22773d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f22770a, pVar.f22770a) && kotlin.jvm.internal.m.a(this.f22771b, pVar.f22771b) && kotlin.jvm.internal.m.a(this.f22772c, pVar.f22772c) && kotlin.jvm.internal.m.a(this.f22773d, pVar.f22773d);
    }

    public final int hashCode() {
        g2.h hVar = this.f22770a;
        int iHashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        g2.c cVar = this.f22771b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        i2.b bVar = this.f22772c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        g2.k kVar = this.f22773d;
        return iHashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f22770a + ", canvas=" + this.f22771b + ", canvasDrawScope=" + this.f22772c + ", borderPath=" + this.f22773d + ')';
    }
}
