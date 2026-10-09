package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8217a;

    public /* synthetic */ a(int i11) {
        this.f8217a = i11;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        int i11 = 1;
        switch (this.f8217a) {
            case 0:
                Encoding encoding = SQLiteEventStore.f8196f;
                return (List) SQLiteEventStore.q(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new a(i11));
            case 1:
                Cursor cursor = (Cursor) obj;
                Encoding encoding2 = SQLiteEventStore.f8196f;
                ArrayList arrayList = new ArrayList();
                while (cursor.moveToNext()) {
                    TransportContext.Builder builderA = TransportContext.a();
                    builderA.b(cursor.getString(1));
                    builderA.d(PriorityMapping.b(cursor.getInt(2)));
                    String string = cursor.getString(3);
                    builderA.c(string == null ? null : Base64.decode(string, 0));
                    arrayList.add(builderA.a());
                }
                return arrayList;
            default:
                Encoding encoding3 = SQLiteEventStore.f8196f;
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
        }
    }
}
