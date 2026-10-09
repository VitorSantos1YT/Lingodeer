package ph;

import et.c0;
import n9.e1;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uz.j f46921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f46922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f46923c;

    public v(uz.j jVar, mh.b bVar, a0 a0Var, boolean z11) {
        this.f46921a = jVar;
        this.f46922b = a0Var;
        this.f46923c = z11;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        u uVar;
        if (dVar instanceof u) {
            uVar = (u) dVar;
            int i11 = uVar.f46919b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                uVar.f46919b = i11 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, dVar);
            }
        } else {
            uVar = new u(this, dVar);
        }
        Object obj2 = uVar.f46918a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = uVar.f46919b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj2);
            e1 e1VarB = n9.m.b((e1) obj, new c0(this.f46922b, this.f46923c, (vy.d) null, 3));
            uVar.f46919b = 1;
            if (this.f46921a.emit(e1VarB, uVar) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj2);
        }
        return b0.f48488a;
    }
}
