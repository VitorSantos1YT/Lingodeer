package z2;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f58731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f58732c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(b3 b3Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f58730a = i11;
        this.f58732c = b3Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f58730a) {
            case 0:
                return new y2(this.f58732c, dVar, 0);
            default:
                return new y2(this.f58732c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f58730a) {
            case 0:
                break;
        }
        return ((y2) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f58730a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f58731b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    AndroidComposeView androidComposeView = this.f58732c.f58510a;
                    this.f58731b = 1;
                    Object objL = androidComposeView.f1164c0.l(this);
                    if (objL != aVar) {
                        objL = b0Var;
                    }
                    if (objL == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f58731b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    AndroidComposeView androidComposeView2 = this.f58732c.f58510a;
                    this.f58731b = 1;
                    Object objA = androidComposeView2.f1167d0.a(this);
                    if (objA != aVar2) {
                        objA = b0Var2;
                    }
                    if (objA == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var2;
        }
    }
}
