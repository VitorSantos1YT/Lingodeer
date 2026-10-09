package rt;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q6 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uz.j f50289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x8 f50290c;

    public /* synthetic */ q6(uz.j jVar, x8 x8Var, int i11) {
        this.f50288a = i11;
        this.f50289b = jVar;
        this.f50290c = x8Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        p6 p6Var;
        v6 v6Var;
        switch (this.f50288a) {
            case 0:
                if (dVar instanceof p6) {
                    p6Var = (p6) dVar;
                    int i11 = p6Var.f50240b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        p6Var.f50240b = i11 - Integer.MIN_VALUE;
                    } else {
                        p6Var = new p6(this, dVar);
                    }
                } else {
                    p6Var = new p6(this, dVar);
                }
                Object obj2 = p6Var.f50239a;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = p6Var.f50240b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj2);
                    Object obj3 = (Set) ((Map) obj).get(this.f50290c);
                    if (obj3 == null) {
                        obj3 = ry.t.f50856a;
                    }
                    p6Var.f50240b = 1;
                    if (this.f50289b.emit(obj3, p6Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj2);
                }
                return qy.b0.f48488a;
            default:
                if (dVar instanceof v6) {
                    v6Var = (v6) dVar;
                    int i13 = v6Var.f50530b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        v6Var.f50530b = i13 - Integer.MIN_VALUE;
                    } else {
                        v6Var = new v6(this, dVar);
                    }
                } else {
                    v6Var = new v6(this, dVar);
                }
                Object obj4 = v6Var.f50529a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = v6Var.f50530b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj4);
                    Object obj5 = (List) ((Map) obj).get(this.f50290c);
                    if (obj5 == null) {
                        obj5 = ry.r.f50854a;
                    }
                    v6Var.f50530b = 1;
                    if (this.f50289b.emit(obj5, v6Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj4);
                }
                return qy.b0.f48488a;
        }
    }
}
