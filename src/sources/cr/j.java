package cr;

import android.os.Parcelable;
import com.lingo.me.MeAchievementRecordDetailActivity;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.INTENTS;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MeAchievementRecordDetailActivity f22444b;

    public /* synthetic */ j(MeAchievementRecordDetailActivity meAchievementRecordDetailActivity, int i11) {
        this.f22443a = i11;
        this.f22444b = meAchievementRecordDetailActivity;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f22443a;
        MeAchievementRecordDetailActivity meAchievementRecordDetailActivity = this.f22444b;
        switch (i11) {
            case 0:
                int i12 = MeAchievementRecordDetailActivity.H;
                Parcelable parcelableExtra = meAchievementRecordDetailActivity.getIntent().getParcelableExtra(INTENTS.EXTRA_OBJECT);
                kotlin.jvm.internal.m.c(parcelableExtra);
                return (AchievementRecord) parcelableExtra;
            default:
                int i13 = MeAchievementRecordDetailActivity.H;
                meAchievementRecordDetailActivity.finish();
                return b0.f48488a;
        }
    }
}
