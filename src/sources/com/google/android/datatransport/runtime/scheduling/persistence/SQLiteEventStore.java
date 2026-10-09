package com.google.android.datatransport.runtime.scheduling.persistence;

import am.rVFB.LwKl;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Encoding f8196f = new Encoding("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SchemaManager f8197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f8198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f8199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EventStoreConfig f8200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oy.a f8201e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Function<T, U> {
        Object apply(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Metadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8203b;

        public Metadata(String str, String str2) {
            this.f8202a = str;
            this.f8203b = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Producer<T> {
    }

    public SQLiteEventStore(Clock clock, Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager, oy.a aVar) {
        this.f8197a = schemaManager;
        this.f8198b = clock;
        this.f8199c = clock2;
        this.f8200d = eventStoreConfig;
        this.f8201e = aVar;
    }

    public static String p(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((PersistedEvent) it.next()).b());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object q(Cursor cursor, Function function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final Iterable E(final TransportContext transportContext) {
        return (Iterable) h(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SQLiteEventStore sQLiteEventStore = this.f8223a;
                EventStoreConfig eventStoreConfig = sQLiteEventStore.f8200d;
                int iC = eventStoreConfig.c();
                TransportContext transportContext2 = transportContext;
                ArrayList arrayListI = sQLiteEventStore.i(sQLiteDatabase, transportContext2, iC);
                for (Priority priority : Priority.values()) {
                    if (priority != transportContext2.d()) {
                        int iC2 = eventStoreConfig.c() - arrayListI.size();
                        if (iC2 <= 0) {
                            break;
                        }
                        arrayListI.addAll(sQLiteEventStore.i(sQLiteDatabase, transportContext2.e(priority), iC2));
                    }
                }
                HashMap map = new HashMap();
                StringBuilder sb2 = new StringBuilder("event_id IN (");
                for (int i11 = 0; i11 < arrayListI.size(); i11++) {
                    sb2.append(((PersistedEvent) arrayListI.get(i11)).b());
                    if (i11 < arrayListI.size() - 1) {
                        sb2.append(',');
                    }
                }
                sb2.append(')');
                SQLiteEventStore.q(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new f(map, 1));
                ListIterator listIterator = arrayListI.listIterator();
                while (listIterator.hasNext()) {
                    PersistedEvent persistedEvent = (PersistedEvent) listIterator.next();
                    if (map.containsKey(Long.valueOf(persistedEvent.b()))) {
                        EventInternal.Builder builderN = persistedEvent.a().n();
                        for (SQLiteEventStore.Metadata metadata : (Set) map.get(Long.valueOf(persistedEvent.b()))) {
                            builderN.a(metadata.f8202a, metadata.f8203b);
                        }
                        listIterator.set(new AutoValue_PersistedEvent(persistedEvent.b(), persistedEvent.c(), builderN.b()));
                    }
                }
                return arrayListI;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final void J0(final long j11, final TransportContext transportContext) {
        h(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.f8196f;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j11));
                TransportContext transportContext2 = transportContext;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext2.b(), String.valueOf(PriorityMapping.a(transportContext2.d()))}) < 1) {
                    contentValues.put("backend_name", transportContext2.b());
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.a(transportContext2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final PersistedEvent W0(TransportContext transportContext, EventInternal eventInternal) {
        Priority priorityD = transportContext.d();
        eventInternal.l();
        if (Log.isLoggable(Logging.b("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(priorityD);
        }
        long jLongValue = ((Long) h(new b(this, eventInternal, transportContext, 1))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new AutoValue_PersistedEvent(jLongValue, transportContext, eventInternal);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final Iterable X() {
        return (Iterable) h(new a(0));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public final void a() {
        h(new f(this, 0));
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public final Object b(SynchronizationGuard.CriticalSection criticalSection) {
        SQLiteDatabase sQLiteDatabaseE = e();
        Clock clock = this.f8199c;
        long jA = clock.a();
        while (true) {
            try {
                sQLiteDatabaseE.beginTransaction();
                try {
                    Object objB = criticalSection.b();
                    sQLiteDatabaseE.setTransactionSuccessful();
                    return objB;
                } finally {
                    sQLiteDatabaseE.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e8) {
                if (clock.a() >= ((long) this.f8200d.a()) + jA) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public final ClientMetrics c() {
        int i11 = ClientMetrics.f8069e;
        ClientMetrics.Builder builder = new ClientMetrics.Builder();
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseE = e();
        sQLiteDatabaseE.beginTransaction();
        try {
            ClientMetrics clientMetrics = (ClientMetrics) q(sQLiteDatabaseE.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new b(this, map, builder, 0));
            sQLiteDatabaseE.setTransactionSuccessful();
            return clientMetrics;
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f8197a.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public final void d(final long j11, final LogEventDropped.Reason reason, final String str) {
        h(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.f8196f;
                LogEventDropped.Reason reason2 = reason;
                String string = Integer.toString(reason2.d());
                String str2 = str;
                boolean zBooleanValue = ((Boolean) SQLiteEventStore.q(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string}), new a(2))).booleanValue();
                long j12 = j11;
                if (zBooleanValue) {
                    sQLiteDatabase.execSQL(p.m(j12, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str2, Integer.toString(reason2.d())});
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(reason2.d()));
                    contentValues.put("events_dropped_count", Long.valueOf(j12));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final long d1(TransportContext transportContext) {
        Cursor cursorRawQuery = e().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.b(), String.valueOf(PriorityMapping.a(transportContext.d()))});
        try {
            Cursor cursor = cursorRawQuery;
            return (cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    public final SQLiteDatabase e() {
        SchemaManager schemaManager = this.f8197a;
        Objects.requireNonNull(schemaManager);
        Clock clock = this.f8199c;
        long jA = clock.a();
        while (true) {
            try {
                return schemaManager.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e8) {
                if (clock.a() >= ((long) this.f8200d.a()) + jA) {
                    throw new SynchronizationException("Timed out while trying to open db.", e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final boolean g1(TransportContext transportContext) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseE = e();
        sQLiteDatabaseE.beginTransaction();
        try {
            Long lF = f(sQLiteDatabaseE, transportContext);
            if (lF == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = e().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lF.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            }
            sQLiteDatabaseE.setTransactionSuccessful();
            sQLiteDatabaseE.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th3) {
            sQLiteDatabaseE.endTransaction();
            throw th3;
        }
    }

    public final Object h(Function function) {
        SQLiteDatabase sQLiteDatabaseE = e();
        sQLiteDatabaseE.beginTransaction();
        try {
            Object objApply = function.apply(sQLiteDatabaseE);
            sQLiteDatabaseE.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseE.endTransaction();
        }
    }

    public final ArrayList i(SQLiteDatabase sQLiteDatabase, TransportContext transportContext, int i11) {
        ArrayList arrayList = new ArrayList();
        Long lF = f(sQLiteDatabase, transportContext);
        if (lF == null) {
            return arrayList;
        }
        q(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lF.toString()}, null, null, null, String.valueOf(i11)), new b(this, arrayList, transportContext, 2));
        return arrayList;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final void o1(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + p(iterable);
            SQLiteDatabase sQLiteDatabaseE = e();
            sQLiteDatabaseE.beginTransaction();
            try {
                sQLiteDatabaseE.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseE.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = cursorRawQuery;
                    while (cursor.moveToNext()) {
                        d(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseE.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseE.setTransactionSuccessful();
                    sQLiteDatabaseE.endTransaction();
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                sQLiteDatabaseE.endTransaction();
                throw th3;
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final int t() {
        long jA = this.f8198b.a() - this.f8200d.b();
        SQLiteDatabase sQLiteDatabaseE = e();
        sQLiteDatabaseE.beginTransaction();
        try {
            String[] strArr = {String.valueOf(jA)};
            Cursor cursorRawQuery = sQLiteDatabaseE.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            try {
                Cursor cursor = cursorRawQuery;
                while (cursor.moveToNext()) {
                    d(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                cursorRawQuery.close();
                int iDelete = sQLiteDatabaseE.delete("events", "timestamp_ms < ?", strArr);
                sQLiteDatabaseE.setTransactionSuccessful();
                sQLiteDatabaseE.endTransaction();
                return iDelete;
            } catch (Throwable th2) {
                cursorRawQuery.close();
                throw th2;
            }
        } catch (Throwable th3) {
            sQLiteDatabaseE.endTransaction();
            throw th3;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final void u(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            e().compileStatement("DELETE FROM events WHERE _id in " + p(iterable)).execute();
        }
    }

    public static Long f(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transportContext.b(), String.valueOf(PriorityMapping.a(transportContext.d()))));
        if (transportContext.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query(LwKl.EKwNxKMsQmBgoTH, new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = cursorQuery;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }
}
