package pb;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import cf.x;
import fb.a0;
import fb.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import ob.t;
import w9.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f46730a = 0;

    static {
        fb.l.c("EnqueueRunnable");
    }

    /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
    public static boolean a(gb.l lVar) throws Throwable {
        boolean z11;
        boolean z12;
        boolean z13;
        List list;
        boolean z14;
        WorkDatabase workDatabase;
        boolean z15;
        boolean z16;
        boolean z17;
        HashSet hashSetB = gb.l.B(lVar);
        gb.p pVar = lVar.f28940a;
        List list2 = lVar.f28943d;
        String[] strArr = (String[]) hashSetB.toArray(new String[0]);
        String str = lVar.f28941b;
        fb.n nVar = lVar.f28942c;
        pVar.f28954b.f27049d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = pVar.f28955c;
        boolean z18 = strArr != null && strArr.length > 0;
        if (z18) {
            int length = strArr.length;
            int i11 = 0;
            z12 = false;
            z13 = false;
            z11 = true;
            while (true) {
                if (i11 < length) {
                    ob.p pVarN = workDatabase2.E().n(strArr[i11]);
                    if (pVarN == null) {
                        fb.l.b().getClass();
                    } else {
                        e0 e0Var = pVarN.f44849b;
                        z11 &= e0Var == e0.SUCCEEDED;
                        if (e0Var == e0.FAILED) {
                            z13 = true;
                        } else if (e0Var == e0.CANCELLED) {
                            z12 = true;
                        }
                        i11++;
                    }
                }
                z17 = false;
                lVar.f28946g = true;
                return z17;
            }
        }
        z11 = true;
        z12 = false;
        z13 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z18) {
            list = list2;
            z14 = zIsEmpty;
            workDatabase = workDatabase2;
            z15 = false;
            z16 = z15;
        } else {
            ArrayList arrayListO = workDatabase2.E().o(str);
            if (arrayListO.isEmpty()) {
                list = list2;
                z14 = zIsEmpty;
                workDatabase = workDatabase2;
                z15 = false;
            } else if (nVar == fb.n.APPEND || nVar == fb.n.APPEND_OR_REPLACE) {
                list = list2;
                ob.c cVarZ = workDatabase2.z();
                ArrayList arrayList = new ArrayList();
                int size = arrayListO.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayListO.get(i12);
                    i12++;
                    boolean z19 = zIsEmpty;
                    ob.n nVar2 = (ob.n) obj;
                    WorkDatabase workDatabase3 = workDatabase2;
                    String str2 = nVar2.f44829a;
                    cVarZ.getClass();
                    ArrayList arrayList2 = arrayListO;
                    int i13 = size;
                    u uVarB = u.b(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                    uVarB.l(1, str2);
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVarZ.f44799b;
                    workDatabase_Impl.b();
                    Cursor cursorF = x.F(workDatabase_Impl, uVarB, false);
                    try {
                        boolean z20 = cursorF.moveToFirst() && cursorF.getInt(0) != 0;
                        cursorF.close();
                        uVarB.release();
                        if (!z20) {
                            e0 e0Var2 = nVar2.f44830b;
                            boolean z21 = (e0Var2 == e0.SUCCEEDED) & z11;
                            if (e0Var2 == e0.FAILED) {
                                z13 = true;
                            } else if (e0Var2 == e0.CANCELLED) {
                                z12 = true;
                            }
                            arrayList.add(nVar2.f44829a);
                            z11 = z21;
                        }
                        workDatabase2 = workDatabase3;
                        zIsEmpty = z19;
                        arrayListO = arrayList2;
                        size = i13;
                    } catch (Throwable th2) {
                        cursorF.close();
                        uVarB.release();
                        throw th2;
                    }
                }
                z14 = zIsEmpty;
                workDatabase = workDatabase2;
                z15 = false;
                List list3 = arrayList;
                list3 = arrayList;
                if (nVar == fb.n.APPEND_OR_REPLACE && (z12 || z13)) {
                    ob.s sVarE = workDatabase.E();
                    ArrayList arrayListO2 = sVarE.o(str);
                    int size2 = arrayListO2.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayListO2.get(i14);
                        i14++;
                        sVarE.f(((ob.n) obj2).f44829a);
                    }
                    z12 = false;
                    z13 = false;
                    list3 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) list3.toArray(strArr);
                z18 = strArr.length > 0;
            } else {
                if (nVar == fb.n.KEEP) {
                    int size3 = arrayListO.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size3) {
                            Object obj3 = arrayListO.get(i15);
                            i15++;
                            e0 e0Var3 = ((ob.n) obj3).f44830b;
                            List list4 = list2;
                            if (e0Var3 == e0.ENQUEUED || e0Var3 == e0.RUNNING) {
                                z17 = false;
                                lVar.f28946g = true;
                                return z17;
                            }
                            list2 = list4;
                        }
                    }
                }
                list = list2;
                workDatabase2.w(new s0.u(new androidx.fragment.app.d(workDatabase2, str, pVar, 15), 21));
                ob.s sVarE2 = workDatabase2.E();
                int size4 = arrayListO.size();
                int i16 = 0;
                while (i16 < size4) {
                    Object obj4 = arrayListO.get(i16);
                    i16++;
                    sVarE2.f(((ob.n) obj4).f44829a);
                }
                z14 = zIsEmpty;
                workDatabase = workDatabase2;
                z16 = true;
            }
            z16 = z15;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fb.x xVar = (fb.x) it.next();
            ob.p pVarB = xVar.f27115b;
            UUID uuid = xVar.f27114a;
            if (!z18 || z11) {
                pVarB.f44860n = jCurrentTimeMillis;
            } else if (z13) {
                pVarB.f44849b = e0.FAILED;
            } else if (z12) {
                pVarB.f44849b = e0.CANCELLED;
            } else {
                pVarB.f44849b = e0.BLOCKED;
            }
            if (pVarB.f44849b == e0.ENQUEUED) {
                z16 = true;
            }
            ob.s sVarE3 = workDatabase.E();
            List schedulers = pVar.f28957e;
            gb.p pVar2 = pVar;
            kotlin.jvm.internal.m.f(schedulers, "schedulers");
            boolean zB = pVarB.f44852e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            boolean z22 = z16;
            boolean zB2 = pVarB.f44852e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zB3 = pVarB.f44852e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (!zB && zB2 && zB3) {
                String str3 = pVarB.f44850c;
                a0 a0Var = new a0();
                fb.j data = pVarB.f44852e;
                kotlin.jvm.internal.m.f(data, "data");
                a0Var.c(data.f27096a);
                ((LinkedHashMap) a0Var.f27039a).put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str3);
                pVarB = ob.p.b(pVarB, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", a0Var.a());
            }
            if (Build.VERSION.SDK_INT < 26) {
                fb.f fVar = pVarB.f44857j;
                String str4 = pVarB.f44850c;
                if (!kotlin.jvm.internal.m.a(str4, ConstraintTrackingWorker.class.getName()) && (fVar.f27069e || fVar.f27070f)) {
                    a0 a0Var2 = new a0();
                    fb.j data2 = pVarB.f44852e;
                    kotlin.jvm.internal.m.f(data2, "data");
                    a0Var2.c(data2.f27096a);
                    ((LinkedHashMap) a0Var2.f27039a).put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
                    pVarB = ob.p.b(pVarB, ConstraintTrackingWorker.class.getName(), a0Var2.a());
                }
            }
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) sVarE3.f44875a;
            workDatabase_Impl2.b();
            workDatabase_Impl2.c();
            try {
                ((ob.b) sVarE3.f44876b).m(pVarB);
                workDatabase_Impl2.x();
                workDatabase_Impl2.s();
                if (z18) {
                    for (String str5 : strArr) {
                        String string = uuid.toString();
                        kotlin.jvm.internal.m.e(string, "id.toString()");
                        ob.a aVar = new ob.a(string, str5);
                        ob.c cVarZ2 = workDatabase.z();
                        WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) cVarZ2.f44799b;
                        workDatabase_Impl3.b();
                        workDatabase_Impl3.c();
                        try {
                            ((ob.b) cVarZ2.f44800c).m(aVar);
                            workDatabase_Impl3.x();
                            workDatabase_Impl3.s();
                        } catch (Throwable th3) {
                            workDatabase_Impl3.s();
                            throw th3;
                        }
                    }
                }
                ob.u uVarF = workDatabase.F();
                String string2 = uuid.toString();
                kotlin.jvm.internal.m.e(string2, "id.toString()");
                Set tags = xVar.f27116c;
                uVarF.getClass();
                kotlin.jvm.internal.m.f(tags, "tags");
                Iterator it2 = tags.iterator();
                while (it2.hasNext()) {
                    t tVar = new t((String) it2.next(), string2);
                    WorkDatabase_Impl workDatabase_Impl4 = (WorkDatabase_Impl) uVarF.f44891b;
                    workDatabase_Impl4.b();
                    workDatabase_Impl4.c();
                    try {
                        ((ob.b) uVarF.f44892c).m(tVar);
                        workDatabase_Impl4.x();
                        workDatabase_Impl4.s();
                    } catch (Throwable th4) {
                        workDatabase_Impl4.s();
                        throw th4;
                    }
                }
                if (!z14) {
                    ob.l lVarC = workDatabase.C();
                    String string3 = uuid.toString();
                    kotlin.jvm.internal.m.e(string3, "id.toString()");
                    ob.k kVar = new ob.k(str, string3);
                    WorkDatabase_Impl workDatabase_Impl5 = (WorkDatabase_Impl) lVarC.f44822b;
                    workDatabase_Impl5.b();
                    workDatabase_Impl5.c();
                    try {
                        ((ob.b) lVarC.f44823c).m(kVar);
                        workDatabase_Impl5.x();
                        workDatabase_Impl5.s();
                    } catch (Throwable th5) {
                        workDatabase_Impl5.s();
                        throw th5;
                    }
                }
                pVar = pVar2;
                it = it;
                z16 = z22;
                jCurrentTimeMillis = jCurrentTimeMillis;
            } catch (Throwable th6) {
                workDatabase_Impl2.s();
                throw th6;
            }
        }
        z17 = z16;
        lVar.f28946g = true;
        return z17;
    }
}
