package com.google.android.gms.measurement.internal;

import am.rVFB.LwKl;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzgl extends zzg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f12915e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzgj f12916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12917d;

    public zzgl(zzic zzicVar) {
        super(zzicVar);
        this.f12916c = new zzgj(this, this.f13202a.f13094a);
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean j() {
        return false;
    }

    public final void k() {
        int iDelete;
        zzic zzicVar = this.f13202a;
        g();
        try {
            SQLiteDatabase sQLiteDatabaseM = m();
            if (sQLiteDatabaseM == null || (iDelete = sQLiteDatabaseM.delete("messages", null, null)) <= 0) {
                return;
            }
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12949n.b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e8) {
            zzgu zzguVar2 = zzicVar.f13099f;
            zzic.m(zzguVar2);
            zzguVar2.f12942f.b(e8, "Error resetting local analytics data. error");
        }
    }

    public final SQLiteDatabase m() {
        if (this.f12917d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f12916c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f12917d = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:73:0x011e A[Catch: all -> 0x0152, TRY_ENTER, TryCatch #9 {all -> 0x0152, blocks: (B:30:0x0086, B:32:0x008c, B:43:0x00ac, B:45:0x00cd, B:47:0x00d4, B:49:0x00dc, B:59:0x00f6, B:73:0x011e, B:75:0x0124, B:76:0x0127, B:93:0x0159, B:83:0x0142), top: B:109:0x0086 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0149  */
    /* JADX WARN: Code duplicated, block: B:88:0x014e A[PHI: r8 r10 r17
      0x014e: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013a, B:96:0x016b, B:87:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
      (r10v5 android.database.sqlite.SQLiteDatabase)
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:79:0x013a, B:96:0x016b, B:87:0x014c] A[DONT_GENERATE, DONT_INLINE]
      0x014e: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013a, B:96:0x016b, B:87:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0168  */
    public final boolean n(byte[] bArr, int i11) {
        SQLiteDatabase sQLiteDatabaseM;
        boolean z11;
        boolean z12;
        Cursor cursorRawQuery;
        g();
        boolean z13 = false;
        z13 = false;
        if (!this.f12917d) {
            zzic zzicVar = this.f13202a;
            zzal zzalVar = zzicVar.f13097d;
            zzgu zzguVar = zzicVar.f13099f;
            zzfx zzfxVar = zzfy.W0;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarK = zzalVar.r(null, zzfxVar) ? zzicVar.r().k(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i11));
            contentValues.put("entry", bArr);
            if (zzicVar.f13097d.r(null, zzfxVar) && zzrVarK != null) {
                contentValues.put("app_version", zzrVarK.f13659c);
                contentValues.put("app_version_int", Long.valueOf(zzrVarK.L));
            }
            int i12 = 0;
            int i13 = 5;
            for (int i14 = 5; i12 < i14; i14 = 5) {
                try {
                    sQLiteDatabaseM = m();
                    if (sQLiteDatabaseM == null) {
                        this.f12917d = true;
                    } else {
                        try {
                            sQLiteDatabaseM.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseM.rawQuery("select count(1) from messages", null);
                            long j11 = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j11 = cursorRawQuery.getLong(z13 ? 1 : 0);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseM != null) {
                                            sQLiteDatabaseM.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z11 = z13 ? 1 : 0;
                                    SystemClock.sleep(i13);
                                    i13 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM != null) {
                                        sQLiteDatabaseM.close();
                                    }
                                    i12++;
                                    z13 = z11;
                                } catch (SQLiteFullException e8) {
                                    e = e8;
                                    z11 = z13 ? 1 : 0;
                                    zzic.m(zzguVar);
                                    zzguVar.f12942f.b(e, "Error writing entry; local database full");
                                    this.f12917d = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM != null) {
                                        sQLiteDatabaseM.close();
                                    }
                                    i12++;
                                    z13 = z11;
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    z11 = z13 ? 1 : 0;
                                    z12 = true;
                                    if (sQLiteDatabaseM != null) {
                                        sQLiteDatabaseM.endTransaction();
                                    }
                                    zzic.m(zzguVar);
                                    zzguVar.f12942f.b(e, "Error writing entry to local database");
                                    this.f12917d = z12;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseM != null) {
                                        sQLiteDatabaseM.close();
                                    }
                                    i12++;
                                    z13 = z11;
                                }
                            }
                            if (j11 >= 100000) {
                                zzic.m(zzguVar);
                                zzguVar.f12942f.a("Data loss, local db full");
                                long j12 = 100001 - j11;
                                long jDelete = sQLiteDatabaseM.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j12)});
                                if (jDelete != j12) {
                                    zzic.m(zzguVar);
                                    zzgs zzgsVar = zzguVar.f12942f;
                                    z11 = z13 ? 1 : 0;
                                    try {
                                        try {
                                            z12 = true;
                                            try {
                                                zzgsVar.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j12), Long.valueOf(jDelete), Long.valueOf(j12 - jDelete));
                                            } catch (SQLiteFullException e11) {
                                                e = e11;
                                                zzic.m(zzguVar);
                                                zzguVar.f12942f.b(e, "Error writing entry; local database full");
                                                this.f12917d = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM != null) {
                                                    sQLiteDatabaseM.close();
                                                }
                                                i12++;
                                                z13 = z11;
                                            } catch (SQLiteException e12) {
                                                e = e12;
                                                if (sQLiteDatabaseM != null) {
                                                    sQLiteDatabaseM.endTransaction();
                                                }
                                                zzic.m(zzguVar);
                                                zzguVar.f12942f.b(e, "Error writing entry to local database");
                                                this.f12917d = z12;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM != null) {
                                                    sQLiteDatabaseM.close();
                                                }
                                                i12++;
                                                z13 = z11;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i13);
                                            i13 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM != null) {
                                                sQLiteDatabaseM.close();
                                            }
                                            i12++;
                                            z13 = z11;
                                        }
                                    } catch (SQLiteFullException e13) {
                                        e = e13;
                                        zzic.m(zzguVar);
                                        zzguVar.f12942f.b(e, "Error writing entry; local database full");
                                        this.f12917d = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM != null) {
                                            sQLiteDatabaseM.close();
                                        }
                                        i12++;
                                        z13 = z11;
                                    } catch (SQLiteException e14) {
                                        e = e14;
                                        z12 = true;
                                        if (sQLiteDatabaseM != null && sQLiteDatabaseM.inTransaction()) {
                                            sQLiteDatabaseM.endTransaction();
                                        }
                                        zzic.m(zzguVar);
                                        zzguVar.f12942f.b(e, "Error writing entry to local database");
                                        this.f12917d = z12;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM != null) {
                                            sQLiteDatabaseM.close();
                                        }
                                        i12++;
                                        z13 = z11;
                                    }
                                } else {
                                    z11 = z13 ? 1 : 0;
                                    z12 = true;
                                }
                            } else {
                                z11 = z13 ? 1 : 0;
                                z12 = true;
                            }
                            sQLiteDatabaseM.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseM.setTransactionSuccessful();
                            sQLiteDatabaseM.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseM.close();
                            return z12;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z11 = z13 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e15) {
                            e = e15;
                            z11 = z13 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e16) {
                            e = e16;
                            z11 = z13 ? 1 : 0;
                            z12 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z11 = z13 ? 1 : 0;
                    sQLiteDatabaseM = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e17) {
                    e = e17;
                    z11 = z13 ? 1 : 0;
                    sQLiteDatabaseM = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e18) {
                    e = e18;
                    z11 = z13 ? 1 : 0;
                    z12 = true;
                    sQLiteDatabaseM = null;
                    cursorRawQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabaseM = null;
                }
            }
            boolean z14 = z13 ? 1 : 0;
            zzic.m(zzguVar);
            zzguVar.f12949n.a("Failed to write entry to local database");
            return z14;
        }
        return z13;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006e A[PHI: r4
      0x006e: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x007f, B:28:0x006c, B:25:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    public final void l() {
        g();
        if (this.f12917d) {
            return;
        }
        zzic zzicVar = this.f13202a;
        if (zzicVar.f13094a.getDatabasePath(LwKl.fSCOxynMhXmx).exists()) {
            int i11 = 5;
            for (int i12 = 0; i12 < 5; i12++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseM = m();
                        if (sQLiteDatabaseM == null) {
                            this.f12917d = true;
                            return;
                        }
                        sQLiteDatabaseM.beginTransaction();
                        sQLiteDatabaseM.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseM.setTransactionSuccessful();
                        sQLiteDatabaseM.endTransaction();
                        sQLiteDatabaseM.close();
                        return;
                    } catch (SQLiteException e8) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th2) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th2;
                            }
                        }
                        zzgu zzguVar = zzicVar.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12942f.b(e8, "Error deleting app launch break from local database");
                        this.f12917d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i11);
                    i11 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e10) {
                    zzgu zzguVar2 = zzicVar.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12942f.b(e10, "Error deleting app launch break from local database");
                    this.f12917d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            zzgu zzguVar3 = zzicVar.f13099f;
            zzic.m(zzguVar3);
            zzguVar3.f12945i.a("Error deleting app launch break from local database in reasonable time");
        }
    }
}
