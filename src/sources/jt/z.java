package jt;

import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37275a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f37276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PermissionState f37277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f37278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.p f37279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f37280f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ av.j0 f37281t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(PermissionState permissionState, l1.b1 b1Var, x1.p pVar, rz.b0 b0Var, v vVar, av.j0 j0Var, vy.d dVar) {
        super(2, dVar);
        this.f37277c = permissionState;
        this.f37278d = b1Var;
        this.f37279e = pVar;
        this.f37280f = b0Var;
        this.f37276b = vVar;
        this.f37281t = j0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f37275a) {
            case 0:
                return new z(this.f37277c, this.f37278d, this.f37279e, this.f37280f, this.f37276b, this.f37281t, dVar);
            default:
                return new z(this.f37276b, this.f37277c, this.f37278d, this.f37279e, this.f37280f, this.f37281t, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f37275a) {
            case 0:
                z zVar = (z) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                zVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                z zVar2 = (z) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                zVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f37275a;
        qy.b0 b0Var = qy.b0.f48488a;
        PermissionState permissionState = this.f37277c;
        av.j0 j0Var = this.f37281t;
        rz.b0 b0Var2 = this.f37280f;
        x1.p pVar = this.f37279e;
        l1.b1 b1Var = this.f37278d;
        v vVar = this.f37276b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (PermissionsUtilKt.b(permissionState.getStatus()) && !((Boolean) b1Var.getValue()).booleanValue()) {
                    g0.b(pVar, b0Var2, vVar, j0Var);
                    b1Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                av.n nVar = vVar.f37211b;
                l1.b1 b1Var2 = vVar.f37225q;
                if (((Boolean) b1Var2.getValue()).booleanValue()) {
                    if (((Boolean) b1Var.getValue()).booleanValue()) {
                        g0.b(pVar, b0Var2, vVar, j0Var);
                    } else {
                        permissionState.a();
                    }
                    b1Var2.setValue(Boolean.FALSE);
                    if (nVar.f()) {
                        vVar.f37224p.setValue(new Integer(-1));
                        vVar.f37223o.setValue(new Integer(-1));
                        nVar.n();
                    }
                }
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(v vVar, PermissionState permissionState, l1.b1 b1Var, x1.p pVar, rz.b0 b0Var, av.j0 j0Var, vy.d dVar) {
        super(2, dVar);
        this.f37276b = vVar;
        this.f37277c = permissionState;
        this.f37278d = b1Var;
        this.f37279e = pVar;
        this.f37280f = b0Var;
        this.f37281t = j0Var;
    }
}
