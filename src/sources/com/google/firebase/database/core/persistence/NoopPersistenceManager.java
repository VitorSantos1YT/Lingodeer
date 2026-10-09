package com.google.firebase.database.core.persistence;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.QuerySpec;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NoopPersistenceManager implements PersistenceManager {
    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public final void a(QuerySpec querySpec, HashSet hashSet, HashSet hashSet2) {
        char[] cArr = Utilities.f19432a;
    }

    @Override // com.google.firebase.database.core.persistence.PersistenceManager
    public final void b(QuerySpec querySpec, HashSet hashSet) {
        char[] cArr = Utilities.f19432a;
    }

    public final Object c(Callable callable) {
        char[] cArr = Utilities.f19432a;
        try {
            return callable.call();
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }
}
