package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements z4.q {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final d2 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    i2 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    b1 mAdapter;
    b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private e1 mChildDrawingOrderCallback;
    f mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private f1 mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    c0 mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private q1 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    i1 mItemAnimator;
    private g1 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<j1> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    m1 mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final w1 mObserver;
    private List<o1> mOnChildAttachStateListeners;
    private p1 mOnFlingListener;
    private final ArrayList<q1> mOnItemTouchListeners;
    final List<g2> mPendingAccessibilityImportanceChange;
    y1 mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    a0 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final u1 mRecycler;
    v1 mRecyclerListener;
    final List<v1> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private r1 mScrollListener;
    private List<r1> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private z4.r mScrollingChildHelper;
    final c2 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final f2 mViewFlinger;
    private final u2 mViewInfoProcessCallback;
    final v2 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new g0(2);
        sDefaultEdgeEffectFactory = new d2();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(g2 g2Var) {
        View view = g2Var.itemView;
        boolean z11 = view.getParent() == this;
        this.mRecycler.n(getChildViewHolder(view));
        if (g2Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z11) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        f fVar = this.mChildHelper;
        int iIndexOfChild = fVar.f2447a.f2652a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            fVar.f2448b.K(iIndexOfChild);
            fVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(g2 g2Var, g2 g2Var2, h1 h1Var, h1 h1Var2, boolean z11, boolean z12) {
        g2Var.setIsRecyclable(false);
        if (z11) {
            addAnimatingView(g2Var);
        }
        if (g2Var != g2Var2) {
            if (z12) {
                addAnimatingView(g2Var2);
            }
            g2Var.mShadowedHolder = g2Var2;
            addAnimatingView(g2Var);
            this.mRecycler.n(g2Var);
            g2Var2.setIsRecyclable(false);
            g2Var2.mShadowingHolder = g2Var;
        }
        if (this.mItemAnimator.a(g2Var, g2Var2, h1Var, h1Var2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(g2 g2Var) {
        WeakReference<RecyclerView> weakReference = g2Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == g2Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            g2Var.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i11, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i12) {
        if (i11 > 0 && edgeEffect != null && ue.f.t(edgeEffect) != CropImageView.DEFAULT_ASPECT_RATIO) {
            int iRound = Math.round(ue.f.z(edgeEffect, ((-i11) * FLING_DESTRETCH_FACTOR) / i12, 0.5f) * ((-i12) / FLING_DESTRETCH_FACTOR));
            if (iRound != i11) {
                edgeEffect.finish();
            }
            return i11 - iRound;
        }
        if (i11 >= 0 || edgeEffect2 == null || ue.f.t(edgeEffect2) == CropImageView.DEFAULT_ASPECT_RATIO) {
            return i11;
        }
        float f5 = i12;
        int iRound2 = Math.round(ue.f.z(edgeEffect2, (i11 * FLING_DESTRETCH_FACTOR) / f5, 0.5f) * (f5 / FLING_DESTRETCH_FACTOR));
        if (iRound2 != i11) {
            edgeEffect2.finish();
        }
        return i11 - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i11, int i12) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(m1.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i11), Integer.valueOf(i12)};
                } catch (NoSuchMethodException e8) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e10) {
                        e10.initCause(e8);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e10);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((m1) constructor.newInstance(objArr));
            } catch (ClassCastException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e11);
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e12);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e13);
            } catch (InstantiationException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            }
        }
    }

    private boolean didChildRangeChange(int i11, int i12) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i11 && iArr[1] == i12) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i11 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i11 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        accessibilityEventObtain.setContentChangeTypes(i11);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        t2 t2Var;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f2432i = false;
        startInterceptRequestLayout();
        v2 v2Var = this.mViewInfoStore;
        v2Var.f2641a.clear();
        v2Var.f2642b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        c2 c2Var = this.mState;
        c2Var.f2431h = c2Var.f2433j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c2Var.f2430g = c2Var.f2434k;
        c2Var.f2428e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f2433j) {
            int iE = this.mChildHelper.e();
            for (int i11 = 0; i11 < iE; i11++) {
                g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    i1 i1Var = this.mItemAnimator;
                    i1.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    i1Var.getClass();
                    h1 h1Var = new h1();
                    h1Var.a(childViewHolderInt);
                    y.t0 t0Var = this.mViewInfoStore.f2641a;
                    t2 t2VarA = (t2) t0Var.get(childViewHolderInt);
                    if (t2VarA == null) {
                        t2VarA = t2.a();
                        t0Var.put(childViewHolderInt, t2VarA);
                    }
                    t2VarA.f2623b = h1Var;
                    t2VarA.f2622a |= 4;
                    if (this.mState.f2431h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f2642b.h(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f2434k) {
            saveOldPositions();
            c2 c2Var2 = this.mState;
            boolean z11 = c2Var2.f2429f;
            c2Var2.f2429f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c2Var2);
            this.mState.f2429f = z11;
            for (int i12 = 0; i12 < this.mChildHelper.e(); i12++) {
                g2 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i12));
                if (!childViewHolderInt2.shouldIgnore() && ((t2Var = (t2) this.mViewInfoStore.f2641a.get(childViewHolderInt2)) == null || (t2Var.f2622a & 4) == 0)) {
                    i1.b(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(OSSConstants.DEFAULT_BUFFER_SIZE);
                    i1 i1Var2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    i1Var2.getClass();
                    h1 h1Var2 = new h1();
                    h1Var2.a(childViewHolderInt2);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, h1Var2);
                    } else {
                        y.t0 t0Var2 = this.mViewInfoStore.f2641a;
                        t2 t2VarA2 = (t2) t0Var2.get(childViewHolderInt2);
                        if (t2VarA2 == null) {
                            t2VarA2 = t2.a();
                            t0Var2.put(childViewHolderInt2, t2VarA2);
                        }
                        t2VarA2.f2622a |= 2;
                        t2VarA2.f2623b = h1Var2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f2427d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f2428e = this.mAdapter.getItemCount();
        this.mState.f2426c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f2653c;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        c2 c2Var = this.mState;
        c2Var.f2430g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c2Var);
        c2 c2Var2 = this.mState;
        c2Var2.f2429f = false;
        c2Var2.f2433j = c2Var2.f2433j && this.mItemAnimator != null;
        c2Var2.f2427d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x019f A[SYNTHETIC] */
    private void dispatchLayoutStep3() {
        boolean z11;
        boolean zG;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        c2 c2Var = this.mState;
        boolean z12 = true;
        c2Var.f2427d = 1;
        if (c2Var.f2433j) {
            for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
                g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(iE));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    h1 h1Var = new h1();
                    h1Var.a(childViewHolderInt);
                    g2 g2Var = (g2) this.mViewInfoStore.f2642b.c(changedHolderKey);
                    if (g2Var == null || g2Var.shouldIgnore()) {
                        this.mViewInfoStore.a(childViewHolderInt, h1Var);
                    } else {
                        t2 t2Var = (t2) this.mViewInfoStore.f2641a.get(g2Var);
                        boolean z13 = (t2Var == null || (t2Var.f2622a & 1) == 0) ? false : true;
                        t2 t2Var2 = (t2) this.mViewInfoStore.f2641a.get(childViewHolderInt);
                        boolean z14 = (t2Var2 == null || (t2Var2.f2622a & 1) == 0) ? false : true;
                        if (z13 == 0 || g2Var != childViewHolderInt) {
                            h1 h1VarB = this.mViewInfoStore.b(g2Var, 4);
                            this.mViewInfoStore.a(childViewHolderInt, h1Var);
                            h1 h1VarB2 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (h1VarB == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g2Var);
                            } else {
                                animateChange(g2Var, childViewHolderInt, h1VarB, h1VarB2, z13, z14);
                            }
                        } else {
                            this.mViewInfoStore.a(childViewHolderInt, h1Var);
                        }
                    }
                }
            }
            v2 v2Var = this.mViewInfoStore;
            u2 u2Var = this.mViewInfoProcessCallback;
            y.t0 t0Var = v2Var.f2641a;
            int i11 = t0Var.f56767c - 1;
            while (i11 >= 0) {
                g2 g2Var2 = (g2) t0Var.f(i11);
                t2 t2Var3 = (t2) t0Var.h(i11);
                int i12 = t2Var3.f2622a;
                if ((i12 & 3) == 3) {
                    RecyclerView recyclerView = ((y0) u2Var).f2652a;
                    recyclerView.mLayout.removeAndRecycleView(g2Var2.itemView, recyclerView.mRecycler);
                } else if ((i12 & 1) != 0) {
                    h1 h1Var2 = t2Var3.f2623b;
                    if (h1Var2 == null) {
                        RecyclerView recyclerView2 = ((y0) u2Var).f2652a;
                        recyclerView2.mLayout.removeAndRecycleView(g2Var2.itemView, recyclerView2.mRecycler);
                    } else {
                        h1 h1Var3 = t2Var3.f2624c;
                        RecyclerView recyclerView3 = ((y0) u2Var).f2652a;
                        recyclerView3.mRecycler.n(g2Var2);
                        recyclerView3.animateDisappearance(g2Var2, h1Var2, h1Var3);
                    }
                } else if ((i12 & 14) == 14) {
                    ((y0) u2Var).f2652a.animateAppearance(g2Var2, t2Var3.f2623b, t2Var3.f2624c);
                } else {
                    if ((i12 & 12) == 12) {
                        h1 h1Var4 = t2Var3.f2623b;
                        h1 h1Var5 = t2Var3.f2624c;
                        y0 y0Var = (y0) u2Var;
                        y0Var.getClass();
                        g2Var2.setIsRecyclable(false);
                        RecyclerView recyclerView4 = y0Var.f2652a;
                        if (!recyclerView4.mDataSetHasChangedAfterLayout) {
                            m mVar = (m) recyclerView4.mItemAnimator;
                            mVar.getClass();
                            int i13 = h1Var4.f2466a;
                            int i14 = h1Var5.f2466a;
                            if (i13 == i14) {
                                z11 = z12;
                                if (h1Var4.f2467b == h1Var5.f2467b) {
                                    mVar.c(g2Var2);
                                    zG = false;
                                }
                                if (zG) {
                                    recyclerView4.postAnimationRunner();
                                }
                            } else {
                                z11 = z12;
                            }
                            zG = mVar.g(g2Var2, i13, h1Var4.f2467b, i14, h1Var5.f2467b);
                            if (zG) {
                                recyclerView4.postAnimationRunner();
                            }
                        } else if (recyclerView4.mItemAnimator.a(g2Var2, g2Var2, h1Var4, h1Var5)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else {
                        z11 = z12;
                        if ((i12 & 4) != 0) {
                            h1 h1Var6 = t2Var3.f2623b;
                            RecyclerView recyclerView5 = ((y0) u2Var).f2652a;
                            recyclerView5.mRecycler.n(g2Var2);
                            recyclerView5.animateDisappearance(g2Var2, h1Var6, null);
                        } else if ((i12 & 8) != 0) {
                            ((y0) u2Var).f2652a.animateAppearance(g2Var2, t2Var3.f2623b, t2Var3.f2624c);
                        }
                    }
                    t2Var3.f2622a = 0;
                    t2Var3.f2623b = null;
                    t2Var3.f2624c = null;
                    t2.f2621d.c(t2Var3);
                    i11--;
                    z12 = z11;
                }
                z11 = z12;
                t2Var3.f2622a = 0;
                t2Var3.f2623b = null;
                t2Var3.f2624c = null;
                t2.f2621d.c(t2Var3);
                i11--;
                z12 = z11;
            }
        }
        boolean z15 = z12;
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        c2 c2Var2 = this.mState;
        c2Var2.f2425b = c2Var2.f2428e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c2Var2.f2433j = false;
        c2Var2.f2434k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f2630b;
        if (arrayList != null) {
            arrayList.clear();
        }
        m1 m1Var = this.mLayout;
        if (m1Var.mPrefetchMaxObservedInInitialPrefetch) {
            m1Var.mPrefetchMaxCountObserved = 0;
            m1Var.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.o();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        v2 v2Var2 = this.mViewInfoStore;
        v2Var2.f2641a.clear();
        v2Var2.f2642b.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[z15 ? 1 : 0])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        q1 q1Var = this.mInterceptingOnItemTouchListener;
        if (q1Var == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        q1Var.onTouchEvent(this, motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            q1 q1Var = this.mOnItemTouchListeners.get(i11);
            if (q1Var.onInterceptTouchEvent(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = q1Var;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iE = this.mChildHelper.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < iE; i13++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i13));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i11) {
                    i11 = layoutPosition;
                }
                if (layoutPosition > i12) {
                    i12 = layoutPosition;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i11));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        g2 g2VarFindViewHolderForAdapterPosition;
        c2 c2Var = this.mState;
        int i11 = c2Var.f2435l;
        if (i11 == -1) {
            i11 = 0;
        }
        int iB = c2Var.b();
        for (int i12 = i11; i12 < iB; i12++) {
            g2 g2VarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i12);
            if (g2VarFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (g2VarFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return g2VarFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iB, i11);
        do {
            iMin--;
            if (iMin < 0 || (g2VarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!g2VarFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return g2VarFindViewHolderForAdapterPosition.itemView;
    }

    public static g2 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((n1) view.getLayoutParams()).f2546a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        n1 n1Var = (n1) view.getLayoutParams();
        Rect rect2 = n1Var.f2547b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) n1Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) n1Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) n1Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) n1Var).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private z4.r getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new z4.r(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i11) {
        double dLog = Math.log((Math.abs(i11) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f5 = DECELERATION_RATE;
        return (float) (Math.exp((((double) f5) / (((double) f5) - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)));
    }

    private void handleMissingPreInfoForChangeError(long j11, g2 g2Var, g2 g2Var2) {
        int iE = this.mChildHelper.e();
        for (int i11 = 0; i11 < iE; i11++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (childViewHolderInt != g2Var && getChangedHolderKey(childViewHolderInt) == j11) {
                b1 b1Var = this.mAdapter;
                if (b1Var == null || !b1Var.hasStableIds()) {
                    StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb2.append(childViewHolderInt);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(g2Var);
                    throw new IllegalStateException(defpackage.e.j(this, sb2));
                }
                StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb3.append(childViewHolderInt);
                sb3.append(" \n View Holder 2:");
                sb3.append(g2Var);
                throw new IllegalStateException(defpackage.e.j(this, sb3));
            }
        }
        Objects.toString(g2Var2);
        Objects.toString(g2Var);
        exceptionLabel();
    }

    private boolean hasUpdatedView() {
        int iE = this.mChildHelper.e();
        for (int i11 = 0; i11 < iE; i11++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        WeakHashMap weakHashMap = z4.s0.f58893a;
        int i11 = Build.VERSION.SDK_INT;
        if ((i11 >= 26 ? z4.m0.a(this) : 0) != 0 || i11 < 26) {
            return;
        }
        z4.m0.b(this, 8);
    }

    private void initChildrenHelper() {
        this.mChildHelper = new f(new y0(this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i11) {
        int i12;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b3 = -1;
        int i13 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i14 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i15 = rect2.left;
        if ((i14 < i15 || rect.right <= i15) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i16 = rect.right;
            int i17 = rect2.right;
            i12 = ((i16 > i17 || i14 >= i17) && i14 > i15) ? -1 : 0;
        }
        int i18 = rect.top;
        int i19 = rect2.top;
        if ((i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom) {
            b3 = 1;
        } else {
            int i21 = rect.bottom;
            int i22 = rect2.bottom;
            if ((i21 <= i22 && i18 < i22) || i18 <= i19) {
                b3 = 0;
            }
        }
        if (i11 == 1) {
            return b3 < 0 || (b3 == 0 && i12 * i13 < 0);
        }
        if (i11 == 2) {
            return b3 > 0 || (b3 == 0 && i12 * i13 > 0);
        }
        if (i11 == 17) {
            return i12 < 0;
        }
        if (i11 == 33) {
            return b3 < 0;
        }
        if (i11 == 66) {
            return i12 > 0;
        }
        if (i11 == 130) {
            return b3 > 0;
        }
        StringBuilder sb2 = new StringBuilder("Invalid direction: ");
        sb2.append(i11);
        throw new IllegalArgumentException(defpackage.e.j(this, sb2));
    }

    private void nestedScrollByInternal(int i11, int i12, MotionEvent motionEvent, int i13) {
        m1 m1Var = this.mLayout;
        if (m1Var == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = m1Var.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i14 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i11 - releaseHorizontalGlow(i11, height);
        int iReleaseVerticalGlow = i12 - releaseVerticalGlow(i12, width);
        startNestedScroll(i14, i13);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i13)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, i13);
        c0 c0Var = this.mGapWorker;
        if (c0Var != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            c0Var.a(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i13);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i11);
            int x11 = (int) (motionEvent.getX(i11) + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y10 = (int) (motionEvent.getY(i11) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z11;
        boolean z12 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            b bVar = this.mAdapterHelper;
            bVar.k(bVar.f2407b);
            bVar.k(bVar.f2408c);
            bVar.f2411f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        boolean z13 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f2433j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z11 = this.mDataSetHasChangedAfterLayout) || z13 || this.mLayout.mRequestedSimpleAnimations) && (!z11 || this.mAdapter.hasStableIds());
        c2 c2Var = this.mState;
        if (c2Var.f2433j && z13 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z12 = true;
        }
        c2Var.f2434k = z12;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    private void pullGlows(float f5, float f11, float f12, float f13) {
        boolean z11;
        boolean z12 = true;
        if (f11 >= CropImageView.DEFAULT_ASPECT_RATIO) {
            if (f11 > CropImageView.DEFAULT_ASPECT_RATIO) {
                ensureRightGlow();
                ue.f.z(this.mRightGlow, f11 / getWidth(), f12 / getHeight());
            } else {
                z11 = false;
            }
            if (f13 < CropImageView.DEFAULT_ASPECT_RATIO) {
                ensureTopGlow();
                ue.f.z(this.mTopGlow, (-f13) / getHeight(), f5 / getWidth());
            } else if (f13 > CropImageView.DEFAULT_ASPECT_RATIO) {
                ensureBottomGlow();
                ue.f.z(this.mBottomGlow, f13 / getHeight(), 1.0f - (f5 / getWidth()));
            } else {
                z12 = z11;
            }
            if (z12 && f11 == CropImageView.DEFAULT_ASPECT_RATIO && f13 == CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            WeakHashMap weakHashMap = z4.s0.f58893a;
            postInvalidateOnAnimation();
        }
        ensureLeftGlow();
        ue.f.z(this.mLeftGlow, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        z11 = true;
        if (f13 < CropImageView.DEFAULT_ASPECT_RATIO) {
            ensureTopGlow();
            ue.f.z(this.mTopGlow, (-f13) / getHeight(), f5 / getWidth());
        } else if (f13 > CropImageView.DEFAULT_ASPECT_RATIO) {
            ensureBottomGlow();
            ue.f.z(this.mBottomGlow, f13 / getHeight(), 1.0f - (f5 / getWidth()));
        } else {
            z12 = z11;
        }
        if (z12) {
        }
        WeakHashMap weakHashMap2 = z4.s0.f58893a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.f2449c.contains(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.e() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        g2 g2VarFindViewHolderForItemId = (this.mState.m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.m);
        if (g2VarFindViewHolderForItemId != null) {
            if (!this.mChildHelper.f2449c.contains(g2VarFindViewHolderForItemId.itemView) && g2VarFindViewHolderForItemId.itemView.hasFocusable()) {
                viewFindNextViewToFocus = g2VarFindViewHolderForItemId.itemView;
            } else if (this.mChildHelper.e() > 0) {
                viewFindNextViewToFocus = findNextViewToFocus();
            }
        } else if (this.mChildHelper.e() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i11 = this.mState.f2436n;
            if (i11 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i11)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = z4.s0.f58893a;
            postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int i11, float f5) {
        float height = f5 / getHeight();
        float width = i11 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (edgeEffect == null || ue.f.t(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && ue.f.t(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fZ = ue.f.z(this.mRightGlow, width, height);
                    if (ue.f.t(this.mRightGlow) == CropImageView.DEFAULT_ASPECT_RATIO) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = fZ;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -ue.f.z(this.mLeftGlow, -width, 1.0f - height);
                if (ue.f.t(this.mLeftGlow) == CropImageView.DEFAULT_ASPECT_RATIO) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private int releaseVerticalGlow(int i11, float f5) {
        float width = f5 / getWidth();
        float height = i11 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (edgeEffect == null || ue.f.t(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && ue.f.t(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fZ = ue.f.z(this.mBottomGlow, height, 1.0f - width);
                    if (ue.f.t(this.mBottomGlow) == CropImageView.DEFAULT_ASPECT_RATIO) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = fZ;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -ue.f.z(this.mTopGlow, -height, width);
                if (ue.f.t(this.mTopGlow) == CropImageView.DEFAULT_ASPECT_RATIO) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n1) {
            n1 n1Var = (n1) layoutParams;
            if (!n1Var.f2548c) {
                Rect rect = n1Var.f2547b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        c2 c2Var = this.mState;
        c2Var.m = -1L;
        c2Var.f2435l = -1;
        c2Var.f2436n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        g2 g2VarFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (g2VarFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.m = this.mAdapter.hasStableIds() ? g2VarFindContainingViewHolder.getItemId() : -1L;
        c2 c2Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = g2VarFindContainingViewHolder.isRemoved() ? g2VarFindContainingViewHolder.mOldPosition : g2VarFindContainingViewHolder.getAbsoluteAdapterPosition();
        }
        c2Var.f2435l = absoluteAdapterPosition;
        this.mState.f2436n = getDeepestFocusedViewWithId(g2VarFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(b1 b1Var, boolean z11, boolean z12) {
        b1 b1Var2 = this.mAdapter;
        if (b1Var2 != null) {
            b1Var2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z11 || z12) {
            removeAndRecycleViews();
        }
        b bVar = this.mAdapterHelper;
        bVar.k(bVar.f2407b);
        bVar.k(bVar.f2408c);
        bVar.f2411f = 0;
        b1 b1Var3 = this.mAdapter;
        this.mAdapter = b1Var;
        if (b1Var != null) {
            b1Var.registerAdapterDataObserver(this.mObserver);
            b1Var.onAttachedToRecyclerView(this);
        }
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            m1Var.onAdapterChanged(b1Var3, this.mAdapter);
        }
        u1 u1Var = this.mRecycler;
        b1 b1Var4 = this.mAdapter;
        u1Var.f2629a.clear();
        u1Var.h();
        u1Var.g(b1Var3, true);
        t1 t1VarC = u1Var.c();
        if (b1Var3 != null) {
            t1VarC.f2619b--;
        }
        if (!z11 && t1VarC.f2619b == 0) {
            SparseArray sparseArray = t1VarC.f2618a;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                s1 s1Var = (s1) sparseArray.valueAt(i11);
                ArrayList arrayList = s1Var.f2606a;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    android.support.v4.media.session.a.g(((g2) obj).itemView);
                }
                s1Var.f2606a.clear();
            }
        }
        if (b1Var4 != null) {
            t1VarC.f2619b++;
        } else {
            t1VarC.getClass();
        }
        u1Var.f();
        this.mState.f2429f = true;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i11, int i12) {
        if (i11 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i11) < ue.f.t(edgeEffect) * ((float) i12);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z11;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || ue.f.t(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO || canScrollHorizontally(-1)) {
            z11 = false;
        } else {
            ue.f.z(this.mLeftGlow, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getY() / getHeight()));
            z11 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && ue.f.t(edgeEffect2) != CropImageView.DEFAULT_ASPECT_RATIO && !canScrollHorizontally(1)) {
            ue.f.z(this.mRightGlow, CropImageView.DEFAULT_ASPECT_RATIO, motionEvent.getY() / getHeight());
            z11 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && ue.f.t(edgeEffect3) != CropImageView.DEFAULT_ASPECT_RATIO && !canScrollVertically(-1)) {
            ue.f.z(this.mTopGlow, CropImageView.DEFAULT_ASPECT_RATIO, motionEvent.getX() / getWidth());
            z11 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || ue.f.t(edgeEffect4) == CropImageView.DEFAULT_ASPECT_RATIO || canScrollVertically(1)) {
            return z11;
        }
        ue.f.z(this.mBottomGlow, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        f2 f2Var = this.mViewFlinger;
        f2Var.f2456t.removeCallbacks(f2Var);
        f2Var.f2452c.abortAnimation();
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            m1Var.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i11, int i12) {
        if (i11 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i11);
            }
        }
        if (i12 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i12);
            }
        } else if (i12 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i12);
            }
        }
        if (i11 == 0 && i12 == 0) {
            return;
        }
        WeakHashMap weakHashMap = z4.s0.f58893a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        m1 m1Var = this.mLayout;
        if (m1Var == null || !m1Var.onAddFocusables(this, arrayList, i11, i12)) {
            super.addFocusables(arrayList, i11, i12);
        }
    }

    public void addItemDecoration(j1 j1Var, int i11) {
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            m1Var.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i11 < 0) {
            this.mItemDecorations.add(j1Var);
        } else {
            this.mItemDecorations.add(i11, j1Var);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(o1 o1Var) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(o1Var);
    }

    public void addOnItemTouchListener(q1 q1Var) {
        this.mOnItemTouchListeners.add(q1Var);
    }

    public void addOnScrollListener(r1 r1Var) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(r1Var);
    }

    public void addRecyclerListener(v1 v1Var) {
        ns.o.j("'listener' arg cannot be null.", v1Var != null);
        this.mRecyclerListeners.add(v1Var);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public void animateAppearance(g2 g2Var, h1 h1Var, h1 h1Var2) {
        boolean zG;
        g2Var.setIsRecyclable(false);
        m mVar = (m) this.mItemAnimator;
        if (h1Var != null) {
            mVar.getClass();
            int i11 = h1Var.f2466a;
            int i12 = h1Var2.f2466a;
            if (i11 == i12 && h1Var.f2467b == h1Var2.f2467b) {
                mVar.l(g2Var);
                g2Var.itemView.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                mVar.f2525i.add(g2Var);
                zG = true;
            } else {
                zG = mVar.g(g2Var, i11, h1Var.f2467b, i12, h1Var2.f2467b);
            }
        } else {
            mVar.l(g2Var);
            g2Var.itemView.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            mVar.f2525i.add(g2Var);
            zG = true;
        }
        if (zG) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(g2 g2Var, h1 h1Var, h1 h1Var2) {
        boolean zG;
        addAnimatingView(g2Var);
        g2Var.setIsRecyclable(false);
        m mVar = (m) this.mItemAnimator;
        mVar.getClass();
        int i11 = h1Var.f2466a;
        int i12 = h1Var.f2467b;
        View view = g2Var.itemView;
        int left = h1Var2 == null ? view.getLeft() : h1Var2.f2466a;
        int top = h1Var2 == null ? view.getTop() : h1Var2.f2467b;
        if (g2Var.isRemoved() || (i11 == left && i12 == top)) {
            mVar.l(g2Var);
            mVar.f2524h.add(g2Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = mVar.g(g2Var, i11, i12, left, top);
        }
        if (zG) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str != null) {
            throw new IllegalStateException(defpackage.e.j(this, ep.a.n(str)));
        }
        throw new IllegalStateException(defpackage.e.j(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(defpackage.e.j(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException(defpackage.e.j(this, new StringBuilder(BuildConfig.VERSION_NAME)));
        }
    }

    public boolean canReuseUpdatedViewHolder(g2 g2Var) {
        i1 i1Var = this.mItemAnimator;
        if (i1Var != null) {
            return (g2Var.getUnmodifiedPayloads().isEmpty() && ((m) i1Var).f2523g && !g2Var.isInvalid()) ? false : true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n1) && this.mLayout.checkLayoutParams((n1) layoutParams);
    }

    public void clearOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        u1 u1Var = this.mRecycler;
        ArrayList arrayList = u1Var.f2629a;
        ArrayList arrayList2 = u1Var.f2631c;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((g2) arrayList2.get(i12)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            ((g2) arrayList.get(i13)).clearOldPosition();
        }
        ArrayList arrayList3 = u1Var.f2630b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i14 = 0; i14 < size3; i14++) {
                ((g2) u1Var.f2630b.get(i14)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<o1> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<r1> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        m1 m1Var = this.mLayout;
        if (m1Var != null && m1Var.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        m1 m1Var = this.mLayout;
        if (m1Var != null && m1Var.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        m1 m1Var = this.mLayout;
        if (m1Var != null && m1Var.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        m1 m1Var = this.mLayout;
        if (m1Var != null && m1Var.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        m1 m1Var = this.mLayout;
        if (m1Var != null && m1Var.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        m1 m1Var = this.mLayout;
        if (m1Var != null && m1Var.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i11, int i12) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i11 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i11 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i12 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i12 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = z4.s0.f58893a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i11) {
        return consumeFlingInStretch(i11, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i11) {
        return consumeFlingInStretch(i11, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i11 = v4.g.f53514a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.g()) {
            b bVar = this.mAdapterHelper;
            int i12 = bVar.f2411f;
            if ((i12 & 4) == 0 || (i12 & 11) != 0) {
                if (bVar.g()) {
                    int i13 = v4.g.f53514a;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i14 = v4.g.f53514a;
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.j();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i11, int i12) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = z4.s0.f58893a;
        setMeasuredDimension(m1.chooseSize(i11, paddingRight, getMinimumWidth()), m1.chooseSize(i12, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        g2 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        b1 b1Var = this.mAdapter;
        if (b1Var != null && childViewHolderInt != null) {
            b1Var.onViewAttachedToWindow(childViewHolderInt);
        }
        List<o1> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        g2 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        b1 b1Var = this.mAdapter;
        if (b1Var != null && childViewHolderInt != null) {
            b1Var.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<o1> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.f2432i = false;
        boolean z11 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f2427d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            b bVar = this.mAdapterHelper;
            if ((bVar.f2408c.isEmpty() || bVar.f2407b.isEmpty()) && !z11 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f5, float f11, boolean z11) {
        return getScrollingChildHelper().a(f5, f11, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f5, float f11) {
        return getScrollingChildHelper().b(f5, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i11, i12, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return getScrollingChildHelper().d(i11, i12, i13, i14, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i11) {
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            m1Var.onScrollStateChanged(i11);
        }
        onScrollStateChanged(i11);
        r1 r1Var = this.mScrollListener;
        if (r1Var != null) {
            r1Var.onScrollStateChanged(this, i11);
        }
        List<r1> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i11);
            }
        }
    }

    public void dispatchOnScrolled(int i11, int i12) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i11, scrollY - i12);
        onScrolled(i11, i12);
        r1 r1Var = this.mScrollListener;
        if (r1Var != null) {
            r1Var.onScrolled(this, i11, i12);
        }
        List<r1> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i11, i12);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i11;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            g2 g2Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (g2Var.itemView.getParent() == this && !g2Var.shouldIgnore() && (i11 = g2Var.mPendingAccessibilityState) != -1) {
                View view = g2Var.itemView;
                WeakHashMap weakHashMap = z4.s0.f58893a;
                view.setImportantForAccessibility(i11);
                g2Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z11;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.mItemDecorations.get(i11).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z11 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, CropImageView.DEFAULT_ASPECT_RATIO);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z11 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z11 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z11 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z12 = true;
            }
            z11 |= z12;
            canvas.restoreToCount(iSave4);
        }
        if ((z11 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) ? z11 : true) {
            WeakHashMap weakHashMap = z4.s0.f58893a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        return super.drawChild(canvas, view, j11);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((d2) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((d2) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((d2) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((d2) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(c2 c2Var) {
        if (getScrollState() != 2) {
            c2Var.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f2452c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c2Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f5, float f11) {
        for (int iE = this.mChildHelper.e() - 1; iE >= 0; iE--) {
            View viewD = this.mChildHelper.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f5 >= viewD.getLeft() + translationX && f5 <= viewD.getRight() + translationX && f11 >= viewD.getTop() + translationY && f11 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public g2 findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public g2 findViewHolderForAdapterPosition(int i11) {
        g2 g2Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iH = this.mChildHelper.h();
        for (int i12 = 0; i12 < iH; i12++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i11) {
                f fVar = this.mChildHelper;
                if (!fVar.f2449c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                g2Var = childViewHolderInt;
            }
        }
        return g2Var;
    }

    public g2 findViewHolderForItemId(long j11) {
        b1 b1Var = this.mAdapter;
        g2 g2Var = null;
        if (b1Var != null && b1Var.hasStableIds()) {
            int iH = this.mChildHelper.h();
            for (int i11 = 0; i11 < iH; i11++) {
                g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j11) {
                    f fVar = this.mChildHelper;
                    if (!fVar.f2449c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    g2Var = childViewHolderInt;
                }
            }
        }
        return g2Var;
    }

    public g2 findViewHolderForLayoutPosition(int i11) {
        return findViewHolderForPosition(i11, false);
    }

    @Deprecated
    public g2 findViewHolderForPosition(int i11) {
        return findViewHolderForPosition(i11, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i11, int i12) {
        int iMax;
        int i13;
        m1 m1Var = this.mLayout;
        if (m1Var == null || this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = m1Var.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i11) < this.mMinFlingVelocity) {
            i11 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i12) < this.mMinFlingVelocity) {
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return false;
        }
        if (i11 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || ue.f.t(edgeEffect) == CropImageView.DEFAULT_ASPECT_RATIO) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 == null || ue.f.t(edgeEffect2) == CropImageView.DEFAULT_ASPECT_RATIO) {
                    iMax = 0;
                } else if (shouldAbsorb(this.mRightGlow, i11, getWidth())) {
                    this.mRightGlow.onAbsorb(i11);
                    i11 = 0;
                }
            } else {
                int i14 = -i11;
                if (shouldAbsorb(this.mLeftGlow, i14, getWidth())) {
                    this.mLeftGlow.onAbsorb(i14);
                    i11 = 0;
                }
            }
            iMax = i11;
            i11 = 0;
        }
        if (i12 == 0) {
            i13 = i12;
            i12 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || ue.f.t(edgeEffect3) == CropImageView.DEFAULT_ASPECT_RATIO) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 == null || ue.f.t(edgeEffect4) == CropImageView.DEFAULT_ASPECT_RATIO) {
                    i13 = i12;
                    i12 = 0;
                } else if (shouldAbsorb(this.mBottomGlow, i12, getHeight())) {
                    this.mBottomGlow.onAbsorb(i12);
                    i12 = 0;
                }
            } else {
                int i15 = -i12;
                if (shouldAbsorb(this.mTopGlow, i15, getHeight())) {
                    this.mTopGlow.onAbsorb(i15);
                    i12 = 0;
                }
            }
            i13 = 0;
        }
        if (iMax != 0 || i12 != 0) {
            int i16 = this.mMaxFlingVelocity;
            iMax = Math.max(-i16, Math.min(iMax, i16));
            int i17 = this.mMaxFlingVelocity;
            i12 = Math.max(-i17, Math.min(i12, i17));
            this.mViewFlinger.a(iMax, i12);
        }
        if (i11 == 0 && i13 == 0) {
            return (iMax == 0 && i12 == 0) ? false : true;
        }
        float f5 = i11;
        float f11 = i13;
        if (!dispatchNestedPreFling(f5, f11)) {
            boolean z11 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f5, f11, z11);
            p1 p1Var = this.mOnFlingListener;
            if (p1Var != null && p1Var.onFling(i11, i13)) {
                return true;
            }
            if (z11) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i18 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i18, Math.min(i11, i18));
                int i19 = this.mMaxFlingVelocity;
                this.mViewFlinger.a(iMax2, Math.max(-i19, Math.min(i13, i19)));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i11) {
        View viewOnFocusSearchFailed;
        boolean z11;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i11);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z12 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (!z12 || (i11 != 2 && i11 != 1)) {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i11);
            if (viewFindNextFocus == null && z12) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) != null) {
                    startInterceptRequestLayout();
                    viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i11, this.mRecycler, this.mState);
                    stopInterceptRequestLayout(false);
                }
                return null;
            }
            viewOnFocusSearchFailed = viewFindNextFocus;
            if (viewOnFocusSearchFailed != null || viewOnFocusSearchFailed.hasFocusable()) {
                if (isPreferredNextFocus(view, viewOnFocusSearchFailed, i11)) {
                    return viewOnFocusSearchFailed;
                }
                return super.focusSearch(view, i11);
            }
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i11);
            }
            requestChildOnScreen(viewOnFocusSearchFailed, null);
            return view;
        }
        if (this.mLayout.canScrollVertically()) {
            int i12 = i11 == 2 ? 130 : 33;
            z11 = focusFinder.findNextFocus(this, view, i12) == null;
            if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                i11 = i12;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.mLayout.canScrollHorizontally()) {
            int i13 = (this.mLayout.getLayoutDirection() == 1) ^ (i11 == 2) ? 66 : 17;
            boolean z13 = focusFinder.findNextFocus(this, view, i13) == null;
            if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                i11 = i13;
            }
            z11 = z13;
        }
        if (z11) {
            consumePendingUpdateOperations();
            if (findContainingItemView(view) != null) {
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i11, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            return null;
        }
        viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i11);
        if (viewOnFocusSearchFailed != null) {
        }
        if (isPreferredNextFocus(view, viewOnFocusSearchFailed, i11)) {
            return viewOnFocusSearchFailed;
        }
        return super.focusSearch(view, i11);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            return m1Var.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(defpackage.e.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            return m1Var.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(defpackage.e.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public b1 getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(g2 g2Var) {
        if (g2Var.hasAnyOfTheFlags(524) || !g2Var.isBound()) {
            return -1;
        }
        b bVar = this.mAdapterHelper;
        int i11 = g2Var.mPosition;
        ArrayList arrayList = bVar.f2407b;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar = (a) arrayList.get(i12);
            int i13 = aVar.f2398a;
            if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = aVar.f2399b;
                    if (i14 <= i11) {
                        int i15 = aVar.f2401d;
                        if (i14 + i15 > i11) {
                            return -1;
                        }
                        i11 -= i15;
                    } else {
                        continue;
                    }
                } else if (i13 == 8) {
                    int i16 = aVar.f2399b;
                    if (i16 == i11) {
                        i11 = aVar.f2401d;
                    } else {
                        if (i16 < i11) {
                            i11--;
                        }
                        if (aVar.f2401d <= i11) {
                            i11++;
                        }
                    }
                }
            } else if (aVar.f2399b <= i11) {
                i11 += aVar.f2401d;
            }
        }
        return i11;
    }

    @Override // android.view.View
    public int getBaseline() {
        m1 m1Var = this.mLayout;
        return m1Var != null ? m1Var.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(g2 g2Var) {
        return this.mAdapter.hasStableIds() ? g2Var.getItemId() : g2Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        g2 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i11, int i12) {
        return super.getChildDrawingOrder(i11, i12);
    }

    public long getChildItemId(View view) {
        g2 childViewHolderInt;
        b1 b1Var = this.mAdapter;
        if (b1Var == null || !b1Var.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        g2 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public g2 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public i2 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public f1 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public i1 getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        n1 n1Var = (n1) view.getLayoutParams();
        boolean z11 = n1Var.f2548c;
        Rect rect = n1Var.f2547b;
        if (!z11 || (this.mState.f2430g && (n1Var.f2546a.isUpdated() || n1Var.f2546a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i11).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i12 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i12 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        n1Var.f2548c = false;
        return rect;
    }

    public j1 getItemDecorationAt(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            return this.mItemDecorations.get(i11);
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public m1 getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public p1 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public t1 getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new b(new y0(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(defpackage.e.j(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new z(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.lingodeer.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.lingodeer.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.lingodeer.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            m1Var.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        i1 i1Var = this.mItemAnimator;
        return i1Var != null && i1Var.f();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f58886d;
    }

    public void jumpToPositionForSmoothScroller(int i11) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i11);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iH = this.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            ((n1) this.mChildHelper.g(i11).getLayoutParams()).f2548c = true;
        }
        ArrayList arrayList = this.mRecycler.f2631c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            n1 n1Var = (n1) ((g2) arrayList.get(i12)).itemView.getLayoutParams();
            if (n1Var != null) {
                n1Var.f2548c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iH = this.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        u1 u1Var = this.mRecycler;
        ArrayList arrayList = u1Var.f2631c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            g2 g2Var = (g2) arrayList.get(i12);
            if (g2Var != null) {
                g2Var.addFlags(6);
                g2Var.addChangePayload(null);
            }
        }
        b1 b1Var = u1Var.f2636h.mAdapter;
        if (b1Var == null || !b1Var.hasStableIds()) {
            u1Var.h();
        }
    }

    public void nestedScrollBy(int i11, int i12) {
        nestedScrollByInternal(i11, i12, null, 1);
    }

    public void offsetChildrenHorizontal(int i11) {
        int iE = this.mChildHelper.e();
        for (int i12 = 0; i12 < iE; i12++) {
            this.mChildHelper.d(i12).offsetLeftAndRight(i11);
        }
    }

    public void offsetChildrenVertical(int i11) {
        int iE = this.mChildHelper.e();
        for (int i12 = 0; i12 < iE; i12++) {
            this.mChildHelper.d(i12).offsetTopAndBottom(i11);
        }
    }

    public void offsetPositionRecordsForInsert(int i11, int i12) {
        int iH = this.mChildHelper.h();
        for (int i13 = 0; i13 < iH; i13++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i11) {
                childViewHolderInt.offsetPosition(i12, false);
                this.mState.f2429f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f2631c;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            g2 g2Var = (g2) arrayList.get(i14);
            if (g2Var != null && g2Var.mPosition >= i11) {
                g2Var.offsetPosition(i12, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int iH = this.mChildHelper.h();
        int i21 = -1;
        if (i11 < i12) {
            i14 = i11;
            i13 = i12;
            i15 = -1;
        } else {
            i13 = i11;
            i14 = i12;
            i15 = 1;
        }
        for (int i22 = 0; i22 < iH; i22++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i22));
            if (childViewHolderInt != null && (i19 = childViewHolderInt.mPosition) >= i14 && i19 <= i13) {
                if (i19 == i11) {
                    childViewHolderInt.offsetPosition(i12 - i11, false);
                } else {
                    childViewHolderInt.offsetPosition(i15, false);
                }
                this.mState.f2429f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f2631c;
        if (i11 < i12) {
            i17 = i11;
            i16 = i12;
        } else {
            i16 = i11;
            i21 = 1;
            i17 = i12;
        }
        int size = arrayList.size();
        for (int i23 = 0; i23 < size; i23++) {
            g2 g2Var = (g2) arrayList.get(i23);
            if (g2Var != null && (i18 = g2Var.mPosition) >= i17 && i18 <= i16) {
                if (i18 == i11) {
                    g2Var.offsetPosition(i12 - i11, false);
                } else {
                    g2Var.offsetPosition(i21, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i11, int i12, boolean z11) {
        int i13 = i11 + i12;
        int iH = this.mChildHelper.h();
        for (int i14 = 0; i14 < iH; i14++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i14));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i15 = childViewHolderInt.mPosition;
                if (i15 >= i13) {
                    childViewHolderInt.offsetPosition(-i12, z11);
                    this.mState.f2429f = true;
                } else if (i15 >= i11) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i11 - 1, -i12, z11);
                    this.mState.f2429f = true;
                }
            }
        }
        u1 u1Var = this.mRecycler;
        ArrayList arrayList = u1Var.f2631c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g2 g2Var = (g2) arrayList.get(size);
            if (g2Var != null) {
                int i16 = g2Var.mPosition;
                if (i16 >= i13) {
                    g2Var.offsetPosition(-i12, z11);
                } else if (i16 >= i11) {
                    g2Var.addFlags(8);
                    u1Var.i(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.f();
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            m1Var.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = c0.f2418e;
            c0 c0Var = (c0) threadLocal.get();
            this.mGapWorker = c0Var;
            if (c0Var == null) {
                c0 c0Var2 = new c0();
                c0Var2.f2420a = new ArrayList();
                c0Var2.f2423d = new ArrayList();
                this.mGapWorker = c0Var2;
                WeakHashMap weakHashMap = z4.s0.f58893a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                c0 c0Var3 = this.mGapWorker;
                c0Var3.f2422c = (long) (1.0E9f / refreshRate);
                threadLocal.set(c0Var3);
            }
            this.mGapWorker.f2420a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        c0 c0Var;
        super.onDetachedFromWindow();
        i1 i1Var = this.mItemAnimator;
        if (i1Var != null) {
            i1Var.e();
        }
        stopScroll();
        int i11 = 0;
        this.mIsAttached = false;
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            m1Var.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (t2.f2621d.acquire() != null) {
        }
        u1 u1Var = this.mRecycler;
        ArrayList arrayList = u1Var.f2631c;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            android.support.v4.media.session.a.g(((g2) arrayList.get(i12)).itemView);
        }
        u1Var.g(u1Var.f2636h.mAdapter, false);
        while (i11 < getChildCount()) {
            int i13 = i11 + 1;
            View childAt = getChildAt(i11);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            ArrayList arrayList2 = android.support.v4.media.session.a.u(childAt).f36060a;
            for (int iA = ns.o.A(arrayList2); -1 < iA; iA--) {
                ((z2.m2) arrayList2.get(iA)).f58625a.d();
            }
            i11 = i13;
        }
        if (!ALLOW_THREAD_GAP_WORK || (c0Var = this.mGapWorker) == null) {
            return;
        }
        c0Var.f2420a.remove(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mItemDecorations.get(i11).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f5;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f5 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f5 = -axisValue2;
                } else if (this.mLayout.canScrollHorizontally()) {
                    axisValue = axisValue2;
                    f5 = 0.0f;
                } else {
                    f5 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f5 = 0.0f;
                axisValue = 0.0f;
            }
            if (f5 != CropImageView.DEFAULT_ASPECT_RATIO || axisValue != CropImageView.DEFAULT_ASPECT_RATIO) {
                nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f5 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        m1 m1Var = this.mLayout;
        if (m1Var == null) {
            return false;
        }
        boolean zCanScrollHorizontally = m1Var.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i11 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i11 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i11, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x12 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i12 = x12 - this.mInitialTouchX;
                int i13 = y11 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i12) <= this.mTouchSlop) {
                    z11 = false;
                } else {
                    this.mLastTouchX = x12;
                    z11 = true;
                }
                if (zCanScrollVertically && Math.abs(i13) > this.mTouchSlop) {
                    this.mLastTouchY = y11;
                    z11 = true;
                }
                if (z11) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x13;
            this.mInitialTouchX = x13;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = v4.g.f53514a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        m1 m1Var = this.mLayout;
        if (m1Var == null) {
            defaultOnMeasure(i11, i12);
            return;
        }
        boolean z11 = false;
        if (m1Var.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z11 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z11;
            if (z11 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f2427d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i11, i12);
            this.mState.f2432i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i11, i12);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f2432i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i11, i12);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            c2 c2Var = this.mState;
            if (c2Var.f2434k) {
                c2Var.f2430g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f2430g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f2434k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        b1 b1Var = this.mAdapter;
        if (b1Var != null) {
            this.mState.f2428e = b1Var.getItemCount();
        } else {
            this.mState.f2428e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
        stopInterceptRequestLayout(false);
        this.mState.f2430g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i11, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof y1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        y1 y1Var = (y1) parcelable;
        this.mPendingSavedState = y1Var;
        super.onRestoreInstanceState(y1Var.f37910a);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        y1 y1Var = new y1(super.onSaveInstanceState());
        y1 y1Var2 = this.mPendingSavedState;
        if (y1Var2 != null) {
            y1Var.f2653c = y1Var2.f2653c;
            return y1Var;
        }
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            y1Var.f2653c = m1Var.onSaveInstanceState();
            return y1Var;
        }
        y1Var.f2653c = null;
        return y1Var;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 == i13 && i12 == i14) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[PHI: r1
      0x00c2: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:40:0x00ab, B:44:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i11;
        boolean z11;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        m1 m1Var = this.mLayout;
        if (m1Var == null) {
            return false;
        }
        boolean zCanScrollHorizontally = m1Var.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f5 = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f11 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f5 == CropImageView.DEFAULT_ASPECT_RATIO && f11 == CropImageView.DEFAULT_ASPECT_RATIO) || !fling((int) f5, (int) f11)) {
                    setScrollState(0);
                }
                resetScroll();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.mLastTouchX - x11;
                int iMax2 = this.mLastTouchY - y10;
                if (this.mScrollState != 1) {
                    if (zCanScrollHorizontally) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                        if (iMax != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else {
                        z11 = false;
                    }
                    if (zCanScrollVertically) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                        if (iMax2 != 0) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        setScrollState(1);
                    }
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iReleaseHorizontalGlow = iMax - releaseHorizontalGlow(iMax, motionEvent.getY());
                    int iReleaseVerticalGlow = iMax2 - releaseVerticalGlow(iMax2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iReleaseHorizontalGlow -= iArr4[0];
                        iReleaseVerticalGlow -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i12 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i12 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x11 - iArr7[0];
                    this.mLastTouchY = y10 - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    c0 c0Var = this.mGapWorker;
                    if (c0Var != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
                        c0Var.a(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x12;
                this.mInitialTouchX = x12;
                int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y11;
                this.mInitialTouchY = y11;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.mScrollPointerId = motionEvent.getPointerId(0);
        int x13 = (int) (motionEvent.getX() + 0.5f);
        this.mLastTouchX = x13;
        this.mInitialTouchX = x13;
        int y12 = (int) (motionEvent.getY() + 0.5f);
        this.mLastTouchY = y12;
        this.mInitialTouchY = y12;
        if (zCanScrollVertically) {
            i11 = zCanScrollHorizontally;
            i11 = (zCanScrollHorizontally ? 1 : 0) | 2;
        }
        i11 = zCanScrollHorizontally;
        startNestedScroll(i11, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = z4.s0.f58893a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z11) {
        this.mDispatchItemsChangedEvent = z11 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(g2 g2Var, h1 h1Var) {
        g2Var.setFlags(0, OSSConstants.DEFAULT_BUFFER_SIZE);
        if (this.mState.f2431h && g2Var.isUpdated() && !g2Var.isRemoved() && !g2Var.shouldIgnore()) {
            this.mViewInfoStore.f2642b.h(getChangedHolderKey(g2Var), g2Var);
        }
        y.t0 t0Var = this.mViewInfoStore.f2641a;
        t2 t2VarA = (t2) t0Var.get(g2Var);
        if (t2VarA == null) {
            t2VarA = t2.a();
            t0Var.put(g2Var, t2VarA);
        }
        t2VarA.f2623b = h1Var;
        t2VarA.f2622a |= 4;
    }

    public void removeAndRecycleViews() {
        i1 i1Var = this.mItemAnimator;
        if (i1Var != null) {
            i1Var.e();
        }
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            m1Var.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        u1 u1Var = this.mRecycler;
        u1Var.f2629a.clear();
        u1Var.h();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        f fVar = this.mChildHelper;
        e eVar = fVar.f2448b;
        y0 y0Var = fVar.f2447a;
        int iIndexOfChild = y0Var.f2652a.indexOfChild(view);
        boolean z11 = true;
        if (iIndexOfChild == -1) {
            fVar.k(view);
        } else if (eVar.F(iIndexOfChild)) {
            eVar.I(iIndexOfChild);
            fVar.k(view);
            y0Var.b(iIndexOfChild);
        } else {
            z11 = false;
        }
        if (z11) {
            g2 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.n(childViewHolderInt);
            this.mRecycler.k(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z11);
        return z11;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z11) {
        g2 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(defpackage.e.j(this, sb2));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z11);
    }

    public void removeItemDecoration(j1 j1Var) {
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            m1Var.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(j1Var);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i11));
            return;
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(o1 o1Var) {
        List<o1> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(o1Var);
    }

    public void removeOnItemTouchListener(q1 q1Var) {
        this.mOnItemTouchListeners.remove(q1Var);
        if (this.mInterceptingOnItemTouchListener == q1Var) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(r1 r1Var) {
        List<r1> list = this.mScrollListeners;
        if (list != null) {
            list.remove(r1Var);
        }
    }

    public void removeRecyclerListener(v1 v1Var) {
        this.mRecyclerListeners.remove(v1Var);
    }

    public void repositionShadowingViews() {
        g2 g2Var;
        int iE = this.mChildHelper.e();
        for (int i11 = 0; i11 < iE; i11++) {
            View viewD = this.mChildHelper.d(i11);
            g2 childViewHolder = getChildViewHolder(viewD);
            if (childViewHolder != null && (g2Var = childViewHolder.mShadowingHolder) != null) {
                View view = g2Var.itemView;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        int size = this.mOnItemTouchListeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mOnItemTouchListeners.get(i11).onRequestDisallowInterceptTouchEvent(z11);
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iH = this.mChildHelper.h();
        for (int i11 = 0; i11 < iH; i11++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i11, int i12) {
        m1 m1Var = this.mLayout;
        if (m1Var == null || this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = m1Var.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i11 = 0;
            }
            if (!zCanScrollVertically) {
                i12 = 0;
            }
            scrollByInternal(i11, i12, null, 0);
        }
    }

    public boolean scrollByInternal(int i11, int i12, MotionEvent motionEvent, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i11, i12, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i18 = iArr2[0];
            int i19 = iArr2[1];
            i16 = i11 - i18;
            i17 = i12 - i19;
            i15 = i19;
            i14 = i18;
        } else {
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i14, i15, i16, i17, this.mScrollOffset, i13, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i21 = iArr4[0];
        int i22 = i16 - i21;
        int i23 = iArr4[1];
        int i24 = i17 - i23;
        boolean z11 = (i21 == 0 && i23 == 0) ? false : true;
        int i25 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i26 = iArr5[0];
        this.mLastTouchX = i25 - i26;
        int i27 = this.mLastTouchY;
        int i28 = iArr5[1];
        this.mLastTouchY = i27 - i28;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i26;
        iArr6[1] = iArr6[1] + i28;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i22, motionEvent.getY(), i24);
            }
            considerReleasingGlowsOnScroll(i11, i12);
        }
        if (i14 != 0 || i15 != 0) {
            dispatchOnScrolled(i14, i15);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z11 && i14 == 0 && i15 == 0) ? false : true;
    }

    public void scrollStep(int i11, int i12, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i13 = v4.g.f53514a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i11 != 0 ? this.mLayout.scrollHorizontallyBy(i11, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i12 != 0 ? this.mLayout.scrollVerticallyBy(i12, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    public void scrollToPosition(int i11) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        m1 m1Var = this.mLayout;
        if (m1Var == null) {
            return;
        }
        m1Var.scrollToPosition(i11);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(i2 i2Var) {
        this.mAccessibilityDelegate = i2Var;
        z4.s0.q(this, i2Var);
    }

    public void setAdapter(b1 b1Var) {
        setLayoutFrozen(false);
        setAdapterInternal(b1Var, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(e1 e1Var) {
        if (e1Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(g2 g2Var, int i11) {
        if (isComputingLayout()) {
            g2Var.mPendingAccessibilityState = i11;
            this.mPendingAccessibilityImportanceChange.add(g2Var);
            return false;
        }
        View view = g2Var.itemView;
        WeakHashMap weakHashMap = z4.s0.f58893a;
        view.setImportantForAccessibility(i11);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z11) {
        if (z11 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z11;
        super.setClipToPadding(z11);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(f1 f1Var) {
        f1Var.getClass();
        this.mEdgeEffectFactory = f1Var;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z11) {
        this.mHasFixedSize = z11;
    }

    public void setItemAnimator(i1 i1Var) {
        i1 i1Var2 = this.mItemAnimator;
        if (i1Var2 != null) {
            i1Var2.e();
            this.mItemAnimator.f2477a = null;
        }
        this.mItemAnimator = i1Var;
        if (i1Var != null) {
            i1Var.f2477a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i11) {
        u1 u1Var = this.mRecycler;
        u1Var.f2633e = i11;
        u1Var.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z11) {
        suppressLayout(z11);
    }

    public void setLayoutManager(m1 m1Var) {
        if (m1Var == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            i1 i1Var = this.mItemAnimator;
            if (i1Var != null) {
                i1Var.e();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            u1 u1Var = this.mRecycler;
            u1Var.f2629a.clear();
            u1Var.h();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            u1 u1Var2 = this.mRecycler;
            u1Var2.f2629a.clear();
            u1Var2.h();
        }
        f fVar = this.mChildHelper;
        RecyclerView recyclerView = fVar.f2447a.f2652a;
        fVar.f2448b.J();
        ArrayList arrayList = fVar.f2449c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g2 childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = m1Var;
        if (m1Var != null) {
            if (m1Var.mRecyclerView != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(m1Var);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(defpackage.e.j(m1Var.mRecyclerView, sb2));
            }
            m1Var.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z11) {
        getScrollingChildHelper().g(z11);
    }

    public void setOnFlingListener(p1 p1Var) {
        this.mOnFlingListener = p1Var;
    }

    @Deprecated
    public void setOnScrollListener(r1 r1Var) {
        this.mScrollListener = r1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z11) {
        this.mPreserveFocusAfterLayout = z11;
    }

    public void setRecycledViewPool(t1 t1Var) {
        u1 u1Var = this.mRecycler;
        RecyclerView recyclerView = u1Var.f2636h;
        u1Var.g(recyclerView.mAdapter, false);
        t1 t1Var2 = u1Var.f2635g;
        if (t1Var2 != null) {
            t1Var2.f2619b--;
        }
        u1Var.f2635g = t1Var;
        if (t1Var != null && recyclerView.getAdapter() != null) {
            u1Var.f2635g.f2619b++;
        }
        u1Var.f();
    }

    public void setScrollState(int i11) {
        if (i11 == this.mScrollState) {
            return;
        }
        this.mScrollState = i11;
        if (i11 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i11);
    }

    public void setScrollingTouchSlop(int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i11 != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(e2 e2Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i11, int i12) {
        smoothScrollBy(i11, i12, null);
    }

    public void smoothScrollToPosition(int i11) {
        m1 m1Var;
        if (this.mLayoutSuppressed || (m1Var = this.mLayout) == null) {
            return;
        }
        m1Var.smoothScrollToPosition(this, this.mState, i11);
    }

    public void startInterceptRequestLayout() {
        int i11 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i11;
        if (i11 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return getScrollingChildHelper().h(i11, 0);
    }

    public void stopInterceptRequestLayout(boolean z11) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z11 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z11 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z11) {
        if (z11 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z11) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(b1 b1Var, boolean z11) {
        setLayoutFrozen(false);
        setAdapterInternal(b1Var, true, z11);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i11, int i12, Object obj) {
        int i13;
        int i14;
        int iH = this.mChildHelper.h();
        int i15 = i12 + i11;
        for (int i16 = 0; i16 < iH; i16++) {
            View viewG = this.mChildHelper.g(i16);
            g2 childViewHolderInt = getChildViewHolderInt(viewG);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i14 = childViewHolderInt.mPosition) >= i11 && i14 < i15) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((n1) viewG.getLayoutParams()).f2548c = true;
            }
        }
        u1 u1Var = this.mRecycler;
        ArrayList arrayList = u1Var.f2631c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g2 g2Var = (g2) arrayList.get(size);
            if (g2Var != null && (i13 = g2Var.mPosition) >= i11 && i13 < i15) {
                g2Var.addFlags(2);
                u1Var.i(size);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.lingodeer.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038 A[SYNTHETIC] */
    public g2 findViewHolderForPosition(int i11, boolean z11) {
        f fVar;
        int iH = this.mChildHelper.h();
        g2 g2Var = null;
        for (int i12 = 0; i12 < iH; i12++) {
            g2 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z11) {
                    if (childViewHolderInt.mPosition != i11) {
                        continue;
                    } else {
                        fVar = this.mChildHelper;
                        if (fVar.f2449c.contains(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        g2Var = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i11) {
                    continue;
                } else {
                    fVar = this.mChildHelper;
                    if (fVar.f2449c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    g2Var = childViewHolderInt;
                }
            }
        }
        return g2Var;
    }

    public void onExitLayoutOrScroll(boolean z11) {
        int i11 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i11;
        if (i11 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z11) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i11, int i12, Interpolator interpolator) {
        smoothScrollBy(i11, i12, interpolator, Integer.MIN_VALUE);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i11) {
        float fA;
        float fA2;
        super(context, attributeSet, i11);
        this.mObserver = new w1(this);
        this.mRecycler = new u1(this);
        this.mViewInfoStore = new v2();
        this.mUpdateChildViewsRunnable = new x0(0, this);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        m mVar = new m();
        mVar.f2477a = null;
        mVar.f2478b = new ArrayList();
        mVar.f2479c = 120L;
        mVar.f2480d = 120L;
        mVar.f2481e = 250L;
        mVar.f2482f = 250L;
        int i12 = 1;
        mVar.f2523g = true;
        mVar.f2524h = new ArrayList();
        mVar.f2525i = new ArrayList();
        mVar.f2526j = new ArrayList();
        mVar.f2527k = new ArrayList();
        mVar.f2528l = new ArrayList();
        mVar.m = new ArrayList();
        mVar.f2529n = new ArrayList();
        mVar.f2530o = new ArrayList();
        mVar.f2531p = new ArrayList();
        mVar.f2532q = new ArrayList();
        mVar.f2533r = new ArrayList();
        this.mItemAnimator = mVar;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new f2(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new a0() : null;
        c2 c2Var = new c2();
        c2Var.f2424a = -1;
        c2Var.f2425b = 0;
        c2Var.f2426c = 0;
        c2Var.f2427d = 1;
        c2Var.f2428e = 0;
        c2Var.f2429f = false;
        c2Var.f2430g = false;
        c2Var.f2431h = false;
        c2Var.f2432i = false;
        c2Var.f2433j = false;
        c2Var.f2434k = false;
        this.mState = c2Var;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new y0(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new x0(i12, this);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new y0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            Method method = z4.t0.f58901a;
            fA = z6.c.i(viewConfiguration);
        } else {
            fA = z4.t0.a(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = fA;
        if (i13 >= 26) {
            fA2 = z6.c.j(viewConfiguration);
        } else {
            fA2 = z4.t0.a(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = fA2;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f2477a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap weakHashMap = z4.s0.f58893a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new i2(this));
        int[] iArr = v9.a.f53805a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        z4.s0.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i11);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z11;
        if (z11) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i11, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i11, 0);
        z4.s0.p(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i11);
        boolean z12 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z12);
        setTag(com.lingodeer.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return getScrollingChildHelper().c(i11, i12, iArr, iArr2, i13);
    }

    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr, int i15) {
        return getScrollingChildHelper().d(i11, i12, i13, i14, iArr, i15, null);
    }

    public boolean hasNestedScrollingParent(int i11) {
        return getScrollingChildHelper().f(i11);
    }

    public void smoothScrollBy(int i11, int i12, Interpolator interpolator, int i13) {
        smoothScrollBy(i11, i12, interpolator, i13, false);
    }

    public boolean startNestedScroll(int i11, int i12) {
        return getScrollingChildHelper().h(i11, i12);
    }

    public void stopNestedScroll(int i11) {
        getScrollingChildHelper().i(i11);
    }

    public void smoothScrollBy(int i11, int i12, Interpolator interpolator, int i13, boolean z11) {
        m1 m1Var = this.mLayout;
        if (m1Var == null || this.mLayoutSuppressed) {
            return;
        }
        if (!m1Var.canScrollHorizontally()) {
            i11 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i12 = 0;
        }
        if (i11 == 0 && i12 == 0) {
            return;
        }
        if (i13 != Integer.MIN_VALUE && i13 <= 0) {
            scrollBy(i11, i12);
            return;
        }
        if (z11) {
            int i14 = i11 != 0 ? 1 : 0;
            if (i12 != 0) {
                i14 |= 2;
            }
            startNestedScroll(i14, 1);
        }
        this.mViewFlinger.c(i11, i12, interpolator, i13);
    }

    public final void dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        getScrollingChildHelper().d(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    public void addItemDecoration(j1 j1Var) {
        addItemDecoration(j1Var, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m1 m1Var = this.mLayout;
        if (m1Var != null) {
            return m1Var.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(defpackage.e.j(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onScrollStateChanged(int i11) {
    }

    @Deprecated
    public void setRecyclerListener(v1 v1Var) {
    }

    public void onScrolled(int i11, int i12) {
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
    }
}
