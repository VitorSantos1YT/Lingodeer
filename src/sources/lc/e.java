package lc;

import com.afollestad.materialdialogs.internal.button.DialogActionButton;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogActionButton f39886b;

    public /* synthetic */ e(DialogActionButton dialogActionButton, int i11) {
        this.f39885a = i11;
        this.f39886b = dialogActionButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39885a) {
            case 0:
                this.f39886b.requestFocus();
                break;
            default:
                this.f39886b.requestFocus();
                break;
        }
    }
}
