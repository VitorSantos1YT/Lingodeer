package ef;

import a0.o0;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import cf.x;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.logging.type.LogSeverity;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.lingodeer.data.env.FontSizeStyleKt;
import com.yalantis.ucrop.view.CropImageView;
import e6.a1;
import e6.y1;
import e6.z0;
import fb.g0;
import g00.g1;
import g3.t;
import g3.w;
import h1.dc;
import h1.fc;
import h1.g7;
import h1.s1;
import h1.ua;
import h1.v1;
import iv.u0;
import j0.e2;
import j0.u;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import l1.c3;
import l1.q1;
import l1.s;
import l1.x1;
import n9.v;
import nv.p;
import oz.q;
import rt.b8;
import rt.k6;
import rt.u7;
import rt.u8;
import rt.v8;
import uz.i1;
import uz.p0;
import w2.a0;
import w2.q0;
import y.i0;
import y2.k1;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final ca.k A(ja.a aVar, String str, boolean z11) {
        ja.c cVarB1 = aVar.B1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int i11 = com.bumptech.glide.g.i(cVarB1, "seqno");
            int i12 = com.bumptech.glide.g.i(cVarB1, "cid");
            int i13 = com.bumptech.glide.g.i(cVarB1, "name");
            int i14 = com.bumptech.glide.g.i(cVarB1, "desc");
            if (i11 != -1 && i12 != -1 && i13 != -1 && i14 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarB1.r1()) {
                    if (((int) cVarB1.getLong(i12)) >= 0) {
                        int i15 = (int) cVarB1.getLong(i11);
                        String strB0 = cVarB1.B0(i13);
                        String str2 = cVarB1.getLong(i14) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i15), strB0);
                        linkedHashMap2.put(Integer.valueOf(i15), str2);
                    }
                }
                List listS0 = ry.m.S0(linkedHashMap.entrySet(), new b4.e(3));
                ArrayList arrayList = new ArrayList(ry.n.W(listS0, 10));
                Iterator it = listS0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listA1 = ry.m.a1(arrayList);
                List listS1 = ry.m.S0(linkedHashMap2.entrySet(), new b4.e(4));
                ArrayList arrayList2 = new ArrayList(ry.n.W(listS1, 10));
                Iterator it2 = listS1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                ca.k kVar = new ca.k(str, z11, listA1, ry.m.a1(arrayList2));
                hz.b.h(cVarB1, null);
                return kVar;
            }
            hz.b.h(cVarB1, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                hz.b.h(cVarB1, th2);
                throw th3;
            }
        }
    }

    public static void B(View view) {
        if (view instanceof ViewGroup) {
            n((ViewGroup) view);
        } else if (view instanceof TextView) {
            D((TextView) view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object C(p0 p0Var, v8 v8Var, b8 b8Var, xy.c cVar) {
        u7 u7Var;
        Long lValueOf;
        p0 selection;
        v8 v8Var2;
        long j11;
        if (cVar instanceof u7) {
            u7Var = (u7) cVar;
            int i11 = u7Var.f50485e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u7Var.f50485e = i11 - Integer.MIN_VALUE;
            } else {
                u7Var = new u7(cVar);
            }
        } else {
            u7Var = new u7(cVar);
        }
        Object objInvoke = u7Var.f50484d;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = u7Var.f50485e;
        boolean z11 = true;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objInvoke);
            synchronized (v8Var.f50533a) {
                lValueOf = Long.valueOf(v8Var.f50534b);
                if (!v8Var.f50535c) {
                    lValueOf = null;
                }
            }
            if (lValueOf == null) {
                return Boolean.FALSE;
            }
            long jLongValue = lValueOf.longValue();
            u7Var.f50481a = p0Var;
            u7Var.f50482b = v8Var;
            u7Var.f50483c = jLongValue;
            u7Var.f50485e = 1;
            objInvoke = b8Var.invoke(u7Var);
            if (objInvoke == obj) {
                return obj;
            }
            selection = p0Var;
            v8Var2 = v8Var;
            j11 = jLongValue;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = u7Var.f50483c;
            v8Var2 = u7Var.f50482b;
            selection = u7Var.f50481a;
            com.bumptech.glide.e.F(objInvoke);
        }
        u8 restoredSelection = (u8) objInvoke;
        v8Var2.getClass();
        kotlin.jvm.internal.m.f(selection, "selection");
        kotlin.jvm.internal.m.f(restoredSelection, "restoredSelection");
        synchronized (v8Var2.f50533a) {
            if (!v8Var2.f50535c || v8Var2.f50534b != j11) {
                z11 = false;
            } else if (!kotlin.jvm.internal.m.a(((i1) selection).getValue(), restoredSelection)) {
                ((i1) selection).l(null, restoredSelection);
            }
        }
        return Boolean.valueOf(z11);
    }

    public static void D(TextView textView) {
        if (textView.getTag(R.id.tag_origin_text_size) == null) {
            textView.setTag(R.id.tag_origin_text_size, Float.valueOf(textView.getTextSize()));
        }
        Object tag = textView.getTag(R.id.tag_origin_text_size);
        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) tag).floatValue();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        textView.setTextSize(0, FontSizeStyleKt.fontSizeStyleScale(x.n().textSizeDel) * fFloatValue);
    }

    public static void E(Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static void F(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }

    public static final g6.c G(p6.g gVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return y1.f25093a.a(gVar);
        }
        Object obj = a1.f24877a;
        if (gVar instanceof p6.c) {
            return g6.c.EXACT;
        }
        if (gVar instanceof p6.f) {
            return g6.c.WRAP;
        }
        if (gVar instanceof p6.e) {
            return g6.c.FILL;
        }
        if (gVar instanceof p6.d) {
            return g6.c.EXPAND;
        }
        throw new IllegalStateException("After resolution, no other type should be present");
    }

    public static final g6.m H(int i11) {
        if (i11 == 0) {
            return g6.m.TOP;
        }
        if (i11 == 1) {
            return g6.m.CENTER_VERTICALLY;
        }
        if (i11 == 2) {
            return g6.m.BOTTOM;
        }
        throw new IllegalStateException(("unknown vertical alignment " + ((Object) k6.b.b(i11))).toString());
    }

    public static final g6.d I(int i11) {
        if (i11 == 0) {
            return g6.d.START;
        }
        if (i11 == 1) {
            return g6.d.CENTER_HORIZONTALLY;
        }
        if (i11 == 2) {
            return g6.d.END;
        }
        throw new IllegalStateException(("unknown horizontal alignment " + ((Object) k6.a.b(i11))).toString());
    }

    public static final void J(t tVar, int i11, f3.h hVar) {
        n1.e eVar = new n1.e(new t[16]);
        List listI = tVar.i(false, false);
        while (true) {
            eVar.d(eVar.f43114c, listI);
            while (true) {
                int i12 = eVar.f43114c;
                if (i12 == 0) {
                    return;
                }
                t tVar2 = (t) eVar.l(i12 - 1);
                boolean zE = w.e(tVar2);
                g3.o oVar = tVar2.f28699d;
                i0 i0Var = oVar.f28691a;
                if (!zE && !i0Var.c(g3.x.f28718i)) {
                    k1 k1VarD = tVar2.d();
                    if (k1VarD == null) {
                        throw defpackage.e.t("Expected semantics node to have a coordinator.");
                    }
                    v3.k kVarA = g0.A(a0.f(k1VarD, true));
                    if (kVarA.f53494a < kVarA.f53496c && kVarA.f53495b < kVarA.f53497d) {
                        Object objG = oVar.f28691a.g(g3.n.f28670e);
                        if (objG == null) {
                            objG = null;
                        }
                        fz.e eVar2 = (fz.e) objG;
                        Object objG2 = i0Var.g(g3.x.f28730v);
                        g3.l lVar = (g3.l) (objG2 != null ? objG2 : null);
                        if (eVar2 == null || lVar == null || ((Number) lVar.f28658b.invoke()).floatValue() <= CropImageView.DEFAULT_ASPECT_RATIO) {
                            listI = tVar2.i(false, false);
                        } else {
                            int i13 = 1 + i11;
                            hVar.invoke(new f3.j(tVar2, i13, kVarA, k1VarD));
                            J(tVar2, i13, hVar);
                        }
                    }
                }
            }
        }
    }

    public static final long a(float f5, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final void b(int i11, String str, l1.n nVar, r rVar) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(-1997503746);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.f(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(rVar) ? 32 : 16;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            z1.j jVar = z1.c.f58467e;
            r rVarA = j0.c.A(e2.e(rVar, 1.0f), 32);
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarA);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC2 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            d0.n.c(se.k.y(R.drawable.ic_empty_collection, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 56, 124);
            j0.c.g(sVar, e2.g(oVar, 16));
            ua.b(str, null, ((s1) sVar.j(v1.f31180a)).f31036s, 0L, null, n3.s.H, null, 0L, new u3.k(3), 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30177j, sVar, (i13 & 14) | 196608, 0, 64986);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u0(str, rVar, i11, 1);
        }
    }

    public static final void c(int i11, fz.c cVar, l1.n nVar, r rVar) {
        int i12;
        r rVar2;
        s sVar = (s) nVar;
        sVar.f0(-25386443);
        if ((i11 & 48) == 0) {
            i12 = (sVar.h(cVar) ? 32 : 16) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new vr.a(28);
                sVar.o0(objQ);
            }
            fz.c cVar2 = (fz.c) objQ;
            boolean z11 = (i12 & 112) == 32;
            Object objQ2 = sVar.Q();
            if (z11 || objQ2 == gVar) {
                objQ2 = new uu.b(cVar, 15);
                sVar.o0(objQ2);
            }
            rVar2 = rVar;
            y3.h.b(cVar2, rVar2, (fz.c) objQ2, sVar, 54, 0);
        } else {
            rVar2 = rVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d0.w(i11, cVar, rVar2, 2);
        }
    }

    public static h00.s d(fz.c cVar) {
        h00.b from = h00.c.f29915d;
        kotlin.jvm.internal.m.f(from, "from");
        h00.h hVar = new h00.h();
        h00.j jVar = from.f29916a;
        boolean z11 = jVar.f29932c;
        hVar.f29927a = jVar.f29930a;
        hVar.f29928b = jVar.f29931b;
        String str = jVar.f29933d;
        hVar.f29929c = jVar.f29934e;
        String str2 = jVar.f29935f;
        h00.a aVar = jVar.f29937h;
        boolean z12 = jVar.f29936g;
        com.android.billingclient.api.h module = from.f29917b;
        cVar.invoke(hVar);
        if (!kotlin.jvm.internal.m.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        h00.j jVar2 = new h00.j(hVar.f29927a, hVar.f29928b, z11, str, hVar.f29929c, str2, z12, aVar);
        kotlin.jvm.internal.m.f(module, "module");
        h00.s sVar = new h00.s(jVar2, module);
        if (module.equals(j00.f.f35451a)) {
            return sVar;
        }
        module.h(new o(jVar2));
        return sVar;
    }

    public static final void e(v loadState, r rVar, String str, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(loadState, "loadState");
        s sVar = (s) nVar;
        sVar.f0(-96960564);
        int i12 = (sVar.h(loadState) ? 4 : 2) | i11 | 128;
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                str = ub.a.e0(sVar, R.string.there_is_nothing_here);
            } else {
                sVar.W();
            }
            sVar.q();
            if (loadState instanceof n9.t) {
                sVar.d0(1961062663);
                tv.a.d(6, 0, sVar, rVar);
                sVar.p(false);
            } else if (loadState instanceof n9.s) {
                sVar.d0(1961141031);
                tv.a.d(6, 0, sVar, rVar);
                sVar.p(false);
            } else {
                if (!(loadState instanceof n9.u)) {
                    throw p.x(sVar, 1310184741, false);
                }
                sVar.d0(1961226777);
                b(48, str, sVar, rVar);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e(loadState, rVar, str, i11);
        }
    }

    public static final void f(boolean z11, l1.n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-344019869);
        int i12 = (sVar.g(z11) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            r rVarA = d2.h.a(e2.g(e2.e(z1.o.f58481a, 1.0f), 3), z11 ? ((Number) b0.e.g(b0.e.p("pulsingProgress", sVar, 0), 0.3f, 1.0f, b0.e.o(b0.e.r(LogSeverity.EMERGENCY_VALUE, 0, null, 6), b0.u0.Reverse, 4), "progressAlpha", sVar, 29112, 0).f3553d.getValue()).floatValue() : CropImageView.DEFAULT_ASPECT_RATIO);
            c3 c3Var = v1.f31180a;
            g7.d(CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, 24, ((s1) sVar.j(c3Var)).f31017a, g2.x.c(((s1) sVar.j(c3Var)).f31035r, 0.3f), sVar, rVarA);
            sVar = sVar;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.m(i11, 3, z11);
        }
    }

    public static final Object g(ListenableFuture listenableFuture, xy.c cVar) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return a4.h.g(listenableFuture);
            }
            rz.m mVar = new rz.m(1, ue.f.x(cVar));
            listenableFuture.N(new a4.o(listenableFuture, mVar, 0), a4.m.INSTANCE);
            mVar.u(new o0(listenableFuture, 2));
            Object objR = mVar.r();
            wy.a aVar = wy.a.COROUTINE_SUSPENDED;
            return objR;
        } catch (ExecutionException e8) {
            Throwable cause = e8.getCause();
            if (cause != null) {
                throw cause;
            }
            kotlin.jvm.internal.m.l();
            throw null;
        }
    }

    public static final u8 h(ArrayList arrayList, Set set) {
        nz.i iVarR = nz.n.R(nz.n.T(ry.m.g0(arrayList), new ro.e(27)), new g1(set, 2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nz.g gVar = new nz.g(iVarR);
        while (gVar.hasNext()) {
            k6 k6Var = (k6) gVar.next();
            linkedHashMap.put(k6Var.f49972c.getId(), Long.valueOf(k6Var.f49972c.getElemId()));
        }
        return new u8(linkedHashMap);
    }

    public static final void i(int i11, String str) {
        if (str.charAt(i11) == '-') {
            return;
        }
        StringBuilder sbI = w4.c.i(i11, "Expected '-' (hyphen) at index ", ", but was '");
        sbI.append(str.charAt(i11));
        sbI.append('\'');
        throw new IllegalArgumentException(sbI.toString().toString());
    }

    public static final u8 j(List list) {
        nz.j jVarT = nz.n.T(nz.n.R(ry.m.g0(list), new ro.e(28)), new ro.e(29));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nz.g gVar = new nz.g(jVarT);
        while (gVar.hasNext()) {
            k6 k6Var = (k6) gVar.next();
            linkedHashMap.put(k6Var.f49972c.getId(), Long.valueOf(k6Var.f49972c.getElemId()));
        }
        return new u8(linkedHashMap);
    }

    public static final g6.j k(c6.g gVar) {
        g6.k kVar;
        g6.b bVar;
        g6.i iVarW = g6.j.w();
        e6.g1 g1Var = e6.g1.f24919t;
        if (gVar instanceof k6.i) {
            kVar = g6.k.BOX;
        } else if (gVar instanceof k6.k) {
            kVar = ((k6.k) gVar).f37933c.b(g1Var) ? g6.k.RADIO_ROW : g6.k.ROW;
        } else if (gVar instanceof k6.j) {
            kVar = ((k6.j) gVar).f37930c.b(g1Var) ? g6.k.RADIO_COLUMN : g6.k.COLUMN;
        } else if (gVar instanceof o6.a) {
            kVar = g6.k.TEXT;
        } else if (gVar instanceof k6.l) {
            kVar = g6.k.SPACER;
        } else if (gVar instanceof c6.h) {
            kVar = g6.k.IMAGE;
        } else if (gVar instanceof e6.k1) {
            kVar = g6.k.REMOTE_VIEWS_ROOT;
        } else {
            if (!(gVar instanceof e6.a0)) {
                throw new IllegalArgumentException("Unknown element type " + gVar.getClass().getCanonicalName());
            }
            kVar = g6.k.SIZE_BOX;
        }
        iVarW.d();
        g6.j.k((g6.j) iVarW.f2000b, kVar);
        k6.t tVar = (k6.t) gVar.b().a(null, z0.Z);
        p6.g gVar2 = p6.f.f46316a;
        g6.c cVarG = G(tVar != null ? tVar.f37954a : gVar2);
        iVarW.d();
        g6.j.l((g6.j) iVarW.f2000b, cVarG);
        k6.m mVar = (k6.m) gVar.b().a(null, z0.f25095a0);
        if (mVar != null) {
            gVar2 = mVar.f37937a;
        }
        g6.c cVarG2 = G(gVar2);
        iVarW.d();
        g6.j.m((g6.j) iVarW.f2000b, cVarG2);
        int i11 = 0;
        boolean z11 = gVar.b().a(null, z0.X) != null;
        iVarW.d();
        g6.j.r((g6.j) iVarW.f2000b, z11);
        if (gVar.b().a(null, z0.Y) != null) {
            g6.l lVar = g6.l.BACKGROUND_NODE;
            iVarW.d();
            g6.j.q((g6.j) iVarW.f2000b, lVar);
        }
        if (gVar instanceof c6.h) {
            c6.h hVar = (c6.h) gVar;
            int i12 = hVar.f6628c;
            if (i12 == 1) {
                bVar = g6.b.FIT;
            } else if (i12 == 0) {
                bVar = g6.b.CROP;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException(("Unknown content scale " + ((Object) k6.h.a(hVar.f6628c))).toString());
                }
                bVar = g6.b.FILL_BOUNDS;
            }
            iVarW.d();
            g6.j.p((g6.j) iVarW.f2000b, bVar);
            boolean z12 = !vc.a.q(hVar);
            iVarW.d();
            g6.j.t((g6.j) iVarW.f2000b, z12);
            iVarW.d();
            g6.j.u((g6.j) iVarW.f2000b);
        } else if (gVar instanceof k6.j) {
            g6.d dVarI = I(((k6.j) gVar).f37932e);
            iVarW.d();
            g6.j.n((g6.j) iVarW.f2000b, dVarI);
        } else if (gVar instanceof k6.k) {
            g6.m mVarH = H(((k6.k) gVar).f37935e);
            iVarW.d();
            g6.j.o((g6.j) iVarW.f2000b, mVarH);
        } else if (gVar instanceof k6.i) {
            k6.i iVar = (k6.i) gVar;
            g6.d dVarI2 = I(iVar.f37929d.f37915a);
            iVarW.d();
            g6.j.n((g6.j) iVarW.f2000b, dVarI2);
            g6.m mVarH2 = H(iVar.f37929d.f37916b);
            iVarW.d();
            g6.j.o((g6.j) iVarW.f2000b, mVarH2);
        }
        if (gVar instanceof c6.i) {
            ArrayList arrayList = ((c6.i) gVar).f6630b;
            ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
            int size = arrayList.size();
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                arrayList2.add(k((c6.g) obj));
            }
            iVarW.d();
            g6.j.s((g6.j) iVarW.f2000b, arrayList2);
        }
        return (g6.j) iVarW.a();
    }

    public static final void l(m00.o oVar, m00.a0 a0Var) throws IOException {
        try {
            IOException iOException = null;
            for (m00.a0 a0Var2 : oVar.i(a0Var)) {
                try {
                    if (oVar.p(a0Var2).f24792c) {
                        l(oVar, a0Var2);
                    }
                    oVar.e(a0Var2);
                } catch (IOException e8) {
                    if (iOException == null) {
                        iOException = e8;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void m(long j11, byte[] bArr, int i11, int i12, int i13) {
        int i14 = 7 - i12;
        int i15 = 8 - i13;
        if (i15 > i14) {
            return;
        }
        while (true) {
            int i16 = oz.d.f46149a[(int) ((j11 >> (i14 << 3)) & 255)];
            int i17 = i11 + 1;
            bArr[i11] = (byte) (i16 >> 8);
            i11 += 2;
            bArr[i17] = (byte) i16;
            if (i14 == i15) {
                return;
            } else {
                i14--;
            }
        }
    }

    public static void n(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt instanceof TextView) {
                    D((TextView) childAt);
                } else if (childAt instanceof ViewGroup) {
                    n((ViewGroup) childAt);
                }
            }
        }
    }

    public static final long o(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        return Long.parseLong((String) q.W0(str, new String[]{"_"}, 0, 6).get(2));
    }

    public static final int p(String str) {
        kotlin.jvm.internal.m.f(str, "<this>");
        String str2 = (String) q.W0(str, new String[]{"_"}, 0, 6).get(1);
        int iHashCode = str2.hashCode();
        if (iHashCode != 99) {
            if (iHashCode != 115) {
                if (iHashCode == 119) {
                    str2.equals("w");
                    return 0;
                }
                if (iHashCode != 3664) {
                    if (iHashCode == 1768164544 && str2.equals("syllable")) {
                        return 4;
                    }
                } else if (str2.equals("sc")) {
                    return 3;
                }
            } else if (str2.equals("s")) {
                return 1;
            }
        } else if (str2.equals("c")) {
            return 2;
        }
        return 0;
    }

    public static final e20.a q(ComponentCallbacks componentCallbacks) {
        kotlin.jvm.internal.m.f(componentCallbacks, "<this>");
        if (componentCallbacks instanceof s10.a) {
            return ((c20.b) ((s10.a) componentCallbacks).e().f519c).f6515d;
        }
        a9.i iVar = t10.a.f52009b;
        if (iVar != null) {
            return ((c20.b) iVar.f519c).f6515d;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static final long r(byte[] bArr, int i11) {
        return (((long) bArr[i11 + 7]) & 255) | ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11 + 2]) & 255) << 40) | ((((long) bArr[i11 + 3]) & 255) << 32) | ((((long) bArr[i11 + 4]) & 255) << 24) | ((((long) bArr[i11 + 5]) & 255) << 16) | ((((long) bArr[i11 + 6]) & 255) << 8);
    }

    public static final View s(Activity activity) {
        if (qf.a.b(e.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            qf.a.a(e.class, th2);
            return null;
        }
    }

    public static final boolean t() {
        String FINGERPRINT = Build.FINGERPRINT;
        kotlin.jvm.internal.m.e(FINGERPRINT, "FINGERPRINT");
        if (oz.x.s0(FINGERPRINT, "generic", false) || oz.x.s0(FINGERPRINT, "unknown", false)) {
            return true;
        }
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.m.e(MODEL, "MODEL");
        if (q.v0(MODEL, "google_sdk", false) || q.v0(MODEL, "Emulator", false) || q.v0(MODEL, "Android SDK built for x86", false)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.m.e(MANUFACTURER, "MANUFACTURER");
        if (q.v0(MANUFACTURER, "Genymotion", false)) {
            return true;
        }
        String BRAND = Build.BRAND;
        kotlin.jvm.internal.m.e(BRAND, "BRAND");
        if (oz.x.s0(BRAND, "generic", false)) {
            String DEVICE = Build.DEVICE;
            kotlin.jvm.internal.m.e(DEVICE, "DEVICE");
            if (oz.x.s0(DEVICE, "generic", false)) {
                return true;
            }
        }
        return "google_sdk".equals(Build.PRODUCT);
    }

    public static void u(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(hh.p0.k(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e8) {
                F(cls, e8);
                throw null;
            } catch (InstantiationException e10) {
                F(cls, e10);
                throw null;
            } catch (NoSuchMethodException e11) {
                F(cls, e11);
                throw null;
            } catch (InvocationTargetException e12) {
                F(cls, e12);
                throw null;
            }
        } catch (ClassNotFoundException e13) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e13);
        }
    }

    public static final File v(Context context, String name) {
        kotlin.jvm.internal.m.f(context, "<this>");
        kotlin.jvm.internal.m.f(name, "name");
        return ub.a.P(context, name.concat(".preferences_pb"));
    }

    public static final void w(Bundle bundle, String key, Bundle value) {
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void x(String key, String value, Bundle bundle) {
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(value, "value");
        bundle.putString(key, value);
    }

    public static final void y(Bundle bundle, String key, List value) {
        kotlin.jvm.internal.m.f(key, "key");
        kotlin.jvm.internal.m.f(value, "value");
        bundle.putStringArrayList(key, ew.a.J(value));
    }

    public static final List z(ja.c cVar) {
        int i11 = com.bumptech.glide.g.i(cVar, "id");
        int i12 = com.bumptech.glide.g.i(cVar, "seq");
        int i13 = com.bumptech.glide.g.i(cVar, "from");
        int i14 = com.bumptech.glide.g.i(cVar, "to");
        sy.c cVarO = ns.o.o();
        while (cVar.r1()) {
            cVarO.add(new ca.h(cVar.B0(i13), (int) cVar.getLong(i11), (int) cVar.getLong(i12), cVar.B0(i14)));
        }
        return ry.m.R0(ns.o.e(cVarO));
    }
}
