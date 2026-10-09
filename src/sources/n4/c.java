package n4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f43186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43188d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f43189e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f43190f = false;

    public c(Activity activity) {
        this.f43186b = activity;
        this.f43187c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f43186b == activity) {
            this.f43186b = null;
            this.f43189e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f43189e || this.f43190f || this.f43188d) {
            return;
        }
        Object obj = this.f43185a;
        try {
            Object obj2 = d.f43193c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f43187c) {
                d.f43197g.postAtFrontOfQueue(new aw.t(d.f43192b.get(activity), obj2, false, 14));
                this.f43190f = true;
                this.f43185a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f43186b == activity) {
            this.f43188d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
