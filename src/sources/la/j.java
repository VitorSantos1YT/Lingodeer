package la;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i implements ka.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f39867b;

    public j(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f39867b = sQLiteStatement;
    }

    public final int a() {
        return this.f39867b.executeUpdateDelete();
    }
}
