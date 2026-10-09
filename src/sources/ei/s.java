package ei;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.drawerlayout.widget.ktFt.FpIL;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import av.f0;
import bt.g7;
import bt.m7;
import com.lingo.lingoskill.object.ARChar;
import com.lingodeer.R;
import h1.p7;
import java.util.List;
import l1.b1;
import l1.b3;
import l1.x1;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s {
    public static final void a(fz.a onBackClick, z1.r rVar, gi.d dVar, l1.n nVar, int i11) {
        z1.r rVar2;
        z1.r rVar3;
        Object qVar;
        b1 b1Var;
        b1 b1Var2;
        b1 b1Var3;
        b1 b1Var4;
        gi.d dVar2;
        b1 b1Var5;
        b1 b1Var6;
        dn.d dVar3;
        boolean z11;
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-337157636);
        int i12 = i11 | (sVar.h(onBackClick) ? 4 : 2) | 48 | (sVar.h(dVar) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                rVar3 = z1.o.f58481a;
            } else {
                sVar.W();
                rVar3 = rVar;
            }
            sVar.q();
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dVar.f29259d, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var7 = (b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(ry.r.f50854a);
                sVar.o0(objQ3);
            }
            b1 b1Var8 = (b1) objQ3;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(null);
                sVar.o0(objQ4);
            }
            b1 b1Var9 = (b1) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(null);
                sVar.o0(objQ5);
            }
            b1 b1Var10 = (b1) objQ5;
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(null);
                sVar.o0(objQ6);
            }
            b1 b1Var11 = (b1) objQ6;
            Object objQ7 = sVar.Q();
            if (objQ7 == gVar) {
                objQ7 = l1.t.B(null);
                sVar.o0(objQ7);
            }
            b1 b1Var12 = (b1) objQ7;
            Object objQ8 = sVar.Q();
            if (objQ8 == gVar) {
                objQ8 = l1.t.B(null);
                sVar.o0(objQ8);
            }
            b1 b1Var13 = (b1) objQ8;
            Object objQ9 = sVar.Q();
            if (objQ9 == gVar) {
                objQ9 = l1.t.B(null);
                sVar.o0(objQ9);
            }
            b1 b1Var14 = (b1) objQ9;
            Object objQ10 = sVar.Q();
            if (objQ10 == gVar) {
                objQ10 = l1.t.B(null);
                sVar.o0(objQ10);
            }
            b1 b1Var15 = (b1) objQ10;
            z1.r rVar4 = rVar3;
            Object objQ11 = sVar.Q();
            if (objQ11 == gVar) {
                kotlin.jvm.internal.m.f(context, FpIL.GrMaGcIgQuuYnLN);
                String string = context.getString(R.string.arabic);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                String string2 = context.getString(R.string.ar_alphabet_content_65);
                kotlin.jvm.internal.m.e(string2, "getString(...)");
                objQ11 = ns.o.L(string, string2);
                sVar.o0(objQ11);
            }
            List list = (List) objQ11;
            boolean zH = sVar.h(list);
            Object objQ12 = sVar.Q();
            if (zH || objQ12 == gVar) {
                objQ12 = new c00.f(2, list);
                sVar.o0(objQ12);
            }
            o0.b bVarB = o0.w.b(0, 6, 2, (fz.a) objQ12, sVar);
            Integer numValueOf = Integer.valueOf(bVarB.k());
            boolean zH2 = sVar.h(dVar) | sVar.f(bVarB);
            Object objQ13 = sVar.Q();
            if (zH2 || objQ13 == gVar) {
                objQ13 = new f0(20, dVar, bVarB, null);
                sVar.o0(objQ13);
            }
            l1.t.f((fz.e) objQ13, numValueOf, sVar);
            int iK = bVarB.k();
            ((gi.a) b3VarCollectAsStateWithLifecycle.getValue()).getClass();
            boolean zD = sVar.d(iK) | sVar.g(false);
            Object objQ14 = sVar.Q();
            if (zD || objQ14 == gVar) {
                objQ14 = (dn.d) dVar.f29262t.getValue();
                sVar.o0(objQ14);
            }
            dn.d dVar4 = (dn.d) objQ14;
            Integer numValueOf2 = Integer.valueOf(bVarB.k());
            boolean zH3 = sVar.h(dVar4);
            Object objQ15 = sVar.Q();
            if (zH3 || objQ15 == gVar) {
                objQ15 = new o(dVar4, b1Var8, null, 0);
                sVar.o0(objQ15);
            }
            l1.t.g(dVar4, numValueOf2, (fz.e) objQ15, sVar);
            t1.d dVarD = t1.e.d(434287296, new at.o(11, onBackClick), sVar);
            t1.d dVarD2 = t1.e.d(-554461557, new n(rVar4, bVarB, b3VarCollectAsStateWithLifecycle, list, b0Var, dVar, b1Var11, b1Var12, b1Var13, b1Var14, b1Var15, b1Var9, b1Var10, b1Var7), sVar);
            sVar = sVar;
            p7.a(null, dVarD, null, null, null, 0, 0L, 0L, null, dVarD2, sVar, 805306416, 509);
            Integer numValueOf3 = Integer.valueOf(bVarB.k());
            boolean zF = sVar.f(bVarB) | sVar.h(dVar);
            Object objQ16 = sVar.Q();
            if (zF || objQ16 == gVar) {
                b1Var = b1Var11;
                b1Var2 = b1Var12;
                b1Var3 = b1Var13;
                b1Var4 = b1Var14;
                qVar = new q(bVarB, dVar, b1Var7, b1Var15, b1Var9, b1Var10, b1Var, b1Var2, b1Var3, b1Var4, null);
                dVar2 = dVar;
                b1Var5 = b1Var7;
                b1Var6 = b1Var15;
                sVar.o0(qVar);
            } else {
                qVar = objQ16;
                b1Var5 = b1Var7;
                b1Var = b1Var11;
                b1Var2 = b1Var12;
                b1Var3 = b1Var13;
                b1Var4 = b1Var14;
                b1Var6 = b1Var15;
                dVar2 = dVar;
            }
            l1.t.f((fz.e) qVar, numValueOf3, sVar);
            List list2 = (List) b1Var6.getValue();
            ARChar aRChar = ((gi.a) b3VarCollectAsStateWithLifecycle.getValue()).f29243a;
            Integer numValueOf4 = Integer.valueOf(r3.k());
            boolean zF2 = sVar.f(r3) | sVar.f(b3VarCollectAsStateWithLifecycle) | sVar.h(dVar4) | sVar.h(dVar2);
            Object objQ17 = sVar.Q();
            if (zF2 || objQ17 == gVar) {
                b1 b1Var16 = b1Var4;
                b1 b1Var17 = b1Var3;
                gi.d dVar5 = dVar2;
                dVar3 = dVar4;
                b1 b1Var18 = b1Var;
                b1 b1Var19 = b1Var2;
                r rVar5 = new r(bVarB, dVar3, b1Var6, b3VarCollectAsStateWithLifecycle, b1Var18, b1Var19, b1Var17, b1Var16, dVar5, (vy.d) null);
                b1Var4 = b1Var16;
                dVar2 = dVar5;
                b1Var2 = b1Var19;
                b1Var3 = b1Var17;
                b1Var = b1Var18;
                sVar.o0(rVar5);
                objQ17 = rVar5;
            } else {
                dVar3 = dVar4;
            }
            l1.t.h(list2, aRChar, numValueOf4, (fz.e) objQ17, sVar);
            if (!((Boolean) b1Var5.getValue()).booleanValue() || ((gi.a) b3VarCollectAsStateWithLifecycle.getValue()).f29243a == null) {
                z11 = false;
                sVar.d0(1663462662);
            } else {
                sVar.d0(1680836395);
                boolean zBooleanValue = ((Boolean) b1Var5.getValue()).booleanValue();
                List list3 = (List) b1Var8.getValue();
                ARChar aRChar2 = ((gi.a) b3VarCollectAsStateWithLifecycle.getValue()).f29243a;
                List list4 = (List) b1Var6.getValue();
                Object objQ18 = sVar.Q();
                if (objQ18 == gVar) {
                    objQ18 = new dv.e(6);
                    sVar.o0(objQ18);
                }
                fz.c cVar = (fz.c) objQ18;
                Object objQ19 = sVar.Q();
                if (objQ19 == gVar) {
                    objQ19 = new dv.e(7);
                    sVar.o0(objQ19);
                }
                fz.c cVar2 = (fz.c) objQ19;
                Object objQ20 = sVar.Q();
                if (objQ20 == gVar) {
                    objQ20 = new dv.e(8);
                    sVar.o0(objQ20);
                }
                fz.c cVar3 = (fz.c) objQ20;
                boolean zH4 = sVar.h(dVar2);
                Object objQ21 = sVar.Q();
                if (zH4 || objQ21 == gVar) {
                    objQ21 = new com.google.firebase.datastorage.a(dVar2, 17);
                    sVar.o0(objQ21);
                }
                fz.c cVar4 = (fz.c) objQ21;
                boolean zH5 = sVar.h(dVar3) | sVar.h(dVar2);
                Object objQ22 = sVar.Q();
                if (zH5 || objQ22 == gVar) {
                    b1 b1Var20 = b1Var;
                    dn.d dVar6 = dVar3;
                    gi.d dVar7 = dVar2;
                    g7 g7Var = new g7((Object) dVar6, (Object) dVar7, b1Var20, b1Var2, b1Var3, b1Var4, 1);
                    dVar2 = dVar7;
                    b1Var = b1Var20;
                    sVar.o0(g7Var);
                    objQ22 = g7Var;
                }
                fz.c cVar5 = (fz.c) objQ22;
                boolean zH6 = sVar.h(dVar2);
                Object objQ23 = sVar.Q();
                if (zH6 || objQ23 == gVar) {
                    m7 m7Var = new m7(dVar2, b1Var5, b1Var6, b1Var, b1Var2, b1Var3, b1Var4, b1Var9, b1Var10, 1);
                    sVar.o0(m7Var);
                    objQ23 = m7Var;
                }
                ls.f.b(zBooleanValue, list3, aRChar2, cVar, cVar2, cVar3, cVar4, cVar5, list4, 0L, 0L, 0L, (fz.a) objQ23, sVar, 224256);
                sVar = sVar;
                z11 = false;
            }
            sVar.p(z11);
            rVar2 = rVar4;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(onBackClick, rVar2, dVar, i11, 24);
        }
    }
}
