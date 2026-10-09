package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements u2, g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2652a;

    public /* synthetic */ y0(RecyclerView recyclerView) {
        this.f2652a = recyclerView;
    }

    public void a(a aVar) {
        int i11 = aVar.f2398a;
        RecyclerView recyclerView = this.f2652a;
        if (i11 == 1) {
            recyclerView.mLayout.onItemsAdded(recyclerView, aVar.f2399b, aVar.f2401d);
            return;
        }
        if (i11 == 2) {
            recyclerView.mLayout.onItemsRemoved(recyclerView, aVar.f2399b, aVar.f2401d);
        } else if (i11 == 4) {
            recyclerView.mLayout.onItemsUpdated(recyclerView, aVar.f2399b, aVar.f2401d, aVar.f2400c);
        } else {
            if (i11 != 8) {
                return;
            }
            recyclerView.mLayout.onItemsMoved(recyclerView, aVar.f2399b, aVar.f2401d, 1);
        }
    }

    public void b(int i11) {
        RecyclerView recyclerView = this.f2652a;
        View childAt = recyclerView.getChildAt(i11);
        if (childAt != null) {
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i11);
    }
}
