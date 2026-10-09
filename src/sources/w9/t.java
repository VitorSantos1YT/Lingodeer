package w9;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import bw.ORXQ.ADSb;
import e6.i1;
import hh.p0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends c7.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f54861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f54862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hd.b f54863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b configuration, hd.b bVar) {
        super(23, 2);
        kotlin.jvm.internal.m.f(configuration, "configuration");
        this.f54862d = configuration.f54758e;
        this.f54861c = configuration;
        this.f54863e = bVar;
    }

    @Override // c7.f
    public final void g(la.b bVar) {
    }

    @Override // c7.f
    public final void h(la.b bVar) throws IOException {
        Cursor cursorN0 = bVar.N0(new com.android.billingclient.api.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            Cursor cursor = cursorN0;
            boolean z11 = false;
            if (cursor.moveToFirst() && cursor.getInt(0) == 0) {
                z11 = true;
            }
            cursorN0.close();
            hd.b.k(bVar);
            if (!z11) {
                ef.o oVarV = hd.b.v(bVar);
                if (!oVarV.f25529c) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + oVarV.f25528b);
                }
            }
            bVar.k("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.k("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            List list = this.f54862d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((gb.a) it.next()).getClass();
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ns.o.m(cursorN0, th2);
                throw th3;
            }
        }
    }

    @Override // c7.f
    public final void k(la.b bVar, int i11, int i12) throws IOException {
        m(bVar, i11, i12);
    }

    @Override // c7.f
    public final void l(la.b bVar) throws IOException {
        Cursor cursorN0 = bVar.N0(new com.android.billingclient.api.b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            Cursor cursor = cursorN0;
            boolean z11 = cursor.moveToFirst() && cursor.getInt(0) != 0;
            cursorN0.close();
            if (z11) {
                Cursor cursorN1 = bVar.N0(new com.android.billingclient.api.b("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    Cursor cursor2 = cursorN1;
                    String string = cursor2.moveToFirst() ? cursor2.getString(0) : null;
                    cursorN1.close();
                    if (!"86254750241babac4b8d52996a675549".equals(string) && !"1cbd3130fa23b59692c061c594c16cc0".equals(string)) {
                        throw new IllegalStateException(ep.a.e("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: ", string));
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ns.o.m(cursorN1, th2);
                        throw th3;
                    }
                }
            } else {
                ef.o oVarV = hd.b.v(bVar);
                if (!oVarV.f25529c) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + oVarV.f25528b);
                }
                bVar.k("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.k("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f54863e.f32184b;
            bVar.k("PRAGMA foreign_keys = ON");
            workDatabase_Impl.t(new z9.a(bVar));
            List list = this.f54862d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((gb.a) it.next()).a(bVar);
                }
            }
            this.f54861c = null;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ns.o.m(cursorN0, th4);
                throw th5;
            }
        }
    }

    @Override // c7.f
    public final void m(la.b bVar, int i11, int i12) throws IOException {
        b bVar2 = this.f54861c;
        if (bVar2 != null) {
            i1 i1Var = bVar2.f54757d;
            i1Var.getClass();
            List<aa.a> listO = com.bumptech.glide.d.o(i1Var, i11, i12);
            if (listO != null) {
                cf.x.g(new z9.a(bVar));
                for (aa.a aVar : listO) {
                    aVar.getClass();
                    aVar.a(bVar);
                }
                ef.o oVarV = hd.b.v(bVar);
                if (!oVarV.f25529c) {
                    throw new IllegalStateException("Migration didn't properly handle: " + oVarV.f25528b);
                }
                bVar.k("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.k(ADSb.afgVNSIqimAw);
                return;
            }
        }
        b bVar3 = this.f54861c;
        if (bVar3 == null || com.bumptech.glide.d.t(bVar3, i11, i12)) {
            throw new IllegalStateException(p0.l("A migration from ", i11, " to ", i12, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        if (bVar3.f54771s) {
            Cursor cursorN0 = bVar.N0(new com.android.billingclient.api.b("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                Cursor cursor = cursorN0;
                sy.c cVarO = ns.o.o();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    kotlin.jvm.internal.m.c(string);
                    if (!oz.x.s0(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        cVarO.add(new qy.l(string, Boolean.valueOf(kotlin.jvm.internal.m.a(cursor.getString(1), "view"))));
                    }
                }
                sy.c cVarE = ns.o.e(cVarO);
                cursorN0.close();
                ListIterator listIterator = cVarE.listIterator(0);
                while (true) {
                    sy.a aVar2 = (sy.a) listIterator;
                    if (!aVar2.hasNext()) {
                        break;
                    }
                    qy.l lVar = (qy.l) aVar2.next();
                    String str = (String) lVar.f48495a;
                    if (((Boolean) lVar.f48496b).booleanValue()) {
                        bVar.k("DROP VIEW IF EXISTS " + str);
                    } else {
                        bVar.k("DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ns.o.m(cursorN0, th2);
                    throw th3;
                }
            }
        } else {
            bVar.k("DROP TABLE IF EXISTS `Dependency`");
            bVar.k("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.k("DROP TABLE IF EXISTS `WorkTag`");
            bVar.k("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.k("DROP TABLE IF EXISTS `WorkName`");
            bVar.k("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.k("DROP TABLE IF EXISTS `Preference`");
        }
        List list = this.f54862d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((gb.a) it.next()).getClass();
            }
        }
        hd.b.k(bVar);
    }
}
