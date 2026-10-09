package ad;

import com.yalantis.ucrop.view.CropImageView;
import d0.o1;
import l1.b1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends xy.i implements fz.e {
    public final /* synthetic */ n H;
    public final /* synthetic */ b1 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wc.h f563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f564f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f565t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z11, boolean z12, i iVar, wc.h hVar, int i11, float f5, n nVar, b1 b1Var, vy.d dVar) {
        super(2, dVar);
        this.f560b = z11;
        this.f561c = z12;
        this.f562d = iVar;
        this.f563e = hVar;
        this.f564f = i11;
        this.f565t = f5;
        this.H = nVar;
        this.K = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new a(this.f560b, this.f561c, this.f562d, this.f563e, this.f564f, this.f565t, this.H, this.K, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f559a;
        i iVar = this.f562d;
        b1 b1Var = this.K;
        boolean z11 = this.f560b;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (z11 && !((Boolean) b1Var.getValue()).booleanValue() && this.f561c) {
                this.f559a = 1;
                wc.h hVar = (wc.h) iVar.K.getValue();
                if (iVar.f603e.getValue() != null) {
                    throw new ClassCastException();
                }
                float fFloatValue = ((Number) iVar.f604f.getValue()).floatValue();
                float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                if ((fFloatValue < CropImageView.DEFAULT_ASPECT_RATIO && hVar == null) || (hVar != null && fFloatValue < CropImageView.DEFAULT_ASPECT_RATIO)) {
                    f5 = 1.0f;
                }
                float f11 = f5;
                Object objB = o1.b(iVar.P, new h(iVar, (wc.h) iVar.K.getValue(), f11, !(f11 == ((Number) iVar.M.getValue()).floatValue()), null), this);
                if (objB != aVar) {
                    objB = b0Var;
                }
                if (objB != aVar) {
                    objB = b0Var;
                }
                if (objB != aVar) {
                }
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        b1Var.setValue(Boolean.valueOf(z11));
        if (z11) {
            float fFloatValue2 = ((Number) iVar.M.getValue()).floatValue();
            this.f559a = 2;
            Object objB2 = o1.b(iVar.P, new e(iVar, iVar.g(), this.f564f, this.f565t, this.f563e, fFloatValue2, this.H, null), this);
            if (objB2 != aVar) {
                objB2 = b0Var;
            }
            if (objB2 == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }
}
