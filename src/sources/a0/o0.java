package a0;

import android.content.Context;
import android.os.CancellationSignal;
import android.view.View;
import com.google.api.Service;
import com.google.common.util.concurrent.ListenableFuture;
import com.yalantis.ucrop.view.CropImageView;
import h1.a6;
import h1.cc;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import y2.f2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f154b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Object obj, int i11) {
        super(1);
        this.f153a = i11;
        this.f154b = obj;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f153a;
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        switch (i11) {
            case 0:
                b0.r rVar = (b0.r) obj;
                float f11 = rVar.f3652b;
                if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    f11 = 0.0f;
                }
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                float f12 = rVar.f3653c;
                if (f12 < -0.5f) {
                    f12 = -0.5f;
                }
                if (f12 > 0.5f) {
                    f12 = 0.5f;
                }
                float f13 = rVar.f3654d;
                float f14 = f13 >= -0.5f ? f13 : -0.5f;
                float f15 = f14 <= 0.5f ? f14 : 0.5f;
                float f16 = rVar.f3651a;
                if (f16 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                    f5 = f16;
                }
                return new g2.x(g2.x.b(g2.f0.b(f11, f12, f15, f5 <= 1.0f ? f5 : 1.0f, h2.e.f31482x), (h2.c) this.f154b));
            case 1:
                return Boolean.valueOf(!kotlin.jvm.internal.m.a(obj, ((b0.c2) this.f154b).f3461d.getValue()));
            case 2:
                ((ListenableFuture) this.f154b).cancel(false);
                return qy.b0.f48488a;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(entry, "entry");
                Collection collection = (Collection) this.f154b;
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = z4.s0.f58893a;
                return Boolean.valueOf(ry.m.i0(collection, z4.j0.f(view)));
            case 4:
                c2.g gVar = (c2.g) obj;
                if (!gVar.f58482a.P) {
                    return f2.SkipSubtreeAndContinueTraversal;
                }
                c2.g gVar2 = gVar.R;
                if (gVar2 != null) {
                    o0 o0Var = new o0((b2) this.f154b, 4);
                    if (o0Var.invoke(gVar2) == f2.ContinueTraversal) {
                        y2.f.C(gVar2, o0Var);
                    }
                }
                gVar.R = null;
                gVar.Q = null;
                return f2.ContinueTraversal;
            case 5:
                g2.t0 t0Var = (g2.t0) obj;
                d2.o oVar = (d2.o) this.f154b;
                t0Var.k(t0Var.R.getDensity() * e0.f.f24649d);
                t0Var.l(oVar.f23082a);
                t0Var.e(oVar.f23083b);
                t0Var.c(oVar.f23084c);
                t0Var.m(oVar.f23085d);
                return qy.b0.f48488a;
            case 6:
                ((tz.s) ((tz.t) this.f154b)).i(null);
                return qy.b0.f48488a;
            case 7:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.f154b).cancel();
                }
                return qy.b0.f48488a;
            case 8:
                g2.t0 t0Var2 = (g2.t0) obj;
                g2.x0 x0Var = (g2.x0) this.f154b;
                t0Var2.h(x0Var.Q);
                t0Var2.i(x0Var.R);
                t0Var2.b(x0Var.S);
                t0Var2.q(CropImageView.DEFAULT_ASPECT_RATIO);
                t0Var2.r(CropImageView.DEFAULT_ASPECT_RATIO);
                t0Var2.k(x0Var.T);
                float f17 = x0Var.U;
                if (t0Var2.L != f17) {
                    t0Var2.f28600a |= 1024;
                    t0Var2.L = f17;
                }
                float f18 = x0Var.V;
                if (t0Var2.M != f18) {
                    t0Var2.f28600a |= 2048;
                    t0Var2.M = f18;
                }
                t0Var2.p(x0Var.W);
                t0Var2.l(x0Var.X);
                t0Var2.e(x0Var.Y);
                t0Var2.f(null);
                t0Var2.c(x0Var.Z);
                t0Var2.m(x0Var.f28625a0);
                int i12 = x0Var.f28626b0;
                if (t0Var2.U != i12) {
                    t0Var2.f28600a |= 524288;
                    t0Var2.U = i12;
                }
                return qy.b0.f48488a;
            case 9:
                g3.z.d((g3.b0) obj, ((g3.k) this.f154b).f28656a);
                return qy.b0.f48488a;
            case 10:
                ((List) obj).add((Float) ((n0.u0) this.f154b).invoke());
                return true;
            case 11:
                float fFloatValue = ((Number) obj).floatValue();
                cc ccVar = (cc) ((a9.i) this.f154b).f517a;
                ccVar.b(ccVar.f30112c.l() + fFloatValue);
                return qy.b0.f48488a;
            case 12:
                ((cc) this.f154b).b(((Number) ((b0.l) obj).f3591e.getValue()).floatValue());
                return qy.b0.f48488a;
            case 13:
                long j11 = ((f2.b) obj).f26570a;
                h1.r1 r1Var = (h1.r1) this.f154b;
                rz.e0.B(r1Var.H0(), null, null, new h1.o1(r1Var, j11, null, 1), 3);
                return qy.b0.f48488a;
            case 14:
                g3.z.b((g3.b0) obj, (String) ((qy.l) this.f154b).f48495a);
                return qy.b0.f48488a;
            case 15:
                List list = (List) this.f154b;
                mz.j[] jVarArr = g3.z.f28737a;
                g3.a0 a0Var = g3.n.f28688x;
                mz.j jVar = g3.z.f28737a[29];
                ((g3.b0) obj).b(a0Var, list);
                return qy.b0.f48488a;
            case 16:
                i2.d dVar = (i2.d) obj;
                ((k2.b) this.f154b).g(dVar, dVar.d(), 1.0f, null);
                return qy.b0.f48488a;
            case 17:
                g2.t0 t0Var3 = (g2.t0) obj;
                float fFloatValue2 = ((Number) ((b0.d) this.f154b).d()).floatValue();
                float fD = a6.d(t0Var3, fFloatValue2);
                float fE = a6.e(t0Var3, fFloatValue2);
                t0Var3.i(fE != CropImageView.DEFAULT_ASPECT_RATIO ? fD / fE : 1.0f);
                t0Var3.p(a6.f29982c);
                return qy.b0.f48488a;
            case 18:
                i2.d dVar2 = (i2.d) obj;
                j2.c cVar = (j2.c) this.f154b;
                g2.p0 p0Var = cVar.f35555l;
                if (cVar.f35556n && cVar.f35565w && p0Var != null) {
                    xq.c cVarJ0 = dVar2.j0();
                    long jH = cVarJ0.H();
                    cVarJ0.x().e();
                    try {
                        ((b2) cVarJ0.f56174b).c(p0Var);
                        cVar.d(dVar2);
                    } finally {
                        com.google.android.material.datepicker.d.C(cVarJ0, jH);
                    }
                } else {
                    cVar.d(dVar2);
                }
                return qy.b0.f48488a;
            case 19:
                g2.t0 graphicsLayer = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.r(((kw.h) this.f154b).f38868e.l() - f2.e.b(graphicsLayer.Q));
                return qy.b0.f48488a;
            case 20:
                l2.c0 c0Var = (l2.c0) obj;
                l2.b bVar = (l2.b) this.f154b;
                bVar.g(c0Var);
                fz.c cVar2 = bVar.f39541i;
                if (cVar2 != null) {
                    cVar2.invoke(c0Var);
                }
                return qy.b0.f48488a;
            case 21:
                m6.f fVar = (m6.f) this.f154b;
                synchronized (fVar.f40880c) {
                    fVar.f40881d = 5;
                    fVar.f40883f = null;
                }
                return qy.b0.f48488a;
            case 22:
                ((rz.g1) this.f154b).cancel(null);
                return qy.b0.f48488a;
            case 23:
                Throwable th2 = (Throwable) obj;
                n5.v vVar = (n5.v) this.f154b;
                qy.q qVar = vVar.f43407j;
                if (th2 != null) {
                    vVar.f43405h.q(new n5.f0(th2));
                }
                if (qVar.a()) {
                    ((n5.c0) qVar.getValue()).close();
                }
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                File it = (File) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return new n5.n0(((wz.d) this.f154b).f55510a, it);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((uz.w0) ((a9.i) this.f154b).f518b).d(null);
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((n9.y1) this.f154b).f43739a.l(null, false);
                return qy.b0.f48488a;
            case 27:
                Throwable th3 = (Throwable) obj;
                s2.k0 k0Var = (s2.k0) this.f154b;
                rz.m mVar = k0Var.f51324c;
                if (mVar != null) {
                    mVar.k(th3);
                }
                k0Var.f51324c = null;
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                kotlin.jvm.internal.m.f((Context) obj, "it");
                return new t9.b((Context) this.f154b, 0);
            default:
                return obj == ((y.e0) this.f154b) ? "(this)" : String.valueOf(obj);
        }
    }
}
