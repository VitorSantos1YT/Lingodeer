package q;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.appcompat.widget.f {
    public final /* synthetic */ int L = 0;
    public final /* synthetic */ View M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActivityChooserView activityChooserView, FrameLayout frameLayout) {
        super(frameLayout);
        this.M = activityChooserView;
    }

    @Override // androidx.appcompat.widget.f
    public final z h() {
        r.e eVar;
        switch (this.L) {
            case 0:
                c cVar = ((ActionMenuItemView) this.M).f832f;
                if (cVar == null || (eVar = ((r.f) cVar).f48557a.W) == null) {
                    return null;
                }
                return eVar.a();
            default:
                return ((ActivityChooserView) this.M).getListPopupWindow();
        }
    }

    @Override // androidx.appcompat.widget.f
    public final boolean i() {
        z zVarH;
        switch (this.L) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.M;
                k kVar = actionMenuItemView.f830d;
                return kVar != null && kVar.b(actionMenuItemView.f827a) && (zVarH = h()) != null && zVarH.b();
            default:
                ActivityChooserView activityChooserView = (ActivityChooserView) this.M;
                if (activityChooserView.b() || !activityChooserView.M) {
                    return true;
                }
                activityChooserView.f884a.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    @Override // androidx.appcompat.widget.f
    public boolean j() {
        switch (this.L) {
            case 1:
                ((ActivityChooserView) this.M).a();
                return true;
            default:
                return super.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.M = actionMenuItemView;
    }
}
