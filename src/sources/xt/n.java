package xt;

import com.google.api.Service;
import com.lingodeer.data.model.MFSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MFSource f56310b;

    public /* synthetic */ n(MFSource mFSource, int i11) {
        this.f56309a = i11;
        this.f56310b = mFSource;
    }

    @Override // fz.a
    public final Object invoke() {
        int story_m;
        switch (this.f56309a) {
            case 0:
                story_m = this.f56310b.getKrup().getStory_m();
                break;
            case 1:
                story_m = this.f56310b.getKrup().getStory_f();
                break;
            case 2:
                story_m = this.f56310b.getCnup().getStory_m();
                break;
            case 3:
                story_m = this.f56310b.getKr().getAlphatable_m();
                break;
            case 4:
                story_m = this.f56310b.getKr().getAlphatable_f();
                break;
            case 5:
                story_m = this.f56310b.getCn().getAlphatable_m();
                break;
            case 6:
                story_m = this.f56310b.getCn().getAlphatable_f();
                break;
            case 7:
                story_m = this.f56310b.getCn().getAlphatable_m();
                break;
            case 8:
                story_m = this.f56310b.getCn().getAlphatable_f();
                break;
            case 9:
                story_m = this.f56310b.getCnup().getStory_f();
                break;
            case 10:
                story_m = this.f56310b.getEn().getAlphatable_m();
                break;
            case 11:
                story_m = this.f56310b.getJp().getAlphatable_m();
                break;
            case 12:
                story_m = this.f56310b.getEn().getAlphatable_f();
                break;
            case 13:
                story_m = this.f56310b.getVt().getAlphatable_m();
                break;
            case 14:
                story_m = this.f56310b.getVt().getAlphatable_f();
                break;
            case 15:
                story_m = this.f56310b.getEsoc().getAlphatable_m();
                break;
            case 16:
                story_m = this.f56310b.getEsoc().getAlphatable_f();
                break;
            case 17:
                story_m = this.f56310b.getFroc().getAlphatable_m();
                break;
            case 18:
                story_m = this.f56310b.getFroc().getAlphatable_f();
                break;
            case 19:
                story_m = this.f56310b.getJp().getAlphatable_f();
                break;
            case 20:
                story_m = this.f56310b.getDeoc().getAlphatable_m();
                break;
            case 21:
                story_m = this.f56310b.getDeoc().getAlphatable_f();
                break;
            case 22:
                story_m = this.f56310b.getPt().getAlphatable_m();
                break;
            case 23:
                story_m = this.f56310b.getPt().getAlphatable_f();
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                story_m = this.f56310b.getCn().getStory_m();
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                story_m = this.f56310b.getRuoc().getAlphatable_m();
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                story_m = this.f56310b.getRuoc().getAlphatable_f();
                break;
            case 27:
                story_m = this.f56310b.getItoc().getAlphatable_m();
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                story_m = this.f56310b.getItoc().getAlphatable_f();
                break;
            default:
                story_m = this.f56310b.getEsus().getAlphatable_m();
                break;
        }
        return Integer.valueOf(story_m);
    }
}
