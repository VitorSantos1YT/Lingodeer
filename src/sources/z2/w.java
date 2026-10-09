package z2;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f58693b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i11) {
        super(1);
        this.f58692a = i11;
        this.f58693b = xVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f58692a) {
            case 0:
                x xVar = this.f58693b;
                return Boolean.valueOf(xVar.f58708d.getParent().requestSendAccessibilityEvent(xVar.f58708d, (AccessibilityEvent) obj));
            default:
                g2 g2Var = (g2) obj;
                if (g2Var.f58563b.contains(g2Var)) {
                    x xVar2 = this.f58693b;
                    y2.v1 snapshotObserver = xVar2.f58708d.getSnapshotObserver();
                    snapshotObserver.f57019a.d(g2Var, xVar2.f58723p0, new d2.c(18, g2Var, xVar2));
                }
                return qy.b0.f48488a;
        }
    }
}
