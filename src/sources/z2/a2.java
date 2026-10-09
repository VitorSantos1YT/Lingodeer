package z2;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements r2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f58499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z4.r f58500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f58501c;

    public a2(View view) {
        this.f58499a = view;
        z4.r rVar = new z4.r(view);
        rVar.g(true);
        this.f58500b = rVar;
        this.f58501c = new int[2];
        WeakHashMap weakHashMap = z4.s0.f58893a;
        z4.j0.l(view, true);
    }

    @Override // r2.a
    public final Object D(long j11, long j12, vy.d dVar) {
        z4.r rVar = this.f58500b;
        if (rVar.f(0)) {
            rVar.i(0);
        }
        if (rVar.f(1)) {
            rVar.i(1);
        }
        return new v3.q(0L);
    }

    @Override // r2.a
    public final long M(int i11, long j11) {
        if (!this.f58500b.h(g0.k(j11), (i11 == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.f58501c;
        ry.l.Q(iArr, 0);
        int iQ = g0.q(Float.intBitsToFloat((int) (j11 >> 32)));
        int iQ2 = g0.q(Float.intBitsToFloat((int) (4294967295L & j11)));
        this.f58500b.c(iQ, iQ2, this.f58501c, null, (i11 == 1 ? 1 : 0) ^ 1);
        return g0.m(iQ, iQ2, iArr, j11);
    }

    @Override // r2.a
    public final Object W(long j11, vy.d dVar) {
        float fB = v3.q.b(j11) * (-1.0f);
        float fC = v3.q.c(j11) * (-1.0f);
        z4.r rVar = this.f58500b;
        if (!rVar.b(fB, fC) && !rVar.a(v3.q.b(j11) * (-1.0f), v3.q.c(j11) * (-1.0f), true)) {
            j11 = 0;
        }
        return new v3.q(j11);
    }

    @Override // r2.a
    public final long x(long j11, int i11, long j12) {
        if (!this.f58500b.h(g0.k(j12), (i11 == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.f58501c;
        ry.l.Q(iArr, 0);
        int iQ = g0.q(Float.intBitsToFloat((int) (j12 >> 32)));
        int iQ2 = g0.q(Float.intBitsToFloat((int) (j12 & 4294967295L)));
        int iQ3 = g0.q(Float.intBitsToFloat((int) (j11 >> 32)));
        int iQ4 = g0.q(Float.intBitsToFloat((int) (j11 & 4294967295L)));
        int i12 = i11 == 1 ? 1 : 0;
        this.f58500b.d(iQ3, iQ4, iQ, iQ2, null, i12 ^ 1, this.f58501c);
        return g0.m(iQ, iQ2, iArr, j12);
    }
}
