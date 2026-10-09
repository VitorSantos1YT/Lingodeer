package iv;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import androidx.core.content.FileProvider;
import androidx.glance.session.SessionWorker;
import androidx.lifecycle.ViewModelKt;
import com.google.api.Service;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingo.lingoskill.object.PdLesson;
import com.lingo.switchlanguage.ui.SwitchLanguageActivity;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.skydoves.cloudy.internals.render.RenderScriptToolkit;
import com.yalantis.ucrop.view.CropImageView;
import i0.pKy.shrCcjmOhAmRC;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import jt.a2;
import jt.m1;
import jt.x1;
import l1.b3;
import mt.l5;
import mt.n1;
import rt.b5;
import rt.f8;
import rt.g8;
import rt.ke;
import rt.o1;
import rt.q2;
import rt.se;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f34742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f34741a = i11;
        this.f34742b = obj;
        this.f34743c = obj2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f34741a) {
            case 0:
                return new h0(0, (mv.n) this.f34742b, (kv.i0) this.f34743c, dVar);
            case 1:
                return new h0(1, (kr.d0) this.f34742b, (fz.a) this.f34743c, dVar);
            case 2:
                return new h0(2, (String) this.f34742b, (String) this.f34743c, dVar);
            case 3:
                return new h0(3, (jt.j0) this.f34742b, (CourseSentence) this.f34743c, dVar);
            case 4:
                return new h0(4, (jt.k0) this.f34742b, (CourseWord) this.f34743c, dVar);
            case 5:
                return new h0(5, (jt.l0) this.f34742b, (CourseWord) this.f34743c, dVar);
            case 6:
                return new h0(6, (jt.s0) this.f34742b, (CourseWord) this.f34743c, dVar);
            case 7:
                return new h0(7, (jt.s0) this.f34742b, (List) this.f34743c, dVar);
            case 8:
                return new h0(8, (m1) this.f34742b, (ArrayList) this.f34743c, dVar);
            case 9:
                return new h0(9, (CourseWord) this.f34742b, (List) this.f34743c, dVar);
            case 10:
                return new h0(10, (rz.b0) this.f34742b, (a2) this.f34743c, dVar);
            case 11:
                return new h0(11, (Bitmap) this.f34742b, (Bitmap) this.f34743c, dVar);
            case 12:
                return new h0(12, (kr.z0) this.f34742b, (List) this.f34743c, dVar);
            case 13:
                return new h0(13, (kr.r0) this.f34742b, (kr.z0) this.f34743c, dVar);
            case 14:
                return new h0(14, (kr.d1) this.f34742b, (kotlin.jvm.internal.w) this.f34743c, dVar);
            case 15:
                return new h0(15, (Context) this.f34742b, (Bitmap) this.f34743c, dVar);
            case 16:
                return new h0(16, (SwitchLanguageActivity) this.f34742b, (l1.b1) this.f34743c, dVar);
            case 17:
                h0 h0Var = new h0((SessionWorker) this.f34743c, dVar, 17);
                h0Var.f34742b = obj;
                return h0Var;
            case 18:
                return new h0(18, (rt.x) this.f34742b, (l1.b1) this.f34743c, dVar);
            case 19:
                return new h0(19, (rt.a2) this.f34742b, (List) this.f34743c, dVar);
            case 20:
                return new h0(20, (b3) this.f34742b, (l1.a1) this.f34743c, dVar);
            case 21:
                return new h0(21, (q2) this.f34742b, (fz.a) this.f34743c, dVar);
            case 22:
                return new h0(22, (b5) this.f34742b, (l1.b1) this.f34743c, dVar);
            case 23:
                return new h0(23, (f8) this.f34742b, (l1.b1) this.f34743c, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new h0(24, (g8) this.f34742b, (l1.b1) this.f34743c, dVar);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                h0 h0Var2 = new h0((mu.x) this.f34743c, dVar, 25);
                h0Var2.f34742b = obj;
                return h0Var2;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new h0(26, (Collection) this.f34742b, (Collection) this.f34743c, dVar);
            case 27:
                h0 h0Var3 = new h0((n5.x0) this.f34743c, dVar, 27);
                h0Var3.f34742b = obj;
                return h0Var3;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new h0(28, (ph.s) this.f34742b, (PdLesson) this.f34743c, dVar);
            default:
                return new h0(29, (tq.d) this.f34742b, (o0.b) this.f34743c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        switch (this.f34741a) {
            case 0:
                h0 h0Var = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                h0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                h0 h0Var2 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                h0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                h0 h0Var3 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                h0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                h0 h0Var4 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                h0Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                h0 h0Var5 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var5 = qy.b0.f48488a;
                h0Var5.invokeSuspend(b0Var5);
                return b0Var5;
            case 5:
                h0 h0Var6 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var6 = qy.b0.f48488a;
                h0Var6.invokeSuspend(b0Var6);
                return b0Var6;
            case 6:
                h0 h0Var7 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var7 = qy.b0.f48488a;
                h0Var7.invokeSuspend(b0Var7);
                return b0Var7;
            case 7:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                h0 h0Var8 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var8 = qy.b0.f48488a;
                h0Var8.invokeSuspend(b0Var8);
                return b0Var8;
            case 11:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                h0 h0Var9 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var9 = qy.b0.f48488a;
                h0Var9.invokeSuspend(b0Var9);
                return b0Var9;
            case 13:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                h0 h0Var10 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var10 = qy.b0.f48488a;
                h0Var10.invokeSuspend(b0Var10);
                return b0Var10;
            case 17:
                return ((h0) create((m6.l) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                h0 h0Var11 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var11 = qy.b0.f48488a;
                h0Var11.invokeSuspend(b0Var11);
                return b0Var11;
            case 19:
                h0 h0Var12 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var12 = qy.b0.f48488a;
                h0Var12.invokeSuspend(b0Var12);
                return b0Var12;
            case 20:
                h0 h0Var13 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var13 = qy.b0.f48488a;
                h0Var13.invokeSuspend(b0Var13);
                return b0Var13;
            case 21:
                h0 h0Var14 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var14 = qy.b0.f48488a;
                h0Var14.invokeSuspend(b0Var14);
                return b0Var14;
            case 22:
                h0 h0Var15 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var15 = qy.b0.f48488a;
                h0Var15.invokeSuspend(b0Var15);
                return b0Var15;
            case 23:
                h0 h0Var16 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var16 = qy.b0.f48488a;
                h0Var16.invokeSuspend(b0Var16);
                return b0Var16;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                h0 h0Var17 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var17 = qy.b0.f48488a;
                h0Var17.invokeSuspend(b0Var17);
                return b0Var17;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                h0 h0Var18 = (h0) create((tt.b) obj, (vy.d) obj2);
                qy.b0 b0Var18 = qy.b0.f48488a;
                h0Var18.invokeSuspend(b0Var18);
                return b0Var18;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((h0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((h0) create((n5.x0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                h0 h0Var19 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var19 = qy.b0.f48488a;
                h0Var19.invokeSuspend(b0Var19);
                return b0Var19;
            default:
                h0 h0Var20 = (h0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var20 = qy.b0.f48488a;
                h0Var20.invokeSuspend(b0Var20);
                return b0Var20;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f34741a = i11;
        this.f34743c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Iterator it;
        int i11;
        int i12;
        CourseWord courseWordCopy$default;
        String strValueOf;
        Object value;
        Object value2;
        Object obj2;
        Object value3;
        fv.a aVar;
        int i13 = this.f34741a;
        int i14 = 0;
        z = false;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj3 = this.f34743c;
        switch (i13) {
            case 0:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                mv.n nVar = (mv.n) this.f34742b;
                nVar.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(nVar), null, null, new kb.e(17, nVar, (kv.i0) obj3, null == true ? 1 : 0), 3);
                return b0Var;
            case 1:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!((kr.d0) this.f34742b).f38452n) {
                    ((fz.a) obj3).invoke();
                }
                return b0Var;
            case 2:
                String str = (String) obj3;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                String str2 = (String) this.f34742b;
                if (new File(str2).exists()) {
                    new File(str2).delete();
                }
                if (new File(str).exists()) {
                    new File(str).delete();
                }
                return b0Var;
            case 3:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                jt.j0 j0Var = (jt.j0) this.f34742b;
                l1.b1 b1Var = j0Var.f36994f;
                Iterable<CourseSentence> iterable = (Iterable) b1Var.getValue();
                CourseSentence courseSentence = (CourseSentence) obj3;
                ArrayList arrayList = new ArrayList(ry.n.W(iterable, 10));
                for (CourseSentence courseSentence2 : iterable) {
                    arrayList.add(courseSentence2.getSentenceId() == courseSentence.getSentenceId() ? CourseSentence.copy$default(courseSentence2, 0L, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, OptionItemSelectedState.SELECTED, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8257535, null) : CourseSentence.copy$default(courseSentence2, 0L, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, OptionItemSelectedState.DEFAULT, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8257535, null));
                }
                b1Var.setValue(arrayList);
                j0Var.f36992d.setValue(ht.q.SELECTED);
                return b0Var;
            case 4:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                jt.k0 k0Var = (jt.k0) this.f34742b;
                l1.b1 b1Var2 = k0Var.f37007f;
                Iterable<CourseWord> iterable2 = (Iterable) b1Var2.getValue();
                CourseWord courseWord = (CourseWord) obj3;
                ArrayList arrayList2 = new ArrayList(ry.n.W(iterable2, 10));
                for (CourseWord courseWord2 : iterable2) {
                    arrayList2.add(kotlin.jvm.internal.m.a(courseWord2, courseWord) ? CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null));
                }
                b1Var2.setValue(arrayList2);
                k0Var.f37005d.setValue(ht.q.SELECTED);
                return b0Var;
            case 5:
                int i18 = 0;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                jt.l0 l0Var = (jt.l0) this.f34742b;
                l1.b1 b1Var3 = l0Var.f37030h;
                l1.b1 b1Var4 = l0Var.f37029g;
                Iterable<CourseWord> iterable3 = (Iterable) b1Var3.getValue();
                CourseWord courseWord3 = (CourseWord) obj3;
                ArrayList arrayList3 = new ArrayList(ry.n.W(iterable3, 10));
                for (CourseWord courseWord4 : iterable3) {
                    arrayList3.add(kotlin.jvm.internal.m.a(courseWord4, courseWord3) ? CourseWord.copy$default(courseWord4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -1, 59, null) : CourseWord.copy$default(courseWord4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.DEFAULT, null, null, 0, -1, 59, null));
                }
                b1Var3.setValue(arrayList3);
                Iterable<CourseWord> iterable4 = (Iterable) b1Var4.getValue();
                ArrayList arrayList4 = new ArrayList(ry.n.W(iterable4, 10));
                for (CourseWord courseWordCopy$default2 : iterable4) {
                    if (courseWordCopy$default2.isQuestionWord()) {
                        courseWordCopy$default2 = CourseWord.copy$default(courseWordCopy$default2, 0L, courseWord3.getWord(), courseWord3.getZhuYin(), courseWord3.getLuoMa(), null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, 0, -15, 63, null);
                    }
                    arrayList4.add(courseWordCopy$default2);
                }
                b1Var4.setValue(arrayList4);
                Iterable iterable5 = (Iterable) b1Var4.getValue();
                ArrayList arrayList5 = new ArrayList(ry.n.W(iterable5, 10));
                for (Object obj4 : iterable5) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    arrayList5.add(c.a.f((CourseWord) obj4, (List) b1Var4.getValue(), i18, l0Var.f37026d));
                    i18 = i19;
                }
                b1Var4.setValue(arrayList5);
                l0Var.f37027e.setValue(ht.q.SELECTED);
                return b0Var;
            case 6:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                jt.s0 s0Var = (jt.s0) this.f34742b;
                l1.b1 b1Var5 = s0Var.f37173q;
                Iterable iterable6 = (Iterable) b1Var5.getValue();
                CourseWord courseWord5 = (CourseWord) obj3;
                ArrayList arrayList6 = new ArrayList(ry.n.W(iterable6, 10));
                for (Iterator it2 = iterable6.iterator(); it2.hasNext(); it2 = it) {
                    CourseWord courseWord6 = (CourseWord) it2.next();
                    if (kotlin.jvm.internal.m.a(courseWord6, courseWord5)) {
                        String str3 = s0Var.f37158a;
                        x1.p pVar = s0Var.f37172p;
                        if (ks.b.e(String.valueOf(oz.q.L0(str3))) && pVar.isEmpty()) {
                            OptionItemSelectedState optionItemSelectedState = OptionItemSelectedState.SELECTED;
                            String originalWord = courseWord6.getOriginalWord();
                            if (originalWord.length() > 0) {
                                StringBuilder sb2 = new StringBuilder();
                                char cCharAt = originalWord.charAt(i14);
                                if (Character.isLowerCase(cCharAt)) {
                                    String strValueOf2 = String.valueOf(cCharAt);
                                    kotlin.jvm.internal.m.d(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                                    Locale locale = Locale.ROOT;
                                    strValueOf = strValueOf2.toUpperCase(locale);
                                    kotlin.jvm.internal.m.e(strValueOf, shrCcjmOhAmRC.ssrqeHuF);
                                    it = it2;
                                    if (strValueOf.length() <= 1) {
                                        i12 = 0;
                                        strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                                    } else if (cCharAt == 329) {
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                        char cCharAt2 = strValueOf.charAt(0);
                                        String strSubstring = strValueOf.substring(1);
                                        kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                                        String lowerCase = strSubstring.toLowerCase(locale);
                                        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                        strValueOf = cCharAt2 + lowerCase;
                                    }
                                } else {
                                    it = it2;
                                    i12 = i14;
                                    strValueOf = String.valueOf(cCharAt);
                                }
                                sb2.append((Object) strValueOf);
                                i11 = 1;
                                String strSubstring2 = originalWord.substring(1);
                                kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                                sb2.append(strSubstring2);
                                originalWord = sb2.toString();
                            } else {
                                it = it2;
                                i11 = i17;
                                i12 = i14;
                            }
                            courseWordCopy$default = CourseWord.copy$default(courseWord6, 0L, originalWord, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, optionItemSelectedState, null, null, 0, -3, 59, null);
                        } else {
                            it = it2;
                            i11 = i17;
                            i12 = i14;
                            courseWordCopy$default = CourseWord.copy$default(courseWord6, 0L, courseWord6.getOriginalWord(), null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, OptionItemSelectedState.SELECTED, null, null, 0, -3, 59, null);
                        }
                        courseWord6 = courseWordCopy$default;
                        pVar.add(courseWord6);
                    } else {
                        it = it2;
                        i11 = i17;
                        i12 = i14;
                    }
                    arrayList6.add(courseWord6);
                    i14 = i12;
                    i17 = i11;
                }
                b1Var5.setValue(arrayList6);
                s0Var.f37167j.setValue(ht.q.SELECTED);
                return b0Var;
            case 7:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                jt.s0 s0Var2 = (jt.s0) this.f34742b;
                s0Var2.f37172p.clear();
                return Boolean.valueOf(s0Var2.f37172p.addAll((List) obj3));
            case 8:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                x1.p pVar2 = ((m1) this.f34742b).f37058k;
                pVar2.clear();
                return Boolean.valueOf(pVar2.addAll((ArrayList) obj3));
            case 9:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                qy.r rVarW = md.a.w((CourseWord) this.f34742b, (List) obj3);
                return rVarW == null ? new qy.r(new Integer(-1), new Integer(-1), null) : rVarW;
            case 10:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                rz.e0.B((rz.b0) this.f34742b, null, null, new x1((a2) obj3, null == true ? 1 : 0, i17), 3);
                return b0Var;
            case 11:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                RenderScriptToolkit renderScriptToolkit = RenderScriptToolkit.f22412a;
                Bitmap bitmap = (Bitmap) obj3;
                Bitmap bitmapA = RenderScriptToolkit.a((Bitmap) this.f34742b, bitmap, 1);
                for (int i21 = 0; i21 < 1; i21++) {
                    RenderScriptToolkit renderScriptToolkit2 = RenderScriptToolkit.f22412a;
                    bitmapA = RenderScriptToolkit.a(bitmapA, bitmap, 25);
                }
                return bitmapA;
            case 12:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kr.z0 z0Var = (kr.z0) this.f34742b;
                i1 i1Var = z0Var.K;
                av.n nVar2 = z0Var.f38628b;
                List list = (List) obj3;
                nVar2.f3173d = new ob.e(18, z0Var, list);
                if (!nVar2.l()) {
                    if (((Number) i1Var.getValue()).intValue() < list.size()) {
                        nVar2.h((String) list.get(((Number) i1Var.getValue()).intValue()));
                    } else {
                        Integer num = new Integer(0);
                        i1Var.getClass();
                        i1Var.l(null, num);
                        nVar2.h((String) list.get(((Number) i1Var.getValue()).intValue()));
                    }
                }
                return b0Var;
            case 13:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                List<ir.b> list2 = ((kr.r0) this.f34742b).f38564a;
                kr.z0 z0Var2 = (kr.z0) obj3;
                ArrayList arrayList7 = new ArrayList(ry.n.W(list2, 10));
                for (ir.b bVar : list2) {
                    qy.q qVar = fv.b.f28186a;
                    arrayList7.add(fv.b.L(z0Var2.f38632f, (int) bVar.f34557a.getSentenceId()));
                }
                return arrayList7;
            case 14:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kr.d1 d1Var = (kr.d1) this.f34742b;
                kotlin.jvm.internal.m.d(d1Var, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingUiState.Success");
                kr.c1 c1Var = (kr.c1) d1Var;
                List list3 = c1Var.f38434a;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) obj3;
                ArrayList arrayList8 = new ArrayList(ry.n.W(list3, 10));
                for (Object obj5 : list3) {
                    int i22 = i16 + 1;
                    if (i16 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    arrayList8.add(kr.a1.a((kr.a1) obj5, null, false, false, false, false, false, wVar.f38359a, 127));
                    i16 = i22;
                }
                return kr.c1.a(c1Var, arrayList8, 0, false, false, 30);
            case 15:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Context context = (Context) this.f34742b;
                File fileCreateTempFile = File.createTempFile("lingodeer_medal_", ".png", context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                Bitmap bitmap2 = (Bitmap) obj3;
                bitmap2.setHasAlpha(true);
                bitmap2.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return FileProvider.d(context, context.getPackageName() + ".fileprovider", fileCreateTempFile);
            case 16:
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                SwitchLanguageActivity switchLanguageActivity = (SwitchLanguageActivity) this.f34742b;
                int i23 = SwitchLanguageActivity.M;
                LanguageItem languageItem = (LanguageItem) switchLanguageActivity.f22232t.getValue();
                if (languageItem != null) {
                    int locate = languageItem.getLocate();
                    int[] iArr = bq.r.f4959a;
                    ((l1.b1) obj3).setValue(bq.m.w(switchLanguageActivity, bq.m.x(locate)));
                }
                return b0Var;
            case 17:
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return (e6.l) ((m6.l) this.f34742b).f40907a.get(((SessionWorker) obj3).f2021k);
            case 18:
                l1.b1 b1Var6 = (l1.b1) obj3;
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((rt.w) ((rt.x) this.f34742b)).f50559b.isEmpty() && ((Number) b1Var6.getValue()).intValue() == 1) {
                    b1Var6.setValue(0);
                }
                return b0Var;
            case 19:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                rt.a2 a2Var = (rt.a2) this.f34742b;
                List items = (List) obj3;
                i1 i1Var2 = a2Var.N;
                kotlin.jvm.internal.m.f(items, "items");
                i1 i1Var3 = a2Var.f49421d;
                i1Var3.getClass();
                i1Var3.l(null, items);
                i1 i1Var4 = a2Var.f49423f;
                ke keVarG = a2Var.g((ke) i1Var4.getValue());
                if (keVarG != i1Var4.getValue()) {
                    i1Var4.k(keVarG);
                }
                ArrayList arrayList9 = new ArrayList(ry.n.W(items, 10));
                Iterator it3 = items.iterator();
                while (it3.hasNext()) {
                    arrayList9.add(((rt.c1) it3.next()).f49553a.getId());
                }
                Set setF1 = ry.m.f1(arrayList9);
                i1 i1Var5 = a2Var.L;
                do {
                    value = i1Var5.getValue();
                } while (!i1Var5.j(value, ry.m.v0((Set) value, setF1)));
                String str4 = (String) i1Var2.getValue();
                if (str4 != null && (!setF1.contains(str4))) {
                    i1Var2.k(null);
                }
                ArrayList arrayList10 = new ArrayList(ry.n.W(items, 10));
                Iterator it4 = items.iterator();
                while (it4.hasNext()) {
                    arrayList10.add(Long.valueOf(((rt.c1) it4.next()).f49553a.getUnitId()));
                }
                Set setF2 = ry.m.f1(arrayList10);
                i1 i1Var6 = a2Var.M;
                do {
                    value2 = i1Var6.getValue();
                } while (!i1Var6.j(value2, ry.m.v0((Set) value2, setF2)));
                a2Var.h(items, (String) a2Var.H.getValue(), keVarG, (se) a2Var.K.getValue());
                return b0Var;
            case 20:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                b3 b3Var = (b3) this.f34742b;
                float f5 = n1.f41680a;
                if (((o1) b3Var.getValue()).f50173k <= 0) {
                    ((l1.h1) ((l1.a1) obj3)).m(0);
                }
                return b0Var;
            case 21:
                fz.a aVar23 = (fz.a) obj3;
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                q2 q2Var = (q2) this.f34742b;
                int i24 = q2Var.f50277p;
                if (q2Var.f50278q) {
                    aVar23.invoke();
                } else if (q2Var.f50276o == -1) {
                    if (i24 == 2) {
                        aVar23.invoke();
                    }
                } else if (q2Var.f50279r == 1 && i24 != 3) {
                    aVar23.invoke();
                }
                return b0Var;
            case 22:
                l1.b1 b1Var7 = (l1.b1) obj3;
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((b5) this.f34742b).f49509b) {
                    float f11 = l5.f41627a;
                    if (((Boolean) b1Var7.getValue()).booleanValue()) {
                        b1Var7.setValue(Boolean.FALSE);
                    }
                }
                return b0Var;
            case 23:
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                f8 f8Var = (f8) this.f34742b;
                List list4 = f8Var != null ? f8Var.f49749h : null;
                if (list4 == null) {
                    list4 = ry.r.f50854a;
                }
                if (!list4.isEmpty()) {
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        if (!((rt.l0) it5.next()).f50006e) {
                            ((l1.b1) obj3).setValue(list4);
                        }
                    }
                }
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                l1.b1 b1Var8 = (l1.b1) obj3;
                wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (((f8) ((g8) this.f34742b)).f49742a && ((Boolean) b1Var8.getValue()).booleanValue()) {
                    b1Var8.setValue(Boolean.FALSE);
                }
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                tt.b bVar2 = (tt.b) this.f34742b;
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (bVar2 != null) {
                    if (bVar2.f52535c) {
                        obj2 = null;
                    } else {
                        bVar2.f52535c = true;
                        obj2 = bVar2.f52533a;
                    }
                    if (((Boolean) obj2) != null) {
                        mu.x xVar = (mu.x) obj3;
                        i1 i1Var7 = xVar.K;
                        do {
                            value3 = i1Var7.getValue();
                            ((Boolean) value3).getClass();
                        } while (!i1Var7.j(value3, Boolean.TRUE));
                        rz.e0.B(ViewModelKt.getViewModelScope(xVar), null, null, new mu.q(xVar, null), 3);
                    }
                }
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                wy.a aVar29 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Collection collection = (Collection) this.f34742b;
                ArrayList arrayList11 = new ArrayList(ry.n.W(collection, 10));
                Iterator it6 = collection.iterator();
                while (it6.hasNext()) {
                    arrayList11.add(se.k.x((String) it6.next()));
                }
                ArrayList arrayList12 = new ArrayList();
                int size = arrayList11.size();
                while (i15 < size) {
                    Object obj6 = arrayList11.get(i15);
                    i15++;
                    if (!oz.q.K0((String) obj6)) {
                        arrayList12.add(obj6);
                    }
                }
                List<String> listJ0 = ry.m.j0(arrayList12);
                ArrayList arrayList13 = new ArrayList();
                for (String str5 : listJ0) {
                    qy.q qVar2 = fv.b.f28186a;
                    String strB = fv.b.b(str5);
                    fv.a aVar30 = com.google.android.material.datepicker.d.D(strB) ? null : new fv.a(fv.b.e(str5), strB, fv.b.a(str5, null, null));
                    if (aVar30 != null) {
                        arrayList13.add(aVar30);
                    }
                }
                ArrayList arrayList14 = new ArrayList();
                for (Object obj7 : (Collection) obj3) {
                    if (((Number) obj7).longValue() > 0) {
                        arrayList14.add(obj7);
                    }
                }
                List listJ1 = ry.m.j0(arrayList14);
                ArrayList arrayList15 = new ArrayList();
                Iterator it7 = listJ1.iterator();
                while (it7.hasNext()) {
                    long jLongValue = ((Number) it7.next()).longValue();
                    List listC = mv.r.c(jLongValue);
                    if (listC.isEmpty()) {
                        aVar = new fv.a(2L, fv.b.Z(jLongValue), fv.b.V(jLongValue));
                    } else {
                        Iterator it8 = listC.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                aVar = new fv.a(2L, fv.b.Z(jLongValue), fv.b.V(jLongValue));
                            } else if (com.google.android.material.datepicker.d.D((String) it8.next())) {
                                aVar = null;
                            }
                        }
                    }
                    if (aVar != null) {
                        arrayList15.add(aVar);
                    }
                }
                return ry.m.H0(arrayList13, arrayList15);
            case 27:
                wy.a aVar31 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                n5.x0 x0Var = (n5.x0) this.f34742b;
                if ((x0Var instanceof n5.c) && x0Var.f43426a <= ((n5.x0) obj3).f43426a) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                wy.a aVar32 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ph.s sVar = (ph.s) this.f34742b;
                PdLesson pdLesson = (PdLesson) obj3;
                i1 i1Var8 = sVar.f46913b;
                i1Var8.l(null, ph.p.a((ph.p) i1Var8.getValue(), pdLesson, false, null, 12));
                rz.e0.B(ViewModelKt.getViewModelScope(sVar), null, null, new ph.q(pdLesson, sVar, null), 3);
                return b0Var;
            default:
                wy.a aVar33 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                tq.d dVar = (tq.d) this.f34742b;
                int iK = ((o0.b) obj3).k();
                i1 i1Var9 = dVar.f52527e;
                Integer numValueOf = Integer.valueOf(iK);
                i1Var9.getClass();
                i1Var9.l(null, numValueOf);
                dVar.f52524b.n();
                rz.e0.B(ViewModelKt.getViewModelScope(dVar), null, null, new tp.f0(dVar, iK, (vy.d) null), 3);
                return b0Var;
        }
    }
}
