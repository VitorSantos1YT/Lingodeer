package pr;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.google.api.Service;
import com.lingo.chinesetone.ChineseToneIndexActivity;
import com.lingo.lingoskill.idnskill.ui.learn.IDNSyllableIntroductionActivity;
import com.lingo.lingoskill.japanskill.ui.syllablenew.JPSyllableIndexActivity;
import com.lingo.lingoskill.ptskill.ui.syllable.PTNewSyllableIntroductionActivity;
import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import com.lingo.lingoskill.turskill.ui.learn.TURSyllableIntroductionActivity;
import com.lingo.lingoskill.ui.review.BaseReviewEmptyActivity;
import com.lingo.lingoskill.ukrskill.ui.learn.UKRSyllableIntroductionActivity;
import com.lingo.lingoskill.vtskill.ui.syllable.ui.VTSyllableActivity;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.uistate.CompleteOneLessonUiState;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import fu.g0;
import l1.b1;
import rt.h9;
import tg.i0;
import tg.j0;
import tg.k0;
import ys.a3;
import ys.p1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47115c;

    public /* synthetic */ y(int i11, Object obj, Object obj2) {
        this.f47113a = i11;
        this.f47114b = obj;
        this.f47115c = obj2;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f47113a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f47115c;
        Object obj4 = this.f47114b;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                f0.j((AchievementLeaderBoard) obj4, (g0) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                f0.o((AchievementRecord) obj4, (g0) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                f0.g((AchievementLanguage) obj4, (g0) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                f0.q((AchievementLevel) obj4, (fz.e) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i12 = JPSyllableIndexActivity.f21908t;
                ((JPSyllableIndexActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                qu.b.i((LeaderBoardUser) obj4, (tu.e0) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                se.k.b((i0) obj4, (String) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                int i13 = THAISyllableIntroductionActivity.M;
                ((THAISyllableIntroductionActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int i14 = VTSyllableActivity.H;
                ((VTSyllableActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                k0.a((j0) obj4, (t1.d) obj3, (l1.n) obj, l1.t.M(385));
                break;
            case 10:
                ((Integer) obj2).getClass();
                int i15 = IDNSyllableIntroductionActivity.P;
                ((IDNSyllableIntroductionActivity) obj4).s((String) obj3, (l1.n) obj, l1.t.M(7));
                break;
            case 11:
                ((Integer) obj2).getClass();
                int i16 = IDNSyllableIntroductionActivity.P;
                ((IDNSyllableIntroductionActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                int i17 = IDNSyllableIntroductionActivity.P;
                ((IDNSyllableIntroductionActivity) obj4).t((wl.a) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                int i18 = BaseReviewEmptyActivity.H;
                ((BaseReviewEmptyActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                tv.j.c((z1.r) obj4, (fz.e) obj3, (l1.n) obj, l1.t.M(7));
                break;
            case 15:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) obj3;
                vy.g element = (vy.g) obj2;
                kotlin.jvm.internal.m.f((qy.b0) obj, "<unused var>");
                kotlin.jvm.internal.m.f(element, "element");
                int i19 = wVar.f38359a;
                wVar.f38359a = i19 + 1;
                ((vy.i[]) obj4)[i19] = element;
                break;
            case 16:
                ((Integer) obj2).getClass();
                int i21 = TURSyllableIntroductionActivity.H;
                ((TURSyllableIntroductionActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                x0.l.a((v0.g) obj4, (v0.c) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ((x0.r) obj4).b((Drawable) obj3, (l1.n) obj, l1.t.M(49));
                break;
            case 19:
                ((Integer) obj2).getClass();
                int i22 = PTNewSyllableIntroductionActivity.f21986t;
                ((PTNewSyllableIntroductionActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                int i23 = PTNewSyllableIntroductionActivity.f21986t;
                ((PTNewSyllableIntroductionActivity) obj4).p((yn.a) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                int i24 = PTNewSyllableIntroductionActivity.f21986t;
                ((PTNewSyllableIntroductionActivity) obj4).q((z1.r) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                int i25 = UKRSyllableIntroductionActivity.H;
                ((UKRSyllableIntroductionActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                xu.b.a((CompleteOneLessonUiState) obj4, (fz.a) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Integer) obj2).getClass();
                xu.b0.a((mu.x) obj4, (fz.a) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((Integer) obj2).getClass();
                p1.d((h9) obj4, (fz.a) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                Boolean bool2 = (Boolean) obj2;
                bool2.getClass();
                ((fz.e) obj4).invoke(bool, bool2);
                ((b1) obj3).setValue(Boolean.TRUE);
                break;
            case 27:
                ((Integer) obj2).getClass();
                a3.e((CourseUnit) obj4, (fz.c) obj3, (l1.n) obj, l1.t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                int i26 = ChineseToneIndexActivity.f21610t;
                ((ChineseToneIndexActivity) obj4).j((Bundle) obj3, (l1.n) obj, l1.t.M(1));
                break;
        }
        return b0Var;
    }

    public /* synthetic */ y(Object obj, int i11, int i12, Object obj2) {
        this.f47113a = i12;
        this.f47114b = obj;
        this.f47115c = obj2;
    }
}
