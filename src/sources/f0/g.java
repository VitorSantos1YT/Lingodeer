package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt.m2 f26275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rz.m f26276b;

    public g(mt.m2 m2Var, rz.m mVar) {
        this.f26275a = m2Var;
        this.f26276b = mVar;
    }

    public final String toString() {
        String strG;
        rz.m mVar = this.f26276b;
        rz.a0 a0Var = (rz.a0) mVar.f50931e.get(rz.a0.f50864b);
        String str = a0Var != null ? a0Var.f50865a : null;
        StringBuilder sb2 = new StringBuilder("Request@");
        int iHashCode = hashCode();
        qx.p.k(16);
        String string = Integer.toString(iHashCode, 16);
        kotlin.jvm.internal.m.e(string, "toString(...)");
        sb2.append(string);
        if (str == null || (strG = ep.a.g("[", str, "](")) == null) {
            strG = "(";
        }
        sb2.append(strG);
        sb2.append("currentBounds()=");
        sb2.append(this.f26275a.invoke());
        sb2.append(", continuation=");
        sb2.append(mVar);
        sb2.append(')');
        return sb2.toString();
    }
}
