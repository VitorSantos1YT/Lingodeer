package b2;

import a.ar.MFeWs;
import a2.s;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import g3.a0;
import g3.o;
import g3.t;
import g3.u;
import g3.w;
import j3.t0;
import j3.u0;
import j3.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import mt.j5;
import qx.p;
import su.Mbl.tcppUUQxZjFdy;
import y.i0;
import y.n;
import y.x;
import y2.k1;
import z2.g0;
import z2.h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public x L;
    public long M;
    public final x N;
    public h2 O;
    public boolean P;
    public final a Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f3865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j5 f3866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f3867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3868d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3869e = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f3870f = b.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3871t = true;
    public final tz.h H = p.b(1, 6, null);
    public final Handler K = new Handler(Looper.getMainLooper());

    public i(AndroidComposeView androidComposeView, j5 j5Var) {
        this.f3865a = androidComposeView;
        this.f3866b = j5Var;
        x xVar = n.f56742a;
        m.d(xVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.L = xVar;
        this.N = new x();
        t tVarA = androidComposeView.getSemanticsOwner().a();
        m.d(xVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.O = new h2(tVarA, xVar);
        this.Q = new a(this, 0);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047 A[PHI: r2
      0x0047: PHI (r2v3 tz.c) = (r2v1 tz.c), (r2v2 tz.c), (r2v5 tz.c) binds: [B:16:0x003a, B:29:0x007d, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[PHI: r2 r8
      0x0052: PHI (r2v2 tz.c) = (r2v3 tz.c), (r2v4 tz.c) binds: [B:18:0x004f, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0052: PHI (r8v3 java.lang.Object) = (r8v11 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x004f, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(xy.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof b2.f
            if (r0 == 0) goto L13
            r0 = r8
            b2.f r0 = (b2.f) r0
            int r1 = r0.f3860d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3860d = r1
            goto L18
        L13:
            b2.f r0 = new b2.f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f3858b
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f3860d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tz.c r2 = r0.f3857a
            com.bumptech.glide.e.F(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            tz.c r2 = r0.f3857a
            com.bumptech.glide.e.F(r8)
            goto L52
        L3a:
            com.bumptech.glide.e.F(r8)
            tz.h r8 = r7.H
            r8.getClass()
            tz.c r2 = new tz.c
            r2.<init>(r8)
        L47:
            r0.f3857a = r2
            r0.f3860d = r4
            java.lang.Object r8 = r2.a(r0)
            if (r8 != r1) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r2.c()
            boolean r8 = r7.e()
            if (r8 == 0) goto L66
            r7.f()
        L66:
            boolean r8 = r7.P
            if (r8 != 0) goto L73
            r7.P = r4
            android.os.Handler r8 = r7.K
            b2.a r5 = r7.Q
            r8.post(r5)
        L73:
            r0.f3857a = r2
            r0.f3860d = r3
            long r5 = r7.f3869e
            java.lang.Object r8 = rz.e0.m(r5, r0)
            if (r8 != r1) goto L47
        L7f:
            return r1
        L80:
            qy.b0 r8 = qy.b0.f48488a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.i.a(xy.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9 A[LOOP:2: B:21:0x006f->B:39:0x00c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d2 A[EDGE_INSN: B:91:0x00d2->B:41:0x00d2 BREAK  A[LOOP:2: B:21:0x006f->B:39:0x00c9], SYNTHETIC] */
    public final void b(y.m mVar) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long j11;
        char c11;
        long j12;
        int i11;
        long[] jArr2;
        long[] jArr3;
        long j13;
        long j14;
        y.m mVar2 = mVar;
        int[] iArr3 = mVar2.f56737b;
        long[] jArr4 = mVar2.f56736a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j15 = jArr4[i12];
            char c12 = 7;
            long j16 = -9187201950435737472L;
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i12 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j15 & 255) < 128) {
                        int i16 = iArr3[(i12 << 3) + i15];
                        c11 = c12;
                        h2 h2Var = (h2) this.N.b(i16);
                        u uVar = (u) mVar2.b(i16);
                        t tVar = uVar != null ? uVar.f28703a : null;
                        if (tVar == null) {
                            throw defpackage.e.t("no value for specified key");
                        }
                        j12 = j16;
                        int i17 = tVar.f28702g;
                        o oVar = tVar.f28699d;
                        if (h2Var == null) {
                            i0 i0Var = oVar.f28691a;
                            Object[] objArr = i0Var.f56714b;
                            long[] jArr5 = i0Var.f56713a;
                            int length2 = jArr5.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i18 = i13;
                                int i19 = 0;
                                while (true) {
                                    long j17 = jArr5[i19];
                                    j11 = j15;
                                    if ((((~j17) << c11) & j17 & j12) != j12) {
                                        int i21 = 8 - ((~(i19 - length2)) >>> 31);
                                        for (int i22 = 0; i22 < i21; i22++) {
                                            if ((j17 & 255) < 128) {
                                                j14 = j17;
                                                a0 a0Var = (a0) objArr[(i19 << 3) + i22];
                                                a0 a0Var2 = g3.x.f28710a;
                                                a0 a0Var3 = g3.x.B;
                                                if (m.a(a0Var, a0Var3)) {
                                                    List list = (List) w.d(oVar, a0Var3);
                                                    h(i17, String.valueOf(list != null ? (j3.h) ry.m.s0(list) : null));
                                                }
                                            } else {
                                                j14 = j17;
                                            }
                                            j17 = j14 >> i18;
                                        }
                                        if (i21 != i18) {
                                            break;
                                        }
                                        if (i19 != length2) {
                                            break;
                                        }
                                        i19++;
                                        j15 = j11;
                                        i18 = 8;
                                    } else if (i19 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i19++;
                                        j15 = j11;
                                        i18 = 8;
                                    }
                                }
                            } else {
                                j11 = j15;
                            }
                        } else {
                            iArr2 = iArr3;
                            j11 = j15;
                            i0 i0Var2 = oVar.f28691a;
                            Object[] objArr2 = i0Var2.f56714b;
                            long[] jArr6 = i0Var2.f56713a;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                Object[] objArr3 = objArr2;
                                jArr4 = jArr4;
                                int i23 = 0;
                                while (true) {
                                    long j18 = jArr6[i23];
                                    Object[] objArr4 = objArr3;
                                    i11 = i15;
                                    if ((((~j18) << c11) & j18 & j12) != j12) {
                                        int i24 = 8 - ((~(i23 - length3)) >>> 31);
                                        int i25 = 0;
                                        while (i25 < i24) {
                                            if ((j18 & 255) < 128) {
                                                jArr3 = jArr6;
                                                a0 a0Var4 = (a0) objArr4[(i23 << 3) + i25];
                                                a0 a0Var5 = g3.x.f28710a;
                                                j13 = j18;
                                                a0 a0Var6 = g3.x.B;
                                                if (m.a(a0Var4, a0Var6)) {
                                                    List list2 = (List) w.d(h2Var.f58583a, a0Var6);
                                                    j3.h hVar = list2 != null ? (j3.h) ry.m.s0(list2) : null;
                                                    List list3 = (List) w.d(oVar, a0Var6);
                                                    j3.h hVar2 = list3 != null ? (j3.h) ry.m.s0(list3) : null;
                                                    if (!m.a(hVar, hVar2)) {
                                                        h(i17, String.valueOf(hVar2));
                                                    }
                                                }
                                            } else {
                                                jArr3 = jArr6;
                                                j13 = j18;
                                            }
                                            j18 = j13 >> 8;
                                            i25++;
                                            jArr6 = jArr3;
                                        }
                                        jArr2 = jArr6;
                                        if (i24 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr6;
                                    }
                                    if (i23 == length3) {
                                        break;
                                    }
                                    i23++;
                                    i15 = i11;
                                    objArr3 = objArr4;
                                    jArr6 = jArr2;
                                }
                            }
                            j15 = j11 >> 8;
                            i15 = i11 + 1;
                            jArr4 = jArr4;
                            c12 = c11;
                            j16 = j12;
                            iArr3 = iArr2;
                            i13 = 8;
                            mVar2 = mVar;
                        }
                    } else {
                        iArr2 = iArr3;
                        j11 = j15;
                        c11 = c12;
                        j12 = j16;
                    }
                    i11 = i15;
                    j15 = j11 >> 8;
                    i15 = i11 + 1;
                    jArr4 = jArr4;
                    c12 = c11;
                    j16 = j12;
                    iArr3 = iArr2;
                    i13 = 8;
                    mVar2 = mVar;
                }
                iArr = iArr3;
                int i26 = i13;
                jArr = jArr4;
                if (i14 != i26) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i12 == length) {
                return;
            }
            i12++;
            mVar2 = mVar;
            jArr4 = jArr;
            iArr3 = iArr;
        }
    }

    public final void c(t tVar, fz.e eVar) {
        tVar.getClass();
        List listJ = t.j(4, tVar);
        int size = listJ.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = listJ.get(i12);
            if (d().a(((t) obj).f28702g)) {
                eVar.invoke(Integer.valueOf(i11), obj);
                i11++;
            }
        }
    }

    public final y.m d() {
        if (this.f3871t) {
            this.f3871t = false;
            this.L = w.b(this.f3865a.getSemanticsOwner(), g.f3861a);
            this.M = System.currentTimeMillis();
        }
        return this.L;
    }

    public final boolean e() {
        return this.f3867c != null;
    }

    public final void f() {
        l lVar = this.f3867c;
        if (lVar != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f3868d;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar = (j) arrayList.get(i11);
                int i12 = e.f3856a[jVar.f3874c.ordinal()];
                if (i12 == 1) {
                    hd.d dVar = jVar.f3875d;
                    if (dVar != null) {
                        ((c3.b) lVar).d((ViewStructure) dVar.f32187b);
                    }
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c3.b bVar = (c3.b) lVar;
                    AutofillId autofillIdB = bVar.b(jVar.f3872a);
                    if (autofillIdB != null) {
                        bVar.e(autofillIdB);
                    }
                }
            }
            ((c3.b) lVar).a();
            arrayList.clear();
        }
    }

    public final void g(t tVar, h2 h2Var) {
        c(tVar, new h(0, h2Var, this));
        List listJ = t.j(4, tVar);
        int size = listJ.size();
        for (int i11 = 0; i11 < size; i11++) {
            t tVar2 = (t) listJ.get(i11);
            y.m mVarD = d();
            int i12 = tVar2.f28702g;
            if (mVarD.a(i12)) {
                x xVar = this.N;
                if (xVar.a(i12)) {
                    Object objB = xVar.b(i12);
                    if (objB == null) {
                        throw defpackage.e.t("node not present in pruned tree before this change");
                    }
                    g(tVar2, (h2) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void h(int i11, String str) {
        l lVar;
        if (Build.VERSION.SDK_INT >= 29 && (lVar = this.f3867c) != null) {
            c3.b bVar = (c3.b) lVar;
            AutofillId autofillIdB = bVar.b(i11);
            if (autofillIdB == null) {
                throw defpackage.e.t("Invalid content capture ID");
            }
            bVar.f(autofillIdB, str);
        }
    }

    public final void j(t tVar) {
        if (e()) {
            this.f3868d.add(new j(tVar.f28702g, this.M, k.VIEW_DISAPPEAR, null));
            List listJ = t.j(4, tVar);
            int size = listJ.size();
            for (int i11 = 0; i11 < size; i11++) {
                j((t) listJ.get(i11));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void k() {
        x xVar = this.N;
        xVar.c();
        y.m mVarD = d();
        int[] iArr = mVarD.f56737b;
        Object[] objArr = mVarD.f56738c;
        long[] jArr = mVarD.f56736a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            xVar.h(iArr[i14], new h2(((u) objArr[i14]).f28703a, d()));
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.O = new h2(this.f3865a.getSemanticsOwner().a(), d());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        this.f3867c = (l) this.f3866b.invoke();
        i(-1, this.f3865a.getSemanticsOwner().a());
        f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
        j(this.f3865a.getSemanticsOwner().a());
        f();
        this.f3867c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.K.removeCallbacks(this.Q);
        this.f3867c = null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0184  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    public final void i(int i11, t tVar) {
        fz.c cVar;
        s sVarR;
        AutofillId autofillIdG;
        f2.c cVarA;
        hd.d dVar;
        String strE;
        fz.c cVar2;
        if (!e()) {
            return;
        }
        i0 i0Var = tVar.f28699d.f28691a;
        Object objG = i0Var.g(g3.x.D);
        k1 k1Var = null;
        if (objG == null) {
            objG = null;
        }
        Boolean bool = (Boolean) objG;
        if (this.f3870f == b.SHOW_ORIGINAL && m.a(bool, Boolean.TRUE)) {
            Object objG2 = i0Var.g(g3.n.m);
            if (objG2 == null) {
                objG2 = null;
            }
            g3.a aVar = (g3.a) objG2;
            if (aVar != null && (cVar2 = (fz.c) aVar.f28635b) != null) {
            }
        } else if (this.f3870f == b.SHOW_TRANSLATED && m.a(bool, Boolean.FALSE)) {
            Object objG3 = i0Var.g(g3.n.m);
            if (objG3 == null) {
                objG3 = null;
            }
            g3.a aVar2 = (g3.a) objG3;
            if (aVar2 != null && (cVar = (fz.c) aVar2.f28635b) != null) {
            }
        }
        int i12 = tVar.f28702g;
        l lVar = this.f3867c;
        if (lVar == null || Build.VERSION.SDK_INT < 29 || (sVarR = ue.f.r(this.f3865a)) == null) {
            dVar = null;
        } else {
            t tVarL = tVar.l();
            int i13 = tVar.f28702g;
            if (tVarL != null) {
                autofillIdG = ((c3.b) lVar).b(tVarL.f28702g);
                if (autofillIdG == null) {
                    dVar = null;
                }
            } else {
                autofillIdG = sVarR.g();
            }
            hd.d dVarC = ((c3.b) lVar).c(autofillIdG, i13);
            if (dVarC == null) {
                dVar = null;
            } else {
                ViewStructure viewStructure = (ViewStructure) dVarC.f32187b;
                o oVar = tVar.f28699d;
                a0 a0Var = g3.x.K;
                i0 i0Var2 = oVar.f28691a;
                if (i0Var2.c(a0Var)) {
                    dVar = null;
                } else {
                    Bundle extras = viewStructure.getExtras();
                    if (extras != null) {
                        extras.putLong(MFeWs.IZQSw, this.M);
                        extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i11);
                    }
                    Object objG4 = i0Var2.g(g3.x.f28734z);
                    if (objG4 == null) {
                        objG4 = null;
                    }
                    String str = (String) objG4;
                    if (str != null) {
                        viewStructure.setId(i13, null, null, str);
                    }
                    Object objG5 = i0Var2.g(g3.x.m);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    if (((Boolean) objG5) != null) {
                        viewStructure.setClassName("android.widget.ViewGroup");
                    }
                    Object objG6 = i0Var2.g(g3.x.B);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    List list = (List) objG6;
                    String str2 = tcppUUQxZjFdy.zidcMcz;
                    if (list != null) {
                        viewStructure.setClassName("android.widget.TextView");
                        viewStructure.setText(x3.a.a(list, str2, null, 62));
                    }
                    Object objG7 = i0Var2.g(g3.x.F);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    j3.h hVar = (j3.h) objG7;
                    if (hVar != null) {
                        viewStructure.setClassName("android.widget.EditText");
                        viewStructure.setText(hVar);
                    }
                    Object objG8 = i0Var2.g(g3.x.f28710a);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    List list2 = (List) objG8;
                    if (list2 != null) {
                        viewStructure.setContentDescription(x3.a.a(list2, str2, null, 62));
                    }
                    Object objG9 = i0Var2.g(g3.x.f28733y);
                    if (objG9 == null) {
                        objG9 = null;
                    }
                    g3.k kVar = (g3.k) objG9;
                    if (kVar != null && (strE = g0.E(kVar.f28656a)) != null) {
                        viewStructure.setClassName(strE);
                    }
                    u0 u0VarW = g0.w(oVar);
                    if (u0VarW != null) {
                        t0 t0Var = u0VarW.f35797a;
                        y0 y0Var = t0Var.f35785b;
                        v3.c cVar3 = t0Var.f35790g;
                        viewStructure.setTextStyle(cVar3.Z() * cVar3.getDensity() * v3.o.c(y0Var.f35827a.f35755b), 0, 0, 0);
                    }
                    k1 k1VarD = tVar.d();
                    if (k1VarD != null) {
                        if (k1VarD.c1().P) {
                            k1Var = k1VarD;
                        }
                        if (k1Var != null) {
                            cVarA = tVar.a(k1Var);
                        } else {
                            cVarA = f2.c.f26571e;
                        }
                    } else {
                        cVarA = f2.c.f26571e;
                    }
                    float f5 = cVarA.f26572a;
                    float f11 = cVarA.f26573b;
                    viewStructure.setDimens((int) f5, (int) f11, 0, 0, (int) (cVarA.f26574c - f5), (int) (cVarA.f26575d - f11));
                    dVar = dVarC;
                }
            }
        }
        if (dVar != null) {
            this.f3868d.add(new j(i12, this.M, k.VIEW_APPEAR, dVar));
        }
        c(tVar, new a0.h(this, 1));
    }
}
