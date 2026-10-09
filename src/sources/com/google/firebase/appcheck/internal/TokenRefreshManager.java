package com.google.firebase.appcheck.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appcheck.internal.util.Clock;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class TokenRefreshManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefaultTokenRefresher f17835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock.DefaultClock f17836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f17837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f17838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f17839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f17840f;

    public TokenRefreshManager(Context context, DefaultFirebaseAppCheck defaultFirebaseAppCheck, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.g(context);
        DefaultTokenRefresher defaultTokenRefresher = new DefaultTokenRefresher(defaultFirebaseAppCheck, executor, scheduledExecutorService);
        Clock.DefaultClock defaultClock = new Clock.DefaultClock();
        this.f17835a = defaultTokenRefresher;
        this.f17836b = defaultClock;
        this.f17839e = -1L;
        BackgroundDetector.b((Application) context.getApplicationContext());
        BackgroundDetector.f8715e.a(new BackgroundDetector.BackgroundStateChangeListener(defaultTokenRefresher, defaultClock) { // from class: com.google.firebase.appcheck.internal.TokenRefreshManager.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ DefaultTokenRefresher f17841a;

            @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
            public final void a(boolean z11) {
                TokenRefreshManager.this.f17837c = z11;
                if (z11) {
                    this.f17841a.a();
                } else if (TokenRefreshManager.this.a()) {
                    this.f17841a.b(TokenRefreshManager.this.f17839e - System.currentTimeMillis());
                }
            }
        });
    }

    public final boolean a() {
        return this.f17840f && !this.f17837c && this.f17838d > 0 && this.f17839e != -1;
    }
}
