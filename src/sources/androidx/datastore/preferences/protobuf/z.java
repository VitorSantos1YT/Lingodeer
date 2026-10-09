package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f1580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c0 f1581b;

    public z(c0 c0Var) {
        this.f1580a = c0Var;
        if (c0Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f1581b = c0Var.i();
    }

    public final c0 a() {
        c0 c0VarC = c();
        c0VarC.getClass();
        if (c0.f(c0VarC, true)) {
            return c0VarC;
        }
        throw new UninitializedMessageException();
    }

    public final c0 c() {
        if (!this.f1581b.g()) {
            return this.f1581b;
        }
        c0 c0Var = this.f1581b;
        c0Var.getClass();
        a1 a1Var = a1.f1445c;
        a1Var.getClass();
        a1Var.a(c0Var.getClass()).b(c0Var);
        c0Var.h();
        return this.f1581b;
    }

    public final Object clone() {
        z zVar = (z) this.f1580a.c(b0.NEW_BUILDER);
        zVar.f1581b = c();
        return zVar;
    }

    public final void d() {
        if (this.f1581b.g()) {
            return;
        }
        c0 c0VarI = this.f1580a.i();
        c0 c0Var = this.f1581b;
        a1 a1Var = a1.f1445c;
        a1Var.getClass();
        a1Var.a(c0VarI.getClass()).a(c0VarI, c0Var);
        this.f1581b = c0VarI;
    }
}
