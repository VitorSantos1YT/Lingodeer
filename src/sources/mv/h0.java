package mv;

import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus;
import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f42212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f42213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f42214c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(LinkedHashMap linkedHashMap, k0 k0Var, Set set, vy.d dVar) {
        super(2, dVar);
        this.f42212a = linkedHashMap;
        this.f42213b = k0Var;
        this.f42214c = set;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new h0(this.f42212a, this.f42213b, this.f42214c, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        Object obj2;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f42212a.entrySet().iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            ArrayList arrayList2 = this.f42213b.f42236s0;
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
            arrayList3.add(new WordSentenceCharacterSummaryType.WordType(courseWord2, this.f42214c.contains(new Long(courseWord2.getWordId())) ? CourseTestSummaryItemStatus.WRONG : CourseTestSummaryItemStatus.CORRECT));
        }
        return arrayList3;
    }
}
