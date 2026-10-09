package n5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements vy.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f43240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f43241b;

    public a1(a1 a1Var, v vVar) {
        this.f43240a = a1Var;
        this.f43241b = vVar;
    }

    public final void a(v vVar) {
        if (this.f43241b == vVar) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        a1 a1Var = this.f43240a;
        if (a1Var != null) {
            a1Var.a(vVar);
        }
    }

    @Override // vy.i
    public final Object fold(Object obj, fz.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // vy.i
    public final vy.g get(vy.h hVar) {
        return ew.a.m(this, hVar);
    }

    @Override // vy.g
    public final vy.h getKey() {
        return z0.f43434a;
    }

    @Override // vy.i
    public final vy.i minusKey(vy.h hVar) {
        return ew.a.s(this, hVar);
    }

    @Override // vy.i
    public final vy.i plus(vy.i iVar) {
        return ew.a.w(this, iVar);
    }
}
