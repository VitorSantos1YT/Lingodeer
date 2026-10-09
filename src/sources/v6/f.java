package v6;

import androidx.lifecycle.ViewModel;
import com.google.android.gms.auth.api.signin.internal.zbc;
import y.u0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class f extends ViewModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f53577c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f53578a = new u0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53579b = false;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        u0 u0Var = this.f53578a;
        int iH = u0Var.h();
        for (int i11 = 0; i11 < iH; i11++) {
            c cVar = (c) u0Var.i(i11);
            zbc zbcVar = cVar.f53572a;
            zbcVar.a();
            zbcVar.f8535c = true;
            d dVar = cVar.f53574c;
            if (dVar != null) {
                cVar.removeObserver(dVar);
            }
            c cVar2 = zbcVar.f8533a;
            if (cVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (cVar2 != cVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            zbcVar.f8533a = null;
            if (dVar != null) {
                boolean z11 = dVar.f53576b;
            }
            zbcVar.f8536d = true;
            zbcVar.f8534b = false;
            zbcVar.f8535c = false;
            zbcVar.f8537e = false;
        }
        int i12 = u0Var.f56773d;
        Object[] objArr = u0Var.f56772c;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        u0Var.f56773d = 0;
        u0Var.f56770a = false;
    }
}
