package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b2 {
    private m1 mLayoutManager;
    private boolean mPendingInitialRun;
    private RecyclerView mRecyclerView;
    private final z1 mRecyclingAction;
    private boolean mRunning;
    private boolean mStarted;
    private int mTargetPosition = -1;
    private View mTargetView;

    public b2() {
        z1 z1Var = new z1();
        z1Var.f2683d = -1;
        z1Var.f2685f = false;
        z1Var.f2680a = 0;
        z1Var.f2681b = 0;
        z1Var.f2682c = Integer.MIN_VALUE;
        z1Var.f2684e = null;
        this.mRecyclingAction = z1Var;
    }

    public PointF computeScrollVectorForPosition(int i11) {
        Object layoutManager = getLayoutManager();
        if (layoutManager instanceof a2) {
            return ((a2) layoutManager).computeScrollVectorForPosition(i11);
        }
        return null;
    }

    public View findViewByPosition(int i11) {
        return this.mRecyclerView.mLayout.findViewByPosition(i11);
    }

    public int getChildCount() {
        return this.mRecyclerView.mLayout.getChildCount();
    }

    public int getChildPosition(View view) {
        return this.mRecyclerView.getChildLayoutPosition(view);
    }

    public m1 getLayoutManager() {
        return this.mLayoutManager;
    }

    public int getTargetPosition() {
        return this.mTargetPosition;
    }

    @Deprecated
    public void instantScrollToPosition(int i11) {
        this.mRecyclerView.scrollToPosition(i11);
    }

    public boolean isPendingInitialRun() {
        return this.mPendingInitialRun;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public void normalize(PointF pointF) {
        float f5 = pointF.x;
        float f11 = pointF.y;
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f5 * f5));
        pointF.x /= fSqrt;
        pointF.y /= fSqrt;
    }

    public void onAnimation(int i11, int i12) {
        PointF pointFComputeScrollVectorForPosition;
        RecyclerView recyclerView = this.mRecyclerView;
        if (this.mTargetPosition == -1 || recyclerView == null) {
            stop();
        }
        if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
            float f5 = pointFComputeScrollVectorForPosition.x;
            if (f5 != CropImageView.DEFAULT_ASPECT_RATIO || pointFComputeScrollVectorForPosition.y != CropImageView.DEFAULT_ASPECT_RATIO) {
                recyclerView.scrollStep((int) Math.signum(f5), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
            }
        }
        this.mPendingInitialRun = false;
        View view = this.mTargetView;
        if (view != null) {
            if (getChildPosition(view) == this.mTargetPosition) {
                onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                this.mRecyclingAction.a(recyclerView);
                stop();
            } else {
                this.mTargetView = null;
            }
        }
        if (this.mRunning) {
            onSeekTargetStep(i11, i12, recyclerView.mState, this.mRecyclingAction);
            z1 z1Var = this.mRecyclingAction;
            boolean z11 = z1Var.f2683d >= 0;
            z1Var.a(recyclerView);
            if (z11 && this.mRunning) {
                this.mPendingInitialRun = true;
                recyclerView.mViewFlinger.b();
            }
        }
    }

    public void onChildAttachedToWindow(View view) {
        if (getChildPosition(view) == getTargetPosition()) {
            this.mTargetView = view;
        }
    }

    public abstract void onSeekTargetStep(int i11, int i12, c2 c2Var, z1 z1Var);

    public abstract void onStart();

    public abstract void onStop();

    public abstract void onTargetFound(View view, c2 c2Var, z1 z1Var);

    public void setTargetPosition(int i11) {
        this.mTargetPosition = i11;
    }

    public void start(RecyclerView recyclerView, m1 m1Var) {
        f2 f2Var = recyclerView.mViewFlinger;
        f2Var.f2456t.removeCallbacks(f2Var);
        f2Var.f2452c.abortAnimation();
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = m1Var;
        int i11 = this.mTargetPosition;
        if (i11 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.mState.f2424a = i11;
        this.mRunning = true;
        this.mPendingInitialRun = true;
        this.mTargetView = findViewByPosition(getTargetPosition());
        onStart();
        this.mRecyclerView.mViewFlinger.b();
        this.mStarted = true;
    }

    public final void stop() {
        if (this.mRunning) {
            this.mRunning = false;
            onStop();
            this.mRecyclerView.mState.f2424a = -1;
            this.mTargetView = null;
            this.mTargetPosition = -1;
            this.mPendingInitialRun = false;
            this.mLayoutManager.onSmoothScrollerStopped(this);
            this.mLayoutManager = null;
            this.mRecyclerView = null;
        }
    }
}
