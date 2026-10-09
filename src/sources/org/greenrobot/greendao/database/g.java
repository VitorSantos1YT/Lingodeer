package org.greenrobot.greendao.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteClosable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements a, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteClosable f45730a;

    public /* synthetic */ g(SQLiteClosable sQLiteClosable) {
        this.f45730a = sQLiteClosable;
    }

    @Override // org.greenrobot.greendao.database.d
    public long a() {
        return ((SQLiteStatement) this.f45730a).simpleQueryForLong();
    }

    @Override // org.greenrobot.greendao.database.d
    public void b() {
        ((SQLiteStatement) this.f45730a).execute();
    }

    @Override // org.greenrobot.greendao.database.a
    public Object c() {
        return (SQLiteDatabase) this.f45730a;
    }

    @Override // org.greenrobot.greendao.database.d
    public void close() {
        ((SQLiteStatement) this.f45730a).close();
    }

    @Override // org.greenrobot.greendao.database.a
    public Cursor d(String str, String[] strArr) {
        return ((SQLiteDatabase) this.f45730a).rawQuery(str, strArr);
    }

    @Override // org.greenrobot.greendao.database.a
    public boolean e() {
        return ((SQLiteDatabase) this.f45730a).isDbLockedByCurrentThread();
    }

    @Override // org.greenrobot.greendao.database.d
    public void f() {
        ((SQLiteStatement) this.f45730a).clearBindings();
    }

    @Override // org.greenrobot.greendao.database.d
    public void g(int i11, long j11) {
        ((SQLiteStatement) this.f45730a).bindLong(i11, j11);
    }

    @Override // org.greenrobot.greendao.database.d
    public Object h() {
        return (SQLiteStatement) this.f45730a;
    }

    @Override // org.greenrobot.greendao.database.d
    public long i() {
        return ((SQLiteStatement) this.f45730a).executeInsert();
    }

    @Override // org.greenrobot.greendao.database.a
    public void j() {
        ((SQLiteDatabase) this.f45730a).beginTransaction();
    }

    @Override // org.greenrobot.greendao.database.a
    public void k(String str) {
        ((SQLiteDatabase) this.f45730a).execSQL(str);
    }

    @Override // org.greenrobot.greendao.database.d
    public void l(int i11, String str) {
        ((SQLiteStatement) this.f45730a).bindString(i11, str);
    }

    @Override // org.greenrobot.greendao.database.a
    public d m(String str) {
        return new g(((SQLiteDatabase) this.f45730a).compileStatement(str));
    }

    @Override // org.greenrobot.greendao.database.a
    public void o() {
        ((SQLiteDatabase) this.f45730a).setTransactionSuccessful();
    }

    @Override // org.greenrobot.greendao.database.a
    public void r() {
        ((SQLiteDatabase) this.f45730a).endTransaction();
    }
}
