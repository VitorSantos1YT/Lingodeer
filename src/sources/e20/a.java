package e20;

import a9.i;
import b0.h2;
import b20.c;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.m;
import org.koin.core.error.NoDefinitionFoundException;
import pz.j;
import pz.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b20.a f24765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f24768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f24769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f24770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadLocal f24771g;

    public a(b20.a scopeQualifier, String str, c cVar, i iVar, int i11) {
        boolean z11 = (i11 & 4) == 0;
        cVar = (i11 & 8) != 0 ? null : cVar;
        m.f(scopeQualifier, "scopeQualifier");
        this.f24765a = scopeQualifier;
        this.f24766b = str;
        this.f24767c = z11;
        this.f24768d = cVar;
        this.f24769e = iVar;
        this.f24770f = new ArrayList();
        new LinkedHashSet();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    public final Object a(a20.a aVar, b20.a aVar2, e eVar) {
        String str;
        i iVar = this.f24769e;
        h2 h2Var = (h2) iVar.f517a;
        w10.a aVar3 = w10.a.DEBUG;
        if (((w10.a) h2Var.f3561b).compareTo(aVar3) > 0) {
            return c(aVar, aVar2, eVar);
        }
        String strO = BuildConfig.VERSION_NAME;
        if (aVar2 != null) {
            str = " with qualifier '" + aVar2 + '\'';
            if (str == null) {
                str = BuildConfig.VERSION_NAME;
            }
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        if (!this.f24767c) {
            strO = p0.o(new StringBuilder(" - scope:'"), this.f24766b, '\'');
        }
        ((h2) iVar.f517a).W(aVar3, "|- '" + f20.a.a(eVar) + '\'' + str + strO + "...");
        long jA = j.a();
        Object objC = c(aVar, aVar2, eVar);
        long jA2 = k.a(jA);
        h2 h2Var2 = (h2) iVar.f517a;
        StringBuilder sb2 = new StringBuilder("|- '");
        sb2.append(f20.a.a(eVar));
        sb2.append("' in ");
        int i11 = pz.a.f47220d;
        sb2.append(pz.a.j(jA2, pz.c.MICROSECONDS) / 1000.0d);
        sb2.append(" ms");
        h2Var2.W(aVar3, sb2.toString());
        return objC;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002b  */
    public final Object b(oi.c cVar) throws NoDefinitionFoundException {
        String str;
        ob.c cVar2 = (ob.c) this.f24769e.f518b;
        cVar2.getClass();
        Object objT = cVar2.t(this, cVar, true);
        if (objT != null) {
            return objT;
        }
        b20.a aVar = (b20.a) cVar.f44928d;
        if (aVar != null) {
            str = " and qualifier '" + aVar + '\'';
            if (str == null) {
                str = BuildConfig.VERSION_NAME;
            }
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        String msg = "No definition found for type '" + f20.a.a((e) cVar.f44927c) + '\'' + str + ". Check your Modules configuration and add missing type and/or qualifier!";
        m.f(msg, "msg");
        throw new NoDefinitionFoundException(msg);
    }

    public final Object c(a20.a aVar, b20.a aVar2, e eVar) {
        ry.k kVar;
        i iVar = this.f24769e;
        oi.c cVar = new oi.c((h2) iVar.f517a, this, eVar, aVar2, aVar);
        if (aVar == null) {
            return b(cVar);
        }
        h2 h2Var = (h2) iVar.f517a;
        w10.a aVar3 = w10.a.DEBUG;
        if (((w10.a) h2Var.f3561b).compareTo(aVar3) <= 0) {
            h2Var.W(aVar3, "| >> parameters " + aVar);
        }
        ThreadLocal threadLocal = this.f24771g;
        if (threadLocal == null || (kVar = (ry.k) threadLocal.get()) == null) {
            kVar = new ry.k();
            ThreadLocal threadLocal2 = new ThreadLocal();
            this.f24771g = threadLocal2;
            threadLocal2.set(kVar);
        }
        kVar.addFirst(aVar);
        try {
            return b(cVar);
        } finally {
            ((h2) iVar.f517a).V("| << parameters");
            if (!kVar.isEmpty()) {
                kVar.removeFirst();
            }
            if (kVar.isEmpty()) {
                ThreadLocal threadLocal3 = this.f24771g;
                if (threadLocal3 != null) {
                    threadLocal3.remove();
                }
                this.f24771g = null;
            }
        }
    }

    public final String toString() {
        return ep.a.k(new StringBuilder("['"), this.f24766b, "']");
    }
}
