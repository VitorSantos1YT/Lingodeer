package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class i2 extends z4.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f2483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h2 f2484e;

    public i2(RecyclerView recyclerView) {
        this.f2483d = recyclerView;
        z4.b bVarJ = j();
        if (bVarJ == null || !(bVarJ instanceof h2)) {
            this.f2484e = new h2(this);
        } else {
            this.f2484e = (h2) bVarJ;
        }
    }

    @Override // z4.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f2483d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // z4.b
    public void d(View view, a5.g gVar) {
        this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
        RecyclerView recyclerView = this.f2483d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(gVar);
    }

    @Override // z4.b
    public final boolean g(View view, int i11, Bundle bundle) {
        if (super.g(view, i11, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f2483d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i11, bundle);
    }

    public z4.b j() {
        return this.f2484e;
    }
}
