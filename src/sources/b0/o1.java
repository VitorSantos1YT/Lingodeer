package b0;

import com.google.api.Service;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import rt.db;
import rt.le;
import rt.qe;
import rt.y4;
import rt.z8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f3629b;

    public /* synthetic */ o1(fz.c cVar, int i11) {
        this.f3628a = i11;
        this.f3629b = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f3628a) {
            case 0:
                Long l9 = (Long) obj;
                l9.longValue();
                return this.f3629b.invoke(l9);
            case 1:
                LanguageItem it = (LanguageItem) obj;
                kotlin.jvm.internal.m.f(it, "it");
                this.f3629b.invoke(it);
                return qy.b0.f48488a;
            case 2:
                Integer num = (Integer) obj;
                num.intValue();
                this.f3629b.invoke(num);
                return qy.b0.f48488a;
            case 3:
                o3.w it2 = (o3.w) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                this.f3629b.invoke(it2.f44704a.f35700b);
                return qy.b0.f48488a;
            case 4:
                w2.x it3 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                this.f3629b.invoke(w2.a0.f(it3, true));
                return qy.b0.f48488a;
            case 5:
                this.f3629b.invoke(Integer.valueOf((int) (((v3.l) obj).f53498a & 4294967295L)));
                return qy.b0.f48488a;
            case 6:
                ChineseToneUnit unit = (ChineseToneUnit) obj;
                kotlin.jvm.internal.m.f(unit, "unit");
                this.f3629b.invoke(unit);
                return qy.b0.f48488a;
            case 7:
                CourseWord it4 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                this.f3629b.invoke(it4);
                return qy.b0.f48488a;
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f3629b.invoke(bool);
                return qy.b0.f48488a;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f3629b.invoke(bool2);
                return qy.b0.f48488a;
            case 10:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                this.f3629b.invoke(bool3);
                return qy.b0.f48488a;
            case 11:
                z8 it5 = (z8) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                this.f3629b.invoke(it5);
                return qy.b0.f48488a;
            case 12:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                this.f3629b.invoke(bool4);
                return qy.b0.f48488a;
            case 13:
                mu.i it6 = (mu.i) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                this.f3629b.invoke(it6);
                return qy.b0.f48488a;
            case 14:
                String it7 = (String) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                this.f3629b.invoke(it7);
                return qy.b0.f48488a;
            case 15:
                le dateRange = (le) obj;
                kotlin.jvm.internal.m.f(dateRange, "dateRange");
                this.f3629b.invoke(new qe(dateRange));
                return qy.b0.f48488a;
            case 16:
                mt.q2 it8 = (mt.q2) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                this.f3629b.invoke(it8);
                return qy.b0.f48488a;
            case 17:
                CourseWord it9 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                String string = it9.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                this.f3629b.invoke(string);
                return qy.b0.f48488a;
            case 18:
                String updatedNote = (String) obj;
                kotlin.jvm.internal.m.f(updatedNote, "updatedNote");
                this.f3629b.invoke(updatedNote);
                return qy.b0.f48488a;
            case 19:
                this.f3629b.invoke(((yy.b) y4.a()).get(((Integer) obj).intValue()));
                return qy.b0.f48488a;
            case 20:
                this.f3629b.invoke(Integer.valueOf(hz.b.Q(((Float) obj).floatValue())));
                return qy.b0.f48488a;
            case 21:
                mh.b it10 = (mh.b) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                this.f3629b.invoke(new oh.g(it10));
                return qy.b0.f48488a;
            case 22:
                mh.i it11 = (mh.i) obj;
                kotlin.jvm.internal.m.f(it11, "it");
                this.f3629b.invoke(new oh.e(it11));
                return qy.b0.f48488a;
            case 23:
                mh.i it12 = (mh.i) obj;
                kotlin.jvm.internal.m.f(it12, "it");
                this.f3629b.invoke(new oh.f(it12.f41135a));
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                l0.h LazyColumn = (l0.h) obj;
                kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                l0.h.p(LazyColumn, null, nn.a.f43857a, 3);
                fz.c cVar = this.f3629b;
                l0.h.p(LazyColumn, null, new t1.d(new f0.t(cVar, 2), true, -626980192), 3);
                l0.h.p(LazyColumn, null, new t1.d(new f0.t(cVar, 3), true, 172594337), 3);
                l0.h.p(LazyColumn, null, new t1.d(new f0.t(cVar, 4), true, 972168866), 3);
                l0.h.p(LazyColumn, null, new t1.d(new f0.t(cVar, 5), true, 1771743395), 3);
                l0.h.p(LazyColumn, null, new t1.d(new f0.t(cVar, 6), true, -1723649372), 3);
                l0.h.p(LazyColumn, null, new t1.d(new f0.t(cVar, 7), true, -924074843), 3);
                l0.h.p(LazyColumn, null, new t1.d(new f0.t(cVar, 8), true, -124500314), 3);
                l0.h.p(LazyColumn, null, new t1.d(new f0.t(cVar, 9), true, 675074215), 3);
                l0.h.p(LazyColumn, null, nn.a.f43858b, 3);
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                KOSyllableLesson it13 = (KOSyllableLesson) obj;
                kotlin.jvm.internal.m.f(it13, "it");
                this.f3629b.invoke(new sv.e(it13, false));
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                KOSyllableLesson it14 = (KOSyllableLesson) obj;
                kotlin.jvm.internal.m.f(it14, "it");
                this.f3629b.invoke(new sv.e(it14, false));
                return qy.b0.f48488a;
            case 27:
                z8 it15 = (z8) obj;
                kotlin.jvm.internal.m.f(it15, "it");
                this.f3629b.invoke(it15);
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                this.f3629b.invoke(new db(((Float) obj).floatValue()));
                return qy.b0.f48488a;
            default:
                this.f3629b.invoke(new db(((Float) obj).floatValue()));
                return qy.b0.f48488a;
        }
    }
}
