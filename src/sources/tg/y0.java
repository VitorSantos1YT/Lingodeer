package tg;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y0 f52396e = new y0(null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.y0 f52397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3.o f52398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.x f52399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Float f52400d;

    public y0(j3.y0 y0Var, v3.o oVar, g2.x xVar, Float f5) {
        this.f52397a = y0Var;
        this.f52398b = oVar;
        this.f52399c = xVar;
        this.f52400d = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return kotlin.jvm.internal.m.a(this.f52397a, y0Var.f52397a) && kotlin.jvm.internal.m.a(this.f52398b, y0Var.f52398b) && kotlin.jvm.internal.m.a(this.f52399c, y0Var.f52399c) && kotlin.jvm.internal.m.a(this.f52400d, y0Var.f52400d);
    }

    public final int hashCode() {
        j3.y0 y0Var = this.f52397a;
        int iHashCode = (y0Var == null ? 0 : y0Var.hashCode()) * 31;
        v3.o oVar = this.f52398b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : Long.hashCode(oVar.f53502a))) * 31;
        g2.x xVar = this.f52399c;
        int iHashCode3 = (iHashCode2 + (xVar == null ? 0 : Long.hashCode(xVar.f28624a))) * 31;
        Float f5 = this.f52400d;
        return iHashCode3 + (f5 != null ? f5.hashCode() : 0);
    }

    public final String toString() {
        return "TableStyle(headerTextStyle=" + this.f52397a + ", cellPadding=" + this.f52398b + ", borderColor=" + this.f52399c + ", borderStrokeWidth=" + this.f52400d + ")";
    }
}
