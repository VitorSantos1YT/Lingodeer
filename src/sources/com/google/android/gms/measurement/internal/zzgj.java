package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgj extends com.google.android.gms.internal.measurement.zzcb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzgl f12911a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgj(zzgl zzglVar, Context context) {
        super(context, "google_app_measurement_local.db");
        this.f12911a = zzglVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e8) {
            throw e8;
        } catch (SQLiteException unused) {
            zzgl zzglVar = this.f12911a;
            zzic zzicVar = zzglVar.f13202a;
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Opening the local database failed, dropping and recreating it");
            if (!zzicVar.f13094a.getDatabasePath("google_app_measurement_local.db").delete()) {
                zzgu zzguVar2 = zzicVar.f13099f;
                zzic.m(zzguVar2);
                zzguVar2.f12942f.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e10) {
                zzgu zzguVar3 = zzglVar.f13202a.f13099f;
                zzic.m(zzguVar3);
                zzguVar3.f12942f.b(e10, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzgu zzguVar = this.f12911a.f13202a.f13099f;
        zzic.m(zzguVar);
        zzax.b(zzguVar, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        zzgu zzguVar = this.f12911a.f13202a.f13099f;
        zzic.m(zzguVar);
        zzax.a(zzguVar, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", zzgl.f12915e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }
}
