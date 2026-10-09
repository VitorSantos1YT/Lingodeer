package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2645a;

    public w1(RecyclerView recyclerView) {
        this.f2645a = recyclerView;
    }

    public final void a() {
        boolean z11 = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView recyclerView = this.f2645a;
        if (!z11 || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = z4.s0.f58893a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    @Override // androidx.recyclerview.widget.d1
    public final void onChanged() {
        RecyclerView recyclerView = this.f2645a;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f2429f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.d1
    public final void onItemRangeChanged(int i11, int i12, Object obj) {
        RecyclerView recyclerView = this.f2645a;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f2407b;
        if (i12 < 1) {
            return;
        }
        arrayList.add(bVar.h(obj, 4, i11, i12));
        bVar.f2411f |= 4;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.d1
    public final void onItemRangeInserted(int i11, int i12) {
        RecyclerView recyclerView = this.f2645a;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f2407b;
        if (i12 < 1) {
            return;
        }
        arrayList.add(bVar.h(null, 1, i11, i12));
        bVar.f2411f |= 1;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.d1
    public final void onItemRangeMoved(int i11, int i12, int i13) {
        RecyclerView recyclerView = this.f2645a;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f2407b;
        if (i11 == i12) {
            return;
        }
        if (i13 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        arrayList.add(bVar.h(null, 8, i11, i12));
        bVar.f2411f |= 8;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.d1
    public final void onItemRangeRemoved(int i11, int i12) {
        RecyclerView recyclerView = this.f2645a;
        recyclerView.assertNotInLayoutOrScroll(null);
        b bVar = recyclerView.mAdapterHelper;
        ArrayList arrayList = bVar.f2407b;
        if (i12 < 1) {
            return;
        }
        arrayList.add(bVar.h(null, 2, i11, i12));
        bVar.f2411f |= 2;
        if (arrayList.size() == 1) {
            a();
        }
    }

    @Override // androidx.recyclerview.widget.d1
    public final void onStateRestorationPolicyChanged() {
        b1 b1Var;
        RecyclerView recyclerView = this.f2645a;
        if (recyclerView.mPendingSavedState == null || (b1Var = recyclerView.mAdapter) == null || !b1Var.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }
}
