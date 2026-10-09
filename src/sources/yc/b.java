package yc;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import fd.w;
import java.util.ArrayList;
import java.util.List;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements zc.a, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wc.v f57596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gd.c f57597f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f57599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gd.m f57600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zc.g f57601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zc.e f57602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f57603l;
    public final zc.g m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public zc.p f57604n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zc.d f57605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f57606p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f57592a = new PathMeasure();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f57593b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f57594c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f57595d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f57598g = new ArrayList();

    public b(wc.v vVar, gd.c cVar, Paint.Cap cap, Paint.Join join, float f5, ed.a aVar, ed.b bVar, ArrayList arrayList, ed.b bVar2) {
        gd.m mVar = new gd.m(1, 2);
        this.f57600i = mVar;
        this.f57606p = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f57596e = vVar;
        this.f57597f = cVar;
        mVar.setStyle(Paint.Style.STROKE);
        mVar.setStrokeCap(cap);
        mVar.setStrokeJoin(join);
        mVar.setStrokeMiter(f5);
        this.f57602k = (zc.e) aVar.I();
        this.f57601j = bVar.I();
        if (bVar2 == null) {
            this.m = null;
        } else {
            this.m = bVar2.I();
        }
        this.f57603l = new ArrayList(arrayList.size());
        this.f57599h = new float[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.f57603l.add(((ed.b) arrayList.get(i11)).I());
        }
        cVar.g(this.f57602k);
        cVar.g(this.f57601j);
        for (int i12 = 0; i12 < this.f57603l.size(); i12++) {
            cVar.g((zc.d) this.f57603l.get(i12));
        }
        zc.g gVar = this.m;
        if (gVar != null) {
            cVar.g(gVar);
        }
        this.f57602k.a(this);
        this.f57601j.a(this);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            ((zc.d) this.f57603l.get(i13)).a(this);
        }
        zc.g gVar2 = this.m;
        if (gVar2 != null) {
            gVar2.a(this);
        }
        if (cVar.l() != null) {
            zc.g gVarI = ((ed.b) cVar.l().f385b).I();
            this.f57605o = gVarI;
            gVarI.a(this);
            cVar.g(this.f57605o);
        }
    }

    @Override // zc.a
    public final void b() {
        this.f57596e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065 A[SYNTHETIC] */
    @Override // yc.c
    public final void c(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        a aVar = null;
        v vVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c cVar = (c) arrayList2.get(size);
            if (cVar instanceof v) {
                v vVar2 = (v) cVar;
                if (vVar2.f57730c == w.INDIVIDUALLY) {
                    vVar = vVar2;
                }
            }
        }
        if (vVar != null) {
            vVar.f(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.f57598g;
            if (size2 < 0) {
                break;
            }
            c cVar2 = (c) list2.get(size2);
            if (cVar2 instanceof v) {
                v vVar3 = (v) cVar2;
                if (vVar3.f57730c == w.INDIVIDUALLY) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                    a aVar2 = new a(vVar3);
                    vVar3.f(this);
                    aVar = aVar2;
                } else if (!(cVar2 instanceof n)) {
                    if (aVar == null) {
                        aVar = new a(vVar);
                    }
                    aVar.f57590a.add((n) cVar2);
                }
            } else if (!(cVar2 instanceof n)) {
                if (aVar == null) {
                    aVar = new a(vVar);
                }
                aVar.f57590a.add((n) cVar2);
            }
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01f8  */
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
    public void d(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        int i12;
        float f5;
        MaskFilter maskFilter;
        float[] fArr;
        b bVar2 = this;
        wc.a aVar = wc.d.f54943a;
        float[] fArr2 = (float[]) kd.k.f38128e.get();
        boolean z11 = false;
        fArr2[0] = 0.0f;
        int i13 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f11 = 100.0f;
        float fIntValue = ((Integer) bVar2.f57602k.f()).intValue() / 100.0f;
        int iC = kd.h.c((int) (i11 * fIntValue));
        gd.m mVar = bVar2.f57600i;
        mVar.setAlpha(iC);
        mVar.setStrokeWidth(bVar2.f57601j.m());
        if (mVar.getStrokeWidth() <= CropImageView.DEFAULT_ASPECT_RATIO) {
            return;
        }
        ArrayList arrayList = bVar2.f57603l;
        if (!arrayList.isEmpty()) {
            int i14 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = bVar2.f57599h;
                if (i14 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((zc.d) arrayList.get(i14)).f()).floatValue();
                fArr[i14] = fFloatValue;
                if (i14 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i14] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i14] = 0.1f;
                }
                i14++;
            }
            zc.g gVar = bVar2.m;
            mVar.setPathEffect(new DashPathEffect(fArr, gVar == null ? 0.0f : ((Float) gVar.f()).floatValue()));
            wc.a aVar2 = wc.d.f54943a;
        }
        zc.p pVar = bVar2.f57604n;
        if (pVar != null) {
            mVar.setColorFilter((ColorFilter) pVar.f());
        }
        zc.d dVar = bVar2.f57605o;
        if (dVar != null) {
            float fFloatValue2 = ((Float) dVar.f()).floatValue();
            if (fFloatValue2 == CropImageView.DEFAULT_ASPECT_RATIO) {
                mVar.setMaskFilter(null);
            } else if (fFloatValue2 != bVar2.f57606p) {
                gd.c cVar = bVar2.f57597f;
                if (cVar.A == fFloatValue2) {
                    maskFilter = cVar.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    cVar.B = blurMaskFilter;
                    cVar.A = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                mVar.setMaskFilter(maskFilter);
            }
            bVar2.f57606p = fFloatValue2;
        }
        if (bVar != null) {
            bVar.a((int) (fIntValue * 255.0f), mVar);
        }
        canvas.save();
        canvas.concat(matrix);
        int i15 = 0;
        while (true) {
            ArrayList arrayList2 = bVar2.f57598g;
            if (i15 >= arrayList2.size()) {
                canvas.restore();
                wc.a aVar3 = wc.d.f54943a;
                return;
            }
            a aVar4 = (a) arrayList2.get(i15);
            v vVar = aVar4.f57591b;
            ArrayList arrayList3 = aVar4.f57590a;
            Path path = bVar2.f57593b;
            if (vVar != null) {
                wc.a aVar5 = wc.d.f54943a;
                path.reset();
                for (int size2 = arrayList3.size() - i13; size2 >= 0; size2--) {
                    path.addPath(((n) arrayList3.get(size2)).a());
                }
                float fFloatValue3 = ((Float) vVar.f57731d.f()).floatValue() / f11;
                float fFloatValue4 = ((Float) vVar.f57732e.f()).floatValue() / f11;
                float fFloatValue5 = ((Float) vVar.f57733f.f()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = bVar2.f57592a;
                    pathMeasure.setPath(path, z11);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f12 = fFloatValue5 * length;
                    float f13 = (fFloatValue3 * length) + f12;
                    float fMin = Math.min((fFloatValue4 * length) + f12, (f13 + length) - 1.0f);
                    int size3 = arrayList3.size() - i13;
                    float f14 = 0.0f;
                    while (size3 >= 0) {
                        int i16 = i13;
                        Path pathA = ((n) arrayList3.get(size3)).a();
                        Path path2 = bVar2.f57594c;
                        path2.set(pathA);
                        pathMeasure.setPath(path2, z11);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f15 = fMin - length;
                            if (f15 >= f14 + length2 || f14 >= f15) {
                                f5 = f14 + length2;
                                if (f5 < f13 && f14 <= fMin) {
                                    if (f5 > fMin || f13 >= f14) {
                                        kd.k.a(path2, f13 < f14 ? 0.0f : (f13 - f14) / length2, fMin > f5 ? 1.0f : (fMin - f14) / length2, CropImageView.DEFAULT_ASPECT_RATIO);
                                        canvas.drawPath(path2, mVar);
                                    } else {
                                        canvas.drawPath(path2, mVar);
                                    }
                                }
                            } else {
                                kd.k.a(path2, f13 > length ? (f13 - length) / length2 : 0.0f, Math.min(f15 / length2, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO);
                                canvas.drawPath(path2, mVar);
                            }
                        } else {
                            f5 = f14 + length2;
                            if (f5 < f13) {
                            }
                        }
                        f14 += length2;
                        size3--;
                        bVar2 = this;
                        i13 = i16;
                        z11 = false;
                    }
                    i12 = i13;
                    wc.a aVar6 = wc.d.f54943a;
                } else {
                    canvas.drawPath(path, mVar);
                    wc.a aVar7 = wc.d.f54943a;
                    i12 = i13;
                }
            } else {
                i12 = i13;
                wc.a aVar8 = wc.d.f54943a;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((n) arrayList3.get(size4)).a());
                }
                wc.a aVar9 = wc.d.f54943a;
                canvas.drawPath(path, mVar);
            }
            i15++;
            bVar2 = this;
            i13 = i12;
            z11 = false;
            f11 = 100.0f;
        }
    }

    @Override // yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        wc.a aVar = wc.d.f54943a;
        Path path = this.f57593b;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f57598g;
            if (i11 >= arrayList.size()) {
                RectF rectF2 = this.f57595d;
                path.computeBounds(rectF2, false);
                float fM = this.f57601j.m() / 2.0f;
                rectF2.set(rectF2.left - fM, rectF2.top - fM, rectF2.right + fM, rectF2.bottom + fM);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                wc.a aVar2 = wc.d.f54943a;
                return;
            }
            a aVar3 = (a) arrayList.get(i11);
            for (int i12 = 0; i12 < aVar3.f57590a.size(); i12++) {
                path.addPath(((n) aVar3.f57590a.get(i12)).a(), matrix);
            }
            i11++;
        }
    }

    @Override // dd.g
    public void f(Object obj, ob.u uVar) {
        PointF pointF = z.f55043a;
        if (obj == 4) {
            this.f57602k.k(uVar);
            return;
        }
        if (obj == z.f55055n) {
            this.f57601j.k(uVar);
            return;
        }
        ColorFilter colorFilter = z.F;
        gd.c cVar = this.f57597f;
        if (obj == colorFilter) {
            zc.p pVar = this.f57604n;
            if (pVar != null) {
                cVar.o(pVar);
            }
            if (uVar == null) {
                this.f57604n = null;
                return;
            }
            zc.p pVar2 = new zc.p(null, uVar);
            this.f57604n = pVar2;
            pVar2.a(this);
            cVar.g(this.f57604n);
            return;
        }
        if (obj == z.f55047e) {
            zc.d dVar = this.f57605o;
            if (dVar != null) {
                dVar.k(uVar);
                return;
            }
            zc.p pVar3 = new zc.p(null, uVar);
            this.f57605o = pVar3;
            pVar3.a(this);
            cVar.g(this.f57605o);
        }
    }

    @Override // dd.g
    public final void h(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
        kd.h.g(fVar, i11, arrayList, fVar2, this);
    }
}
