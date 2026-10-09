package d1;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f22948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CharSequence f22949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f22950e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(long j11, r rVar, CharSequence charSequence, vy.d dVar) {
        super(2, dVar);
        this.f22948c = rVar;
        this.f22949d = charSequence;
        this.f22950e = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        o oVar = new o(this.f22950e, this.f22948c, this.f22949d, dVar);
        oVar.f22947b = obj;
        return oVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create(com.google.firebase.remoteconfig.a.a(obj), (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f22946a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            TextClassifier textClassifierA = com.google.firebase.remoteconfig.a.a(this.f22947b);
            this.f22946a = 1;
            if (r.a(this.f22948c, this.f22949d, this.f22950e, textClassifierA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }
}
