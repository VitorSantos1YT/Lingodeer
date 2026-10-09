package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy.a f8214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy.a f8215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oy.a f8216c;

    public SchemaManager_Factory(oy.a aVar, EventStoreModule_DbNameFactory eventStoreModule_DbNameFactory, EventStoreModule_SchemaVersionFactory eventStoreModule_SchemaVersionFactory) {
        this.f8214a = aVar;
        this.f8215b = eventStoreModule_DbNameFactory;
        this.f8216c = eventStoreModule_SchemaVersionFactory;
    }

    @Override // oy.a
    public final Object get() {
        return new SchemaManager(((Integer) this.f8216c.get()).intValue(), (Context) this.f8214a.get(), (String) this.f8215b.get());
    }
}
