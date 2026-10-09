package et;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f25871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f25872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CourseWord f25873e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(fz.c cVar, o oVar, CourseWord courseWord, vy.d dVar, int i11) {
        super(2, dVar);
        this.f25869a = i11;
        this.f25871c = cVar;
        this.f25872d = oVar;
        this.f25873e = courseWord;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25869a) {
            case 0:
                return new f(this.f25871c, this.f25872d, this.f25873e, dVar, 0);
            case 1:
                return new f(this.f25871c, this.f25872d, this.f25873e, dVar, 1);
            default:
                return new f(this.f25871c, this.f25872d, this.f25873e, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f25869a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((f) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25869a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f25870b;
                o oVar = this.f25872d;
                fz.c cVar = this.f25871c;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    m mVar = (m) oVar;
                    CourseSentence courseSentence = mVar.f25891a;
                    ArrayList arrayList = mVar.f25892b;
                    ot.n nVar = mVar.f25893c;
                    List<CourseWord> list = nVar.f45908b;
                    ArrayList arrayList2 = new ArrayList(ry.n.W(list, 10));
                    for (CourseWord courseWordCopy$default : list) {
                        if (kotlin.jvm.internal.m.a(courseWordCopy$default, this.f25873e)) {
                            courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                        }
                        arrayList2.add(courseWordCopy$default);
                    }
                    cVar.invoke(new m(courseSentence, arrayList, ot.n.a(nVar, arrayList2)));
                    this.f25870b = 1;
                    if (rz.e0.m(300L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                m mVar2 = (m) oVar;
                CourseSentence courseSentence2 = mVar2.f25891a;
                ArrayList arrayList3 = mVar2.f25892b;
                ot.n nVar2 = mVar2.f25893c;
                List<CourseWord> list2 = nVar2.f45908b;
                ArrayList arrayList4 = new ArrayList(ry.n.W(list2, 10));
                for (CourseWord courseWordCopy$default2 : list2) {
                    if (courseWordCopy$default2.getSelectedState() == OptionItemSelectedState.WRONG) {
                        courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null);
                    }
                    arrayList4.add(courseWordCopy$default2);
                }
                cVar.invoke(new m(courseSentence2, arrayList3, ot.n.a(nVar2, arrayList4)));
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f25870b;
                o oVar2 = this.f25872d;
                fz.c cVar2 = this.f25871c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    i iVar = (i) oVar2;
                    CourseSentence courseSentence3 = iVar.f25882a;
                    ot.c cVar3 = iVar.f25883b;
                    List<CourseWord> list3 = cVar3.f45763c;
                    ArrayList arrayList5 = new ArrayList(ry.n.W(list3, 10));
                    for (CourseWord courseWordCopy$default3 : list3) {
                        if (kotlin.jvm.internal.m.a(courseWordCopy$default3, this.f25873e)) {
                            courseWordCopy$default3 = CourseWord.copy$default(courseWordCopy$default3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                        }
                        arrayList5.add(courseWordCopy$default3);
                    }
                    cVar2.invoke(new i(courseSentence3, ot.c.a(cVar3, null, arrayList5, 3)));
                    this.f25870b = 1;
                    if (rz.e0.m(300L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                i iVar2 = (i) oVar2;
                CourseSentence courseSentence4 = iVar2.f25882a;
                ot.c cVar4 = iVar2.f25883b;
                List<CourseWord> list4 = cVar4.f45763c;
                ArrayList arrayList6 = new ArrayList(ry.n.W(list4, 10));
                for (CourseWord courseWordCopy$default4 : list4) {
                    if (courseWordCopy$default4.getSelectedState() == OptionItemSelectedState.WRONG) {
                        courseWordCopy$default4 = CourseWord.copy$default(courseWordCopy$default4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null);
                    }
                    arrayList6.add(courseWordCopy$default4);
                }
                cVar2.invoke(new i(courseSentence4, ot.c.a(cVar4, null, arrayList6, 3)));
                return qy.b0.f48488a;
            default:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f25870b;
                o oVar3 = this.f25872d;
                fz.c cVar5 = this.f25871c;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    l lVar = (l) oVar3;
                    CourseSentence courseSentence5 = lVar.f25889a;
                    ot.l lVar2 = lVar.f25890b;
                    List<CourseWord> list5 = lVar2.f45881d;
                    ArrayList arrayList7 = new ArrayList(ry.n.W(list5, 10));
                    for (CourseWord courseWordCopy$default5 : list5) {
                        if (kotlin.jvm.internal.m.a(courseWordCopy$default5, this.f25873e)) {
                            courseWordCopy$default5 = CourseWord.copy$default(courseWordCopy$default5, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                        }
                        arrayList7.add(courseWordCopy$default5);
                    }
                    cVar5.invoke(new l(courseSentence5, ot.l.a(lVar2, null, arrayList7, 7)));
                    this.f25870b = 1;
                    if (rz.e0.m(300L, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                l lVar3 = (l) oVar3;
                CourseSentence courseSentence6 = lVar3.f25889a;
                ot.l lVar4 = lVar3.f25890b;
                List<CourseWord> list6 = lVar4.f45881d;
                ArrayList arrayList8 = new ArrayList(ry.n.W(list6, 10));
                for (CourseWord courseWordCopy$default6 : list6) {
                    if (courseWordCopy$default6.getSelectedState() == OptionItemSelectedState.WRONG) {
                        courseWordCopy$default6 = CourseWord.copy$default(courseWordCopy$default6, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null);
                    }
                    arrayList8.add(courseWordCopy$default6);
                }
                cVar5.invoke(new l(courseSentence6, ot.l.a(lVar4, null, arrayList8, 7)));
                return qy.b0.f48488a;
        }
    }
}
