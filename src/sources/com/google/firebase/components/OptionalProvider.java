package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class OptionalProvider<T> implements Provider<T>, Deferred<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c3.a f18128c = new c3.a(22);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f18129d = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Deferred.DeferredHandler f18130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Provider f18131b;

    public OptionalProvider(c3.a aVar, Provider provider) {
        this.f18130a = aVar;
        this.f18131b = provider;
    }

    @Override // com.google.firebase.inject.Deferred
    public final void a(final Deferred.DeferredHandler deferredHandler) {
        Provider provider;
        Provider provider2;
        Provider provider3 = this.f18131b;
        b bVar = f18129d;
        if (provider3 != bVar) {
            deferredHandler.h(provider3);
            return;
        }
        synchronized (this) {
            provider = this.f18131b;
            if (provider != bVar) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler deferredHandler2 = this.f18130a;
                this.f18130a = new Deferred.DeferredHandler() { // from class: com.google.firebase.components.e
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void h(Provider provider4) {
                        deferredHandler2.h(provider4);
                        deferredHandler.h(provider4);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.h(provider);
        }
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        return this.f18131b.get();
    }
}
