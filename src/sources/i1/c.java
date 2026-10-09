package i1;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0 f33985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f33986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n0 n0Var, AccessibilityManager accessibilityManager) {
        super(1);
        this.f33985a = n0Var;
        this.f33986b = accessibilityManager;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        l0 l0Var;
        if (((Lifecycle.Event) obj) == Lifecycle.Event.ON_RESUME) {
            n0 n0Var = this.f33985a;
            n0Var.getClass();
            AccessibilityManager accessibilityManager = this.f33986b;
            n0Var.f34047a.setValue(Boolean.valueOf(accessibilityManager.isEnabled()));
            accessibilityManager.addAccessibilityStateChangeListener(n0Var);
            m0 m0Var = n0Var.f34048b;
            if (m0Var != null) {
                m0Var.f34044a.setValue(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()));
                accessibilityManager.addTouchExplorationStateChangeListener(m0Var);
            }
            if (Build.VERSION.SDK_INT >= 33 && (l0Var = n0Var.f34049c) != null) {
                l0Var.f34037a.setValue(Boolean.valueOf(n0.b(accessibilityManager)));
                k0.a(accessibilityManager, l0Var);
            }
        }
        return qy.b0.f48488a;
    }
}
