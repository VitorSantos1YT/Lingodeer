package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f8219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8221d;

    public /* synthetic */ b(SQLiteEventStore sQLiteEventStore, Object obj, Object obj2, int i11) {
        this.f8218a = i11;
        this.f8219b = sQLiteEventStore;
        this.f8220c = obj;
        this.f8221d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x033b A[PHI: r12
      0x033b: PHI (r12v8 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason) = 
      (r12v1 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r12v2 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r12v3 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r12v4 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r12v5 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r12v6 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
     binds: [B:90:0x0339, B:93:0x0343, B:96:0x034c, B:99:0x0355, B:102:0x035e, B:105:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        long jInsert;
        int i11 = this.f8218a;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        Object obj2 = this.f8221d;
        Object obj3 = this.f8220c;
        SQLiteEventStore sQLiteEventStore = this.f8219b;
        switch (i11) {
            case 0:
                HashMap map = (HashMap) obj3;
                ClientMetrics.Builder builder = (ClientMetrics.Builder) obj2;
                ArrayList arrayList = builder.f8075b;
                Cursor cursor = (Cursor) obj;
                Encoding encoding = SQLiteEventStore.f8196f;
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    int i15 = cursor.getInt(1);
                    LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
                    if (i15 != reason.d()) {
                        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                        if (i15 == reason2.d()) {
                            reason = reason2;
                        } else {
                            reason2 = LogEventDropped.Reason.CACHE_FULL;
                            if (i15 == reason2.d()) {
                                reason = reason2;
                            } else {
                                reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                                if (i15 == reason2.d()) {
                                    reason = reason2;
                                } else {
                                    reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                                    if (i15 == reason2.d()) {
                                        reason = reason2;
                                    } else {
                                        reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                        if (i15 == reason2.d()) {
                                            reason = reason2;
                                        } else {
                                            reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                            if (i15 == reason2.d()) {
                                                reason = reason2;
                                            } else {
                                                Logging.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i15));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    long j11 = cursor.getLong(2);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList());
                    }
                    List list = (List) map.get(string);
                    int i16 = LogEventDropped.f8081c;
                    LogEventDropped.Builder builder2 = new LogEventDropped.Builder();
                    builder2.f8085b = reason;
                    builder2.f8084a = j11;
                    list.add(new LogEventDropped(builder2.f8084a, builder2.f8085b));
                }
                for (Map.Entry entry : map.entrySet()) {
                    int i17 = LogSourceMetrics.f8086c;
                    LogSourceMetrics.Builder builder3 = new LogSourceMetrics.Builder();
                    builder3.f8089a = (String) entry.getKey();
                    builder3.f8090b = (List) entry.getValue();
                    arrayList.add(new LogSourceMetrics(builder3.f8089a, Collections.unmodifiableList(builder3.f8090b)));
                }
                final long jA = sQLiteEventStore.f8198b.a();
                builder.f8074a = (TimeWindow) sQLiteEventStore.h(new SQLiteEventStore.Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.c
                    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                    public final Object apply(Object obj4) {
                        long j12 = jA;
                        Encoding encoding2 = SQLiteEventStore.f8196f;
                        Cursor cursorRawQuery = ((SQLiteDatabase) obj4).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                        try {
                            Cursor cursor2 = cursorRawQuery;
                            Encoding encoding3 = SQLiteEventStore.f8196f;
                            cursor2.moveToNext();
                            long j13 = cursor2.getLong(0);
                            int i18 = TimeWindow.f8096c;
                            TimeWindow.Builder builder4 = new TimeWindow.Builder();
                            builder4.f8099a = j13;
                            builder4.f8100b = j12;
                            return new TimeWindow(builder4.f8099a, builder4.f8100b);
                        } finally {
                            cursorRawQuery.close();
                        }
                    }
                });
                int i18 = GlobalMetrics.f8078b;
                GlobalMetrics.Builder builder4 = new GlobalMetrics.Builder();
                int i19 = StorageMetrics.f8091c;
                StorageMetrics.Builder builder5 = new StorageMetrics.Builder();
                builder5.f8094a = sQLiteEventStore.e().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore.e().compileStatement("PRAGMA page_count").simpleQueryForLong();
                builder5.f8095b = EventStoreConfig.f8191a.f8178b;
                builder4.f8080a = new StorageMetrics(builder5.f8094a, builder5.f8095b);
                builder.f8076c = new GlobalMetrics(builder4.f8080a);
                builder.f8077d = (String) sQLiteEventStore.f8201e.get();
                return new ClientMetrics(builder.f8074a, Collections.unmodifiableList(arrayList), builder.f8076c, builder.f8077d);
            case 1:
                EventInternal eventInternal = (EventInternal) obj3;
                TransportContext transportContext = (TransportContext) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding2 = SQLiteEventStore.f8196f;
                long jSimpleQueryForLong = sQLiteEventStore.e().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore.e().compileStatement("PRAGMA page_count").simpleQueryForLong();
                EventStoreConfig eventStoreConfig = sQLiteEventStore.f8200d;
                if (jSimpleQueryForLong >= eventStoreConfig.e()) {
                    sQLiteEventStore.d(1L, LogEventDropped.Reason.CACHE_FULL, eventInternal.l());
                    return -1L;
                }
                Long lF = SQLiteEventStore.f(sQLiteDatabase, transportContext);
                if (lF != null) {
                    jInsert = lF.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", transportContext.b());
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.a(transportContext.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (transportContext.c() != null) {
                        contentValues.put("extras", Base64.encodeToString(transportContext.c(), 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int iD = eventStoreConfig.d();
                byte[] bArr = eventInternal.e().f8019b;
                boolean z11 = bArr.length <= iD;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", eventInternal.l());
                contentValues2.put("timestamp_ms", Long.valueOf(eventInternal.f()));
                contentValues2.put("uptime_ms", Long.valueOf(eventInternal.m()));
                contentValues2.put("payload_encoding", eventInternal.e().f8018a.f7804a);
                contentValues2.put("code", eventInternal.d());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z11));
                contentValues2.put("payload", z11 ? bArr : new byte[0]);
                contentValues2.put("product_id", eventInternal.j());
                contentValues2.put("pseudonymous_id", eventInternal.k());
                contentValues2.put("experiment_ids_clear_blob", eventInternal.g());
                contentValues2.put("experiment_ids_encrypted_blob", eventInternal.h());
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z11) {
                    int iCeil = (int) Math.ceil(((double) bArr.length) / ((double) iD));
                    for (int i21 = 1; i21 <= iCeil; i21++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i21 - 1) * iD, Math.min(i21 * iD, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i21));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry2 : Collections.unmodifiableMap(eventInternal.c()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry2.getKey());
                    contentValues4.put("value", (String) entry2.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                ArrayList arrayList2 = (ArrayList) obj3;
                TransportContext transportContext2 = (TransportContext) obj2;
                Cursor cursor2 = (Cursor) obj;
                Encoding encoding3 = SQLiteEventStore.f8196f;
                while (cursor2.moveToNext()) {
                    long j12 = cursor2.getLong(i13);
                    int i22 = cursor2.getInt(7) != 0 ? i14 : i13;
                    EventInternal.Builder builderA = EventInternal.a();
                    builderA.k(cursor2.getString(i14));
                    builderA.f(cursor2.getLong(i12));
                    builderA.l(cursor2.getLong(3));
                    if (i22 != 0) {
                        String string2 = cursor2.getString(4);
                        builderA.e(new EncodedPayload(string2 == null ? SQLiteEventStore.f8196f : new Encoding(string2), cursor2.getBlob(5)));
                    } else {
                        String string3 = cursor2.getString(4);
                        Encoding encoding4 = string3 == null ? SQLiteEventStore.f8196f : new Encoding(string3);
                        Cursor cursorQuery = sQLiteEventStore.e().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j12)}, null, null, "sequence_num");
                        try {
                            Cursor cursor3 = cursorQuery;
                            Encoding encoding5 = SQLiteEventStore.f8196f;
                            ArrayList arrayList3 = new ArrayList();
                            int length = i13;
                            while (cursor3.moveToNext()) {
                                byte[] blob = cursor3.getBlob(i13);
                                arrayList3.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr2 = new byte[length];
                            int i23 = i13;
                            int length2 = i23;
                            while (i23 < arrayList3.size()) {
                                byte[] bArr3 = (byte[]) arrayList3.get(i23);
                                int i24 = i23;
                                ArrayList arrayList4 = arrayList3;
                                System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
                                length2 += bArr3.length;
                                i23 = i24 + 1;
                                arrayList3 = arrayList4;
                            }
                            cursorQuery.close();
                            builderA.e(new EncodedPayload(encoding4, bArr2));
                        } catch (Throwable th2) {
                            cursorQuery.close();
                            throw th2;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        builderA.d(Integer.valueOf(cursor2.getInt(6)));
                    }
                    if (!cursor2.isNull(8)) {
                        builderA.i(Integer.valueOf(cursor2.getInt(8)));
                    }
                    if (!cursor2.isNull(9)) {
                        builderA.j(cursor2.getString(9));
                    }
                    if (!cursor2.isNull(10)) {
                        builderA.g(cursor2.getBlob(10));
                    }
                    if (!cursor2.isNull(11)) {
                        builderA.h(cursor2.getBlob(11));
                    }
                    arrayList2.add(new AutoValue_PersistedEvent(j12, transportContext2, builderA.b()));
                    i12 = 2;
                    i13 = 0;
                    i14 = 1;
                }
                return null;
        }
    }
}
