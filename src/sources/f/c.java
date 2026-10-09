package f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f26128b;

    public /* synthetic */ c(n nVar, int i11) {
        this.f26127a = i11;
        this.f26128b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26127a) {
            case 0:
                this.f26128b.invalidateMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e8) {
                    if (!kotlin.jvm.internal.m.a(e8.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e8;
                    }
                    return;
                } catch (NullPointerException e10) {
                    if (!kotlin.jvm.internal.m.a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e10;
                    }
                    return;
                }
        }
    }
}
