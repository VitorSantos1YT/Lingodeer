package jt;

import com.lingodeer.data.model.CourseWord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1.b1 f36872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.b1 f36873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.b1 f36874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x1.p f36875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f36876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l1.b1 f36877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l1.b1 f36878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l1.b1 f36879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l1.b1 f36880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l1.b1 f36881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final rz.b0 f36882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fz.c f36883l;

    public a2(l1.b1 courseTestState, l1.b1 courseCourseWordItems, l1.b1 translationCourseCourseWordItems, x1.p displayMatchedItems, List matchedItemIds, l1.b1 hasSelectedWrong, l1.b1 uiEffect, l1.b1 selectedCourseWord, l1.b1 selectedTranslationItem, l1.b1 isProcessing, rz.b0 b0Var, fz.c cVar) {
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(courseCourseWordItems, "courseCourseWordItems");
        kotlin.jvm.internal.m.f(translationCourseCourseWordItems, "translationCourseCourseWordItems");
        kotlin.jvm.internal.m.f(displayMatchedItems, "displayMatchedItems");
        kotlin.jvm.internal.m.f(matchedItemIds, "matchedItemIds");
        kotlin.jvm.internal.m.f(hasSelectedWrong, "hasSelectedWrong");
        kotlin.jvm.internal.m.f(uiEffect, "uiEffect");
        kotlin.jvm.internal.m.f(selectedCourseWord, "selectedCourseWord");
        kotlin.jvm.internal.m.f(selectedTranslationItem, "selectedTranslationItem");
        kotlin.jvm.internal.m.f(isProcessing, "isProcessing");
        this.f36872a = courseTestState;
        this.f36873b = courseCourseWordItems;
        this.f36874c = translationCourseCourseWordItems;
        this.f36875d = displayMatchedItems;
        this.f36876e = matchedItemIds;
        this.f36877f = hasSelectedWrong;
        this.f36878g = uiEffect;
        this.f36879h = selectedCourseWord;
        this.f36880i = selectedTranslationItem;
        this.f36881j = isProcessing;
        this.f36882k = b0Var;
        this.f36883l = cVar;
    }

    public final void a(CourseWord courseWord, boolean z11) {
        if (!courseWord.isMatched()) {
            if (((Boolean) this.f36881j.getValue()).booleanValue()) {
                return;
            }
            this.f36879h.setValue(courseWord);
            return;
        }
        String string = courseWord.getAudioUri().toString();
        kotlin.jvm.internal.m.e(string, "toString(...)");
        this.f36883l.invoke(string);
        if (z11) {
            return;
        }
        l1.b1 b1Var = this.f36873b;
        Iterable<CourseWord> iterable = (Iterable) b1Var.getValue();
        ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
        for (CourseWord courseWordCopy$default : iterable) {
            if (courseWordCopy$default.getWordId() == courseWord.getWordId()) {
                courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, true, null, null, null, null, null, null, 0, -1073741825, 63, null);
            }
            arrayList.add(courseWordCopy$default);
        }
        b1Var.setValue(arrayList);
        l1.b1 b1Var2 = this.f36874c;
        Iterable<CourseWord> iterable2 = (Iterable) b1Var2.getValue();
        ArrayList arrayList2 = new ArrayList(ry.n.W(iterable2, 10));
        for (CourseWord courseWordCopy$default2 : iterable2) {
            if (courseWordCopy$default2.getWordId() == courseWord.getWordId()) {
                courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, true, null, null, null, null, null, null, 0, -1073741825, 63, null);
            }
            arrayList2.add(courseWordCopy$default2);
        }
        b1Var2.setValue(arrayList2);
        rz.e0.B(this.f36882k, null, null, new w1(this, courseWord, null, 2), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(xy.c cVar) {
        y1 y1Var;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        if (cVar instanceof y1) {
            y1Var = (y1) cVar;
            int i11 = y1Var.f37274d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                y1Var.f37274d = i11 - Integer.MIN_VALUE;
            } else {
                y1Var = new y1(this, cVar);
            }
        } else {
            y1Var = new y1(this, cVar);
        }
        Object objM = y1Var.f37272b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = y1Var.f37274d;
        int i13 = 1;
        vy.d dVar = null;
        if (i12 != 0) {
            if (i12 == 1) {
                b1Var = y1Var.f37271a;
                com.bumptech.glide.e.F(objM);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b1Var2 = y1Var.f37271a;
                com.bumptech.glide.e.F(objM);
            }
            b1Var2.setValue(objM);
            return qy.b0.f48488a;
        }
        com.bumptech.glide.e.F(objM);
        l1.b1 b1Var3 = this.f36879h;
        int i14 = 0;
        if (b1Var3.getValue() != null) {
            l1.b1 b1Var4 = this.f36880i;
            if (b1Var4.getValue() != null) {
                l1.b1 b1Var5 = this.f36881j;
                if (!((Boolean) b1Var5.getValue()).booleanValue()) {
                    CourseWord courseWord = (CourseWord) b1Var3.getValue();
                    Long lValueOf = courseWord != null ? Long.valueOf(courseWord.getWordId()) : null;
                    CourseWord courseWord2 = (CourseWord) b1Var4.getValue();
                    boolean zA = kotlin.jvm.internal.m.a(lValueOf, courseWord2 != null ? Long.valueOf(courseWord2.getWordId()) : null);
                    rz.b0 b0Var = this.f36882k;
                    l1.b1 b1Var6 = this.f36878g;
                    if (zA) {
                        b1Var5.setValue(Boolean.TRUE);
                        CourseWord courseWord3 = (CourseWord) b1Var3.getValue();
                        b1Var6.setValue(new d2(courseWord3 != null ? Long.valueOf(courseWord3.getWordId()) : null));
                        CourseWord courseWord4 = (CourseWord) b1Var3.getValue();
                        if (courseWord4 != null) {
                            long wordId = courseWord4.getWordId();
                            Long lValueOf2 = Long.valueOf(wordId);
                            List list = this.f36876e;
                            if (!list.contains(lValueOf2)) {
                                list.add(Long.valueOf(wordId));
                            }
                        }
                        rz.e0.B(b0Var, null, null, new w1(this, null), 3);
                    } else {
                        Boolean bool = Boolean.TRUE;
                        b1Var5.setValue(bool);
                        this.f36877f.setValue(bool);
                        CourseWord courseWord5 = (CourseWord) b1Var3.getValue();
                        b1Var6.setValue(new c2(courseWord5 != null ? Long.valueOf(courseWord5.getWordId()) : null));
                        rz.e0.B(b0Var, null, null, new x1(this, dVar, i14), 3);
                    }
                }
            }
        }
        yz.f fVar = rz.o0.f50940a;
        yz.e eVar = yz.e.f58387a;
        z1 z1Var = new z1(this, dVar, i14);
        l1.b1 b1Var7 = this.f36873b;
        y1Var.f37271a = b1Var7;
        y1Var.f37274d = 1;
        objM = rz.e0.M(eVar, z1Var, y1Var);
        if (objM != aVar) {
            b1Var = b1Var7;
        }
        return aVar;
        b1Var.setValue(objM);
        yz.f fVar2 = rz.o0.f50940a;
        yz.e eVar2 = yz.e.f58387a;
        z1 z1Var2 = new z1(this, dVar, i13);
        l1.b1 b1Var8 = this.f36874c;
        y1Var.f37271a = b1Var8;
        y1Var.f37274d = 2;
        objM = rz.e0.M(eVar2, z1Var2, y1Var);
        if (objM != aVar) {
            b1Var2 = b1Var8;
            b1Var2.setValue(objM);
            return qy.b0.f48488a;
        }
        return aVar;
    }
}
