package pr;

import android.os.Parcelable;
import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import com.lingodeer.course.smarttips.data.model.AudioExampleType;
import com.lingodeer.course.smarttips.data.model.DialogueType;
import com.lingodeer.course.smarttips.data.model.TableType;
import com.lingodeer.course.smarttips.data.model.TextExampleType;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.SyllableWriteLesson;
import l1.b1;
import rt.dd;
import rt.ja;
import rt.ka;
import rt.mb;
import rt.y9;
import xu.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f47101e;

    public /* synthetic */ t(Parcelable parcelable, fz.a aVar, fz.f fVar, fz.c cVar, int i11, int i12) {
        this.f47097a = i12;
        this.f47101e = parcelable;
        this.f47098b = aVar;
        this.f47099c = fVar;
        this.f47100d = cVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        ja jaVar;
        ja jaVar2;
        int i11 = this.f47097a;
        boolean z11 = false;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f47100d;
        Object obj4 = this.f47099c;
        Object obj5 = this.f47098b;
        Object obj6 = this.f47101e;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                f0.f((AchievementLanguage) obj6, (fz.a) obj5, (fz.f) obj4, (fz.c) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                f0.i((AchievementLeaderBoard) obj6, (fz.a) obj5, (fz.f) obj4, (fz.c) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                f0.n((AchievementRecord) obj6, (fz.a) obj5, (fz.f) obj4, (fz.c) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                f0.u((AchievementLevel) obj6, (fz.a) obj5, (fz.f) obj4, (fz.c) obj3, (l1.n) obj, l1.t.M(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                pv.a.e((SyllableWriteLesson) obj6, (fz.a) obj5, (fz.c) obj3, (qv.j) obj4, (l1.n) obj, l1.t.M(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                int i12 = THAISyllableIntroductionActivity.M;
                ((THAISyllableIntroductionActivity) obj6).r((String) obj4, (String) obj3, (fz.a) obj5, (l1.n) obj, l1.t.M(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                us.b.k((TableType) obj6, (fz.c) obj3, (fz.a) obj5, (fz.c) obj4, (l1.n) obj, l1.t.M(3457));
                break;
            case 7:
                ((Integer) obj2).getClass();
                us.b.c((DialogueType) obj6, (fz.c) obj3, (fz.a) obj5, (fz.c) obj4, (l1.n) obj, l1.t.M(3457));
                break;
            case 8:
                ((Integer) obj2).getClass();
                us.b.d((TextExampleType) obj6, (fz.c) obj3, (fz.a) obj5, (fz.c) obj4, (l1.n) obj, l1.t.M(3457));
                break;
            case 9:
                ((Integer) obj2).getClass();
                us.b.b((AudioExampleType) obj6, (fz.c) obj3, (fz.a) obj5, (fz.c) obj4, (l1.n) obj, l1.t.M(3457));
                break;
            case 10:
                ((Integer) obj2).getClass();
                q1.l((String) obj6, (String) obj4, (fz.a) obj5, (fz.a) obj3, (l1.n) obj, l1.t.M(385));
                break;
            case 11:
                mb mbVar = (mb) obj6;
                b1 b1Var = (b1) obj5;
                b1 b1Var2 = (b1) obj4;
                b1 b1Var3 = (b1) obj3;
                String bookmarkValue = (String) obj;
                long jLongValue = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue, "bookmarkValue");
                ja jaVarF = mbVar.f(jLongValue, -1L, bookmarkValue);
                if (jaVarF != null && ((ka) mbVar.h(jLongValue, bookmarkValue).getValue()).f49982b) {
                    z11 = true;
                }
                if (jaVarF == null || z11) {
                    mbVar.H(jLongValue, -1L, bookmarkValue);
                } else {
                    if (((Boolean) b1Var.getValue()).booleanValue()) {
                        ja jaVar3 = (ja) b1Var2.getValue();
                        if (!kotlin.jvm.internal.m.a(jaVar3 != null ? jaVar3.f49927a : null, jaVarF.f49927a) && (jaVar = (ja) b1Var2.getValue()) != null) {
                            mbVar.c(jaVar, "__default_bookmark_folder__");
                        }
                    }
                    b1Var3.setValue(jaVarF);
                }
                break;
            default:
                dd ddVar = (dd) obj6;
                b1 b1Var4 = (b1) obj5;
                b1 b1Var5 = (b1) obj4;
                b1 b1Var6 = (b1) obj3;
                String bookmarkValue2 = (String) obj;
                long jLongValue2 = ((Long) obj2).longValue();
                kotlin.jvm.internal.m.f(bookmarkValue2, "bookmarkValue");
                ja jaVarF2 = ddVar.f(jLongValue2, -1L, bookmarkValue2);
                if (jaVarF2 != null && ((ka) ddVar.h(jLongValue2, bookmarkValue2).getValue()).f49982b) {
                    z11 = true;
                }
                if (jaVarF2 == null || z11) {
                    ddVar.H(jLongValue2, -1L, bookmarkValue2);
                } else {
                    if (((Boolean) b1Var4.getValue()).booleanValue()) {
                        ja jaVar4 = (ja) b1Var5.getValue();
                        if (!kotlin.jvm.internal.m.a(jaVar4 != null ? jaVar4.f49927a : null, jaVarF2.f49927a) && (jaVar2 = (ja) b1Var5.getValue()) != null) {
                            ddVar.c(jaVar2, "__default_bookmark_folder__");
                        }
                    }
                    b1Var6.setValue(jaVarF2);
                }
                break;
        }
        return b0Var;
    }

    public /* synthetic */ t(THAISyllableIntroductionActivity tHAISyllableIntroductionActivity, String str, String str2, fz.a aVar, int i11) {
        this.f47097a = 5;
        this.f47101e = tHAISyllableIntroductionActivity;
        this.f47099c = str;
        this.f47100d = str2;
        this.f47098b = aVar;
    }

    public /* synthetic */ t(SyllableWriteLesson syllableWriteLesson, fz.a aVar, fz.c cVar, qv.j jVar, int i11) {
        this.f47097a = 4;
        this.f47101e = syllableWriteLesson;
        this.f47098b = aVar;
        this.f47100d = cVar;
        this.f47099c = jVar;
    }

    public /* synthetic */ t(Object obj, fz.c cVar, fz.a aVar, fz.c cVar2, int i11, int i12) {
        this.f47097a = i12;
        this.f47101e = obj;
        this.f47100d = cVar;
        this.f47098b = aVar;
        this.f47099c = cVar2;
    }

    public /* synthetic */ t(String str, String str2, fz.a aVar, fz.a aVar2, int i11) {
        this.f47097a = 10;
        this.f47101e = str;
        this.f47099c = str2;
        this.f47098b = aVar;
        this.f47100d = aVar2;
    }

    public /* synthetic */ t(y9 y9Var, b1 b1Var, b1 b1Var2, b1 b1Var3, int i11) {
        this.f47097a = i11;
        this.f47101e = y9Var;
        this.f47098b = b1Var;
        this.f47099c = b1Var2;
        this.f47100d = b1Var3;
    }
}
