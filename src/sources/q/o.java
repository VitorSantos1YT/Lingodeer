package q;

import android.view.ActionProvider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends z4.c implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lp.j f47302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionProvider f47303c;

    public o(androidx.appcompat.view.menu.a aVar, ActionProvider actionProvider) {
        this.f47303c = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z11) {
        lp.j jVar = this.f47302b;
        if (jVar != null) {
            l lVar = ((n) jVar.f40203b).P;
            lVar.H = true;
            lVar.p(true);
        }
    }
}
