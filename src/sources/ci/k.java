package ci;

import com.lingo.lingoskill.ar.ui.syllable.ARSyllableIntroductionActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ARSyllableIntroductionActivity f7139b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(ARSyllableIntroductionActivity aRSyllableIntroductionActivity, int i11) {
        super(0);
        this.f7138a = i11;
        this.f7139b = aRSyllableIntroductionActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f7138a) {
            case 0:
                return this.f7139b.getViewModelStore();
            default:
                return this.f7139b.getDefaultViewModelCreationExtras();
        }
    }
}
