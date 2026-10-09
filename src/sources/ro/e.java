package ro;

import com.google.api.Service;
import com.lingo.lingoskill.thaiskill.ui.learn.THAISyllableIntroductionActivity;
import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.UnitState;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import m0.t;
import qy.b0;
import qy.l;
import rt.c1;
import rt.d5;
import rt.n0;
import rt.nf;
import rt.oe;
import rt.t4;
import rt.w8;
import rt.y8;
import ry.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49311a;

    public /* synthetic */ e(int i11) {
        this.f49311a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean z11 = false;
        switch (this.f49311a) {
            case 0:
                t item = (t) obj;
                int i11 = THAISyllableIntroductionActivity.M;
                m.f(item, "$this$item");
                return new m0.d(ob.f.a(4));
            case 1:
                rs.g it = (rs.g) obj;
                m.f(it, "it");
                if (it.f49409c != 1 && !m.a(it.f49407a, " ")) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 2:
                CourseWord it2 = (CourseWord) obj;
                m.f(it2, "it");
                return Boolean.valueOf(it2.getWordType() != 1);
            case 3:
                Exception error = (Exception) obj;
                m.f(error, "error");
                return b0.f48488a;
            case 4:
                Bookmark it3 = (Bookmark) obj;
                m.f(it3, "it");
                return Boolean.valueOf(it3.isFav() == 1);
            case 5:
                Bookmark it4 = (Bookmark) obj;
                m.f(it4, "it");
                return w8.b(it4.getId());
            case 6:
                Bookmark it5 = (Bookmark) obj;
                m.f(it5, "it");
                return Boolean.valueOf(it5.isFav() == 1);
            case 7:
                Bookmark bookmark = (Bookmark) obj;
                m.f(bookmark, "bookmark");
                Long lB = w8.b(bookmark.getId());
                if (lB != null) {
                    return new l(Long.valueOf(lB.longValue()), bookmark.getFolderId());
                }
                return null;
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                m.f(entry, "<destruct>");
                return (String) entry.getValue();
            case 9:
                SRSStatus it6 = (SRSStatus) obj;
                m.f(it6, "it");
                return Boolean.valueOf(it6.isExcludedFromReview());
            case 10:
                oe it7 = (oe) obj;
                m.f(it7, "it");
                return it7.f50220a;
            case 11:
                c1 it8 = (c1) obj;
                m.f(it8, "it");
                return it8.f49553a.getId();
            case 12:
                SRSStatus it9 = (SRSStatus) obj;
                m.f(it9, "it");
                return it9.getId();
            case 13:
                c1 it10 = (c1) obj;
                m.f(it10, "it");
                return it10.f49553a;
            case 14:
                c1 it11 = (c1) obj;
                m.f(it11, "it");
                return it11.f49553a.getId();
            case 15:
                return ((oe) obj).f50220a;
            case 16:
                nf it12 = (nf) obj;
                m.f(it12, "it");
                return it12.f50159a;
            case 17:
                n0 it13 = (n0) obj;
                m.f(it13, "it");
                return it13.f50109b.getId();
            case 18:
                return Boolean.valueOf(((Bookmark) obj).isFav() == 1);
            case 19:
                Bookmark bookmark2 = (Bookmark) obj;
                Long lB2 = w8.b(bookmark2.getId());
                if (lB2 != null) {
                    return new l(Long.valueOf(lB2.longValue()), bookmark2.getFolderId());
                }
                return null;
            case 20:
                d5 it14 = (d5) obj;
                m.f(it14, "it");
                if (it14.f49619g && it14.f49618f) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 21:
                t4 it15 = (t4) obj;
                m.f(it15, "it");
                return Boolean.valueOf(it15.f50424d instanceof WordSentenceCharacterType.SentenceType);
            case 22:
                t4 it16 = (t4) obj;
                m.f(it16, "it");
                return Boolean.valueOf(it16.f50424d instanceof WordSentenceCharacterType.WordType);
            case 23:
                List units = (List) obj;
                m.f(units, "units");
                ArrayList arrayList = new ArrayList(n.W(units, 10));
                Iterator it17 = units.iterator();
                while (it17.hasNext()) {
                    arrayList.add(d5.a((d5) it17.next(), 0, 0, false, false, 63));
                }
                return arrayList;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                List<d5> units2 = (List) obj;
                m.f(units2, "units");
                ArrayList arrayList2 = new ArrayList(n.W(units2, 10));
                for (d5 d5Var : units2) {
                    arrayList2.add(d5.a(d5Var, 0, 0, false, d5Var.f49618f, 63));
                }
                return arrayList2;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                SRSStatus it18 = (SRSStatus) obj;
                m.f(it18, "it");
                return Boolean.valueOf(it18.isExcludedFromReview());
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                CourseUnit it19 = (CourseUnit) obj;
                m.f(it19, "it");
                if (it19.getUnitState() != UnitState.StateLocked && !it19.isTestOut()) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 27:
                y8 unit = (y8) obj;
                m.f(unit, "unit");
                return ry.m.g0(unit.f50700j);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                y8 it20 = (y8) obj;
                m.f(it20, "it");
                return Boolean.valueOf(it20.f50699i);
            default:
                y8 unit2 = (y8) obj;
                m.f(unit2, "unit");
                return ry.m.g0(unit2.f50700j);
        }
    }
}
