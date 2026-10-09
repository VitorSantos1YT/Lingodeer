package ju;

import android.graphics.Color;
import rz.b0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37365a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f37366b;

    public /* synthetic */ e(int i11, vy.d dVar) {
        super(i11, dVar);
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f37365a) {
            case 0:
                return new e(this.f37366b, dVar);
            default:
                e eVar = new e(2, dVar);
                eVar.f37366b = ((Boolean) obj).booleanValue();
                return eVar;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37365a) {
            case 0:
                e eVar = (e) create((b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                eVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((e) create(bool, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37365a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (this.f37366b) {
                    a.f37321k1 = Color.parseColor("#333333");
                    a.f37324l1 = Color.parseColor("#FFFFFF");
                } else {
                    a.f37321k1 = Color.parseColor("#E1E9F6");
                    a.f37324l1 = Color.parseColor("#DE000000");
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(this.f37366b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z11, vy.d dVar) {
        super(2, dVar);
        this.f37366b = z11;
    }
}
