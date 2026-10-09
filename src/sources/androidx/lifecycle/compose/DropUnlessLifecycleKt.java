package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import l1.m;
import l1.n;
import l1.s;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DropUnlessLifecycleKt {
    public static final fz.a dropUnlessResumed(LifecycleOwner lifecycleOwner, fz.a aVar, n nVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) ((s) nVar).j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        int i13 = i11 << 3;
        return dropUnlessStateIsAtLeast(Lifecycle.State.RESUMED, lifecycleOwner2, aVar, nVar, (i13 & 112) | 6 | (i13 & 896), 0);
    }

    public static final fz.a dropUnlessStarted(LifecycleOwner lifecycleOwner, fz.a aVar, n nVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) ((s) nVar).j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        int i13 = i11 << 3;
        return dropUnlessStateIsAtLeast(Lifecycle.State.STARTED, lifecycleOwner2, aVar, nVar, (i13 & 112) | 6 | (i13 & 896), 0);
    }

    private static final fz.a dropUnlessStateIsAtLeast(Lifecycle.State state, LifecycleOwner lifecycleOwner, fz.a aVar, n nVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) ((s) nVar).j(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (state == Lifecycle.State.DESTROYED) {
            throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.");
        }
        s sVar = (s) nVar;
        boolean zH = sVar.h(lifecycleOwner) | ((((i11 & 14) ^ 6) > 4 && sVar.d(state.ordinal())) || (i11 & 6) == 4) | ((((i11 & 896) ^ 384) > 256 && sVar.f(aVar)) || (i11 & 384) == 256);
        Object objQ = sVar.Q();
        if (zH || objQ == m.f39353a) {
            objQ = new a(lifecycleOwner, state, aVar, 0);
            sVar.o0(objQ);
        }
        return (fz.a) objQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 dropUnlessStateIsAtLeast$lambda$2$lambda$1(LifecycleOwner lifecycleOwner, Lifecycle.State state, fz.a aVar) {
        if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(state)) {
            aVar.invoke();
        }
        return b0.f48488a;
    }
}
