package jr;

import android.os.Bundle;
import androidx.lifecycle.ViewModelKt;
import kr.t0;
import kr.z0;
import rz.z1;
import uz.i1;
import uz.r0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f36589b;

    public /* synthetic */ c0(z0 z0Var, int i11) {
        this.f36588a = i11;
        this.f36589b = z0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        Object value;
        switch (this.f36588a) {
            case 0:
                z0 z0Var = this.f36589b;
                r0 r0Var = z0Var.O;
                i1 i1Var = z0Var.L;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, Boolean.valueOf(!((Boolean) value).booleanValue())));
                if (r0Var.f53391a.getValue() instanceof kr.r0) {
                    Object value2 = r0Var.f53391a.getValue();
                    kotlin.jvm.internal.m.d(value2, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingFinishUiState.Success");
                    kr.r0 r0Var2 = (kr.r0) value2;
                    vy.d dVar = null;
                    if (((Boolean) i1Var.getValue()).booleanValue()) {
                        rz.e0.B(ViewModelKt.getViewModelScope(z0Var), null, null, new kb.e(3, r0Var2, z0Var, dVar), 3);
                    } else {
                        z1 z1Var = z0Var.H;
                        if (z1Var != null) {
                            z1Var.cancel(null);
                        }
                        z0Var.f38628b.g();
                    }
                }
                return qy.b0.f48488a;
            case 1:
                z0 z0Var2 = this.f36589b;
                rz.e0.B(ViewModelKt.getViewModelScope(z0Var2), null, null, new t0(z0Var2, null, 3), 3);
                return qy.b0.f48488a;
            default:
                Bundle bundle = new Bundle();
                b7.e0.v(this.f36589b.f38632f, bundle, "U", "unit");
                return bundle;
        }
    }
}
