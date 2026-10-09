package dl;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingo.lingoskill.hindiskill.ui.learn.HINDISyllableIntroductionActivity;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import oz.x;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f23477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f23478c;

    public /* synthetic */ m(int i11, fz.c cVar, List list) {
        this.f23476a = i11;
        this.f23478c = cVar;
        this.f23477b = list;
    }

    public /* synthetic */ m(List list, fz.c cVar) {
        this.f23476a = 1;
        this.f23477b = list;
        this.f23478c = cVar;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f23476a;
        b0 b0Var = b0.f48488a;
        List list = this.f23477b;
        fz.c cVar = this.f23478c;
        switch (i11) {
            case 0:
                int i12 = GRKSyllableIntroductionActivity.H;
                cVar.invoke(list.get(2));
                break;
            case 1:
                int i13 = MALSyllableIntroductionActivity.Q;
                cVar.invoke(list.size() == 3 ? x.q0(x.q0((String) list.get(2), SemtNwfPgIhi.BZxHwbG, BuildConfig.VERSION_NAME), "]", BuildConfig.VERSION_NAME) : (String) list.get(0));
                break;
            case 2:
                int i14 = HINDISyllableIntroductionActivity.K;
                cVar.invoke(list.get(2));
                break;
            case 3:
                cVar.invoke(list.get(0));
                break;
            default:
                int i15 = UKRSyllableIntroductionActivity.H;
                cVar.invoke(list.get(2));
                break;
        }
        return b0Var;
    }
}
