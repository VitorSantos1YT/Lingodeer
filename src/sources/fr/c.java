package fr;

import androidx.lifecycle.LiveDataScope;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.api.Service;
import com.lingo.fluent.ui.base.adapter.PdFavAdapter;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.lingoskill.object.PdLessonFav;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import h1.p8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f27425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f27426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f27427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f27423a = i11;
        this.f27426d = obj;
        this.f27427e = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x0192  */
    /* JADX WARN: Code duplicated, block: B:63:0x019f  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0218  */
    /* JADX WARN: Code duplicated, block: B:70:0x0220  */
    /* JADX WARN: Code duplicated, block: B:72:0x022a  */
    /* JADX WARN: Code duplicated, block: B:74:0x023e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0297  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x02f4 A[SYNTHETIC] */
    private final Object e(Object obj) throws Throwable {
        kotlin.jvm.internal.y yVar;
        CourseSentence courseSentence;
        Throwable th2;
        boolean z11;
        Object objF;
        CourseSentence courseSentence2;
        boolean z12;
        l1.b1 b1Var;
        int i11;
        ArrayList arrayListG;
        ArrayList arrayList;
        int i12;
        ArrayList arrayList2;
        int i13;
        CourseWord courseWordCopy$default;
        jt.q1 q1Var = (jt.q1) this.f27425c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i14 = this.f27424b;
        if (i14 == 0) {
            com.bumptech.glide.e.F(obj);
            yVar = new kotlin.jvm.internal.y();
            yVar.f38361a = ht.q.CORRECT;
            boolean z13 = q1Var.f37123a;
            int i15 = q1Var.f37126d;
            l1.b1 b1Var2 = q1Var.f37131i;
            courseSentence = z13 ? q1Var.f37125c : q1Var.f37124b;
            Iterable iterable = (Iterable) b1Var2.getValue();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : iterable) {
                if (!kotlin.jvm.internal.m.a(((CourseWord) obj2).getWord(), " ")) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            int i16 = 0;
            int i17 = 0;
            while (i17 < size) {
                Object obj3 = arrayList3.get(i17);
                i17++;
                int i18 = i16 + 1;
                if (i16 < 0) {
                    ns.o.V();
                    throw null;
                }
                CourseWord courseWord = (CourseWord) obj3;
                List<CourseWord> courseWords = courseSentence.getCourseWords();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : courseWords) {
                    if (!kotlin.jvm.internal.m.a(((CourseWord) obj4).getWord(), " ")) {
                        arrayList4.add(obj4);
                    }
                }
                if (!o00.a.z(i15, courseWord.getWord(), ((CourseWord) arrayList4.get(i16)).getWord())) {
                    yVar.f38361a = ht.q.WRONG;
                }
                i16 = i18;
            }
            th2 = null;
            if (yVar.f38361a != ht.q.CORRECT) {
                q1Var.f37128f.setValue(ht.q.CHECKING);
                String strU = se.k.u(" ", courseSentence.getCourseWords());
                String strU2 = se.k.u(" ", (List) b1Var2.getValue());
                List<CourseWord> courseWords2 = courseSentence.getCourseWords();
                ArrayList arrayList5 = new ArrayList(ry.n.W(courseWords2, 10));
                Iterator<T> it = courseWords2.iterator();
                while (it.hasNext()) {
                    arrayList5.add(((CourseWord) it.next()).getWord());
                }
                List listK = ns.o.K(arrayList5);
                Iterable iterable2 = (Iterable) b1Var2.getValue();
                ArrayList arrayList6 = new ArrayList(ry.n.W(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(((CourseWord) it2.next()).getWord());
                }
                String translation = courseSentence.getTranslation();
                if (!o00.a.w(i15, strU2, strU)) {
                    jt.r1 r1Var = q1Var.f37133k;
                    this.f27426d = yVar;
                    this.f27427e = courseSentence;
                    z11 = true;
                    this.f27424b = 1;
                    objF = r1Var.f(listK, arrayList6, translation, this);
                    if (objF == aVar) {
                        return aVar;
                    }
                    courseSentence2 = courseSentence;
                }
                b1Var = q1Var.f37131i;
                i11 = q1Var.f37126d;
                if (yVar.f38361a == ht.q.CORRECT) {
                    Iterable<CourseWord> iterable3 = (Iterable) b1Var.getValue();
                    arrayList2 = new ArrayList(ry.n.W(iterable3, 10));
                    for (CourseWord courseWordCopy$default2 : iterable3) {
                        if (courseWordCopy$default2.isQuestionWord()) {
                            courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                        }
                        arrayList2.add(courseWordCopy$default2);
                    }
                } else {
                    arrayListG = c.a.G(i11, courseSentence.getCourseWords());
                    Iterable iterable4 = (Iterable) q1Var.f37131i.getValue();
                    arrayList = new ArrayList(ry.n.W(iterable4, 10));
                    i12 = 0;
                    for (Object obj5 : iterable4) {
                        i13 = i12 + 1;
                        if (i12 < 0) {
                            ns.o.V();
                            throw th2;
                        }
                        courseWordCopy$default = (CourseWord) obj5;
                        if (courseWordCopy$default.isQuestionWord()) {
                            if (o00.a.z(i11, courseWordCopy$default.getWord(), ((CourseWord) arrayListG.get(i12)).getWord())) {
                                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                            } else {
                                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                            }
                        }
                        arrayList.add(courseWordCopy$default);
                        i12 = i13;
                    }
                    arrayList2 = arrayList;
                }
                b1Var.setValue(arrayList2);
                q1Var.f37130h.setValue(Boolean.valueOf(z12));
                q1Var.f37128f.setValue(yVar.f38361a);
                return qy.b0.f48488a;
            }
            z12 = false;
            b1Var = q1Var.f37131i;
            i11 = q1Var.f37126d;
            if (yVar.f38361a == ht.q.CORRECT) {
                Iterable<CourseWord> iterable5 = (Iterable) b1Var.getValue();
                arrayList2 = new ArrayList(ry.n.W(iterable5, 10));
                while (r4.hasNext()) {
                    if (courseWordCopy$default2.isQuestionWord()) {
                        courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                    }
                    arrayList2.add(courseWordCopy$default2);
                }
            } else {
                arrayListG = c.a.G(i11, courseSentence.getCourseWords());
                Iterable iterable6 = (Iterable) q1Var.f37131i.getValue();
                arrayList = new ArrayList(ry.n.W(iterable6, 10));
                i12 = 0;
                while (r5.hasNext()) {
                    i13 = i12 + 1;
                    if (i12 < 0) {
                        ns.o.V();
                        throw th2;
                    }
                    courseWordCopy$default = (CourseWord) obj5;
                    if (courseWordCopy$default.isQuestionWord()) {
                        if (o00.a.z(i11, courseWordCopy$default.getWord(), ((CourseWord) arrayListG.get(i12)).getWord())) {
                            courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                        } else {
                            courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                        }
                    }
                    arrayList.add(courseWordCopy$default);
                    i12 = i13;
                }
                arrayList2 = arrayList;
            }
            b1Var.setValue(arrayList2);
            q1Var.f37130h.setValue(Boolean.valueOf(z12));
            q1Var.f37128f.setValue(yVar.f38361a);
            return qy.b0.f48488a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        courseSentence2 = (CourseSentence) this.f27427e;
        yVar = (kotlin.jvm.internal.y) this.f27426d;
        com.bumptech.glide.e.F(obj);
        objF = obj;
        z11 = true;
        th2 = null;
        if (((Boolean) objF).booleanValue()) {
            yVar.f38361a = ht.q.CORRECT;
            courseSentence = courseSentence2;
            z12 = z11;
        } else {
            courseSentence = courseSentence2;
            z12 = false;
        }
        b1Var = q1Var.f37131i;
        i11 = q1Var.f37126d;
        if (yVar.f38361a == ht.q.CORRECT) {
            Iterable<CourseWord> iterable7 = (Iterable) b1Var.getValue();
            arrayList2 = new ArrayList(ry.n.W(iterable7, 10));
            while (r4.hasNext()) {
                if (courseWordCopy$default2.isQuestionWord()) {
                    courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                }
                arrayList2.add(courseWordCopy$default2);
            }
        } else {
            arrayListG = c.a.G(i11, courseSentence.getCourseWords());
            Iterable iterable8 = (Iterable) q1Var.f37131i.getValue();
            arrayList = new ArrayList(ry.n.W(iterable8, 10));
            i12 = 0;
            while (r5.hasNext()) {
                i13 = i12 + 1;
                if (i12 < 0) {
                    ns.o.V();
                    throw th2;
                }
                courseWordCopy$default = (CourseWord) obj5;
                if (courseWordCopy$default.isQuestionWord()) {
                    if (o00.a.z(i11, courseWordCopy$default.getWord(), ((CourseWord) arrayListG.get(i12)).getWord())) {
                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.CORRECT, null, null, 0, -1, 59, null);
                    } else {
                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.WRONG, null, null, 0, -1, 59, null);
                    }
                }
                arrayList.add(courseWordCopy$default);
                i12 = i13;
            }
            arrayList2 = arrayList;
        }
        b1Var.setValue(arrayList2);
        q1Var.f37130h.setValue(Boolean.valueOf(z12));
        q1Var.f37128f.setValue(yVar.f38361a);
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f27425c
            uz.j r0 = (uz.j) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r7.f27424b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            com.bumptech.glide.e.F(r8)
            goto L4c
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r0 = r7.f27426d
            uz.j r0 = (uz.j) r0
            com.bumptech.glide.e.F(r8)
            goto L3f
        L25:
            com.bumptech.glide.e.F(r8)
            java.lang.Object r8 = r7.f27427e
            kr.b r8 = (kr.b) r8
            wt.o0 r2 = r8.f38418a
            com.lingodeer.data.model.CoursePracticeType r8 = r8.f38422e
            r7.f27425c = r5
            r7.f27426d = r0
            r7.f27424b = r4
            r4 = 0
            r6 = 6
            java.lang.Object r8 = wt.o0.b(r2, r8, r4, r7, r6)
            if (r8 != r1) goto L3f
            goto L4b
        L3f:
            r7.f27425c = r5
            r7.f27426d = r5
            r7.f27424b = r3
            java.lang.Object r8 = r0.emit(r8, r7)
            if (r8 != r1) goto L4c
        L4b:
            return r1
        L4c:
            qy.b0 r8 = qy.b0.f48488a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.c.j(java.lang.Object):java.lang.Object");
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27423a) {
            case 0:
                c cVar = new c((i) this.f27427e, dVar, 0);
                cVar.f27425c = obj;
                return cVar;
            case 1:
                c cVar2 = new c((v1) this.f27427e, dVar, 1);
                cVar2.f27425c = obj;
                return cVar2;
            case 2:
                c cVar3 = new c(2, (v1) this.f27426d, (String) this.f27427e, dVar);
                cVar3.f27425c = obj;
                return cVar3;
            case 3:
                return new c(this.f27427e, this.f27425c, false, dVar, 3);
            case 4:
                c cVar4 = new c((x4) this.f27427e, dVar, 4);
                cVar4.f27425c = obj;
                return cVar4;
            case 5:
                return new c((l1.b1) this.f27426d, (l1.b1) this.f27427e, (l1.b1) this.f27425c, dVar, 5);
            case 6:
                return new c((fv.c) this.f27426d, (uv.b) this.f27427e, (fv.a) this.f27425c, dVar, 6);
            case 7:
                c cVar5 = new c(7, (h0.i) this.f27426d, (g1.a) this.f27427e, dVar);
                cVar5.f27425c = obj;
                return cVar5;
            case 8:
                return new c((gb.a0) this.f27426d, (fb.v) this.f27427e, (pb.o) this.f27425c, dVar, 8);
            case 9:
                return new c(this.f27427e, this.f27425c, false, dVar, 9);
            case 10:
                c cVar6 = new c((gp.c) this.f27427e, dVar, 10);
                cVar6.f27425c = obj;
                return cVar6;
            case 11:
                c cVar7 = new c((gp.b) this.f27427e, dVar, 11);
                cVar7.f27425c = obj;
                return cVar7;
            case 12:
                c cVar8 = new c(12, (h0.i) this.f27426d, (h1.k4) this.f27427e, dVar);
                cVar8.f27425c = obj;
                return cVar8;
            case 13:
                return new c((p8) this.f27426d, (d0.l1) this.f27427e, (a0.e0) this.f27425c, dVar, 13);
            case 14:
                return new c(this.f27427e, this.f27425c, false, dVar, 14);
            case 15:
                return new c(this.f27427e, this.f27425c, false, dVar, 15);
            case 16:
                return new c((fz.e) this.f27426d, this.f27425c, (rz.b0) this.f27427e, dVar);
            case 17:
                c cVar9 = new c(17, (fz.a) this.f27426d, (fz.e) this.f27427e, dVar);
                cVar9.f27425c = obj;
                return cVar9;
            case 18:
                c cVar10 = new c(18, (fz.f) this.f27426d, (ob.s) this.f27427e, dVar);
                cVar10.f27425c = obj;
                return cVar10;
            case 19:
                c cVar11 = new c(19, (fz.g) this.f27426d, (ob.s) this.f27427e, dVar);
                cVar11.f27425c = obj;
                return cVar11;
            case 20:
                return new c((PdLessonFav) this.f27426d, (PdFavAdapter) this.f27427e, (BaseViewHolder) this.f27425c, dVar, 20);
            case 21:
                return new c((PdLesson) this.f27426d, (jh.o) this.f27427e, (String) this.f27425c, dVar, 21);
            case 22:
                return new c((String) this.f27426d, (String) this.f27427e, (String) this.f27425c, dVar, 22);
            case 23:
                return new c((jt.q1) this.f27425c, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new c((b0.f1) this.f27426d, (l1.b1) this.f27427e, (l1.g1) this.f27425c, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                c cVar12 = new c(25, (fb.f) this.f27426d, (kb.f) this.f27427e, dVar);
                cVar12.f27425c = obj;
                return cVar12;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new c((ed.c) this.f27426d, (ob.p) this.f27427e, (kb.h) this.f27425c, dVar, 26);
            case 27:
                return new c(this.f27427e, this.f27425c, false, dVar, 27);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                c cVar13 = new c((kr.b) this.f27427e, dVar, 28);
                cVar13.f27425c = obj;
                return cVar13;
            default:
                c cVar14 = new c(29, (List) this.f27426d, (kr.b0) this.f27427e, dVar);
                cVar14.f27425c = obj;
                return cVar14;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f27423a) {
            case 0:
                return ((c) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((c) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((c) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((c) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((c) create((LiveDataScope) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((c) create((LiveDataScope) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((c) create((i1.o0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((c) create((qy.l) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((c) create((tz.t) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((c) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((c) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:400:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:401:0x09bf  */
    /* JADX WARN: Code duplicated, block: B:404:0x09d9  */
    /* JADX WARN: Code duplicated, block: B:422:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:425:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:427:0x0a47  */
    /* JADX WARN: Code duplicated, block: B:430:0x0a5d A[PHI: r2
      0x0a5d: PHI (r2v27 java.lang.Object) = (r2v25 java.lang.Object), (r2v31 java.lang.Object) binds: [B:428:0x0a59, B:414:0x0a03] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:436:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:439:0x0a90 A[PHI: r0
      0x0a90: PHI (r0v22 java.lang.Object) = (r0v21 java.lang.Object), (r0v27 java.lang.Object) binds: [B:437:0x0a8d, B:412:0x09f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:441:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:446:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:551:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x055f, code lost:
    
        if (r2 == r4) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0589, code lost:
    
        if (r0 == r4) goto L216;
     */
    /* JADX WARN: Type inference failed for: r3v63, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fz.e eVar, Object obj, rz.b0 b0Var, vy.d dVar) {
        super(2, dVar);
        this.f27423a = 16;
        this.f27426d = eVar;
        this.f27425c = obj;
        this.f27427e = b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27423a = i11;
        this.f27426d = obj;
        this.f27427e = obj2;
        this.f27425c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, boolean z11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27423a = i11;
        this.f27427e = obj;
        this.f27425c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f27423a = i11;
        this.f27427e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jt.q1 q1Var, vy.d dVar) {
        super(2, dVar);
        this.f27423a = 23;
        this.f27425c = q1Var;
    }
}
