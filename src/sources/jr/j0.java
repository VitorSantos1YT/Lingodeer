package jr;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.accompanist.permissions.PermissionState;
import kr.a1;
import l1.b1;
import mt.l5;
import rt.d5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36660d;

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, int i11) {
        this.f36657a = i11;
        this.f36659c = obj;
        this.f36660d = obj2;
        this.f36658b = obj3;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f36657a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj = this.f36658b;
        Object obj2 = this.f36660d;
        Object obj3 = this.f36659c;
        switch (i11) {
            case 0:
                ((b1) obj).setValue((a1) obj3);
                ((PermissionState) obj2).a();
                return b0Var;
            case 1:
                d5 d5Var = (d5) obj3;
                if (d5Var.f49618f) {
                    ((fz.c) obj2).invoke(Long.valueOf(d5Var.f49613a));
                } else {
                    float f5 = l5.f41627a;
                    ((b1) obj).setValue(Boolean.TRUE);
                }
                return b0Var;
            default:
                androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) obj3;
                ViewModelStore viewModelStore = ((androidx.fragment.app.k0) ((bj.a) obj2).f4455b).getViewModelStore();
                CreationExtras defaultViewModelCreationExtras = k0Var.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.m.e(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                e20.a aVarQ = ef.e.q(k0Var);
                return i20.b.a(kotlin.jvm.internal.z.a(vp.d.class), viewModelStore, null, defaultViewModelCreationExtras, null, aVarQ, (tp.l) obj);
        }
    }
}
