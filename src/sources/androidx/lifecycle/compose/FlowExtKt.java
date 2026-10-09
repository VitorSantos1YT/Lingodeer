package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Arrays;
import l1.b1;
import l1.b3;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import l1.x2;
import uz.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowExtKt {
    public static final <T> b3 collectAsStateWithLifecycle(g1 g1Var, LifecycleOwner lifecycleOwner, Lifecycle.State state, vy.i iVar, n nVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) ((s) nVar).j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i12 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i12 & 4) != 0) {
            iVar = vy.j.f54321a;
        }
        int i13 = i11 << 3;
        return collectAsStateWithLifecycle(g1Var, g1Var.getValue(), lifecycleOwner.getLifecycle(), state2, iVar, nVar, (i11 & 14) | (i13 & 7168) | (i13 & 57344), 0);
    }

    public static final <T> b3 collectAsStateWithLifecycle(g1 g1Var, Lifecycle lifecycle, Lifecycle.State state, vy.i iVar, n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i12 & 4) != 0) {
            iVar = vy.j.f54321a;
        }
        vy.i iVar2 = iVar;
        int i13 = i11 << 3;
        return collectAsStateWithLifecycle(g1Var, g1Var.getValue(), lifecycle, state2, iVar2, nVar, (i11 & 14) | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 0);
    }

    public static final <T> b3 collectAsStateWithLifecycle(uz.i iVar, T t6, LifecycleOwner lifecycleOwner, Lifecycle.State state, vy.i iVar2, n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) ((s) nVar).j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if ((i12 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i12 & 8) != 0) {
            iVar2 = vy.j.f54321a;
        }
        return collectAsStateWithLifecycle(iVar, t6, lifecycleOwner.getLifecycle(), state2, iVar2, nVar, (i11 & 14) | (((i11 >> 3) & 8) << 3) | (i11 & 112) | (i11 & 7168) | (57344 & i11), 0);
    }

    public static final <T> b3 collectAsStateWithLifecycle(uz.i iVar, T t6, Lifecycle lifecycle, Lifecycle.State state, vy.i iVar2, n nVar, int i11, int i12) {
        if ((i12 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i12 & 8) != 0) {
            iVar2 = vy.j.f54321a;
        }
        vy.i iVar3 = iVar2;
        Object[] objArr = {iVar, lifecycle, state2, iVar3};
        s sVar = (s) nVar;
        boolean zH = sVar.h(lifecycle) | ((((i11 & 7168) ^ 3072) > 2048 && sVar.d(state2.ordinal())) || (i11 & 3072) == 2048) | sVar.h(iVar3) | sVar.h(iVar);
        Object objQ = sVar.Q();
        l1.g gVar = m.f39353a;
        if (zH || objQ == gVar) {
            FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1 = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, iVar3, iVar, null);
            sVar.o0(flowExtKt$collectAsStateWithLifecycle$1$1);
            objQ = flowExtKt$collectAsStateWithLifecycle$1$1;
        }
        fz.e eVar = (fz.e) objQ;
        Object objQ2 = sVar.Q();
        if (objQ2 == gVar) {
            objQ2 = t.B(t6);
            sVar.o0(objQ2);
        }
        b1 b1Var = (b1) objQ2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zH2 = sVar.h(eVar);
        Object objQ3 = sVar.Q();
        if (zH2 || objQ3 == gVar) {
            objQ3 = new x2(eVar, b1Var, null, 4);
            sVar.o0(objQ3);
        }
        t.i(objArrCopyOf, (fz.e) objQ3, sVar);
        return b1Var;
    }
}
