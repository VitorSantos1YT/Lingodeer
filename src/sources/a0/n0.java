package a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1.j f147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fz.c f148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.c0 f149c;

    public n0(b0.c0 c0Var, fz.c cVar, z1.j jVar) {
        this.f147a = jVar;
        this.f148b = cVar;
        this.f149c = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f147a.equals(n0Var.f147a) && kotlin.jvm.internal.m.a(this.f148b, n0Var.f148b) && kotlin.jvm.internal.m.a(this.f149c, n0Var.f149c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f149c.hashCode() + ((this.f148b.hashCode() + (this.f147a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f147a + ", size=" + this.f148b + ", animationSpec=" + this.f149c + ", clip=true)";
    }
}
