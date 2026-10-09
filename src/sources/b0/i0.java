package b0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ float f3562a;

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        i0 i0Var = new i0(2, dVar);
        i0Var.f3562a = ((Number) obj).floatValue();
        return i0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create(Float.valueOf(((Number) obj).floatValue()), (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        return Boolean.valueOf(this.f3562a > CropImageView.DEFAULT_ASPECT_RATIO);
    }
}
