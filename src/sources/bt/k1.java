package bt;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CourseSentence f5602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ht.l f5603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.a1 f5604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(CourseSentence courseSentence, ht.l lVar, l1.a1 a1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5601a = i11;
        this.f5602b = courseSentence;
        this.f5603c = lVar;
        this.f5604d = a1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5601a) {
            case 0:
                return new k1(this.f5602b, this.f5603c, this.f5604d, dVar, 0);
            default:
                return new k1(this.f5602b, this.f5603c, this.f5604d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5601a) {
            case 0:
                k1 k1Var = (k1) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                k1Var.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                k1 k1Var2 = (k1) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                k1Var2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5601a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.a1 a1Var = this.f5604d;
        ht.l lVar = this.f5603c;
        CourseSentence courseSentence = this.f5602b;
        int i12 = 0;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                int i13 = 0;
                for (Object obj2 : courseSentence.getDisplayCourseWords()) {
                    int i14 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    if (((CourseWord) obj2).getWordType() == 1) {
                        xy.f.a(i13);
                        i13++;
                    } else if (i12 - i13 <= lVar.a()) {
                        ((l1.h1) a1Var).m(i12);
                    }
                    i12 = i14;
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                int i15 = 0;
                for (Object obj3 : courseSentence.getDisplayCourseWords()) {
                    int i16 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    CourseWord courseWord = (CourseWord) obj3;
                    courseWord.getWord();
                    if (courseWord.getWordType() == 1) {
                        xy.f.a(i15);
                        i15++;
                    } else if (i12 - i15 <= lVar.a()) {
                        int i17 = s5.f5993u;
                        ((l1.h1) a1Var).m(i12);
                    }
                    i12 = i16;
                }
                return b0Var;
        }
    }
}
