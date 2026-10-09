package org.greenrobot.greendao;

import a.ar.MFeWs;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k10.f;
import k10.g;
import nv.p;
import rx.schedulers.Schedulers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    protected final j10.a config;

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    protected final org.greenrobot.greendao.database.a f45720db;
    protected final i10.a identityScope;
    protected final i10.b identityScopeLong;
    protected final boolean isStandardSQLite;
    protected final int pkOrdinal;
    private volatile l10.a rxDao;
    private volatile l10.a rxDaoPlain;
    protected final c session;
    protected final j10.d statements;

    public a(j10.a aVar, c cVar) {
        this.config = aVar;
        this.session = cVar;
        org.greenrobot.greendao.database.a aVar2 = aVar.f35514a;
        this.f45720db = aVar2;
        this.isStandardSQLite = aVar2.c() instanceof SQLiteDatabase;
        i10.a aVar3 = aVar.L;
        this.identityScope = aVar3;
        if (aVar3 instanceof i10.b) {
            this.identityScopeLong = (i10.b) aVar3;
        } else {
            this.identityScopeLong = null;
        }
        this.statements = aVar.K;
        d dVar = aVar.f35520t;
        this.pkOrdinal = dVar != null ? dVar.f45723a : -1;
    }

    public static void a(org.greenrobot.greendao.database.d dVar, Object obj) {
        if (obj instanceof Long) {
            dVar.g(1, ((Long) obj).longValue());
        } else {
            if (obj == null) {
                throw new DaoException("Cannot delete entity, key is null");
            }
            dVar.l(1, obj.toString());
        }
        dVar.b();
    }

    public void assertSinglePk() {
        if (this.config.f35518e.length == 1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append(" (");
        throw new DaoException(ep.a.k(sb2, this.config.f35515b, ") does not have a single-column primary key"));
    }

    public void attachEntity(Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:12:0x0021, B:13:0x0025, B:15:0x002b, B:17:0x0038, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:26:0x0053), top: B:51:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:12:0x0021, B:13:0x0025, B:15:0x002b, B:17:0x0038, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:26:0x0053), top: B:51:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[Catch: all -> 0x001c, TryCatch #2 {, blocks: (B:4:0x000f, B:6:0x0013, B:32:0x005f, B:34:0x0063, B:35:0x0066, B:28:0x0057, B:30:0x005b, B:31:0x005e, B:12:0x0021, B:13:0x0025, B:15:0x002b, B:17:0x0038, B:21:0x0040, B:22:0x0044, B:24:0x004a, B:26:0x0053), top: B:53:0x000f, outer: #0, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0044 A[SYNTHETIC] */
    public final void b(Iterable iterable, Iterable iterable2) {
        ArrayList arrayList;
        i10.a aVar;
        i10.a aVar2;
        assertSinglePk();
        org.greenrobot.greendao.database.d dVarA = this.statements.a();
        this.f45720db.j();
        try {
            synchronized (dVarA) {
                i10.a aVar3 = this.identityScope;
                if (aVar3 != null) {
                    aVar3.lock();
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                if (iterable != null) {
                    try {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            Object keyVerified = getKeyVerified(it.next());
                            a(dVarA, keyVerified);
                            if (arrayList != null) {
                                arrayList.add(keyVerified);
                            }
                        }
                        if (iterable2 != null) {
                            for (Object obj : iterable2) {
                                a(dVarA, obj);
                                if (arrayList != null) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                        aVar = this.identityScope;
                        if (aVar != null) {
                            aVar.unlock();
                        }
                    } catch (Throwable th2) {
                        i10.a aVar4 = this.identityScope;
                        if (aVar4 != null) {
                            aVar4.unlock();
                        }
                        throw th2;
                    }
                } else {
                    if (iterable2 != null) {
                        while (r4.hasNext()) {
                            a(dVarA, obj);
                            if (arrayList != null) {
                                arrayList.add(obj);
                            }
                        }
                    }
                    aVar = this.identityScope;
                    if (aVar != null) {
                        aVar.unlock();
                    }
                }
                throw th;
            }
            this.f45720db.o();
            if (arrayList != null && (aVar2 = this.identityScope) != null) {
                aVar2.t(arrayList);
            }
            this.f45720db.r();
        } catch (Throwable th3) {
            this.f45720db.r();
            throw th3;
        }
    }

    public abstract void bindValues(SQLiteStatement sQLiteStatement, Object obj);

    public abstract void bindValues(org.greenrobot.greendao.database.d dVar, Object obj);

    public final long c(Object obj, org.greenrobot.greendao.database.d dVar, boolean z11) {
        long jE;
        if (this.f45720db.e()) {
            jE = e(dVar, obj);
        } else {
            this.f45720db.j();
            try {
                jE = e(dVar, obj);
                this.f45720db.o();
                this.f45720db.r();
            } catch (Throwable th2) {
                this.f45720db.r();
                throw th2;
            }
        }
        if (z11) {
            updateKeyAfterInsertAndAttach(obj, jE, true);
        }
        return jE;
    }

    public long count() {
        j10.d dVar = this.statements;
        if (dVar.f35533i == null) {
            String str = dVar.f35526b;
            int i11 = j10.c.f35524a;
            dVar.f35533i = dVar.f35525a.m(p.q("SELECT COUNT(*) FROM \"", str, '\"'));
        }
        return dVar.f35533i.a();
    }

    public final void d(org.greenrobot.greendao.database.d dVar, Iterable iterable, boolean z11) {
        this.f45720db.j();
        try {
            synchronized (dVar) {
                try {
                    i10.a aVar = this.identityScope;
                    if (aVar != null) {
                        aVar.lock();
                    }
                    try {
                        if (this.isStandardSQLite) {
                            SQLiteStatement sQLiteStatement = (SQLiteStatement) dVar.h();
                            for (Object obj : iterable) {
                                bindValues(sQLiteStatement, obj);
                                if (z11) {
                                    updateKeyAfterInsertAndAttach(obj, sQLiteStatement.executeInsert(), false);
                                } else {
                                    sQLiteStatement.execute();
                                }
                            }
                        } else {
                            for (Object obj2 : iterable) {
                                bindValues(dVar, obj2);
                                if (z11) {
                                    updateKeyAfterInsertAndAttach(obj2, dVar.i(), false);
                                } else {
                                    dVar.b();
                                }
                            }
                        }
                        i10.a aVar2 = this.identityScope;
                        if (aVar2 != null) {
                            aVar2.unlock();
                        }
                    } catch (Throwable th2) {
                        i10.a aVar3 = this.identityScope;
                        if (aVar3 != null) {
                            aVar3.unlock();
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f45720db.o();
            this.f45720db.r();
        } catch (Throwable th4) {
            this.f45720db.r();
            throw th4;
        }
    }

    public void delete(Object obj) {
        assertSinglePk();
        deleteByKey(getKeyVerified(obj));
    }

    public void deleteAll() {
        com.google.android.material.datepicker.d.x(new StringBuilder("DELETE FROM '"), this.config.f35515b, "'", this.f45720db);
        i10.a aVar = this.identityScope;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public void deleteByKey(Object obj) {
        assertSinglePk();
        org.greenrobot.greendao.database.d dVarA = this.statements.a();
        if (this.f45720db.e()) {
            synchronized (dVarA) {
                a(dVarA, obj);
            }
        } else {
            this.f45720db.j();
            try {
                synchronized (dVarA) {
                    a(dVarA, obj);
                }
                this.f45720db.o();
                this.f45720db.r();
            } catch (Throwable th2) {
                this.f45720db.r();
                throw th2;
            }
        }
        i10.a aVar = this.identityScope;
        if (aVar != null) {
            aVar.remove(obj);
        }
    }

    public void deleteByKeyInTx(Iterable<Object> iterable) {
        b(null, iterable);
    }

    public void deleteInTx(Iterable<Object> iterable) {
        b(iterable, null);
    }

    public boolean detach(Object obj) {
        if (this.identityScope == null) {
            return false;
        }
        return this.identityScope.n(getKeyVerified(obj), obj);
    }

    public void detachAll() {
        i10.a aVar = this.identityScope;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public final long e(org.greenrobot.greendao.database.d dVar, Object obj) {
        synchronized (dVar) {
            try {
                if (!this.isStandardSQLite) {
                    bindValues(dVar, obj);
                    return dVar.i();
                }
                SQLiteStatement sQLiteStatement = (SQLiteStatement) dVar.h();
                bindValues(sQLiteStatement, obj);
                return sQLiteStatement.executeInsert();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(Cursor cursor, CursorWindow cursorWindow, ArrayList arrayList) {
        CursorWindow window;
        int numRows = cursorWindow.getNumRows() + cursorWindow.getStartPosition();
        int i11 = 0;
        while (true) {
            arrayList.add(loadCurrent(cursor, 0, false));
            if (i11 + 1 >= numRows) {
                this.identityScope.unlock();
                try {
                    if (cursor.moveToNext()) {
                        window = ((CrossProcessCursor) cursor).getWindow();
                        this.identityScope.lock();
                    } else {
                        this.identityScope.lock();
                        window = null;
                    }
                    if (window == null) {
                        return;
                    }
                    numRows = window.getNumRows() + window.getStartPosition();
                } catch (Throwable th2) {
                    this.identityScope.lock();
                    throw th2;
                }
            } else if (!cursor.moveToNext()) {
                return;
            }
            i11 += 2;
        }
    }

    public String[] getAllColumns() {
        return this.config.f35517d;
    }

    public org.greenrobot.greendao.database.a getDatabase() {
        return this.f45720db;
    }

    public abstract Object getKey(Object obj);

    public Object getKeyVerified(Object obj) {
        Object key = getKey(obj);
        if (key != null) {
            return key;
        }
        if (obj == null) {
            throw new NullPointerException("Entity may not be null");
        }
        throw new DaoException("Entity has no key");
    }

    public String[] getNonPkColumns() {
        return this.config.f35519f;
    }

    public String[] getPkColumns() {
        return this.config.f35518e;
    }

    public d getPkProperty() {
        return this.config.f35520t;
    }

    public d[] getProperties() {
        return this.config.f35516c;
    }

    public c getSession() {
        return this.session;
    }

    public j10.d getStatements() {
        return this.config.K;
    }

    public String getTablename() {
        return this.config.f35515b;
    }

    public abstract boolean hasKey(Object obj);

    public long insert(Object obj) {
        return c(obj, this.statements.c(), true);
    }

    public void insertInTx(Iterable<Object> iterable) {
        insertInTx(iterable, isEntityUpdateable());
    }

    public long insertOrReplace(Object obj) {
        return c(obj, this.statements.b(), true);
    }

    public void insertOrReplaceInTx(Iterable<Object> iterable, boolean z11) {
        d(this.statements.b(), iterable, z11);
    }

    public long insertWithoutSettingPk(Object obj) {
        return c(obj, this.statements.b(), false);
    }

    public abstract boolean isEntityUpdateable();

    public Object load(Object obj) {
        Object obj2;
        assertSinglePk();
        if (obj == null) {
            return null;
        }
        i10.a aVar = this.identityScope;
        return (aVar == null || (obj2 = aVar.get(obj)) == null) ? loadUniqueAndCloseCursor(this.f45720db.d(this.statements.e(), new String[]{obj.toString()})) : obj2;
    }

    public List<Object> loadAll() {
        return loadAllAndCloseCursor(this.f45720db.d(this.statements.d(), null));
    }

    public List<Object> loadAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:42:? A[SYNTHETIC] */
    public List<Object> loadAllFromCursor(Cursor cursor) {
        CursorWindow window;
        boolean z11;
        i10.a aVar;
        i10.a aVar2;
        int count = cursor.getCount();
        if (count == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(count);
        if (cursor instanceof CrossProcessCursor) {
            window = ((CrossProcessCursor) cursor).getWindow();
            if (window != null) {
                if (window.getNumRows() == count) {
                    cursor = new j10.b(window);
                    z11 = true;
                } else {
                    window.getNumRows();
                }
            }
            if (cursor.moveToFirst()) {
                aVar = this.identityScope;
                if (aVar != null) {
                    aVar.lock();
                    this.identityScope.m(count);
                }
                if (!z11 || window == null) {
                    do {
                        arrayList.add(loadCurrent(cursor, 0, false));
                    } while (cursor.moveToNext());
                    if (aVar2 != null) {
                        return arrayList;
                    }
                } else {
                    try {
                        if (this.identityScope != null) {
                            f(cursor, window, arrayList);
                        } else {
                            do {
                                arrayList.add(loadCurrent(cursor, 0, false));
                            } while (cursor.moveToNext());
                        }
                        if (aVar2 != null) {
                            return arrayList;
                        }
                    } finally {
                        aVar2 = this.identityScope;
                        if (aVar2 != null) {
                            aVar2.unlock();
                        }
                    }
                }
            }
            return arrayList;
        }
        window = null;
        z11 = false;
        if (cursor.moveToFirst()) {
            aVar = this.identityScope;
            if (aVar != null) {
                aVar.lock();
                this.identityScope.m(count);
            }
            if (z11) {
                do {
                    arrayList.add(loadCurrent(cursor, 0, false));
                } while (cursor.moveToNext());
                if (aVar2 != null) {
                    return arrayList;
                }
            } else {
                do {
                    arrayList.add(loadCurrent(cursor, 0, false));
                } while (cursor.moveToNext());
                if (aVar2 != null) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public Object loadByRowId(long j11) {
        String[] strArr = {Long.toString(j11)};
        org.greenrobot.greendao.database.a aVar = this.f45720db;
        j10.d dVar = this.statements;
        if (dVar.f35536l == null) {
            dVar.f35536l = dVar.d() + "WHERE ROWID=?";
        }
        return loadUniqueAndCloseCursor(aVar.d(dVar.f35536l, strArr));
    }

    public final Object loadCurrent(Cursor cursor, int i11, boolean z11) {
        Object objA;
        if (this.identityScopeLong != null) {
            if (i11 == 0 || !cursor.isNull(this.pkOrdinal + i11)) {
                long j11 = cursor.getLong(this.pkOrdinal + i11);
                i10.b bVar = this.identityScopeLong;
                if (z11) {
                    objA = bVar.a(j11);
                } else {
                    Reference reference = (Reference) bVar.f34114a.d(j11);
                    objA = reference != null ? reference.get() : null;
                }
                if (objA != null) {
                    return objA;
                }
                Object entity = readEntity(cursor, i11);
                attachEntity(entity);
                if (z11) {
                    this.identityScopeLong.b(j11, entity);
                    return entity;
                }
                this.identityScopeLong.f34114a.g(j11, new WeakReference(entity));
                return entity;
            }
        } else if (this.identityScope != null) {
            Object key = readKey(cursor, i11);
            if (i11 == 0 || key != null) {
                i10.a aVar = this.identityScope;
                Object objD = z11 ? aVar.get(key) : aVar.d(key);
                if (objD != null) {
                    return objD;
                }
                Object entity2 = readEntity(cursor, i11);
                attachEntity(key, entity2, z11);
                return entity2;
            }
        } else if (i11 == 0 || readKey(cursor, i11) != null) {
            Object entity3 = readEntity(cursor, i11);
            attachEntity(entity3);
            return entity3;
        }
        return null;
    }

    public final <O> O loadCurrentOther(a aVar, Cursor cursor, int i11) {
        return (O) aVar.loadCurrent(cursor, i11, true);
    }

    public Object loadUnique(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            return null;
        }
        if (cursor.isLast()) {
            return loadCurrent(cursor, 0, true);
        }
        throw new DaoException("Expected unique result, but count was " + cursor.getCount());
    }

    public Object loadUniqueAndCloseCursor(Cursor cursor) {
        try {
            return loadUnique(cursor);
        } finally {
            cursor.close();
        }
    }

    public g queryBuilder() {
        return new g(this);
    }

    public List<Object> queryRaw(String str, String... strArr) {
        return loadAllAndCloseCursor(this.f45720db.d(this.statements.d() + str, strArr));
    }

    public f queryRawCreate(String str, Object... objArr) {
        return queryRawCreateListArgs(str, Arrays.asList(objArr));
    }

    public f queryRawCreateListArgs(String str, Collection<Object> collection) {
        return (f) new k10.c(this, this.statements.d() + str, k10.a.b(collection.toArray()), -1).b();
    }

    public abstract Object readEntity(Cursor cursor, int i11);

    public abstract void readEntity(Cursor cursor, Object obj, int i11);

    public abstract Object readKey(Cursor cursor, int i11);

    public void refresh(Object obj) {
        assertSinglePk();
        Object keyVerified = getKeyVerified(obj);
        Cursor cursorD = this.f45720db.d(this.statements.e(), new String[]{keyVerified.toString()});
        try {
            if (!cursorD.moveToFirst()) {
                throw new DaoException("Entity does not exist in the database anymore: " + obj.getClass() + " with key " + keyVerified);
            }
            if (!cursorD.isLast()) {
                throw new DaoException("Expected unique result, but count was " + cursorD.getCount());
            }
            readEntity(cursorD, obj, 0);
            attachEntity(keyVerified, obj, true);
            cursorD.close();
        } catch (Throwable th2) {
            cursorD.close();
            throw th2;
        }
    }

    public l10.a rx() {
        if (this.rxDao == null) {
            Schedulers.io();
            this.rxDao = new l10.a();
        }
        return this.rxDao;
    }

    public l10.a rxPlain() {
        if (this.rxDaoPlain == null) {
            this.rxDaoPlain = new l10.a();
        }
        return this.rxDaoPlain;
    }

    public void save(Object obj) {
        if (hasKey(obj)) {
            update(obj);
        } else {
            insert(obj);
        }
    }

    public void saveInTx(Object... objArr) {
        saveInTx(Arrays.asList(objArr));
    }

    public void update(Object obj) {
        assertSinglePk();
        org.greenrobot.greendao.database.d dVarF = this.statements.f();
        if (this.f45720db.e()) {
            synchronized (dVarF) {
                try {
                    if (this.isStandardSQLite) {
                        updateInsideSynchronized(obj, (SQLiteStatement) dVarF.h(), true);
                    } else {
                        updateInsideSynchronized(obj, dVarF, true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        this.f45720db.j();
        try {
            synchronized (dVarF) {
                updateInsideSynchronized(obj, dVarF, true);
            }
            this.f45720db.o();
            this.f45720db.r();
        } catch (Throwable th3) {
            this.f45720db.r();
            throw th3;
        }
    }

    public void updateInTx(Iterable<Object> iterable) {
        org.greenrobot.greendao.database.d dVarF = this.statements.f();
        this.f45720db.j();
        try {
            synchronized (dVarF) {
                i10.a aVar = this.identityScope;
                if (aVar != null) {
                    aVar.lock();
                }
                try {
                    if (this.isStandardSQLite) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) dVarF.h();
                        Iterator<Object> it = iterable.iterator();
                        while (it.hasNext()) {
                            updateInsideSynchronized(it.next(), sQLiteStatement, false);
                        }
                    } else {
                        Iterator<Object> it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            updateInsideSynchronized(it2.next(), dVarF, false);
                        }
                    }
                    i10.a aVar2 = this.identityScope;
                    if (aVar2 != null) {
                        aVar2.unlock();
                    }
                } catch (Throwable th2) {
                    i10.a aVar3 = this.identityScope;
                    if (aVar3 != null) {
                        aVar3.unlock();
                    }
                    throw th2;
                }
            }
            this.f45720db.o();
            this.f45720db.r();
            e = null;
        } catch (RuntimeException e8) {
            e = e8;
            try {
                this.f45720db.r();
            } catch (RuntimeException unused) {
                throw e;
            }
        } catch (Throwable th3) {
            this.f45720db.r();
            throw th3;
        }
        if (e != null) {
            throw e;
        }
    }

    public void updateInsideSynchronized(Object obj, org.greenrobot.greendao.database.d dVar, boolean z11) {
        bindValues(dVar, obj);
        int length = this.config.f35517d.length + 1;
        Object key = getKey(obj);
        if (key instanceof Long) {
            dVar.g(length, ((Long) key).longValue());
        } else {
            if (key == null) {
                throw new DaoException("Cannot update entity without key - was it inserted before?");
            }
            dVar.l(length, key.toString());
        }
        dVar.b();
        attachEntity(key, obj, z11);
    }

    public abstract Object updateKeyAfterInsert(Object obj, long j11);

    public void updateKeyAfterInsertAndAttach(Object obj, long j11, boolean z11) {
        if (j11 != -1) {
            attachEntity(updateKeyAfterInsert(obj, j11), obj, z11);
        }
    }

    public final void attachEntity(Object obj, Object obj2, boolean z11) {
        attachEntity(obj2);
        i10.a aVar = this.identityScope;
        if (aVar == null || obj == null) {
            return;
        }
        if (z11) {
            aVar.put(obj, obj2);
        } else {
            aVar.c(obj, obj2);
        }
    }

    public void deleteByKeyInTx(Object... objArr) {
        b(null, Arrays.asList(objArr));
    }

    public void deleteInTx(Object... objArr) {
        b(Arrays.asList(objArr), null);
    }

    public void insertInTx(Object... objArr) {
        insertInTx(Arrays.asList(objArr), isEntityUpdateable());
    }

    public void saveInTx(Iterable<Object> iterable) {
        Iterator<Object> it = iterable.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            if (hasKey(it.next())) {
                i11++;
            } else {
                i12++;
            }
        }
        if (i11 <= 0 || i12 <= 0) {
            if (i12 > 0) {
                insertInTx(iterable);
                return;
            } else {
                if (i11 > 0) {
                    updateInTx(iterable);
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = new ArrayList(i11);
        ArrayList arrayList2 = new ArrayList(i12);
        for (Object obj : iterable) {
            if (hasKey(obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        this.f45720db.j();
        try {
            updateInTx(arrayList);
            insertInTx(arrayList2);
            this.f45720db.o();
        } finally {
            this.f45720db.r();
        }
    }

    public void insertInTx(Iterable<Object> iterable, boolean z11) {
        d(this.statements.c(), iterable, z11);
    }

    public void insertOrReplaceInTx(Iterable<Object> iterable) {
        insertOrReplaceInTx(iterable, isEntityUpdateable());
    }

    public void insertOrReplaceInTx(Object... objArr) {
        insertOrReplaceInTx(Arrays.asList(objArr), isEntityUpdateable());
    }

    public void updateInsideSynchronized(Object obj, SQLiteStatement sQLiteStatement, boolean z11) {
        bindValues(sQLiteStatement, obj);
        int length = this.config.f35517d.length + 1;
        Object key = getKey(obj);
        if (key instanceof Long) {
            sQLiteStatement.bindLong(length, ((Long) key).longValue());
        } else if (key != null) {
            sQLiteStatement.bindString(length, key.toString());
        } else {
            throw new DaoException(MFeWs.MxPJ);
        }
        sQLiteStatement.execute();
        attachEntity(key, obj, z11);
    }

    public void updateInTx(Object... objArr) {
        updateInTx(Arrays.asList(objArr));
    }
}
