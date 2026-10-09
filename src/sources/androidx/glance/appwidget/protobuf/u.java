package androidx.glance.appwidget.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f1999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f2000b;

    public u(x xVar) {
        this.f1999a = xVar;
        if (xVar.f()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2000b = xVar.h();
    }

    public static void f(Object obj, Object obj2) {
        t0 t0Var = t0.f1996c;
        t0Var.getClass();
        t0Var.a(obj.getClass()).a(obj, obj2);
    }

    public final x a() {
        x xVarC = c();
        xVarC.getClass();
        if (x.e(xVarC, true)) {
            return xVarC;
        }
        throw new UninitializedMessageException();
    }

    public final x c() {
        if (!this.f2000b.f()) {
            return this.f2000b;
        }
        x xVar = this.f2000b;
        xVar.getClass();
        t0 t0Var = t0.f1996c;
        t0Var.getClass();
        t0Var.a(xVar.getClass()).b(xVar);
        xVar.g();
        return this.f2000b;
    }

    public final Object clone() {
        u uVar = (u) this.f1999a.b(w.NEW_BUILDER);
        uVar.f2000b = c();
        return uVar;
    }

    public final void d() {
        if (this.f2000b.f()) {
            return;
        }
        x xVarH = this.f1999a.h();
        f(xVarH, this.f2000b);
        this.f2000b = xVarH;
    }
}
