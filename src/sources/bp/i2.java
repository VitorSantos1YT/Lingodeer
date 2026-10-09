package bp;

import com.google.api.Service;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import h1.f8;
import java.util.ArrayList;
import java.util.List;
import rt.ja;
import rt.le;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4637c;

    public /* synthetic */ i2(l1.b1 b1Var, l1.b1 b1Var2, int i11) {
        this.f4635a = i11;
        this.f4636b = b1Var;
        this.f4637c = b1Var2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean z11;
        int i11 = this.f4635a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f4637c;
        l1.b1 b1Var2 = this.f4636b;
        switch (i11) {
            case 0:
                String it = (String) obj;
                kotlin.jvm.internal.m.f(it, "it");
                b1Var2.setValue(it);
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 1:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                b1Var2.setValue(it2);
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 2:
                CourseWord option = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option, "option");
                List<CourseWord> list = (List) b1Var2.getValue();
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                for (CourseWord courseWord : list) {
                    arrayList.add(kotlin.jvm.internal.m.a(courseWord, option) ? CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null));
                }
                b1Var2.setValue(arrayList);
                b1Var.setValue(ht.q.SELECTED);
                return b0Var;
            case 3:
                CourseWord option2 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option2, "option");
                List<CourseWord> list2 = (List) b1Var2.getValue();
                ArrayList arrayList2 = new ArrayList(ry.n.W(list2, 10));
                for (CourseWord courseWord2 : list2) {
                    arrayList2.add(kotlin.jvm.internal.m.a(courseWord2, option2) ? CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null));
                }
                b1Var2.setValue(arrayList2);
                b1Var.setValue(ht.q.SELECTED);
                return b0Var;
            case 4:
                CourseWord option3 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option3, "option");
                List<CourseWord> list3 = (List) b1Var2.getValue();
                ArrayList arrayList3 = new ArrayList(ry.n.W(list3, 10));
                for (CourseWord courseWord3 : list3) {
                    arrayList3.add(kotlin.jvm.internal.m.a(courseWord3, option3) ? CourseWord.copy$default(courseWord3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWord3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null));
                }
                b1Var2.setValue(arrayList3);
                b1Var.setValue(ht.q.SELECTED);
                return b0Var;
            case 5:
                CourseWord option4 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option4, "option");
                List<CourseWord> list4 = (List) b1Var2.getValue();
                ArrayList arrayList4 = new ArrayList(ry.n.W(list4, 10));
                for (CourseWord courseWord4 : list4) {
                    arrayList4.add(kotlin.jvm.internal.m.a(courseWord4, option4) ? CourseWord.copy$default(courseWord4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWord4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null));
                }
                b1Var2.setValue(arrayList4);
                b1Var.setValue(ht.q.SELECTED);
                return b0Var;
            case 6:
                CourseWord option5 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option5, "option");
                List<CourseWord> list5 = (List) b1Var2.getValue();
                ArrayList arrayList5 = new ArrayList(ry.n.W(list5, 10));
                for (CourseWord courseWord5 : list5) {
                    arrayList5.add(kotlin.jvm.internal.m.a(courseWord5, option5) ? CourseWord.copy$default(courseWord5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWord5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null));
                }
                b1Var2.setValue(arrayList5);
                b1Var.setValue(ht.q.SELECTED);
                return b0Var;
            case 7:
                CourseWord option6 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option6, "option");
                List<CourseWord> list6 = (List) b1Var2.getValue();
                ArrayList arrayList6 = new ArrayList(ry.n.W(list6, 10));
                for (CourseWord courseWord6 : list6) {
                    arrayList6.add(kotlin.jvm.internal.m.a(courseWord6, option6) ? CourseWord.copy$default(courseWord6, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWord6, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null));
                }
                b1Var2.setValue(arrayList6);
                b1Var.setValue(ht.q.SELECTED);
                return b0Var;
            case 8:
                CourseUnit unit = (CourseUnit) obj;
                int i12 = CourseTestIndexActivity.N;
                kotlin.jvm.internal.m.f(unit, "unit");
                b1Var2.setValue(Long.valueOf(unit.getUnitId()));
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 9:
                f8 targetValue = (f8) obj;
                kotlin.jvm.internal.m.f(targetValue, "targetValue");
                if (targetValue == f8.Hidden && ((Boolean) b1Var2.getValue()).booleanValue()) {
                    b1Var.setValue(Boolean.TRUE);
                    z11 = false;
                } else {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 10:
                w2.x coordinates = (w2.x) obj;
                kotlin.jvm.internal.m.f(coordinates, "coordinates");
                int iM = (int) (coordinates.m() >> 32);
                int iM2 = (int) (coordinates.m() & 4294967295L);
                if (iM != ((Number) b1Var2.getValue()).intValue() || iM2 != ((Number) b1Var.getValue()).intValue()) {
                    b1Var2.setValue(Integer.valueOf(iM));
                    b1Var.setValue(Integer.valueOf(iM2));
                }
                return b0Var;
            case 11:
                le dateRange = (le) obj;
                kotlin.jvm.internal.m.f(dateRange, "dateRange");
                b1Var2.setValue(dateRange);
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 12:
                List it3 = (List) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                b1Var2.setValue(it3);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 13:
                rt.m0 it4 = (rt.m0) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                b1Var2.setValue(it4);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 14:
                ja it5 = (ja) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                b1Var2.setValue(it5);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 15:
                ja it6 = (ja) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                b1Var2.setValue(it6);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 16:
                WordSentenceCharacterType it7 = (WordSentenceCharacterType) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                b1Var2.setValue(it7);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 17:
                String it8 = (String) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                b1Var2.setValue(it8);
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 18:
                String it9 = (String) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                b1Var2.setValue(it9);
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 19:
                String it10 = (String) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                b1Var2.setValue(it10);
                b1Var.setValue(Boolean.FALSE);
                return b0Var;
            case 20:
                LeaderBoardUser it11 = (LeaderBoardUser) obj;
                kotlin.jvm.internal.m.f(it11, "it");
                b1Var2.setValue(it11);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 21:
                LeaderBoardUser it12 = (LeaderBoardUser) obj;
                kotlin.jvm.internal.m.f(it12, "it");
                b1Var2.setValue(it12);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 22:
                String it13 = (String) obj;
                kotlin.jvm.internal.m.f(it13, "it");
                b1Var2.setValue(it13);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 23:
                ja it14 = (ja) obj;
                kotlin.jvm.internal.m.f(it14, "it");
                b1Var2.setValue(it14);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ja it15 = (ja) obj;
                kotlin.jvm.internal.m.f(it15, "it");
                b1Var2.setValue(it15);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ja it16 = (ja) obj;
                kotlin.jvm.internal.m.f(it16, "it");
                b1Var2.setValue(it16);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            default:
                ja it17 = (ja) obj;
                kotlin.jvm.internal.m.f(it17, "it");
                b1Var2.setValue(it17);
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
        }
    }
}
