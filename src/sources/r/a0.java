package r;

import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends androidx.appcompat.widget.f {
    public final /* synthetic */ androidx.appcompat.widget.d L;
    public final /* synthetic */ AppCompatSpinner M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(AppCompatSpinner appCompatSpinner, AppCompatSpinner appCompatSpinner2, androidx.appcompat.widget.d dVar) {
        super(appCompatSpinner2);
        this.M = appCompatSpinner;
        this.L = dVar;
    }

    @Override // androidx.appcompat.widget.f
    public final q.z h() {
        return this.L;
    }

    @Override // androidx.appcompat.widget.f
    public final boolean i() {
        AppCompatSpinner appCompatSpinner = this.M;
        if (appCompatSpinner.getInternalPopup().b()) {
            return true;
        }
        appCompatSpinner.f931f.m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
