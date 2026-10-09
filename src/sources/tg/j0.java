package tg;

import am.rVFB.LwKl;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j0 f52298i = new j0(null, null, null, null, null, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3.o f52299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.e f52300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f52301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f52302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f52303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0 f52304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f52305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vg.n f52306h;

    public j0(v3.o oVar, fz.e eVar, c0 c0Var, c cVar, j jVar, y0 y0Var, a0 a0Var, vg.n nVar) {
        this.f52299a = oVar;
        this.f52300b = eVar;
        this.f52301c = c0Var;
        this.f52302d = cVar;
        this.f52303e = jVar;
        this.f52304f = y0Var;
        this.f52305g = a0Var;
        this.f52306h = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.m.a(this.f52299a, j0Var.f52299a) && kotlin.jvm.internal.m.a(this.f52300b, j0Var.f52300b) && kotlin.jvm.internal.m.a(this.f52301c, j0Var.f52301c) && kotlin.jvm.internal.m.a(this.f52302d, j0Var.f52302d) && kotlin.jvm.internal.m.a(this.f52303e, j0Var.f52303e) && kotlin.jvm.internal.m.a(this.f52304f, j0Var.f52304f) && kotlin.jvm.internal.m.a(this.f52305g, j0Var.f52305g) && kotlin.jvm.internal.m.a(this.f52306h, j0Var.f52306h);
    }

    public final int hashCode() {
        v3.o oVar = this.f52299a;
        int iHashCode = (oVar == null ? 0 : Long.hashCode(oVar.f53502a)) * 31;
        fz.e eVar = this.f52300b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c0 c0Var = this.f52301c;
        int iHashCode3 = (iHashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        c cVar = this.f52302d;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        j jVar = this.f52303e;
        int iHashCode5 = (iHashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        y0 y0Var = this.f52304f;
        int iHashCode6 = (iHashCode5 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        a0 a0Var = this.f52305g;
        int iHashCode7 = (iHashCode6 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        vg.n nVar = this.f52306h;
        return iHashCode7 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "RichTextStyle(paragraphSpacing=" + this.f52299a + ", headingStyle=" + this.f52300b + ", listStyle=" + this.f52301c + ", blockQuoteGutter=" + this.f52302d + ", codeBlockStyle=" + this.f52303e + ", tableStyle=" + this.f52304f + ", infoPanelStyle=" + this.f52305g + LwKl.kvM + this.f52306h + ")";
    }
}
