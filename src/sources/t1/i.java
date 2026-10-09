package t1;

import com.android.billingclient.api.c0;
import l1.e3;
import l1.q1;
import l1.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends q1.c implements q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f51992d = new i(q1.l.f47382e, 0);

    @Override // q1.c
    /* JADX INFO: renamed from: a */
    public final q1.e builder() {
        h hVar = new h(this);
        hVar.f51991t = this;
        return hVar;
    }

    @Override // q1.c, o1.d
    public final o1.c builder() {
        h hVar = new h(this);
        hVar.f51991t = this;
        return hVar;
    }

    public final i c(v1 v1Var, e3 e3Var) {
        c0 c0VarU = this.f47361a.u(v1Var, v1Var.hashCode(), 0, e3Var);
        return c0VarU == null ? this : new i((q1.l) c0VarU.f7471c, this.f47362b + c0VarU.f7470b);
    }

    @Override // q1.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof v1) {
            return super.containsKey((v1) obj);
        }
        return false;
    }

    @Override // ry.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof e3) {
            return super.containsValue((e3) obj);
        }
        return false;
    }

    @Override // q1.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof v1) {
            return (e3) super.get((v1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof v1) ? obj2 : (e3) super.getOrDefault((v1) obj, (e3) obj2);
    }
}
