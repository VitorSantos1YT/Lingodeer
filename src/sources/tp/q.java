package tp;

import com.lingo.lingoskill.ui.review.BaseReviewEmptyActivity;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseReviewEmptyActivity f52490b;

    public /* synthetic */ q(BaseReviewEmptyActivity baseReviewEmptyActivity, int i11) {
        this.f52489a = i11;
        this.f52490b = baseReviewEmptyActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f52489a;
        BaseReviewEmptyActivity baseReviewEmptyActivity = this.f52490b;
        switch (i11) {
            case 0:
                int i12 = BaseReviewEmptyActivity.H;
                String stringExtra = baseReviewEmptyActivity.getIntent().getStringExtra(INTENTS.EXTRA_STRING);
                return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
            default:
                int i13 = BaseReviewEmptyActivity.H;
                baseReviewEmptyActivity.finish();
                return qy.b0.f48488a;
        }
    }
}
