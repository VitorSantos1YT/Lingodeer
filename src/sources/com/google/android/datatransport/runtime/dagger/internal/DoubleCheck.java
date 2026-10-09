package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import oy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DoubleCheck<T> implements a, Lazy<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f8065c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile a f8066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f8067b;

    public static a a(a aVar) {
        aVar.getClass();
        if (aVar instanceof DoubleCheck) {
            return aVar;
        }
        DoubleCheck doubleCheck = new DoubleCheck();
        doubleCheck.f8067b = f8065c;
        doubleCheck.f8066a = aVar;
        return doubleCheck;
    }

    @Override // oy.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f8067b;
        Object obj3 = f8065c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f8067b;
                if (obj == obj3) {
                    obj = this.f8066a.get();
                    Object obj4 = this.f8067b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f8067b = obj;
                    this.f8066a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
