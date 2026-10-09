package gd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import fd.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ob.u;
import wc.v;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends c {
    public final yc.d D;
    public final e E;
    public final zc.f F;

    public k(v vVar, i iVar, e eVar, wc.h hVar) {
        super(vVar, iVar);
        this.E = eVar;
        yc.d dVar = new yc.d(vVar, this, new r("__container", iVar.f29099a, false), hVar);
        this.D = dVar;
        List list = Collections.EMPTY_LIST;
        dVar.c(list, list);
        a9.i iVar2 = this.f29087p.f29121x;
        if (iVar2 != null) {
            this.F = new zc.f(this, this, iVar2);
        }
    }

    @Override // gd.c, yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        this.D.e(rectF, this.f29085n, z11);
    }

    @Override // gd.c, dd.g
    public final void f(Object obj, u uVar) {
        super.f(obj, uVar);
        PointF pointF = z.f55043a;
        zc.f fVar = this.F;
        if (obj == 5 && fVar != null) {
            fVar.f59104c.k(uVar);
            return;
        }
        if (obj == z.B && fVar != null) {
            fVar.c(uVar);
            return;
        }
        if (obj == z.C && fVar != null) {
            fVar.f59106e.k(uVar);
            return;
        }
        if (obj == z.D && fVar != null) {
            fVar.f59107f.k(uVar);
        } else {
            if (obj != z.E || fVar == null) {
                return;
            }
            fVar.f59108g.k(uVar);
        }
    }

    @Override // gd.c
    public final void k(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        zc.f fVar = this.F;
        if (fVar != null) {
            bVar = fVar.a(matrix, i11);
        }
        this.D.d(canvas, matrix, i11, bVar);
    }

    @Override // gd.c
    public final a5.j l() {
        a5.j jVar = this.f29087p.f29120w;
        return jVar != null ? jVar : this.E.f29087p.f29120w;
    }

    @Override // gd.c
    public final void p(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
        this.D.h(fVar, i11, arrayList, fVar2);
    }
}
