package org.greenrobot.greendao.database;

import android.content.Context;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
class SqlCipherEncryptedHelper extends SQLiteOpenHelper implements b {
    private final c delegate;

    public SqlCipherEncryptedHelper(c cVar, Context context, String str, int i11, boolean z11) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i11);
        this.delegate = cVar;
        if (z11) {
            SQLiteDatabase.loadLibs(context);
        }
    }

    private a wrap(SQLiteDatabase sQLiteDatabase) {
        return new e(sQLiteDatabase);
    }

    @Override // org.greenrobot.greendao.database.b
    public a getEncryptedReadableDb(String str) {
        return wrap(getReadableDatabase(str));
    }

    @Override // org.greenrobot.greendao.database.b
    public a getEncryptedWritableDb(String str) {
        return wrap(getWritableDatabase(str));
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.delegate.onCreate(wrap(sQLiteDatabase));
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        this.delegate.onOpen(wrap(sQLiteDatabase));
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        this.delegate.onUpgrade(wrap(sQLiteDatabase), i11, i12);
    }

    @Override // org.greenrobot.greendao.database.b
    public a getEncryptedReadableDb(char[] cArr) {
        return wrap(getReadableDatabase(cArr));
    }

    @Override // org.greenrobot.greendao.database.b
    public a getEncryptedWritableDb(char[] cArr) {
        return wrap(getWritableDatabase(cArr));
    }
}
