package sv;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus;
import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f51814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f51815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f51816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(LinkedHashMap linkedHashMap, o oVar, Set set, vy.d dVar) {
        super(2, dVar);
        this.f51814a = linkedHashMap;
        this.f51815b = oVar;
        this.f51816c = set;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new l(this.f51814a, this.f51815b, this.f51816c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        Object obj2;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f51814a.entrySet().iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            ArrayList arrayList2 = this.f51815b.f51834s0;
            int size = arrayList2.size();
            do {
                if (i11 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList2.get(i11);
                i11++;
            } while (((CourseWord) obj2).getWordId() != ((Number) entry.getKey()).longValue());
            CourseWord courseWord = (CourseWord) obj2;
            if (courseWord != null) {
                arrayList.add(courseWord);
            }
        }
        ArrayList arrayList3 = new ArrayList(ry.n.W(arrayList, 10));
        int size2 = arrayList.size();
        while (i11 < size2) {
            Object obj3 = arrayList.get(i11);
            i11++;
            CourseWord courseWord2 = (CourseWord) obj3;
            arrayList3.add(new WordSentenceCharacterSummaryType.WordType(courseWord2, this.f51816c.contains(new Long(courseWord2.getWordId())) ? CourseTestSummaryItemStatus.WRONG : CourseTestSummaryItemStatus.CORRECT));
        }
        return arrayList3;
    }
}
