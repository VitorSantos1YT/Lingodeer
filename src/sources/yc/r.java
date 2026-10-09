package yc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements e, n, j, zc.a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f57703a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f57704b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wc.v f57705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gd.c f57706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f57707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f57708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zc.g f57709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zc.g f57710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zc.o f57711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f57712j;

    public r(wc.v vVar, gd.c cVar, fd.n nVar) {
        this.f57705c = vVar;
        this.f57706d = cVar;
        this.f57707e = (String) nVar.f27188b;
        this.f57708f = nVar.f27190d;
        zc.g gVarI = nVar.f27189c.I();
        this.f57709g = gVarI;
        cVar.g(gVarI);
        gVarI.a(this);
        zc.g gVarI2 = ((ed.b) nVar.f27191e).I();
        this.f57710h = gVarI2;
        cVar.g(gVarI2);
        gVarI2.a(this);
        ed.e eVar = (ed.e) nVar.f27192f;
        eVar.getClass();
        zc.o oVar = new zc.o(eVar);
        this.f57711i = oVar;
        oVar.a(cVar);
        oVar.b(this);
    }

    @Override // yc.n
    public final Path a() {
        Path pathA = this.f57712j.a();
        Path path = this.f57704b;
        path.reset();
        float fFloatValue = ((Float) this.f57709g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f57710h.f()).floatValue();
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            Matrix matrixF = this.f57711i.f(i11 + fFloatValue2);
            Matrix matrix = this.f57703a;
            matrix.set(matrixF);
            path.addPath(pathA, matrix);
        }
        return path;
    }

    @Override // zc.a
    public final void b() {
        this.f57705c.invalidateSelf();
    }

    @Override // yc.c
    public final void c(List list, List list2) {
        this.f57712j.c(list, list2);
    }

    @Override // yc.e
    public final void d(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        float fFloatValue = ((Float) this.f57709g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f57710h.f()).floatValue();
        zc.o oVar = this.f57711i;
        float fFloatValue3 = ((Float) oVar.m.f()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) oVar.f59142n.f()).floatValue() / 100.0f;
        for (int i12 = ((int) fFloatValue) - 1; i12 >= 0; i12--) {
            Matrix matrix2 = this.f57703a;
            matrix2.set(matrix);
            float f5 = i12;
            matrix2.preConcat(oVar.f(f5 + fFloatValue2));
            this.f57712j.d(canvas, matrix2, (int) (kd.h.f(fFloatValue3, fFloatValue4, f5 / fFloatValue) * i11), bVar);
        }
    }

    @Override // yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        this.f57712j.e(rectF, matrix, z11);
    }

    @Override // dd.g
    public final void f(Object obj, ob.u uVar) {
        if (this.f57711i.c(obj, uVar)) {
            return;
        }
        if (obj == z.f55057p) {
            this.f57709g.k(uVar);
        } else if (obj == z.f55058q) {
            this.f57710h.k(uVar);
        }
    }

    @Override // yc.j
    public final void g(ListIterator listIterator) {
        if (this.f57712j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((c) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f57712j = new d(this.f57705c, this.f57706d, "Repeater", this.f57708f, arrayList, null);
    }

    @Override // yc.c
    public final String getName() {
        return this.f57707e;
    }

    @Override // dd.g
    public final void h(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
        kd.h.g(fVar, i11, arrayList, fVar2, this);
        for (int i12 = 0; i12 < this.f57712j.f57615i.size(); i12++) {
            c cVar = (c) this.f57712j.f57615i.get(i12);
            if (cVar instanceof k) {
                kd.h.g(fVar, i11, arrayList, fVar2, (k) cVar);
            }
        }
    }
}
