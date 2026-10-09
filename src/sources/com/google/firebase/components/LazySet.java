package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class LazySet<T> implements Provider<Set<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f18126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f18127b;

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        if (this.f18127b == null) {
            synchronized (this) {
                try {
                    if (this.f18127b == null) {
                        this.f18127b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f18126a.iterator();
                                while (it.hasNext()) {
                                    this.f18127b.add(((Provider) it.next()).get());
                                }
                                this.f18126a = null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return Collections.unmodifiableSet(this.f18127b);
    }
}
