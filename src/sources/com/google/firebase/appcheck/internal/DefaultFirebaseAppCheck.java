package com.google.firebase.appcheck.internal;

import android.content.Context;
import bp.i;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckProvider;
import com.google.firebase.appcheck.AppCheckProviderFactory;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.FirebaseAppCheck;
import com.google.firebase.appcheck.internal.util.Clock;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class DefaultFirebaseAppCheck extends FirebaseAppCheck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseApp f17806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f17807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StorageHelper f17810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TokenRefreshManager f17811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f17812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f17813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f17814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Task f17815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Clock.DefaultClock f17816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AppCheckProviderFactory f17817l;
    public AppCheckProvider m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AppCheckToken f17818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Task f17819o;

    public DefaultFirebaseAppCheck(FirebaseApp firebaseApp, Provider provider, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.g(firebaseApp);
        Preconditions.g(provider);
        this.f17806a = firebaseApp;
        this.f17807b = provider;
        this.f17808c = new ArrayList();
        this.f17809d = new ArrayList();
        firebaseApp.b();
        final Context context = firebaseApp.f17714a;
        String strG = firebaseApp.g();
        StorageHelper storageHelper = new StorageHelper();
        Preconditions.g(context);
        Preconditions.d(strG);
        final String str = "com.google.firebase.appcheck.store." + strG;
        storageHelper.f17833a = new Lazy(new Provider() { // from class: com.google.firebase.appcheck.internal.b
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return context.getSharedPreferences(str, 0);
            }
        });
        this.f17810e = storageHelper;
        firebaseApp.b();
        this.f17811f = new TokenRefreshManager(context, this, executor2, scheduledExecutorService);
        this.f17812g = executor;
        this.f17813h = executor2;
        this.f17814i = executor3;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new a(this, taskCompletionSource, 1));
        this.f17815j = taskCompletionSource.getTask();
        this.f17816k = new Clock.DefaultClock();
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public final Task a(boolean z11) {
        return this.f17815j.continueWithTask(this.f17813h, new i(this, z11));
    }

    @Override // com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider
    public final void b(com.google.firebase.database.android.b bVar) {
        this.f17808c.add(bVar);
        TokenRefreshManager tokenRefreshManager = this.f17811f;
        int size = this.f17809d.size() + this.f17808c.size();
        if (tokenRefreshManager.f17838d == 0 && size > 0) {
            tokenRefreshManager.f17838d = size;
            if (tokenRefreshManager.a()) {
                DefaultTokenRefresher defaultTokenRefresher = tokenRefreshManager.f17835a;
                long j11 = tokenRefreshManager.f17839e;
                tokenRefreshManager.f17836b.getClass();
                defaultTokenRefresher.b(j11 - System.currentTimeMillis());
            }
        } else if (tokenRefreshManager.f17838d > 0 && size == 0) {
            tokenRefreshManager.f17835a.a();
        }
        tokenRefreshManager.f17838d = size;
        if (e()) {
            bVar.a(DefaultAppCheckTokenResult.c(this.f17818n));
        }
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public final void c(AppCheckProviderFactory appCheckProviderFactory) {
        boolean zK = this.f17806a.k();
        Preconditions.g(appCheckProviderFactory);
        this.f17817l = appCheckProviderFactory;
        this.m = appCheckProviderFactory.a(this.f17806a);
        this.f17811f.f17840f = zK;
    }

    @Override // com.google.firebase.appcheck.FirebaseAppCheck
    public final void d() {
        this.f17811f.f17840f = true;
    }

    public final boolean e() {
        AppCheckToken appCheckToken = this.f17818n;
        if (appCheckToken == null) {
            return false;
        }
        long jA = appCheckToken.a();
        this.f17816k.getClass();
        return jA - System.currentTimeMillis() > 300000;
    }
}
