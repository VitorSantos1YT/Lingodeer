package bt;

import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends xy.i implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5419a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PermissionState f5420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5424f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5425t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(PermissionState permissionState, l1.b1 b1Var, l1.b1 b1Var2, jt.x0 x0Var, rz.b0 b0Var, fz.a aVar, l1.b1 b1Var3, l1.b1 b1Var4, vy.d dVar) {
        super(2, dVar);
        this.f5420b = permissionState;
        this.f5421c = b1Var;
        this.f5422d = b1Var2;
        this.f5425t = x0Var;
        this.H = b0Var;
        this.K = aVar;
        this.f5423e = b1Var3;
        this.f5424f = b1Var4;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5419a) {
            case 0:
                return new g1(this.f5420b, this.f5421c, (ys.d0) this.f5425t, (av.b) this.H, (String) this.K, this.f5422d, this.f5423e, this.f5424f, dVar);
            default:
                return new g1(this.f5420b, this.f5421c, this.f5422d, (jt.x0) this.f5425t, (rz.b0) this.H, (fz.a) this.K, this.f5423e, this.f5424f, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5419a) {
            case 0:
                g1 g1Var = (g1) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                g1Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                g1 g1Var2 = (g1) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                g1Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5419a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.K;
        Object obj3 = this.H;
        Object obj4 = this.f5425t;
        l1.b1 b1Var = this.f5421c;
        PermissionState permissionState = this.f5420b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (PermissionsUtilKt.b(permissionState.getStatus()) && !((Boolean) b1Var.getValue()).booleanValue()) {
                    b.l((ys.d0) obj4, (av.b) obj3, (String) obj2, this.f5422d, this.f5423e, this.f5424f);
                    b1Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                boolean zB = PermissionsUtilKt.b(permissionState.getStatus());
                int i12 = s5.f5993u;
                if (zB != ((Boolean) b1Var.getValue()).booleanValue()) {
                    b1Var.setValue(Boolean.valueOf(zB));
                }
                if (zB && ((Boolean) this.f5422d.getValue()).booleanValue()) {
                    s5.f((jt.x0) obj4, (rz.b0) obj3, (fz.a) obj2, this.f5423e, this.f5424f, this.f5422d);
                }
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(PermissionState permissionState, l1.b1 b1Var, ys.d0 d0Var, av.b bVar, String str, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, vy.d dVar) {
        super(2, dVar);
        this.f5420b = permissionState;
        this.f5421c = b1Var;
        this.f5425t = d0Var;
        this.H = bVar;
        this.K = str;
        this.f5422d = b1Var2;
        this.f5423e = b1Var3;
        this.f5424f = b1Var4;
    }
}
