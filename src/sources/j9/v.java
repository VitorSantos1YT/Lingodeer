package j9;

import android.app.Activity;
import android.content.Context;
import j3.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m9.g f36257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m9.e f36258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f36259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f36260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.e0 f36261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36262g;

    public v(Context context) {
        kotlin.jvm.internal.m.f(context, "context");
        this.f36256a = context;
        this.f36257b = new m9.g(this, new g(this, 0));
        this.f36258c = new m9.e(context);
        for (Object obj : nz.n.U(context, new i0(26))) {
            if (((Context) obj) instanceof Activity) {
                this.f36259d = (Activity) obj;
                this.f36261f = new f.e0(this);
                this.f36262g = true;
                d0 d0Var = this.f36257b.f41087s;
                d0Var.a(new u(d0Var));
                this.f36257b.f41087s.a(new b(this.f36256a));
                com.bumptech.glide.d.v(new g(this, 1));
            }
        }
        obj = null;
        this.f36259d = (Activity) obj;
        this.f36261f = new f.e0(this);
        this.f36262g = true;
        d0 d0Var2 = this.f36257b.f41087s;
        d0Var2.a(new u(d0Var2));
        this.f36257b.f41087s.a(new b(this.f36256a));
        com.bumptech.glide.d.v(new g(this, 1));
    }

    public static void b(v vVar, String str) {
        vVar.getClass();
        vVar.f36257b.m(str, null);
    }

    public final void a(String route, fz.c cVar) {
        kotlin.jvm.internal.m.f(route, "route");
        m9.g gVar = this.f36257b;
        gVar.getClass();
        gVar.m(route, com.bumptech.glide.d.w(cVar));
    }

    public final boolean c() {
        m9.g gVar = this.f36257b;
        if (!gVar.f41075f.isEmpty()) {
            q qVarG = gVar.g();
            kotlin.jvm.internal.m.c(qVarG);
            if (gVar.n(qVarG.f36242b.f3958a, true, false) && gVar.b()) {
                return true;
            }
        }
        return false;
    }
}
