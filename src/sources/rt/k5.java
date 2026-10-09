package rt;

import com.lingodeer.data.env.ScriptStyleInAnswerKt;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k5 implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r5 f49969b;

    public /* synthetic */ k5(r5 r5Var, int i11) {
        this.f49968a = i11;
        this.f49969b = r5Var;
    }

    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        Object value;
        Object objA;
        switch (this.f49968a) {
            case 0:
                r5 r5Var = this.f49969b;
                vt.n0 n0Var = r5Var.f50336e;
                uz.i1 i1Var = r5Var.M;
                do {
                    value = i1Var.getValue();
                    objA = (c5) value;
                    if (objA instanceof b5) {
                        b5 b5Var = (b5) objA;
                        fr.o0 o0Var = (fr.o0) n0Var;
                        objA = b5.a(b5Var, false, null, null, x4.a(b5Var.f49512e, null, o0Var.t(), ScriptStyleInAnswerKt.resolveScriptStyleInAnswer(o0Var.u(), o0Var.t()), o0Var.f(), null, false, null, false, CropImageView.DEFAULT_ASPECT_RATIO, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 4081), null, 0, null, null, 495);
                    }
                } while (!i1Var.j(value, objA));
                return qy.b0.f48488a;
            default:
                Object objD = r5.d(this.f49969b, ((Boolean) obj).booleanValue(), dVar);
                return objD == wy.a.COROUTINE_SUSPENDED ? objD : qy.b0.f48488a;
        }
    }
}
