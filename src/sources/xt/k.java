package xt;

import com.google.api.Service;
import com.lingodeer.data.model.MFSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MFSource f56304b;

    public /* synthetic */ k(MFSource mFSource, int i11) {
        this.f56303a = i11;
        this.f56304b = mFSource;
    }

    @Override // fz.a
    public final Object invoke() {
        int lesson_f;
        switch (this.f56303a) {
            case 0:
                lesson_f = this.f56304b.getKrup().getLesson_f();
                break;
            case 1:
                lesson_f = this.f56304b.getKr().getTravel_m();
                break;
            case 2:
                lesson_f = this.f56304b.getKr().getTravel_f();
                break;
            case 3:
                lesson_f = this.f56304b.getCnup().getTravel_m();
                break;
            case 4:
                lesson_f = this.f56304b.getCnup().getTravel_f();
                break;
            case 5:
                lesson_f = this.f56304b.getCn().getTravel_m();
                break;
            case 6:
                lesson_f = this.f56304b.getCn().getTravel_f();
                break;
            case 7:
                lesson_f = this.f56304b.getVt().getStory_m();
                break;
            case 8:
                lesson_f = this.f56304b.getEn().getTravel_m();
                break;
            case 9:
                lesson_f = this.f56304b.getJpup().getTravel_m();
                break;
            case 10:
                lesson_f = this.f56304b.getEn().getTravel_f();
                break;
            case 11:
                lesson_f = this.f56304b.getVt().getTravel_m();
                break;
            case 12:
                lesson_f = this.f56304b.getVt().getTravel_f();
                break;
            case 13:
                lesson_f = this.f56304b.getEsoc().getTravel_m();
                break;
            case 14:
                lesson_f = this.f56304b.getEsoc().getTravel_f();
                break;
            case 15:
                lesson_f = this.f56304b.getVt().getStory_f();
                break;
            case 16:
                lesson_f = this.f56304b.getFroc().getTravel_m();
                break;
            case 17:
                lesson_f = this.f56304b.getFroc().getTravel_f();
                break;
            case 18:
                lesson_f = this.f56304b.getJpup().getTravel_f();
                break;
            case 19:
                lesson_f = this.f56304b.getDeoc().getTravel_m();
                break;
            case 20:
                lesson_f = this.f56304b.getDeoc().getTravel_f();
                break;
            case 21:
                lesson_f = this.f56304b.getPt().getTravel_m();
                break;
            case 22:
                lesson_f = this.f56304b.getPt().getTravel_f();
                break;
            case 23:
                lesson_f = this.f56304b.getRuoc().getTravel_m();
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                lesson_f = this.f56304b.getRuoc().getTravel_f();
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                lesson_f = this.f56304b.getItoc().getTravel_m();
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                lesson_f = this.f56304b.getItoc().getTravel_f();
                break;
            case 27:
                lesson_f = this.f56304b.getEsus().getTravel_m();
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                lesson_f = this.f56304b.getEsus().getTravel_f();
                break;
            default:
                lesson_f = this.f56304b.getEsoc().getStory_m();
                break;
        }
        return Integer.valueOf(lesson_f);
    }
}
