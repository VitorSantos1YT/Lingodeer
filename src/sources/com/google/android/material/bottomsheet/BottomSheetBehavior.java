package com.google.android.material.bottomsheet;

import a5.c;
import a5.k;
import a5.s;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.bumptech.glide.d;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l4.b;
import l5.e;
import nv.p;
import ue.f;
import z4.a;
import z4.j0;
import z4.s0;
import z4.s1;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends b implements MaterialBackHandler {
    public WeakReference A0;
    public WeakReference B0;
    public final ArrayList C0;
    public VelocityTracker D0;
    public MaterialBottomContainerBackHelper E0;
    public int F0;
    public int G0;
    public final int H;
    public boolean H0;
    public HashMap I0;
    public final SparseIntArray J0;
    public final MaterialShapeDrawable K;
    public final d K0;
    public final ColorStateList L;
    public final int M;
    public final int N;
    public int O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public int X;
    public int Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13970a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ShapeAppearanceModel f13971a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13972b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f13973b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13974c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final StateSettlingTracker f13975c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13976d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ValueAnimator f13977d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13978e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f13979e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13980f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f13981f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f13982g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final float f13983h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f13984i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final float f13985j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f13986k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f13987l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final boolean f13988m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final boolean f13989n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f13990o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f13991p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public e f13992q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f13993r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f13994s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13995t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f13996t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final float f13997u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f13998v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f13999w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f14000x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public WeakReference f14001y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public WeakReference f14002z0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class StateSettlingTracker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f14020c = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
            @Override // java.lang.Runnable
            public final void run() {
                StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                stateSettlingTracker.f14019b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                e eVar = bottomSheetBehavior.f13992q0;
                if (eVar != null && eVar.h()) {
                    stateSettlingTracker.a(stateSettlingTracker.f14018a);
                } else if (bottomSheetBehavior.f13991p0 == 2) {
                    bottomSheetBehavior.N(stateSettlingTracker.f14018a);
                }
            }
        };

        public StateSettlingTracker() {
        }

        public final void a(int i11) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference weakReference = bottomSheetBehavior.f14001y0;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f14018a = i11;
            if (this.f14019b) {
                return;
            }
            ((View) bottomSheetBehavior.f14001y0.get()).postOnAnimation(this.f14020c);
            this.f14019b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f13970a = 0;
        this.f13972b = true;
        this.M = -1;
        this.N = -1;
        this.f13975c0 = new StateSettlingTracker();
        this.f13983h0 = 0.5f;
        this.f13985j0 = -1.0f;
        this.f13988m0 = true;
        this.f13989n0 = true;
        this.f13991p0 = 4;
        this.f13997u0 = 0.1f;
        this.C0 = new ArrayList();
        this.G0 = -1;
        this.J0 = new SparseIntArray();
        this.K0 = new d() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // com.bumptech.glide.d
            public final void D(int i11) {
                if (i11 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f13988m0) {
                        bottomSheetBehavior.N(1);
                    }
                }
            }

            @Override // com.bumptech.glide.d
            public final void E(View view, int i11, int i12) {
                BottomSheetBehavior.this.C(i12);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x004c  */
            /* JADX WARN: Code duplicated, block: B:34:0x0085  */
            /* JADX WARN: Code duplicated, block: B:6:0x000d  */
            @Override // com.bumptech.glide.d
            public final void F(View view, float f5, float f11) {
                int i11 = 6;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    if (bottomSheetBehavior.f13972b) {
                        i11 = 3;
                    } else {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f13982g0) {
                            i11 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.f13986k0 && bottomSheetBehavior.O(view, f11)) {
                    if (Math.abs(f5) >= Math.abs(f11) || f11 <= bottomSheetBehavior.f13976d) {
                        if (view.getTop() > (bottomSheetBehavior.G() + bottomSheetBehavior.f14000x0) / 2) {
                            i11 = 5;
                        } else if (bottomSheetBehavior.f13972b || Math.abs(view.getTop() - bottomSheetBehavior.G()) < Math.abs(view.getTop() - bottomSheetBehavior.f13982g0)) {
                            i11 = 3;
                        }
                    } else {
                        i11 = 5;
                    }
                } else if (f11 == CropImageView.DEFAULT_ASPECT_RATIO || Math.abs(f5) > Math.abs(f11)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f13972b) {
                        int i12 = bottomSheetBehavior.f13982g0;
                        if (top2 < i12) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f13984i0)) {
                                i11 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i12) < Math.abs(top2 - bottomSheetBehavior.f13984i0)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i11 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f13981f0) < Math.abs(top2 - bottomSheetBehavior.f13984i0)) {
                        i11 = 3;
                    } else {
                        i11 = 4;
                    }
                } else if (bottomSheetBehavior.f13972b) {
                    i11 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f13982g0) < Math.abs(top3 - bottomSheetBehavior.f13984i0)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i11 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.P(view, i11, true);
            }

            @Override // com.bumptech.glide.d
            public final boolean M(View view, int i11) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i12 = bottomSheetBehavior.f13991p0;
                if (i12 == 1 || bottomSheetBehavior.H0) {
                    return false;
                }
                if (i12 == 3 && bottomSheetBehavior.F0 == i11) {
                    WeakReference weakReference = bottomSheetBehavior.B0;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                SystemClock.uptimeMillis();
                WeakReference weakReference2 = bottomSheetBehavior.f14001y0;
                return weakReference2 != null && weakReference2.get() == view;
            }

            @Override // com.bumptech.glide.d
            public final int h(View view, int i11) {
                return view.getLeft();
            }

            @Override // com.bumptech.glide.d
            public final int i(View view, int i11) {
                return f.n(i11, BottomSheetBehavior.this.G(), r());
            }

            @Override // com.bumptech.glide.d
            public final int r() {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.f13986k0 ? bottomSheetBehavior.f14000x0 : bottomSheetBehavior.f13984i0;
            }
        };
    }

    public static View D(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewD = D(viewGroup.getChildAt(i11));
            if (viewD != null) {
                return viewD;
            }
        }
        return null;
    }

    public static int F(int i11, int i12, int i13, int i14) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i12, i14);
        if (i13 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i13), 1073741824);
        }
        if (size != 0) {
            i13 = Math.min(size, i13);
        }
        return View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
    }

    public final int A() {
        int i11;
        if (this.f13980f) {
            return Math.min(Math.max(this.f13995t, this.f14000x0 - ((this.f13999w0 * 9) / 16)), this.f13998v0) + this.X;
        }
        return (this.P || this.Q || (i11 = this.O) <= 0) ? this.f13978e + this.X : Math.max(this.f13978e, i11 + this.H);
    }

    public final void B(View view, int i11) {
        if (view == null) {
            return;
        }
        s0.n(view, 524288);
        s0.j(view, 0);
        s0.n(view, 262144);
        s0.j(view, 0);
        s0.n(view, 1048576);
        s0.j(view, 0);
        SparseIntArray sparseIntArray = this.J0;
        int i12 = sparseIntArray.get(i11, -1);
        if (i12 != -1) {
            s0.n(view, i12);
            s0.j(view, 0);
            sparseIntArray.delete(i11);
        }
    }

    public final void C(int i11) {
        View view = (View) this.f14001y0.get();
        if (view != null) {
            ArrayList arrayList = this.C0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i12 = this.f13984i0;
            if (i11 <= i12 && i12 != G()) {
                G();
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((BottomSheetCallback) arrayList.get(i13)).b(view);
            }
        }
    }

    public final int G() {
        if (this.f13972b) {
            return this.f13981f0;
        }
        return Math.max(this.f13979e0, this.T ? 0 : this.Y);
    }

    public final int H(int i11) {
        if (i11 == 3) {
            return G();
        }
        if (i11 == 4) {
            return this.f13984i0;
        }
        if (i11 == 5) {
            return this.f14000x0;
        }
        if (i11 == 6) {
            return this.f13982g0;
        }
        throw new IllegalArgumentException(p.j(i11, "Invalid state to get top offset: "));
    }

    public final boolean I() {
        WeakReference weakReference = this.f14001y0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f14001y0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void J() {
        this.F0 = -1;
        this.G0 = -1;
        VelocityTracker velocityTracker = this.D0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.D0 = null;
        }
    }

    public final void K(BottomSheetDragHandleView bottomSheetDragHandleView) {
        WeakReference weakReference;
        if (bottomSheetDragHandleView != null || (weakReference = this.f14002z0) == null) {
            this.f14002z0 = new WeakReference(bottomSheetDragHandleView);
            R(bottomSheetDragHandleView, 1);
        } else {
            B((View) weakReference.get(), 1);
            this.f14002z0 = null;
        }
    }

    public final void L(boolean z11) {
        if (this.f13986k0 != z11) {
            this.f13986k0 = z11;
            if (!z11 && this.f13991p0 == 5) {
                e(4);
            }
            Q();
        }
    }

    public final void M(int i11) {
        if (i11 == -1) {
            if (this.f13980f) {
                return;
            } else {
                this.f13980f = true;
            }
        } else {
            if (!this.f13980f && this.f13978e == i11) {
                return;
            }
            this.f13980f = false;
            this.f13978e = Math.max(0, i11);
        }
        U();
    }

    public final void N(int i11) {
        View view;
        if (this.f13991p0 == i11) {
            return;
        }
        this.f13991p0 = i11;
        if (i11 != 4 && i11 != 3 && i11 != 6) {
            boolean z11 = this.f13986k0;
        }
        WeakReference weakReference = this.f14001y0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i12 = 0;
        if (i11 == 3) {
            T(true);
        } else if (i11 == 6 || i11 == 5 || i11 == 4) {
            T(false);
        }
        S(i11, true);
        while (true) {
            ArrayList arrayList = this.C0;
            if (i12 >= arrayList.size()) {
                Q();
                return;
            } else {
                ((BottomSheetCallback) arrayList.get(i12)).c(view, i11);
                i12++;
            }
        }
    }

    public final boolean O(View view, float f5) {
        if (this.f13987l0) {
            return true;
        }
        if (view.getTop() < this.f13984i0) {
            return false;
        }
        return Math.abs(((f5 * this.f13997u0) + ((float) view.getTop())) - ((float) this.f13984i0)) / ((float) A()) > 0.5f;
    }

    public final void P(View view, int i11, boolean z11) {
        int iH = H(i11);
        e eVar = this.f13992q0;
        if (eVar == null || (!z11 ? eVar.t(view, view.getLeft(), iH) : eVar.r(view.getLeft(), iH))) {
            N(i11);
            return;
        }
        N(2);
        S(i11, true);
        this.f13975c0.a(i11);
    }

    public final void Q() {
        WeakReference weakReference = this.f14001y0;
        if (weakReference != null) {
            R((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f14002z0;
        if (weakReference2 != null) {
            R((View) weakReference2.get(), 1);
        }
    }

    public final void R(View view, int i11) {
        int iA;
        int i12;
        if (view == null) {
            return;
        }
        B(view, i11);
        final int i13 = 6;
        if (!this.f13972b && this.f13991p0 != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            s sVar = new s() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // a5.s
                public final boolean perform(View view2, k kVar) {
                    BottomSheetBehavior.this.e(i13);
                    return true;
                }
            };
            ArrayList arrayListG = s0.g(view);
            int i14 = 0;
            while (true) {
                if (i14 >= arrayListG.size()) {
                    int i15 = 0;
                    int i16 = -1;
                    while (true) {
                        int[] iArr = s0.f58896d;
                        if (i15 >= 32 || i16 != -1) {
                            break;
                        }
                        int i17 = iArr[i15];
                        boolean z11 = true;
                        for (int i18 = 0; i18 < arrayListG.size(); i18++) {
                            z11 &= ((c) arrayListG.get(i18)).a() != i17;
                        }
                        if (z11) {
                            i16 = i17;
                        }
                        i15++;
                    }
                    iA = i16;
                    break;
                }
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c) arrayListG.get(i14)).f373a).getLabel())) {
                    iA = ((c) arrayListG.get(i14)).a();
                    break;
                }
                i14++;
            }
            if (iA != -1) {
                i12 = iA;
                c cVar = new c(null, i12, string, sVar, null);
                View.AccessibilityDelegate accessibilityDelegateE = s0.e(view);
                z4.b bVar = accessibilityDelegateE == null ? null : accessibilityDelegateE instanceof a ? ((a) accessibilityDelegateE).f58803a : new z4.b(accessibilityDelegateE);
                if (bVar == null) {
                    bVar = new z4.b();
                }
                s0.q(view, bVar);
                s0.n(view, cVar.a());
                s0.g(view).add(cVar);
                s0.j(view, 0);
            } else {
                i12 = iA;
            }
            this.J0.put(i11, i12);
        }
        if (this.f13986k0) {
            final int i19 = 5;
            if (this.f13991p0 != 5) {
                s0.o(view, c.f367n, null, new s() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                    @Override // a5.s
                    public final boolean perform(View view2, k kVar) {
                        BottomSheetBehavior.this.e(i19);
                        return true;
                    }
                });
            }
        }
        int i21 = this.f13991p0;
        final int i22 = 4;
        final int i23 = 3;
        if (i21 == 3) {
            i13 = this.f13972b ? 4 : 6;
            s0.o(view, c.m, null, new s() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // a5.s
                public final boolean perform(View view2, k kVar) {
                    BottomSheetBehavior.this.e(i13);
                    return true;
                }
            });
        } else if (i21 == 4) {
            i13 = this.f13972b ? 3 : 6;
            s0.o(view, c.f366l, null, new s() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // a5.s
                public final boolean perform(View view2, k kVar) {
                    BottomSheetBehavior.this.e(i13);
                    return true;
                }
            });
        } else {
            if (i21 != 6) {
                return;
            }
            s0.o(view, c.m, null, new s() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // a5.s
                public final boolean perform(View view2, k kVar) {
                    BottomSheetBehavior.this.e(i22);
                    return true;
                }
            });
            s0.o(view, c.f366l, null, new s() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
                @Override // a5.s
                public final boolean perform(View view2, k kVar) {
                    BottomSheetBehavior.this.e(i23);
                    return true;
                }
            });
        }
    }

    public final void S(int i11, boolean z11) {
        MaterialShapeDrawable materialShapeDrawable;
        if (i11 == 2) {
            return;
        }
        boolean z12 = this.f13991p0 == 3 && (this.Z || I());
        if (this.f13973b0 == z12 || (materialShapeDrawable = this.K) == null) {
            return;
        }
        this.f13973b0 = z12;
        ValueAnimator valueAnimator = this.f13977d0;
        if (!z11 || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            materialShapeDrawable.s(this.f13973b0 ? z() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(materialShapeDrawable.f15200b.f15223j, z12 ? z() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void T(boolean z11) {
        WeakReference weakReference = this.f14001y0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z11) {
                if (this.I0 != null) {
                    return;
                } else {
                    this.I0 = new HashMap(childCount);
                }
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (childAt != this.f14001y0.get() && z11) {
                    this.I0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z11) {
                return;
            }
            this.I0 = null;
        }
    }

    public final void U() {
        View view;
        if (this.f14001y0 != null) {
            y();
            if (this.f13991p0 != 4 || (view = (View) this.f14001y0.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void a(f.a aVar) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.E0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        materialBottomContainerBackHelper.f14795f = aVar;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void c() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.E0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        f.a aVar = materialBottomContainerBackHelper.f14795f;
        materialBottomContainerBackHelper.f14795f = null;
        if (aVar == null || Build.VERSION.SDK_INT < 34) {
            e(this.f13986k0 ? 5 : 4);
            return;
        }
        if (this.f13986k0) {
            materialBottomContainerBackHelper.b(aVar, new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    bottomSheetBehavior.N(5);
                    WeakReference weakReference = bottomSheetBehavior.f14001y0;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    ((View) bottomSheetBehavior.f14001y0.get()).requestLayout();
                }
            });
            return;
        }
        AnimatorSet animatorSetA = materialBottomContainerBackHelper.a();
        animatorSetA.setDuration(AnimationUtils.c(materialBottomContainerBackHelper.f14792c, aVar.f26117c, materialBottomContainerBackHelper.f14793d));
        animatorSetA.start();
        e(4);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d(f.a aVar) {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.E0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        f.a aVar2 = materialBottomContainerBackHelper.f14795f;
        materialBottomContainerBackHelper.f14795f = aVar;
        if (aVar2 == null) {
            return;
        }
        materialBottomContainerBackHelper.c(aVar.f26117c);
    }

    public final void e(int i11) {
        if (i11 == 1 || i11 == 2) {
            throw new IllegalArgumentException(ep.a.k(new StringBuilder("STATE_"), i11 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.f13986k0 || i11 != 5) {
            final int i12 = (i11 == 6 && this.f13972b && H(i11) <= this.f13981f0) ? 3 : i11;
            WeakReference weakReference = this.f14001y0;
            if (weakReference == null || weakReference.get() == null) {
                N(i11);
                return;
            }
            final View view = (View) this.f14001y0.get();
            Runnable runnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public final void run() {
                    BottomSheetBehavior.this.P(view, i12, false);
                }
            };
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void f() {
        MaterialBottomContainerBackHelper materialBottomContainerBackHelper = this.E0;
        if (materialBottomContainerBackHelper == null) {
            return;
        }
        f.a aVar = materialBottomContainerBackHelper.f14795f;
        materialBottomContainerBackHelper.f14795f = null;
        if (aVar == null) {
            return;
        }
        AnimatorSet animatorSetA = materialBottomContainerBackHelper.a();
        animatorSetA.setDuration(materialBottomContainerBackHelper.f14794e);
        animatorSetA.start();
    }

    @Override // l4.b
    public final void i(l4.e eVar) {
        this.f14001y0 = null;
        this.f13992q0 = null;
        this.E0 = null;
    }

    @Override // l4.b
    public final void l() {
        this.f14001y0 = null;
        this.f13992q0 = null;
        this.E0 = null;
    }

    @Override // l4.b
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i11;
        e eVar;
        if (!view.isShown() || !this.f13988m0) {
            this.f13993r0 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            J();
        }
        if (this.D0 == null) {
            this.D0 = VelocityTracker.obtain();
        }
        this.D0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x11 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            this.G0 = y10;
            if (this.f13991p0 != 2) {
                WeakReference weakReference = this.B0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.s(view2, x11, y10)) {
                    this.F0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    int i12 = this.G0;
                    WeakReference weakReference2 = this.A0;
                    View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view3 == null || !coordinatorLayout.s(view3, x11, i12)) {
                        this.H0 = true;
                    }
                }
            }
            this.f13993r0 = this.F0 == -1 && !coordinatorLayout.s(view, x11, this.G0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.H0 = false;
            this.F0 = -1;
            if (this.f13993r0) {
                this.f13993r0 = false;
                return false;
            }
        }
        if (this.f13993r0 || (eVar = this.f13992q0) == null || !eVar.s(motionEvent)) {
            WeakReference weakReference3 = this.B0;
            View view4 = weakReference3 != null ? (View) weakReference3.get() : null;
            if (actionMasked != 2 || view4 == null || this.f13993r0 || this.f13991p0 == 1 || coordinatorLayout.s(view4, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f13992q0 == null || (i11 = this.G0) == -1 || Math.abs(i11 - motionEvent.getY()) <= this.f13992q0.f39749b) {
                return false;
            }
        }
        return true;
    }

    @Override // l4.b
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i11) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i12 = 0;
        if (this.f14001y0 == null) {
            this.f13995t = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            final boolean z11 = (Build.VERSION.SDK_INT < 29 || this.P || this.f13980f) ? false : true;
            if (this.Q || this.R || this.S || this.U || this.V || this.W || z11) {
                ViewUtils.b(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
                    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                    public final v1 a(View view2, v1 v1Var, ViewUtils.RelativePadding relativePadding) {
                        boolean z12;
                        s1 s1Var = v1Var.f58905a;
                        r4.d dVarG = s1Var.g(519);
                        r4.d dVarG2 = s1Var.g(32);
                        int i13 = dVarG.f48794b;
                        int i14 = dVarG.f48795c;
                        int i15 = dVarG.f48793a;
                        BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                        bottomSheetBehavior.Y = i13;
                        boolean zG = ViewUtils.g(view2);
                        int paddingBottom = view2.getPaddingBottom();
                        int paddingLeft = view2.getPaddingLeft();
                        int paddingRight = view2.getPaddingRight();
                        boolean z13 = bottomSheetBehavior.Q;
                        if (z13) {
                            int iA = v1Var.a();
                            bottomSheetBehavior.X = iA;
                            paddingBottom = iA + relativePadding.f14752d;
                        }
                        if (bottomSheetBehavior.R) {
                            paddingLeft = (zG ? relativePadding.f14751c : relativePadding.f14749a) + i15;
                        }
                        if (bottomSheetBehavior.S) {
                            paddingRight = (zG ? relativePadding.f14749a : relativePadding.f14751c) + i14;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        boolean z14 = true;
                        if (!bottomSheetBehavior.U || marginLayoutParams.leftMargin == i15) {
                            z12 = false;
                        } else {
                            marginLayoutParams.leftMargin = i15;
                            z12 = true;
                        }
                        if (bottomSheetBehavior.V && marginLayoutParams.rightMargin != i14) {
                            marginLayoutParams.rightMargin = i14;
                            z12 = true;
                        }
                        if (bottomSheetBehavior.W) {
                            int i16 = marginLayoutParams.topMargin;
                            int i17 = dVarG.f48794b;
                            if (i16 != i17) {
                                marginLayoutParams.topMargin = i17;
                            } else {
                                z14 = z12;
                            }
                        } else {
                            z14 = z12;
                        }
                        if (z14) {
                            view2.setLayoutParams(marginLayoutParams);
                        }
                        view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                        boolean z15 = z11;
                        if (z15) {
                            bottomSheetBehavior.O = dVarG2.f48796d;
                        }
                        if (!z13 && !z15) {
                            return v1Var;
                        }
                        bottomSheetBehavior.U();
                        return v1Var;
                    }
                });
            }
            s0.s(view, new InsetsAnimationCallback(view));
            this.f14001y0 = new WeakReference(view);
            this.E0 = new MaterialBottomContainerBackHelper(view);
            MaterialShapeDrawable materialShapeDrawable = this.K;
            if (materialShapeDrawable != null) {
                view.setBackground(materialShapeDrawable);
                float elevation = this.f13985j0;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                materialShapeDrawable.q(elevation);
            } else {
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    j0.i(view, colorStateList);
                }
            }
            Q();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f13992q0 == null) {
            this.f13992q0 = new e(coordinatorLayout.getContext(), coordinatorLayout, this.K0);
        }
        int top = view.getTop();
        coordinatorLayout.u(view, i11);
        this.f13999w0 = coordinatorLayout.getWidth();
        this.f14000x0 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f13998v0 = height;
        int iMin = this.f14000x0;
        int i13 = iMin - height;
        int i14 = this.Y;
        if (i13 < i14) {
            boolean z12 = this.T;
            int i15 = this.N;
            if (z12) {
                if (i15 != -1) {
                    iMin = Math.min(iMin, i15);
                }
                this.f13998v0 = iMin;
            } else {
                int iMin2 = iMin - i14;
                if (i15 != -1) {
                    iMin2 = Math.min(iMin2, i15);
                }
                this.f13998v0 = iMin2;
            }
        }
        this.f13981f0 = Math.max(0, this.f14000x0 - this.f13998v0);
        this.f13982g0 = (int) ((1.0f - this.f13983h0) * this.f14000x0);
        y();
        int i16 = this.f13991p0;
        if (i16 == 3) {
            int iG = G();
            WeakHashMap weakHashMap = s0.f58893a;
            view.offsetTopAndBottom(iG);
        } else if (i16 == 6) {
            int i17 = this.f13982g0;
            WeakHashMap weakHashMap2 = s0.f58893a;
            view.offsetTopAndBottom(i17);
        } else if (this.f13986k0 && i16 == 5) {
            int i18 = this.f14000x0;
            WeakHashMap weakHashMap3 = s0.f58893a;
            view.offsetTopAndBottom(i18);
        } else if (i16 == 4) {
            int i19 = this.f13984i0;
            WeakHashMap weakHashMap4 = s0.f58893a;
            view.offsetTopAndBottom(i19);
        } else if (i16 == 1 || i16 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap5 = s0.f58893a;
            view.offsetTopAndBottom(top2);
        }
        S(this.f13991p0, false);
        this.B0 = new WeakReference(D(view));
        while (true) {
            ArrayList arrayList = this.C0;
            if (i12 >= arrayList.size()) {
                return true;
            }
            ((BottomSheetCallback) arrayList.get(i12)).a(view);
            i12++;
        }
    }

    @Override // l4.b
    public final boolean o(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(F(i11, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, this.M, marginLayoutParams.width), F(i13, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.N, marginLayoutParams.height));
        return true;
    }

    @Override // l4.b
    public final boolean p(View view) {
        WeakReference weakReference = this.B0;
        return (weakReference == null || view != weakReference.get() || this.f13991p0 == 3 || this.f13990o0) ? false : true;
    }

    @Override // l4.b
    public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 1) {
            return;
        }
        WeakReference weakReference = this.B0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i14 = top - i12;
        boolean z11 = this.f13988m0;
        boolean z12 = this.f13989n0;
        if (i12 > 0) {
            if (!this.f13996t0 && !z12 && view2 == view3 && view2.canScrollVertically(1)) {
                this.f13990o0 = true;
                return;
            }
            if (i14 < G()) {
                int iG = top - G();
                iArr[1] = iG;
                WeakHashMap weakHashMap = s0.f58893a;
                view.offsetTopAndBottom(-iG);
                N(3);
            } else {
                if (!z11) {
                    return;
                }
                iArr[1] = i12;
                WeakHashMap weakHashMap2 = s0.f58893a;
                view.offsetTopAndBottom(-i12);
                N(1);
            }
        } else if (i12 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.f13996t0 && !z12 && view2 == view3 && zCanScrollVertically) {
                this.f13990o0 = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i15 = this.f13984i0;
                if (i14 > i15 && !this.f13986k0) {
                    int i16 = top - i15;
                    iArr[1] = i16;
                    WeakHashMap weakHashMap3 = s0.f58893a;
                    view.offsetTopAndBottom(-i16);
                    N(4);
                } else {
                    if (!z11) {
                        return;
                    }
                    iArr[1] = i12;
                    WeakHashMap weakHashMap4 = s0.f58893a;
                    view.offsetTopAndBottom(-i12);
                    N(1);
                }
            }
        }
        C(view.getTop());
        this.f13994s0 = i12;
        this.f13996t0 = true;
        this.f13990o0 = false;
    }

    @Override // l4.b
    public final void r(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int[] iArr) {
    }

    @Override // l4.b
    public final void t(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i11 = this.f13970a;
        if (i11 != 0) {
            if (i11 == -1 || (i11 & 1) == 1) {
                this.f13978e = savedState.f14014d;
            }
            if (i11 == -1 || (i11 & 2) == 2) {
                this.f13972b = savedState.f14015e;
            }
            if (i11 == -1 || (i11 & 4) == 4) {
                this.f13986k0 = savedState.f14016f;
            }
            if (i11 == -1 || (i11 & 8) == 8) {
                this.f13987l0 = savedState.f14017t;
            }
        }
        int i12 = savedState.f14013c;
        if (i12 == 1 || i12 == 2) {
            this.f13991p0 = 4;
        } else {
            this.f13991p0 = i12;
        }
    }

    @Override // l4.b
    public final Parcelable u(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // l4.b
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
        this.f13994s0 = 0;
        this.f13996t0 = false;
        return (i11 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    @Override // l4.b
    public final void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i11) {
        int top;
        int top2;
        int i12;
        float yVelocity;
        int i13 = 3;
        if (view.getTop() == G()) {
            N(3);
            return;
        }
        WeakReference weakReference = this.B0;
        if (weakReference != null && view2 == weakReference.get() && this.f13996t0) {
            if (this.f13994s0 > 0) {
                if (!this.f13972b && view.getTop() > this.f13982g0) {
                    i13 = 6;
                }
            } else if (this.f13986k0) {
                VelocityTracker velocityTracker = this.D0;
                if (velocityTracker == null) {
                    yVelocity = CropImageView.DEFAULT_ASPECT_RATIO;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f13974c);
                    yVelocity = this.D0.getYVelocity(this.F0);
                }
                if (O(view, yVelocity)) {
                    i13 = 5;
                } else if (this.f13994s0 == 0) {
                    top2 = view.getTop();
                    if (this.f13972b) {
                        i12 = this.f13982g0;
                        if (top2 < i12) {
                            if (top2 >= Math.abs(top2 - this.f13984i0)) {
                            }
                        } else if (Math.abs(top2 - i12) < Math.abs(top2 - this.f13984i0)) {
                            i13 = 4;
                        }
                        i13 = 6;
                    } else if (Math.abs(top2 - this.f13981f0) >= Math.abs(top2 - this.f13984i0)) {
                        i13 = 4;
                    }
                } else {
                    if (!this.f13972b) {
                        top = view.getTop();
                        if (Math.abs(top - this.f13982g0) < Math.abs(top - this.f13984i0)) {
                            i13 = 6;
                        }
                    }
                    i13 = 4;
                }
            } else if (this.f13994s0 == 0) {
                top2 = view.getTop();
                if (this.f13972b) {
                    i12 = this.f13982g0;
                    if (top2 < i12) {
                        if (top2 >= Math.abs(top2 - this.f13984i0)) {
                        }
                    } else if (Math.abs(top2 - i12) < Math.abs(top2 - this.f13984i0)) {
                        i13 = 4;
                    }
                    i13 = 6;
                } else if (Math.abs(top2 - this.f13981f0) >= Math.abs(top2 - this.f13984i0)) {
                    i13 = 4;
                }
            } else {
                if (!this.f13972b) {
                    top = view.getTop();
                    if (Math.abs(top - this.f13982g0) < Math.abs(top - this.f13984i0)) {
                        i13 = 6;
                    }
                }
                i13 = 4;
            }
            P(view, i13, false);
            this.f13996t0 = false;
        }
    }

    @Override // l4.b
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i11 = this.f13991p0;
        if (i11 == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f13992q0;
        if (eVar != null && (this.f13988m0 || i11 == 1)) {
            eVar.l(motionEvent);
        }
        if (actionMasked == 0) {
            J();
        }
        if (this.D0 == null) {
            this.D0 = VelocityTracker.obtain();
        }
        this.D0.addMovement(motionEvent);
        if (this.f13992q0 != null && ((this.f13988m0 || this.f13991p0 == 1) && actionMasked == 2 && !this.f13993r0)) {
            float fAbs = Math.abs(this.G0 - motionEvent.getY());
            e eVar2 = this.f13992q0;
            if (fAbs > eVar2.f39749b) {
                eVar2.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f13993r0;
    }

    public final void y() {
        int iA = A();
        if (this.f13972b) {
            this.f13984i0 = Math.max(this.f14000x0 - iA, this.f13981f0);
        } else {
            this.f13984i0 = this.f14000x0 - iA;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public final float z() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f5;
        MaterialShapeDrawable materialShapeDrawable = this.K;
        float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (materialShapeDrawable != null && (weakReference = this.f14001y0) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f14001y0.get();
            if (I() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float fL = this.K.l();
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    if (radius <= CropImageView.DEFAULT_ASPECT_RATIO || fL <= CropImageView.DEFAULT_ASPECT_RATIO) {
                        f5 = 0.0f;
                    } else {
                        f5 = radius / fL;
                    }
                } else {
                    f5 = 0.0f;
                }
                MaterialShapeDrawable materialShapeDrawable2 = this.K;
                float[] fArr = materialShapeDrawable2.f15207e0;
                float fA = fArr != null ? fArr[0] : materialShapeDrawable2.f15200b.f15214a.f15250f.a(materialShapeDrawable2.h());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > CropImageView.DEFAULT_ASPECT_RATIO && fA > CropImageView.DEFAULT_ASPECT_RATIO) {
                        f11 = radius2 / fA;
                    }
                }
                return Math.max(f5, f11);
            }
        }
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public static BottomSheetBehavior E(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof l4.e) {
            b bVar = ((l4.e) layoutParams).f39716a;
            if (bVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) bVar;
            }
            throw new IllegalArgumentException(bjXGJ.UAsMyexcjFKx);
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState extends k5.b {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
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
        public final int f14013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f14014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f14015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f14016f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f14017t;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14013c = parcel.readInt();
            this.f14014d = parcel.readInt();
            this.f14015e = parcel.readInt() == 1;
            this.f14016f = parcel.readInt() == 1;
            this.f14017t = parcel.readInt() == 1;
        }

        @Override // k5.b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f14013c);
            parcel.writeInt(this.f14014d);
            parcel.writeInt(this.f14015e ? 1 : 0);
            parcel.writeInt(this.f14016f ? 1 : 0);
            parcel.writeInt(this.f14017t ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.f14013c = bottomSheetBehavior.f13991p0;
            this.f14014d = bottomSheetBehavior.f13978e;
            this.f14015e = bottomSheetBehavior.f13972b;
            this.f14016f = bottomSheetBehavior.f13986k0;
            this.f14017t = bottomSheetBehavior.f13987l0;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i11;
        this.f13970a = 0;
        this.f13972b = true;
        this.M = -1;
        this.N = -1;
        this.f13975c0 = new StateSettlingTracker();
        this.f13983h0 = 0.5f;
        this.f13985j0 = -1.0f;
        this.f13988m0 = true;
        this.f13989n0 = true;
        this.f13991p0 = 4;
        this.f13997u0 = 0.1f;
        this.C0 = new ArrayList();
        this.G0 = -1;
        this.J0 = new SparseIntArray();
        this.K0 = new d() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // com.bumptech.glide.d
            public final void D(int i12) {
                if (i12 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.f13988m0) {
                        bottomSheetBehavior.N(1);
                    }
                }
            }

            @Override // com.bumptech.glide.d
            public final void E(View view, int i12, int i13) {
                BottomSheetBehavior.this.C(i13);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x004c  */
            /* JADX WARN: Code duplicated, block: B:34:0x0085  */
            /* JADX WARN: Code duplicated, block: B:6:0x000d  */
            @Override // com.bumptech.glide.d
            public final void F(View view, float f5, float f11) {
                int i12 = 6;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    if (bottomSheetBehavior.f13972b) {
                        i12 = 3;
                    } else {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f13982g0) {
                            i12 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.f13986k0 && bottomSheetBehavior.O(view, f11)) {
                    if (Math.abs(f5) >= Math.abs(f11) || f11 <= bottomSheetBehavior.f13976d) {
                        if (view.getTop() > (bottomSheetBehavior.G() + bottomSheetBehavior.f14000x0) / 2) {
                            i12 = 5;
                        } else if (bottomSheetBehavior.f13972b || Math.abs(view.getTop() - bottomSheetBehavior.G()) < Math.abs(view.getTop() - bottomSheetBehavior.f13982g0)) {
                            i12 = 3;
                        }
                    } else {
                        i12 = 5;
                    }
                } else if (f11 == CropImageView.DEFAULT_ASPECT_RATIO || Math.abs(f5) > Math.abs(f11)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f13972b) {
                        int i13 = bottomSheetBehavior.f13982g0;
                        if (top2 < i13) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.f13984i0)) {
                                i12 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i13) < Math.abs(top2 - bottomSheetBehavior.f13984i0)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i12 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f13981f0) < Math.abs(top2 - bottomSheetBehavior.f13984i0)) {
                        i12 = 3;
                    } else {
                        i12 = 4;
                    }
                } else if (bottomSheetBehavior.f13972b) {
                    i12 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f13982g0) < Math.abs(top3 - bottomSheetBehavior.f13984i0)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i12 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.P(view, i12, true);
            }

            @Override // com.bumptech.glide.d
            public final boolean M(View view, int i12) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i13 = bottomSheetBehavior.f13991p0;
                if (i13 == 1 || bottomSheetBehavior.H0) {
                    return false;
                }
                if (i13 == 3 && bottomSheetBehavior.F0 == i12) {
                    WeakReference weakReference = bottomSheetBehavior.B0;
                    View view2 = weakReference != null ? (View) weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                SystemClock.uptimeMillis();
                WeakReference weakReference2 = bottomSheetBehavior.f14001y0;
                return weakReference2 != null && weakReference2.get() == view;
            }

            @Override // com.bumptech.glide.d
            public final int h(View view, int i12) {
                return view.getLeft();
            }

            @Override // com.bumptech.glide.d
            public final int i(View view, int i12) {
                return f.n(i12, BottomSheetBehavior.this.G(), r());
            }

            @Override // com.bumptech.glide.d
            public final int r() {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.f13986k0 ? bottomSheetBehavior.f14000x0 : bottomSheetBehavior.f13984i0;
            }
        };
        this.H = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.f13741g);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.L = MaterialResources.a(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.f13971a0 = ShapeAppearanceModel.d(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        ShapeAppearanceModel shapeAppearanceModel = this.f13971a0;
        if (shapeAppearanceModel != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
            this.K = materialShapeDrawable;
            materialShapeDrawable.n(context);
            ColorStateList colorStateList = this.L;
            if (colorStateList != null) {
                this.K.r(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.K.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z(), 1.0f);
        this.f13977d0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f13977d0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                MaterialShapeDrawable materialShapeDrawable2 = BottomSheetBehavior.this.K;
                if (materialShapeDrawable2 != null) {
                    materialShapeDrawable2.s(fFloatValue);
                }
            }
        });
        this.f13985j0 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && (i11 = typedValuePeekValue.data) == -1) {
            M(i11);
        } else {
            M(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        L(typedArrayObtainStyledAttributes.getBoolean(9, false));
        this.P = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.f13972b != z11) {
            this.f13972b = z11;
            if (this.f14001y0 != null) {
                y();
            }
            N((this.f13972b && this.f13991p0 == 6) ? 3 : this.f13991p0);
            S(this.f13991p0, true);
            Q();
        }
        this.f13987l0 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f13988m0 = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f13989n0 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.f13970a = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f5 = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f5 > CropImageView.DEFAULT_ASPECT_RATIO && f5 < 1.0f) {
            this.f13983h0 = f5;
            if (this.f14001y0 != null) {
                this.f13982g0 = (int) ((1.0f - f5) * this.f14000x0);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            String str = scqhIrGXy.aJE;
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i12 = typedValuePeekValue2.data;
                if (i12 >= 0) {
                    this.f13979e0 = i12;
                    S(this.f13991p0, true);
                } else {
                    throw new IllegalArgumentException(str);
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f13979e0 = dimensionPixelOffset;
                    S(this.f13991p0, true);
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
            this.f13976d = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.Q = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.R = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.S = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.T = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.U = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.V = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.W = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.Z = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f13974c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class BottomSheetCallback {
        public abstract void b(View view);

        public abstract void c(View view, int i11);

        public void a(View view) {
        }
    }
}
