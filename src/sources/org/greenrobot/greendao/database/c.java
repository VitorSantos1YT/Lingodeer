package org.greenrobot.greendao.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends SQLiteOpenHelper {
    private final Context context;
    private b encryptedHelper;
    private boolean loadSQLCipherNativeLibs;
    private final String name;
    private final int version;

    public c(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
        super(context, str, cursorFactory, 31);
        this.loadSQLCipherNativeLibs = true;
        this.context = context;
        this.name = str;
        this.version = 31;
    }

    public final b a() {
        if (this.encryptedHelper == null) {
            try {
                Class.forName("net.sqlcipher.database.SQLiteOpenHelper");
                try {
                    this.encryptedHelper = (b) Class.forName("org.greenrobot.greendao.database.SqlCipherEncryptedHelper").getConstructor(c.class, Context.class, String.class, Integer.TYPE, Boolean.TYPE).newInstance(this, this.context, this.name, Integer.valueOf(this.version), Boolean.valueOf(this.loadSQLCipherNativeLibs));
                } catch (Exception e8) {
                    DaoException daoException = new DaoException();
                    try {
                        daoException.initCause(e8);
                        throw daoException;
                    } catch (Throwable unused) {
                        throw daoException;
                    }
                }
            } catch (ClassNotFoundException unused2) {
                throw new DaoException("Using an encrypted database requires SQLCipher, make sure to add it to dependencies: https://greenrobot.org/greendao/documentation/database-encryption/");
            }
        }
        return this.encryptedHelper;
    }

    public a getEncryptedReadableDb(String str) {
        return a().getEncryptedReadableDb(str);
    }

    public a getEncryptedWritableDb(String str) {
        return a().getEncryptedWritableDb(str);
    }

    public a getReadableDb() {
        return wrap(getReadableDatabase());
    }

    public a getWritableDb() {
        return wrap(getWritableDatabase());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        onCreate(wrap(sQLiteDatabase));
    }

    public abstract void onCreate(a aVar);

    public void onOpen(a aVar) {
    }

    public void onUpgrade(a aVar, int i11, int i12) {
    }

    public void setLoadSQLCipherNativeLibs(boolean z11) {
        this.loadSQLCipherNativeLibs = z11;
    }

    public a wrap(SQLiteDatabase sQLiteDatabase) {
        return new g(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        onOpen(wrap(sQLiteDatabase));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        onUpgrade(wrap(sQLiteDatabase), i11, i12);
    }

    public a getEncryptedReadableDb(char[] cArr) {
        return a().getEncryptedReadableDb(cArr);
    }

    public a getEncryptedWritableDb(char[] cArr) {
        return a().getEncryptedWritableDb(cArr);
    }
}
