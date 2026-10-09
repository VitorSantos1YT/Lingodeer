package com.google.firebase.inappmessaging.dagger.internal;

import com.google.firebase.inappmessaging.dagger.Lazy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DoubleCheck<T> implements Provider<T>, Lazy<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f19715c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Provider f19716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f19717b;

    public static Provider a(Factory factory) {
        factory.getClass();
        if (factory instanceof DoubleCheck) {
            return factory;
        }
        DoubleCheck doubleCheck = new DoubleCheck();
        doubleCheck.f19717b = f19715c;
        doubleCheck.f19716a = factory;
        return doubleCheck;
    }

    @Override // oy.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f19717b;
        Object obj3 = f19715c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f19717b;
            if (obj == obj3) {
                obj = this.f19716a.get();
                Object obj4 = this.f19717b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f19717b = obj;
                this.f19716a = null;
            }
        }
        return obj;
    }
}
