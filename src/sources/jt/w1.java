package jt;

import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class w1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2 f37244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CourseWord f37245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(a2 a2Var, CourseWord courseWord, vy.d dVar, int i11) {
        super(2, dVar);
        this.f37242a = i11;
        this.f37244c = a2Var;
        this.f37245d = courseWord;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f37242a) {
            case 0:
                return new w1(this.f37244c, dVar);
            case 1:
                return new w1(this.f37244c, this.f37245d, dVar, 1);
            default:
                return new w1(this.f37244c, this.f37245d, dVar, 2);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f37242a) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((w1) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        CourseWord courseWord;
        sy.a aVar;
        switch (this.f37242a) {
            case 0:
                a2 a2Var = this.f37244c;
                x1.p pVar = a2Var.f36875d;
                l1.b1 b1Var = a2Var.f36878g;
                l1.b1 b1Var2 = a2Var.f36879h;
                l1.b1 b1Var3 = a2Var.f36873b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f37243b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Iterator it = ((Iterable) b1Var3.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            CourseWord courseWord2 = (CourseWord) next;
                            CourseWord courseWord3 = (CourseWord) b1Var2.getValue();
                            if (courseWord3 == null || courseWord2.getWordId() != courseWord3.getWordId()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    CourseWord courseWord4 = (CourseWord) next;
                    this.f37245d = courseWord4;
                    this.f37243b = 1;
                    if (rz.e0.m(300L, this) == aVar2) {
                        return aVar2;
                    }
                    courseWord = courseWord4;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    CourseWord courseWord5 = this.f37245d;
                    com.bumptech.glide.e.F(obj);
                    courseWord = courseWord5;
                }
                a2Var.f36880i.setValue(null);
                b1Var2.setValue(null);
                b1Var.setValue(b2.f36896a);
                if (courseWord != null) {
                    if (pVar == null || !pVar.isEmpty()) {
                        ListIterator listIterator = pVar.listIterator();
                        do {
                            aVar = (sy.a) listIterator;
                            if (!aVar.hasNext()) {
                                pVar.add(CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, true, false, false, false, null, null, null, null, null, null, 0, -134217729, 63, null));
                            }
                        } while (((CourseWord) aVar.next()).getWordId() != courseWord.getWordId());
                    } else {
                        pVar.add(CourseWord.copy$default(courseWord, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, true, false, false, false, null, null, null, null, null, null, 0, -134217729, 63, null));
                    }
                }
                if (a2Var.f36876e.size() == ((List) b1Var3.getValue()).size()) {
                    b1Var.setValue(new e2(!((Boolean) a2Var.f36877f.getValue()).booleanValue()));
                    a2Var.f36872a.setValue(ht.q.SELECTED);
                }
                a2Var.f36881j.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 1:
                CourseWord courseWord6 = this.f37245d;
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f37243b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f37243b = 1;
                    if (rz.e0.m(300L, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                a2 a2Var2 = this.f37244c;
                l1.b1 b1Var4 = a2Var2.f36873b;
                Iterable<CourseWord> iterable = (Iterable) b1Var4.getValue();
                ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
                for (CourseWord courseWordCopy$default : iterable) {
                    if (courseWordCopy$default.getWordId() == courseWord6.getWordId()) {
                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -1073741825, 63, null);
                    }
                    arrayList.add(courseWordCopy$default);
                }
                b1Var4.setValue(arrayList);
                l1.b1 b1Var5 = a2Var2.f36874c;
                Iterable<CourseWord> iterable2 = (Iterable) b1Var5.getValue();
                ArrayList arrayList2 = new ArrayList(ry.n.W(iterable2, 10));
                for (CourseWord courseWordCopy$default2 : iterable2) {
                    if (courseWordCopy$default2.getWordId() == courseWord6.getWordId()) {
                        courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -1073741825, 63, null);
                    }
                    arrayList2.add(courseWordCopy$default2);
                }
                b1Var5.setValue(arrayList2);
                return qy.b0.f48488a;
            default:
                CourseWord courseWord7 = this.f37245d;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f37243b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f37243b = 1;
                    if (rz.e0.m(300L, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                a2 a2Var3 = this.f37244c;
                l1.b1 b1Var6 = a2Var3.f36873b;
                Iterable<CourseWord> iterable3 = (Iterable) b1Var6.getValue();
                ArrayList arrayList3 = new ArrayList(ry.n.W(iterable3, 10));
                for (CourseWord courseWordCopy$default3 : iterable3) {
                    if (courseWordCopy$default3.getWordId() == courseWord7.getWordId()) {
                        courseWordCopy$default3 = CourseWord.copy$default(courseWordCopy$default3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -1073741825, 63, null);
                    }
                    arrayList3.add(courseWordCopy$default3);
                }
                b1Var6.setValue(arrayList3);
                l1.b1 b1Var7 = a2Var3.f36874c;
                Iterable<CourseWord> iterable4 = (Iterable) b1Var7.getValue();
                ArrayList arrayList4 = new ArrayList(ry.n.W(iterable4, 10));
                for (CourseWord courseWordCopy$default4 : iterable4) {
                    if (courseWordCopy$default4.getWordId() == courseWord7.getWordId()) {
                        courseWordCopy$default4 = CourseWord.copy$default(courseWordCopy$default4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -1073741825, 63, null);
                    }
                    arrayList4.add(courseWordCopy$default4);
                }
                b1Var7.setValue(arrayList4);
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(a2 a2Var, vy.d dVar) {
        super(2, dVar);
        this.f37242a = 0;
        this.f37244c = a2Var;
    }
}
