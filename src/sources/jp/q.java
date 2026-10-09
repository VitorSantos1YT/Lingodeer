package jp;

import com.lingo.lingoskill.ui.learn.AdVideoPromptActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdVideoPromptActivity f36538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(AdVideoPromptActivity adVideoPromptActivity, int i11) {
        super(0);
        this.f36537a = i11;
        this.f36538b = adVideoPromptActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f36537a) {
            case 0:
                return this.f36538b.getViewModelStore();
            default:
                return this.f36538b.getDefaultViewModelCreationExtras();
        }
    }
}
