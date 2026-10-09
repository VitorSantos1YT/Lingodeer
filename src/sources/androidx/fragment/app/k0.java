package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import bw.ORXQ.ADSb;
import com.google.type.bACG.scNRoQgKSYX;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class k0 implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, da.g {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    h0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    ViewModelProvider.Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    k1 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    u0 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    k0 mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    da.f mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    k0 mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    i2 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    k1 mChildFragmentManager = new l1();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new b0(this, 0);
    Lifecycle.State mMaxState = Lifecycle.State.RESUMED;
    MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData = new MutableLiveData<>();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<i0> mOnPreAttachedListeners = new ArrayList<>();
    private final i0 mSavedStateAttachListener = new c0(this);

    public k0() {
        o();
    }

    @Deprecated
    public static k0 instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void callStartTransitionListener(boolean z11) {
        ViewGroup viewGroup;
        k1 k1Var;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var != null) {
            h0Var.f1693s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (k1Var = this.mFragmentManager) == null) {
            return;
        }
        s sVarJ = s.j(viewGroup, k1Var);
        sVarJ.l();
        if (z11) {
            this.mHost.f1842c.post(new t(sVarJ, 1));
        } else {
            sVarJ.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public s0 createFragmentContainer() {
        return new d0(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        k0 k0VarN = n(false);
        if (k0VarN != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(k0VarN);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            v6.b.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.v(defpackage.e.m(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Activity f() {
        return getActivity();
    }

    public k0 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f1711c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final p0 getActivity() {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            return null;
        }
        return u0Var.f1840a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null || (bool = h0Var.f1690p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null || (bool = h0Var.f1689o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        h0Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final k1 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(defpackage.e.l("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            return null;
        }
        return u0Var.f1841b;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && k1.L(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && k1.L(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new SavedStateViewModelFactory(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f1677b;
    }

    public Object getEnterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f1684i;
    }

    public n4.x getEnterTransitionCallback() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        h0Var.getClass();
        return null;
    }

    public int getExitAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f1678c;
    }

    public Object getExitTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f1686k;
    }

    public n4.x getExitTransitionCallback() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        h0Var.getClass();
        return null;
    }

    public View getFocusedView() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f1692r;
    }

    @Deprecated
    public final k1 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            return null;
        }
        return ((o0) u0Var).f1774e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public v6.b getLoaderManager() {
        return v6.b.a(this);
    }

    public int getNextTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f1681f;
    }

    public final k0 getParentFragment() {
        return this.mParentFragment;
    }

    public final k1 getParentFragmentManager() {
        k1 k1Var = this.mFragmentManager;
        if (k1Var != null) {
            return k1Var;
        }
        throw new IllegalStateException(defpackage.e.l("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return false;
        }
        return h0Var.f1676a;
    }

    public int getPopEnterAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f1679d;
    }

    public int getPopExitAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f1680e;
    }

    public float getPostOnViewCreatedAlpha() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 1.0f;
        }
        return h0Var.f1691q;
    }

    public Object getReenterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.f1687l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        a6.a aVar = a6.b.f387a;
        a6.b.b(new GetRetainInstanceUsageViolation(this, "Attempting to get retain instance for fragment " + this));
        a6.b.a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.f1685j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // da.g
    public final da.e getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f23340b;
    }

    public Object getSharedElementEnterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.m;
    }

    public Object getSharedElementReturnTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.f1688n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        h0 h0Var = this.mAnimationInfo;
        return (h0Var == null || (arrayList = h0Var.f1682g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        h0 h0Var = this.mAnimationInfo;
        return (h0Var == null || (arrayList = h0Var.f1683h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i11) {
        return getResources().getString(i11);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final k0 getTargetFragment() {
        return n(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        a6.a aVar = a6.b.f387a;
        a6.b.b(new GetTargetFragmentRequestCodeUsageViolation(this, "Attempting to get target request code from fragment " + this));
        a6.b.a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i11) {
        return getResources().getText(i11);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        i2 i2Var = this.mViewLifecycleOwner;
        if (i2Var != null) {
            return i2Var;
        }
        throw new IllegalStateException(defpackage.e.l("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m() == Lifecycle.State.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.P.f1778c;
        ViewModelStore viewModelStore = (ViewModelStore) map.get(this.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        map.put(this.mWho, viewModelStore2);
        return viewModelStore2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        o();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new l1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        k1 k1Var = this.mFragmentManager;
        if (k1Var != null) {
            k0 k0Var = this.mParentFragment;
            k1Var.getClass();
            if (k0Var == null ? false : k0Var.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            k0 k0Var = this.mParentFragment;
            if (!(k0Var == null ? true : k0Var.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return false;
        }
        return h0Var.f1693s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        k1 k1Var = this.mFragmentManager;
        if (k1Var == null) {
            return false;
        }
        return k1Var.P();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final h0 l() {
        if (this.mAnimationInfo == null) {
            h0 h0Var = new h0();
            h0Var.f1684i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            h0Var.f1685j = obj;
            h0Var.f1686k = null;
            h0Var.f1687l = obj;
            h0Var.m = null;
            h0Var.f1688n = obj;
            h0Var.f1691q = 1.0f;
            h0Var.f1692r = null;
            this.mAnimationInfo = h0Var;
        }
        return this.mAnimationInfo;
    }

    public final int m() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.m());
    }

    public final k0 n(boolean z11) {
        String str;
        if (z11) {
            a6.a aVar = a6.b.f387a;
            a6.b.b(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
            a6.b.a(this).getClass();
        }
        k0 k0Var = this.mTarget;
        if (k0Var != null) {
            return k0Var;
        }
        k1 k1Var = this.mFragmentManager;
        if (k1Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return k1Var.f1711c.b(str);
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.R();
    }

    public final void o() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = new da.f(new fa.a(this, new cr.n(this, 3)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        i0 i0Var = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            i0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(i0Var);
        }
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (k1.L(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        u0 u0Var = this.mHost;
        p0 p0Var = u0Var == null ? null : u0Var.f1840a;
        if (p0Var != null) {
            this.mCalled = false;
            onAttach((Activity) p0Var);
        }
    }

    @Deprecated
    public void onAttachFragment(k0 k0Var) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        k1 k1Var = this.mChildFragmentManager;
        if (k1Var.f1730w >= 1) {
            return;
        }
        k1Var.I = false;
        k1Var.J = false;
        k1Var.P.f1781f = false;
        k1Var.u(1);
    }

    public Animation onCreateAnimation(int i11, boolean z11, int i12) {
        return null;
    }

    public Animator onCreateAnimator(int i11, boolean z11, int i12) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            return layoutInflater.inflate(i11, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z11) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        u0 u0Var = this.mHost;
        p0 p0Var = u0Var == null ? null : u0Var.f1840a;
        if (p0Var != null) {
            this.mCalled = false;
            onInflate((Activity) p0Var, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z11) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z11) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z11) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public final a0 p(j.a aVar, u.a aVar2, i.b bVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(defpackage.e.l("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        g0 g0Var = new g0(this, aVar2, atomicReference, aVar, bVar);
        if (this.mState >= 0) {
            g0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(g0Var);
        }
        return new a0(atomicReference, aVar);
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new t2(defpackage.e.l("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (k1.L(3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        k1 k1Var = this.mChildFragmentManager;
        k1Var.I = false;
        k1Var.J = false;
        k1Var.P.f1781f = false;
        k1Var.u(4);
    }

    public void performAttach() {
        ArrayList<i0> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            i0 i0Var = arrayList.get(i11);
            i11++;
            i0Var.a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f1841b);
        if (!this.mCalled) {
            throw new t2(defpackage.e.l("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it = this.mFragmentManager.f1724q.iterator();
        while (it.hasNext()) {
            ((p1) it.next()).a(this);
        }
        k1 k1Var = this.mChildFragmentManager;
        k1Var.I = false;
        k1Var.J = false;
        k1Var.P.f1781f = false;
        k1Var.u(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.j(menuItem);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z11 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z11 = true;
        }
        return this.mChildFragmentManager.k(menu, menuInflater) | z11;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new i2(this, getViewModelStore(), new z(this, 0));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f1702e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (k1.L(3)) {
            Objects.toString(this.mView);
            toString();
        }
        ViewTreeLifecycleOwner.set(this.mView, this.mViewLifecycleOwner);
        ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
        fb.g0.B(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new t2(defpackage.e.l("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            i2 i2Var = this.mViewLifecycleOwner;
            i2Var.b();
            if (i2Var.f1702e.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                this.mViewLifecycleOwner.a(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new t2(defpackage.e.l("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        y.u0 u0Var = v6.b.a(this).f53581b.f53578a;
        int iH = u0Var.h();
        for (int i11 = 0; i11 < iH; i11++) {
            ((v6.c) u0Var.i(i11)).a();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new t2(defpackage.e.l("Fragment ", this, " did not call through to super.onDetach()"));
        }
        k1 k1Var = this.mChildFragmentManager;
        if (k1Var.K) {
            return;
        }
        k1Var.l();
        this.mChildFragmentManager = new l1();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z11) {
        onMultiWindowModeChanged(z11);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new t2(defpackage.e.l("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z11) {
        onPictureInPictureModeChanged(z11);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z11 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z11 = true;
        }
        return this.mChildFragmentManager.t(menu) | z11;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zO = k1.O(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zO) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zO);
            onPrimaryNavigationFragmentChanged(zO);
            k1 k1Var = this.mChildFragmentManager;
            k1Var.i0();
            k1Var.r(k1Var.A);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.R();
        this.mChildFragmentManager.z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new t2(defpackage.e.l("Fragment ", this, " did not call through to super.onResume()"));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(event);
        }
        k1 k1Var = this.mChildFragmentManager;
        k1Var.I = false;
        k1Var.J = false;
        k1Var.P.f1781f = false;
        k1Var.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.R();
        this.mChildFragmentManager.z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new t2(defpackage.e.l("Fragment ", this, " did not call through to super.onStart()"));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(event);
        }
        k1 k1Var = this.mChildFragmentManager;
        k1Var.I = false;
        k1Var.J = false;
        k1Var.P.f1781f = false;
        k1Var.u(5);
    }

    public void performStop() {
        k1 k1Var = this.mChildFragmentManager;
        k1Var.J = true;
        k1Var.P.f1781f = true;
        k1Var.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new t2(defpackage.e.l("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        l().f1693s = true;
    }

    public final <I, O> i.c registerForActivityResult(j.a aVar, i.b bVar) {
        return p(aVar, new f0(this, 0), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] permissions, int i11) {
        if (this.mHost == null) {
            throw new IllegalStateException(defpackage.e.l("Fragment ", this, " not attached to Activity"));
        }
        k1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.F == null) {
            parentFragmentManager.f1731x.getClass();
            kotlin.jvm.internal.m.f(permissions, "permissions");
        } else {
            parentFragmentManager.G.addLast(new g1(this.mWho, i11));
            parentFragmentManager.F.a(permissions);
        }
    }

    public final p0 requireActivity() {
        p0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(defpackage.e.l("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(defpackage.e.l("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(defpackage.e.l("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final k1 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final k0 requireParentFragment() {
        k0 parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(defpackage.e.l("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(defpackage.e.l("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.Z(bundle);
        k1 k1Var = this.mChildFragmentManager;
        k1Var.I = false;
        k1Var.J = false;
        k1Var.P.f1781f = false;
        k1Var.u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new t2(defpackage.e.l("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z11) {
        l().f1690p = Boolean.valueOf(z11);
    }

    public void setAllowReturnTransitionOverlap(boolean z11) {
        l().f1689o = Boolean.valueOf(z11);
    }

    public void setAnimations(int i11, int i12, int i13, int i14) {
        if (this.mAnimationInfo == null && i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            return;
        }
        l().f1677b = i11;
        l().f1678c = i12;
        l().f1679d = i13;
        l().f1680e = i14;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(n4.x xVar) {
        l().getClass();
    }

    public void setEnterTransition(Object obj) {
        l().f1684i = obj;
    }

    public void setExitSharedElementCallback(n4.x xVar) {
        l().getClass();
    }

    public void setExitTransition(Object obj) {
        l().f1686k = obj;
    }

    public void setFocusedView(View view) {
        l().f1692r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z11) {
        if (this.mHasMenu != z11) {
            this.mHasMenu = z11;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((o0) this.mHost).f1774e.invalidateMenu();
        }
    }

    public void setInitialSavedState(j0 j0Var) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (j0Var == null || (bundle = j0Var.f1705a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z11) {
        if (this.mMenuVisible != z11) {
            this.mMenuVisible = z11;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((o0) this.mHost).f1774e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i11) {
        if (this.mAnimationInfo == null && i11 == 0) {
            return;
        }
        l();
        this.mAnimationInfo.f1681f = i11;
    }

    public void setPopDirection(boolean z11) {
        if (this.mAnimationInfo == null) {
            return;
        }
        l().f1676a = z11;
    }

    public void setPostOnViewCreatedAlpha(float f5) {
        l().f1691q = f5;
    }

    public void setReenterTransition(Object obj) {
        l().f1687l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z11) {
        a6.a aVar = a6.b.f387a;
        a6.b.b(new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this));
        a6.b.a(this).getClass();
        this.mRetainInstance = z11;
        k1 k1Var = this.mFragmentManager;
        if (k1Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z11) {
            k1Var.P.a(this);
        } else {
            k1Var.P.c(this);
        }
    }

    public void setReturnTransition(Object obj) {
        l().f1685j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        l().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        l();
        h0 h0Var = this.mAnimationInfo;
        h0Var.f1682g = arrayList;
        h0Var.f1683h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        l().f1688n = obj;
    }

    @Deprecated
    public void setTargetFragment(k0 k0Var, int i11) {
        if (k0Var != null) {
            a6.a aVar = a6.b.f387a;
            a6.b.b(new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + k0Var + " with request code " + i11 + " for fragment " + this));
            a6.b.a(this).getClass();
        }
        k1 k1Var = this.mFragmentManager;
        k1 k1Var2 = k0Var != null ? k0Var.mFragmentManager : null;
        if (k1Var != null && k1Var2 != null && k1Var != k1Var2) {
            throw new IllegalArgumentException(defpackage.e.l("Fragment ", k0Var, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (k0 k0VarN = k0Var; k0VarN != null; k0VarN = k0VarN.n(false)) {
            if (k0VarN.equals(this)) {
                throw new IllegalArgumentException("Setting " + k0Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (k0Var == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || k0Var.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = k0Var;
        } else {
            this.mTargetWho = k0Var.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i11;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z11) {
        a6.a aVar = a6.b.f387a;
        a6.b.b(new SetUserVisibleHintViolation(this, "Attempting to set user visible hint to " + z11 + " for fragment " + this));
        a6.b.a(this).getClass();
        boolean z12 = false;
        if (!this.mUserVisibleHint && z11 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            k1 k1Var = this.mFragmentManager;
            u1 u1VarG = k1Var.g(this);
            k0 k0Var = u1VarG.f1846c;
            if (k0Var.mDeferStart) {
                if (k1Var.f1710b) {
                    k1Var.L = true;
                } else {
                    k0Var.mDeferStart = false;
                    u1VarG.i();
                }
            }
        }
        this.mUserVisibleHint = z11;
        if (this.mState < 5 && !z11) {
            z12 = true;
        }
        this.mDeferStart = z12;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z11);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        u0 u0Var = this.mHost;
        if (u0Var != null) {
            return n4.b.e(((o0) u0Var).f1774e, str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i11) {
        startActivityForResult(intent, i11, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int i11, Intent intent2, int i12, int i13, int i14, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(defpackage.e.l("Fragment ", this, " not attached to Activity"));
        }
        if (k1.L(2)) {
            toString();
            Objects.toString(intent);
            Objects.toString(intent2);
            Objects.toString(bundle);
        }
        k1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E == null) {
            u0 u0Var = parentFragmentManager.f1731x;
            u0Var.getClass();
            kotlin.jvm.internal.m.f(intent, "intent");
            if (i11 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            p0 p0Var = u0Var.f1840a;
            if (p0Var == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            p0Var.startIntentSenderForResult(intent, i11, intent2, i12, i13, i14, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (k1.L(2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        kotlin.jvm.internal.m.f(intent, "intentSender");
        i.k kVar = new i.k(intent, intent2, i12, i13);
        parentFragmentManager.G.addLast(new g1(this.mWho, i11));
        if (k1.L(2)) {
            toString();
        }
        parentFragmentManager.E.a(kVar);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !l().f1693s) {
            return;
        }
        if (this.mHost == null) {
            l().f1693s = false;
        } else if (Looper.myLooper() != this.mHost.f1842c.getLooper()) {
            this.mHost.f1842c.postAtFrontOfQueue(new b0(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static k0 instantiate(Context context, String str, Bundle bundle) {
        try {
            k0 k0Var = (k0) c1.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return k0Var;
            }
            bundle.setClassLoader(k0Var.getClass().getClassLoader());
            k0Var.setArguments(bundle);
            return k0Var;
        } catch (IllegalAccessException e8) {
            throw new Fragment$InstantiationException(ep.a.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e8);
        } catch (InstantiationException e10) {
            throw new Fragment$InstantiationException(ep.a.g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new Fragment$InstantiationException(ep.a.g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new Fragment$InstantiationException(ep.a.g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }

    public final String getString(int i11, Object... objArr) {
        return getResources().getString(i11, objArr);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new e0(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new t2(defpackage.e.l(ADSb.woCzHjzJ, this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    public final void postponeEnterTransition(long j11, TimeUnit timeUnit) {
        l().f1693s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        k1 k1Var = this.mFragmentManager;
        if (k1Var != null) {
            this.mPostponedHandler = k1Var.f1731x.f1842c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j11));
    }

    public final <I, O> i.c registerForActivityResult(j.a aVar, i.i iVar, i.b bVar) {
        return p(aVar, new f0(iVar, 1), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            throw new IllegalStateException(defpackage.e.l("Fragment ", this, " not attached to Activity"));
        }
        kotlin.jvm.internal.m.f(intent, "intent");
        u0Var.f1841b.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i11, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(defpackage.e.l("Fragment ", this, " not attached to Activity"));
        }
        k1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D != null) {
            parentFragmentManager.G.addLast(new g1(this.mWho, i11));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.D.a(intent);
            return;
        }
        u0 u0Var = parentFragmentManager.f1731x;
        u0Var.getClass();
        kotlin.jvm.internal.m.f(intent, "intent");
        if (i11 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        u0Var.f1841b.startActivity(intent, bundle);
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        u0 u0Var = this.mHost;
        if (u0Var != null) {
            p0 p0Var = ((o0) u0Var).f1774e;
            LayoutInflater layoutInflaterCloneInContext = p0Var.getLayoutInflater().cloneInContext(p0Var);
            layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f1714f);
            return layoutInflaterCloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(defpackage.e.l("Fragment ", this, scNRoQgKSYX.JhvGRfy));
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }
}
