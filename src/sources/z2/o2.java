package z2;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.Lifecycle;
import dt.p4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o2 {
    public static final d2.c a(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            p4 p4Var = new p4(abstractComposeView, 5);
            lifecycle.addObserver(p4Var);
            return new d2.c(21, lifecycle, p4Var);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}
