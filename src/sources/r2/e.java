package r2;

import a0.c0;
import kotlin.jvm.internal.m;
import y2.d1;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class e extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f48754b;

    public e(a aVar, d dVar) {
        this.f48753a = aVar;
        this.f48754b = dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(eVar.f48753a, this.f48753a) && m.a(eVar.f48754b, this.f48754b);
    }

    @Override // y2.d1
    public final q f() {
        return new i(this.f48753a, this.f48754b);
    }

    public final int hashCode() {
        int iHashCode = this.f48753a.hashCode() * 31;
        d dVar = this.f48754b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // y2.d1
    public final void j(q qVar) {
        i iVar = (i) qVar;
        iVar.Q = this.f48753a;
        d dVar = iVar.R;
        if (dVar.f48749a == iVar) {
            dVar.f48749a = null;
        }
        d dVar2 = this.f48754b;
        if (dVar2 == null) {
            iVar.R = new d();
        } else if (!dVar2.equals(dVar)) {
            iVar.R = dVar2;
        }
        if (iVar.P) {
            d dVar3 = iVar.R;
            dVar3.f48749a = iVar;
            dVar3.f48750b = null;
            iVar.S = null;
            dVar3.f48751c = new c0(iVar, 27);
            dVar3.f48752d = iVar.H0();
        }
    }
}
