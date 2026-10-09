package wb;

import y2.d1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f54925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1.e f54926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.j f54927c;

    public o(i iVar, z1.e eVar, w2.j jVar) {
        this.f54925a = iVar;
        this.f54926b = eVar;
        this.f54927c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f54925a.equals(oVar.f54925a) && kotlin.jvm.internal.m.a(this.f54926b, oVar.f54926b) && kotlin.jvm.internal.m.a(this.f54927c, oVar.f54927c) && Float.compare(1.0f, 1.0f) == 0;
    }

    @Override // y2.d1
    public final z1.q f() {
        p pVar = new p();
        pVar.Q = this.f54925a;
        pVar.R = this.f54926b;
        pVar.S = this.f54927c;
        pVar.T = 1.0f;
        return pVar;
    }

    public final int hashCode() {
        return defpackage.e.a((this.f54927c.hashCode() + ((this.f54926b.hashCode() + (this.f54925a.hashCode() * 31)) * 31)) * 31, 1.0f, 31);
    }

    @Override // y2.d1
    public final void j(z1.q qVar) {
        p pVar = (p) qVar;
        long jH = pVar.Q.h();
        i iVar = this.f54925a;
        boolean zA = f2.e.a(jH, iVar.h());
        pVar.Q = iVar;
        pVar.R = this.f54926b;
        pVar.S = this.f54927c;
        pVar.T = 1.0f;
        if (!zA) {
            y2.f.n(pVar);
        }
        y2.f.m(pVar);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f54925a + ", alignment=" + this.f54926b + ", contentScale=" + this.f54927c + ", alpha=1.0, colorFilter=null)";
    }
}
