package rc;

import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import kotlin.jvm.internal.n;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f49077a = new c(1);

    @Override // fz.c
    public final Object invoke(Object obj) {
        DialogRecyclerView dialogRecyclerView = (DialogRecyclerView) obj;
        dialogRecyclerView.b();
        int i11 = 2;
        if (dialogRecyclerView.getChildCount() != 0 && dialogRecyclerView.getMeasuredHeight() != 0 && (!dialogRecyclerView.c() || !dialogRecyclerView.d())) {
            i11 = 1;
        }
        dialogRecyclerView.setOverScrollMode(i11);
        return b0.f48488a;
    }
}
