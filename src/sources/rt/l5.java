package rt;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l5 extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rz.t f50012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f50013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f50014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r5 f50015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f50016e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(r5 r5Var, xy.c cVar) {
        super(cVar);
        this.f50015d = r5Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f50014c = obj;
        this.f50016e |= Integer.MIN_VALUE;
        return this.f50015d.l(null, CropImageView.DEFAULT_ASPECT_RATIO, this);
    }
}
