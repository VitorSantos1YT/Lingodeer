package yc;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.List;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e, zc.a, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f57640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gd.c f57641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y.r f57642d = new y.r((Object) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y.r f57643e = new y.r((Object) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f57644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gd.m f57645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f57646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f57647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fd.f f57648j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zc.h f57649k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zc.e f57650l;
    public final zc.h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zc.h f57651n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public zc.p f57652o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zc.p f57653p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wc.v f57654q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f57655r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public zc.d f57656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f57657t;

    public h(wc.v vVar, wc.h hVar, gd.c cVar, fd.d dVar) {
        Path path = new Path();
        this.f57644f = path;
        this.f57645g = new gd.m(1, 2);
        this.f57646h = new RectF();
        this.f57647i = new ArrayList();
        this.f57657t = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f57641c = cVar;
        this.f57639a = dVar.f27156g;
        this.f57640b = dVar.f27157h;
        this.f57654q = vVar;
        this.f57648j = dVar.f27150a;
        path.setFillType(dVar.f27151b);
        this.f57655r = (int) (hVar.b() / 32.0f);
        zc.d dVarI = dVar.f27152c.I();
        this.f57649k = (zc.h) dVarI;
        dVarI.a(this);
        cVar.g(dVarI);
        zc.d dVarI2 = dVar.f27153d.I();
        this.f57650l = (zc.e) dVarI2;
        dVarI2.a(this);
        cVar.g(dVarI2);
        zc.d dVarI3 = dVar.f27154e.I();
        this.m = (zc.h) dVarI3;
        dVarI3.a(this);
        cVar.g(dVarI3);
        zc.d dVarI4 = dVar.f27155f.I();
        this.f57651n = (zc.h) dVarI4;
        dVarI4.a(this);
        cVar.g(dVarI4);
        if (cVar.l() != null) {
            zc.g gVarI = ((ed.b) cVar.l().f385b).I();
            this.f57656s = gVarI;
            gVarI.a(this);
            cVar.g(this.f57656s);
        }
    }

    @Override // zc.a
    public final void b() {
        this.f57654q.invalidateSelf();
    }

    @Override // yc.c
    public final void c(List list, List list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = (c) list2.get(i11);
            if (cVar instanceof n) {
                this.f57647i.add((n) cVar);
            }
        }
    }

    @Override // yc.e
    public final void d(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.f57640b) {
            return;
        }
        wc.a aVar = wc.d.f54943a;
        Path path = this.f57644f;
        path.reset();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f57647i;
            if (i12 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i12)).a(), matrix);
            i12++;
        }
        path.computeBounds(this.f57646h, false);
        fd.f fVar = this.f57648j;
        fd.f fVar2 = fd.f.LINEAR;
        zc.h hVar = this.f57649k;
        zc.h hVar2 = this.f57651n;
        zc.h hVar3 = this.m;
        if (fVar == fVar2) {
            long jI = i();
            y.r rVar = this.f57642d;
            linearGradient = (LinearGradient) rVar.c(jI);
            if (linearGradient == null) {
                PointF pointF = (PointF) hVar3.f();
                PointF pointF2 = (PointF) hVar2.f();
                fd.c cVar = (fd.c) hVar.f();
                int[] iArrG = g(cVar.f27149b);
                float[] fArr2 = cVar.f27148a;
                if (iArrG.length < 2) {
                    int[] iArr3 = {iArrG[0], iArrG[0]};
                    fArr2 = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 1.0f};
                    iArr2 = iArr3;
                } else {
                    iArr2 = iArrG;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                rVar.h(jI, linearGradient);
            }
        } else {
            long jI2 = i();
            y.r rVar2 = this.f57643e;
            RadialGradient radialGradient = (RadialGradient) rVar2.c(jI2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) hVar3.f();
                PointF pointF4 = (PointF) hVar2.f();
                fd.c cVar2 = (fd.c) hVar.f();
                int[] iArrG2 = g(cVar2.f27149b);
                float[] fArr3 = cVar2.f27148a;
                if (iArrG2.length < 2) {
                    iArr = new int[]{iArrG2[0], iArrG2[0]};
                    fArr = new float[]{CropImageView.DEFAULT_ASPECT_RATIO, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrG2;
                }
                float f5 = pointF3.x;
                float f11 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f5, pointF4.y - f11);
                if (fHypot <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f5, f11, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                rVar2.h(jI2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        gd.m mVar = this.f57645g;
        mVar.setShader(linearGradient);
        zc.p pVar = this.f57652o;
        if (pVar != null) {
            mVar.setColorFilter((ColorFilter) pVar.f());
        }
        zc.d dVar = this.f57656s;
        if (dVar != null) {
            float fFloatValue = ((Float) dVar.f()).floatValue();
            if (fFloatValue == CropImageView.DEFAULT_ASPECT_RATIO) {
                mVar.setMaskFilter(null);
            } else if (fFloatValue != this.f57657t) {
                mVar.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f57657t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f57650l.f()).intValue() / 100.0f;
        mVar.setAlpha(kd.h.c((int) (i11 * fIntValue)));
        if (bVar != null) {
            bVar.a((int) (fIntValue * 255.0f), mVar);
        }
        canvas.drawPath(path, mVar);
        wc.a aVar2 = wc.d.f54943a;
    }

    @Override // yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        Path path = this.f57644f;
        path.reset();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f57647i;
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
        if (obj == 4) {
            this.f57650l.k(uVar);
            return;
        }
        ColorFilter colorFilter = z.F;
        gd.c cVar = this.f57641c;
        if (obj == colorFilter) {
            zc.p pVar = this.f57652o;
            if (pVar != null) {
                cVar.o(pVar);
            }
            if (uVar == null) {
                this.f57652o = null;
                return;
            }
            zc.p pVar2 = new zc.p(null, uVar);
            this.f57652o = pVar2;
            pVar2.a(this);
            cVar.g(this.f57652o);
            return;
        }
        if (obj != z.G) {
            if (obj == z.f55047e) {
                zc.d dVar = this.f57656s;
                if (dVar != null) {
                    dVar.k(uVar);
                    return;
                }
                zc.p pVar3 = new zc.p(null, uVar);
                this.f57656s = pVar3;
                pVar3.a(this);
                cVar.g(this.f57656s);
                return;
            }
            return;
        }
        zc.p pVar4 = this.f57653p;
        if (pVar4 != null) {
            cVar.o(pVar4);
        }
        if (uVar == null) {
            this.f57653p = null;
            return;
        }
        this.f57642d.a();
        this.f57643e.a();
        zc.p pVar5 = new zc.p(null, uVar);
        this.f57653p = pVar5;
        pVar5.a(this);
        cVar.g(this.f57653p);
    }

    public final int[] g(int[] iArr) {
        zc.p pVar = this.f57653p;
        if (pVar != null) {
            Integer[] numArr = (Integer[]) pVar.f();
            int i11 = 0;
            if (iArr.length == numArr.length) {
                while (i11 < iArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i11 < numArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            }
        }
        return iArr;
    }

    @Override // yc.c
    public final String getName() {
        return this.f57639a;
    }

    @Override // dd.g
    public final void h(dd.f fVar, int i11, ArrayList arrayList, dd.f fVar2) {
        kd.h.g(fVar, i11, arrayList, fVar2, this);
    }

    public final int i() {
        float f5 = this.m.f59096d;
        float f11 = this.f57655r;
        int iRound = Math.round(f5 * f11);
        int iRound2 = Math.round(this.f57651n.f59096d * f11);
        int iRound3 = Math.round(this.f57649k.f59096d * f11);
        int i11 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }
}
