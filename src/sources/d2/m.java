package d2;

import g2.p;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class m extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2.b f23077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1.e f23078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.j f23079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f23081e;

    public m(k2.b bVar, z1.e eVar, w2.j jVar, float f5, p pVar) {
        this.f23077a = bVar;
        this.f23078b = eVar;
        this.f23079c = jVar;
        this.f23080d = f5;
        this.f23081e = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.f23077a, mVar.f23077a) && kotlin.jvm.internal.m.a(this.f23078b, mVar.f23078b) && kotlin.jvm.internal.m.a(this.f23079c, mVar.f23079c) && Float.compare(this.f23080d, mVar.f23080d) == 0 && kotlin.jvm.internal.m.a(this.f23081e, mVar.f23081e);
    }

    @Override // y2.d1
    public final q f() {
        n nVar = new n();
        nVar.Q = this.f23077a;
        nVar.R = true;
        nVar.S = this.f23078b;
        nVar.T = this.f23079c;
        nVar.U = this.f23080d;
        nVar.V = this.f23081e;
        return nVar;
    }

    public final int hashCode() {
        int iA = defpackage.e.a((this.f23079c.hashCode() + ((this.f23078b.hashCode() + defpackage.e.e(this.f23077a.hashCode() * 31, 31, true)) * 31)) * 31, this.f23080d, 31);
        p pVar = this.f23081e;
        return iA + (pVar == null ? 0 : pVar.hashCode());
    }

    @Override // y2.d1
    public final void j(q qVar) {
        n nVar = (n) qVar;
        boolean z11 = nVar.R;
        k2.b bVar = this.f23077a;
        boolean z12 = (z11 && f2.e.a(nVar.Q.h(), bVar.h())) ? false : true;
        nVar.Q = bVar;
        nVar.R = true;
        nVar.S = this.f23078b;
        nVar.T = this.f23079c;
        nVar.U = this.f23080d;
        nVar.V = this.f23081e;
        if (z12) {
            y2.f.n(nVar);
        }
        y2.f.m(nVar);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f23077a + ", sizeToIntrinsics=true, alignment=" + this.f23078b + ", contentScale=" + this.f23079c + ", alpha=" + this.f23080d + ", colorFilter=" + this.f23081e + ')';
    }
}
