package la;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import bt.t;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ka.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f39842b = {BuildConfig.VERSION_NAME, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f39843c = new String[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f39844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f39845e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f39846a;

    static {
        qy.j jVar = qy.j.NONE;
        f39844d = com.bumptech.glide.d.u(jVar, new ju.d(7));
        f39845e = com.bumptech.glide.d.u(jVar, new ju.d(8));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f39846a = sQLiteDatabase;
    }

    @Override // ka.a
    public final Cursor N0(ka.f fVar) {
        final t tVar = new t(fVar, 4);
        Cursor cursorRawQueryWithFactory = this.f39846a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: la.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) tVar.f(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, fVar.a(), f39843c, null);
        m.e(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, qy.h] */
    @Override // ka.a
    public final void P() throws IllegalAccessException, InvocationTargetException {
        ?? r9 = f39845e;
        if (((Method) r9.getValue()) != null) {
            ?? r11 = f39844d;
            if (((Method) r11.getValue()) != null) {
                Method method = (Method) r9.getValue();
                m.c(method);
                Method method2 = (Method) r11.getValue();
                m.c(method2);
                Object objInvoke = method2.invoke(this.f39846a, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        j();
    }

    @Override // ka.a
    public final boolean U0() {
        return this.f39846a.inTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f39846a.close();
    }

    @Override // ka.a
    public final void d0(Object[] objArr) {
        this.f39846a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // ka.a
    public final boolean e1() {
        return this.f39846a.isWriteAheadLoggingEnabled();
    }

    @Override // ka.a
    public final void f0() {
        this.f39846a.beginTransactionNonExclusive();
    }

    @Override // ka.a
    public final boolean isOpen() {
        return this.f39846a.isOpen();
    }

    @Override // ka.a
    public final void j() {
        this.f39846a.beginTransaction();
    }

    @Override // ka.a
    public final void k(String sql) {
        m.f(sql, "sql");
        this.f39846a.execSQL(sql);
    }

    @Override // ka.a
    public final void o() {
        this.f39846a.setTransactionSuccessful();
    }

    @Override // ka.a
    public final void r() {
        this.f39846a.endTransaction();
    }

    @Override // ka.a
    public final int u1(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f39842b[3]);
        sb2.append("WorkSpec SET ");
        int i11 = 0;
        for (String str : contentValues.keySet()) {
            sb2.append(i11 > 0 ? "," : BuildConfig.VERSION_NAME);
            sb2.append(str);
            objArr2[i11] = contentValues.get(str);
            sb2.append("=?");
            i11++;
        }
        for (int i12 = size; i12 < length; i12++) {
            objArr2[i12] = objArr[i12 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        j jVarM = m(sb2.toString());
        int length2 = objArr2.length;
        int i13 = 0;
        while (i13 < length2) {
            Object obj = objArr2[i13];
            i13++;
            if (obj == null) {
                jVarM.s(i13);
            } else if (obj instanceof byte[]) {
                jVarM.t0((byte[]) obj, i13);
            } else if (obj instanceof Float) {
                jVarM.L(i13, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                jVarM.L(i13, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                jVarM.g(i13, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                jVarM.g(i13, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                jVarM.g(i13, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                jVarM.g(i13, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                jVarM.l(i13, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i13 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                jVarM.g(i13, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return jVarM.f39867b.executeUpdateDelete();
    }

    @Override // ka.a
    public final j m(String sql) {
        m.f(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f39846a.compileStatement(sql);
        m.e(sQLiteStatementCompileStatement, DytezVyM.eVHyS);
        return new j(sQLiteStatementCompileStatement);
    }
}
