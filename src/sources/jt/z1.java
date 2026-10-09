package jt;

import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class z1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f37290b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z1(a2 a2Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f37289a = i11;
        this.f37290b = a2Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f37289a) {
            case 0:
                return new z1(this.f37290b, dVar, 0);
            default:
                return new z1(this.f37290b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f37289a) {
            case 0:
                break;
        }
        return ((z1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        CourseWord courseWordCopy$default;
        CourseWord courseWordCopy$default2;
        int i11 = this.f37289a;
        a2 a2Var = this.f37290b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1.b1 b1Var = a2Var.f36880i;
                List list = a2Var.f36876e;
                l1.b1 b1Var2 = a2Var.f36879h;
                Iterable<CourseWord> iterable = (Iterable) a2Var.f36873b.getValue();
                ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
                for (CourseWord courseWord : iterable) {
                    if (b1Var2.getValue() != null && b1Var.getValue() == null) {
                        CourseWord courseWord2 = (CourseWord) b1Var2.getValue();
                        courseWordCopy$default = (courseWord2 == null || courseWord.getWordId() != courseWord2.getWordId()) ? CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, list.contains(Long.valueOf(courseWord.getWordId())), false, false, false, null, null, null, null, null, null, 0, -201326593, 63, null) : CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, true, false, false, false, false, null, null, null, null, null, null, 0, -67108865, 63, null);
                    } else if (b1Var.getValue() == null || b1Var2.getValue() == null) {
                        courseWordCopy$default = CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, list.contains(Long.valueOf(courseWord.getWordId())), false, false, false, null, null, null, null, null, null, 0, -201326593, 63, null);
                    } else {
                        CourseWord courseWord3 = (CourseWord) b1Var2.getValue();
                        if (courseWord3 == null || courseWord.getWordId() != courseWord3.getWordId()) {
                            courseWordCopy$default = CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, list.contains(Long.valueOf(courseWord.getWordId())), false, false, false, null, null, null, null, null, null, 0, -201326593, 63, null);
                        } else {
                            CourseWord courseWord4 = (CourseWord) b1Var2.getValue();
                            courseWordCopy$default = CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, true, ry.m.i0(list, courseWord4 != null ? Long.valueOf(courseWord4.getWordId()) : null), false, false, false, null, null, null, null, null, null, 0, -201326593, 63, null);
                        }
                    }
                    arrayList.add(courseWordCopy$default);
                }
                return arrayList;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1.b1 b1Var3 = a2Var.f36879h;
                List list2 = a2Var.f36876e;
                l1.b1 b1Var4 = a2Var.f36880i;
                Iterable<CourseWord> iterable2 = (Iterable) a2Var.f36874c.getValue();
                ArrayList arrayList2 = new ArrayList(ry.n.W(iterable2, 10));
                for (CourseWord courseWord5 : iterable2) {
                    if (b1Var4.getValue() != null && b1Var3.getValue() == null) {
                        CourseWord courseWord6 = (CourseWord) b1Var4.getValue();
                        courseWordCopy$default2 = (courseWord6 == null || courseWord5.getWordId() != courseWord6.getWordId()) ? CourseWord.copy$default(courseWord5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, list2.contains(Long.valueOf(courseWord5.getWordId())), false, false, false, null, null, null, null, null, null, 0, -201326593, 63, null) : CourseWord.copy$default(courseWord5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, true, false, false, false, false, null, null, null, null, null, null, 0, -67108865, 63, null);
                    } else if (b1Var4.getValue() == null || b1Var3.getValue() == null) {
                        courseWordCopy$default2 = CourseWord.copy$default(courseWord5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, list2.contains(Long.valueOf(courseWord5.getWordId())), false, false, false, null, null, null, null, null, null, 0, -201326593, 63, null);
                    } else {
                        CourseWord courseWord7 = (CourseWord) b1Var4.getValue();
                        if (courseWord7 == null || courseWord5.getWordId() != courseWord7.getWordId()) {
                            courseWordCopy$default2 = CourseWord.copy$default(courseWord5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, list2.contains(Long.valueOf(courseWord5.getWordId())), false, false, false, null, null, null, null, null, null, 0, -201326593, 63, null);
                        } else {
                            CourseWord courseWord8 = (CourseWord) b1Var4.getValue();
                            courseWordCopy$default2 = CourseWord.copy$default(courseWord5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, true, ry.m.i0(list2, courseWord8 != null ? Long.valueOf(courseWord8.getWordId()) : null), false, false, false, null, null, null, null, null, null, 0, -201326593, 63, null);
                        }
                    }
                    arrayList2.add(courseWordCopy$default2);
                }
                return arrayList2;
        }
    }
}
