package in;

import com.google.api.Service;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import oz.q;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f34485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34486c;

    public /* synthetic */ h(fz.c cVar, String str, int i11) {
        this.f34484a = i11;
        this.f34485b = cVar;
        this.f34486c = str;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f34484a;
        b0 b0Var = b0.f48488a;
        String str = this.f34486c;
        fz.c cVar = this.f34485b;
        switch (i11) {
            case 0:
                int i12 = MALSyllableIntroductionActivity.Q;
                cVar.invoke(q.W0(str, new String[]{" "}, 0, 6).get(0));
                break;
            case 1:
                cVar.invoke(str);
                break;
            case 2:
                cVar.invoke(str);
                break;
            case 3:
                cVar.invoke(str);
                break;
            case 4:
                cVar.invoke(str);
                break;
            case 5:
                cVar.invoke(str);
                break;
            case 6:
                cVar.invoke(str);
                break;
            case 7:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(1));
                break;
            case 8:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(2));
                break;
            case 9:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(1));
                break;
            case 10:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(2));
                break;
            case 11:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(2));
                break;
            case 12:
                cVar.invoke(str);
                break;
            case 13:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(1));
                break;
            case 14:
                cVar.invoke(str);
                break;
            case 15:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(1));
                break;
            case 16:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(2));
                break;
            case 17:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(1));
                break;
            case 18:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(2));
                break;
            case 19:
                int i13 = IDNSyllableIntroductionActivity.P;
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(0));
                break;
            case 20:
                int i14 = IDNSyllableIntroductionActivity.P;
                cVar.invoke(q.W0(str, new String[]{" "}, 0, 6).get(0));
                break;
            case 21:
                int i15 = TURSyllableIntroductionActivity.H;
                cVar.invoke(str);
                break;
            case 22:
                int i16 = TURSyllableIntroductionActivity.H;
                cVar.invoke(str);
                break;
            case 23:
                cVar.invoke(q.i1(str).toString());
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(0));
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                cVar.invoke(str);
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                cVar.invoke(q.W0(str, new String[]{"\n"}, 0, 6).get(0));
                break;
            case 27:
                cVar.invoke(str);
                break;
            default:
                cVar.invoke(str);
                break;
        }
        return b0Var;
    }
}
