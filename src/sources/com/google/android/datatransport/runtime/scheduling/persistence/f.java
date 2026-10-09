package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Encoding;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8228b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f8227a = i11;
        this.f8228b = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        int i11 = this.f8227a;
        Object obj2 = this.f8228b;
        switch (i11) {
            case 0:
                SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.f8196f;
                sQLiteEventStore.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sQLiteEventStore.f8198b.a()).execute();
                break;
            default:
                HashMap map = (HashMap) obj2;
                Cursor cursor = (Cursor) obj;
                Encoding encoding2 = SQLiteEventStore.f8196f;
                while (cursor.moveToNext()) {
                    long j11 = cursor.getLong(0);
                    Set hashSet = (Set) map.get(Long.valueOf(j11));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j11), hashSet);
                    }
                    hashSet.add(new SQLiteEventStore.Metadata(cursor.getString(1), cursor.getString(2)));
                }
                break;
        }
        return null;
    }
}
