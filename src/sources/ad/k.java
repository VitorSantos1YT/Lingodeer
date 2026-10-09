package ad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import l1.b1;
import w2.k1;
import wc.e0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.n implements fz.c {
    public final /* synthetic */ wc.h H;
    public final /* synthetic */ t K;
    public final /* synthetic */ Context L;
    public final /* synthetic */ fz.a M;
    public final /* synthetic */ b1 N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.j f614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.e f615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wc.v f617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f618f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wc.a f619t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Rect rect, w2.j jVar, z1.e eVar, Matrix matrix, wc.v vVar, e0 e0Var, wc.a aVar, wc.h hVar, t tVar, Context context, fz.a aVar2, b1 b1Var) {
        super(1);
        this.f613a = rect;
        this.f614b = jVar;
        this.f615c = eVar;
        this.f616d = matrix;
        this.f617e = vVar;
        this.f618f = e0Var;
        this.f619t = aVar;
        this.H = hVar;
        this.K = tVar;
        this.L = context;
        this.M = aVar2;
        this.N = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        i2.d Canvas = (i2.d) obj;
        kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
        g2.v vVarX = Canvas.j0().x();
        Rect rect = this.f613a;
        long jB = com.bumptech.glide.g.b(rect.width(), rect.height());
        long jB2 = ff.h.b(hz.b.Q(f2.e.d(Canvas.d())), hz.b.Q(f2.e.b(Canvas.d())));
        long jA = this.f614b.a(jB, Canvas.d());
        float fD = f2.e.d(jB);
        int i11 = k1.f54535a;
        int i12 = (int) (jA >> 32);
        int i13 = (int) (jA & 4294967295L);
        long jA2 = this.f615c.a(ff.h.b((int) (Float.intBitsToFloat(i12) * fD), (int) (Float.intBitsToFloat(i13) * f2.e.b(jB))), jB2, Canvas.getLayoutDirection());
        Matrix matrix = this.f616d;
        matrix.reset();
        matrix.preTranslate((int) (jA2 >> 32), (int) (jA2 & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i12), Float.intBitsToFloat(i13));
        wc.w wVar = wc.w.MergePathsApi19;
        wc.v vVar = this.f617e;
        vVar.h(wVar, false);
        vVar.f55018e = false;
        vVar.Y = this.f618f;
        vVar.e();
        vVar.f55030o0 = this.f619t;
        vVar.o(this.H);
        if (vVar.M != null) {
            vVar.M = null;
            vVar.invalidateSelf();
        }
        b1 b1Var = this.N;
        t tVar = (t) b1Var.getValue();
        t tVar2 = this.K;
        if (tVar2 != tVar) {
            t tVar3 = (t) b1Var.getValue();
            if (tVar3 != null) {
                ArrayList arrayList = tVar3.f631a;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    v vVar2 = (v) obj2;
                    vVar.a(vVar2.f644b, vVar2.f643a, null);
                }
                ArrayList arrayList2 = tVar3.f632b;
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj3 = arrayList2.get(i15);
                    i15++;
                    v vVar3 = (v) obj3;
                    vVar.a(vVar3.f644b, vVar3.f643a, null);
                }
                ArrayList arrayList3 = tVar3.f633c;
                int size3 = arrayList3.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj4 = arrayList3.get(i16);
                    i16++;
                    v vVar4 = (v) obj4;
                    vVar.a(vVar4.f644b, vVar4.f643a, null);
                }
                ArrayList arrayList4 = tVar3.f634d;
                int size4 = arrayList4.size();
                int i17 = 0;
                while (i17 < size4) {
                    Object obj5 = arrayList4.get(i17);
                    i17++;
                    v vVar5 = (v) obj5;
                    vVar.a(vVar5.f644b, vVar5.f643a, null);
                }
                ArrayList arrayList5 = tVar3.f635e;
                int size5 = arrayList5.size();
                int i18 = 0;
                while (i18 < size5) {
                    Object obj6 = arrayList5.get(i18);
                    i18++;
                    v vVar6 = (v) obj6;
                    vVar.a(vVar6.f644b, vVar6.f643a, null);
                }
                ArrayList arrayList6 = tVar3.f636f;
                int size6 = arrayList6.size();
                int i19 = 0;
                while (i19 < size6) {
                    Object obj7 = arrayList6.get(i19);
                    i19++;
                    v vVar7 = (v) obj7;
                    vVar.a(vVar7.f644b, vVar7.f643a, null);
                }
                ArrayList arrayList7 = tVar3.f637g;
                int size7 = arrayList7.size();
                int i21 = 0;
                while (i21 < size7) {
                    Object obj8 = arrayList7.get(i21);
                    i21++;
                    v vVar8 = (v) obj8;
                    vVar.a(vVar8.f644b, vVar8.f643a, null);
                }
                ArrayList arrayList8 = tVar3.f638h;
                int size8 = arrayList8.size();
                int i22 = 0;
                while (i22 < size8) {
                    Object obj9 = arrayList8.get(i22);
                    i22++;
                    v vVar9 = (v) obj9;
                    vVar.a(vVar9.f644b, vVar9.f643a, null);
                }
                ArrayList arrayList9 = tVar3.f639i;
                int size9 = arrayList9.size();
                int i23 = 0;
                while (i23 < size9) {
                    Object obj10 = arrayList9.get(i23);
                    i23++;
                    v vVar10 = (v) obj10;
                    vVar.a(vVar10.f644b, vVar10.f643a, null);
                }
                ArrayList arrayList10 = tVar3.f640j;
                int size10 = arrayList10.size();
                int i24 = 0;
                while (i24 < size10) {
                    Object obj11 = arrayList10.get(i24);
                    i24++;
                    v vVar11 = (v) obj11;
                    vVar.a(vVar11.f644b, vVar11.f643a, null);
                }
            }
            if (tVar2 != null) {
                ArrayList arrayList11 = tVar2.f631a;
                int size11 = arrayList11.size();
                int i25 = 0;
                while (i25 < size11) {
                    Object obj12 = arrayList11.get(i25);
                    i25++;
                    v vVar12 = (v) obj12;
                    vVar.a(vVar12.f644b, vVar12.f643a, new u(vVar12.f645c, 0));
                }
                ArrayList arrayList12 = tVar2.f632b;
                int size12 = arrayList12.size();
                int i26 = 0;
                while (i26 < size12) {
                    Object obj13 = arrayList12.get(i26);
                    i26++;
                    v vVar13 = (v) obj13;
                    vVar.a(vVar13.f644b, vVar13.f643a, new u(vVar13.f645c, 0));
                }
                ArrayList arrayList13 = tVar2.f633c;
                int size13 = arrayList13.size();
                int i27 = 0;
                while (i27 < size13) {
                    Object obj14 = arrayList13.get(i27);
                    i27++;
                    v vVar14 = (v) obj14;
                    vVar.a(vVar14.f644b, vVar14.f643a, new u(vVar14.f645c, 0));
                }
                ArrayList arrayList14 = tVar2.f634d;
                int size14 = arrayList14.size();
                int i28 = 0;
                while (i28 < size14) {
                    Object obj15 = arrayList14.get(i28);
                    i28++;
                    v vVar15 = (v) obj15;
                    vVar.a(vVar15.f644b, vVar15.f643a, new u(vVar15.f645c, 0));
                }
                ArrayList arrayList15 = tVar2.f635e;
                int size15 = arrayList15.size();
                int i29 = 0;
                while (i29 < size15) {
                    Object obj16 = arrayList15.get(i29);
                    i29++;
                    v vVar16 = (v) obj16;
                    vVar.a(vVar16.f644b, vVar16.f643a, new u(vVar16.f645c, 0));
                }
                ArrayList arrayList16 = tVar2.f636f;
                int size16 = arrayList16.size();
                int i30 = 0;
                while (i30 < size16) {
                    Object obj17 = arrayList16.get(i30);
                    i30++;
                    v vVar17 = (v) obj17;
                    vVar.a(vVar17.f644b, vVar17.f643a, new u(vVar17.f645c, 0));
                }
                ArrayList arrayList17 = tVar2.f637g;
                int size17 = arrayList17.size();
                int i31 = 0;
                while (i31 < size17) {
                    Object obj18 = arrayList17.get(i31);
                    i31++;
                    v vVar18 = (v) obj18;
                    vVar.a(vVar18.f644b, vVar18.f643a, new u(vVar18.f645c, 0));
                }
                ArrayList arrayList18 = tVar2.f638h;
                int size18 = arrayList18.size();
                int i32 = 0;
                while (i32 < size18) {
                    Object obj19 = arrayList18.get(i32);
                    i32++;
                    v vVar19 = (v) obj19;
                    vVar.a(vVar19.f644b, vVar19.f643a, new u(vVar19.f645c, 0));
                }
                ArrayList arrayList19 = tVar2.f639i;
                int size19 = arrayList19.size();
                int i33 = 0;
                while (i33 < size19) {
                    Object obj20 = arrayList19.get(i33);
                    i33++;
                    v vVar20 = (v) obj20;
                    vVar.a(vVar20.f644b, vVar20.f643a, new u(vVar20.f645c, 0));
                }
                ArrayList arrayList20 = tVar2.f640j;
                int size20 = arrayList20.size();
                int i34 = 0;
                while (i34 < size20) {
                    Object obj21 = arrayList20.get(i34);
                    i34++;
                    v vVar21 = (v) obj21;
                    vVar.a(vVar21.f644b, vVar21.f643a, new u(vVar21.f645c, 0));
                }
            }
            b1Var.setValue(tVar2);
        }
        if (vVar.U) {
            vVar.U = false;
            gd.e eVar = vVar.R;
            if (eVar != null) {
                eVar.q(false);
            }
        }
        vVar.V = false;
        vVar.W = true;
        vVar.P = false;
        if (true != vVar.Q) {
            vVar.Q = true;
            gd.e eVar2 = vVar.R;
            if (eVar2 != null) {
                eVar2.L = true;
            }
            vVar.invalidateSelf();
        }
        if (vVar.X) {
            vVar.X = false;
            vVar.invalidateSelf();
        }
        Iterator it = wc.v.f55008v0.iterator();
        dd.i iVarD = null;
        while (it.hasNext()) {
            iVarD = vVar.f55010a.d((String) it.next());
            if (iVarD != null) {
                break;
            }
        }
        if (vVar.b(this.L) || iVarD == null) {
            vVar.v(((Number) this.M.invoke()).floatValue());
        } else {
            vVar.v(iVarD.f23384b);
        }
        vVar.setBounds(0, 0, rect.width(), rect.height());
        Canvas canvasA = g2.d.a(vVarX);
        wc.r rVar = vVar.f55034s0;
        ThreadPoolExecutor threadPoolExecutor = wc.v.f55009w0;
        kd.f fVar = vVar.f55012b;
        Semaphore semaphore = vVar.f55031p0;
        gd.e eVar3 = vVar.R;
        wc.h hVar = vVar.f55010a;
        if (eVar3 != null && hVar != null) {
            wc.a aVar = vVar.f55030o0;
            if (aVar == null) {
                aVar = wc.d.f54943a;
            }
            boolean z11 = aVar == wc.a.ENABLED;
            if (z11) {
                try {
                    semaphore.acquire();
                    if (vVar.w()) {
                        vVar.v(fVar.f());
                    }
                } catch (InterruptedException unused) {
                    if (z11) {
                        semaphore.release();
                        if (eVar3.K != fVar.f()) {
                        }
                    }
                    return qy.b0.f48488a;
                } catch (Throwable th2) {
                    if (z11) {
                        semaphore.release();
                        if (eVar3.K != fVar.f()) {
                            threadPoolExecutor.execute(rVar);
                        }
                    }
                    throw th2;
                }
            }
            if (vVar.f55018e) {
                try {
                    int i35 = vVar.S;
                    if (vVar.Z) {
                        canvasA.save();
                        canvasA.concat(matrix);
                        vVar.m(canvasA, eVar3);
                        canvasA.restore();
                    } else {
                        eVar3.d(canvasA, matrix, i35, null);
                    }
                } catch (Throwable unused2) {
                    kd.d.f38088a.getClass();
                    wc.a aVar2 = wc.d.f54943a;
                }
            } else {
                int i36 = vVar.S;
                if (vVar.Z) {
                    canvasA.save();
                    canvasA.concat(matrix);
                    vVar.m(canvasA, eVar3);
                    canvasA.restore();
                } else {
                    eVar3.d(canvasA, matrix, i36, null);
                }
            }
            vVar.f55029n0 = false;
            if (z11) {
                semaphore.release();
                if (eVar3.K != fVar.f()) {
                    threadPoolExecutor.execute(rVar);
                }
            }
        }
        return qy.b0.f48488a;
    }
}
