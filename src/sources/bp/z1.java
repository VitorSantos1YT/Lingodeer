package bp;

import com.google.api.Service;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.splash.SplashIndexActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z1 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j9.v f4934b;

    public /* synthetic */ z1(j9.v vVar, int i11) {
        this.f4933a = i11;
        this.f4934b = vVar;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f4933a;
        qy.b0 b0Var = qy.b0.f48488a;
        j9.v vVar = this.f4934b;
        switch (i11) {
            case 0:
                int i12 = LoginActivity.Q;
                j9.v.b(vVar, "email_login");
                break;
            case 1:
                vVar.c();
                break;
            case 2:
                vVar.c();
                break;
            case 3:
                vVar.a("chinese_tone_test", new com.lingo.lingoskill.object.a(22));
                break;
            case 4:
                vVar.c();
                break;
            case 5:
                vVar.a("chinese_tone_test", new com.lingo.lingoskill.object.a(7));
                break;
            case 6:
                vVar.c();
                break;
            case 7:
                vVar.c();
                break;
            case 8:
                vVar.a("chinese_tone_test", new com.lingo.lingoskill.object.a(18));
                break;
            case 9:
                vVar.c();
                break;
            case 10:
                vVar.a("chinese_tone_test", new com.lingo.lingoskill.object.a(24));
                break;
            case 11:
                vVar.c();
                break;
            case 12:
                vVar.a("chinese_tone_test", new com.lingo.lingoskill.object.a(23));
                break;
            case 13:
                vVar.c();
                break;
            case 14:
                vVar.a("chinese_tone_test", new com.lingo.lingoskill.object.a(25));
                break;
            case 15:
                vVar.c();
                break;
            case 16:
                vVar.a("chinese_tone_test", new com.lingo.lingoskill.object.a(17));
                break;
            case 17:
                vVar.c();
                break;
            case 18:
                vVar.a("chinese_tone_test", new com.lingo.lingoskill.object.a(19));
                break;
            case 19:
                j9.v.b(vVar, "chinese_tone_finish");
                break;
            case 20:
                int i13 = SplashIndexActivity.M;
                j9.v.b(vVar, "chooseLanguage");
                break;
            case 21:
                int i14 = SplashIndexActivity.M;
                vVar.c();
                break;
            case 22:
                j9.v.b(vVar, "syllable_intro_overview");
                break;
            case 23:
                vVar.c();
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                if (!vVar.c()) {
                    j9.v.b(vVar, "syllable_index");
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                if (!vVar.c()) {
                    j9.v.b(vVar, "syllable_index");
                }
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                if (!vVar.c()) {
                    j9.v.b(vVar, "syllable_index");
                }
                break;
            case 27:
                j9.v.b(vVar, "syllable_test");
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                if (!vVar.c()) {
                    j9.v.b(vVar, "syllable_index");
                }
                break;
            default:
                j9.v.b(vVar, "syllable_finish");
                break;
        }
        return b0Var;
    }
}
