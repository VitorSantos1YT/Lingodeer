package e6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f25064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k6.a f25066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k6.b f25067d;

    public w(e1 e1Var, int i11, k6.a aVar, k6.b bVar) {
        this.f25064a = e1Var;
        this.f25065b = i11;
        this.f25066c = aVar;
        this.f25067d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f25064a == wVar.f25064a && this.f25065b == wVar.f25065b && kotlin.jvm.internal.m.a(this.f25066c, wVar.f25066c) && kotlin.jvm.internal.m.a(this.f25067d, wVar.f25067d);
    }

    public final int hashCode() {
        int iB = defpackage.e.b(this.f25065b, this.f25064a.hashCode() * 31, 31);
        k6.a aVar = this.f25066c;
        int iHashCode = (iB + (aVar == null ? 0 : Integer.hashCode(aVar.f37911a))) * 31;
        k6.b bVar = this.f25067d;
        return iHashCode + (bVar != null ? Integer.hashCode(bVar.f37912a) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.f25064a + ", numChildren=" + this.f25065b + ", horizontalAlignment=" + this.f25066c + ", verticalAlignment=" + this.f25067d + ')';
    }

    public /* synthetic */ w(e1 e1Var, int i11, k6.a aVar, k6.b bVar, int i12) {
        this(e1Var, i11, (i12 & 4) != 0 ? null : aVar, (i12 & 8) != 0 ? null : bVar);
    }
}
