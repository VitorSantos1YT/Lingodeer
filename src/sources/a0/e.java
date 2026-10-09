package a0;

import android.content.Context;
import android.view.MotionEvent;
import androidx.work.impl.WorkerStoppedException;
import com.google.api.Service;
import com.google.common.util.concurrent.ListenableFuture;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.a6;
import h1.e8;
import h1.i7;
import h1.ka;
import h1.m2;
import h1.s3;
import h1.s6;
import h1.t3;
import h1.t6;
import h1.t7;
import h1.u7;
import h1.wb;
import h1.x5;
import h1.y2;
import h1.za;
import j0.n2;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f59a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f60b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i11, Object obj, Object obj2) {
        super(1);
        this.f59a = i11;
        this.f60b = obj;
        this.f61c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.c
    public final Object invoke(Object obj) {
        qy.b0 b0Var;
        n9.x xVar;
        n9.x xVarA;
        int i11 = this.f59a;
        float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
        int i12 = 1;
        Object[] objArr = 0;
        qy.b0 b0Var2 = qy.b0.f48488a;
        Object obj2 = this.f61c;
        Object obj3 = this.f60b;
        switch (i11) {
            case 0:
                ((w2.f1) obj).f((w2.g1) obj3, 0, 0, ((p0) obj2).f164c.l());
                return b0Var2;
            case 1:
                w2.f1.p((w2.f1) obj, (w2.g1) obj3, 0, 0, ((g2.r) obj2).Q, 4);
                return b0Var2;
            case 2:
                w2.f1.p((w2.f1) obj, (w2.g1) obj3, 0, 0, ((g2.x0) obj2).f28627c0, 4);
                return b0Var2;
            case 3:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof WorkerStoppedException) {
                    ((fb.v) obj3).f27112c.compareAndSet(-256, ((WorkerStoppedException) th2).f2800a);
                }
                ((ListenableFuture) obj2).cancel(false);
                return b0Var2;
            case 4:
                y2.k0 k0Var = (y2.k0) obj;
                u7 u7Var = (u7) obj3;
                long j11 = ((m2) obj2).f30659v;
                j0.v1 v1Var = s3.f31051a;
                float f11 = y2.f31337a;
                float fE0 = k0Var.e0(f11);
                float fE1 = k0Var.e0(f11);
                float fE2 = k0Var.e0(k1.d.f37470g);
                float f12 = 2;
                float f13 = (fE1 - fE2) / f12;
                i2.b bVar = k0Var.f56937a;
                float f14 = 7;
                float fD = (f2.e.d(bVar.d()) - (f14 * fE0)) / f14;
                long j12 = u7Var.f31154a;
                int i13 = (int) (j12 >> 32);
                int i14 = (int) (j12 & 4294967295L);
                long j13 = u7Var.f31155b;
                int i15 = (int) (j13 >> 32);
                int i16 = (int) (j13 & 4294967295L);
                float f15 = fE0 + fD;
                float f16 = fD / f12;
                float fD2 = (i13 * f15) + (u7Var.f31156c ? fE0 / f12 : CropImageView.DEFAULT_ASPECT_RATIO) + f16;
                float f17 = (i14 * fE1) + f13;
                float fD3 = (i15 * f15) + (u7Var.f31157d ? fE0 / f12 : fE0) + f16;
                float f18 = (i16 * fE1) + f13;
                boolean z11 = k0Var.getLayoutDirection() == v3.m.Rtl;
                if (z11) {
                    fD2 = f2.e.d(bVar.d()) - fD2;
                    fD3 = f2.e.d(bVar.d()) - fD3;
                }
                i2.d.U(k0Var, j11, com.bumptech.glide.d.c(fD2, f17), com.bumptech.glide.g.b(i14 == i16 ? fD3 - fD2 : z11 ? -fD2 : f2.e.d(bVar.d()) - fD2, fE2), CropImageView.DEFAULT_ASPECT_RATIO, 120);
                if (i14 != i16) {
                    for (int i17 = (i16 - i14) - 1; i17 > 0; i17--) {
                        i2.d.U(k0Var, j11, com.bumptech.glide.d.c(CropImageView.DEFAULT_ASPECT_RATIO, (i17 * fE1) + f17), com.bumptech.glide.g.b(f2.e.d(bVar.d()), fE2), CropImageView.DEFAULT_ASPECT_RATIO, 120);
                    }
                    long jC = com.bumptech.glide.d.c(k0Var.getLayoutDirection() == v3.m.Ltr ? 0.0f : f2.e.d(bVar.d()), f18);
                    if (z11) {
                        fD3 -= f2.e.d(bVar.d());
                    }
                    i2.d.U(k0Var, j11, jC, com.bumptech.glide.g.b(fD3, fE2), CropImageView.DEFAULT_ASPECT_RATIO, 120);
                }
                k0Var.a();
                return b0Var2;
            case 5:
                List list = (List) obj;
                Long l9 = (Long) list.get(0);
                Long l11 = (Long) list.get(1);
                Long l12 = (Long) list.get(2);
                Object obj4 = list.get(3);
                kotlin.jvm.internal.m.d(obj4, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj4).intValue();
                Object obj5 = list.get(4);
                kotlin.jvm.internal.m.d(obj5, "null cannot be cast to non-null type kotlin.Int");
                lz.g gVar = new lz.g(iIntValue, ((Integer) obj5).intValue(), 1);
                Object obj6 = list.get(5);
                kotlin.jvm.internal.m.d(obj6, "null cannot be cast to non-null type kotlin.Int");
                return new t3(l9, l11, l12, gVar, ((Integer) obj6).intValue(), (t7) obj3, (Locale) obj2);
            case 6:
                g2.t0 t0Var = (g2.t0) obj;
                float fL = ((l1.g1) ((e8) obj3).f30211b.f44884j).l();
                float fB = f2.e.b(t0Var.Q);
                if (!Float.isNaN(fL) && !Float.isNaN(fB) && fB != CropImageView.DEFAULT_ASPECT_RATIO) {
                    float fFloatValue = ((Number) ((b0.d) obj2).d()).floatValue();
                    t0Var.h(a6.d(t0Var, fFloatValue));
                    t0Var.i(a6.e(t0Var, fFloatValue));
                    t0Var.p(g2.f0.j(0.5f, (fL + fB) / fB));
                }
                return b0Var2;
            case 7:
                g3.b0 b0Var3 = (g3.b0) obj;
                g3.z.g(b0Var3, 1.0f);
                g3.z.b(b0Var3, (String) obj3);
                b0Var3.b(g3.n.f28667b, new g3.a(null, new x5(i12, (fz.a) obj2)));
                return b0Var2;
            case 8:
                y2.k0 k0Var2 = (y2.k0) obj;
                long j14 = ((f2.e) ((i1.v0) obj3).get()).f26584a;
                float fD4 = f2.e.d(j14);
                if (fD4 > CropImageView.DEFAULT_ASPECT_RATIO) {
                    float fE3 = k0Var2.e0(t6.f31108a);
                    i2.b bVar2 = k0Var2.f56937a;
                    float fE4 = k0Var2.e0(((j0.t1) obj2).b(k0Var2.getLayoutDirection())) - fE3;
                    float f19 = 2;
                    float f21 = (fE3 * f19) + fD4 + fE4;
                    v3.m layoutDirection = k0Var2.getLayoutDirection();
                    int[] iArr = s6.f31057a;
                    float fD5 = iArr[layoutDirection.ordinal()] == 1 ? f2.e.d(bVar2.d()) - f21 : fE4 < CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : fE4;
                    if (iArr[k0Var2.getLayoutDirection().ordinal()] == 1) {
                        float fD6 = f2.e.d(bVar2.d());
                        if (fE4 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                            f5 = fE4;
                        }
                        f21 = fD6 - f5;
                    }
                    float f22 = f21;
                    float fB2 = f2.e.b(j14);
                    float f23 = (-fB2) / f19;
                    float f24 = fB2 / f19;
                    xq.c cVar = bVar2.f34121b;
                    long jH = cVar.H();
                    cVar.x().e();
                    try {
                        ((b2) cVar.f56174b).e(fD5, f23, f22, f24, 0);
                        k0Var2.a();
                    } finally {
                        com.google.android.material.datepicker.d.C(cVar, jH);
                    }
                } else {
                    k0Var2.a();
                }
                return b0Var2;
            case 9:
                i2.d dVar = (i2.d) obj;
                float fE5 = dVar.e0(i7.f30424c);
                b3 b3Var = (b3) obj3;
                long j15 = ((g2.x) b3Var.getValue()).f28624a;
                float f25 = 2;
                float fE6 = dVar.e0(k1.a0.f37434c / f25);
                float f26 = fE5 / f25;
                i2.d.j(dVar, j15, fE6 - f26, 0L, new i2.h(fE5, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 0, 108);
                b3 b3Var2 = (b3) obj2;
                if (v3.f.a(((v3.f) b3Var2.getValue()).f53489a, 0) > 0) {
                    i2.d.j(dVar, ((g2.x) b3Var.getValue()).f28624a, dVar.e0(((v3.f) b3Var2.getValue()).f53489a) - f26, 0L, i2.g.f34126a, 0, 108);
                }
                return b0Var2;
            case 10:
                ((i1.r0) obj3).f34063a.setValue(new j0.c0((n2) obj2, (n2) obj));
                return b0Var2;
            case 11:
                w2.x xVar2 = (w2.x) obj;
                l1.b1 b1Var = (l1.b1) obj3;
                w2.x xVarH = xVar2.h();
                b1Var.setValue(new v3.j(xVarH != null ? ff.h.q(xVarH.m()) : 0L));
                ((l1.b1) obj2).setValue(new f2.b(w2.a0.e(xVar2).b()));
                return b0Var2;
            case 12:
                y2.k0 k0Var3 = (y2.k0) obj;
                h1.n nVar = (h1.n) obj3;
                long jC2 = com.bumptech.glide.d.c(k0Var3.e0(v3.g.a(wb.q(nVar))), k0Var3.e0(Float.intBitsToFloat((int) (4294967295L & wb.q(nVar)))));
                float f27 = 2;
                float fE7 = k0Var3.e0(k1.k0.f37583g) / f27;
                za zaVar = (za) obj2;
                long j16 = zaVar.f31430b;
                i2.d.j(k0Var3, g2.x.f28615b, fE7, jC2, null, 0, 56);
                k0Var3.a();
                i2.d.j(k0Var3, j16, fE7, jC2, null, 11, 56);
                float fE8 = k0Var3.e0(k1.k0.f37584h);
                long jG = f2.b.g(jC2, com.bumptech.glide.d.c(((float) Math.cos(((Number) nVar.f30709d.d()).floatValue())) * fE7, ((float) Math.sin(((Number) nVar.f30709d.d()).floatValue())) * fE7));
                i2.b bVar3 = k0Var3.f56937a;
                k0Var3.f0(j16, com.bumptech.glide.g.l(bVar3.d()), jG, (480 & 8) != 0 ? 0.0f : fE8, (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
                i2.d.j(k0Var3, j16, k0Var3.e0(k1.k0.f37581e) / f27, com.bumptech.glide.g.l(bVar3.d()), null, 0, 120);
                i2.d.j(k0Var3, zaVar.f31433e, fE7, jC2, null, 4, 56);
                return b0Var2;
            case 13:
                g2.f0.n((i2.d) obj, (g2.f0) obj3, ((ka) obj2).a());
                return b0Var2;
            case 14:
                d2.e eVar = (d2.e) obj;
                return eVar.a(new e(13, ((g2.w0) obj3).a(eVar.f23069a.d(), eVar.f23069a.getLayoutDirection(), eVar), (ka) obj2));
            case 15:
                kb.c it = (kb.c) obj;
                kotlin.jvm.internal.m.f(it, "it");
                ((rz.z1) obj3).cancel(null);
                ((tz.s) ((tz.t) obj2)).i(it);
                return b0Var2;
            case 16:
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    ((tz.h) obj2).i(b0Var2);
                }
                return b0Var2;
            case 17:
                if (kotlin.jvm.internal.m.a((String) obj, ((File) obj3).getName())) {
                    tz.t tVar = (tz.t) obj2;
                    Object objI = tVar.i(b0Var2);
                    if (objI instanceof tz.n) {
                        Object obj7 = ((tz.o) rz.e0.F(vy.j.f54321a, new rt.h(20, tVar, b0Var2, objArr == true ? 1 : 0))).f52707a;
                    }
                }
                return b0Var2;
            case 18:
                Throwable th3 = (Throwable) obj;
                ((o0) obj3).invoke(th3);
                tz.h hVar = (tz.h) ((dm.c) obj2).f23492d;
                hVar.l(th3, false);
                do {
                    Object objA = tz.o.a(hVar.d());
                    if (objA != null) {
                        ((n5.h0) objA).f43283b.X(th3 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th3);
                        b0Var = b0Var2;
                    } else {
                        b0Var = null;
                    }
                } while (b0Var != null);
                return b0Var2;
            case 19:
                n9.e eVar2 = (n9.e) obj;
                n9.y loadType = (n9.y) obj3;
                if (eVar2 == null || (xVar = eVar2.f43544d) == null) {
                    xVar = n9.x.f43732d;
                }
                n9.x xVar3 = eVar2 != null ? eVar2.f43545e : null;
                xVar.getClass();
                kotlin.jvm.internal.m.f(loadType, "loadType");
                int i18 = n9.w.f43717a[loadType.ordinal()];
                if (i18 == 1) {
                    xVarA = n9.x.a(xVar, 3);
                } else if (i18 == 2) {
                    xVarA = n9.x.a(xVar, 5);
                } else {
                    if (i18 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xVarA = n9.x.a(xVar, 6);
                }
                return ob.m.E((ob.m) obj2, eVar2, xVarA, xVar3);
            case 20:
                int iIntValue2 = ((Number) obj).intValue();
                fz.c cVar2 = (fz.c) obj3;
                Object obj8 = ((n9.r) ((o9.b) obj2).f44749c.getValue()).get(iIntValue2);
                return obj8 == null ? new o9.e(iIntValue2) : cVar2.invoke(obj8);
            case 21:
                fz.e eVar3 = (fz.e) obj2;
                lc.d dVar2 = (lc.d) obj3;
                Object text = vc.a.k(dVar2).getText();
                if (text == null) {
                    text = BuildConfig.VERSION_NAME;
                }
                eVar3.invoke(dVar2, text);
                return b0Var2;
            case 22:
                Throwable th4 = (Throwable) obj;
                a4.i iVar = (a4.i) obj3;
                if (th4 == null) {
                    iVar.a(((rz.i0) obj2).y());
                } else if (th4 instanceof CancellationException) {
                    iVar.f350d = true;
                    a4.l lVar = iVar.f348b;
                    if (lVar != null && lVar.f352b.cancel(true)) {
                        iVar.f347a = null;
                        iVar.f348b = null;
                        iVar.f349c = null;
                    }
                } else {
                    iVar.b(th4);
                }
                return b0Var2;
            case 23:
                MotionEvent motionEvent = (MotionEvent) obj;
                s2.z zVar = (s2.z) obj2;
                if (motionEvent.getActionMasked() == 0) {
                    ob.i iVar2 = (ob.i) obj3;
                    s2.a0 a0Var = zVar.f51373a;
                    if (a0Var == null) {
                        kotlin.jvm.internal.m.n("onTouchEvent");
                        throw null;
                    }
                    iVar2.f44814c = ((Boolean) a0Var.invoke(motionEvent)).booleanValue() ? s2.x.Dispatching : s2.x.NotDispatching;
                } else {
                    s2.a0 a0Var2 = zVar.f51373a;
                    if (a0Var2 == null) {
                        kotlin.jvm.internal.m.n("onTouchEvent");
                        throw null;
                    }
                    a0Var2.invoke(motionEvent);
                }
                return b0Var2;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                i.a result = (i.a) obj;
                kotlin.jvm.internal.m.f(result, "result");
                int i19 = result.f33864a;
                if (i19 == -1) {
                    ((tf.x) obj3).q().k(lf.i.Login.a(), i19, result.f33865b);
                } else {
                    ((androidx.fragment.app.p0) obj2).finish();
                }
                return b0Var2;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((y2.i0) obj3).g0(((z1.r) obj).i((z1.r) obj2));
                return b0Var2;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((w2.f1) obj).f((w2.g1) obj3, 0, 0, ((z1.v) obj2).Q);
                return b0Var2;
            case 27:
                Context context = (Context) obj3;
                z2.i0 i0Var = (z2.i0) obj2;
                context.getApplicationContext().registerComponentCallbacks(i0Var);
                return new b0.l0(17, context, i0Var);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                Context context2 = (Context) obj3;
                z2.j0 j0Var = (z2.j0) obj2;
                context2.getApplicationContext().registerComponentCallbacks(j0Var);
                return new b0.l0(18, context2, j0Var);
            default:
                return new z2.q1((b1.w) obj3, new w2.l1((z2.m0) obj2, 6));
        }
    }
}
