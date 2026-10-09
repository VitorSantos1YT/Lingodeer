package lw;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mw.a4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f40460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static s0 f40461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f40462e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f40463a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f40464b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(s0.class.getName());
        f40460c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z11 = a4.f42339a;
            arrayList.add(a4.class);
        } catch (ClassNotFoundException e8) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e8);
        }
        try {
            arrayList.add(sw.a0.class);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e10);
        }
        f40462e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized s0 a() {
        try {
            if (f40461d == null) {
                List<r0> listF = y.f(r0.class, f40462e, r0.class.getClassLoader(), new k(6));
                f40461d = new s0();
                for (r0 r0Var : listF) {
                    f40460c.fine("Service loader found " + r0Var);
                    s0 s0Var = f40461d;
                    synchronized (s0Var) {
                        r0Var.getClass();
                        s0Var.f40463a.add(r0Var);
                    }
                }
                f40461d.c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40461d;
    }

    public final synchronized r0 b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f40464b;
        Preconditions.k(str, "policy");
        return (r0) linkedHashMap.get(str);
    }

    public final synchronized void c() {
        this.f40464b.clear();
        for (r0 r0Var : this.f40463a) {
            String strR = r0Var.r();
            if (((r0) this.f40464b.get(strR)) == null) {
                this.f40464b.put(strR, r0Var);
            }
        }
    }
}
