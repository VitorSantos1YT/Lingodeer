package ub;

import a0.b2;
import a0.q0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.k1;
import b6.e;
import b6.f;
import b6.g;
import b6.h;
import c6.l;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import d1.x;
import d1.z0;
import dv.u0;
import e2.v;
import f0.h1;
import f00.b;
import f00.d;
import fz.c;
import g00.i1;
import g2.p0;
import h1.s1;
import h1.u2;
import h1.v1;
import j0.e2;
import j3.x0;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.u;
import kotlinx.serialization.SerializationException;
import l1.b1;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import nu.i;
import qp.o2;
import qy.b0;
import s0.s0;
import s2.e0;
import s2.g0;
import s2.k0;
import sg.c0;
import sg.d0;
import sg.f0;
import sg.q;
import sg.y;
import sg.z;
import tg.i0;
import tg.o0;
import tg.r0;
import tg.v0;
import w1.j;
import z00.a0;
import z00.k;
import z00.p;
import z00.w;
import z1.o;
import z1.r;
import z2.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f52902a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52903b = 50;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f52904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f52905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Class f52906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f52907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f52908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f52909h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Field f52910i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f52911j;

    public static final void H(Class cls, r rVar, f fVar, Bundle bundle, c cVar, n nVar, int i11, int i12) {
        c cVar2;
        int i13;
        int i14;
        f fVar2;
        f fVar3;
        Object dVar;
        Bundle bundle2;
        s sVar;
        f fVar4;
        Bundle bundle3;
        s sVar2 = (s) nVar;
        sVar2.f0(-1012439764);
        int i15 = (sVar2.h(cls) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i15 |= sVar2.f(rVar) ? 32 : 16;
        }
        Bundle bundle4 = bundle;
        int i16 = i15 | 128 | (((i12 & 8) == 0 && sVar2.h(bundle4)) ? 2048 : 1024);
        int i17 = i12 & 16;
        if (i17 != 0) {
            i16 |= 24576;
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            if ((i11 & 24576) == 0) {
                i16 |= sVar2.h(cVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
            }
        }
        if ((i16 & 9363) == 9362 && sVar2.F()) {
            sVar2.W();
            fVar4 = fVar;
            bundle3 = bundle4;
            sVar = sVar2;
        } else {
            sVar2.Y();
            if ((i11 & 1) == 0 || sVar2.C()) {
                sVar2.e0(-496803845);
                f fVar5 = (f) j.e(new Object[0], new o2(6, g.f3945a, b6.a.f3927c), h.f3946a, sVar2, 3072, 4);
                sVar2.p(false);
                int i18 = i16 & (-897);
                if ((i12 & 8) != 0) {
                    i13 = i16 & (-8065);
                    bundle4 = Bundle.EMPTY;
                } else {
                    i13 = i18;
                }
                if (i17 != 0) {
                    i14 = i13;
                    fVar2 = fVar5;
                    cVar2 = b6.a.f3926b;
                } else {
                    i14 = i13;
                    fVar2 = fVar5;
                }
            } else {
                sVar2.W();
                i14 = i16 & (-897);
                if ((i12 & 8) != 0) {
                    i14 = i16 & (-8065);
                }
                fVar2 = fVar;
            }
            sVar2.q();
            b1 b1VarH = t.H(cVar2, sVar2);
            int iHashCode = Long.hashCode(sVar2.T);
            View view = (View) sVar2.j(AndroidCompositionLocals_androidKt.f1204f);
            sVar2.e0(485393906);
            boolean zF = sVar2.f(view);
            Object objQ = sVar2.Q();
            l1.g gVar = m.f39353a;
            if (zF || objQ == gVar) {
                objQ = k1.E(view);
                sVar2.o0(objQ);
            }
            k1 k1Var = (k1) objQ;
            sVar2.p(false);
            Context context = (Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b);
            sVar2.e0(485398332);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new e(iHashCode);
                sVar2.o0(objQ2);
            }
            e eVar = (e) objQ2;
            sVar2.p(false);
            y3.h.b(eVar, rVar, null, sVar2, i14 & 112, 4);
            Object[] objArr = {k1Var, eVar, cls, fVar2};
            sVar2.e0(485406992);
            boolean zH = sVar2.h(k1Var) | sVar2.h(eVar) | sVar2.h(context) | sVar2.h(cls) | sVar2.f(fVar2) | sVar2.h(bundle4) | sVar2.d(iHashCode) | sVar2.f(b1VarH);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar) {
                fVar3 = fVar2;
                bundle2 = bundle4;
                sVar = sVar2;
                dVar = new b6.d(k1Var, eVar, context, cls, b1VarH, fVar3, bundle2, iHashCode);
                sVar.o0(dVar);
            } else {
                fVar3 = fVar2;
                dVar = objQ3;
                bundle2 = bundle4;
                sVar = sVar2;
            }
            sVar.p(false);
            t.e(objArr, (c) dVar, sVar);
            fVar4 = fVar3;
            bundle3 = bundle2;
        }
        c cVar3 = cVar2;
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q0(cls, rVar, fVar4, bundle3, cVar3, i11, i12, 1);
        }
    }

    public static final void I(l lVar, int i11, t1.d dVar, n nVar, int i12) {
        s sVar = (s) nVar;
        sVar.f0(-1883910253);
        int i13 = 0;
        if ((((sVar.f(lVar) ? 4 : 2) | i12 | (sVar.d(0) ? 32 : 16) | (sVar.d(i11) ? 256 : 128)) & 1171) == 1170 && sVar.F()) {
            sVar.W();
        } else {
            k6.f fVar = k6.f.f37925a;
            sVar.e0(578571862);
            sVar.e0(-548224868);
            if (!(sVar.f39434a instanceof c6.b)) {
                t.z();
                throw null;
            }
            sVar.b0();
            if (sVar.S) {
                sVar.k(fVar);
            } else {
                sVar.r0();
            }
            t.J(k6.e.f37920d, lVar, sVar);
            t.J(k6.e.f37921e, new k6.a(i11), sVar);
            t.J(k6.e.f37922f, new k6.b(i13), sVar);
            dVar.invoke(k6.g.f37926a, sVar, 54);
            sVar.p(true);
            sVar.p(false);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u2(lVar, i11, dVar, i12, 4);
        }
    }

    public static final void J(ou.c hanziBean, nu.e controller, r rVar, ou.e eVar, n nVar, int i11) {
        int i12;
        r rVar2;
        r rVar3;
        long jFloatToRawIntBits;
        kotlin.jvm.internal.m.f(hanziBean, "hanziBean");
        kotlin.jvm.internal.m.f(controller, "controller");
        s sVar = (s) nVar;
        sVar.f0(-369363378);
        int i13 = 2;
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.h(hanziBean) ? 4 : 2);
        } else {
            i12 = i11;
        }
        int i14 = i12 | (sVar.h(controller) ? 32 : 16) | 384 | (sVar.f(eVar) ? 2048 : 1024);
        if (sVar.T(i14 & 1, (i14 & 1171) != 1170)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                rVar3 = o.f58481a;
            } else {
                sVar.W();
                rVar3 = rVar;
            }
            sVar.q();
            pu.b bVar = controller.f44062a;
            long jY = ob.f.y((s1) sVar.j(v1.f31180a), sVar);
            Object objQ = sVar.Q();
            l1.g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = ep.a.r(0, sVar);
            }
            b1 b1Var = (b1) objQ;
            Boolean bool = (Boolean) bVar.f47180w.getValue();
            bool.getClass();
            b0.d dVar = bVar.D;
            boolean zH = sVar.h(bVar);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new ns.j(i13, bVar, b1Var, null);
                sVar.o0(objQ2);
            }
            t.f((fz.e) objQ2, bool, sVar);
            boolean zC = sVar.c(((Number) dVar.d()).floatValue());
            Object objQ3 = sVar.Q();
            if (zC || objQ3 == gVar) {
                float fFloatValue = ((Number) dVar.d()).floatValue();
                if (fFloatValue > CropImageView.DEFAULT_ASPECT_RATIO) {
                    double d5 = ((double) fFloatValue) * 3.141592653589793d;
                    double d11 = (1.0f - fFloatValue) * 8.0f;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((float) (Math.cos(d5 * ((double) 6)) * Math.sin(((double) 10) * d5) * d11))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) (Math.sin(((double) 8) * d5) * (Math.cos(((double) 12) * d5) * d11)))) << 32);
                } else {
                    jFloatToRawIntBits = 0;
                }
                objQ3 = new f2.b(jFloatToRawIntBits);
                sVar.o0(objQ3);
            } else {
                b1Var = b1Var;
            }
            long j11 = ((f2.b) objQ3).f26570a;
            r rVarX = j0.c.x(e2.d(rVar3, 1.0f), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            ou.f fVarC = bVar.c();
            boolean zH2 = sVar.h(bVar) | sVar.h(controller) | sVar.h(hanziBean);
            Object objQ4 = sVar.Q();
            if (zH2 || objQ4 == gVar) {
                objQ4 = new i(bVar, controller, hanziBean);
                sVar.o0(objQ4);
            }
            s2.l lVar = g0.f51302a;
            b1 b1Var2 = b1Var;
            r rVarI = rVarX.i(new e0(fVarC, hanziBean, null, (PointerInputEventHandler) objQ4, 4));
            boolean zH3 = sVar.h(bVar) | sVar.h(hanziBean) | ((((i14 & 7168) ^ 3072) > 2048 && sVar.f(eVar)) || (i14 & 3072) == 2048) | sVar.e(jY);
            Object objQ5 = sVar.Q();
            if (zH3 || objQ5 == gVar) {
                nu.f fVar = new nu.f(bVar, hanziBean, eVar, jY, b1Var2);
                sVar.o0(fVar);
                objQ5 = fVar;
            }
            d0.n.b(0, (c) objQ5, sVar, rVarI);
            rVar2 = rVar3;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(hanziBean, controller, rVar2, eVar, i11, 11);
        }
    }

    public static final void K(i0 i0Var, final q node, n nVar, int i11) {
        int i12;
        i0 i0Var2;
        kotlin.jvm.internal.m.f(i0Var, "<this>");
        kotlin.jvm.internal.m.f(node, "node");
        s sVar = (s) nVar;
        sVar.f0(1246740314);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(i0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(node) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && sVar.F()) {
            sVar.W();
            i0Var2 = i0Var;
        } else {
            sVar.d0(-1265661332);
            int i13 = i12 & 112;
            boolean z11 = i13 == 32;
            Object objQ = sVar.Q();
            l1.g gVar = m.f39353a;
            if (z11 || objQ == gVar) {
                final int i14 = 0;
                objQ = new c() { // from class: rg.f
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        q qVar;
                        switch (i14) {
                            case 0:
                                o0 Table = (o0) obj;
                                kotlin.jvm.internal.m.f(Table, "$this$Table");
                                q qVar2 = (q) nz.n.S(ue.f.q(node, c.f49250c));
                                if (qVar2 != null && (qVar = (q) nz.n.S(ue.f.q(qVar2, c.f49251d))) != null) {
                                    nz.g gVar2 = new nz.g(ue.f.q(qVar, c.f49252e));
                                    while (gVar2.hasNext()) {
                                        Table.a(new t1.d(new d((q) gVar2.next(), 1), true, -1584786501));
                                    }
                                }
                                break;
                            default:
                                r0 Table2 = (r0) obj;
                                kotlin.jvm.internal.m.f(Table2, "$this$Table");
                                q qVar3 = (q) nz.n.S(ue.f.q(node, c.f49253f));
                                if (qVar3 != null) {
                                    nz.g gVar3 = new nz.g(ue.f.q(qVar3, c.f49254t));
                                    while (gVar3.hasNext()) {
                                        q qVar4 = (q) gVar3.next();
                                        ArrayList arrayList = Table2.f52357a;
                                        o0 o0Var = new o0();
                                        nz.g gVar4 = new nz.g(ue.f.q(qVar4, c.H));
                                        while (gVar4.hasNext()) {
                                            o0Var.a(new t1.d(new d((q) gVar4.next(), 2), true, -314008657));
                                        }
                                        arrayList.add(o0Var);
                                    }
                                }
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ);
            }
            c cVar = (c) objQ;
            sVar.p(false);
            sVar.d0(-1265651420);
            boolean z12 = i13 == 32;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                final int i15 = 1;
                objQ2 = new c() { // from class: rg.f
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        q qVar;
                        switch (i15) {
                            case 0:
                                o0 Table = (o0) obj;
                                kotlin.jvm.internal.m.f(Table, "$this$Table");
                                q qVar2 = (q) nz.n.S(ue.f.q(node, c.f49250c));
                                if (qVar2 != null && (qVar = (q) nz.n.S(ue.f.q(qVar2, c.f49251d))) != null) {
                                    nz.g gVar2 = new nz.g(ue.f.q(qVar, c.f49252e));
                                    while (gVar2.hasNext()) {
                                        Table.a(new t1.d(new d((q) gVar2.next(), 1), true, -1584786501));
                                    }
                                }
                                break;
                            default:
                                r0 Table2 = (r0) obj;
                                kotlin.jvm.internal.m.f(Table2, "$this$Table");
                                q qVar3 = (q) nz.n.S(ue.f.q(node, c.f49253f));
                                if (qVar3 != null) {
                                    nz.g gVar3 = new nz.g(ue.f.q(qVar3, c.f49254t));
                                    while (gVar3.hasNext()) {
                                        q qVar4 = (q) gVar3.next();
                                        ArrayList arrayList = Table2.f52357a;
                                        o0 o0Var = new o0();
                                        nz.g gVar4 = new nz.g(ue.f.q(qVar4, c.H));
                                        while (gVar4.hasNext()) {
                                            o0Var.a(new t1.d(new d((q) gVar4.next(), 2), true, -314008657));
                                        }
                                        arrayList.add(o0Var);
                                    }
                                }
                                break;
                        }
                        return b0.f48488a;
                    }
                };
                sVar.o0(objQ2);
            }
            sVar.p(false);
            i0Var2 = i0Var;
            v0.a(i0Var2, null, cVar, (c) objQ2, sVar, i12 & 14);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new rg.b(i0Var2, node, i11, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0042 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b A[LOOP:0: B:19:0x004c->B:23:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object L(s2.b r7, xy.a r8) {
        /*
            boolean r0 = r8 instanceof d1.a0
            if (r0 == 0) goto L13
            r0 = r8
            d1.a0 r0 = (d1.a0) r0
            int r1 = r0.f22854c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22854c = r1
            goto L18
        L13:
            d1.a0 r0 = new d1.a0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f22853b
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f22854c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            s2.b r7 = r0.f22852a
            com.bumptech.glide.e.F(r8)
            goto L43
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            com.bumptech.glide.e.F(r8)
        L34:
            s2.m r8 = s2.m.Main
            r0.f22852a = r7
            r0.f22854c = r3
            s2.k0 r7 = (s2.k0) r7
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            s2.l r8 = (s2.l) r8
            java.lang.Object r2 = r8.f51328a
            int r4 = r2.size()
            r5 = 0
        L4c:
            if (r5 >= r4) goto L5e
            java.lang.Object r6 = r2.get(r5)
            s2.t r6 = (s2.t) r6
            boolean r6 = s2.s.a(r6)
            if (r6 != 0) goto L5b
            goto L34
        L5b:
            int r5 = r5 + 1
            goto L4c
        L5e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.a.L(s2.b, xy.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0178  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    public static final Object M(s2.b bVar, ie.o oVar, ij.d dVar, s2.l lVar, xy.a aVar) {
        d1.b0 b0Var;
        int i11;
        boolean z11;
        u uVar;
        s0 s0Var;
        ?? r9;
        int size;
        int i12;
        s2.t tVar;
        s2.b bVar2 = bVar;
        ie.o oVar2 = oVar;
        com.google.firebase.remoteconfig.a aVar2 = x.f23017d;
        if (aVar instanceof d1.b0) {
            b0Var = (d1.b0) aVar;
            int i13 = b0Var.f22868e;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                b0Var.f22868e = i13 - Integer.MIN_VALUE;
            } else {
                b0Var = new d1.b0(aVar);
            }
        } else {
            b0Var = new d1.b0(aVar);
        }
        d1.b0 b0Var2 = b0Var;
        Object objG = b0Var2.f22867d;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i14 = b0Var2.f22868e;
        if (i14 == 0) {
            com.bumptech.glide.e.F(objG);
            p2 p2Var = (p2) dVar.f34422c;
            s2.t tVar2 = (s2.t) dVar.f34423d;
            s2.t tVar3 = (s2.t) lVar.f51328a.get(0);
            if (tVar2 == null || tVar3.f51344b - tVar2.f51344b >= p2Var.a()) {
                dVar.f34421b = 1;
            } else if (f2.b.d(f2.b.g(tVar2.f51345c, tVar3.f51345c)) < f0.g0.j(p2Var, tVar2.f51351i)) {
                dVar.f34421b++;
            } else {
                dVar.f34421b = 1;
            }
            dVar.f34423d = tVar3;
            i11 = 0;
            s2.t tVar4 = (s2.t) lVar.f51328a.get(0);
            int i15 = dVar.f34421b;
            com.google.firebase.remoteconfig.a aVar4 = i15 != 1 ? i15 != 2 ? x.f23019f : x.f23018e : aVar2;
            long j11 = tVar4.f51345c;
            z0 z0Var = (z0) oVar2.f34407d;
            if (!z0Var.j() || z0Var.m().f44704a.f35700b.length() == 0 || (s0Var = z0Var.f23040d) == null || s0Var.d() == null) {
                z11 = false;
            } else {
                v vVar = z0Var.f23048l;
                if (vVar != null) {
                    v.b(vVar);
                }
                z0Var.f23050o = j11;
                z0Var.f23055t = -1;
                z11 = true;
                z0Var.h(true);
                long jK = oVar2.k(z0Var.m(), z0Var.f23050o, true, aVar4);
                if (i15 >= 2) {
                    oVar2.f34405b = true;
                    oVar2.f34406c = new x0(jK);
                }
            }
            if (z11) {
                uVar = new u();
                uVar.f38357a = !aVar4.equals(aVar2);
                long j12 = tVar4.f51343a;
                aj.c cVar = new aj.c(oVar2, aVar4, uVar, 21);
                b0Var2.f22864a = bVar2;
                b0Var2.f22865b = oVar2;
                b0Var2.f22866c = uVar;
                b0Var2.f22868e = 2;
                objG = f0.g0.g(bVar2, j12, cVar, b0Var2);
                if (objG == aVar3) {
                    return aVar3;
                }
                if (((Boolean) objG).booleanValue()) {
                    r9 = ((k0) bVar2).f51327f.W.f51328a;
                    size = r9.size();
                    for (i12 = i11; i12 < size; i12++) {
                        tVar = (s2.t) r9.get(i12);
                        if (s2.s.b(tVar)) {
                            tVar.a();
                        }
                    }
                }
                oVar2.f();
            }
        } else if (i14 == 1) {
            ie.o oVar3 = b0Var2.f22865b;
            s2.b bVar3 = b0Var2.f22864a;
            com.bumptech.glide.e.F(objG);
            if (((Boolean) objG).booleanValue()) {
                ?? r11 = ((k0) bVar3).f51327f.W.f51328a;
                int size2 = r11.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    s2.t tVar5 = (s2.t) r11.get(i16);
                    if (s2.s.b(tVar5)) {
                        tVar5.a();
                    }
                }
            }
            oVar3.f();
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u uVar2 = b0Var2.f22866c;
            oVar2 = b0Var2.f22865b;
            s2.b bVar4 = b0Var2.f22864a;
            com.bumptech.glide.e.F(objG);
            uVar = uVar2;
            bVar2 = bVar4;
            i11 = 0;
            if (((Boolean) objG).booleanValue() && uVar.f38357a) {
                r9 = ((k0) bVar2).f51327f.W.f51328a;
                size = r9.size();
                while (i12 < size) {
                    tVar = (s2.t) r9.get(i12);
                    if (s2.s.b(tVar)) {
                        tVar.a();
                    }
                }
            }
            oVar2.f();
        }
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(s2.b r11, s0.a1 r12, s2.l r13, xy.a r14) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.a.N(s2.b, s0.a1, s2.l, xy.a):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0223  */
    public static final q O(z00.t tVar, q qVar, q qVar2) {
        c.a vVar;
        z zVar;
        c.a oVar;
        if (tVar == null) {
            return null;
        }
        sg.r rVar = new sg.r();
        rVar.f51658a = qVar;
        rVar.f51659b = null;
        rVar.f51660c = null;
        rVar.f51661d = qVar2;
        rVar.f51662e = null;
        if (tVar instanceof z00.b) {
            vVar = sg.a.f51628a;
        } else {
            char cCharAt = 0;
            cCharAt = 0;
            char cCharAt2 = 0;
            cCharAt = 0;
            if (tVar instanceof z00.c) {
                z00.c cVar = (z00.c) tVar;
                String str = cVar.f58421g;
                if (str != null && !str.isEmpty()) {
                    cCharAt2 = cVar.f58421g.charAt(0);
                }
                vVar = new f0(cCharAt2);
            } else if (tVar instanceof z00.d) {
                String str2 = ((z00.d) tVar).f58422g;
                kotlin.jvm.internal.m.e(str2, "getLiteral(...)");
                vVar = new sg.b(str2);
            } else if (tVar instanceof z00.g) {
                vVar = sg.d.f51633a;
            } else if (tVar instanceof z00.h) {
                String str3 = ((z00.h) tVar).f58425g;
                kotlin.jvm.internal.m.e(str3, "getOpeningDelimiter(...)");
                vVar = new sg.e(str3);
            } else if (tVar instanceof z00.i) {
                z00.i iVar = (z00.i) tVar;
                String str4 = iVar.f58431l;
                kotlin.jvm.internal.m.e(str4, "getLiteral(...)");
                String str5 = iVar.f58426g;
                char cCharAt3 = (str5 == null || str5.isEmpty()) ? (char) 0 : iVar.f58426g.charAt(0);
                int i11 = iVar.f58429j;
                Integer num = iVar.f58427h;
                int iIntValue = num != null ? num.intValue() : 0;
                String str6 = iVar.f58430k;
                kotlin.jvm.internal.m.e(str6, "getInfo(...)");
                vVar = new sg.f(cCharAt3, iIntValue, i11, str6, str4);
            } else if (tVar instanceof z00.j) {
                vVar = sg.g.f51643a;
            } else if (tVar instanceof k) {
                vVar = new sg.h(((k) tVar).f58432g);
            } else if (tVar instanceof z00.b0) {
                vVar = sg.e0.f51636a;
            } else if (tVar instanceof z00.m) {
                String str7 = ((z00.m) tVar).f58434g;
                kotlin.jvm.internal.m.e(str7, "getLiteral(...)");
                vVar = new sg.j(str7);
            } else if (tVar instanceof z00.l) {
                String str8 = ((z00.l) tVar).f58433g;
                kotlin.jvm.internal.m.e(str8, "getLiteral(...)");
                vVar = new sg.i(str8);
            } else {
                boolean z11 = tVar instanceof z00.n;
                String str9 = BuildConfig.VERSION_NAME;
                if (z11) {
                    z00.n nVar = (z00.n) tVar;
                    String str10 = nVar.f58435g;
                    if (str10 == null) {
                        vVar = null;
                    } else {
                        String str11 = nVar.f58436h;
                        if (str11 != null) {
                            str9 = str11;
                        }
                        oVar = new sg.k(str9, str10);
                        vVar = oVar;
                    }
                } else if (tVar instanceof z00.o) {
                    String str12 = ((z00.o) tVar).f58437g;
                    kotlin.jvm.internal.m.e(str12, "getLiteral(...)");
                    vVar = new sg.l(str12);
                } else if (tVar instanceof p) {
                    p pVar = (p) tVar;
                    String str13 = pVar.f58439h;
                    if (str13 != null) {
                        str9 = str13;
                    }
                    String str14 = pVar.f58438g;
                    kotlin.jvm.internal.m.e(str14, "getDestination(...)");
                    vVar = new sg.n(str14, str9);
                } else if (tVar instanceof z00.s) {
                    vVar = sg.p.f51655a;
                } else if (tVar instanceof z00.v) {
                    z00.v vVar2 = (z00.v) tVar;
                    Integer num2 = vVar2.f58452h;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    String str15 = vVar2.f58451g;
                    if (str15 != null && !str15.isEmpty()) {
                        cCharAt = vVar2.f58451g.charAt(0);
                    }
                    vVar = new sg.s(cCharAt, iIntValue2);
                } else if (tVar instanceof w) {
                    vVar = sg.t.f51665a;
                } else if (tVar instanceof z00.x) {
                    vVar = sg.u.f51666a;
                } else if (tVar instanceof z00.z) {
                    String str16 = ((z00.z) tVar).f58457g;
                    kotlin.jvm.internal.m.e(str16, "getOpeningDelimiter(...)");
                    vVar = new sg.w(str16);
                } else if (tVar instanceof a0) {
                    String str17 = ((a0) tVar).f58420g;
                    kotlin.jvm.internal.m.e(str17, "getLiteral(...)");
                    vVar = new d0(str17);
                } else if (tVar instanceof z00.q) {
                    z00.q qVar3 = (z00.q) tVar;
                    String str18 = qVar3.f58442i;
                    if (str18 != null) {
                        str9 = str18;
                    }
                    String str19 = qVar3.f58441h;
                    kotlin.jvm.internal.m.e(str19, "getDestination(...)");
                    String str20 = qVar3.f58440g;
                    kotlin.jvm.internal.m.e(str20, "getLabel(...)");
                    oVar = new sg.o(str20, str19, str9);
                    vVar = oVar;
                } else if (tVar instanceof u00.a) {
                    vVar = sg.b0.f51631a;
                } else if (tVar instanceof u00.e) {
                    vVar = sg.a0.f51629a;
                } else if (tVar instanceof u00.b) {
                    vVar = sg.x.f51669a;
                } else if (tVar instanceof u00.f) {
                    vVar = c0.f51632a;
                } else if (tVar instanceof u00.d) {
                    u00.d dVar = (u00.d) tVar;
                    boolean z12 = dVar.f52718g;
                    u00.c cVar2 = dVar.f52719h;
                    int i12 = cVar2 == null ? -1 : qg.a.f47726a[cVar2.ordinal()];
                    if (i12 == -1 || i12 == 1) {
                        zVar = z.LEFT;
                    } else if (i12 != 2) {
                        zVar = i12 != 3 ? z.LEFT : z.RIGHT;
                    } else {
                        zVar = z.CENTER;
                    }
                    vVar = new y(z12, zVar);
                } else if (tVar instanceof s00.a) {
                    String str21 = ((s00.a) tVar).f51277g;
                    kotlin.jvm.internal.m.e(str21, "getOpeningDelimiter(...)");
                    vVar = new sg.v(str21);
                } else {
                    vVar = null;
                }
            }
        }
        q qVar4 = vVar != null ? new q(vVar, rVar) : null;
        if (qVar4 != null) {
            sg.r rVar2 = qVar4.f51657b;
            rVar2.f51659b = O(tVar.f58444b, qVar4, null);
            rVar2.f51662e = O(tVar.f58447e, qVar, qVar4);
        }
        if (tVar.f58447e == null && qVar != null) {
            qVar.f51657b.f51660c = qVar4;
        }
        return qVar4;
    }

    public static final File P(Context context, String fileName) {
        kotlin.jvm.internal.m.f(context, "<this>");
        kotlin.jvm.internal.m.f(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }

    public static final float Q(o0.t tVar) {
        return tVar.l().f44404e == h1.Horizontal ? Float.intBitsToFloat((int) (tVar.p() >> 32)) : Float.intBitsToFloat((int) (tVar.p() & 4294967295L));
    }

    public static void R(i2.d dVar, p0 p0Var, long j11) {
        g2.m mVarI = g2.f0.i();
        mVarI.c(p0Var);
        float length = mVarI.f28582a.getLength();
        if (length < 20.0f) {
            return;
        }
        long jA = mVarI.a(length);
        long jA2 = mVarI.a(length - 10.0f);
        if (f2.b.c(jA, 9205357640488583168L) || f2.b.c(jA2, 9205357640488583168L)) {
            return;
        }
        int i11 = (int) (jA & 4294967295L);
        int i12 = (int) (jA >> 32);
        float fAtan2 = ((float) Math.atan2(Float.intBitsToFloat(i11) - Float.intBitsToFloat((int) (jA2 & 4294967295L)), Float.intBitsToFloat(i12) - Float.intBitsToFloat((int) (jA2 >> 32)))) + 3.1415927f;
        double d5 = fAtan2 - 0.5235988f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((((float) Math.cos(d5)) * 20.0f) + Float.intBitsToFloat(i12))) << 32) | (((long) Float.floatToRawIntBits((((float) Math.sin(d5)) * 20.0f) + Float.intBitsToFloat(i11))) & 4294967295L);
        double d11 = fAtan2 + 0.5235988f;
        float fCos = (20.0f * ((float) Math.cos(d11))) + Float.intBitsToFloat(i12);
        float fSin = (((float) Math.sin(d11)) * 20.0f) + Float.intBitsToFloat(i11);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fCos);
        long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(fSin)) & 4294967295L;
        dVar.f0(j11, jA, jFloatToRawIntBits, (480 & 8) != 0 ? 0.0f : 3.0f, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
        dVar.f0(j11, jA, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32), (480 & 8) != 0 ? 0.0f : 3.0f, (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : null, 3);
    }

    public static final yy.b U(Enum[] entries) {
        kotlin.jvm.internal.m.f(entries, "entries");
        return new yy.b(entries);
    }

    public static final long V(b2 b2Var) {
        DragEvent dragEvent = (DragEvent) b2Var.f27b;
        float x11 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x11)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean W(s2.l lVar) {
        ?? r9 = lVar.f51328a;
        int size = r9.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((s2.t) r9.get(i11)).f51351i != 2) {
                return false;
            }
        }
        return true;
    }

    public static final boolean X(o0.t tVar, float f5) {
        tVar.l().getClass();
        return !(((tVar.q() ? -f5 : Q(tVar)) > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : ((tVar.q() ? -f5 : Q(tVar)) == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : -1)) > 0);
    }

    public static final Object Y(u0 u0Var, String str, fz.e eVar, xy.c cVar) {
        yz.f fVar = rz.o0.f50940a;
        return rz.e0.M(yz.e.f58387a, new wu.b0(u0Var, str, eVar, null), cVar);
    }

    public static ij.l Z() {
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        ij.l lVar = ij.l.f34436b;
        kotlin.jvm.internal.m.c(lVar);
        return lVar;
    }

    public static int a0(lc.d dVar, Integer num, lc.c cVar, int i11) {
        if ((i11 & 4) != 0) {
            cVar = null;
        }
        TypedArray typedArrayObtainStyledAttributes = dVar.O.getTheme().obtainStyledAttributes(new int[]{num.intValue()});
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            return (color != 0 || cVar == null) ? color : ((Number) cVar.invoke()).intValue();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static void b0(Drawable drawable, int i11) {
        drawable.setTint(i11);
    }

    public static final String[] c0(n nVar, int i11) {
        return ((Resources) ((s) nVar).j(AndroidCompositionLocals_androidKt.f1201c)).getStringArray(i11);
    }

    public static final String d0(int i11, Object[] objArr, n nVar) {
        return ((Resources) ((s) nVar).j(AndroidCompositionLocals_androidKt.f1201c)).getString(i11, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String e0(n nVar, int i11) {
        return ((Resources) ((s) nVar).j(AndroidCompositionLocals_androidKt.f1201c)).getString(i11);
    }

    public static String f0(int i11) {
        if (i11 == 1) {
            return "Clip";
        }
        if (i11 == 2) {
            return "Ellipsis";
        }
        if (i11 == 5) {
            return "MiddleEllipsis";
        }
        if (i11 == 3) {
            return "Visible";
        }
        return i11 == 4 ? "StartEllipsis" : "Invalid";
    }

    public static final qy.u g0(String str) {
        int i11;
        qx.p.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.m.h(cCharAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int i13 = 119304647;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), 10);
            if (iDigit < 0) {
                return null;
            }
            int i14 = i12 ^ Integer.MIN_VALUE;
            if (Integer.compare(i14, i13 ^ Integer.MIN_VALUE) > 0) {
                if (i13 != 119304647) {
                    return null;
                }
                i13 = (int) ((((long) (-1)) & 4294967295L) / (4294967295L & ((long) 10)));
                if (Integer.compare(i14, i13 ^ Integer.MIN_VALUE) > 0) {
                    return null;
                }
            }
            int i15 = i12 * 10;
            int i16 = iDigit + i15;
            if (Integer.compare(i16 ^ Integer.MIN_VALUE, i15 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            i12 = i16;
        }
        return new qy.u(i12);
    }

    public static final qy.w h0(String str) {
        int i11;
        kotlin.jvm.internal.m.f(str, "<this>");
        int i12 = 10;
        qx.p.k(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        char cCharAt = str.charAt(0);
        int i13 = 1;
        if (kotlin.jvm.internal.m.h(cCharAt, 48) >= 0) {
            i11 = 0;
        } else {
            if (length == 1 || cCharAt != '+') {
                return null;
            }
            i11 = 1;
        }
        long j11 = 10;
        long j12 = 0;
        long j13 = 512409557603043100L;
        while (i11 < length) {
            int iDigit = Character.digit((int) str.charAt(i11), i12);
            if (iDigit < 0) {
                return null;
            }
            int i14 = length;
            long j14 = j12 ^ Long.MIN_VALUE;
            int i15 = i11;
            if (Long.compare(j14, j13 ^ Long.MIN_VALUE) <= 0) {
                j11 = j11;
            } else {
                if (j13 != 512409557603043100L) {
                    return null;
                }
                if (j11 < 0) {
                    j13 = Long.MAX_VALUE < (j11 ^ Long.MIN_VALUE) ? 0L : 1L;
                } else {
                    long j15 = (Long.MAX_VALUE / j11) << i13;
                    j13 = j15 + ((long) ((((-1) - (j15 * j11)) ^ Long.MIN_VALUE) >= (j11 ^ Long.MIN_VALUE) ? i13 : 0));
                }
                if (Long.compare(j14, j13 ^ Long.MIN_VALUE) > 0) {
                    return null;
                }
            }
            long j16 = j12 * j11;
            long j17 = (((long) iDigit) & 4294967295L) + j16;
            if (Long.compare(j17 ^ Long.MIN_VALUE, j16 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i11 = i15 + 1;
            j12 = j17;
            length = i14;
            j11 = j11;
            i12 = 10;
            i13 = 1;
        }
        return new qy.w(j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable i0(Drawable drawable) {
        if (!(drawable instanceof s4.a)) {
            return drawable;
        }
        ((s4.b) ((s4.a) drawable)).getClass();
        return null;
    }

    @Override // f00.b
    public void A(e00.g descriptor, int i11, c00.a serializer, Object obj) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(serializer, "serializer");
        S(descriptor, i11);
        y(serializer, obj);
    }

    @Override // f00.b
    public void B(e00.g descriptor, int i11, boolean z11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        S(descriptor, i11);
        o(z11);
    }

    @Override // f00.d
    public void C(long j11) {
        T(Long.valueOf(j11));
    }

    @Override // f00.d
    public b D(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return d(descriptor);
    }

    @Override // f00.b
    public void E(e00.g descriptor, int i11, float f5) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        S(descriptor, i11);
        p(f5);
    }

    @Override // f00.d
    public void F(String value) {
        kotlin.jvm.internal.m.f(value, "value");
        T(value);
    }

    public boolean G(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return true;
    }

    public void S(e00.g descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
    }

    public void T(Object value) {
        kotlin.jvm.internal.m.f(value, "value");
        throw new SerializationException("Non-serializable " + kotlin.jvm.internal.z.a(value.getClass()) + " is not supported by " + kotlin.jvm.internal.z.a(getClass()) + " encoder");
    }

    public void c(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
    }

    @Override // f00.d
    public b d(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return this;
    }

    @Override // f00.d
    public void e() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // f00.b
    public void g(int i11, int i12, e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        S(descriptor, i11);
        z(i12);
    }

    @Override // f00.b
    public void i(i1 descriptor, int i11, byte b3) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        S(descriptor, i11);
        m(b3);
    }

    @Override // f00.d
    public void j(double d5) {
        T(Double.valueOf(d5));
    }

    @Override // f00.d
    public void k(short s3) {
        T(Short.valueOf(s3));
    }

    @Override // f00.b
    public d l(i1 descriptor, int i11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        S(descriptor, i11);
        return u(descriptor.i(i11));
    }

    @Override // f00.d
    public void m(byte b3) {
        T(Byte.valueOf(b3));
    }

    @Override // f00.b
    public void n(i1 descriptor, int i11, char c11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        S(descriptor, i11);
        r(c11);
    }

    @Override // f00.d
    public void o(boolean z11) {
        T(Boolean.valueOf(z11));
    }

    @Override // f00.d
    public void p(float f5) {
        T(Float.valueOf(f5));
    }

    @Override // f00.b
    public void q(e00.g descriptor, int i11, double d5) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        S(descriptor, i11);
        j(d5);
    }

    @Override // f00.d
    public void r(char c11) {
        T(Character.valueOf(c11));
    }

    @Override // f00.d
    public void s(e00.g enumDescriptor, int i11) {
        kotlin.jvm.internal.m.f(enumDescriptor, "enumDescriptor");
        T(Integer.valueOf(i11));
    }

    @Override // f00.b
    public void t(i1 descriptor, int i11, short s3) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        S(descriptor, i11);
        k(s3);
    }

    @Override // f00.d
    public d u(e00.g descriptor) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        return this;
    }

    @Override // f00.b
    public void v(e00.g descriptor, int i11, long j11) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        S(descriptor, i11);
        C(j11);
    }

    @Override // f00.b
    public void w(e00.g descriptor, int i11, String value) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(value, "value");
        S(descriptor, i11);
        F(value);
    }

    public void x(e00.g descriptor, int i11, c00.a serializer, Object obj) {
        kotlin.jvm.internal.m.f(descriptor, "descriptor");
        kotlin.jvm.internal.m.f(serializer, "serializer");
        S(descriptor, i11);
        super.h(serializer, obj);
    }

    @Override // f00.d
    public void y(c00.a serializer, Object obj) {
        kotlin.jvm.internal.m.f(serializer, "serializer");
        serializer.serialize(this, obj);
    }

    @Override // f00.d
    public void z(int i11) {
        T(Integer.valueOf(i11));
    }
}
