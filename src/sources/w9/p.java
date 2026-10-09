package w9;

import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e6.i1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f54825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f54826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f54827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v5.e f54828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f54829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y9.b f54830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ka.a f54831g;

    public p(b bVar, s0.a aVar) {
        r journalMode = bVar.f54760g;
        this.f54827c = bVar;
        this.f54828d = new n(-1, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);
        List list = bVar.f54758e;
        ry.r rVar = ry.r.f50854a;
        this.f54829e = list == null ? rVar : list;
        ArrayList arrayListG0 = ry.m.G0(new gb.a(new s0.a(this, 21)), list == null ? rVar : list);
        Context context = bVar.f54754a;
        String str = bVar.f54755b;
        ka.c cVar = bVar.f54756c;
        i1 migrationContainer = bVar.f54757d;
        boolean z11 = bVar.f54759f;
        Executor queryExecutor = bVar.f54761h;
        Executor transactionExecutor = bVar.f54762i;
        Intent intent = bVar.f54763j;
        boolean z12 = bVar.f54764k;
        boolean z13 = bVar.f54765l;
        Set set = bVar.m;
        String str2 = bVar.f54766n;
        File file = bVar.f54767o;
        Callable callable = bVar.f54768p;
        List typeConverters = bVar.f54769q;
        List autoMigrationSpecs = bVar.f54770r;
        boolean z14 = bVar.f54771s;
        ja.b bVar2 = bVar.f54772t;
        vy.i iVar = bVar.f54773u;
        kotlin.jvm.internal.m.f(context, "context");
        kotlin.jvm.internal.m.f(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.m.f(journalMode, "journalMode");
        kotlin.jvm.internal.m.f(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.m.f(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.m.f(typeConverters, "typeConverters");
        kotlin.jvm.internal.m.f(autoMigrationSpecs, "autoMigrationSpecs");
        this.f54830f = new z9.b(new w00.d((ka.d) aVar.invoke(new b(context, str, cVar, migrationContainer, arrayListG0, z11, journalMode, queryExecutor, transactionExecutor, intent, z12, z13, set, str2, file, callable, typeConverters, autoMigrationSpecs, z14, bVar2, iVar))));
        boolean z15 = journalMode == r.WRITE_AHEAD_LOGGING;
        ka.d dVarC = c();
        if (dVarC != null) {
            dVarC.setWriteAheadLoggingEnabled(z15);
        }
    }

    public static void b(ja.a aVar) {
        ja.c cVarB1 = aVar.B1("PRAGMA busy_timeout");
        try {
            cVarB1.r1();
            long j11 = cVarB1.getLong(0);
            hz.b.h(cVarB1, null);
            if (j11 < 3000) {
                com.bumptech.glide.f.o(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                hz.b.h(cVarB1, th2);
                throw th3;
            }
        }
    }

    public final ka.d c() {
        w00.d dVar;
        y9.b bVar = this.f54830f;
        z9.b bVar2 = bVar instanceof z9.b ? (z9.b) bVar : null;
        if (bVar2 == null || (dVar = bVar2.f59034a) == null) {
            return null;
        }
        return (ka.d) dVar.f54378a;
    }

    public final void d(ja.a connection) {
        kotlin.jvm.internal.m.f(connection, "connection");
        ja.c cVarB1 = connection.B1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z11 = false;
            if (cVarB1.r1() && cVarB1.getLong(0) == 0) {
                z11 = true;
            }
            hz.b.h(cVarB1, null);
            v5.e eVar = this.f54828d;
            eVar.a(connection);
            if (!z11) {
                ef.o oVarG = eVar.g(connection);
                if (!oVarG.f25529c) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + oVarG.f25528b).toString());
                }
            }
            com.bumptech.glide.f.o(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            com.bumptech.glide.f.o(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) eVar.f53519b) + "')");
            eVar.c(connection);
            Iterator it = this.f54829e.iterator();
            while (it.hasNext()) {
                ((gb.a) it.next()).getClass();
                if (connection instanceof z9.a) {
                    ka.a db2 = ((z9.a) connection).f59033a;
                    kotlin.jvm.internal.m.f(db2, "db");
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                hz.b.h(cVarB1, th2);
                throw th3;
            }
        }
    }

    public final void e(ja.a connection, int i11, int i12) {
        kotlin.jvm.internal.m.f(connection, "connection");
        b bVar = this.f54827c;
        List<aa.a> listO = com.bumptech.glide.d.o(bVar.f54757d, i11, i12);
        v5.e eVar = this.f54828d;
        if (listO != null) {
            eVar.f(connection);
            for (aa.a aVar : listO) {
                aVar.getClass();
                if (!(connection instanceof z9.a)) {
                    throw new qy.k("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
                aVar.a(((z9.a) connection).f59033a);
            }
            ef.o oVarG = eVar.g(connection);
            if (!oVarG.f25529c) {
                throw new IllegalStateException(("Migration didn't properly handle: " + oVarG.f25528b).toString());
            }
            eVar.e(connection);
            com.bumptech.glide.f.o(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            com.bumptech.glide.f.o(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) eVar.f53519b) + "')");
            return;
        }
        if (com.bumptech.glide.d.t(bVar, i11, i12)) {
            throw new IllegalStateException(("A migration from " + i11 + " to " + i12 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (bVar.f54771s) {
            ja.c cVarB1 = connection.B1("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                sy.c cVarO = ns.o.o();
                while (cVarB1.r1()) {
                    String strB0 = cVarB1.B0(0);
                    if (!oz.x.s0(strB0, "sqlite_", false) && !strB0.equals("android_metadata")) {
                        cVarO.add(new qy.l(strB0, Boolean.valueOf(kotlin.jvm.internal.m.a(cVarB1.B0(1), "view"))));
                    }
                }
                sy.c cVarE = ns.o.e(cVarO);
                hz.b.h(cVarB1, null);
                ListIterator listIterator = cVarE.listIterator(0);
                while (true) {
                    sy.a aVar2 = (sy.a) listIterator;
                    if (!aVar2.hasNext()) {
                        break;
                    }
                    qy.l lVar = (qy.l) aVar2.next();
                    String str = (String) lVar.f48495a;
                    if (((Boolean) lVar.f48496b).booleanValue()) {
                        com.bumptech.glide.f.o(connection, "DROP VIEW IF EXISTS " + str);
                    } else {
                        com.bumptech.glide.f.o(connection, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    hz.b.h(cVarB1, th2);
                    throw th3;
                }
            }
        } else {
            eVar.b(connection);
        }
        Iterator it = this.f54829e.iterator();
        while (it.hasNext()) {
            ((gb.a) it.next()).getClass();
            if (connection instanceof z9.a) {
                ka.a db2 = ((z9.a) connection).f59033a;
                kotlin.jvm.internal.m.f(db2, "db");
            }
        }
        eVar.a(connection);
    }

    public final void f(ja.a connection) throws Throwable {
        Object objL;
        kotlin.jvm.internal.m.f(connection, "connection");
        ja.c cVarB1 = connection.B1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z11 = cVarB1.r1() && cVarB1.getLong(0) != 0;
            hz.b.h(cVarB1, null);
            v5.e eVar = this.f54828d;
            if (z11) {
                ja.c cVarB2 = connection.B1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strB0 = cVarB2.r1() ? cVarB2.B0(0) : null;
                    hz.b.h(cVarB2, null);
                    if (!((String) eVar.f53519b).equals(strB0) && !((String) eVar.f53520c).equals(strB0)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) eVar.f53519b) + ", found: " + strB0).toString());
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        hz.b.h(cVarB2, th2);
                        throw th3;
                    }
                }
            } else {
                com.bumptech.glide.f.o(connection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    ef.o oVarG = eVar.g(connection);
                    if (!oVarG.f25529c) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + oVarG.f25528b).toString());
                    }
                    eVar.e(connection);
                    com.bumptech.glide.f.o(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    com.bumptech.glide.f.o(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) eVar.f53519b) + "')");
                    objL = qy.b0.f48488a;
                    if (!(objL instanceof qy.n)) {
                        com.bumptech.glide.f.o(connection, "END TRANSACTION");
                    }
                    Throwable thA = qy.o.a(objL);
                    if (thA != null) {
                        com.bumptech.glide.f.o(connection, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th4) {
                    objL = com.bumptech.glide.e.l(th4);
                }
            }
            eVar.d(connection);
            for (gb.a aVar : this.f54829e) {
                aVar.getClass();
                if (connection instanceof z9.a) {
                    aVar.a(((z9.a) connection).f59033a);
                }
            }
            this.f54825a = true;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                hz.b.h(cVarB1, th5);
                throw th6;
            }
        }
    }

    public static final void a(p pVar, ja.a aVar) throws Throwable {
        Object objL;
        v5.e eVar = pVar.f54828d;
        b bVar = pVar.f54827c;
        r rVar = bVar.f54760g;
        r rVar2 = r.WRITE_AHEAD_LOGGING;
        if (rVar == rVar2) {
            com.bumptech.glide.f.o(aVar, "PRAGMA journal_mode = WAL");
        } else {
            com.bumptech.glide.f.o(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (bVar.f54760g == rVar2) {
            com.bumptech.glide.f.o(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            com.bumptech.glide.f.o(aVar, scqhIrGXy.SAavbXyAgkLaOmA);
        }
        b(aVar);
        ja.c cVarB1 = aVar.B1("PRAGMA user_version");
        try {
            cVarB1.r1();
            int i11 = (int) cVarB1.getLong(0);
            hz.b.h(cVarB1, null);
            int i12 = eVar.f53518a;
            if (i11 != i12) {
                com.bumptech.glide.f.o(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i11 == 0) {
                        pVar.d(aVar);
                    } else {
                        pVar.e(aVar, i11, i12);
                    }
                    com.bumptech.glide.f.o(aVar, "PRAGMA user_version = " + i12);
                    objL = qy.b0.f48488a;
                } catch (Throwable th2) {
                    objL = com.bumptech.glide.e.l(th2);
                }
                if (!(objL instanceof qy.n)) {
                    com.bumptech.glide.f.o(aVar, "END TRANSACTION");
                }
                Throwable thA = qy.o.a(objL);
                if (thA != null) {
                    com.bumptech.glide.f.o(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            pVar.f(aVar);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                hz.b.h(cVarB1, th3);
                throw th4;
            }
        }
    }

    public p(b bVar, v5.e eVar) {
        int i11;
        y9.e eVar2;
        r rVar = bVar.f54760g;
        ka.c cVar = bVar.f54756c;
        String str = bVar.f54755b;
        this.f54827c = bVar;
        this.f54828d = eVar;
        List list = bVar.f54758e;
        this.f54829e = list == null ? ry.r.f50854a : list;
        ja.b bVar2 = bVar.f54772t;
        if (bVar2 != null) {
            if (str == null) {
                eVar2 = new y9.e(new qh.d(this, bVar2));
            } else {
                qh.d dVar = new qh.d(this, bVar2);
                kotlin.jvm.internal.m.f(rVar, "<this>");
                int[] iArr = a.f54748a;
                int i12 = iArr[rVar.ordinal()];
                if (i12 == 1) {
                    i11 = 1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + rVar + '\'').toString());
                    }
                    i11 = 4;
                }
                int i13 = iArr[rVar.ordinal()];
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + rVar + '\'').toString());
                }
                eVar2 = new y9.e(dVar, str, i11);
            }
            this.f54830f = eVar2;
        } else if (cVar != null) {
            Context context = bVar.f54754a;
            kotlin.jvm.internal.m.f(context, "context");
            this.f54830f = new z9.b(new w00.d(cVar.g(new ka.b(context, str, new o(this, eVar.f53518a), false, false))));
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z11 = rVar == r.WRITE_AHEAD_LOGGING;
        ka.d dVarC = c();
        if (dVarC != null) {
            dVarC.setWriteAheadLoggingEnabled(z11);
        }
    }
}
