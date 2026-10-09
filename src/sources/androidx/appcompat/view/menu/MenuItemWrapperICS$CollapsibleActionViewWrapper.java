package androidx.appcompat.view.menu;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class MenuItemWrapperICS$CollapsibleActionViewWrapper extends FrameLayout implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f843a;

    /* JADX WARN: Multi-variable type inference failed */
    public MenuItemWrapperICS$CollapsibleActionViewWrapper(View view) {
        super(view.getContext());
        this.f843a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p.d
    public final void onActionViewCollapsed() {
        this.f843a.onActionViewCollapsed();
    }

    @Override // p.d
    public final void onActionViewExpanded() {
        this.f843a.onActionViewExpanded();
    }
}
