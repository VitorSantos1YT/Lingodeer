package bo;

import com.lingo.lingoskill.deskill.ui.learn.DESyllableIntroductionActivity;
import com.lingo.lingoskill.englishskill.ui.learn.ENSyllableIntroductionActivity;
import com.lingo.lingoskill.espanskill.ui.learn.ESSyllableIntroductionActivity;
import com.lingo.lingoskill.esusskill.ui.learn.ESUSSyllableIntroductionActivity;
import com.lingo.lingoskill.franchskill.ui.learn.FRSyllableIntroductionActivity2;
import com.lingo.lingoskill.itskill.ui.learn.ITSyllableIntroductionActivity;
import com.lingo.lingoskill.ptskill.ui.syllable.PTSyllableIntroductionActivity;
import com.lingo.lingoskill.ruskill.ui.learn.RUSyllableIndexActivity;
import java.io.File;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements tx.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f4471b;

    public /* synthetic */ c(File file, int i11) {
        this.f4470a = i11;
        this.f4471b = file;
    }

    @Override // tx.a
    public final void run() {
        int i11 = this.f4470a;
        File file = this.f4471b;
        switch (i11) {
            case 0:
                int i12 = RUSyllableIndexActivity.Z;
                if (file.length() != 0) {
                    String parent = file.getParent();
                    m.e(parent, "getParent(...)");
                    ks.b.o(parent, fv.b.D(-1L));
                }
                break;
            case 1:
                int i13 = ESSyllableIntroductionActivity.f21802y0;
                if (file.length() != 0) {
                    String parent2 = file.getParent();
                    m.e(parent2, "getParent(...)");
                    ks.b.o(parent2, fv.b.D(-1L));
                }
                break;
            case 2:
                int i14 = DESyllableIntroductionActivity.G0;
                if (file.length() != 0) {
                    String parent3 = file.getParent();
                    m.e(parent3, "getParent(...)");
                    ks.b.o(parent3, fv.b.D(-1L));
                }
                break;
            case 3:
                int i15 = ESUSSyllableIntroductionActivity.f21828y0;
                if (file.length() != 0) {
                    String parent4 = file.getParent();
                    m.e(parent4, "getParent(...)");
                    ks.b.o(parent4, fv.b.D(-1L));
                }
                break;
            case 4:
                if (file.length() != 0) {
                    String parent5 = file.getParent();
                    m.e(parent5, "getParent(...)");
                    ks.b.o(parent5, fv.b.D(-1L));
                }
                break;
            case 5:
                int i16 = FRSyllableIntroductionActivity2.K0;
                if (file.length() != 0) {
                    String parent6 = file.getParent();
                    m.e(parent6, "getParent(...)");
                    ks.b.o(parent6, fv.b.D(-1L));
                }
                break;
            case 6:
                int i17 = PTSyllableIntroductionActivity.f21987p0;
                if (file.length() != 0) {
                    String parent7 = file.getParent();
                    m.e(parent7, "getParent(...)");
                    ks.b.o(parent7, fv.b.D(-1L));
                }
                break;
            case 7:
                int i18 = ENSyllableIntroductionActivity.V;
                if (file.length() != 0) {
                    String parent8 = file.getParent();
                    m.e(parent8, "getParent(...)");
                    ks.b.o(parent8, fv.b.D(-1L));
                }
                break;
            default:
                int i19 = ITSyllableIntroductionActivity.f21889h0;
                if (file.length() != 0) {
                    String parent9 = file.getParent();
                    m.e(parent9, "getParent(...)");
                    ks.b.o(parent9, fv.b.D(-1L));
                }
                break;
        }
    }

    public /* synthetic */ c(File file, nm.b bVar) {
        this.f4470a = 4;
        this.f4471b = file;
    }
}
