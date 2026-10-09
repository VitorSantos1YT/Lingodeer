package androidx.appcompat.widget;

import android.view.View;
import q.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f {
    public final /* synthetic */ ActionMenuPresenter$OverflowMenuButton L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton, View view) {
        super(view);
        this.L = actionMenuPresenter$OverflowMenuButton;
    }

    @Override // androidx.appcompat.widget.f
    public final z h() {
        r.e eVar = this.L.f877a.V;
        if (eVar == null) {
            return null;
        }
        return eVar.a();
    }

    @Override // androidx.appcompat.widget.f
    public final boolean i() {
        this.L.f877a.n();
        return true;
    }

    @Override // androidx.appcompat.widget.f
    public final boolean j() {
        c cVar = this.L.f877a;
        if (cVar.X != null) {
            return false;
        }
        cVar.b();
        return true;
    }
}
