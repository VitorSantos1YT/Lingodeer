package xt;

import com.google.api.Service;
import com.lingodeer.data.model.MFSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MFSource f56306b;

    public /* synthetic */ l(MFSource mFSource, int i11) {
        this.f56305a = i11;
        this.f56306b = mFSource;
    }

    @Override // fz.a
    public final Object invoke() {
        int travel_m;
        switch (this.f56305a) {
            case 0:
                travel_m = this.f56306b.getEnes().getTravel_m();
                break;
            case 1:
                travel_m = this.f56306b.getEnes().getTravel_f();
                break;
            case 2:
                travel_m = this.f56306b.getFrus().getTravel_m();
                break;
            case 3:
                travel_m = this.f56306b.getJp().getTravel_m();
                break;
            case 4:
                travel_m = this.f56306b.getFrus().getTravel_f();
                break;
            case 5:
                travel_m = this.f56306b.getJp().getTravel_f();
                break;
            case 6:
                travel_m = this.f56306b.getKrup().getTravel_m();
                break;
            case 7:
                travel_m = this.f56306b.getEsoc().getStory_f();
                break;
            case 8:
                travel_m = this.f56306b.getKrup().getTravel_f();
                break;
            case 9:
                travel_m = this.f56306b.getKr().getStory_m();
                break;
            case 10:
                travel_m = this.f56306b.getFroc().getStory_m();
                break;
            case 11:
                travel_m = this.f56306b.getFroc().getStory_f();
                break;
            case 12:
                travel_m = this.f56306b.getJpup().getStory_f();
                break;
            case 13:
                travel_m = this.f56306b.getDeoc().getStory_m();
                break;
            case 14:
                travel_m = this.f56306b.getDeoc().getStory_f();
                break;
            case 15:
                travel_m = this.f56306b.getPt().getStory_m();
                break;
            case 16:
                travel_m = this.f56306b.getPt().getStory_f();
                break;
            case 17:
                travel_m = this.f56306b.getKr().getStory_f();
                break;
            case 18:
                travel_m = this.f56306b.getRuoc().getStory_m();
                break;
            case 19:
                travel_m = this.f56306b.getRuoc().getStory_f();
                break;
            case 20:
                travel_m = this.f56306b.getItoc().getStory_m();
                break;
            case 21:
                travel_m = this.f56306b.getItoc().getStory_f();
                break;
            case 22:
                travel_m = this.f56306b.getEsus().getStory_m();
                break;
            case 23:
                travel_m = this.f56306b.getEsus().getStory_f();
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                travel_m = this.f56306b.getEnes().getStory_m();
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                travel_m = this.f56306b.getEnes().getStory_f();
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                travel_m = this.f56306b.getFrus().getStory_m();
                break;
            case 27:
                travel_m = this.f56306b.getJp().getStory_m();
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                travel_m = this.f56306b.getFrus().getStory_f();
                break;
            default:
                travel_m = this.f56306b.getJp().getStory_f();
                break;
        }
        return Integer.valueOf(travel_m);
    }
}
