package bt;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.LessonType;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import rt.vb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t5 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(Object obj, Object obj2, boolean z11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f6027a = i11;
        this.f6029c = obj;
        this.f6030d = obj2;
        this.f6028b = z11;
    }

    public static final String e(CourseWord courseWord, boolean z11) {
        if (!z11) {
            String realWord = courseWord.getRealWord();
            return realWord.length() == 0 ? courseWord.getRealZhuYin() : realWord;
        }
        String realLuoMa = courseWord.getRealLuoMa();
        if (realLuoMa.length() == 0) {
            realLuoMa = courseWord.getRealWord();
            if (realLuoMa.length() == 0) {
                return courseWord.getRealZhuYin();
            }
        }
        return realLuoMa;
    }

    public static final String j(CourseWord courseWord, boolean z11) {
        if (!z11) {
            String word = courseWord.getWord();
            return word.length() == 0 ? courseWord.getZhuYin() : word;
        }
        String luoMa = courseWord.getLuoMa();
        if (luoMa.length() == 0) {
            luoMa = courseWord.getWord();
            if (luoMa.length() == 0) {
                return courseWord.getZhuYin();
            }
        }
        return luoMa;
    }

    public static final String m(String str, boolean z11) {
        if (z11) {
            return md.a.y(md.a.x(dt.a0.x(str)));
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        return md.a.x(lowerCase);
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f6027a) {
            case 0:
                return new t5(this.f6028b, (fz.e) this.f6029c, (jt.j0) this.f6030d, dVar, 0);
            case 1:
                return new t5(this.f6028b, (fz.e) this.f6029c, (CourseSentence) this.f6030d, dVar, 1);
            case 2:
                return new t5((fz.c) this.f6029c, this.f6028b, (d0.d2) this.f6030d, dVar, 2);
            case 3:
                return new t5((List) this.f6029c, (List) this.f6030d, this.f6028b, dVar, 3);
            case 4:
                return new t5((Window) this.f6029c, (View) this.f6030d, this.f6028b, dVar, 4);
            case 5:
                return new t5(this.f6028b, (l1.b1) this.f6029c, (l1.b1) this.f6030d, dVar, 5);
            case 6:
                return new t5(this.f6028b, (e2.l) this.f6029c, (l1.b1) this.f6030d, dVar, 6);
            default:
                return new t5((List) this.f6029c, this.f6028b, (vt.n0) this.f6030d, dVar, 7);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f6027a) {
            case 0:
                t5 t5Var = (t5) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                t5Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                t5 t5Var2 = (t5) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                t5Var2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                t5 t5Var3 = (t5) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                t5Var3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                return ((t5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
            case 4:
                t5 t5Var4 = (t5) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                t5Var4.invokeSuspend(b0Var5);
                return b0Var5;
            case 5:
                t5 t5Var5 = (t5) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                t5Var5.invokeSuspend(b0Var6);
                return b0Var6;
            case 6:
                t5 t5Var6 = (t5) create(b0Var, dVar);
                qy.b0 b0Var7 = qy.b0.f48488a;
                t5Var6.invokeSuspend(b0Var7);
                return b0Var7;
            default:
                return ((t5) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String word;
        cf.x x1Var;
        cf.x x1Var2;
        int i11 = this.f6027a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f6030d;
        boolean z11 = this.f6028b;
        Object obj4 = this.f6029c;
        switch (i11) {
            case 0:
                jt.j0 j0Var = (jt.j0) obj3;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11) {
                    String string = j0Var.f36989a.getAudioUri().toString();
                    kotlin.jvm.internal.m.e(string, "toString(...)");
                    ((fz.e) obj4).invoke(string, new ht.f(j0Var.f36989a.getVisemedMap()));
                }
                return b0Var;
            case 1:
                CourseSentence courseSentence = (CourseSentence) obj3;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11) {
                    String string2 = courseSentence.getAudioUri().toString();
                    kotlin.jvm.internal.m.e(string2, "toString(...)");
                    ((fz.e) obj4).invoke(string2, new ht.c(courseSentence.getVisemedMap()));
                }
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((fz.c) obj4).invoke(new Integer(z11 ? ((d0.d2) obj3).f22659a.l() : 0));
                return b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : (List) obj4) {
                    List<CourseWord> displayCharWords = ((CourseWord) obj5).getDisplayCharWords();
                    if (displayCharWords == null || !displayCharWords.isEmpty()) {
                        Iterator<T> it = displayCharWords.iterator();
                        while (it.hasNext()) {
                            if (((CourseWord) it.next()).isQuestionWord()) {
                                arrayList.add(obj5);
                            }
                            break;
                        }
                    }
                }
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj6 = arrayList.get(i12);
                    i12++;
                    CourseWord courseWord = (CourseWord) obj6;
                    List<CourseWord> displayCharWords2 = courseWord.getDisplayCharWords();
                    if (displayCharWords2 == null || !displayCharWords2.isEmpty()) {
                        Iterator<T> it2 = displayCharWords2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (kotlin.jvm.internal.m.a(((CourseWord) it2.next()).getWord(), "_")) {
                                }
                            }
                        }
                    }
                    if (!m(ry.m.y0(courseWord.getDisplayCharWords(), BuildConfig.VERSION_NAME, null, null, new jt.n1(z11, 0), 30), z11).equals(m(ry.m.y0(courseWord.getDisplayCharWords(), BuildConfig.VERSION_NAME, null, null, new jt.n1(z11, 1), 30), z11))) {
                        return new qy.l(new Integer(-1), null);
                    }
                }
                int size2 = arrayList.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size2) {
                        obj2 = arrayList.get(i13);
                        i13++;
                        List<CourseWord> displayCharWords3 = ((CourseWord) obj2).getDisplayCharWords();
                        if (displayCharWords3 == null || !displayCharWords3.isEmpty()) {
                            Iterator<T> it3 = displayCharWords3.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    continue;
                                } else if (kotlin.jvm.internal.m.a(((CourseWord) it3.next()).getWord(), "_")) {
                                }
                            }
                        }
                    } else {
                        obj2 = null;
                    }
                }
                CourseWord courseWord2 = (CourseWord) obj2;
                if (courseWord2 == null) {
                    return new qy.l(new Integer(-1), null);
                }
                Iterator<CourseWord> it4 = courseWord2.getDisplayCharWords().iterator();
                int i14 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i14 = -1;
                    } else if (!kotlin.jvm.internal.m.a(it4.next().getWord(), "_")) {
                        i14++;
                    }
                }
                if (i14 == -1) {
                    return new qy.l(new Integer(-1), null);
                }
                if (!oz.x.s0(m(ry.m.y0(ry.m.U0(courseWord2.getDisplayCharWords(), i14 + 1), BuildConfig.VERSION_NAME, null, null, new jt.n1(z11, 2), 30), z11), m(ry.m.y0(ry.m.U0(courseWord2.getDisplayCharWords(), i14), BuildConfig.VERSION_NAME, null, null, new jt.n1(z11, 3), 30), z11), false)) {
                    return new qy.l(new Integer(-1), null);
                }
                String strE = e(courseWord2.getDisplayCharWords().get(i14), z11);
                String strM = m(strE, z11);
                qy.l lVar = null;
                int i15 = 0;
                qy.l lVar2 = null;
                for (Object obj7 : (List) obj3) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    CourseWord courseWord3 = (CourseWord) obj7;
                    if (courseWord3.getSelectedState() == OptionItemSelectedState.DEFAULT) {
                        if (z11) {
                            word = courseWord3.getLuoMa();
                            if (word.length() == 0) {
                                word = courseWord3.getWord();
                                if (word.length() == 0) {
                                    word = courseWord3.getZhuYin();
                                }
                            }
                        } else {
                            word = courseWord3.getWord();
                            if (word.length() == 0) {
                                word = courseWord3.getZhuYin();
                            }
                        }
                        String strM2 = m(word, z11);
                        if (word.equals(strE)) {
                            lVar2 = new qy.l(new Integer(i15), courseWord3);
                        } else if (lVar == null && strM2.equals(strM)) {
                            lVar = new qy.l(new Integer(i15), courseWord3);
                        }
                    }
                    i15 = i16;
                }
                if (lVar2 == null) {
                    return lVar == null ? new qy.l(new Integer(-1), null) : lVar;
                }
                return lVar2;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Window window = (Window) obj4;
                View view = (View) obj3;
                tp.g gVar = new tp.g(view);
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 35) {
                    x1Var = new z4.a2(window, gVar);
                } else if (i17 >= 30) {
                    x1Var = new z4.y1(window, gVar);
                } else {
                    x1Var = i17 >= 26 ? new z4.x1(window, gVar) : new z4.w1(window, gVar);
                }
                boolean z12 = !z11;
                x1Var.K(z12);
                tp.g gVar2 = new tp.g(view);
                int i18 = Build.VERSION.SDK_INT;
                if (i18 >= 35) {
                    x1Var2 = new z4.a2(window, gVar2);
                } else if (i18 >= 30) {
                    x1Var2 = new z4.y1(window, gVar2);
                } else {
                    x1Var2 = i18 >= 26 ? new z4.x1(window, gVar2) : new z4.w1(window, gVar2);
                }
                x1Var2.J(z12);
                return b0Var;
            case 5:
                l1.b1 b1Var = (l1.b1) obj3;
                l1.b1 b1Var2 = (l1.b1) obj4;
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (z11) {
                    List list = (List) b1Var2.getValue();
                    ArrayList arrayList2 = new ArrayList(ry.n.W(list, 10));
                    int i19 = 0;
                    for (Object obj8 : list) {
                        int i21 = i19 + 1;
                        if (i19 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        arrayList2.add(rt.m2.a((rt.m2) obj8, false));
                        i19 = i21;
                    }
                    b1Var2.setValue(arrayList2);
                    b1Var.setValue(ry.r.f50854a);
                } else {
                    List list2 = (List) b1Var2.getValue();
                    ArrayList arrayList3 = new ArrayList(ry.n.W(list2, 10));
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(rt.m2.a((rt.m2) it5.next(), true));
                    }
                    b1Var2.setValue(arrayList3);
                    b1Var.setValue((List) b1Var2.getValue());
                }
                return b0Var;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1.b1 b1Var3 = (l1.b1) obj3;
                float f5 = mt.v1.f41978a;
                if (((Boolean) b1Var3.getValue()).booleanValue() && !z11) {
                    e2.l.a((e2.l) obj4);
                }
                b1Var3.setValue(Boolean.valueOf(z11));
                return b0Var;
            default:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj9 : (List) obj4) {
                    if (((CourseLesson) obj9).getLessonType() == LessonType.TypeLesson) {
                        arrayList4.add(obj9);
                    }
                }
                vt.n0 n0Var = (vt.n0) obj3;
                ArrayList arrayList5 = new ArrayList(ry.n.W(arrayList4, 10));
                int size3 = arrayList4.size();
                int i22 = 0;
                while (i22 < size3) {
                    Object obj10 = arrayList4.get(i22);
                    i22++;
                    CourseLesson courseLesson = (CourseLesson) obj10;
                    arrayList5.add(CourseLesson.copy$default(courseLesson, 0L, null, null, 0, null, null, null, null, null, null, null, 0L, null, 0, false, z11 || vb.e(n0Var, courseLesson.getUnitSortIndex()), z11 || vb.e(n0Var, courseLesson.getUnitSortIndex()), null, false, false, false, 0, null, null, null, 33456127, null));
                }
                return arrayList5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(Object obj, boolean z11, Object obj2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f6027a = i11;
        this.f6029c = obj;
        this.f6028b = z11;
        this.f6030d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(boolean z11, Object obj, Object obj2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f6027a = i11;
        this.f6028b = z11;
        this.f6029c = obj;
        this.f6030d = obj2;
    }
}
