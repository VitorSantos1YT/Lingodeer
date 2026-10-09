package tg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f52258f = new c0(null, null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3.o f52259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3.o f52260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v3.o f52261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fz.c f52262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fz.c f52263e;

    public c0(v3.o oVar, v3.o oVar2, v3.o oVar3, fz.c cVar, fz.c cVar2) {
        this.f52259a = oVar;
        this.f52260b = oVar2;
        this.f52261c = oVar3;
        this.f52262d = cVar;
        this.f52263e = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.m.a(this.f52259a, c0Var.f52259a) && kotlin.jvm.internal.m.a(this.f52260b, c0Var.f52260b) && kotlin.jvm.internal.m.a(this.f52261c, c0Var.f52261c) && kotlin.jvm.internal.m.a(this.f52262d, c0Var.f52262d) && kotlin.jvm.internal.m.a(this.f52263e, c0Var.f52263e);
    }

    public final int hashCode() {
        v3.o oVar = this.f52259a;
        int iHashCode = (oVar == null ? 0 : Long.hashCode(oVar.f53502a)) * 31;
        v3.o oVar2 = this.f52260b;
        int iHashCode2 = (iHashCode + (oVar2 == null ? 0 : Long.hashCode(oVar2.f53502a))) * 31;
        v3.o oVar3 = this.f52261c;
        int iHashCode3 = (iHashCode2 + (oVar3 == null ? 0 : Long.hashCode(oVar3.f53502a))) * 31;
        fz.c cVar = this.f52262d;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        fz.c cVar2 = this.f52263e;
        return iHashCode4 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        return "ListStyle(markerIndent=" + this.f52259a + ", contentsIndent=" + this.f52260b + ", itemSpacing=" + this.f52261c + ", orderedMarkers=" + this.f52262d + ", unorderedMarkers=" + this.f52263e + ")";
    }
}
