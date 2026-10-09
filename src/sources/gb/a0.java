package gb;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Trace;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import hh.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import r.x2;
import rz.e0;
import rz.g1;
import rz.h1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob.p f28894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qb.a f28897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fb.c f28898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fb.l f28899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f28900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WorkDatabase f28901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ob.s f28902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ob.c f28903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f28904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f28905l;
    public final h1 m;

    public a0(x2 x2Var) {
        ob.p pVar = (ob.p) x2Var.f48714f;
        this.f28894a = pVar;
        this.f28895b = (Context) x2Var.f48709a;
        String str = pVar.f44848a;
        this.f28896c = str;
        this.f28897d = (qb.a) x2Var.f48711c;
        fb.c cVar = (fb.c) x2Var.f48710b;
        this.f28898e = cVar;
        this.f28899f = cVar.f27049d;
        this.f28900g = (d) x2Var.f48712d;
        WorkDatabase workDatabase = (WorkDatabase) x2Var.f48713e;
        this.f28901h = workDatabase;
        this.f28902i = workDatabase.E();
        this.f28903j = workDatabase.z();
        ArrayList arrayList = (ArrayList) x2Var.f48715t;
        this.f28904k = arrayList;
        this.f28905l = ep.a.k(p0.q("Work [ id=", str, ", tags={ "), ry.m.y0(arrayList, ",", null, null, null, 62), " } ]");
        this.m = e0.d();
    }

    public final void b(int i11) {
        fb.e0 e0Var = fb.e0.ENQUEUED;
        ob.s sVar = this.f28902i;
        String str = this.f28896c;
        sVar.x(e0Var, str);
        this.f28899f.getClass();
        sVar.v(System.currentTimeMillis(), str);
        sVar.s(this.f28894a.f44868v, str);
        sVar.p(-1L, str);
        sVar.y(i11, str);
    }

    public final void c() {
        this.f28899f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ob.s sVar = this.f28902i;
        String str = this.f28896c;
        sVar.v(jCurrentTimeMillis, str);
        sVar.x(fb.e0.ENQUEUED, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) sVar.f44875a;
        workDatabase_Impl.b();
        ob.h hVar = (ob.h) sVar.f44884j;
        la.j jVarA = hVar.a();
        jVarA.l(1, str);
        try {
            workDatabase_Impl.c();
            try {
                jVarA.a();
                workDatabase_Impl.x();
                workDatabase_Impl.s();
                hVar.i(jVarA);
                sVar.s(this.f28894a.f44868v, str);
                workDatabase_Impl.b();
                ob.h hVar2 = (ob.h) sVar.f44880f;
                la.j jVarA2 = hVar2.a();
                jVarA2.l(1, str);
                try {
                    workDatabase_Impl.c();
                    try {
                        jVarA2.a();
                        workDatabase_Impl.x();
                        workDatabase_Impl.s();
                        hVar2.i(jVarA2);
                        sVar.p(-1L, str);
                    } catch (Throwable th2) {
                        workDatabase_Impl.s();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    hVar2.i(jVarA2);
                    throw th3;
                }
            } catch (Throwable th4) {
                workDatabase_Impl.s();
                throw th4;
            }
        } catch (Throwable th5) {
            hVar.i(jVarA);
            throw th5;
        }
    }

    public final void d(fb.u result) {
        kotlin.jvm.internal.m.f(result, "result");
        String str = this.f28896c;
        ArrayList arrayListM = ns.o.M(str);
        while (true) {
            boolean zIsEmpty = arrayListM.isEmpty();
            ob.s sVar = this.f28902i;
            if (zIsEmpty) {
                fb.j jVar = ((fb.r) result).f27108a;
                kotlin.jvm.internal.m.e(jVar, "failure.outputData");
                sVar.s(this.f28894a.f44868v, str);
                sVar.w(str, jVar);
                return;
            }
            String str2 = (String) ry.m.M0(arrayListM);
            if (sVar.m(str2) != fb.e0.CANCELLED) {
                sVar.x(fb.e0.FAILED, str2);
            }
            arrayListM.addAll(this.f28903j.o(str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    public static final Object a(a0 a0Var, xy.c cVar) {
        y yVar;
        wy.a aVar;
        OverwritingInputMerger overwritingInputMerger;
        OverwritingInputMerger overwritingInputMerger2;
        fb.j jVarA;
        final a0 a0Var2 = a0Var;
        String str = a0Var2.f28896c;
        qb.a aVar2 = a0Var2.f28897d;
        WorkDatabase workDatabase = a0Var2.f28901h;
        fb.c cVar2 = a0Var2.f28898e;
        fb.l lVar = cVar2.f27057l;
        ob.p pVar = a0Var2.f28894a;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i11 = yVar.f28975d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                yVar.f28975d = i11 - Integer.MIN_VALUE;
            } else {
                yVar = new y(a0Var2, cVar);
            }
        } else {
            yVar = new y(a0Var2, cVar);
        }
        Object objM = yVar.f28973b;
        wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
        int i12 = yVar.f28975d;
        try {
            if (i12 == 0) {
                com.bumptech.glide.e.F(objM);
                fb.l lVar2 = cVar2.f27050e;
                lVar.getClass();
                boolean zA = v10.c.A();
                String str2 = pVar.f44870x;
                if (!zA || str2 == null) {
                    aVar = aVar3;
                } else {
                    int iHashCode = pVar.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        pa.a.a(v10.c.L(str2), iHashCode);
                        aVar = aVar3;
                    } else {
                        String strL = v10.c.L(str2);
                        String str3 = scqhIrGXy.aZoVmHHYbIqGOQ;
                        try {
                            if (v10.c.f53475d == null) {
                                aVar = aVar3;
                                try {
                                    v10.c.f53475d = Trace.class.getMethod(str3, Long.TYPE, String.class, Integer.TYPE);
                                } catch (Exception e8) {
                                    e = e8;
                                    v10.c.y(e);
                                }
                            } else {
                                aVar = aVar3;
                            }
                            v10.c.f53475d.invoke(null, Long.valueOf(v10.c.f53473b), strL, Integer.valueOf(iHashCode));
                        } catch (Exception e10) {
                            e = e10;
                            aVar = aVar3;
                        }
                    }
                }
                final int i13 = 0;
                Boolean shouldExit = (Boolean) workDatabase.w(new s0.u(new Callable(a0Var2) { // from class: gb.s

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ a0 f28965b;

                    {
                        this.f28965b = a0Var2;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z11;
                        int i14 = i13;
                        a0 a0Var3 = this.f28965b;
                        switch (i14) {
                            case 0:
                                ob.p pVar2 = a0Var3.f28894a;
                                fb.e0 e0Var = pVar2.f44849b;
                                fb.e0 e0Var2 = fb.e0.ENQUEUED;
                                if (e0Var != e0Var2) {
                                    int i15 = b0.f28906a;
                                    fb.l.b().getClass();
                                    return Boolean.TRUE;
                                }
                                if (pVar2.d() || (pVar2.f44849b == e0Var2 && pVar2.f44858k > 0)) {
                                    a0Var3.f28899f.getClass();
                                    if (System.currentTimeMillis() < pVar2.a()) {
                                        fb.l lVarB = fb.l.b();
                                        int i16 = b0.f28906a;
                                        lVarB.getClass();
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            default:
                                ob.s sVar = a0Var3.f28902i;
                                String str4 = a0Var3.f28896c;
                                if (sVar.m(str4) == fb.e0.ENQUEUED) {
                                    sVar.x(fb.e0.RUNNING, str4);
                                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) sVar.f44875a;
                                    workDatabase_Impl.b();
                                    ob.h hVar = (ob.h) sVar.f44883i;
                                    la.j jVarA2 = hVar.a();
                                    z11 = true;
                                    jVarA2.l(1, str4);
                                    try {
                                        workDatabase_Impl.c();
                                        try {
                                            jVarA2.a();
                                            workDatabase_Impl.x();
                                            workDatabase_Impl.s();
                                            hVar.i(jVarA2);
                                            sVar.y(-256, str4);
                                        } catch (Throwable th2) {
                                            workDatabase_Impl.s();
                                            throw th2;
                                        }
                                    } catch (Throwable th3) {
                                        hVar.i(jVarA2);
                                        throw th3;
                                    }
                                } else {
                                    z11 = false;
                                }
                                return Boolean.valueOf(z11);
                        }
                    }
                }, 22));
                kotlin.jvm.internal.m.e(shouldExit, "shouldExit");
                if (shouldExit.booleanValue()) {
                    return new v();
                }
                if (pVar.d()) {
                    jVarA = pVar.f44852e;
                } else {
                    fb.l lVar3 = cVar2.f27051f;
                    String className = pVar.f44851d;
                    lVar3.getClass();
                    kotlin.jvm.internal.m.f(className, "className");
                    int i14 = fb.p.f27105a;
                    try {
                        Class<?> cls = Class.forName(className);
                        overwritingInputMerger = null;
                        try {
                            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                            kotlin.jvm.internal.m.d(objNewInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
                            overwritingInputMerger2 = (OverwritingInputMerger) objNewInstance;
                        } catch (Exception unused) {
                            fb.l.b().getClass();
                            overwritingInputMerger2 = overwritingInputMerger;
                        }
                    } catch (Exception unused2) {
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger2 == null) {
                        int i15 = b0.f28906a;
                        fb.l.b().getClass();
                        return new t();
                    }
                    List listK = ns.o.K(pVar.f44852e);
                    ob.s sVar = a0Var2.f28902i;
                    sVar.getClass();
                    w9.u uVarB = w9.u.b(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                    uVarB.l(1, str);
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) sVar.f44875a;
                    workDatabase_Impl.b();
                    Cursor cursorF = cf.x.F(workDatabase_Impl, uVarB, false);
                    try {
                        ArrayList arrayList = new ArrayList(cursorF.getCount());
                        while (cursorF.moveToNext()) {
                            arrayList.add(fb.j.a(cursorF.getBlob(0)));
                        }
                        cursorF.close();
                        uVarB.release();
                        ArrayList arrayListH0 = ry.m.H0(listK, arrayList);
                        fb.a0 a0Var3 = new fb.a0();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int size = arrayListH0.size();
                        while (i13 < size) {
                            Object obj = arrayListH0.get(i13);
                            i13++;
                            Map mapUnmodifiableMap = Collections.unmodifiableMap(((fb.j) obj).f27096a);
                            kotlin.jvm.internal.m.e(mapUnmodifiableMap, "unmodifiableMap(values)");
                            linkedHashMap.putAll(mapUnmodifiableMap);
                            arrayListH0 = arrayListH0;
                        }
                        a0Var3.c(linkedHashMap);
                        jVarA = a0Var3.a();
                    } catch (Throwable th2) {
                        cursorF.close();
                        uVarB.release();
                        throw th2;
                    }
                }
                UUID uuidFromString = UUID.fromString(str);
                ArrayList arrayList2 = a0Var2.f28904k;
                int i16 = pVar.f44858k;
                ExecutorService executorService = cVar2.f27046a;
                yz.f fVar = cVar2.f27047b;
                y yVar2 = yVar;
                pb.o oVar = new pb.o(workDatabase, a0Var2.f28900g, aVar2);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.f2787a = uuidFromString;
                workerParameters.f2788b = jVarA;
                new HashSet(arrayList2);
                workerParameters.f2789c = i16;
                workerParameters.f2790d = executorService;
                workerParameters.f2791e = fVar;
                workerParameters.f2792f = aVar2;
                workerParameters.f2793g = lVar2;
                try {
                    fb.v vVarA = lVar2.a(a0Var2.f28895b, pVar.f44850c, workerParameters);
                    final int i17 = 1;
                    vVarA.f27113d = true;
                    vy.g gVar = yVar2.getContext().get(rz.z.f50978b);
                    kotlin.jvm.internal.m.c(gVar);
                    g1 g1Var = (g1) gVar;
                    g1Var.invokeOnCompletion(new z(vVarA, zA, str2, a0Var2));
                    Object objW = workDatabase.w(new s0.u(new Callable(a0Var2) { // from class: gb.s

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ a0 f28965b;

                        {
                            this.f28965b = a0Var2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            boolean z11;
                            int i18 = i17;
                            a0 a0Var4 = this.f28965b;
                            switch (i18) {
                                case 0:
                                    ob.p pVar2 = a0Var4.f28894a;
                                    fb.e0 e0Var = pVar2.f44849b;
                                    fb.e0 e0Var2 = fb.e0.ENQUEUED;
                                    if (e0Var != e0Var2) {
                                        int i19 = b0.f28906a;
                                        fb.l.b().getClass();
                                        return Boolean.TRUE;
                                    }
                                    if (pVar2.d() || (pVar2.f44849b == e0Var2 && pVar2.f44858k > 0)) {
                                        a0Var4.f28899f.getClass();
                                        if (System.currentTimeMillis() < pVar2.a()) {
                                            fb.l lVarB = fb.l.b();
                                            int i110 = b0.f28906a;
                                            lVarB.getClass();
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    ob.s sVar2 = a0Var4.f28902i;
                                    String str4 = a0Var4.f28896c;
                                    if (sVar2.m(str4) == fb.e0.ENQUEUED) {
                                        sVar2.x(fb.e0.RUNNING, str4);
                                        WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) sVar2.f44875a;
                                        workDatabase_Impl2.b();
                                        ob.h hVar = (ob.h) sVar2.f44883i;
                                        la.j jVarA2 = hVar.a();
                                        z11 = true;
                                        jVarA2.l(1, str4);
                                        try {
                                            workDatabase_Impl2.c();
                                            try {
                                                jVarA2.a();
                                                workDatabase_Impl2.x();
                                                workDatabase_Impl2.s();
                                                hVar.i(jVarA2);
                                                sVar2.y(-256, str4);
                                            } catch (Throwable th3) {
                                                workDatabase_Impl2.s();
                                                throw th3;
                                            }
                                        } catch (Throwable th4) {
                                            hVar.i(jVarA2);
                                            throw th4;
                                        }
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                            }
                        }
                    }, 22));
                    kotlin.jvm.internal.m.e(objW, "workDatabase.runInTransa…e\n            }\n        )");
                    if (!((Boolean) objW).booleanValue()) {
                        return new v();
                    }
                    if (g1Var.isCancelled()) {
                        return new v();
                    }
                    o20.a aVar4 = aVar2.f47697d;
                    kotlin.jvm.internal.m.e(aVar4, "workTaskExecutor.getMainThreadExecutor()");
                    rz.y yVarP = e0.p(aVar4);
                    fr.c cVar3 = new fr.c(a0Var2, vVarA, oVar, (vy.d) null, 8);
                    yVar2.f28972a = a0Var2;
                    yVar2.f28975d = 1;
                    objM = e0.M(yVarP, cVar3, yVar2);
                    wy.a aVar5 = aVar;
                    if (objM == aVar5) {
                        return aVar5;
                    }
                } catch (Throwable unused3) {
                    int i18 = b0.f28906a;
                    fb.l.b().getClass();
                    return new t();
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0Var2 = yVar.f28972a;
                com.bumptech.glide.e.F(objM);
            }
            fb.u result = (fb.u) objM;
            kotlin.jvm.internal.m.e(result, "result");
            return new u(result);
        } catch (CancellationException e11) {
            int i19 = b0.f28906a;
            fb.l lVarB = fb.l.b();
            String str4 = a0Var2.f28905l;
            lVarB.getClass();
            throw e11;
        } catch (Throwable unused4) {
            int i21 = b0.f28906a;
            fb.l lVarB2 = fb.l.b();
            String str5 = a0Var2.f28905l;
            lVarB2.getClass();
            return new t();
        }
    }
}
