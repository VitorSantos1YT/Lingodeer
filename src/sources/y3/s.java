package y3;

import android.view.View;
import e2.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends z1.q implements u {
    @Override // e2.u
    public final void a0(e2.r rVar) {
        View viewC = h.c(this);
        rVar.c(this.f58482a.P && h.c(this).hasFocusable());
        View viewFindFocus = viewC.findFocus();
        if (viewFindFocus != null) {
            rVar.b(e2.h.a(viewFindFocus, viewC));
        }
    }
}
