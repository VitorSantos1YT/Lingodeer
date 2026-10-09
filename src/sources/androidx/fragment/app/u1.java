package androidx.fragment.app;

import aj.uZCn.evRpcb;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f1844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f1845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f1846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1847d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1848e = -1;

    public u1(q0 q0Var, w1 w1Var, k0 k0Var) {
        this.f1844a = q0Var;
        this.f1845b = w1Var;
        this.f1846c = k0Var;
    }

    public final void a() {
        k0 k0Var;
        View view;
        View view2;
        k0 k0Var2 = this.f1846c;
        View view3 = k0Var2.mContainer;
        while (true) {
            k0Var = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            k0 k0Var3 = tag instanceof k0 ? (k0) tag : null;
            if (k0Var3 != null) {
                k0Var = k0Var3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        k0 parentFragment = k0Var2.getParentFragment();
        if (k0Var != null && !k0Var.equals(parentFragment)) {
            int i11 = k0Var2.mContainerId;
            a6.a aVar = a6.b.f387a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(k0Var2);
            sb2.append(" within the view of parent fragment ");
            sb2.append(k0Var);
            sb2.append(" via container with ID ");
            a6.b.b(new WrongNestedHierarchyViolation(k0Var2, hh.p0.i(i11, " without using parent's childFragmentManager", sb2)));
            a6.b.a(k0Var2).getClass();
        }
        ArrayList arrayList = this.f1845b.f1861a;
        ViewGroup viewGroup = k0Var2.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(k0Var2);
            for (int i12 = iIndexOf - 1; i12 >= 0; i12--) {
                k0 k0Var4 = (k0) arrayList.get(i12);
                if (k0Var4.mContainer == viewGroup && (view2 = k0Var4.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                k0 k0Var5 = (k0) arrayList.get(iIndexOf);
                if (k0Var5.mContainer == viewGroup && (view = k0Var5.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        k0Var2.mContainer.addView(k0Var2.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zL = k1.L(3);
        k0 k0Var = this.f1846c;
        if (zL) {
            Objects.toString(k0Var);
        }
        k0 k0Var2 = k0Var.mTarget;
        u1 u1Var = null;
        w1 w1Var = this.f1845b;
        if (k0Var2 != null) {
            u1 u1Var2 = (u1) w1Var.f1862b.get(k0Var2.mWho);
            if (u1Var2 == null) {
                throw new IllegalStateException("Fragment " + k0Var + " declared target fragment " + k0Var.mTarget + " that does not belong to this FragmentManager!");
            }
            k0Var.mTargetWho = k0Var.mTarget.mWho;
            k0Var.mTarget = null;
            u1Var = u1Var2;
        } else {
            String str = k0Var.mTargetWho;
            if (str != null && (u1Var = (u1) w1Var.f1862b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(k0Var);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(ep.a.k(sb2, k0Var.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (u1Var != null) {
            u1Var.i();
        }
        k1 k1Var = k0Var.mFragmentManager;
        k0Var.mHost = k1Var.f1731x;
        k0Var.mParentFragment = k1Var.f1733z;
        q0 q0Var = this.f1844a;
        q0Var.g(k0Var, false);
        k0Var.performAttach();
        q0Var.b(k0Var, false);
    }

    public final int c() {
        k0 k0Var = this.f1846c;
        if (k0Var.mFragmentManager == null) {
            return k0Var.mState;
        }
        int iMin = this.f1848e;
        int i11 = t1.f1838a[k0Var.mMaxState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i11 != 3) {
                iMin = i11 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        if (k0Var.mFromLayout) {
            if (k0Var.mInLayout) {
                iMin = Math.max(this.f1848e, 2);
                View view = k0Var.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1848e < 4 ? Math.min(iMin, k0Var.mState) : Math.min(iMin, 1);
            }
        }
        if (k0Var.mInDynamicContainer && k0Var.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!k0Var.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = k0Var.mContainer;
        n2 n2Var = null;
        if (viewGroup != null) {
            s sVarJ = s.j(viewGroup, k0Var.getParentFragmentManager());
            m2 m2VarG = sVarJ.g(k0Var);
            n2 n2Var2 = m2VarG != null ? m2VarG.f1755b : null;
            m2 m2VarH = sVarJ.h(k0Var);
            n2Var = m2VarH != null ? m2VarH.f1755b : null;
            int i12 = n2Var2 == null ? -1 : s2.f1833a[n2Var2.ordinal()];
            if (i12 != -1 && i12 != 1) {
                n2Var = n2Var2;
            }
        }
        if (n2Var == n2.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (n2Var == n2.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (k0Var.mRemoving) {
            iMin = k0Var.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (k0Var.mDeferStart && k0Var.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (k0Var.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (k1.L(2)) {
            Objects.toString(k0Var);
        }
        return iMin;
    }

    public final void e() {
        k0 k0VarB;
        boolean zL = k1.L(3);
        k0 k0Var = this.f1846c;
        if (zL) {
            Objects.toString(k0Var);
        }
        boolean zIsChangingConfigurations = true;
        int i11 = 0;
        boolean z11 = k0Var.mRemoving && !k0Var.isInBackStack();
        w1 w1Var = this.f1845b;
        if (z11 && !k0Var.mBeingSaved) {
            w1Var.i(k0Var.mWho, null);
        }
        if (!z11) {
            o1 o1Var = w1Var.f1864d;
            if (!((o1Var.f1776a.containsKey(k0Var.mWho) && o1Var.f1779d) ? o1Var.f1780e : true)) {
                String str = k0Var.mTargetWho;
                if (str != null && (k0VarB = w1Var.b(str)) != null && k0VarB.mRetainInstance) {
                    k0Var.mTarget = k0VarB;
                }
                k0Var.mState = 0;
                return;
            }
        }
        u0 u0Var = k0Var.mHost;
        if (u0Var instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = w1Var.f1864d.f1780e;
        } else {
            p0 p0Var = u0Var.f1841b;
            if (p0Var != null) {
                zIsChangingConfigurations = true ^ p0Var.isChangingConfigurations();
            }
        }
        if ((z11 && !k0Var.mBeingSaved) || zIsChangingConfigurations) {
            o1 o1Var2 = w1Var.f1864d;
            o1Var2.getClass();
            if (k1.L(3)) {
                Objects.toString(k0Var);
            }
            o1Var2.b(k0Var.mWho, false);
        }
        k0Var.performDestroy();
        this.f1844a.d(k0Var, false);
        ArrayList arrayListD = w1Var.d();
        int size = arrayListD.size();
        while (i11 < size) {
            Object obj = arrayListD.get(i11);
            i11++;
            u1 u1Var = (u1) obj;
            if (u1Var != null) {
                k0 k0Var2 = u1Var.f1846c;
                if (k0Var.mWho.equals(k0Var2.mTargetWho)) {
                    k0Var2.mTarget = k0Var;
                    k0Var2.mTargetWho = null;
                }
            }
        }
        String str2 = k0Var.mTargetWho;
        if (str2 != null) {
            k0Var.mTarget = w1Var.b(str2);
        }
        w1Var.h(this);
    }

    public final void f() {
        View view;
        boolean zL = k1.L(3);
        k0 k0Var = this.f1846c;
        if (zL) {
            Objects.toString(k0Var);
        }
        ViewGroup viewGroup = k0Var.mContainer;
        if (viewGroup != null && (view = k0Var.mView) != null) {
            viewGroup.removeView(view);
        }
        k0Var.performDestroyView();
        this.f1844a.n(k0Var, false);
        k0Var.mContainer = null;
        k0Var.mView = null;
        k0Var.mViewLifecycleOwner = null;
        k0Var.mViewLifecycleOwnerLiveData.setValue(null);
        k0Var.mInLayout = false;
    }

    public final void g() {
        boolean zL = k1.L(3);
        k0 k0Var = this.f1846c;
        if (zL) {
            Objects.toString(k0Var);
        }
        k0Var.performDetach();
        this.f1844a.e(k0Var, false);
        k0Var.mState = -1;
        k0Var.mHost = null;
        k0Var.mParentFragment = null;
        k0Var.mFragmentManager = null;
        if (!k0Var.mRemoving || k0Var.isInBackStack()) {
            o1 o1Var = this.f1845b.f1864d;
            if (!((o1Var.f1776a.containsKey(k0Var.mWho) && o1Var.f1779d) ? o1Var.f1780e : true)) {
                return;
            }
        }
        if (k1.L(3)) {
            Objects.toString(k0Var);
        }
        k0Var.initState();
    }

    public final void h() {
        k0 k0Var = this.f1846c;
        if (k0Var.mFromLayout && k0Var.mInLayout && !k0Var.mPerformedCreateView) {
            if (k1.L(3)) {
                Objects.toString(k0Var);
            }
            Bundle bundle = k0Var.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            k0Var.performCreateView(k0Var.performGetLayoutInflater(bundle2), null, bundle2);
            View view = k0Var.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                k0Var.mView.setTag(R.id.fragment_container_view_tag, k0Var);
                if (k0Var.mHidden) {
                    k0Var.mView.setVisibility(8);
                }
                k0Var.performViewCreated();
                this.f1844a.m(k0Var, k0Var.mView, bundle2, false);
                k0Var.mState = 2;
            }
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Bundle bundle;
        ViewGroup viewGroup3;
        boolean z11 = this.f1847d;
        k0 k0Var = this.f1846c;
        if (z11) {
            if (k1.L(2)) {
                Objects.toString(k0Var);
                return;
            }
            return;
        }
        try {
            this.f1847d = true;
            boolean z12 = false;
            while (true) {
                int iC = c();
                int i11 = k0Var.mState;
                w1 w1Var = this.f1845b;
                if (iC == i11) {
                    if (!z12 && i11 == -1 && k0Var.mRemoving && !k0Var.isInBackStack() && !k0Var.mBeingSaved) {
                        if (k1.L(3)) {
                            Objects.toString(k0Var);
                        }
                        o1 o1Var = w1Var.f1864d;
                        o1Var.getClass();
                        if (k1.L(3)) {
                            Objects.toString(k0Var);
                        }
                        o1Var.b(k0Var.mWho, true);
                        w1Var.h(this);
                        if (k1.L(3)) {
                            Objects.toString(k0Var);
                        }
                        k0Var.initState();
                    }
                    if (k0Var.mHiddenChanged) {
                        if (k0Var.mView != null && (viewGroup = k0Var.mContainer) != null) {
                            s sVarJ = s.j(viewGroup, k0Var.getParentFragmentManager());
                            if (k0Var.mHidden) {
                                if (k1.L(2)) {
                                    Objects.toString(k0Var);
                                }
                                sVarJ.d(q2.GONE, n2.NONE, this);
                            } else {
                                if (k1.L(2)) {
                                    Objects.toString(k0Var);
                                }
                                sVarJ.d(q2.VISIBLE, n2.NONE, this);
                            }
                        }
                        k1 k1Var = k0Var.mFragmentManager;
                        if (k1Var != null && k0Var.mAdded && k1.M(k0Var)) {
                            k1Var.H = true;
                        }
                        k0Var.mHiddenChanged = false;
                        k0Var.onHiddenChanged(k0Var.mHidden);
                        k0Var.mChildFragmentManager.o();
                    }
                    return;
                }
                q0 q0Var = this.f1844a;
                if (iC > i11) {
                    switch (i11 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            if (k1.L(3)) {
                                Objects.toString(k0Var);
                            }
                            Bundle bundle2 = k0Var.mSavedFragmentState;
                            bundle = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
                            if (!k0Var.mIsCreated) {
                                q0Var.h(k0Var, bundle, false);
                                k0Var.performCreate(bundle);
                                q0Var.c(k0Var, bundle, false);
                            } else {
                                k0Var.mState = 1;
                                k0Var.restoreChildFragmentState();
                            }
                            break;
                        case 2:
                            h();
                            d();
                            break;
                        case 3:
                            if (k1.L(3)) {
                                Objects.toString(k0Var);
                            }
                            Bundle bundle3 = k0Var.mSavedFragmentState;
                            bundle = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            k0Var.performActivityCreated(bundle);
                            q0Var.a(k0Var, bundle, false);
                            break;
                        case 4:
                            if (k0Var.mView != null && (viewGroup3 = k0Var.mContainer) != null) {
                                s sVarJ2 = s.j(viewGroup3, k0Var.getParentFragmentManager());
                                int visibility = k0Var.mView.getVisibility();
                                q2.Companion.getClass();
                                q2 finalState = o2.b(visibility);
                                kotlin.jvm.internal.m.f(finalState, "finalState");
                                if (k1.L(2)) {
                                    Objects.toString(k0Var);
                                }
                                sVarJ2.d(finalState, n2.ADDING, this);
                            }
                            k0Var.mState = 4;
                            break;
                        case 5:
                            if (k1.L(3)) {
                                Objects.toString(k0Var);
                            }
                            k0Var.performStart();
                            q0Var.k(k0Var, false);
                            break;
                        case 6:
                            k0Var.mState = 6;
                            break;
                        case 7:
                            k();
                            break;
                    }
                } else {
                    switch (i11 - 1) {
                        case -1:
                            g();
                            break;
                        case 0:
                            if (k0Var.mBeingSaved) {
                                if (((Bundle) w1Var.f1863c.get(k0Var.mWho)) == null) {
                                    w1Var.i(k0Var.mWho, l());
                                }
                            }
                            e();
                            break;
                        case 1:
                            f();
                            k0Var.mState = 1;
                            break;
                        case 2:
                            k0Var.mInLayout = false;
                            k0Var.mState = 2;
                            break;
                        case 3:
                            if (k1.L(3)) {
                                Objects.toString(k0Var);
                            }
                            if (k0Var.mBeingSaved) {
                                w1Var.i(k0Var.mWho, l());
                            } else if (k0Var.mView != null && k0Var.mSavedViewState == null) {
                                m();
                            }
                            if (k0Var.mView != null && (viewGroup2 = k0Var.mContainer) != null) {
                                s sVarJ3 = s.j(viewGroup2, k0Var.getParentFragmentManager());
                                if (k1.L(2)) {
                                    Objects.toString(k0Var);
                                }
                                sVarJ3.d(q2.REMOVED, n2.REMOVING, this);
                            }
                            k0Var.mState = 3;
                            break;
                        case 4:
                            if (k1.L(3)) {
                                Objects.toString(k0Var);
                            }
                            k0Var.performStop();
                            q0Var.l(k0Var, false);
                            break;
                        case 5:
                            k0Var.mState = 5;
                            break;
                        case 6:
                            if (k1.L(3)) {
                                Objects.toString(k0Var);
                            }
                            k0Var.performPause();
                            q0Var.f(k0Var, false);
                            break;
                    }
                }
                z12 = true;
            }
        } finally {
            this.f1847d = false;
        }
    }

    public final void j(ClassLoader classLoader) {
        k0 k0Var = this.f1846c;
        Bundle bundle = k0Var.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (k0Var.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            k0Var.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            k0Var.mSavedViewState = k0Var.mSavedFragmentState.getSparseParcelableArray("viewState");
            k0Var.mSavedViewRegistryState = k0Var.mSavedFragmentState.getBundle("viewRegistryState");
            r1 r1Var = (r1) k0Var.mSavedFragmentState.getParcelable("state");
            if (r1Var != null) {
                k0Var.mTargetWho = r1Var.O;
                k0Var.mTargetRequestCode = r1Var.P;
                Boolean bool = k0Var.mSavedUserVisibleHint;
                if (bool != null) {
                    k0Var.mUserVisibleHint = bool.booleanValue();
                    k0Var.mSavedUserVisibleHint = null;
                } else {
                    k0Var.mUserVisibleHint = r1Var.Q;
                }
            }
            if (k0Var.mUserVisibleHint) {
                return;
            }
            k0Var.mDeferStart = true;
        } catch (BadParcelableException e8) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k0Var, e8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public final void k() {
        boolean zL = k1.L(3);
        k0 k0Var = this.f1846c;
        if (zL) {
            Objects.toString(k0Var);
        }
        View focusedView = k0Var.getFocusedView();
        if (focusedView != null) {
            if (focusedView == k0Var.mView) {
                focusedView.requestFocus();
                if (k1.L(2)) {
                    focusedView.toString();
                    Objects.toString(k0Var);
                    Objects.toString(k0Var.mView.findFocus());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == k0Var.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                focusedView.requestFocus();
                if (k1.L(2)) {
                    focusedView.toString();
                    Objects.toString(k0Var);
                    Objects.toString(k0Var.mView.findFocus());
                }
            }
        }
        k0Var.setFocusedView(null);
        k0Var.performResume();
        this.f1844a.i(k0Var, false);
        this.f1845b.i(k0Var.mWho, null);
        k0Var.mSavedFragmentState = null;
        k0Var.mSavedViewState = null;
        k0Var.mSavedViewRegistryState = null;
    }

    public final void m() {
        k0 k0Var = this.f1846c;
        if (k0Var.mView == null) {
            return;
        }
        if (k1.L(2)) {
            Objects.toString(k0Var);
            Objects.toString(k0Var.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        k0Var.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            k0Var.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        k0Var.mViewLifecycleOwner.f1703f.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        k0Var.mSavedViewRegistryState = bundle;
    }

    public final void d() {
        String resourceName;
        k0 k0Var = this.f1846c;
        if (k0Var.mFromLayout) {
            return;
        }
        if (k1.L(3)) {
            Objects.toString(k0Var);
        }
        Bundle bundle = k0Var.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = k0Var.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = k0Var.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i11 = k0Var.mContainerId;
            if (i11 != 0) {
                if (i11 == -1) {
                    throw new IllegalArgumentException(defpackage.e.l(HOBXIlHxIkMBEA.KqTAVnfAoi, k0Var, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) k0Var.mFragmentManager.f1732y.b(i11);
                if (viewGroup == null) {
                    if (!k0Var.mRestored && !k0Var.mInDynamicContainer) {
                        try {
                            resourceName = k0Var.getResources().getResourceName(k0Var.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(k0Var.mContainerId) + " (" + resourceName + ") for fragment " + k0Var);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    a6.a aVar = a6.b.f387a;
                    a6.b.b(new WrongFragmentContainerViolation(k0Var, "Attempting to add fragment " + k0Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    a6.b.a(k0Var).getClass();
                }
            }
        }
        k0Var.mContainer = viewGroup;
        k0Var.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (k0Var.mView != null) {
            if (k1.L(3)) {
                Objects.toString(k0Var);
            }
            k0Var.mView.setSaveFromParentEnabled(false);
            k0Var.mView.setTag(R.id.fragment_container_view_tag, k0Var);
            if (viewGroup != null) {
                a();
            }
            if (k0Var.mHidden) {
                k0Var.mView.setVisibility(8);
            }
            if (k0Var.mView.isAttachedToWindow()) {
                View view = k0Var.mView;
                WeakHashMap weakHashMap = z4.s0.f58893a;
                z4.h0.c(view);
            } else {
                View view2 = k0Var.mView;
                view2.addOnAttachStateChangeListener(new s1(view2));
            }
            k0Var.performViewCreated();
            this.f1844a.m(k0Var, k0Var.mView, bundle2, false);
            int visibility = k0Var.mView.getVisibility();
            k0Var.setPostOnViewCreatedAlpha(k0Var.mView.getAlpha());
            if (k0Var.mContainer != null && visibility == 0) {
                View viewFindFocus = k0Var.mView.findFocus();
                if (viewFindFocus != null) {
                    k0Var.setFocusedView(viewFindFocus);
                    if (k1.L(2)) {
                        viewFindFocus.toString();
                        Objects.toString(k0Var);
                    }
                }
                k0Var.mView.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
            }
        }
        k0Var.mState = 2;
    }

    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        k0 k0Var = this.f1846c;
        if (k0Var.mState == -1 && (bundle = k0Var.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new r1(k0Var));
        if (k0Var.mState > 0) {
            Bundle bundle3 = new Bundle();
            k0Var.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f1844a.j(k0Var, bundle3, false);
            Bundle bundle4 = new Bundle();
            k0Var.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle(evRpcb.fJdrG, bundle4);
            }
            Bundle bundleA0 = k0Var.mChildFragmentManager.a0();
            if (!bundleA0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleA0);
            }
            if (k0Var.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = k0Var.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = k0Var.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = k0Var.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public u1(q0 q0Var, w1 w1Var, ClassLoader classLoader, c1 c1Var, Bundle bundle) {
        this.f1844a = q0Var;
        this.f1845b = w1Var;
        r1 r1Var = (r1) bundle.getParcelable("state");
        k0 k0VarA = c1Var.a(r1Var.f1818a);
        k0VarA.mWho = r1Var.f1819b;
        k0VarA.mFromLayout = r1Var.f1820c;
        k0VarA.mInDynamicContainer = r1Var.f1821d;
        k0VarA.mRestored = true;
        k0VarA.mFragmentId = r1Var.f1822e;
        k0VarA.mContainerId = r1Var.f1823f;
        k0VarA.mTag = r1Var.f1824t;
        k0VarA.mRetainInstance = r1Var.H;
        k0VarA.mRemoving = r1Var.K;
        k0VarA.mDetached = r1Var.L;
        k0VarA.mHidden = r1Var.M;
        k0VarA.mMaxState = Lifecycle.State.values()[r1Var.N];
        k0VarA.mTargetWho = r1Var.O;
        k0VarA.mTargetRequestCode = r1Var.P;
        k0VarA.mUserVisibleHint = r1Var.Q;
        this.f1846c = k0VarA;
        k0VarA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        k0VarA.setArguments(bundle2);
        if (k1.L(2)) {
            Objects.toString(k0VarA);
        }
    }

    public u1(q0 q0Var, w1 w1Var, k0 k0Var, Bundle bundle) {
        this.f1844a = q0Var;
        this.f1845b = w1Var;
        this.f1846c = k0Var;
        k0Var.mSavedViewState = null;
        k0Var.mSavedViewRegistryState = null;
        k0Var.mBackStackNesting = 0;
        k0Var.mInLayout = false;
        k0Var.mAdded = false;
        k0 k0Var2 = k0Var.mTarget;
        k0Var.mTargetWho = k0Var2 != null ? k0Var2.mWho : null;
        k0Var.mTarget = null;
        k0Var.mSavedFragmentState = bundle;
        k0Var.mArguments = bundle.getBundle("arguments");
    }
}
