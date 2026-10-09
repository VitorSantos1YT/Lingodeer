package com.google.android.material.sidesheet;

import aj.uZCn.evRpcb;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l5.e;
import nv.p;
import ue.f;
import z4.j0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends l4.b implements Sheet<SideSheetCallback> {
    public int H;
    public e K;
    public boolean L;
    public final float M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public WeakReference R;
    public WeakReference S;
    public final int T;
    public VelocityTracker U;
    public MaterialSideContainerBackHelper V;
    public int W;
    public final LinkedHashSet X;
    public final com.bumptech.glide.d Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SheetDelegate f15353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialShapeDrawable f15354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f15355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ShapeAppearanceModel f15356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StateSettlingTracker f15357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f15358f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f15359t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class StateSettlingTracker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f15365c = new Runnable() { // from class: com.google.android.material.sidesheet.d
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.StateSettlingTracker stateSettlingTracker = this.f15376a;
                stateSettlingTracker.f15364b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                e eVar = sideSheetBehavior.K;
                if (eVar != null && eVar.h()) {
                    stateSettlingTracker.a(stateSettlingTracker.f15363a);
                } else if (sideSheetBehavior.H == 2) {
                    sideSheetBehavior.y(stateSettlingTracker.f15363a);
                }
            }
        };

        /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.material.sidesheet.d] */
        public StateSettlingTracker() {
        }

        public final void a(int i11) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference weakReference = sideSheetBehavior.R;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f15363a = i11;
            if (this.f15364b) {
                return;
            }
            ((View) sideSheetBehavior.R.get()).postOnAnimation(this.f15365c);
            this.f15364b = true;
        }
    }

    public SideSheetBehavior() {
        this.f15357e = new StateSettlingTracker();
        this.f15359t = true;
        this.H = 5;
        this.M = 0.1f;
        this.T = -1;
        this.X = new LinkedHashSet();
        this.Y = new com.bumptech.glide.d() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // com.bumptech.glide.d
            public final void D(int i11) {
                if (i11 == 1) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    if (sideSheetBehavior.f15359t) {
                        sideSheetBehavior.y(1);
                    }
                }
            }

            @Override // com.bumptech.glide.d
            public final void E(View view, int i11, int i12) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                WeakReference weakReference = sideSheetBehavior.S;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f15353a.p(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.X;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f15353a.b(i11);
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((SheetCallback) it.next()).getClass();
                }
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0053  */
            @Override // com.bumptech.glide.d
            public final void F(View view, float f5, float f11) {
                int i11;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (!sideSheetBehavior.f15353a.k(f5)) {
                    if (!sideSheetBehavior.f15353a.n(view, f5)) {
                        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO || Math.abs(f5) <= Math.abs(f11)) {
                            int left = view.getLeft();
                            i11 = Math.abs(left - sideSheetBehavior.f15353a.d()) < Math.abs(left - sideSheetBehavior.f15353a.e()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.f15353a.m(f5, f11) || sideSheetBehavior.f15353a.l(view)) {
                    }
                }
                sideSheetBehavior.A(view, i11, true);
            }

            @Override // com.bumptech.glide.d
            public final boolean M(View view, int i11) {
                WeakReference weakReference;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return (sideSheetBehavior.H == 1 || (weakReference = sideSheetBehavior.R) == null || weakReference.get() != view) ? false : true;
            }

            @Override // com.bumptech.glide.d
            public final int h(View view, int i11) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return f.n(i11, sideSheetBehavior.f15353a.g(), sideSheetBehavior.f15353a.f());
            }

            @Override // com.bumptech.glide.d
            public final int i(View view, int i11) {
                return view.getTop();
            }

            @Override // com.bumptech.glide.d
            public final int q(View view) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return sideSheetBehavior.N + sideSheetBehavior.Q;
            }
        };
    }

    public final void A(View view, int i11, boolean z11) {
        int iD;
        if (i11 == 3) {
            iD = this.f15353a.d();
        } else {
            if (i11 != 5) {
                throw new IllegalArgumentException(p.j(i11, "Invalid state to get outer edge offset: "));
            }
            iD = this.f15353a.e();
        }
        e eVar = this.K;
        if (eVar == null || (!z11 ? eVar.t(view, iD, view.getTop()) : eVar.r(iD, view.getTop()))) {
            y(i11);
        } else {
            y(2);
            this.f15357e.a(i11);
        }
    }

    public final void B() {
        View view;
        WeakReference weakReference = this.R;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        s0.n(view, 262144);
        s0.j(view, 0);
        s0.n(view, 1048576);
        s0.j(view, 0);
        int i11 = 5;
        if (this.H != 5) {
            s0.o(view, a5.c.f367n, null, new b(this, i11, 0));
        }
        int i12 = 3;
        if (this.H != 3) {
            s0.o(view, a5.c.f366l, null, new b(this, i12, 0));
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void a(f.a aVar) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.V;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.f14795f = aVar;
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public final void b(SideSheetDialog.AnonymousClass1 anonymousClass1) {
        this.X.add(anonymousClass1);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void c() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.V;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        f.a aVar = materialSideContainerBackHelper.f14795f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        materialSideContainerBackHelper.f14795f = null;
        int i11 = 5;
        if (aVar == null || Build.VERSION.SDK_INT < 34) {
            e(5);
            return;
        }
        SheetDelegate sheetDelegate = this.f15353a;
        if (sheetDelegate != null && sheetDelegate.j() != 0) {
            i11 = 3;
        }
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                sideSheetBehavior.y(5);
                WeakReference weakReference = sideSheetBehavior.R;
                if (weakReference == null || weakReference.get() == null) {
                    return;
                }
                ((View) sideSheetBehavior.R.get()).requestLayout();
            }
        };
        WeakReference weakReference = this.S;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int iC = this.f15353a.c(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f15372a.f15353a.o(marginLayoutParams, AnimationUtils.c(iC, valueAnimator.getAnimatedFraction(), 0));
                    view.requestLayout();
                }
            };
        }
        materialSideContainerBackHelper.b(aVar, i11, animatorListenerAdapter, animatorUpdateListener);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d(f.a aVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.V;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        SheetDelegate sheetDelegate = this.f15353a;
        int i11 = (sheetDelegate == null || sheetDelegate.j() == 0) ? 5 : 3;
        f.a aVar2 = materialSideContainerBackHelper.f14795f;
        materialSideContainerBackHelper.f14795f = aVar;
        if (aVar2 != null) {
            materialSideContainerBackHelper.c(aVar.f26117c, i11, aVar.f26118d == 0);
        }
        WeakReference weakReference = this.R;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.R.get();
        WeakReference weakReference2 = this.S;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f15353a.o(marginLayoutParams, (int) ((view.getScaleX() * this.N) + this.Q));
        view2.requestLayout();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public final void e(int i11) {
        if (i11 == 1 || i11 == 2) {
            throw new IllegalArgumentException(ep.a.k(new StringBuilder("STATE_"), i11 == 1 ? "DRAGGING" : "SETTLING", evRpcb.oBY));
        }
        WeakReference weakReference = this.R;
        if (weakReference == null || weakReference.get() == null) {
            y(i11);
            return;
        }
        View view = (View) this.R.get();
        b1.f fVar = new b1.f(this, i11, 1);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(fVar);
        } else {
            fVar.run();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void f() {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.V;
        if (materialSideContainerBackHelper == null) {
            return;
        }
        materialSideContainerBackHelper.a();
    }

    @Override // com.google.android.material.sidesheet.Sheet
    public final int getState() {
        return this.H;
    }

    @Override // l4.b
    public final void i(l4.e eVar) {
        this.R = null;
        this.K = null;
        this.V = null;
    }

    @Override // l4.b
    public final void l() {
        this.R = null;
        this.K = null;
        this.V = null;
    }

    @Override // l4.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && s0.f(view) == null) || !this.f15359t) {
            this.L = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.U) != null) {
            velocityTracker.recycle();
            this.U = null;
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.W = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.L) {
            this.L = false;
            return false;
        }
        return (this.L || (eVar = this.K) == null || !eVar.s(motionEvent)) ? false : true;
    }

    @Override // l4.b
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
        View view2;
        View view3;
        int i12;
        View viewFindViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.R;
        MaterialShapeDrawable materialShapeDrawable = this.f15354b;
        int iH = 0;
        if (weakReference == null) {
            this.R = new WeakReference(view);
            this.V = new MaterialSideContainerBackHelper(view);
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                float elevation = this.f15358f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                materialShapeDrawable.q(elevation);
            } else {
                ColorStateList colorStateList = this.f15355c;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = s0.f58893a;
                    j0.i(view, colorStateList);
                }
            }
            int i13 = this.H == 5 ? 4 : 0;
            if (view.getVisibility() != i13) {
                view.setVisibility(i13);
            }
            B();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (s0.f(view) == null) {
                s0.r(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i14 = Gravity.getAbsoluteGravity(((l4.e) view.getLayoutParams()).f39718c, i11) == 3 ? 1 : 0;
        SheetDelegate sheetDelegate = this.f15353a;
        if (sheetDelegate == null || sheetDelegate.j() != i14) {
            l4.e eVar = null;
            ShapeAppearanceModel shapeAppearanceModel = this.f15356d;
            if (i14 == 0) {
                this.f15353a = new RightSheetDelegate(this);
                if (shapeAppearanceModel != null) {
                    WeakReference weakReference2 = this.R;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof l4.e)) {
                        eVar = (l4.e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        ShapeAppearanceModel.Builder builderH = shapeAppearanceModel.h();
                        builderH.g(CropImageView.DEFAULT_ASPECT_RATIO);
                        builderH.e(CropImageView.DEFAULT_ASPECT_RATIO);
                        ShapeAppearanceModel shapeAppearanceModelA = builderH.a();
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA);
                        }
                    }
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalArgumentException(p0.h(i14, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f15353a = new LeftSheetDelegate(this);
                if (shapeAppearanceModel != null) {
                    WeakReference weakReference3 = this.R;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof l4.e)) {
                        eVar = (l4.e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        ShapeAppearanceModel.Builder builderH2 = shapeAppearanceModel.h();
                        builderH2.f(CropImageView.DEFAULT_ASPECT_RATIO);
                        builderH2.d(CropImageView.DEFAULT_ASPECT_RATIO);
                        ShapeAppearanceModel shapeAppearanceModelA2 = builderH2.a();
                        if (materialShapeDrawable != null) {
                            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA2);
                        }
                    }
                }
            }
        }
        if (this.K == null) {
            this.K = new e(coordinatorLayout.getContext(), coordinatorLayout, this.Y);
        }
        int iH2 = this.f15353a.h(view);
        coordinatorLayout.u(view, i11);
        this.O = coordinatorLayout.getWidth();
        this.P = this.f15353a.i(coordinatorLayout);
        this.N = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.Q = marginLayoutParams != null ? this.f15353a.a(marginLayoutParams) : 0;
        int i15 = this.H;
        if (i15 == 1 || i15 == 2) {
            iH = iH2 - this.f15353a.h(view);
        } else if (i15 != 3) {
            if (i15 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.H);
            }
            iH = this.f15353a.e();
        }
        WeakHashMap weakHashMap2 = s0.f58893a;
        view.offsetLeftAndRight(iH);
        if (this.S == null && (i12 = this.T) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.S = new WeakReference(viewFindViewById);
        }
        for (SheetCallback sheetCallback : this.X) {
        }
        return true;
    }

    @Override // l4.b
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i11, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i13, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // l4.b
    public final void t(View view, Parcelable parcelable) {
        int i11 = ((SavedState) parcelable).f15362c;
        if (i11 == 1 || i11 == 2) {
            i11 = 5;
        }
        this.H = i11;
    }

    @Override // l4.b
    public final Parcelable u(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // l4.b
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.H == 1 && actionMasked == 0) {
            return true;
        }
        if (z()) {
            this.K.l(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.U) != null) {
            velocityTracker.recycle();
            this.U = null;
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (z() && actionMasked == 2 && !this.L && z()) {
            float fAbs = Math.abs(this.W - motionEvent.getX());
            e eVar = this.K;
            if (fAbs > eVar.f39749b) {
                eVar.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.L;
    }

    public final void y(int i11) {
        View view;
        if (this.H == i11) {
            return;
        }
        this.H = i11;
        WeakReference weakReference = this.R;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i12 = this.H == 5 ? 4 : 0;
        if (view.getVisibility() != i12) {
            view.setVisibility(i12);
        }
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            ((SheetCallback) it.next()).a(i11);
        }
        B();
    }

    public final boolean z() {
        if (this.K != null) {
            return this.f15359t || this.H == 1;
        }
        return false;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState extends k5.b {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new SavedState[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f15362c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15362c = parcel.readInt();
        }

        @Override // k5.b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f15362c);
        }

        public SavedState(SideSheetBehavior sideSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f15362c = sideSheetBehavior.H;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f15357e = new StateSettlingTracker();
        this.f15359t = true;
        this.H = 5;
        this.M = 0.1f;
        this.T = -1;
        this.X = new LinkedHashSet();
        this.Y = new com.bumptech.glide.d() { // from class: com.google.android.material.sidesheet.SideSheetBehavior.1
            @Override // com.bumptech.glide.d
            public final void D(int i11) {
                if (i11 == 1) {
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    if (sideSheetBehavior.f15359t) {
                        sideSheetBehavior.y(1);
                    }
                }
            }

            @Override // com.bumptech.glide.d
            public final void E(View view, int i11, int i12) {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                WeakReference weakReference = sideSheetBehavior.S;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f15353a.p(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.X;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f15353a.b(i11);
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((SheetCallback) it.next()).getClass();
                }
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0053  */
            @Override // com.bumptech.glide.d
            public final void F(View view, float f5, float f11) {
                int i11;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (!sideSheetBehavior.f15353a.k(f5)) {
                    if (!sideSheetBehavior.f15353a.n(view, f5)) {
                        if (f5 == CropImageView.DEFAULT_ASPECT_RATIO || Math.abs(f5) <= Math.abs(f11)) {
                            int left = view.getLeft();
                            i11 = Math.abs(left - sideSheetBehavior.f15353a.d()) < Math.abs(left - sideSheetBehavior.f15353a.e()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.f15353a.m(f5, f11) || sideSheetBehavior.f15353a.l(view)) {
                    }
                }
                sideSheetBehavior.A(view, i11, true);
            }

            @Override // com.bumptech.glide.d
            public final boolean M(View view, int i11) {
                WeakReference weakReference;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return (sideSheetBehavior.H == 1 || (weakReference = sideSheetBehavior.R) == null || weakReference.get() != view) ? false : true;
            }

            @Override // com.bumptech.glide.d
            public final int h(View view, int i11) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return f.n(i11, sideSheetBehavior.f15353a.g(), sideSheetBehavior.f15353a.f());
            }

            @Override // com.bumptech.glide.d
            public final int i(View view, int i11) {
                return view.getTop();
            }

            @Override // com.bumptech.glide.d
            public final int q(View view) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                return sideSheetBehavior.N + sideSheetBehavior.Q;
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f13736d0);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f15355c = MaterialResources.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f15356d = ShapeAppearanceModel.d(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.T = resourceId;
            WeakReference weakReference = this.S;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.S = null;
            WeakReference weakReference2 = this.R;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        ShapeAppearanceModel shapeAppearanceModel = this.f15356d;
        if (shapeAppearanceModel != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            this.f15354b = materialShapeDrawable;
            materialShapeDrawable.n(context);
            ColorStateList colorStateList = this.f15355c;
            if (colorStateList != null) {
                this.f15354b.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f15354b.setTint(typedValue.data);
            }
        }
        this.f15358f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f15359t = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
