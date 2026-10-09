package q7;

import android.util.SparseArray;
import x7.e0;
import x7.m;
import x7.o;
import x7.y;
import y6.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements o {
    public static final kw.b L = new kw.b();
    public y H;
    public p[] K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f47517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f47519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f47520d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ob.c f47522f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f47523t;

    public c(m mVar, int i11, p pVar) {
        this.f47517a = mVar;
        this.f47518b = i11;
        this.f47519c = pVar;
    }

    public final void a(ob.c cVar, long j11, long j12) {
        this.f47522f = cVar;
        this.f47523t = j12;
        boolean z11 = this.f47521e;
        m mVar = this.f47517a;
        if (!z11) {
            mVar.e(this);
            if (j11 != -9223372036854775807L) {
                mVar.f(0L, j11);
            }
            this.f47521e = true;
            return;
        }
        if (j11 == -9223372036854775807L) {
            j11 = 0;
        }
        mVar.f(0L, j11);
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f47520d;
            if (i11 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i11);
            if (cVar == null) {
                bVar.f47515e = bVar.f47513c;
            } else {
                bVar.f47516f = j12;
                e0 e0VarU = cVar.u(bVar.f47511a);
                bVar.f47515e = e0VarU;
                p pVar = bVar.f47514d;
                if (pVar != null) {
                    e0VarU.b(pVar);
                }
            }
            i11++;
        }
    }

    @Override // x7.o
    public final void o() {
        SparseArray sparseArray = this.f47520d;
        p[] pVarArr = new p[sparseArray.size()];
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            p pVar = ((b) sparseArray.valueAt(i11)).f47514d;
            b7.a.k(pVar);
            pVarArr[i11] = pVar;
        }
        this.K = pVarArr;
    }

    @Override // x7.o
    public final void q(y yVar) {
        this.H = yVar;
    }

    @Override // x7.o
    public final e0 v(int i11, int i12) {
        SparseArray sparseArray = this.f47520d;
        b bVar = (b) sparseArray.get(i11);
        if (bVar == null) {
            b7.a.j(this.K == null);
            bVar = new b(i11, i12, i12 == this.f47518b ? this.f47519c : null);
            ob.c cVar = this.f47522f;
            long j11 = this.f47523t;
            if (cVar == null) {
                bVar.f47515e = bVar.f47513c;
            } else {
                bVar.f47516f = j11;
                e0 e0VarU = cVar.u(i12);
                bVar.f47515e = e0VarU;
                p pVar = bVar.f47514d;
                if (pVar != null) {
                    e0VarU.b(pVar);
                }
            }
            sparseArray.put(i11, bVar);
        }
        return bVar;
    }
}
