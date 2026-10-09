package dt;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w1 implements PointerInputEventHandler {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ l1.b1 K;
    public final /* synthetic */ l1.b1 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f24306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f24307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f24308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f24309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f24310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f24311f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f24312t;

    public w1(float f5, l1.b1 b1Var, float f11, float f12, float f13, float f14, float f15, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4) {
        this.f24306a = f5;
        this.f24307b = b1Var;
        this.f24308c = f11;
        this.f24309d = f12;
        this.f24310e = f13;
        this.f24311f = f14;
        this.f24312t = f15;
        this.H = b1Var2;
        this.K = b1Var3;
        this.L = b1Var4;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(s2.w wVar, vy.d dVar) {
        final kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        com.google.firebase.datastorage.a aVar = new com.google.firebase.datastorage.a(vVar, 14);
        final int i11 = 0;
        fz.a aVar2 = new fz.a() { // from class: dt.u1
            @Override // fz.a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        vVar.f38358a = CropImageView.DEFAULT_ASPECT_RATIO;
                        break;
                    default:
                        vVar.f38358a = CropImageView.DEFAULT_ASPECT_RATIO;
                        break;
                }
                return qy.b0.f48488a;
            }
        };
        final int i12 = 1;
        fz.a aVar3 = new fz.a() { // from class: dt.u1
            @Override // fz.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        vVar.f38358a = CropImageView.DEFAULT_ASPECT_RATIO;
                        break;
                    default:
                        vVar.f38358a = CropImageView.DEFAULT_ASPECT_RATIO;
                        break;
                }
                return qy.b0.f48488a;
            }
        };
        final float f5 = this.f24306a;
        final l1.b1 b1Var = this.f24307b;
        final float f11 = this.f24308c;
        final float f12 = this.f24309d;
        final float f13 = this.f24310e;
        final float f14 = this.f24311f;
        final float f15 = this.f24312t;
        final l1.b1 b1Var2 = this.H;
        final l1.b1 b1Var3 = this.K;
        final l1.b1 b1Var4 = this.L;
        fz.e eVar = new fz.e() { // from class: dt.v1
            @Override // fz.e
            public final Object invoke(Object obj, Object obj2) {
                s2.t change = (s2.t) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                kotlin.jvm.internal.m.f(change, "change");
                change.a();
                kotlin.jvm.internal.v vVar2 = vVar;
                float f16 = vVar2.f38358a + fFloatValue;
                vVar2.f38358a = f16;
                if (f16 <= (-f5)) {
                    l1.b1 b1Var5 = b1Var;
                    long jV = e.v(f11, f12, f13, f14, f15, b1Var2, ((f2.b) b1Var5.getValue()).f26570a);
                    e.x(jV, b1Var3);
                    e.y(jV, b1Var5);
                    b1Var4.setValue(Boolean.TRUE);
                    vVar2.f38358a = CropImageView.DEFAULT_ASPECT_RATIO;
                }
                return qy.b0.f48488a;
            }
        };
        float f16 = f0.g0.f26277a;
        Object objC = f0.t2.c(wVar, new f0.c0(aVar, eVar, aVar2, aVar3, null, 0), dVar);
        wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
        qy.b0 b0Var = qy.b0.f48488a;
        if (objC != aVar4) {
            objC = b0Var;
        }
        return objC == aVar4 ? objC : b0Var;
    }
}
