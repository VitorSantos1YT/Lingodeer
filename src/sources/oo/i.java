package oo;

import com.lingo.lingoskill.speak.ui.SpeakLeadBoardActivity;
import com.lingodeer.data.model.INTENTS;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpeakLeadBoardActivity f45683b;

    public /* synthetic */ i(SpeakLeadBoardActivity speakLeadBoardActivity, int i11) {
        this.f45682a = i11;
        this.f45683b = speakLeadBoardActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f45682a;
        SpeakLeadBoardActivity speakLeadBoardActivity = this.f45683b;
        switch (i11) {
            case 0:
                int i12 = SpeakLeadBoardActivity.H;
                return Integer.valueOf(speakLeadBoardActivity.getIntent().getIntExtra(INTENTS.EXTRA_INT, 1));
            default:
                int i13 = SpeakLeadBoardActivity.H;
                speakLeadBoardActivity.finish();
                return qy.b0.f48488a;
        }
    }
}
