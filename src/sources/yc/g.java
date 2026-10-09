package yc;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e, zc.a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f57627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd.m f57628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gd.c f57629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f57631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f57632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zc.e f57633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zc.e f57634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zc.p f57635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wc.v f57636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public zc.d f57637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f57638l;

    public g(wc.v vVar, gd.c cVar, fd.q qVar) {
        Path path = new Path();
        this.f57627a = path;
        this.f57628b = new gd.m(1, 2);
        this.f57632f = new ArrayList();
        this.f57629c = cVar;
        String str = qVar.f27199c;
        ed.a aVar = qVar.f27201e;
        ed.a aVar2 = qVar.f27200d;
        this.f57630d = str;
        this.f57631e = qVar.f27202f;
        this.f57636j = vVar;
        if (cVar.l() != null) {
            zc.g gVarI = ((ed.b) cVar.l().f385b).I();
            this.f57637k = gVarI;
            gVarI.a(this);
            cVar.g(this.f57637k);
        }
        if (aVar2 == null) {
            this.f57633g = null;
            this.f57634h = null;
            return;
        }
        path.setFillType(qVar.f27198b);
        zc.d dVarI = aVar2.I();
        this.f57633g = (zc.e) dVarI;
        dVarI.a(this);
        cVar.g(dVarI);
        zc.d dVarI2 = aVar.I();
        this.f57634h = (zc.e) dVarI2;
        dVarI2.a(this);
        cVar.g(dVarI2);
    }

    @Override // zc.a
    public final void b() {
        this.f57636j.invalidateSelf();
    }

    @Override // yc.c
    public final void c(List list, List list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = (c) list2.get(i11);
            if (cVar instanceof n) {
                this.f57632f.add((n) cVar);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yc.e
    public final void d(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        MaskFilter maskFilter;
        if (this.f57631e) {
            return;
        }
        wc.a aVar = wc.d.f54943a;
        zc.e eVar = this.f57633g;
        int iM = eVar.m(eVar.b(), eVar.d());
        float fIntValue = ((Integer) this.f57634h.f()).intValue() / 100.0f;
        int iC = (kd.h.c((int) (i11 * fIntValue)) << 24) | (iM & 16777215);
        gd.m mVar = this.f57628b;
        mVar.setColor(iC);
        zc.p pVar = this.f57635i;
        if (pVar != null) {
            mVar.setColorFilter((ColorFilter) pVar.f());
        }
        zc.d dVar = this.f57637k;
        if (dVar != null) {
            float fFloatValue = ((Float) dVar.f()).floatValue();
            if (fFloatValue == CropImageView.DEFAULT_ASPECT_RATIO) {
                mVar.setMaskFilter(null);
            } else if (fFloatValue != this.f57638l) {
                gd.c cVar = this.f57629c;
                if (cVar.A == fFloatValue) {
                    maskFilter = cVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    cVar.B = blurMaskFilter;
                    cVar.A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                mVar.setMaskFilter(maskFilter);
            }
            this.f57638l = fFloatValue;
        }
        if (bVar != null) {
            bVar.a((int) (fIntValue * 255.0f), mVar);
        } else {
            mVar.clearShadowLayer();
        }
        Path path = this.f57627a;
        path.reset();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f57632f;
            if (i12 >= arrayList.size()) {
                canvas.drawPath(path, mVar);
                wc.a aVar2 = wc.d.f54943a;
                return;
            } else {
                path.addPath(((n) arrayList.get(i12)).a(), matrix);
                i12++;
            }
        }
    }

    @Override // yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        Path path = this.f57627a;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f57632f;
            if (i11 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i11)).a(), matrix);
                i11++;
            }
        }
    }

    @Override // dd.g
    public final void f(Object obj, ob.u uVar) {
        PointF pointF = z.f55043a;
        if (obj == 1) {
            this.f57633g.k(uVar);
            return;
        }
        if (obj == 4) {
            this.f57634h.k(uVar);
            return;
        }
        ColorFilter colorFilter = z.F;
        gd.c cVar = this.f57629c;
        if (obj == colorFilter) {
            zc.p pVar = this.f57635i;
            if (pVar != null) {
                cVar.o(pVar);
            }
            if (uVar == null) {
                this.f57635i = null;
                return;
            }
            zc.p pVar2 = new zc.p(null, uVar);
            this.f57635i = pVar2;
            pVar2.a(this);
            cVar.g(this.f57635i);
            return;
        }
        if (obj == z.f55047e) {
            zc.d dVar = this.f57637k;
            if (dVar != null) {
                dVar.k(uVar);
                return;
            }
            zc.p pVar3 = new zc.p(null, uVar);
            this.f57637k = pVar3;
            pVar3.a(this);
            cVar.g(this.f57637k);
        }
    }

    @Override // yc.c
    public final String getName() {
        return this.f57630d;
    }

    @Override // dd.g
    public final void h(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
        kd.h.g(fVar, i11, arrayList, fVar2, this);
    }
}
