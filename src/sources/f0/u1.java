package f0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dv.e f26444a = new dv.e(19);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r1 f26445b = new r1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f26446c = new q1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s1 f26447d = new s1();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(i2 i2Var, long j11, xy.c cVar) {
        t1 t1Var;
        kotlin.jvm.internal.v vVar;
        i2 i2Var2;
        if (cVar instanceof t1) {
            t1Var = (t1) cVar;
            int i11 = t1Var.f26434d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                t1Var.f26434d = i11 - Integer.MIN_VALUE;
            } else {
                t1Var = new t1(cVar);
            }
        } else {
            t1Var = new t1(cVar);
        }
        Object obj = t1Var.f26433c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = t1Var.f26434d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            vVar = new kotlin.jvm.internal.v();
            d0.l1 l1Var = d0.l1.Default;
            bh.l lVar = new bh.l(i2Var, j11, vVar, (vy.d) null, 6);
            t1Var.f26431a = i2Var;
            t1Var.f26432b = vVar;
            t1Var.f26434d = 1;
            if (i2Var.f(l1Var, lVar, t1Var) == aVar) {
                return aVar;
            }
            i2Var2 = i2Var;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.v vVar2 = t1Var.f26432b;
            i2 i2Var3 = t1Var.f26431a;
            com.bumptech.glide.e.F(obj);
            vVar = vVar2;
            i2Var2 = i2Var3;
        }
        return new f2.b(i2Var2.h(vVar.f38358a));
    }

    public static z1.r b(s0.k1 k1Var, h1 h1Var, boolean z11, boolean z12, h0.i iVar) {
        return new p1(k1Var, h1Var, z11, z12, iVar);
    }
}
