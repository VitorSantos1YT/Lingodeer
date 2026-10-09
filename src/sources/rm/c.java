package rm;

import com.lingo.lingoskill.object.Lesson;
import com.lingodeer.data.model.SyllableLessonStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import ns.o;
import qy.b0;
import ry.n;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f49291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f49292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f49290a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f49290a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                c cVar = new c(3, 0, (vy.d) obj3);
                cVar.f49292c = iIntValue;
                cVar.f49291b = (List) obj2;
                return cVar.invokeSuspend(b0.f48488a);
            case 1:
                int iIntValue2 = ((Number) obj2).intValue();
                c cVar2 = new c(3, 1, (vy.d) obj3);
                cVar2.f49291b = (List) obj;
                cVar2.f49292c = iIntValue2;
                return cVar2.invokeSuspend(b0.f48488a);
            default:
                int iIntValue3 = ((Number) obj).intValue();
                c cVar3 = new c(3, 2, (vy.d) obj3);
                cVar3.f49292c = iIntValue3;
                cVar3.f49291b = (List) obj2;
                return cVar3.invokeSuspend(b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f49290a) {
            case 0:
                int i11 = this.f49292c;
                List list = this.f49291b;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ArrayList arrayList = new ArrayList(n.W(list, 10));
                int i12 = 0;
                for (Object obj2 : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        o.V();
                        throw null;
                    }
                    Lesson lesson = (Lesson) obj2;
                    SyllableLessonStatus syllableLessonStatus = lesson.getSortIndex() < i11 ? SyllableLessonStatus.COMPLETED : lesson.getSortIndex() == i11 ? SyllableLessonStatus.UNLOCKED : SyllableLessonStatus.LOCKED;
                    long lessonId = lesson.getLessonId();
                    String lessonName = lesson.getLessonName();
                    m.e(lessonName, "getLessonName(...)");
                    String description = lesson.getDescription();
                    m.e(description, "getDescription(...)");
                    arrayList.add(new e(lessonId, lessonName, description, lesson.getSortIndex(), f.HIRAGANA, syllableLessonStatus));
                    i12 = i13;
                }
                ArrayList arrayList2 = new ArrayList(n.W(list, 10));
                int i14 = 0;
                for (Object obj3 : list) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        o.V();
                        throw null;
                    }
                    Lesson lesson2 = (Lesson) obj3;
                    SyllableLessonStatus syllableLessonStatus2 = lesson2.getSortIndex() < i11 ? SyllableLessonStatus.COMPLETED : lesson2.getSortIndex() == i11 ? SyllableLessonStatus.UNLOCKED : SyllableLessonStatus.LOCKED;
                    long lessonId2 = lesson2.getLessonId();
                    String lessonName2 = lesson2.getLessonName();
                    m.e(lessonName2, "getLessonName(...)");
                    String wordList = lesson2.getWordList();
                    m.e(wordList, "getWordList(...)");
                    arrayList2.add(new e(lessonId2, lessonName2, wordList, lesson2.getSortIndex(), f.KATAKANA, syllableLessonStatus2));
                    i14 = i15;
                }
                return new b(arrayList, arrayList2, i11 > 2);
            case 1:
                List list2 = this.f49291b;
                int i16 = this.f49292c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return ry.m.t0(i16, list2);
            default:
                int i17 = this.f49292c;
                List list3 = this.f49291b;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return ry.m.t0(i17, list3);
        }
    }
}
