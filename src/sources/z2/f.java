package z2;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f58534a;

    public f(Context context) {
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f58534a = (AccessibilityManager) systemService;
    }
}
