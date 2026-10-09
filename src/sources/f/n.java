package f;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.b1;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.lingodeer.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends n4.h implements ViewModelStoreOwner, HasDefaultViewModelProviderFactory, da.g, f0, i.j, o4.e, o4.f, n4.u, n4.v, z4.m {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final h Companion = new h();
    private ViewModelStore _viewModelStore;
    private final i.i activityResultRegistry;
    private int contentLayoutId;
    private final qy.h defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final qy.h fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final qy.h onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<y4.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<y4.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<y4.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<y4.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<y4.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final j reportFullyDrawnExecutor;
    private final da.f savedStateRegistryController;
    private final h.a contextAwareHelper = new h.a();
    private final z4.o menuHostHelper = new z4.o(new c(this, 0));

    public n() {
        fa.a aVar = new fa.a(this, new cr.n(this, 3));
        this.savedStateRegistryController = new da.f(aVar);
        this.reportFullyDrawnExecutor = new k(this);
        this.fullyDrawnReporter$delegate = com.bumptech.glide.d.v(new m(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new l(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i11 = 0;
        getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: f.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f26132b;

            {
                this.f26132b = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Window window;
                View viewPeekDecorView;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(lifecycleOwner, "<anonymous parameter 0>");
                        kotlin.jvm.internal.m.f(event, "event");
                        if (event == Lifecycle.Event.ON_STOP && (window = this.f26132b.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        n.g(this.f26132b, lifecycleOwner, event);
                        break;
                }
            }
        });
        final int i12 = 1;
        getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: f.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f26132b;

            {
                this.f26132b = this;
            }

            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Window window;
                View viewPeekDecorView;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(lifecycleOwner, "<anonymous parameter 0>");
                        kotlin.jvm.internal.m.f(event, "event");
                        if (event == Lifecycle.Event.ON_STOP && (window = this.f26132b.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        n.g(this.f26132b, lifecycleOwner, event);
                        break;
                }
            }
        });
        getLifecycle().addObserver(new g(this));
        aVar.a();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new e(this, 0));
        addOnContextAvailableListener(new h.b() { // from class: f.f
            @Override // h.b
            public final void a(n nVar) {
                n.f(this.f26144a, nVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = com.bumptech.glide.d.v(new m(this, 0));
        this.onBackPressedDispatcher$delegate = com.bumptech.glide.d.v(new m(this, 3));
    }

    public static final void access$ensureViewModelStore(n nVar) {
        if (nVar._viewModelStore == null) {
            i iVar = (i) nVar.getLastNonConfigurationInstance();
            if (iVar != null) {
                nVar._viewModelStore = iVar.f26155b;
            }
            if (nVar._viewModelStore == null) {
                nVar._viewModelStore = new ViewModelStore();
            }
        }
    }

    public static void f(n nVar, Context it) {
        kotlin.jvm.internal.m.f(it, "it");
        Bundle bundleA = nVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            i.i iVar = nVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = iVar.f33880b;
            LinkedHashMap linkedHashMap2 = iVar.f33879a;
            Bundle bundle = iVar.f33885g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                iVar.f33882d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str = stringArrayList.get(i11);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        kotlin.jvm.internal.c0.c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i11);
                kotlin.jvm.internal.m.e(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i11);
                kotlin.jvm.internal.m.e(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                iVar.f33880b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    public static void g(n nVar, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        kotlin.jvm.internal.m.f(lifecycleOwner, "<anonymous parameter 0>");
        kotlin.jvm.internal.m.f(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            nVar.contextAwareHelper.f29901b = null;
            if (!nVar.isChangingConfigurations()) {
                nVar.getViewModelStore().clear();
            }
            k kVar = (k) nVar.reportFullyDrawnExecutor;
            n nVar2 = kVar.f26159d;
            nVar2.getWindow().getDecorView().removeCallbacks(kVar);
            nVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public static Bundle h(n nVar) {
        Bundle bundle = new Bundle();
        i.i iVar = nVar.activityResultRegistry;
        iVar.getClass();
        LinkedHashMap linkedHashMap = iVar.f33880b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f33882d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.f33885g));
        return bundle;
    }

    @Override // z4.m
    public void addMenuProvider(z4.p provider) {
        kotlin.jvm.internal.m.f(provider, "provider");
        z4.o oVar = this.menuHostHelper;
        oVar.f58877b.add(provider);
        oVar.f58876a.run();
    }

    public final void addOnContextAvailableListener(h.b listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        h.a aVar = this.contextAwareHelper;
        aVar.getClass();
        n nVar = aVar.f29901b;
        if (nVar != null) {
            listener.a(nVar);
        }
        aVar.f29900a.add(listener);
    }

    @Override // n4.u
    public final void addOnMultiWindowModeChangedListener(y4.a listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(y4.a listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // n4.v
    public final void addOnPictureInPictureModeChangedListener(y4.a listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // o4.f
    public final void addOnTrimMemoryListener(y4.a listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // i.j
    public final i.i getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        if (getApplication() != null) {
            CreationExtras.Key<Application> key = ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY;
            Application application = getApplication();
            kotlin.jvm.internal.m.e(application, "application");
            mutableCreationExtras.set(key, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, extras);
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public w getFullyDrawnReporter() {
        return (w) this.fullyDrawnReporter$delegate.getValue();
    }

    @qy.c
    public Object getLastCustomNonConfigurationInstance() {
        i iVar = (i) getLastNonConfigurationInstance();
        if (iVar != null) {
            return iVar.f26154a;
        }
        return null;
    }

    @Override // n4.h, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // f.f0
    public final d0 getOnBackPressedDispatcher() {
        return (d0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // da.g
    public final da.e getSavedStateRegistry() {
        return this.savedStateRegistryController.f23340b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this._viewModelStore = iVar.f26155b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
        ViewModelStore viewModelStore = this._viewModelStore;
        kotlin.jvm.internal.m.c(viewModelStore);
        return viewModelStore;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView, "window.decorView");
        ViewTreeLifecycleOwner.set(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView2, "window.decorView");
        ViewTreeViewModelStoreOwner.set(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView3, "window.decorView");
        fb.g0.B(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (this.activityResultRegistry.a(i11, i12, intent)) {
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.app.Activity
    @qy.c
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.m.f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<y4.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // n4.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        h.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f29901b = this;
        Iterator it = aVar.f29900a.iterator();
        while (it.hasNext()) {
            ((h.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        ReportFragment.Companion.injectIfNeededIn(this);
        int i11 = this.contentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i11, Menu menu) {
        kotlin.jvm.internal.m.f(menu, "menu");
        if (i11 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i11, menu);
        z4.o oVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = oVar.f58877b.iterator();
        while (it.hasNext()) {
            ((b1) ((z4.p) it.next())).f1625a.k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, MenuItem item) {
        kotlin.jvm.internal.m.f(item, "item");
        if (super.onMenuItemSelected(i11, item)) {
            return true;
        }
        if (i11 == 0) {
            return this.menuHostHelper.a(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @qy.c
    public void onMultiWindowModeChanged(boolean z11) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<y4.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new n4.i(z11));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.m.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator<y4.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, Menu menu) {
        kotlin.jvm.internal.m.f(menu, "menu");
        Iterator it = this.menuHostHelper.f58877b.iterator();
        while (it.hasNext()) {
            ((b1) ((z4.p) it.next())).f1625a.q(menu);
        }
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity
    @qy.c
    public void onPictureInPictureModeChanged(boolean z11) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<y4.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new n4.w(z11));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i11, View view, Menu menu) {
        kotlin.jvm.internal.m.f(menu, "menu");
        if (i11 != 0) {
            return true;
        }
        super.onPreparePanel(i11, view, menu);
        Iterator it = this.menuHostHelper.f58877b.iterator();
        while (it.hasNext()) {
            ((b1) ((z4.p) it.next())).f1625a.t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.m.f(permissions, "permissions");
        kotlin.jvm.internal.m.f(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i11, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i11, permissions, grantResults);
    }

    @qy.c
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            viewModelStore = iVar.f26155b;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f26154a = objOnRetainCustomNonConfigurationInstance;
        iVar2.f26155b = viewModelStore;
        return iVar2;
    }

    @Override // n4.h, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.m.f(outState, "outState");
        if (getLifecycle() instanceof LifecycleRegistry) {
            Lifecycle lifecycle = getLifecycle();
            kotlin.jvm.internal.m.d(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        super.onTrimMemory(i11);
        Iterator<y4.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i11));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f29901b;
    }

    public final <I, O> i.c registerForActivityResult(j.a contract, i.i registry, i.b callback) {
        kotlin.jvm.internal.m.f(contract, "contract");
        kotlin.jvm.internal.m.f(registry, "registry");
        kotlin.jvm.internal.m.f(callback, "callback");
        return registry.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // z4.m
    public void removeMenuProvider(z4.p provider) {
        kotlin.jvm.internal.m.f(provider, "provider");
        this.menuHostHelper.b(provider);
    }

    @Override // o4.e
    public final void removeOnConfigurationChangedListener(y4.a listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(h.b listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        h.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f29900a.remove(listener);
    }

    @Override // n4.u
    public final void removeOnMultiWindowModeChangedListener(y4.a listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(y4.a listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // n4.v
    public final void removeOnPictureInPictureModeChangedListener(y4.a listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // o4.f
    public final void removeOnTrimMemoryListener(y4.a listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        kotlin.jvm.internal.m.f(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (v10.c.A()) {
                Trace.beginSection(v10.c.L("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            w fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f26169a) {
                try {
                    fullyDrawnReporter.f26170b = true;
                    ArrayList arrayList = fullyDrawnReporter.f26171c;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((fz.a) obj).invoke();
                    }
                    fullyDrawnReporter.f26171c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i11) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView, "window.decorView");
        ((k) jVar).a(decorView);
        super.setContentView(i11);
    }

    @Override // android.app.Activity
    @qy.c
    public void startActivityForResult(Intent intent, int i11) {
        kotlin.jvm.internal.m.f(intent, "intent");
        super.startActivityForResult(intent, i11);
    }

    @Override // android.app.Activity
    @qy.c
    public void startIntentSenderForResult(IntentSender intent, int i11, Intent intent2, int i12, int i13, int i14) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.m.f(intent, "intent");
        super.startIntentSenderForResult(intent, i11, intent2, i12, i13, i14);
    }

    @Override // o4.e
    public final void addOnConfigurationChangedListener(y4.a aVar) {
        kotlin.jvm.internal.m.f(aVar, MzwEyWCkjXL.rdgcUdpZNmQPFo);
        this.onConfigurationChangedListeners.add(aVar);
    }

    @Override // android.app.Activity
    @qy.c
    public void startActivityForResult(Intent intent, int i11, Bundle bundle) {
        kotlin.jvm.internal.m.f(intent, "intent");
        super.startActivityForResult(intent, i11, bundle);
    }

    @Override // android.app.Activity
    @qy.c
    public void startIntentSenderForResult(IntentSender intent, int i11, Intent intent2, int i12, int i13, int i14, Bundle bundle) {
        kotlin.jvm.internal.m.f(intent, "intent");
        super.startIntentSenderForResult(intent, i11, intent2, i12, i13, i14, bundle);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView, DytezVyM.lUKAOSx);
        ((k) jVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public final <I, O> i.c registerForActivityResult(j.a contract, i.b callback) {
        kotlin.jvm.internal.m.f(contract, "contract");
        kotlin.jvm.internal.m.f(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z11, Configuration newConfig) {
        kotlin.jvm.internal.m.f(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z11, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<y4.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new n4.i(z11));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z11, Configuration newConfig) {
        kotlin.jvm.internal.m.f(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z11, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<y4.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new n4.w(z11));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView, "window.decorView");
        ((k) jVar).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(z4.p provider, LifecycleOwner owner) {
        kotlin.jvm.internal.m.f(provider, "provider");
        kotlin.jvm.internal.m.f(owner, "owner");
        z4.o oVar = this.menuHostHelper;
        oVar.f58877b.add(provider);
        oVar.f58876a.run();
        Lifecycle lifecycle = owner.getLifecycle();
        HashMap map = oVar.f58878c;
        z4.n nVar = (z4.n) map.remove(provider);
        if (nVar != null) {
            nVar.f58873a.removeObserver(nVar.f58874b);
            nVar.f58874b = null;
        }
        map.put(provider, new z4.n(lifecycle, new androidx.lifecycle.compose.g(4, oVar, provider)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.e(decorView, "window.decorView");
        ((k) jVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(z4.p provider, LifecycleOwner owner, Lifecycle.State state) {
        kotlin.jvm.internal.m.f(provider, "provider");
        kotlin.jvm.internal.m.f(owner, "owner");
        kotlin.jvm.internal.m.f(state, "state");
        z4.o oVar = this.menuHostHelper;
        oVar.getClass();
        Lifecycle lifecycle = owner.getLifecycle();
        HashMap map = oVar.f58878c;
        z4.n nVar = (z4.n) map.remove(provider);
        if (nVar != null) {
            nVar.f58873a.removeObserver(nVar.f58874b);
            nVar.f58874b = null;
        }
        map.put(provider, new z4.n(lifecycle, new androidx.lifecycle.compose.e(oVar, state, provider, 3)));
    }
}
