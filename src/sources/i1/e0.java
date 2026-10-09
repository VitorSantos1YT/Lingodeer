package i1;

import h1.b5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements z3.y {
    public final f1 H;
    public final i K;
    public final i L;
    public final i M;
    public final g1 N;
    public final g1 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3.c f34005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1.q f34007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f34008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f34009f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f1 f34010t;

    public e0(long j11, v3.c cVar, h1.q qVar) {
        int iN0 = cVar.n0(b5.f30033a);
        this.f34004a = j11;
        this.f34005b = cVar;
        this.f34006c = iN0;
        this.f34007d = qVar;
        int iN1 = cVar.n0(v3.g.a(j11));
        z1.h hVar = z1.c.O;
        this.f34008e = new h(hVar, hVar, iN1);
        z1.h hVar2 = z1.c.Q;
        this.f34009f = new h(hVar2, hVar2, iN1);
        this.f34010t = new f1(z1.a.f58460c);
        this.H = new f1(z1.a.f58461d);
        int iN2 = cVar.n0(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        z1.i iVar = z1.c.L;
        z1.i iVar2 = z1.c.N;
        this.K = new i(iVar, iVar2, iN2);
        this.L = new i(iVar2, iVar, iN2);
        this.M = new i(z1.c.M, iVar, iN2);
        this.N = new g1(iVar, iN0);
        this.O = new g1(iVar2, iN0);
    }

    @Override // z3.y
    public final long b(v3.k kVar, long j11, v3.m mVar, long j12) {
        v3.k kVar2;
        long j13;
        int iA;
        int i11;
        char c11 = ' ';
        int i12 = (int) (j11 >> 32);
        int i13 = 0;
        List listL = ns.o.L(this.f34008e, this.f34009f, ((int) (kVar.a() >> 32)) < i12 / 2 ? this.f34010t : this.H);
        int size = listL.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                kVar2 = kVar;
                j13 = j11;
                iA = 0;
                break;
            }
            p0 p0Var = (p0) listL.get(i14);
            int i15 = (int) (j12 >> c11);
            int i16 = size;
            int i17 = i14;
            kVar2 = kVar;
            j13 = j11;
            iA = p0Var.a(kVar2, j13, i15, mVar);
            if (i17 == ns.o.A(listL) || (iA >= 0 && i15 + iA <= i12)) {
                break;
            }
            i14 = i17 + 1;
            size = i16;
            c11 = ' ';
        }
        int i18 = (int) (j13 & 4294967295L);
        List listL2 = ns.o.L(this.K, this.L, this.M, ((int) (kVar2.a() & 4294967295L)) < i18 / 2 ? this.N : this.O);
        int size2 = listL2.size();
        for (int i19 = 0; i19 < size2; i19++) {
            int i21 = (int) (j12 & 4294967295L);
            int iA2 = ((q0) listL2.get(i19)).a(kVar2, j13, i21);
            if (i19 == ns.o.A(listL2) || (iA2 >= (i11 = this.f34006c) && i21 + iA2 <= i18 - i11)) {
                i13 = iA2;
                break;
            }
        }
        long jC = ew.a.c(iA, i13);
        this.f34007d.invoke(kVar2, fb.g0.b(jC, j12));
        return jC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.f34004a == e0Var.f34004a && kotlin.jvm.internal.m.a(this.f34005b, e0Var.f34005b) && this.f34006c == e0Var.f34006c && kotlin.jvm.internal.m.a(this.f34007d, e0Var.f34007d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f34007d.hashCode() + defpackage.e.b(this.f34006c, (this.f34005b.hashCode() + (Long.hashCode(this.f34004a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) v3.g.b(this.f34004a)) + ", density=" + this.f34005b + ", verticalMargin=" + this.f34006c + ", onPositionCalculated=" + this.f34007d + ')';
    }
}
