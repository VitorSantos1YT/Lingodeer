package xt;

import com.google.api.Service;
import com.lingodeer.data.model.MFSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MFSource f56302b;

    public /* synthetic */ j(MFSource mFSource, int i11) {
        this.f56301a = i11;
        this.f56302b = mFSource;
    }

    @Override // fz.a
    public final Object invoke() {
        int lesson_m;
        switch (this.f56301a) {
            case 0:
                lesson_m = this.f56302b.getCnup().getLesson_m();
                break;
            case 1:
                lesson_m = this.f56302b.getCnup().getLesson_f();
                break;
            case 2:
                lesson_m = this.f56302b.getCn().getLesson_m();
                break;
            case 3:
                lesson_m = this.f56302b.getCn().getLesson_f();
                break;
            case 4:
                lesson_m = this.f56302b.getEn().getLesson_m();
                break;
            case 5:
                lesson_m = this.f56302b.getJpup().getLesson_m();
                break;
            case 6:
                lesson_m = this.f56302b.getEn().getLesson_f();
                break;
            case 7:
                lesson_m = this.f56302b.getEn().getStory_m();
                break;
            case 8:
                lesson_m = this.f56302b.getVt().getLesson_m();
                break;
            case 9:
                lesson_m = this.f56302b.getVt().getLesson_f();
                break;
            case 10:
                lesson_m = this.f56302b.getEsoc().getLesson_m();
                break;
            case 11:
                lesson_m = this.f56302b.getEsoc().getLesson_f();
                break;
            case 12:
                lesson_m = this.f56302b.getFroc().getLesson_m();
                break;
            case 13:
                lesson_m = this.f56302b.getFroc().getLesson_f();
                break;
            case 14:
                lesson_m = this.f56302b.getJpup().getLesson_f();
                break;
            case 15:
                lesson_m = this.f56302b.getJpup().getStory_m();
                break;
            case 16:
                lesson_m = this.f56302b.getDeoc().getLesson_m();
                break;
            case 17:
                lesson_m = this.f56302b.getDeoc().getLesson_f();
                break;
            case 18:
                lesson_m = this.f56302b.getPt().getLesson_m();
                break;
            case 19:
                lesson_m = this.f56302b.getPt().getLesson_f();
                break;
            case 20:
                lesson_m = this.f56302b.getRuoc().getLesson_m();
                break;
            case 21:
                lesson_m = this.f56302b.getRuoc().getLesson_f();
                break;
            case 22:
                lesson_m = this.f56302b.getEn().getStory_f();
                break;
            case 23:
                lesson_m = this.f56302b.getItoc().getLesson_m();
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                lesson_m = this.f56302b.getItoc().getLesson_f();
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                lesson_m = this.f56302b.getEsus().getLesson_m();
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                lesson_m = this.f56302b.getEsus().getLesson_f();
                break;
            case 27:
                lesson_m = this.f56302b.getJp().getLesson_m();
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                lesson_m = this.f56302b.getJp().getLesson_f();
                break;
            default:
                lesson_m = this.f56302b.getKrup().getLesson_m();
                break;
        }
        return Integer.valueOf(lesson_m);
    }
}
