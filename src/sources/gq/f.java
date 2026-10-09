package gq;

import uz.d1;
import uz.z0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f29587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uz.j f29588c;

    public /* synthetic */ f(kotlin.jvm.internal.u uVar, uz.j jVar, int i11) {
        this.f29586a = i11;
        this.f29587b = uVar;
        this.f29588c = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(int i11, vy.d dVar) {
        d1 d1Var;
        if (dVar instanceof d1) {
            d1Var = (d1) dVar;
            int i12 = d1Var.f53278c;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                d1Var.f53278c = i12 - Integer.MIN_VALUE;
            } else {
                d1Var = new d1(this, dVar);
            }
        } else {
            d1Var = new d1(this, dVar);
        }
        Object obj = d1Var.f53276a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = d1Var.f53278c;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        if (i11 > 0) {
            kotlin.jvm.internal.u uVar = this.f29587b;
            if (!uVar.f38357a) {
                uVar.f38357a = true;
                z0 z0Var = z0.START;
                d1Var.f53278c = 1;
                if (this.f29588c.emit(z0Var, d1Var) == aVar) {
                    return aVar;
                }
            }
        }
        return b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(boolean z11, vy.d dVar) {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.f29585d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f29585d = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, dVar);
            }
        } else {
            eVar = new e(this, dVar);
        }
        Object obj = eVar.f29583b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = eVar.f29585d;
        qy.b0 b0Var = qy.b0.f48488a;
        kotlin.jvm.internal.u uVar = this.f29587b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (!uVar.f38357a && z11) {
                eVar.f29582a = z11;
                eVar.f29585d = 1;
                if (this.f29588c.emit(b0Var, eVar) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = eVar.f29582a;
            com.bumptech.glide.e.F(obj);
        }
        uVar.f38357a = z11;
        return b0Var;
    }

    @Override // uz.j
    public final /* bridge */ /* synthetic */ Object emit(Object obj, vy.d dVar) {
        switch (this.f29586a) {
            case 0:
                return b(((Boolean) obj).booleanValue(), dVar);
            default:
                return a(((Number) obj).intValue(), dVar);
        }
    }
}
