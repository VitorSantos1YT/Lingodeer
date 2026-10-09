package h1;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g5 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.a f30276b;

    public /* synthetic */ g5(int i11, fz.a aVar) {
        this.f30275a = i11;
        this.f30276b = aVar;
    }

    public final void onBackInvoked() {
        switch (this.f30275a) {
            case 0:
                this.f30276b.invoke();
                break;
            default:
                fz.a aVar = this.f30276b;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
        }
    }
}
