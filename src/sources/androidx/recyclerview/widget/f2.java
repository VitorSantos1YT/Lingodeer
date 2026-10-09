package androidx.recyclerview.widget;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OverScroller f2452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Interpolator f2453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2455f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2456t;

    public f2(RecyclerView recyclerView) {
        this.f2456t = recyclerView;
        Interpolator interpolator = RecyclerView.sQuinticInterpolator;
        this.f2453d = interpolator;
        this.f2454e = false;
        this.f2455f = false;
        this.f2452c = new OverScroller(recyclerView.getContext(), interpolator);
    }

    public final void a(int i11, int i12) {
        RecyclerView recyclerView = this.f2456t;
        recyclerView.setScrollState(2);
        this.f2451b = 0;
        this.f2450a = 0;
        Interpolator interpolator = this.f2453d;
        Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
        if (interpolator != interpolator2) {
            this.f2453d = interpolator2;
            this.f2452c = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.f2452c.fling(0, 0, i11, i12, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f2454e) {
            this.f2455f = true;
            return;
        }
        RecyclerView recyclerView = this.f2456t;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = z4.s0.f58893a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i11, int i12, Interpolator interpolator, int i13) {
        RecyclerView recyclerView = this.f2456t;
        if (i13 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i11);
            int iAbs2 = Math.abs(i12);
            boolean z11 = iAbs > iAbs2;
            int width = z11 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z11) {
                iAbs = iAbs2;
            }
            i13 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i14 = i13;
        if (interpolator == null) {
            interpolator = RecyclerView.sQuinticInterpolator;
        }
        if (this.f2453d != interpolator) {
            this.f2453d = interpolator;
            this.f2452c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2451b = 0;
        this.f2450a = 0;
        recyclerView.setScrollState(2);
        this.f2452c.startScroll(0, 0, i11, i12, i14);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RecyclerView recyclerView = this.f2456t;
        if (recyclerView.mLayout == null) {
            recyclerView.removeCallbacks(this);
            this.f2452c.abortAnimation();
            return;
        }
        this.f2455f = false;
        this.f2454e = true;
        recyclerView.consumePendingUpdateOperations();
        OverScroller overScroller = this.f2452c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i16 = currX - this.f2450a;
            int i17 = currY - this.f2451b;
            this.f2450a = currX;
            this.f2451b = currY;
            int iConsumeFlingInHorizontalStretch = recyclerView.consumeFlingInHorizontalStretch(i16);
            int iConsumeFlingInVerticalStretch = recyclerView.consumeFlingInVerticalStretch(i17);
            int[] iArr = recyclerView.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                int[] iArr2 = recyclerView.mReusableIntPair;
                iConsumeFlingInHorizontalStretch -= iArr2[0];
                iConsumeFlingInVerticalStretch -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
            }
            if (recyclerView.mAdapter != null) {
                int[] iArr3 = recyclerView.mReusableIntPair;
                iArr3[0] = 0;
                iArr3[1] = 0;
                recyclerView.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                int[] iArr4 = recyclerView.mReusableIntPair;
                int i18 = iArr4[0];
                int i19 = iArr4[1];
                int i21 = iConsumeFlingInHorizontalStretch - i18;
                int i22 = iConsumeFlingInVerticalStretch - i19;
                b2 b2Var = recyclerView.mLayout.mSmoothScroller;
                if (b2Var != null && !b2Var.isPendingInitialRun() && b2Var.isRunning()) {
                    int iB = recyclerView.mState.b();
                    if (iB == 0) {
                        b2Var.stop();
                    } else if (b2Var.getTargetPosition() >= iB) {
                        b2Var.setTargetPosition(iB - 1);
                        b2Var.onAnimation(i18, i19);
                    } else {
                        b2Var.onAnimation(i18, i19);
                    }
                }
                i11 = i21;
                i13 = i18;
                i12 = i22;
                i14 = i19;
            } else {
                i11 = iConsumeFlingInHorizontalStretch;
                i12 = iConsumeFlingInVerticalStretch;
                i13 = 0;
                i14 = 0;
            }
            if (!recyclerView.mItemDecorations.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr5 = recyclerView.mReusableIntPair;
            iArr5[0] = 0;
            iArr5[1] = 0;
            recyclerView.dispatchNestedScroll(i13, i14, i11, i12, null, 1, iArr5);
            int[] iArr6 = recyclerView.mReusableIntPair;
            int i23 = i11 - iArr6[0];
            int i24 = i12 - iArr6[1];
            if (i13 != 0 || i14 != 0) {
                recyclerView.dispatchOnScrolled(i13, i14);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i23 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i24 != 0));
            b2 b2Var2 = recyclerView.mLayout.mSmoothScroller;
            if ((b2Var2 == null || !b2Var2.isPendingInitialRun()) && z11) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i23 < 0) {
                        i15 = -currVelocity;
                    } else {
                        i15 = i23 > 0 ? currVelocity : 0;
                    }
                    if (i24 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i24 <= 0) {
                        currVelocity = 0;
                    }
                    recyclerView.absorbGlows(i15, currVelocity);
                }
                if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                    a0 a0Var = recyclerView.mPrefetchRegistry;
                    int[] iArr7 = a0Var.f2404c;
                    if (iArr7 != null) {
                        Arrays.fill(iArr7, -1);
                    }
                    a0Var.f2405d = 0;
                }
            } else {
                b();
                c0 c0Var = recyclerView.mGapWorker;
                if (c0Var != null) {
                    c0Var.a(recyclerView, i13, i14);
                }
            }
        }
        b2 b2Var3 = recyclerView.mLayout.mSmoothScroller;
        if (b2Var3 != null && b2Var3.isPendingInitialRun()) {
            b2Var3.onAnimation(0, 0);
        }
        this.f2454e = false;
        if (!this.f2455f) {
            recyclerView.setScrollState(0);
            recyclerView.stopNestedScroll(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = z4.s0.f58893a;
            recyclerView.postOnAnimation(this);
        }
    }
}
