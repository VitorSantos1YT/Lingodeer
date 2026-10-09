package yc;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gd.c f57723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f57724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f57725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zc.e f57726t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zc.p f57727u;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(wc.v vVar, gd.c cVar, fd.v vVar2) {
        int iOrdinal = vVar2.f27216g.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = vVar2.f27217h.ordinal();
        super(vVar, cVar, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, vVar2.f27218i, vVar2.f27214e, vVar2.f27215f, vVar2.f27212c, vVar2.f27211b);
        this.f57723q = cVar;
        this.f57724r = vVar2.f27210a;
        this.f57725s = vVar2.f27219j;
        zc.d dVarI = vVar2.f27213d.I();
        this.f57726t = (zc.e) dVarI;
        dVarI.a(this);
        cVar.g(dVarI);
    }

    @Override // yc.b, yc.e
    public final void d(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        if (this.f57725s) {
            return;
        }
        zc.e eVar = this.f57726t;
        int iM = eVar.m(eVar.b(), eVar.d());
        gd.m mVar = this.f57600i;
        mVar.setColor(iM);
        zc.p pVar = this.f57727u;
        if (pVar != null) {
            mVar.setColorFilter((ColorFilter) pVar.f());
        }
        super.d(canvas, matrix, i11, bVar);
    }

    @Override // yc.b, dd.g
    public final void f(Object obj, ob.u uVar) {
        super.f(obj, uVar);
        PointF pointF = z.f55043a;
        zc.e eVar = this.f57726t;
        if (obj == 2) {
            eVar.k(uVar);
            return;
        }
        if (obj == z.F) {
            zc.p pVar = this.f57727u;
            gd.c cVar = this.f57723q;
            if (pVar != null) {
                cVar.o(pVar);
            }
            if (uVar == null) {
                this.f57727u = null;
                return;
            }
            zc.p pVar2 = new zc.p(null, uVar);
            this.f57727u = pVar2;
            pVar2.a(this);
            cVar.g(eVar);
        }
    }

    @Override // yc.c
    public final String getName() {
        return this.f57724r;
    }
}
