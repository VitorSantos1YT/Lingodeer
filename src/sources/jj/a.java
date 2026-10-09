package jj;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import au.n0;
import cf.i;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.db.asserthelper.SQLiteAssetHelper$SQLiteAssetException;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.DbFileVersion;
import com.lingodeer.database.UserDataDatabase;
import defpackage.e;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;
import qy.q;
import rz.b1;
import rz.e0;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f36403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Env f36404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f36405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f36407f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f36408t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String name, SQLiteDatabase.CursorFactory cursorFactory, int i11, String assertName, Env env) {
        super(context, name, cursorFactory, i11);
        m.f(context, "context");
        m.f(name, "name");
        m.f(assertName, "assertName");
        m.f(env, "env");
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        x.n();
        this.f36402a = context;
        this.f36407f = name;
        this.f36408t = assertName;
        this.f36404c = env;
        String str = context.getApplicationInfo().dataDir + "/databases/";
        m.f(str, "<set-?>");
        this.f36406e = str;
    }

    public final void a() throws IOException {
        if (!oz.x.s0(c(), "zip", false) && !oz.x.k0(c(), "zip", false)) {
            byte[] bArr = new byte[1024];
            String strConcat = e().concat(d());
            try {
                q qVar = fv.b.f28186a;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fv.b.m() + c()));
                FileOutputStream fileOutputStream = new FileOutputStream(strConcat);
                for (int i11 = bufferedInputStream.read(bArr); i11 > 0; i11 = bufferedInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, i11);
                    fileOutputStream.flush();
                }
                bufferedInputStream.close();
                fileOutputStream.close();
                h();
                return;
            } catch (FileNotFoundException e8) {
                e8.printStackTrace();
                return;
            } catch (IOException e10) {
                e10.printStackTrace();
                return;
            }
        }
        c();
        q qVar2 = fv.b.f28186a;
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(e.m(fv.b.m(), c()))));
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        if (nextEntry != null) {
            nextEntry.getName();
        } else {
            zipInputStream = null;
        }
        if (zipInputStream == null) {
            throw new SQLiteAssetHelper$SQLiteAssetException("Archive is missing a SQLite database file");
        }
        FileOutputStream fileOutputStream2 = new FileOutputStream(e().concat(d()));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i12 = zipInputStream.read(bArr2);
            if (i12 <= 0) {
                fileOutputStream2.flush();
                fileOutputStream2.close();
                zipInputStream.close();
                h();
                return;
            }
            fileOutputStream2.write(bArr2, 0, i12);
        }
    }

    public final SQLiteDatabase b() throws IOException {
        d dVar = null;
        SQLiteDatabase sQLiteDatabaseF = new File(e().concat(d())).exists() ? f() : null;
        if (sQLiteDatabaseF == null) {
            a();
            SQLiteDatabase sQLiteDatabaseF2 = f();
            com.bumptech.glide.e.q();
            return sQLiteDatabaseF2;
        }
        n0 n0VarI = ((UserDataDatabase) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(UserDataDatabase.class))).I();
        y yVar = new y();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Executors.newSingleThreadExecutor().execute(new i(n0VarI, this, yVar, countDownLatch, 6));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        DbFileVersion dbFileVersion = (DbFileVersion) yVar.f38361a;
        if (dbFileVersion == null || !dbFileVersion.getNeedUpdate()) {
            return sQLiteDatabaseF;
        }
        d();
        a();
        SQLiteDatabase sQLiteDatabaseF3 = f();
        e0.B(b1.f50869a, null, null, new gu.b(18, n0VarI, yVar, dVar), 3);
        return sQLiteDatabaseF3;
    }

    public final String c() {
        String str = this.f36408t;
        if (str != null) {
            return str;
        }
        m.n("ASSERT_NAME");
        throw null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        SQLiteDatabase sQLiteDatabase;
        try {
            SQLiteDatabase sQLiteDatabase2 = this.f36403b;
            if (sQLiteDatabase2 != null && sQLiteDatabase2 != null && sQLiteDatabase2.isOpen() && (sQLiteDatabase = this.f36403b) != null) {
                sQLiteDatabase.close();
            }
            super.close();
            SQLiteDatabase sQLiteDatabase3 = this.f36403b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.getPath();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String d() {
        String str = this.f36407f;
        if (str != null) {
            return str;
        }
        m.n("DB_NAME");
        throw null;
    }

    public final String e() {
        String str = this.f36406e;
        if (str != null) {
            return str;
        }
        m.n("DB_PATH");
        throw null;
    }

    public final SQLiteDatabase f() {
        try {
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(e().concat(d()), null, 16);
            e();
            d();
            return sQLiteDatabaseOpenDatabase;
        } catch (SQLiteException e8) {
            d();
            e8.getMessage();
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabase = this.f36403b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            SQLiteDatabase sQLiteDatabase2 = this.f36403b;
            m.c(sQLiteDatabase2);
            return sQLiteDatabase2;
        }
        if (this.f36405d) {
            throw new IllegalStateException("getReadableDatabase called recursively");
        }
        try {
            return getWritableDatabase();
        } catch (SQLiteException e8) {
            e8.printStackTrace();
            SQLiteDatabase sQLiteDatabaseOpenDatabase = null;
            try {
                this.f36405d = true;
                sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(this.f36402a.getDatabasePath(d()).getPath(), null, 1);
                onOpen(sQLiteDatabaseOpenDatabase);
                this.f36403b = sQLiteDatabaseOpenDatabase;
                SQLiteDatabase sQLiteDatabase3 = this.f36403b;
                m.c(sQLiteDatabase3);
                return sQLiteDatabase3;
            } finally {
                this.f36405d = false;
                if (sQLiteDatabaseOpenDatabase != null && !sQLiteDatabaseOpenDatabase.equals(this.f36403b)) {
                    sQLiteDatabaseOpenDatabase.close();
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase = this.f36403b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            SQLiteDatabase sQLiteDatabase2 = this.f36403b;
            m.c(sQLiteDatabase2);
            if (!sQLiteDatabase2.isReadOnly()) {
                SQLiteDatabase sQLiteDatabase3 = this.f36403b;
                m.c(sQLiteDatabase3);
                return sQLiteDatabase3;
            }
        }
        if (this.f36405d) {
            throw new IllegalStateException("getWritableDatabase called recursively");
        }
        boolean z11 = true;
        SQLiteDatabase sQLiteDatabaseB = null;
        try {
            this.f36405d = true;
            sQLiteDatabaseB = b();
            onOpen(sQLiteDatabaseB);
            try {
                m.c(sQLiteDatabaseB);
                this.f36405d = false;
                SQLiteDatabase sQLiteDatabase4 = this.f36403b;
                if (sQLiteDatabase4 != null) {
                    try {
                        sQLiteDatabase4.close();
                    } catch (Exception unused) {
                    }
                }
                this.f36403b = sQLiteDatabaseB;
                return sQLiteDatabaseB;
            } catch (Throwable th2) {
                th = th2;
                this.f36405d = false;
                if (z11) {
                    SQLiteDatabase sQLiteDatabase5 = this.f36403b;
                    if (sQLiteDatabase5 != null) {
                        try {
                            sQLiteDatabase5.close();
                        } catch (Exception unused2) {
                        }
                    }
                    this.f36403b = sQLiteDatabaseB;
                } else if (sQLiteDatabaseB != null) {
                    sQLiteDatabaseB.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z11 = false;
        }
    }

    public abstract void h();

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase db2) {
        m.f(db2, "db");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase db2, int i11, int i12) {
        m.f(db2, "db");
    }
}
