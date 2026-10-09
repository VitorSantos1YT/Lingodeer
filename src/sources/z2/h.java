package z2;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f58568a;

    public h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f58568a = (ClipboardManager) systemService;
    }
}
