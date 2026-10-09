package z2;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements rz.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f58614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3.x f58615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rz.b0 f58616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f58617d = new AtomicReference(null);

    public m0(View view, o3.x xVar, rz.b0 b0Var) {
        this.f58614a = view;
        this.f58615b = xVar;
        this.f58616c = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final wy.a a(b1.w wVar, xy.c cVar) {
        k0 k0Var;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i11 = k0Var.f58600c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k0Var.f58600c = i11 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object obj = k0Var.f58598a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = k0Var.f58600c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            a0.e eVar = new a0.e(29, wVar, this);
            xg.b bVar = new xg.b(this, null, 8);
            k0Var.f58600c = 1;
            if (rz.e0.l(new uz.h0(eVar, this.f58617d, bVar, (vy.d) null), k0Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // rz.b0
    public final vy.i getCoroutineContext() {
        return this.f58616c.getCoroutineContext();
    }
}
