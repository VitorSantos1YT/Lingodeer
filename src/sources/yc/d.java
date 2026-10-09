package yc;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.android.billingclient.api.c0;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e, n, zc.a, dd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f57607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f57608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kd.j f57609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f57610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f57611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f57612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f57613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f57615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wc.v f57616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f57617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zc.o f57618l;

    public d(wc.v vVar, gd.c cVar, fd.r rVar, wc.h hVar) {
        ed.e eVar;
        String str = rVar.f27203a;
        boolean z11 = rVar.f27205c;
        List list = rVar.f27204b;
        ArrayList arrayList = new ArrayList(list.size());
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            c cVarA = ((fd.b) list.get(i12)).a(vVar, hVar, cVar);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        while (true) {
            if (i11 >= list.size()) {
                eVar = null;
                break;
            }
            fd.b bVar = (fd.b) list.get(i11);
            if (bVar instanceof ed.e) {
                eVar = (ed.e) bVar;
                break;
            }
            i11++;
        }
        this(vVar, cVar, str, z11, arrayList, eVar);
    }

    @Override // yc.n
    public final Path a() {
        Matrix matrix = this.f57610d;
        matrix.reset();
        zc.o oVar = this.f57618l;
        if (oVar != null) {
            matrix.set(oVar.e());
        }
        Path path = this.f57611e;
        path.reset();
        if (!this.f57614h) {
            ArrayList arrayList = this.f57615i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                if (cVar instanceof n) {
                    path.addPath(((n) cVar).a(), matrix);
                }
            }
        }
        return path;
    }

    @Override // zc.a
    public final void b() {
        this.f57616j.invalidateSelf();
    }

    @Override // yc.c
    public final void c(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f57615i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            cVar.c(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(cVar);
        }
    }

    @Override // yc.e
    public final void d(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        if (this.f57614h) {
            return;
        }
        Matrix matrix2 = this.f57610d;
        matrix2.set(matrix);
        zc.o oVar = this.f57618l;
        if (oVar != null) {
            matrix2.preConcat(oVar.e());
            zc.d dVar = oVar.f59139j;
            i11 = (int) (((((dVar == null ? 100 : ((Integer) dVar.f()).intValue()) / 100.0f) * i11) / 255.0f) * 255.0f);
        }
        wc.v vVar = this.f57616j;
        boolean z11 = (vVar.V && i() && i11 != 255) || (bVar != null && vVar.W && i());
        int i12 = z11 ? 255 : i11;
        kd.j jVar = this.f57609c;
        if (z11) {
            RectF rectF = this.f57608b;
            rectF.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
            e(rectF, matrix, true);
            c0 c0Var = this.f57607a;
            c0Var.f7470b = i11;
            if (bVar != null) {
                if (Color.alpha(bVar.f38085d) > 0) {
                    c0Var.f7471c = bVar;
                } else {
                    c0Var.f7471c = null;
                }
                bVar = null;
            } else {
                c0Var.f7471c = null;
            }
            canvas = jVar.e(canvas, rectF, c0Var);
        } else if (bVar != null) {
            kd.b bVar2 = new kd.b(bVar);
            bVar2.b(i12);
            bVar = bVar2;
        }
        ArrayList arrayList = this.f57615i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof e) {
                ((e) obj).d(canvas, matrix2, i12, bVar);
            }
        }
        if (z11) {
            jVar.c();
        }
    }

    @Override // yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        Matrix matrix2 = this.f57610d;
        matrix2.set(matrix);
        zc.o oVar = this.f57618l;
        if (oVar != null) {
            matrix2.preConcat(oVar.e());
        }
        RectF rectF2 = this.f57612f;
        rectF2.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        ArrayList arrayList = this.f57615i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList.get(size);
            if (cVar instanceof e) {
                ((e) cVar).e(rectF2, matrix2, z11);
                rectF.union(rectF2);
            }
        }
    }

    @Override // dd.g
    public final void f(Object obj, ob.u uVar) {
        zc.o oVar = this.f57618l;
        if (oVar != null) {
            oVar.c(obj, uVar);
        }
    }

    public final List g() {
        if (this.f57617k == null) {
            this.f57617k = new ArrayList();
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f57615i;
                if (i11 >= arrayList.size()) {
                    break;
                }
                c cVar = (c) arrayList.get(i11);
                if (cVar instanceof n) {
                    this.f57617k.add((n) cVar);
                }
                i11++;
            }
        }
        return this.f57617k;
    }

    @Override // yc.c
    public final String getName() {
        throw null;
    }

    @Override // dd.g
    public final void h(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
        String str = this.f57613g;
        if (!fVar.c(i11, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            dd.f fVar3 = new dd.f(fVar2);
            fVar3.f23379a.add(str);
            if (fVar.a(i11, str)) {
                dd.f fVar4 = new dd.f(fVar3);
                fVar4.f23380b = this;
                arrayList.add(fVar4);
            }
            fVar2 = fVar3;
        }
        if (!fVar.d(i11, str)) {
            return;
        }
        int iB = fVar.b(i11, str) + i11;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f57615i;
            if (i12 >= arrayList2.size()) {
                return;
            }
            c cVar = (c) arrayList2.get(i12);
            if (cVar instanceof dd.g) {
                ((dd.g) cVar).h(fVar, iB, arrayList, fVar2);
            }
            i12++;
        }
    }

    public final boolean i() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f57615i;
            if (i11 >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i11) instanceof e) && (i12 = i12 + 1) >= 2) {
                return true;
            }
            i11++;
        }
    }

    public d(wc.v vVar, gd.c cVar, String str, boolean z11, ArrayList arrayList, ed.e eVar) {
        this.f57607a = new c0(7, (byte) 0);
        this.f57608b = new RectF();
        this.f57609c = new kd.j();
        this.f57610d = new Matrix();
        this.f57611e = new Path();
        this.f57612f = new RectF();
        this.f57613g = str;
        this.f57616j = vVar;
        this.f57614h = z11;
        this.f57615i = arrayList;
        if (eVar != null) {
            zc.o oVar = new zc.o(eVar);
            this.f57618l = oVar;
            oVar.a(cVar);
            oVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            c cVar2 = (c) arrayList.get(size);
            if (cVar2 instanceof j) {
                arrayList2.add((j) cVar2);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList2.get(size2)).g(arrayList.listIterator(arrayList.size()));
        }
    }
}
