package i1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import l1.b3;
import l1.k1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements AccessibilityManager.AccessibilityStateChangeListener, b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f34047a = l1.t.B(Boolean.FALSE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f34048b = new m0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f34049c;

    public n0() {
        this.f34049c = Build.VERSION.SDK_INT >= 33 ? new l0(this) : null;
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i11 = 0; i11 < size; i11++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i11).getSettingsActivityName();
            if (settingsActivityName != null && oz.q.v0(settingsActivityName, "SwitchAccess", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // l1.b3
    public final Object getValue() {
        boolean z11 = false;
        if (((Boolean) this.f34047a.getValue()).booleanValue()) {
            m0 m0Var = this.f34048b;
            if (m0Var != null ? ((Boolean) m0Var.f34044a.getValue()).booleanValue() : false) {
                z11 = true;
            } else {
                l0 l0Var = this.f34049c;
                if (l0Var != null ? ((Boolean) l0Var.f34037a.getValue()).booleanValue() : false) {
                    z11 = true;
                }
            }
        }
        return Boolean.valueOf(z11);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z11) {
        this.f34047a.setValue(Boolean.valueOf(z11));
    }
}
