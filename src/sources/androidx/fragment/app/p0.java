package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p0 extends f.n implements n4.a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final t0 mFragments = new t0(new o0(this));
    final LifecycleRegistry mFragmentLifecycleRegistry = new LifecycleRegistry(this);
    boolean mStopped = true;

    public p0() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new l0(this, 0));
        final int i11 = 0;
        addOnConfigurationChangedListener(new y4.a(this) { // from class: androidx.fragment.app.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f1746b;

            {
                this.f1746b = this;
            }

            @Override // y4.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f1746b.mFragments.a();
                        break;
                    default:
                        this.f1746b.mFragments.a();
                        break;
                }
            }
        });
        final int i12 = 1;
        addOnNewIntentListener(new y4.a(this) { // from class: androidx.fragment.app.m0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f1746b;

            {
                this.f1746b = this;
            }

            @Override // y4.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        this.f1746b.mFragments.a();
                        break;
                    default:
                        this.f1746b.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new h.b() { // from class: androidx.fragment.app.n0
            @Override // h.b
            public final void a(f.n nVar) {
                o0 o0Var = this.f1769a.mFragments.f1837a;
                o0Var.f1843d.b(o0Var, o0Var, null);
            }
        });
    }

    public static boolean i(k1 k1Var, Lifecycle.State state) {
        boolean zI = false;
        for (k0 k0Var : k1Var.f1711c.f()) {
            if (k0Var != null) {
                if (k0Var.getHost() != null) {
                    zI |= i(k0Var.getChildFragmentManager(), state);
                }
                i2 i2Var = k0Var.mViewLifecycleOwner;
                if (i2Var != null) {
                    i2Var.b();
                    if (i2Var.f1702e.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                        k0Var.mViewLifecycleOwner.f1702e.setCurrentState(state);
                        zI = true;
                    }
                }
                if (k0Var.mLifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    k0Var.mLifecycleRegistry.setCurrentState(state);
                    zI = true;
                }
            }
        }
        return zI;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f1837a.f1843d.f1714f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                v6.b.a(this).b(str2, printWriter);
            }
            this.mFragments.f1837a.f1843d.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public k1 getSupportFragmentManager() {
        return this.mFragments.f1837a.f1843d;
    }

    @Deprecated
    public v6.b getSupportLoaderManager() {
        return v6.b.a(this);
    }

    public void markFragmentsCreated() {
        while (i(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // f.n, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i11, i12, intent);
    }

    @Override // f.n, n4.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        l1 l1Var = this.mFragments.f1837a.f1843d;
        l1Var.I = false;
        l1Var.J = false;
        l1Var.P.f1781f = false;
        l1Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f1837a.f1843d.l();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // f.n, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 == 6) {
            return this.mFragments.f1837a.f1843d.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f1837a.f1843d.u(5);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // f.n, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f1837a.f1843d.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        l1 l1Var = this.mFragments.f1837a.f1843d;
        l1Var.I = false;
        l1Var.J = false;
        l1Var.P.f1781f = false;
        l1Var.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            l1 l1Var = this.mFragments.f1837a.f1843d;
            l1Var.I = false;
            l1Var.J = false;
            l1Var.P.f1781f = false;
            l1Var.u(4);
        }
        this.mFragments.f1837a.f1843d.z(true);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        l1 l1Var2 = this.mFragments.f1837a.f1843d;
        l1Var2.I = false;
        l1Var2.J = false;
        l1Var2.P.f1781f = false;
        l1Var2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        l1 l1Var = this.mFragments.f1837a.f1843d;
        l1Var.J = true;
        l1Var.P.f1781f = true;
        l1Var.u(4);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(n4.x xVar) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(n4.x xVar) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(k0 k0Var, Intent intent, int i11, Bundle bundle) {
        if (i11 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            k0Var.startActivityForResult(intent, i11, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(k0 k0Var, IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        if (i11 == -1) {
            startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
        } else {
            k0Var.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(k0 k0Var, Intent intent, int i11) {
        startActivityFromFragment(k0Var, intent, i11, (Bundle) null);
    }

    @Deprecated
    public void onAttachFragment(k0 k0Var) {
    }

    @Override // n4.a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i11) {
    }
}
