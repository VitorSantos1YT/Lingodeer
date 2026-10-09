package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.model.RateLimit;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class RateLimitModule_ProvidesAppForegroundRateLimitFactory implements Factory<RateLimit> {
    public static RateLimit a(RateLimitModule rateLimitModule) {
        rateLimitModule.getClass();
        RateLimit.Builder builderA = RateLimit.a();
        builderA.b();
        builderA.c();
        builderA.d(TimeUnit.DAYS.toMillis(1L));
        return builderA.a();
    }

    @Override // oy.a
    public final Object get() {
        a(null);
        throw null;
    }
}
