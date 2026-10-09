package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {
    private final c1 mObservable = new c1();
    private boolean mHasStableIds = false;
    private a1 mStateRestorationPolicy = a1.ALLOW;

    public final void bindViewHolder(g2 g2Var, int i11) {
        boolean z11 = g2Var.mBindingAdapter == null;
        if (z11) {
            g2Var.mPosition = i11;
            if (hasStableIds()) {
                g2Var.mItemId = getItemId(i11);
            }
            g2Var.setFlags(1, 519);
            int i12 = v4.g.f53514a;
            Trace.beginSection("RV OnBindView");
        }
        g2Var.mBindingAdapter = this;
        onBindViewHolder(g2Var, i11, g2Var.getUnmodifiedPayloads());
        if (z11) {
            g2Var.clearPayload();
            ViewGroup.LayoutParams layoutParams = g2Var.itemView.getLayoutParams();
            if (layoutParams instanceof n1) {
                ((n1) layoutParams).f2548c = true;
            }
            int i13 = v4.g.f53514a;
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int i11 = z0.f2679a[this.mStateRestorationPolicy.ordinal()];
        if (i11 != 1) {
            return i11 != 2 || getItemCount() > 0;
        }
        return false;
    }

    public final g2 createViewHolder(ViewGroup viewGroup, int i11) {
        try {
            int i12 = v4.g.f53514a;
            Trace.beginSection("RV CreateView");
            g2 g2VarOnCreateViewHolder = onCreateViewHolder(viewGroup, i11);
            if (g2VarOnCreateViewHolder.itemView.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            g2VarOnCreateViewHolder.mItemViewType = i11;
            Trace.endSection();
            return g2VarOnCreateViewHolder;
        } catch (Throwable th2) {
            int i13 = v4.g.f53514a;
            Trace.endSection();
            throw th2;
        }
    }

    public int findRelativeAdapterPositionIn(b1 b1Var, g2 g2Var, int i11) {
        if (b1Var == this) {
            return i11;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i11) {
        return -1L;
    }

    public int getItemViewType(int i11) {
        return 0;
    }

    public final a1 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i11) {
        this.mObservable.d(i11, 1, null);
    }

    public final void notifyItemInserted(int i11) {
        this.mObservable.e(i11, 1);
    }

    public final void notifyItemMoved(int i11, int i12) {
        this.mObservable.c(i11, i12);
    }

    public final void notifyItemRangeChanged(int i11, int i12) {
        this.mObservable.d(i11, i12, null);
    }

    public final void notifyItemRangeInserted(int i11, int i12) {
        this.mObservable.e(i11, i12);
    }

    public final void notifyItemRangeRemoved(int i11, int i12) {
        this.mObservable.f(i11, i12);
    }

    public final void notifyItemRemoved(int i11) {
        this.mObservable.f(i11, 1);
    }

    public abstract void onBindViewHolder(g2 g2Var, int i11);

    public void onBindViewHolder(g2 g2Var, int i11, List<Object> list) {
        onBindViewHolder(g2Var, i11);
    }

    public abstract g2 onCreateViewHolder(ViewGroup viewGroup, int i11);

    public boolean onFailedToRecycleView(g2 g2Var) {
        return false;
    }

    public void registerAdapterDataObserver(d1 d1Var) {
        this.mObservable.registerObserver(d1Var);
    }

    public void setHasStableIds(boolean z11) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z11;
    }

    public void setStateRestorationPolicy(a1 a1Var) {
        this.mStateRestorationPolicy = a1Var;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(d1 d1Var) {
        this.mObservable.unregisterObserver(d1Var);
    }

    public final void notifyItemChanged(int i11, Object obj) {
        this.mObservable.d(i11, 1, obj);
    }

    public final void notifyItemRangeChanged(int i11, int i12, Object obj) {
        this.mObservable.d(i11, i12, obj);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public void onViewAttachedToWindow(g2 g2Var) {
    }

    public void onViewDetachedFromWindow(g2 g2Var) {
    }

    public void onViewRecycled(g2 g2Var) {
    }
}
