package f0;

import androidx.lifecycle.ViewModel;
import rt.bb;
import rt.y9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(int i11, long j11, ViewModel viewModel, vy.d dVar) {
        super(2, dVar);
        this.f26511a = i11;
        this.f26513c = viewModel;
        this.f26512b = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f26511a) {
            case 0:
                z1 z1Var = new z1(this.f26512b, dVar);
                z1Var.f26513c = obj;
                return z1Var;
            case 1:
                return new z1(1, this.f26512b, (y9) this.f26513c, dVar);
            default:
                return new z1(2, this.f26512b, (bb) this.f26513c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26511a) {
            case 0:
                z1 z1Var = (z1) create((g2) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                z1Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                z1 z1Var2 = (z1) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                z1Var2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                z1 z1Var3 = (z1) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                z1Var3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i11 = this.f26511a;
        qy.b0 b0Var = qy.b0.f48488a;
        long j11 = this.f26512b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                i2 i2Var = ((g2) this.f26513c).f26286a;
                i2Var.c(i2Var.f26315k, j11, 1);
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var = ((y9) this.f26513c).S;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, new Long(((Number) value).longValue() + j11)));
                break;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var2 = ((bb) this.f26513c).N;
                do {
                    value2 = i1Var2.getValue();
                } while (!i1Var2.j(value2, new Long(((Number) value2).longValue() + j11)));
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(long j11, vy.d dVar) {
        super(2, dVar);
        this.f26511a = 0;
        this.f26512b = j11;
    }
}
