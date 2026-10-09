package org.greenrobot.greendao.database;

import android.database.Cursor;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f45728a;

    public e(SQLiteDatabase sQLiteDatabase) {
        this.f45728a = sQLiteDatabase;
    }

    @Override // org.greenrobot.greendao.database.a
    public final Object c() {
        return this.f45728a;
    }

    @Override // org.greenrobot.greendao.database.a
    public final Cursor d(String str, String[] strArr) {
        return this.f45728a.rawQuery(str, strArr);
    }

    @Override // org.greenrobot.greendao.database.a
    public final boolean e() {
        return this.f45728a.isDbLockedByCurrentThread();
    }

    @Override // org.greenrobot.greendao.database.a
    public final void j() {
        this.f45728a.beginTransaction();
    }

    @Override // org.greenrobot.greendao.database.a
    public final void k(String str) {
        this.f45728a.execSQL(str);
    }

    @Override // org.greenrobot.greendao.database.a
    public final d m(String str) {
        return new f(this.f45728a.compileStatement(str));
    }

    @Override // org.greenrobot.greendao.database.a
    public final void o() {
        this.f45728a.setTransactionSuccessful();
    }

    @Override // org.greenrobot.greendao.database.a
    public final void r() {
        this.f45728a.endTransaction();
    }
}
