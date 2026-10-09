package z2;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f58529a = new e0();

    public final void a(View view, s2.q qVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = qVar instanceof s2.a ? PointerIcon.getSystemIcon(context, ((s2.a) qVar).f51281b) : PointerIcon.getSystemIcon(context, 1000);
        if (kotlin.jvm.internal.m.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
