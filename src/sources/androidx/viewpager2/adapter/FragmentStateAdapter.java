package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.f1;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.fragment.app.k1;
import androidx.fragment.app.p0;
import androidx.fragment.app.q0;
import androidx.fragment.app.x0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.recyclerview.widget.d1;
import androidx.viewpager2.widget.ViewPager2;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import y.f;
import y.r;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends b1 implements StatefulAdapter {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    final k1 mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final r mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final r mItemIdToViewHolder;
    final Lifecycle mLifecycle;
    private final r mSavedStates;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class DataSetChangeObserver extends d1 {
        @Override // androidx.recyclerview.widget.d1
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.d1
        public final void onItemRangeChanged(int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.d1
        public final void onItemRangeInserted(int i11, int i12) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.d1
        public final void onItemRangeMoved(int i11, int i12, int i13) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.d1
        public final void onItemRangeRemoved(int i11, int i12) {
            onChanged();
        }

        private DataSetChangeObserver() {
        }

        @Override // androidx.recyclerview.widget.d1
        public final void onItemRangeChanged(int i11, int i12, Object obj) {
            onChanged();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class FragmentMaxLifecycleEnforcer {
        private d1 mDataObserver;
        private LifecycleEventObserver mLifecycleObserver;
        private ViewPager2.OnPageChangeCallback mPageChangeCallback;
        private long mPrimaryItemId = -1;
        private ViewPager2 mViewPager;

        public FragmentMaxLifecycleEnforcer() {
        }

        private ViewPager2 inferViewPager(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void register(RecyclerView recyclerView) {
            this.mViewPager = inferViewPager(recyclerView);
            ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageScrollStateChanged(int i11) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public void onPageSelected(int i11) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mPageChangeCallback = onPageChangeCallback;
            this.mViewPager.registerOnPageChangeCallback(onPageChangeCallback);
            DataSetChangeObserver dataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
                @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.d1
                public void onChanged() {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(true);
                }
            };
            this.mDataObserver = dataSetChangeObserver;
            FragmentStateAdapter.this.registerAdapterDataObserver(dataSetChangeObserver);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.updateFragmentMaxLifecycle(false);
                }
            };
            this.mLifecycleObserver = lifecycleEventObserver;
            FragmentStateAdapter.this.mLifecycle.addObserver(lifecycleEventObserver);
        }

        public void unregister(RecyclerView recyclerView) {
            inferViewPager(recyclerView).unregisterOnPageChangeCallback(this.mPageChangeCallback);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.mDataObserver);
            FragmentStateAdapter.this.mLifecycle.removeObserver(this.mLifecycleObserver);
            this.mViewPager = null;
        }

        public void updateFragmentMaxLifecycle(boolean z11) {
            int currentItem;
            k0 k0Var;
            if (FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.mViewPager.getScrollState() != 0 || FragmentStateAdapter.this.mFragments.f() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.mViewPager.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.mPrimaryItemId || z11) && (k0Var = (k0) FragmentStateAdapter.this.mFragments.c(itemId)) != null && k0Var.isAdded()) {
                this.mPrimaryItemId = itemId;
                k1 k1Var = FragmentStateAdapter.this.mFragmentManager;
                k1Var.getClass();
                a aVar = new a(k1Var);
                k0 k0Var2 = null;
                for (int i11 = 0; i11 < FragmentStateAdapter.this.mFragments.j(); i11++) {
                    long jG = FragmentStateAdapter.this.mFragments.g(i11);
                    k0 k0Var3 = (k0) FragmentStateAdapter.this.mFragments.k(i11);
                    if (k0Var3.isAdded()) {
                        if (jG != this.mPrimaryItemId) {
                            aVar.m(k0Var3, Lifecycle.State.STARTED);
                        } else {
                            k0Var2 = k0Var3;
                        }
                        k0Var3.setMenuVisibility(jG == this.mPrimaryItemId);
                    }
                }
                if (k0Var2 != null) {
                    aVar.m(k0Var2, Lifecycle.State.RESUMED);
                }
                if (aVar.f1891a.isEmpty()) {
                    return;
                }
                aVar.j();
            }
        }
    }

    public FragmentStateAdapter(p0 p0Var) {
        this(p0Var.getSupportFragmentManager(), p0Var.getLifecycle());
    }

    private static String createKey(String str, long j11) {
        return str + j11;
    }

    private void ensureFragment(int i11) {
        long itemId = getItemId(i11);
        if (this.mFragments.d(itemId) >= 0) {
            return;
        }
        k0 k0VarCreateFragment = createFragment(i11);
        k0VarCreateFragment.setInitialSavedState((j0) this.mSavedStates.c(itemId));
        this.mFragments.h(itemId, k0VarCreateFragment);
    }

    private boolean isFragmentViewBound(long j11) {
        View view;
        if (this.mItemIdToViewHolder.d(j11) >= 0) {
            return true;
        }
        k0 k0Var = (k0) this.mFragments.c(j11);
        return (k0Var == null || (view = k0Var.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean isValidKey(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i11) {
        Long lValueOf = null;
        for (int i12 = 0; i12 < this.mItemIdToViewHolder.j(); i12++) {
            if (((Integer) this.mItemIdToViewHolder.k(i12)).intValue() == i11) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.mItemIdToViewHolder.g(i12));
            }
        }
        return lValueOf;
    }

    private static long parseIdFromKey(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j11) {
        ViewParent parent;
        k0 k0Var = (k0) this.mFragments.c(j11);
        if (k0Var == null) {
            return;
        }
        if (k0Var.getView() != null && (parent = k0Var.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j11)) {
            this.mSavedStates.i(j11);
        }
        if (!k0Var.isAdded()) {
            this.mFragments.i(j11);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (k0Var.isAdded() && containsItem(j11)) {
            this.mSavedStates.h(j11, this.mFragmentManager.b0(k0Var));
        }
        k1 k1Var = this.mFragmentManager;
        k1Var.getClass();
        a aVar = new a(k1Var);
        aVar.l(k0Var);
        aVar.j();
        this.mFragments.i(j11);
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                fragmentStateAdapter.mIsInGracePeriod = false;
                fragmentStateAdapter.gcFragments();
            }
        };
        this.mLifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(runnable);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
        handler.postDelayed(runnable, 10000L);
    }

    private void scheduleViewAttach(final k0 k0Var, final FrameLayout frameLayout) {
        k1 k1Var = this.mFragmentManager;
        f1 f1Var = new f1() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
            @Override // androidx.fragment.app.f1
            public void onFragmentViewCreated(k1 k1Var2, k0 k0Var2, View view, Bundle bundle) {
                if (k0Var2 == k0Var) {
                    q0 q0Var = k1Var2.f1723p;
                    q0Var.getClass();
                    synchronized (((CopyOnWriteArrayList) q0Var.f1804b)) {
                        int size = ((CopyOnWriteArrayList) q0Var.f1804b).size();
                        for (int i11 = 0; i11 < size; i11++) {
                            if (((x0) ((CopyOnWriteArrayList) q0Var.f1804b).get(i11)).f1867a == this) {
                                ((CopyOnWriteArrayList) q0Var.f1804b).remove(i11);
                                break;
                            }
                        }
                    }
                    FragmentStateAdapter.this.addViewToContainer(view, frameLayout);
                }
            }
        };
        q0 q0Var = k1Var.f1723p;
        q0Var.getClass();
        ((CopyOnWriteArrayList) q0Var.f1804b).add(new x0(f1Var));
    }

    public void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean containsItem(long j11) {
        return j11 >= 0 && j11 < ((long) getItemCount());
    }

    public abstract k0 createFragment(int i11);

    public void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        f fVar = new f(0);
        for (int i11 = 0; i11 < this.mFragments.j(); i11++) {
            long jG = this.mFragments.g(i11);
            if (!containsItem(jG)) {
                fVar.add(Long.valueOf(jG));
                this.mItemIdToViewHolder.i(jG);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i12 = 0; i12 < this.mFragments.j(); i12++) {
                long jG2 = this.mFragments.g(i12);
                if (!isFragmentViewBound(jG2)) {
                    fVar.add(Long.valueOf(jG2));
                }
            }
        }
        y.a aVar = new y.a(fVar);
        while (aVar.hasNext()) {
            removeFragment(((Long) aVar.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.b1
    public long getItemId(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.b1
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.mFragmentMaxLifecycleEnforcer != null) {
            throw new IllegalArgumentException();
        }
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.register(recyclerView);
    }

    @Override // androidx.recyclerview.widget.b1
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.unregister(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.b1
    public final boolean onFailedToRecycleView(FragmentViewHolder fragmentViewHolder) {
        return true;
    }

    public void placeFragmentInViewHolder(final FragmentViewHolder fragmentViewHolder) {
        k0 k0Var = (k0) this.mFragments.c(fragmentViewHolder.getItemId());
        if (k0Var == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout container = fragmentViewHolder.getContainer();
        View view = k0Var.getView();
        if (!k0Var.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (k0Var.isAdded() && view == null) {
            scheduleViewAttach(k0Var, container);
            return;
        }
        if (k0Var.isAdded() && view.getParent() != null) {
            if (view.getParent() != container) {
                addViewToContainer(view, container);
                return;
            }
            return;
        }
        if (k0Var.isAdded()) {
            addViewToContainer(view, container);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.K) {
                return;
            }
            this.mLifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                        return;
                    }
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    FrameLayout container2 = fragmentViewHolder.getContainer();
                    WeakHashMap weakHashMap = s0.f58893a;
                    if (container2.isAttachedToWindow()) {
                        FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                    }
                }
            });
            return;
        }
        scheduleViewAttach(k0Var, container);
        k1 k1Var = this.mFragmentManager;
        k1Var.getClass();
        a aVar = new a(k1Var);
        aVar.d(0, k0Var, "f" + fragmentViewHolder.getItemId(), 1);
        aVar.m(k0Var, Lifecycle.State.STARTED);
        aVar.j();
        this.mFragmentMaxLifecycleEnforcer.updateFragmentMaxLifecycle(false);
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void restoreState(Parcelable parcelable) {
        if (!this.mSavedStates.f() || !this.mFragments.f()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                this.mFragments.h(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.H(str, bundle));
            } else {
                if (!isValidKey(str, KEY_PREFIX_STATE)) {
                    throw new IllegalArgumentException(ep.a.e("Unexpected key in savedState: ", str));
                }
                long idFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                j0 j0Var = (j0) bundle.getParcelable(str);
                if (containsItem(idFromKey)) {
                    this.mSavedStates.h(idFromKey, j0Var);
                }
            }
        }
        if (this.mFragments.f()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mSavedStates.j() + this.mFragments.j());
        for (int i11 = 0; i11 < this.mFragments.j(); i11++) {
            long jG = this.mFragments.g(i11);
            k0 k0Var = (k0) this.mFragments.c(jG);
            if (k0Var != null && k0Var.isAdded()) {
                this.mFragmentManager.W(bundle, createKey(KEY_PREFIX_FRAGMENT, jG), k0Var);
            }
        }
        for (int i12 = 0; i12 < this.mSavedStates.j(); i12++) {
            long jG2 = this.mSavedStates.g(i12);
            if (containsItem(jG2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, jG2), (Parcelable) this.mSavedStates.c(jG2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.b1
    public final void setHasStableIds(boolean z11) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.P();
    }

    public FragmentStateAdapter(k0 k0Var) {
        this(k0Var.getChildFragmentManager(), k0Var.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onBindViewHolder(final FragmentViewHolder fragmentViewHolder, int i11) {
        long itemId = fragmentViewHolder.getItemId();
        int id2 = fragmentViewHolder.getContainer().getId();
        Long lItemForViewHolder = itemForViewHolder(id2);
        if (lItemForViewHolder != null && lItemForViewHolder.longValue() != itemId) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.i(lItemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.h(itemId, Integer.valueOf(id2));
        ensureFragment(i11);
        final FrameLayout container = fragmentViewHolder.getContainer();
        WeakHashMap weakHashMap = s0.f58893a;
        if (container.isAttachedToWindow()) {
            if (container.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            container.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                    if (container.getParent() != null) {
                        container.removeOnLayoutChangeListener(this);
                        FragmentStateAdapter.this.placeFragmentInViewHolder(fragmentViewHolder);
                    }
                }
            });
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.b1
    public final FragmentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i11) {
        return FragmentViewHolder.create(viewGroup);
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onViewAttachedToWindow(FragmentViewHolder fragmentViewHolder) {
        placeFragmentInViewHolder(fragmentViewHolder);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.b1
    public final void onViewRecycled(FragmentViewHolder fragmentViewHolder) {
        Long lItemForViewHolder = itemForViewHolder(fragmentViewHolder.getContainer().getId());
        if (lItemForViewHolder != null) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.i(lItemForViewHolder.longValue());
        }
    }

    public FragmentStateAdapter(k1 k1Var, Lifecycle lifecycle) {
        this.mFragments = new r((Object) null);
        this.mSavedStates = new r((Object) null);
        this.mItemIdToViewHolder = new r((Object) null);
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = k1Var;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }
}
