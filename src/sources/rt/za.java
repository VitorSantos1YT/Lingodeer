package rt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.SentenceMFType;
import com.lingodeer.data.model.uistate.CourseTestSummaryItemStatus;
import com.lingodeer.data.model.uistate.WordSentenceCharacterSummaryType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class za extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f50801a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(List list, vy.d dVar) {
        super(2, dVar);
        this.f50801a = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new za(this.f50801a, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((za) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        ArrayList arrayList = new ArrayList();
        for (et.o oVar : this.f50801a) {
            CourseSentence courseSentenceA = null;
            if (!(oVar instanceof et.n) && oVar.a().getSentenceMFType() != SentenceMFType.NORMAL) {
                courseSentenceA = oVar.a();
            }
            if (courseSentenceA != null) {
                arrayList.add(courseSentenceA);
            }
        }
        ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            arrayList2.add(new WordSentenceCharacterSummaryType.SentenceType((CourseSentence) obj2, CourseTestSummaryItemStatus.CORRECT));
        }
        return arrayList2;
    }
}
