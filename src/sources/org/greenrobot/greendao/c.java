package org.greenrobot.greendao;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import k10.g;
import rx.schedulers.Schedulers;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    private final org.greenrobot.greendao.database.a f45722db;
    private final Map<Class<?>, a> entityToDao = new HashMap();
    private volatile l10.b rxTxIo;
    private volatile l10.b rxTxPlain;

    public c(org.greenrobot.greendao.database.a aVar) {
        this.f45722db = aVar;
    }

    public <V> V callInTx(Callable<V> callable) {
        this.f45722db.j();
        try {
            V vCall = callable.call();
            this.f45722db.o();
            return vCall;
        } finally {
            this.f45722db.r();
        }
    }

    public <V> V callInTxNoException(Callable<V> callable) {
        this.f45722db.j();
        try {
            try {
                V vCall = callable.call();
                this.f45722db.o();
                this.f45722db.r();
                return vCall;
            } catch (Exception e8) {
                throw new DaoException("Callable failed", e8);
            }
        } catch (Throwable th2) {
            this.f45722db.r();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void delete(T t6) {
        getDao(t6.getClass()).delete(t6);
    }

    public <T> void deleteAll(Class<T> cls) {
        getDao(cls).deleteAll();
    }

    public Collection<a> getAllDaos() {
        return Collections.unmodifiableCollection(this.entityToDao.values());
    }

    public a getDao(Class<? extends Object> cls) {
        a aVar = this.entityToDao.get(cls);
        if (aVar != null) {
            return aVar;
        }
        throw new DaoException("No DAO registered for " + cls);
    }

    public org.greenrobot.greendao.database.a getDatabase() {
        return this.f45722db;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insert(T t6) {
        return getDao(t6.getClass()).insert(t6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insertOrReplace(T t6) {
        return getDao(t6.getClass()).insertOrReplace(t6);
    }

    public <T, K> T load(Class<T> cls, K k11) {
        return (T) getDao(cls).load(k11);
    }

    public <T, K> List<T> loadAll(Class<T> cls) {
        return (List<T>) getDao(cls).loadAll();
    }

    public <T> g queryBuilder(Class<T> cls) {
        return getDao(cls).queryBuilder();
    }

    public <T, K> List<T> queryRaw(Class<T> cls, String str, String... strArr) {
        return (List<T>) getDao(cls).queryRaw(str, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void refresh(T t6) {
        getDao(t6.getClass()).refresh(t6);
    }

    public <T> void registerDao(Class<T> cls, a aVar) {
        this.entityToDao.put(cls, aVar);
    }

    public void runInTx(Runnable runnable) {
        this.f45722db.j();
        try {
            runnable.run();
            this.f45722db.o();
        } finally {
            this.f45722db.r();
        }
    }

    public l10.b rxTx() {
        if (this.rxTxIo == null) {
            Schedulers.io();
            this.rxTxIo = new l10.b();
        }
        return this.rxTxIo;
    }

    public l10.b rxTxPlain() {
        if (this.rxTxPlain == null) {
            this.rxTxPlain = new l10.b();
        }
        return this.rxTxPlain;
    }

    public h10.b startAsyncSession() {
        h10.b bVar = new h10.b();
        new h10.a();
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void update(T t6) {
        getDao(t6.getClass()).update(t6);
    }
}
