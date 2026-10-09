package org.greenrobot.greendao.database;

import net.sqlcipher.database.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteStatement f45729a;

    public f(SQLiteStatement sQLiteStatement) {
        this.f45729a = sQLiteStatement;
    }

    @Override // org.greenrobot.greendao.database.d
    public final long a() {
        return this.f45729a.simpleQueryForLong();
    }

    @Override // org.greenrobot.greendao.database.d
    public final void b() {
        this.f45729a.execute();
    }

    @Override // org.greenrobot.greendao.database.d
    public final void close() {
        this.f45729a.close();
    }

    @Override // org.greenrobot.greendao.database.d
    public final void f() {
        this.f45729a.clearBindings();
    }

    @Override // org.greenrobot.greendao.database.d
    public final void g(int i11, long j11) {
        this.f45729a.bindLong(i11, j11);
    }

    @Override // org.greenrobot.greendao.database.d
    public final Object h() {
        return this.f45729a;
    }

    @Override // org.greenrobot.greendao.database.d
    public final long i() {
        return this.f45729a.executeInsert();
    }

    @Override // org.greenrobot.greendao.database.d
    public final void l(int i11, String str) {
        this.f45729a.bindString(i11, str);
    }
}
