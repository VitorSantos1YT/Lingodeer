package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k6 extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f30540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f30541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0.i f30542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ha f30543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g2.w0 f30544f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k6(boolean z11, boolean z12, h0.i iVar, ha haVar, g2.w0 w0Var, int i11) {
        super(2);
        this.f30539a = i11;
        this.f30540b = z11;
        this.f30541c = z12;
        this.f30542d = iVar;
        this.f30543e = haVar;
        this.f30544f = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30539a) {
            case 0:
                l1.n nVar = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar = (l1.s) nVar;
                    if (sVar.F()) {
                        sVar.W();
                    } else {
                        j6.f30479a.a(this.f30540b, this.f30541c, this.f30542d, null, this.f30543e, this.f30544f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, nVar, 100663296, 200);
                    }
                } else {
                    j6.f30479a.a(this.f30540b, this.f30541c, this.f30542d, null, this.f30543e, this.f30544f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, nVar, 100663296, 200);
                }
                break;
            case 1:
                l1.n nVar2 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.F()) {
                        sVar2.W();
                    } else {
                        j6.f30479a.a(this.f30540b, this.f30541c, this.f30542d, null, this.f30543e, this.f30544f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, nVar2, 100663296, 200);
                    }
                } else {
                    j6.f30479a.a(this.f30540b, this.f30541c, this.f30542d, null, this.f30543e, this.f30544f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, nVar2, 100663296, 200);
                }
                break;
            default:
                l1.n nVar3 = (l1.n) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    l1.s sVar3 = (l1.s) nVar3;
                    if (sVar3.F()) {
                        sVar3.W();
                    } else {
                        la.f30616a.a(this.f30540b, this.f30541c, this.f30542d, this.f30543e, this.f30544f, nVar3, 114822144);
                    }
                } else {
                    la.f30616a.a(this.f30540b, this.f30541c, this.f30542d, this.f30543e, this.f30544f, nVar3, 114822144);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
