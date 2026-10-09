package gd;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.android.billingclient.api.c0;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import ob.u;
import wc.v;
import wc.z;
import y.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {
    public zc.d D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final kd.j I;
    public final c0 J;
    public float K;
    public boolean L;
    public final zc.f M;

    public e(v vVar, i iVar, List list, wc.h hVar) {
        c cVar;
        c kVar;
        super(vVar, iVar);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new kd.j();
        this.J = new c0(7, (byte) 0);
        this.L = true;
        ed.b bVar = iVar.f29116s;
        if (bVar != null) {
            zc.g gVarI = bVar.I();
            this.D = gVarI;
            g(gVarI);
            this.D.a(this);
        } else {
            this.D = null;
        }
        r rVar = new r(hVar.f54966j.size());
        int size = list.size() - 1;
        c cVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i11 = 0; i11 < rVar.j(); i11++) {
                    c cVar3 = (c) rVar.c(rVar.g(i11));
                    if (cVar3 != null && (cVar = (c) rVar.c(cVar3.f29087p.f29104f)) != null) {
                        cVar3.f29091t = cVar;
                    }
                }
                a9.i iVar2 = this.f29087p.f29121x;
                if (iVar2 != null) {
                    this.M = new zc.f(this, this, iVar2);
                    return;
                }
                return;
            }
            i iVar3 = (i) list.get(size);
            switch (b.f29071a[iVar3.f29103e.ordinal()]) {
                case 1:
                    kVar = new k(vVar, iVar3, this, hVar);
                    break;
                case 2:
                    kVar = new e(vVar, iVar3, (List) hVar.f54959c.get(iVar3.f29105g), hVar);
                    break;
                case 3:
                    kVar = new l(vVar, iVar3);
                    break;
                case 4:
                    kVar = new f(vVar, iVar3);
                    break;
                case 5:
                    kVar = new j(vVar, iVar3);
                    break;
                case 6:
                    kVar = new p(vVar, iVar3);
                    break;
                default:
                    kd.d.b("Unknown layer type " + iVar3.f29103e);
                    kVar = null;
                    break;
            }
            if (kVar != null) {
                rVar.h(kVar.f29087p.f29102d, kVar);
                if (cVar2 != null) {
                    cVar2.f29090s = kVar;
                    cVar2 = null;
                } else {
                    this.E.add(0, kVar);
                    int i12 = d.f29098a[iVar3.f29118u.ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        cVar2 = kVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // gd.c, yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            ((c) arrayList.get(size)).e(rectF2, this.f29085n, true);
            rectF.union(rectF2);
        }
    }

    @Override // gd.c, dd.g
    public final void f(Object obj, u uVar) {
        super.f(obj, uVar);
        if (obj == z.f55067z) {
            if (uVar == null) {
                zc.d dVar = this.D;
                if (dVar != null) {
                    dVar.k(null);
                    return;
                }
                return;
            }
            zc.p pVar = new zc.p(null, uVar);
            this.D = pVar;
            pVar.a(this);
            g(this.D);
            return;
        }
        zc.f fVar = this.M;
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
        Canvas canvasE;
        wc.a aVar = wc.d.f54943a;
        zc.f fVar = this.M;
        int i12 = 0;
        boolean z11 = (bVar == null && fVar == null) ? false : true;
        v vVar = this.f29086o;
        boolean z12 = vVar.V;
        ArrayList arrayList = this.E;
        boolean z13 = (z12 && arrayList.size() > 1 && i11 != 255) || (z11 && vVar.W);
        int i13 = z13 ? 255 : i11;
        if (fVar != null) {
            bVar = fVar.a(matrix, i13);
        }
        boolean z14 = this.L;
        i iVar = this.f29087p;
        RectF rectF = this.G;
        if (z14 || !"__container".equals(iVar.f29101c)) {
            rectF.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, iVar.f29112o, iVar.f29113p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            int size = arrayList.size();
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                RectF rectF2 = this.H;
                ((c) obj).e(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        kd.j jVar = this.I;
        if (z13) {
            c0 c0Var = this.J;
            c0Var.f7471c = null;
            c0Var.f7470b = i11;
            if (bVar != null) {
                if (Color.alpha(bVar.f38085d) > 0) {
                    c0Var.f7471c = bVar;
                } else {
                    c0Var.f7471c = null;
                }
                bVar = null;
            }
            canvasE = jVar.e(canvas, rectF, c0Var);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((c) arrayList.get(size2)).d(canvasE, matrix, i13, bVar);
            }
        }
        if (z13) {
            jVar.c();
        }
        canvas.restore();
        wc.a aVar2 = wc.d.f54943a;
    }

    @Override // gd.c
    public final void p(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i12 >= arrayList2.size()) {
                return;
            }
            ((c) arrayList2.get(i12)).h(fVar, i11, arrayList, fVar2);
            i12++;
        }
    }

    @Override // gd.c
    public final void q(boolean z11) {
        super.q(z11);
        ArrayList arrayList = this.E;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((c) obj).q(z11);
        }
    }

    @Override // gd.c
    public final void r(float f5) {
        wc.a aVar = wc.d.f54943a;
        this.K = f5;
        super.r(f5);
        zc.d dVar = this.D;
        i iVar = this.f29087p;
        if (dVar != null) {
            wc.h hVar = this.f29086o.f55010a;
            f5 = ((((Float) dVar.f()).floatValue() * iVar.f29100b.f54969n) - iVar.f29100b.f54968l) / ((hVar.m - hVar.f54968l) + 0.01f);
        }
        if (this.D == null) {
            float f11 = iVar.f29111n;
            wc.h hVar2 = iVar.f29100b;
            f5 -= f11 / (hVar2.m - hVar2.f54968l);
        }
        if (iVar.m != CropImageView.DEFAULT_ASPECT_RATIO && !"__container".equals(iVar.f29101c)) {
            f5 /= iVar.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((c) arrayList.get(size)).r(f5);
        }
        wc.a aVar2 = wc.d.f54943a;
    }
}
