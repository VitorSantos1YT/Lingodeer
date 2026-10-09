package androidx.recyclerview.widget;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f2404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2405d;

    public final void a(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i13 = this.f2405d;
        int i14 = i13 * 2;
        int[] iArr = this.f2404c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2404c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i14 >= iArr.length) {
            int[] iArr3 = new int[i13 * 4];
            this.f2404c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2404c;
        iArr4[i14] = i11;
        iArr4[i14 + 1] = i12;
        this.f2405d++;
    }

    public final void b(RecyclerView recyclerView, boolean z11) {
        this.f2405d = 0;
        int[] iArr = this.f2404c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        m1 m1Var = recyclerView.mLayout;
        if (recyclerView.mAdapter == null || m1Var == null || !m1Var.isItemPrefetchEnabled()) {
            return;
        }
        if (z11) {
            if (!recyclerView.mAdapterHelper.g()) {
                m1Var.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
            }
        } else if (!recyclerView.hasPendingAdapterUpdates()) {
            m1Var.collectAdjacentPrefetchPositions(this.f2402a, this.f2403b, recyclerView.mState, this);
        }
        int i11 = this.f2405d;
        if (i11 > m1Var.mPrefetchMaxCountObserved) {
            m1Var.mPrefetchMaxCountObserved = i11;
            m1Var.mPrefetchMaxObservedInInitialPrefetch = z11;
            recyclerView.mRecycler.o();
        }
    }
}
