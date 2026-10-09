package l0;

import b0.t1;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements n0.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f39116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f39117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f39118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ij.d f39119d;

    public j(w wVar, h hVar, c cVar, ij.d dVar) {
        this.f39116a = wVar;
        this.f39117b = hVar;
        this.f39118c = cVar;
        this.f39119d = dVar;
    }

    @Override // n0.a0
    public final Object a(int i11) {
        Object objM = this.f39119d.m(i11);
        return objM == null ? this.f39117b.l(i11) : objM;
    }

    @Override // n0.a0
    public final Object b(int i11) {
        return this.f39117b.j(i11);
    }

    @Override // n0.a0
    public final void c(int i11, Object obj, l1.n nVar, int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-462424778);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.h(obj) ? 32 : 16) | (sVar.f(this) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            n0.l.b(obj, i11, this.f39116a.f39218r, t1.e.d(-824725566, new i(this, i11, 0), sVar), sVar, ((i13 >> 3) & 14) | 3072 | ((i13 << 3) & 112));
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(this, i11, obj, i12, 12);
        }
    }

    @Override // n0.a0
    public final int d(Object obj) {
        return this.f39119d.l(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f39117b, ((j) obj).f39117b);
    }

    @Override // n0.a0
    public final int getItemCount() {
        return this.f39117b.k().f34421b;
    }

    public final int hashCode() {
        return this.f39117b.hashCode();
    }
}
