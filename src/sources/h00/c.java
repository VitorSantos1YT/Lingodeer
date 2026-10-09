package h00;

import com.android.billingclient.api.k0;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f29915d = new b(new j(false, false, true, "    ", false, "type", true, a.POLYMORPHIC), j00.f.f35451a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f29916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.android.billingclient.api.h f29917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5.j f29918c = new a5.j(19);

    public c(j jVar, com.android.billingclient.api.h hVar) {
        this.f29916a = jVar;
        this.f29917b = hVar;
    }

    public final Object a(c00.a deserializer, m mVar) {
        f00.c lVar;
        kotlin.jvm.internal.m.f(deserializer, "deserializer");
        String str = null;
        if (mVar instanceof z) {
            lVar = new i00.n(this, (z) mVar, str, 12);
        } else if (mVar instanceof e) {
            lVar = new i00.o(this, (e) mVar);
        } else {
            if (!(mVar instanceof t) && !mVar.equals(w.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            lVar = new i00.l(this, (d0) mVar, null);
        }
        return lVar.x(deserializer);
    }

    public final Object b(c00.a deserializer, String string) {
        kotlin.jvm.internal.m.f(deserializer, "deserializer");
        kotlin.jvm.internal.m.f(string, "string");
        a.a aVar = new a.a(string);
        Object objX = new i00.v(this, i00.a0.OBJ, aVar, deserializer.getDescriptor(), null).x(deserializer);
        if (aVar.l() == 10) {
            return objX;
        }
        a.a.u(aVar, "Expected EOF after parsing, but had " + string.charAt(aVar.f5b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String c(c00.a serializer, Object obj) {
        char[] cArr;
        kotlin.jvm.internal.m.f(serializer, "serializer");
        com.android.billingclient.api.c0 c0Var = new com.android.billingclient.api.c0((char) 0, 5);
        i00.d dVar = i00.d.f33900c;
        synchronized (dVar) {
            ry.k kVar = (ry.k) dVar.f1510b;
            cArr = null;
            char[] cArr2 = (char[]) (kVar.isEmpty() ? null : kVar.removeLast());
            if (cArr2 != null) {
                dVar.f1509a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c0Var.f7471c = cArr;
        try {
            i00.a0 mode = i00.a0.OBJ;
            q[] qVarArr = new q[((ry.a) i00.a0.a()).b()];
            kotlin.jvm.internal.m.f(mode, "mode");
            new i00.x(new k0(c0Var), this, mode, qVarArr).y(serializer, obj);
            return c0Var.toString();
        } finally {
            c0Var.f();
        }
    }

    public final m d(String string) {
        kotlin.jvm.internal.m.f(string, "string");
        return (m) b(o.f29939a, string);
    }
}
