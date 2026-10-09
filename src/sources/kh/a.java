package kh;

import com.lingo.fluent.ui.compose.PdFeedDifficultyActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PdFeedDifficultyActivity f38147b;

    public /* synthetic */ a(PdFeedDifficultyActivity pdFeedDifficultyActivity, int i11) {
        this.f38146a = i11;
        this.f38147b = pdFeedDifficultyActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f38146a;
        PdFeedDifficultyActivity pdFeedDifficultyActivity = this.f38147b;
        switch (i11) {
            case 0:
                int i12 = PdFeedDifficultyActivity.H;
                String stringExtra = pdFeedDifficultyActivity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
            default:
                int i13 = PdFeedDifficultyActivity.H;
                pdFeedDifficultyActivity.finish();
                return b0.f48488a;
        }
    }
}
