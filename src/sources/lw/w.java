package lw;

import com.google.common.base.MoreObjects;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import mw.a3;
import mw.b3;
import mw.n3;
import mw.y2;
import mw.z2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w extends f {
    public final t0 r() {
        SSLSocketFactory sSLSocketFactory;
        rw.h hVar;
        z2 z2Var = ((nw.j) this).f44217d;
        z2Var.getClass();
        nw.j jVar = (nw.j) z2Var.f42874z.f378b;
        boolean z11 = jVar.f44224k != Long.MAX_VALUE;
        lf.x0 x0Var = jVar.f44219f;
        lf.x0 x0Var2 = jVar.f44220g;
        int i11 = nw.g.f44207b[jVar.f44223j.ordinal()];
        rw.h hVar2 = null;
        if (i11 == 1) {
            sSLSocketFactory = null;
        } else {
            if (i11 != 2) {
                throw new RuntimeException("Unknown negotiation type: " + jVar.f44223j);
            }
            try {
                if (jVar.f44221h == null) {
                    jVar.f44221h = SSLContext.getInstance("Default", io.grpc.okhttp.internal.k.f34537d.f34538a).getSocketFactory();
                }
                sSLSocketFactory = jVar.f44221h;
            } catch (GeneralSecurityException e8) {
                throw new RuntimeException("TLS Provider failure", e8);
            }
        }
        nw.i iVar = new nw.i(x0Var, x0Var2, sSLSocketFactory, jVar.f44222i, jVar.f44226n, z11, jVar.f44224k, jVar.f44225l, jVar.m, jVar.f44227o, jVar.f44218e);
        n3 n3Var = new n3(9);
        lf.x0 x0Var3 = new lf.x0(mw.k1.f42501p, 4);
        mw.i1 i1Var = mw.k1.f42503r;
        ArrayList arrayList = new ArrayList(z2Var.f42855f);
        synchronized (y.class) {
        }
        if (z2Var.f42869u) {
            Method method = z2.H;
            if (method != null) {
                try {
                    hVar = (rw.h) method.invoke(null, Boolean.valueOf(z2Var.f42870v), Boolean.valueOf(z2Var.f42871w), Boolean.FALSE, Boolean.valueOf(z2Var.f42872x));
                } catch (IllegalAccessException e10) {
                    z2.B.log(Level.FINE, "Unable to apply census stats", (Throwable) e10);
                    hVar = null;
                } catch (InvocationTargetException e11) {
                    z2.B.log(Level.FINE, "Unable to apply census stats", (Throwable) e11);
                    hVar = null;
                }
            } else {
                hVar = null;
            }
            if (hVar != null) {
                arrayList.add(0, hVar);
            }
        }
        if (z2Var.f42873y) {
            try {
                hVar2 = (rw.h) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
            } catch (ClassNotFoundException e12) {
                z2.B.log(Level.FINE, "Unable to apply census stats", (Throwable) e12);
            } catch (IllegalAccessException e13) {
                z2.B.log(Level.FINE, "Unable to apply census stats", (Throwable) e13);
            } catch (NoSuchMethodException e14) {
                z2.B.log(Level.FINE, "Unable to apply census stats", (Throwable) e14);
            } catch (InvocationTargetException e15) {
                z2.B.log(Level.FINE, "Unable to apply census stats", (Throwable) e15);
            }
            if (hVar2 != null) {
                arrayList.add(0, hVar2);
            }
        }
        y2 y2Var = new y2(z2Var, iVar, n3Var, x0Var3, i1Var, arrayList);
        ReferenceQueue referenceQueue = b3.f42357b;
        ConcurrentHashMap concurrentHashMap = b3.f42358c;
        b3 b3Var = new b3(y2Var);
        new a3(b3Var, y2Var, referenceQueue, concurrentHashMap);
        return b3Var;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(((nw.j) this).f44217d, "delegate");
        return toStringHelperB.toString();
    }
}
