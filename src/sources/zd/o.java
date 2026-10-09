package zd;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f59178b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f59179a;

    static {
        char[] cArr = pe.m.f46830a;
        f59178b = new ArrayDeque(0);
    }

    public static o a(Object obj) {
        o oVar;
        ArrayDeque arrayDeque = f59178b;
        synchronized (arrayDeque) {
            oVar = (o) arrayDeque.poll();
        }
        if (oVar == null) {
            oVar = new o();
        }
        oVar.f59179a = obj;
        return oVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && this.f59179a.equals(((o) obj).f59179a);
    }

    public final int hashCode() {
        return this.f59179a.hashCode();
    }
}
