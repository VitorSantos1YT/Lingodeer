package h7;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f31951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f31953c;

    public t(long j11) {
        this.f31953c = new LinkedHashMap(100, 0.75f, true);
        this.f31951a = j11;
    }

    public synchronized Object a(Object obj) {
        pe.i iVar;
        iVar = (pe.i) ((LinkedHashMap) this.f31953c).get(obj);
        return iVar != null ? iVar.f46823a : null;
    }

    public int b(Object obj) {
        return 1;
    }

    public synchronized Object d(Object obj, Object obj2) {
        int iB = b(obj2);
        long j11 = iB;
        if (j11 >= this.f31951a) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f31952b += j11;
        }
        pe.i iVar = (pe.i) ((LinkedHashMap) this.f31953c).put(obj, obj2 == null ? null : new pe.i(obj2, iB));
        if (iVar != null) {
            this.f31952b -= (long) iVar.f46824b;
            if (!iVar.f46823a.equals(obj2)) {
                c(obj, iVar.f46823a);
            }
        }
        f(this.f31951a);
        return iVar != null ? iVar.f46823a : null;
    }

    public void e(Exception exc) {
        boolean z11;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f31953c) == null) {
            this.f31953c = exc;
        }
        if (this.f31951a == -9223372036854775807L) {
            synchronized (x.f31960n0) {
                z11 = x.f31962p0 > 0;
            }
            if (!z11) {
                this.f31951a = 200 + jElapsedRealtime;
            }
        }
        long j11 = this.f31951a;
        if (j11 == -9223372036854775807L || jElapsedRealtime < j11) {
            this.f31952b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.f31953c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.f31953c;
        this.f31953c = null;
        this.f31951a = -9223372036854775807L;
        this.f31952b = -9223372036854775807L;
        throw exc3;
    }

    public synchronized void f(long j11) {
        while (this.f31952b > j11) {
            Iterator it = ((LinkedHashMap) this.f31953c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            pe.i iVar = (pe.i) entry.getValue();
            this.f31952b -= (long) iVar.f46824b;
            Object key = entry.getKey();
            it.remove();
            c(key, iVar.f46823a);
        }
    }

    public t() {
        this.f31951a = -9223372036854775807L;
        this.f31952b = -9223372036854775807L;
    }

    public void c(Object obj, Object obj2) {
    }
}
