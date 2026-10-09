package com.google.firebase.sessions.dagger.internal;

import com.google.firebase.sessions.dagger.Lazy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f21047c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Provider f21048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f21049b;

    public static Provider a(Provider provider) {
        provider.getClass();
        if (provider instanceof DoubleCheck) {
            return provider;
        }
        DoubleCheck doubleCheck = new DoubleCheck();
        doubleCheck.f21049b = f21047c;
        doubleCheck.f21048a = provider;
        return doubleCheck;
    }

    @Override // oy.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f21049b;
        Object obj3 = f21047c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f21049b;
            if (obj == obj3) {
                obj = this.f21048a.get();
                Object obj4 = this.f21049b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f21049b = obj;
                this.f21048a = null;
            }
        }
        return obj;
    }
}
