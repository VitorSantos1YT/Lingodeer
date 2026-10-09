package se;

import android.content.Intent;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.android.billingclient.api.c0;
import fr.p3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import lf.e0;
import lf.h0;
import lf.i0;
import lf.y0;
import re.b0;
import re.d0;
import re.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ScheduledFuture f51603c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile g f51601a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService f51602b = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cf.c f51604d = new cf.c(13);

    public static final re.y a(b bVar, y yVar, boolean z11, c0 c0Var) {
        if (!qf.a.b(j.class)) {
            try {
                String str = bVar.f51580a;
                e0 e0VarK = h0.k(str, false);
                String str2 = re.y.f49225j;
                re.y yVarC = re.v.C(null, String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1)), null, null);
                yVarC.f49236i = true;
                Bundle bundle = yVarC.f49231d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("access_token", bVar.f51581b);
                synchronized (m.c()) {
                    qf.a.b(m.class);
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = m.f51605c;
                String strM = g0.m();
                if (strM != null) {
                    bundle.putString(Constants.INSTALL_REFERRER, strM);
                }
                yVarC.f49231d = bundle;
                int iC = yVar.c(yVarC, re.s.a(), e0VarK != null ? e0VarK.f39997a : false, z11);
                if (iC != 0) {
                    c0Var.f7470b += iC;
                    yVarC.j(new re.c(bVar, yVarC, yVar, c0Var, 1));
                    return yVarC;
                }
            } catch (Throwable th2) {
                qf.a.a(j.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final ArrayList b(g appEventCollection, c0 c0Var) {
        if (qf.a.b(j.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.m.f(appEventCollection, "appEventCollection");
            boolean zG = re.s.g(re.s.a());
            ArrayList arrayList = new ArrayList();
            for (b bVar : appEventCollection.f()) {
                y yVarB = appEventCollection.b(bVar);
                if (yVarB == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                re.y yVarA = a(bVar, yVarB, zG, c0Var);
                if (yVarA != null) {
                    arrayList.add(yVarA);
                    if (ue.f.f52925a) {
                        HashSet hashSet = ue.q.f52942a;
                        try {
                            re.s.d().execute(new i0(yVarA, 13));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            qf.a.a(j.class, th2);
            return null;
        }
    }

    public static final void c(q reason) {
        if (qf.a.b(j.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(reason, "reason");
            f51602b.execute(new i0(reason, 9));
        } catch (Throwable th2) {
            qf.a.a(j.class, th2);
        }
    }

    public static final void d(q reason) {
        if (qf.a.b(j.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.m.f(reason, "reason");
            f51601a.a(i.B());
            try {
                c0 c0VarF = f(reason, f51601a);
                if (c0VarF != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", c0VarF.f7470b);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (r) c0VarF.f7471c);
                    x6.b.a(re.s.a()).c(intent);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            qf.a.a(j.class, th2);
        }
    }

    public static final void e(b bVar, re.y yVar, b0 b0Var, y yVar2, c0 c0Var) {
        r rVar;
        if (qf.a.b(j.class)) {
            return;
        }
        try {
            re.r rVar2 = b0Var.f49125c;
            r rVar3 = r.SUCCESS;
            if (rVar2 == null) {
                rVar = rVar3;
            } else if (rVar2.f49195b == -1) {
                rVar = r.NO_CONNECTIVITY;
            } else {
                String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{b0Var.toString(), rVar2.toString()}, 2));
                rVar = r.SERVER_ERROR;
            }
            re.s.i(d0.APP_EVENTS);
            boolean z11 = rVar2 != null;
            synchronized (yVar2) {
                if (!qf.a.b(yVar2)) {
                    if (z11) {
                        try {
                            yVar2.f51620c.addAll(yVar2.f51621d);
                        } catch (Throwable th2) {
                            qf.a.a(yVar2, th2);
                        }
                    }
                    yVar2.f51621d.clear();
                    yVar2.f51622e = 0;
                }
            }
            r rVar4 = r.NO_CONNECTIVITY;
            if (rVar == rVar4) {
                re.s.d().execute(new pb.b(4, bVar, yVar2));
            }
            if (rVar == rVar3 || ((r) c0Var.f7471c) == rVar4) {
                return;
            }
            kotlin.jvm.internal.m.f(rVar, "<set-?>");
            c0Var.f7471c = rVar;
        } catch (Throwable th3) {
            qf.a.a(j.class, th3);
        }
    }

    public static final c0 f(q reason, g appEventCollection) {
        if (!qf.a.b(j.class)) {
            try {
                kotlin.jvm.internal.m.f(reason, "reason");
                kotlin.jvm.internal.m.f(appEventCollection, "appEventCollection");
                int i11 = 0;
                c0 c0Var = new c0((char) 0, 13);
                c0Var.f7471c = r.SUCCESS;
                ArrayList arrayListB = b(appEventCollection, c0Var);
                if (!arrayListB.isEmpty()) {
                    p3 p3Var = y0.f40132d;
                    p3.s(d0.APP_EVENTS, "se.j", "Flushing %d events due to %s.", Integer.valueOf(c0Var.f7470b), reason.toString());
                    int size = arrayListB.size();
                    while (i11 < size) {
                        Object obj = arrayListB.get(i11);
                        i11++;
                        ((re.y) obj).c();
                    }
                    return c0Var;
                }
            } catch (Throwable th2) {
                qf.a.a(j.class, th2);
                return null;
            }
        }
        return null;
    }
}
