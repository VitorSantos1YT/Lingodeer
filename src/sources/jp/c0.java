package jp;

import com.lingo.lingoskill.ui.learn.BaseAudioLessonIndexActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseAudioLessonIndexActivity f36457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(BaseAudioLessonIndexActivity baseAudioLessonIndexActivity, int i11) {
        super(0);
        this.f36456a = i11;
        this.f36457b = baseAudioLessonIndexActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f36456a) {
            case 0:
                return this.f36457b.getViewModelStore();
            default:
                return this.f36457b.getDefaultViewModelCreationExtras();
        }
    }
}
