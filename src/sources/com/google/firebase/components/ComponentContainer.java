package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface ComponentContainer {
    default Object a(Class cls) {
        return f(Qualified.a(cls));
    }

    Provider b(Qualified qualified);

    default Provider c(Class cls) {
        return b(Qualified.a(cls));
    }

    default Set d(Qualified qualified) {
        return (Set) e(qualified).get();
    }

    Provider e(Qualified qualified);

    default Object f(Qualified qualified) {
        Provider providerB = b(qualified);
        if (providerB == null) {
            return null;
        }
        return providerB.get();
    }

    default Set g(Class cls) {
        return d(Qualified.a(cls));
    }

    Deferred h(Qualified qualified);

    default Deferred i(Class cls) {
        return h(Qualified.a(cls));
    }
}
