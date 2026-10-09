package yc;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import wc.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends b {
    public zc.p A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f57658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f57659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y.r f57660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y.r f57661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f57662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final fd.f f57663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f57664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zc.h f57665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final zc.h f57666y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final zc.h f57667z;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(wc.v vVar, gd.c cVar, fd.e eVar) {
        Paint.Join join;
        Paint.Join join2;
        int iOrdinal = eVar.f27165h.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = eVar.f27166i.ordinal();
        if (iOrdinal2 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    join2 = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
                super(vVar, cVar, cap, join2, eVar.f27167j, eVar.f27161d, eVar.f27164g, eVar.f27168k, eVar.f27169l);
                this.f57660s = new y.r((Object) null);
                this.f57661t = new y.r((Object) null);
                this.f57662u = new RectF();
                this.f57658q = eVar.f27158a;
                this.f57663v = eVar.f27159b;
                this.f57659r = eVar.m;
                this.f57664w = (int) (vVar.f55010a.b() / 32.0f);
                zc.d dVarI = eVar.f27160c.I();
                this.f57665x = (zc.h) dVarI;
                dVarI.a(this);
                cVar.g(dVarI);
                zc.d dVarI2 = eVar.f27162e.I();
                this.f57666y = (zc.h) dVarI2;
                dVarI2.a(this);
                cVar.g(dVarI2);
                zc.d dVarI3 = eVar.f27163f.I();
                this.f57667z = (zc.h) dVarI3;
                dVarI3.a(this);
                cVar.g(dVarI3);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(vVar, cVar, cap, join2, eVar.f27167j, eVar.f27161d, eVar.f27164g, eVar.f27168k, eVar.f27169l);
        this.f57660s = new y.r((Object) null);
        this.f57661t = new y.r((Object) null);
        this.f57662u = new RectF();
        this.f57658q = eVar.f27158a;
        this.f57663v = eVar.f27159b;
        this.f57659r = eVar.m;
        this.f57664w = (int) (vVar.f55010a.b() / 32.0f);
        zc.d dVarI4 = eVar.f27160c.I();
        this.f57665x = (zc.h) dVarI4;
        dVarI4.a(this);
        cVar.g(dVarI4);
        zc.d dVarI5 = eVar.f27162e.I();
        this.f57666y = (zc.h) dVarI5;
        dVarI5.a(this);
        cVar.g(dVarI5);
        zc.d dVarI6 = eVar.f27163f.I();
        this.f57667z = (zc.h) dVarI6;
        dVarI6.a(this);
        cVar.g(dVarI6);
    }

    @Override // yc.b, yc.e
    public final void d(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
        Shader shader;
        Shader radialGradient;
        if (this.f57659r) {
            return;
        }
        e(this.f57662u, matrix, false);
        fd.f fVar = this.f57663v;
        fd.f fVar2 = fd.f.LINEAR;
        zc.h hVar = this.f57665x;
        zc.h hVar2 = this.f57667z;
        zc.h hVar3 = this.f57666y;
        if (fVar == fVar2) {
            long jI = i();
            y.r rVar = this.f57660s;
            shader = (LinearGradient) rVar.c(jI);
            if (shader == null) {
                PointF pointF = (PointF) hVar3.f();
                PointF pointF2 = (PointF) hVar2.f();
                fd.c cVar = (fd.c) hVar.f();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, g(cVar.f27149b), cVar.f27148a, Shader.TileMode.CLAMP);
                rVar.h(jI, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            y.r rVar2 = this.f57661t;
            shader = (RadialGradient) rVar2.c(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) hVar3.f();
                PointF pointF4 = (PointF) hVar2.f();
                fd.c cVar2 = (fd.c) hVar.f();
                int[] iArrG = g(cVar2.f27149b);
                float[] fArr = cVar2.f27148a;
                float f5 = pointF3.x;
                float f11 = pointF3.y;
                radialGradient = new RadialGradient(f5, f11, (float) Math.hypot(pointF4.x - f5, pointF4.y - f11), iArrG, fArr, Shader.TileMode.CLAMP);
                rVar2.h(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        this.f57600i.setShader(shader);
        super.d(canvas, matrix, i11, bVar);
    }

    @Override // yc.b, dd.g
    public final void f(Object obj, ob.u uVar) {
        super.f(obj, uVar);
        if (obj == z.G) {
            zc.p pVar = this.A;
            gd.c cVar = this.f57597f;
            if (pVar != null) {
                cVar.o(pVar);
            }
            if (uVar == null) {
                this.A = null;
                return;
            }
            zc.p pVar2 = new zc.p(null, uVar);
            this.A = pVar2;
            pVar2.a(this);
            cVar.g(this.A);
        }
    }

    public final int[] g(int[] iArr) {
        zc.p pVar = this.A;
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
        return this.f57658q;
    }

    public final int i() {
        float f5 = this.f57666y.f59096d;
        float f11 = this.f57664w;
        int iRound = Math.round(f5 * f11);
        int iRound2 = Math.round(this.f57667z.f59096d * f11);
        int iRound3 = Math.round(this.f57665x.f59096d * f11);
        int i11 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i11 = i11 * 31 * iRound2;
        }
        return iRound3 != 0 ? i11 * 31 * iRound3 : i11;
    }
}
