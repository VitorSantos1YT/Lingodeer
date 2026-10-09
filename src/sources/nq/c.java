package nq;

import ad.y;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import c00.f;
import com.lingodeer.R;
import ff.h;
import fz.e;
import h1.p7;
import iv.h0;
import java.util.List;
import kotlin.jvm.internal.m;
import l1.b1;
import l1.b3;
import l1.g;
import l1.n;
import l1.s;
import l1.t;
import l1.x1;
import mt.k6;
import o0.w;
import rz.b0;
import vy.i;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final void a(fz.a onBackClick, r rVar, tq.d dVar, n nVar, int i11) {
        r rVar2;
        r rVar3;
        tq.d dVar2 = dVar;
        m.f(onBackClick, "onBackClick");
        s sVar = (s) nVar;
        sVar.f0(-1025122089);
        int i12 = i11 | (sVar.h(onBackClick) ? 4 : 2) | 48 | (sVar.h(dVar2) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                rVar3 = o.f58481a;
            } else {
                sVar.W();
                rVar3 = rVar;
            }
            sVar.q();
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dVar2.f52526d, (LifecycleOwner) null, (Lifecycle.State) null, (i) null, sVar, 0, 7);
            Object objQ = sVar.Q();
            g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = t.q(sVar);
                sVar.o0(objQ);
            }
            b0 b0Var = (b0) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var = (b1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = t.B(ry.r.f50854a);
                sVar.o0(objQ3);
            }
            b1 b1Var2 = (b1) objQ3;
            Object objQ4 = sVar.Q();
            vy.d dVar3 = null;
            if (objQ4 == gVar) {
                objQ4 = t.B(null);
                sVar.o0(objQ4);
            }
            b1 b1Var3 = (b1) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = t.B(null);
                sVar.o0(objQ5);
            }
            b1 b1Var4 = (b1) objQ5;
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar) {
                objQ6 = t.B(null);
                sVar.o0(objQ6);
            }
            b1 b1Var5 = (b1) objQ6;
            Object objQ7 = sVar.Q();
            if (objQ7 == gVar) {
                objQ7 = t.B(null);
                sVar.o0(objQ7);
            }
            b1 b1Var6 = (b1) objQ7;
            Object objQ8 = sVar.Q();
            if (objQ8 == gVar) {
                objQ8 = t.B(null);
                sVar.o0(objQ8);
            }
            b1 b1Var7 = (b1) objQ8;
            Object objQ9 = sVar.Q();
            if (objQ9 == gVar) {
                objQ9 = t.B(null);
                sVar.o0(objQ9);
            }
            b1 b1Var8 = (b1) objQ9;
            r rVar4 = rVar3;
            Object objQ10 = sVar.Q();
            if (objQ10 == gVar) {
                objQ10 = t.B(null);
                sVar.o0(objQ10);
            }
            b1 b1Var9 = (b1) objQ10;
            Object objQ11 = sVar.Q();
            if (objQ11 == gVar) {
                m.f(context, "context");
                objQ11 = ns.o.L(h.y(context, R.string.simple), h.y(context, R.string.complex_i), h.y(context, R.string.complex_ii), h.y(context, R.string.complex_iii));
                sVar.o0(objQ11);
            }
            List list = (List) objQ11;
            boolean zH = sVar.h(list);
            Object objQ12 = sVar.Q();
            if (zH || objQ12 == gVar) {
                objQ12 = new f(5, list);
                sVar.o0(objQ12);
            }
            o0.b bVarB = w.b(0, 6, 2, (fz.a) objQ12, sVar);
            Integer numValueOf = Integer.valueOf(bVarB.k());
            boolean zH2 = sVar.h(dVar2) | sVar.f(bVarB);
            Object objQ13 = sVar.Q();
            if (zH2 || objQ13 == gVar) {
                objQ13 = new h0(29, dVar2, bVarB, dVar3);
                sVar.o0(objQ13);
            }
            t.f((e) objQ13, numValueOf, sVar);
            int iK = bVarB.k();
            ((tq.a) b3VarCollectAsStateWithLifecycle.getValue()).getClass();
            boolean zD = sVar.d(iK) | sVar.g(false);
            Object objQ14 = sVar.Q();
            if (zD || objQ14 == gVar) {
                objQ14 = dVar2.b(bVarB.k());
                sVar.o0(objQ14);
            }
            dn.d dVar4 = (dn.d) objQ14;
            Integer numValueOf2 = Integer.valueOf(bVarB.k());
            boolean zH3 = sVar.h(dVar4);
            Object objQ15 = sVar.Q();
            if (zH3 || objQ15 == gVar) {
                objQ15 = new y(23, dVar4, b1Var2, (vy.d) null);
                sVar.o0(objQ15);
            }
            t.g(dVar4, numValueOf2, (e) objQ15, sVar);
            t1.d dVarD = t1.e.d(-336434541, new lt.g(onBackClick, 13, (byte) 0), sVar);
            t1.d dVarD2 = t1.e.d(-2023805528, new en.c(rVar4, bVarB, dVar2, dVar4, b3VarCollectAsStateWithLifecycle, list, b0Var, b1Var5, b1Var6, b1Var9, b1Var, b1Var3, b1Var4, b1Var7, b1Var8, b1Var2), sVar);
            sVar = sVar;
            p7.a(null, dVarD, null, null, null, 0, 0L, 0L, null, dVarD2, sVar, 805306416, 509);
            List list2 = (List) b1Var9.getValue();
            pq.a aVar = ((tq.a) b3VarCollectAsStateWithLifecycle.getValue()).f52508a;
            dVar2 = dVar;
            boolean zF = sVar.f(b3VarCollectAsStateWithLifecycle) | sVar.h(dVar4) | sVar.h(dVar2);
            Object objQ16 = sVar.Q();
            if (zF || objQ16 == gVar) {
                en.d dVar5 = new en.d(dVar4, b1Var9, b3VarCollectAsStateWithLifecycle, b1Var5, b1Var6, b1Var7, b1Var8, dVar2, null, 1);
                dVar2 = dVar2;
                sVar.o0(dVar5);
                objQ16 = dVar5;
            }
            t.g(list2, aVar, (e) objQ16, sVar);
            rVar2 = rVar4;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(onBackClick, rVar2, dVar2, i11);
        }
    }
}
