package org.greenrobot.greendao;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    protected final org.greenrobot.greendao.database.a f45721db;
    protected final int schemaVersion = 31;
    protected final Map<Class<? extends a>, j10.a> daoConfigMap = new HashMap();

    public b(org.greenrobot.greendao.database.a aVar) {
        this.f45721db = aVar;
    }

    public org.greenrobot.greendao.database.a getDatabase() {
        return this.f45721db;
    }

    public int getSchemaVersion() {
        return this.schemaVersion;
    }

    public void registerDaoClass(Class<? extends a> cls) {
        this.daoConfigMap.put(cls, new j10.a(this.f45721db, cls));
    }
}
