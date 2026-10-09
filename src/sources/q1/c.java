package q1;

import com.android.billingclient.api.c0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class c extends ry.f implements o1.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f47360c = new c(l.f47382e, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f47361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47362b;

    public c(l lVar, int i11) {
        this.f47361a = lVar;
        this.f47362b = i11;
    }

    @Override // o1.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e builder() {
        return new e(this);
    }

    public final c b(Object obj, r1.a aVar) {
        c0 c0VarU = this.f47361a.u(obj, obj != null ? obj.hashCode() : 0, 0, aVar);
        return c0VarU == null ? this : new c((l) c0VarU.f7471c, this.f47362b + c0VarU.f7470b);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f47361a.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f47361a.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
