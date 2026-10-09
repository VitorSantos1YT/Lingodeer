package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f1571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f1572c;

    public u0(j1 j1Var, r rVar, a aVar) {
        this.f1571b = j1Var;
        rVar.getClass();
        this.f1572c = rVar;
        this.f1570a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void a(Object obj, Object obj2) {
        e1.k(this.f1571b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void b(Object obj) {
        ((l1) this.f1571b).getClass();
        k1 k1Var = ((c0) obj).unknownFields;
        if (k1Var.f1508e) {
            k1Var.f1508e = false;
        }
        this.f1572c.getClass();
        hh.p0.z(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean c(Object obj) {
        this.f1572c.getClass();
        hh.p0.z(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final c0 d() {
        a aVar = this.f1570a;
        return aVar instanceof c0 ? ((c0) aVar).i() : ((z) ((c0) aVar).c(b0.NEW_BUILDER)).c();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void e(Object obj, l0 l0Var) {
        this.f1572c.getClass();
        hh.p0.z(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final int f(c0 c0Var) {
        ((l1) this.f1571b).getClass();
        k1 k1Var = c0Var.unknownFields;
        int i11 = k1Var.f1507d;
        if (i11 != -1) {
            return i11;
        }
        int iD0 = 0;
        for (int i12 = 0; i12 < k1Var.f1504a; i12++) {
            int i13 = k1Var.f1505b[i12] >>> 3;
            iD0 += o.d0(3, (i) k1Var.f1506c[i12]) + o.g0(i13) + o.f0(2) + (o.f0(1) * 2);
        }
        k1Var.f1507d = iD0;
        return iD0;
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final int g(c0 c0Var) {
        ((l1) this.f1571b).getClass();
        return c0Var.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final boolean h(c0 c0Var, c0 c0Var2) {
        l1 l1Var = (l1) this.f1571b;
        l1Var.getClass();
        k1 k1Var = c0Var.unknownFields;
        l1Var.getClass();
        return k1Var.equals(c0Var2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.d1
    public final void i(Object obj, n nVar, q qVar) {
        this.f1571b.a(obj);
        this.f1572c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
