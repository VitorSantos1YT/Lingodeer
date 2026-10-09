package pb;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import fb.e0;
import fb.x;
import gb.a0;
import hh.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w9.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f46738a = {13, 15, 14};

    public static final void a(gb.p pVar, String str) {
        a0 a0VarB;
        WorkDatabase workDatabase = pVar.f28955c;
        kotlin.jvm.internal.m.e(workDatabase, "workManagerImpl.workDatabase");
        ob.s sVarE = workDatabase.E();
        ob.c cVarZ = workDatabase.z();
        ArrayList arrayListM = ns.o.M(str);
        while (!arrayListM.isEmpty()) {
            String str2 = (String) ry.m.M0(arrayListM);
            e0 e0VarM = sVarE.m(str2);
            if (e0VarM != e0.SUCCEEDED && e0VarM != e0.FAILED) {
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) sVarE.f44875a;
                workDatabase_Impl.b();
                ob.h hVar = (ob.h) sVarE.f44879e;
                la.j jVarA = hVar.a();
                jVarA.l(1, str2);
                try {
                    workDatabase_Impl.c();
                    try {
                        jVarA.a();
                        workDatabase_Impl.x();
                        workDatabase_Impl.s();
                        hVar.i(jVarA);
                    } catch (Throwable th2) {
                        workDatabase_Impl.s();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    hVar.i(jVarA);
                    throw th3;
                }
            }
            arrayListM.addAll(cVarZ.o(str2));
        }
        gb.d dVar = pVar.f28958f;
        kotlin.jvm.internal.m.e(dVar, "workManagerImpl.processor");
        synchronized (dVar.f28927k) {
            fb.l.b().getClass();
            dVar.f28925i.add(str);
            a0VarB = dVar.b(str);
        }
        gb.d.d(a0VarB, 1);
        Iterator it = pVar.f28957e.iterator();
        while (it.hasNext()) {
            ((gb.f) it.next()).d(str);
        }
    }

    public static final void b(WorkDatabase workDatabase, fb.c configuration, gb.l lVar) {
        int i11;
        kotlin.jvm.internal.m.f(workDatabase, "workDatabase");
        kotlin.jvm.internal.m.f(configuration, "configuration");
        ArrayList arrayListM = ns.o.M(lVar);
        int i12 = 0;
        while (!arrayListM.isEmpty()) {
            List list = ((gb.l) ry.m.M0(arrayListM)).f28943d;
            if (list.isEmpty()) {
                i11 = 0;
            } else {
                Iterator it = list.iterator();
                i11 = 0;
                while (it.hasNext()) {
                    if (((x) it.next()).f27115b.f44857j.b() && (i11 = i11 + 1) < 0) {
                        ns.o.U();
                        throw null;
                    }
                }
            }
            i12 += i11;
        }
        if (i12 == 0) {
            return;
        }
        ob.s sVarE = workDatabase.E();
        sVarE.getClass();
        u uVarB = u.b(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) sVarE.f44875a;
        workDatabase_Impl.b();
        Cursor cursorF = cf.x.F(workDatabase_Impl, uVarB, false);
        try {
            int i13 = cursorF.moveToFirst() ? cursorF.getInt(0) : 0;
            cursorF.close();
            uVarB.release();
            int i14 = configuration.f27054i;
            if (i13 + i12 > i14) {
                throw new IllegalArgumentException(p0.i(i12, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", w4.c.k("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", i14, ";\nalready enqueued count: ", i13, ";\ncurrent enqueue operation count: ")));
            }
        } catch (Throwable th2) {
            cursorF.close();
            uVarB.release();
            throw th2;
        }
    }
}
