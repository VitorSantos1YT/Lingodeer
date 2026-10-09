package dt;

import android.content.Context;
import android.widget.Toast;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f23836b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g3(Context context, vy.d dVar, int i11) {
        super(2, dVar);
        this.f23835a = i11;
        this.f23836b = context;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f23835a) {
            case 0:
                return new g3(this.f23836b, dVar, 0);
            default:
                return new g3(this.f23836b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f23835a) {
            case 0:
                g3 g3Var = (g3) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                g3Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                g3 g3Var2 = (g3) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                g3Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f23835a;
        qy.b0 b0Var = qy.b0.f48488a;
        Context context = this.f23836b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1.c3 c3Var = k3.f23943a;
                kotlin.jvm.internal.m.f(context, "context");
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Toast.makeText(context, context.getString(R.string.success), 0).show();
                break;
        }
        return b0Var;
    }
}
