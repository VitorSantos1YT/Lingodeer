package lw;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f40447a = Logger.getLogger(r.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f40448b = new r();

    public static r b() {
        ((u1) p.f40427a).getClass();
        r rVar = (r) u1.f40478b.get();
        r rVar2 = f40448b;
        if (rVar == null) {
            rVar = rVar2;
        }
        return rVar == null ? rVar2 : rVar;
    }

    public final r a() {
        ((u1) p.f40427a).getClass();
        ThreadLocal threadLocal = u1.f40478b;
        r rVar = (r) threadLocal.get();
        r rVar2 = f40448b;
        if (rVar == null) {
            rVar = rVar2;
        }
        threadLocal.set(this);
        return rVar == null ? rVar2 : rVar;
    }

    public final void c(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("toAttach");
        }
        u1 u1Var = (u1) p.f40427a;
        ThreadLocal threadLocal = u1.f40478b;
        u1Var.getClass();
        r rVar2 = (r) threadLocal.get();
        r rVar3 = f40448b;
        if (rVar2 == null) {
            rVar2 = rVar3;
        }
        if (rVar2 != this) {
            u1.f40477a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (rVar != rVar3) {
            threadLocal.set(rVar);
        } else {
            threadLocal.set(null);
        }
    }
}
