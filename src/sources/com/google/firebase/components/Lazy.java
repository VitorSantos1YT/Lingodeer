package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class Lazy<T> implements Provider<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f18123c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f18124a = f18123c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Provider f18125b;

    public Lazy(Provider provider) {
        this.f18125b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.f18124a;
        Object obj3 = f18123c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f18124a;
                if (obj == obj3) {
                    obj = this.f18125b.get();
                    this.f18124a = obj;
                    this.f18125b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
