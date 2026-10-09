package com.google.firebase.database.core;

import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.database.android.AndroidEventTarget;
import com.google.firebase.database.android.AndroidPlatform;
import com.google.firebase.database.core.utilities.DefaultRunLoop;
import com.google.firebase.database.logging.AndroidLogger;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.logging.Logger;
import hh.p0;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Context {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AndroidLogger f19192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AndroidEventTarget f19193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AndroidAuthTokenProvider f19194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AndroidAppCheckTokenProvider f19195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RunLoop f19196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f19197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f19198g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FirebaseApp f19200i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AndroidPlatform f19203l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Logger.Level f19199h = Logger.Level.INFO;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19201j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19202k = false;

    public final ScheduledExecutorService a() {
        RunLoop runLoop = this.f19196e;
        if (runLoop instanceof DefaultRunLoop) {
            return ((DefaultRunLoop) runLoop).f19411a;
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    public final LogWrapper b(String str) {
        return new LogWrapper(this.f19192a, str, null);
    }

    public final AndroidPlatform c() {
        if (this.f19203l == null) {
            synchronized (this) {
                this.f19203l = new AndroidPlatform(this.f19200i);
            }
        }
        return this.f19203l;
    }

    public final void d() {
        if (this.f19192a == null) {
            c().getClass();
            this.f19192a = new AndroidLogger(this.f19199h);
        }
        c();
        if (this.f19198g == null) {
            c().getClass();
            this.f19198g = ep.a.e("Firebase/5/22.0.1/", p0.i(Build.VERSION.SDK_INT, "/Android", new StringBuilder()));
        }
        if (this.f19193b == null) {
            c().getClass();
            this.f19193b = new AndroidEventTarget();
        }
        if (this.f19196e == null) {
            this.f19196e = this.f19203l.b(this);
        }
        if (this.f19197f == null) {
            this.f19197f = "default";
        }
        Preconditions.h(this.f19194c, "You must register an authTokenProvider before initializing Context.");
        Preconditions.h(this.f19195d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    public final void e() {
        if (this.f19202k) {
            this.f19193b.getClass();
            this.f19196e.a();
            this.f19202k = false;
        }
    }
}
