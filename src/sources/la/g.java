package la;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {
    public static final /* synthetic */ int H = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm.a f39853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c7.f f39854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ma.a f39857f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f39858t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final dm.a aVar, final c7.f callback, boolean z11) {
        String string;
        super(context, str, null, callback.f6652b, new DatabaseErrorHandler() { // from class: la.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i11 = g.H;
                m.c(sQLiteDatabase);
                b bVarZ = com.bumptech.glide.f.z(aVar, sQLiteDatabase);
                callback.getClass();
                SQLiteDatabase sQLiteDatabase2 = bVarZ.f39846a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        c7.f.b(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object second = ((Pair) it.next()).second;
                                m.e(second, "second");
                                c7.f.b((String) second);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                c7.f.b(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    bVarZ.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        m.f(context, "context");
        m.f(callback, "callback");
        this.f39852a = context;
        this.f39853b = aVar;
        this.f39854c = callback;
        this.f39855d = z11;
        if (str == null) {
            string = UUID.randomUUID().toString();
            m.e(string, "toString(...)");
        } else {
            string = str;
        }
        this.f39857f = new ma.a(string, context.getCacheDir(), false);
    }

    public final ka.a a(boolean z11) {
        ma.a aVar = this.f39857f;
        try {
            aVar.a((this.f39858t || getDatabaseName() == null) ? false : true);
            this.f39856e = false;
            SQLiteDatabase sQLiteDatabaseB = b(z11);
            if (!this.f39856e) {
                return com.bumptech.glide.f.z(this.f39853b, sQLiteDatabaseB);
            }
            close();
            return a(z11);
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase b(boolean z11) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z12 = this.f39858t;
        Context context = this.f39852a;
        if (databaseName != null && !z12 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            if (z11) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                m.c(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            m.c(readableDatabase3);
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z11) {
                    readableDatabase2 = getWritableDatabase();
                    m.c(readableDatabase2);
                } else {
                    readableDatabase2 = getReadableDatabase();
                    m.c(readableDatabase2);
                }
                return readableDatabase2;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof d) {
                    d dVar = (d) th;
                    int i11 = f.f39851a[dVar.f39849a.ordinal()];
                    th = dVar.f39850b;
                    if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                        throw th;
                    }
                    if (i11 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f39855d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z11) {
                        readableDatabase = getWritableDatabase();
                        m.c(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        m.c(readableDatabase);
                    }
                    return readableDatabase;
                } catch (d e8) {
                    throw e8.f39850b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        ma.a aVar = this.f39857f;
        try {
            aVar.a(aVar.f41101a);
            super.close();
            this.f39853b.f23485b = null;
            this.f39858t = false;
        } finally {
            aVar.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        m.f(db2, "db");
        boolean z11 = this.f39856e;
        c7.f fVar = this.f39854c;
        if (!z11 && fVar.f6652b != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            fVar.g(com.bumptech.glide.f.z(this.f39853b, db2));
        } catch (Throwable th2) {
            throw new d(e.ON_CONFIGURE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        m.f(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f39854c.h(com.bumptech.glide.f.z(this.f39853b, sqLiteDatabase));
        } catch (Throwable th2) {
            throw new d(e.ON_CREATE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i11, int i12) {
        m.f(db2, "db");
        this.f39856e = true;
        try {
            this.f39854c.k(com.bumptech.glide.f.z(this.f39853b, db2), i11, i12);
        } catch (Throwable th2) {
            throw new d(e.ON_DOWNGRADE, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        m.f(db2, "db");
        if (!this.f39856e) {
            try {
                this.f39854c.l(com.bumptech.glide.f.z(this.f39853b, db2));
            } catch (Throwable th2) {
                throw new d(e.ON_OPEN, th2);
            }
        }
        this.f39858t = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i11, int i12) {
        m.f(sqLiteDatabase, "sqLiteDatabase");
        this.f39856e = true;
        try {
            this.f39854c.m(com.bumptech.glide.f.z(this.f39853b, sqLiteDatabase), i11, i12);
        } catch (Throwable th2) {
            throw new d(e.ON_UPGRADE, th2);
        }
    }
}
