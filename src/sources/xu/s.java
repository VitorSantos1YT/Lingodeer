package xu;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import h1.k7;
import j0.e2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {
    public static final void a(fz.a onClickClose, fz.a onClickProgressBackup, fz.a onClickOfflineLearning, fz.c goBillingActivity, zu.y yVar, l1.n nVar, int i11) {
        zu.y yVar2;
        int i12;
        zu.y yVar3;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickProgressBackup, "onClickProgressBackup");
        kotlin.jvm.internal.m.f(onClickOfflineLearning, "onClickOfflineLearning");
        kotlin.jvm.internal.m.f(goBillingActivity, "goBillingActivity");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(487021908);
        int i13 = i11 | (sVar.h(onClickClose) ? 4 : 2) | (sVar.h(onClickProgressBackup) ? 32 : 16) | (sVar.h(onClickOfflineLearning) ? 256 : 128) | (sVar.h(goBillingActivity) ? 2048 : 1024) | OSSConstants.DEFAULT_BUFFER_SIZE;
        if (sVar.T(i13 & 1, (i13 & 9363) != 9362)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(zu.y.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), null);
                sVar.p(false);
                i12 = i13 & (-57345);
                yVar3 = (zu.y) viewModelA;
            } else {
                sVar.W();
                i12 = i13 & (-57345);
                yVar3 = yVar;
            }
            sVar.q();
            zu.w wVar = (zu.w) FlowExtKt.collectAsStateWithLifecycle(yVar3.f59577a, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7).getValue();
            if (kotlin.jvm.internal.m.a(wVar, zu.u.f59564a)) {
                sVar.d0(-123367965);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                if (!(wVar instanceof zu.v)) {
                    throw nv.p.x(sVar, -123370038, false);
                }
                sVar.d0(-123365704);
                b(((zu.v) wVar).f59567a, onClickClose, onClickProgressBackup, onClickOfflineLearning, goBillingActivity, sVar, 65520 & (i12 << 3));
                sVar.p(false);
            }
            yVar2 = yVar3;
        } else {
            sVar.W();
            yVar2 = yVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.v1(onClickClose, onClickProgressBackup, onClickOfflineLearning, goBillingActivity, yVar2, i11, 18);
        }
    }

    public static final void b(boolean z11, fz.a onClickClose, fz.a onClickProgressBackup, fz.a onClickOfflineLearning, fz.c goBillingActivity, l1.n nVar, int i11) {
        int i12;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickProgressBackup, "onClickProgressBackup");
        kotlin.jvm.internal.m.f(onClickOfflineLearning, "onClickOfflineLearning");
        kotlin.jvm.internal.m.f(goBillingActivity, "goBillingActivity");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1442694837);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickClose) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(onClickProgressBackup) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(onClickOfflineLearning) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(goBillingActivity) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarY = d0.n.y(j0.c.v(e2.d(oVar, 1.0f)), d0.n.u(sVar), true, 12);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarY);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            iu.k.g(onClickClose, null, c.K, null, null, null, null, null, sVar, ((i12 >> 3) & 14) | 384, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            k7.d(e2.d(oVar, 1.0f), r0.f.d(0), null, null, null, t1.e.d(154091315, new bt.q0(onClickProgressBackup, z11, goBillingActivity, onClickOfflineLearning), sVar), sVar, 196614, 28);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.q(z11, onClickClose, onClickProgressBackup, onClickOfflineLearning, goBillingActivity, i11);
        }
    }
}
