package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy.a f8204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oy.a f8205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oy.a f8206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oy.a f8207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oy.a f8208e;

    public SQLiteEventStore_Factory(TimeModule_EventClockFactory timeModule_EventClockFactory, TimeModule_UptimeClockFactory timeModule_UptimeClockFactory, EventStoreModule_StoreConfigFactory eventStoreModule_StoreConfigFactory, oy.a aVar, oy.a aVar2) {
        this.f8204a = timeModule_EventClockFactory;
        this.f8205b = timeModule_UptimeClockFactory;
        this.f8206c = eventStoreModule_StoreConfigFactory;
        this.f8207d = aVar;
        this.f8208e = aVar2;
    }

    @Override // oy.a
    public final Object get() {
        return new SQLiteEventStore((Clock) this.f8204a.get(), (Clock) this.f8205b.get(), (EventStoreConfig) this.f8206c.get(), (SchemaManager) this.f8207d.get(), this.f8208e);
    }
}
