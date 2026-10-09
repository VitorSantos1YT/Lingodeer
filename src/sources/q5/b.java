package q5;

import android.content.Context;
import fr.p3;
import java.util.List;
import kotlin.jvm.internal.m;
import n5.v;
import n5.y;
import n5.z;
import n9.q;
import ns.o;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements iz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f47463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz.c f47464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f47465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f47466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile r5.c f47467f;

    public b(String name, q qVar, fz.c cVar, b0 b0Var) {
        m.f(name, "name");
        this.f47462a = name;
        this.f47463b = qVar;
        this.f47464c = cVar;
        this.f47465d = b0Var;
        this.f47466e = new Object();
    }

    public final Object a(Object obj, mz.j property) {
        r5.c cVar;
        Context thisRef = (Context) obj;
        m.f(thisRef, "thisRef");
        m.f(property, "property");
        r5.c cVar2 = this.f47467f;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.f47466e) {
            try {
                if (this.f47467f == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    n5.b p3Var = this.f47463b;
                    fz.c cVar3 = this.f47464c;
                    m.e(applicationContext, "applicationContext");
                    List migrations = (List) cVar3.invoke(applicationContext);
                    b0 b0Var = this.f47465d;
                    d2.c cVar4 = new d2.c(11, applicationContext, this);
                    m.f(migrations, "migrations");
                    z zVar = new z(r5.g.f48824a, y.f43427a, new kb.d(1, cVar4));
                    if (p3Var == null) {
                        p3Var = new p3(24);
                    }
                    this.f47467f = new r5.c(new r5.c(new v(zVar, o.K(new n5.d(migrations, null, 0)), p3Var, b0Var)));
                }
                cVar = this.f47467f;
                m.c(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
