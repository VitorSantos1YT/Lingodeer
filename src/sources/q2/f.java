package q2;

import android.view.KeyEvent;
import z1.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends q implements e {
    public fz.c Q;
    public fz.c R;

    @Override // q2.e
    public final boolean B(KeyEvent keyEvent) {
        fz.c cVar = this.Q;
        if (cVar != null) {
            return ((Boolean) cVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // q2.e
    public final boolean f(KeyEvent keyEvent) {
        fz.c cVar = this.R;
        if (cVar != null) {
            return ((Boolean) cVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
