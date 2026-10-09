package gp;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.api.Service;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import com.lingo.fluent.ui.base.PdFinishActivity;
import com.lingo.fluent.ui.base.PdLearnActivity;
import com.lingo.fluent.ui.base.PdLearnIndexActivity;
import com.lingo.fluent.ui.base.PdVocabularyDetailActivity;
import com.lingo.lingoskill.billing.Subscription2Activity;
import com.lingo.lingoskill.ui.learn.DebugTestIndexActivity;
import com.lingo.lingoskill.ui.learn.LessonTestActivity;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SyllableLessonStatus;
import f0.n1;
import h1.ya;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import jt.r2;
import kotlin.NoWhenBranchMatchedException;
import kr.r1;
import rt.cb;
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29330c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f29328a = i12;
        this.f29330c = obj;
        this.f29329b = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj) {
        CourseWord courseWord;
        boolean z11;
        CourseWord courseWord2;
        boolean z12;
        CourseWord courseWord3;
        jt.u uVar = (jt.u) this.f29330c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f29329b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            ht.q qVar = ht.q.CORRECT;
            l1.b1 b1Var = uVar.f37194f;
            l1.b1 b1Var2 = uVar.f37196h;
            l1.b1 b1Var3 = uVar.f37195g;
            boolean z13 = false;
            ArrayList arrayListT = ry.l.T(new CourseWord[]{b1Var.getValue(), b1Var3.getValue(), b1Var2.getValue()});
            for (List list : uVar.f37189a) {
                ht.q qVar2 = ht.q.CORRECT;
                if (arrayListT.size() != list.size()) {
                    qVar = ht.q.WRONG;
                } else {
                    if (list.isEmpty()) {
                        z11 = z13;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                CourseWord courseWord4 = (CourseWord) it.next();
                                if (uVar.c(courseWord4) == r2.SHENG_MU && (courseWord = (CourseWord) uVar.f37194f.getValue()) != null) {
                                    if (courseWord4.getWordId() != courseWord.getWordId()) {
                                        String word = courseWord4.getWord();
                                        Locale locale = Locale.ROOT;
                                        String lowerCase = word.toLowerCase(locale);
                                        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
                                        String lowerCase2 = courseWord.getWord().toLowerCase(locale);
                                        kotlin.jvm.internal.m.e(lowerCase2, "toLowerCase(...)");
                                        if (lowerCase.equals(lowerCase2)) {
                                        }
                                    }
                                    z11 = true;
                                }
                            } else {
                                z11 = z13;
                            }
                        }
                    }
                    if (!list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z13 = false;
                                break;
                            }
                            CourseWord courseWord5 = (CourseWord) it2.next();
                            if (uVar.c(courseWord5) == r2.YU_MU && (courseWord3 = (CourseWord) b1Var3.getValue()) != null) {
                                if (courseWord5.getWordId() != courseWord3.getWordId()) {
                                    String word2 = courseWord5.getWord();
                                    Locale locale2 = Locale.ROOT;
                                    String lowerCase3 = word2.toLowerCase(locale2);
                                    kotlin.jvm.internal.m.e(lowerCase3, "toLowerCase(...)");
                                    String lowerCase4 = courseWord3.getWord().toLowerCase(locale2);
                                    kotlin.jvm.internal.m.e(lowerCase4, "toLowerCase(...)");
                                    if (lowerCase3.equals(lowerCase4)) {
                                    }
                                }
                                z13 = true;
                                break;
                            }
                        }
                    }
                    if (list.isEmpty()) {
                        z12 = false;
                    } else {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                CourseWord courseWord6 = (CourseWord) it3.next();
                                if (uVar.c(courseWord6) == r2.TONE && (courseWord2 = (CourseWord) b1Var2.getValue()) != null) {
                                    if (courseWord6.getWordId() != courseWord2.getWordId()) {
                                        String word3 = courseWord6.getWord();
                                        Locale locale3 = Locale.ROOT;
                                        String lowerCase5 = word3.toLowerCase(locale3);
                                        kotlin.jvm.internal.m.e(lowerCase5, "toLowerCase(...)");
                                        String lowerCase6 = courseWord2.getWord().toLowerCase(locale3);
                                        kotlin.jvm.internal.m.e(lowerCase6, "toLowerCase(...)");
                                        if (lowerCase5.equals(lowerCase6)) {
                                        }
                                    }
                                    z12 = true;
                                }
                            } else {
                                z12 = false;
                            }
                        }
                    }
                    qVar = (z11 && z13 && z12) ? qVar2 : ht.q.WRONG;
                }
                if (qVar == ht.q.CORRECT) {
                    break;
                }
                z13 = false;
            }
            uVar.f37191c.setValue(qVar);
            yz.f fVar = rz.o0.f50940a;
            sz.c cVar = wz.m.f55536a;
            av.p pVar = new av.p(uVar, null, 24);
            this.f29329b = 1;
            if (rz.e0.M(cVar, pVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }

    private final Object j(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f29329b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            km.t0 t0Var = (km.t0) this.f29330c;
            int i12 = (int) ((jCurrentTimeMillis - t0Var.f38280t) / 1000);
            wt.o0 o0VarS = t0Var.s();
            this.f29329b = 1;
            if (o0VarS.d(i12, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }

    private final Object m(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f29329b;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            kr.b bVar = (kr.b) this.f29330c;
            vt.k0 k0Var = bVar.f38419b;
            long j11 = bVar.f38420c;
            this.f29329b = 1;
            bh.a1 a1Var = (bh.a1) k0Var;
            a1Var.getClass();
            yz.f fVar = rz.o0.f50940a;
            Object objM = rz.e0.M(yz.e.f58387a, new bh.n0(7, j11, a1Var, null), this);
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return b0Var;
    }

    private final Object n(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f29329b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            kr.l1 l1Var = (kr.l1) this.f29330c;
            uz.i1 i1Var = ((vt.d) l1Var.f38523a).f54200j;
            kr.e1 e1Var = new kr.e1(0, l1Var, null);
            this.f29329b = 1;
            if (uz.x0.i(i1Var, e1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }

    private final Object o(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        kr.d1 d1Var = (kr.d1) this.f29330c;
        kotlin.jvm.internal.m.d(d1Var, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingUiState.Success");
        kr.c1 c1Var = (kr.c1) d1Var;
        List list = c1Var.f38434a;
        int i11 = this.f29329b;
        ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
        int i12 = 0;
        for (Object obj2 : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                ns.o.V();
                throw null;
            }
            arrayList.add(kr.a1.a((kr.a1) obj2, null, false, false, false, false, i12 == i11, 0, 191));
            i12 = i13;
        }
        return kr.c1.a(c1Var, arrayList, this.f29329b, false, false, 26);
    }

    private final Object p(Object obj) {
        r1 r1Var = (r1) this.f29330c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f29329b;
        vy.d dVar = null;
        int i12 = 1;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            km.s0 s0Var = new km.s0(r1Var, dVar, 2);
            this.f29329b = 1;
            obj = rz.e0.M(eVar, s0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        List list = (List) obj;
        boolean zIsEmpty = list.isEmpty();
        qy.b0 b0Var = qy.b0.f48488a;
        if (!zIsEmpty) {
            r1Var.f38571a.c(list, new gn.d(list, list.size(), i12, r1Var), false);
            return b0Var;
        }
        uz.i1 i1Var = r1Var.f38573c;
        i1Var.getClass();
        i1Var.l(null, cb.f49585a);
        return b0Var;
    }

    private final Object q(Object obj) {
        Subscription2Activity subscription2Activity = (Subscription2Activity) this.f29330c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f29329b;
        vy.d dVar = null;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            subscription2Activity.m().c("jxz_enter_subscribe", new li.a(subscription2Activity, 7));
            com.bumptech.glide.f.F("target_b_event");
            vt.n0 n0VarL = subscription2Activity.l();
            this.f29329b = 1;
            fr.o0 o0Var = (fr.o0) n0VarL;
            o0Var.getClass();
            yz.f fVar = rz.o0.f50940a;
            Object objM = rz.e0.M(yz.e.f58387a, new fr.g0(10, o0Var, dVar), this);
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM != aVar) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        vt.n0 n0VarL2 = subscription2Activity.l();
        int i12 = ((fr.o0) subscription2Activity.l()).f27733a.enterBillingAdPageCount + 1;
        this.f29329b = 2;
        fr.o0 o0Var2 = (fr.o0) n0VarL2;
        o0Var2.getClass();
        yz.f fVar2 = rz.o0.f50940a;
        Object objM2 = rz.e0.M(yz.e.f58387a, new fr.f0(i12, 8, o0Var2, dVar), this);
        if (objM2 != aVar) {
            objM2 = b0Var;
        }
        return objM2 == aVar ? aVar : b0Var;
    }

    private final Object s(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        m0.x xVar = (m0.x) this.f29330c;
        int i11 = this.f29329b;
        l0.r rVar = xVar.f40653d;
        if (rVar.f39181b.l() != i11 || rVar.f39182c.l() != 0) {
            n0.w wVar = xVar.m;
            wVar.d();
            wVar.f43010b = null;
        }
        rVar.a(i11, 0);
        rVar.f39184e = null;
        y2.i0 i0Var = xVar.f40659j;
        if (i0Var != null) {
            i0Var.l();
        }
        return qy.b0.f48488a;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29328a) {
            case 0:
                return new a((c) this.f29330c, dVar, 0);
            case 1:
                return new a((m) this.f29330c, dVar, 1);
            case 2:
                return new a((l1.a1) this.f29330c, dVar, 2);
            case 3:
                return new a((h1.r1) this.f29330c, dVar, 3);
            case 4:
                return new a((h1.n) this.f29330c, dVar, 4);
            case 5:
                return new a((ya) this.f29330c, dVar, 5);
            case 6:
                return new a((PdFinishActivity) this.f29330c, dVar, 6);
            case 7:
                return new a((PdLearnActivity) this.f29330c, dVar, 7);
            case 8:
                return new a((hh.c0) this.f29330c, dVar, 8);
            case 9:
                return new a((hh.j0) this.f29330c, dVar, 9);
            case 10:
                return new a((PdLearnIndexActivity) this.f29330c, dVar, 10);
            case 11:
                return new a((PdVocabularyDetailActivity) this.f29330c, dVar, 11);
            case 12:
                return new a((jh.f) this.f29330c, dVar, 12);
            case 13:
                return new a((ji.b) this.f29330c, dVar, 13);
            case 14:
                return new a((jp.w0) this.f29330c, dVar, 14);
            case 15:
                return new a((DebugTestIndexActivity) this.f29330c, dVar, 15);
            case 16:
                return new a((LessonTestActivity) this.f29330c, dVar, 16);
            case 17:
                return new a((js.g) this.f29330c, dVar, 17);
            case 18:
                return new a((js.r) this.f29330c, dVar, 18);
            case 19:
                return new a((js.w) this.f29330c, dVar, 19);
            case 20:
                return new a((jt.u) this.f29330c, dVar, 20);
            case 21:
                return new a((km.t0) this.f29330c, dVar, 21);
            case 22:
                return new a((kr.b) this.f29330c, dVar, 22);
            case 23:
                return new a((kr.l1) this.f29330c, dVar, 23);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new a((kr.d1) this.f29330c, this.f29329b, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new a((r1) this.f29330c, dVar, 25);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new a((Subscription2Activity) this.f29330c, dVar, 26);
            case 27:
                return new a((lv.b) this.f29330c, dVar, 27);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new a((m0.x) this.f29330c, this.f29329b, dVar, 28);
            default:
                return new a((b0.c) this.f29330c, dVar, 29);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29328a) {
            case 0:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                a aVar = (a) create((n1) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                aVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                return ((a) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29328a = i11;
        this.f29330c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:196:0x12fc  */
    /* JADX WARN: Code duplicated, block: B:251:0x12ff A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v59, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r38v4, types: [java.util.List] */
    private final Object r(Object obj) throws IOException {
        Object objU;
        ry.r rVar;
        LinkedHashMap linkedHashMap;
        String str;
        SyllableLessonStatus syllableLessonStatus;
        int i11;
        kv.j0 j0VarA;
        kv.q0 q0Var;
        String str2;
        List listK;
        List list;
        kv.j0 j0Var;
        String str3;
        kv.w sVar;
        String str4;
        String str5;
        lv.b bVar = (lv.b) this.f29330c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = this.f29329b;
        int i13 = 0;
        int i14 = 1;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            bh.f0 f0Var = new bh.f0(((bh.a1) bVar.f40336c).e(((fr.o0) bVar.f40335b).f27733a.keyLanguage, false), i13);
            this.f29329b = 1;
            objU = uz.x0.u(f0Var, this);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            objU = obj;
        }
        int iIntValue = ((Number) objU).intValue();
        InputStream inputStreamOpen = bVar.f40334a.f38813a.getAssets().open("alphabet/jp_questions.json");
        kotlin.jvm.internal.m.e(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, oz.a.f46133a), OSSConstants.DEFAULT_BUFFER_SIZE);
        try {
            String strI = ob.f.I(bufferedReader);
            bufferedReader.close();
            h00.e eVarF = h00.n.f(h00.c.f29915d.d(strI));
            ArrayList arrayList = new ArrayList(ry.n.W(eVarF, 10));
            Iterator it = eVarF.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                rVar = ry.r.f50854a;
                if (!zHasNext) {
                    break;
                }
                h00.z zVarG = h00.n.g((h00.m) it.next());
                String strE = se.i.e(zVarG, "lesson");
                String strE2 = se.i.e(zVarG, "script");
                String strE3 = se.i.e(zVarG, "type");
                String strE4 = se.i.e(zVarG, "character");
                String strE5 = se.i.e(zVarG, "romanization");
                h00.m mVar = (h00.m) zVarG.get("options");
                h00.e eVarF2 = mVar != null ? h00.n.f(mVar) : new h00.e(rVar);
                ArrayList arrayList2 = new ArrayList(ry.n.W(eVarF2, 10));
                Iterator it2 = eVarF2.iterator();
                while (it2.hasNext()) {
                    h00.z zVarG2 = h00.n.g((h00.m) it2.next());
                    arrayList2.add(new kv.n0(se.i.e(zVarG2, "character"), se.i.e(zVarG2, "romanization")));
                }
                arrayList.add(new kv.p0(strE, strE2, strE3, strE4, strE5, arrayList2));
            }
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj2 = arrayList.get(i15);
                i15++;
                if (kotlin.jvm.internal.m.a(((kv.p0) obj2).f38805b, "hiragana")) {
                    arrayList3.add(obj2);
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int size2 = arrayList3.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj3 = arrayList3.get(i16);
                i16++;
                kv.p0 p0Var = (kv.p0) obj3;
                String str6 = p0Var.f38804a;
                Object obj4 = linkedHashMap2.get(str6);
                if (obj4 == null) {
                    ArrayList arrayList4 = new ArrayList();
                    linkedHashMap2.put(str6, arrayList4);
                    obj4 = arrayList4;
                }
                ((List) obj4).add(p0Var.a());
                i14 = i14;
            }
            int i17 = i14;
            ArrayList arrayList5 = new ArrayList();
            int size3 = arrayList.size();
            int i18 = 0;
            while (i18 < size3) {
                Object obj5 = arrayList.get(i18);
                i18++;
                if (kotlin.jvm.internal.m.a(((kv.p0) obj5).f38805b, "katakana")) {
                    arrayList5.add(obj5);
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            int size4 = arrayList5.size();
            int i19 = 0;
            while (i19 < size4) {
                Object obj6 = arrayList5.get(i19);
                i19++;
                kv.p0 p0Var2 = (kv.p0) obj6;
                String str7 = p0Var2.f38804a;
                Object arrayList6 = linkedHashMap3.get(str7);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap3.put(str7, arrayList6);
                }
                ((List) arrayList6).add(p0Var2.a());
            }
            kv.q0 q0Var2 = new kv.q0(linkedHashMap2, linkedHashMap3);
            kv.v0 v0VarJ = kv.t0.j("あ・い・う・え・お");
            List listA = q0Var2.a("L1");
            kv.u uVar = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL01P01));
            kv.u uVar2 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL01P02));
            kv.r rVarC = kv.t0.c("あ/a", kv.t0.l(kv.y0.JpSyllableIntroL01ExampleNote01));
            kv.r rVarC2 = kv.t0.c("い/i", kv.t0.l(kv.y0.JpSyllableIntroL01ExampleNote02));
            kv.r rVarC3 = kv.t0.c("う/u", kv.t0.l(kv.y0.JpSyllableIntroL01ExampleNote03));
            kv.r rVarC4 = kv.t0.c("え/e", kv.t0.l(kv.y0.JpSyllableIntroL01ExampleNote04));
            kv.r rVarC5 = kv.t0.c("お/o", kv.t0.l(kv.y0.JpSyllableIntroL01ExampleNote05));
            kv.y0 y0Var = kv.y0.JpSyllableNoteTitle;
            kv.t tVar = new kv.t(kv.t0.l(y0Var), kv.t0.l(kv.y0.JpSyllableIntroL01Note01Content), ry.l.k0(new kv.x[0]));
            kv.w[] wVarArr = new kv.w[8];
            wVarArr[0] = uVar;
            wVarArr[i17] = uVar2;
            wVarArr[2] = rVarC;
            wVarArr[3] = rVarC2;
            wVarArr[4] = rVarC3;
            wVarArr[5] = rVarC4;
            wVarArr[6] = rVarC5;
            wVarArr[7] = tVar;
            kv.k0 k0VarD = kv.t0.d("L1", "あ(a) row", v0VarJ, ns.o.L(wVarArr), listA);
            kv.v0 v0VarJ2 = kv.t0.j("か・き・く・け・こ");
            List listA2 = q0Var2.a("L2");
            kv.u uVar3 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL02P01));
            kv.u uVar4 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL02P02));
            kv.u uVar5 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL02P03));
            kv.r rVarC6 = kv.t0.c("か/ka", kv.t0.l(kv.y0.JpSyllableIntroL02ExampleNote01));
            kv.r rVarC7 = kv.t0.c("き/ki", kv.t0.l(kv.y0.JpSyllableIntroL02ExampleNote02));
            kv.r rVarC8 = kv.t0.c("く/ku", kv.t0.l(kv.y0.JpSyllableIntroL02ExampleNote03));
            kv.r rVarC9 = kv.t0.c("け/ke", kv.t0.l(kv.y0.JpSyllableIntroL02ExampleNote04));
            kv.r rVarC10 = kv.t0.c("こ/ko", kv.t0.l(kv.y0.JpSyllableIntroL02ExampleNote05));
            kv.w[] wVarArr2 = new kv.w[8];
            wVarArr2[0] = uVar3;
            wVarArr2[i17] = uVar4;
            wVarArr2[2] = uVar5;
            wVarArr2[3] = rVarC6;
            wVarArr2[4] = rVarC7;
            wVarArr2[5] = rVarC8;
            wVarArr2[6] = rVarC9;
            wVarArr2[7] = rVarC10;
            kv.k0 k0VarD2 = kv.t0.d("L2", "か(ka) row", v0VarJ2, ns.o.L(wVarArr2), listA2);
            kv.v0 v0VarJ3 = kv.t0.j("さ・し・す・せ・そ");
            List listA3 = q0Var2.a("L3");
            kv.u uVar6 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL03P01));
            kv.r rVarC11 = kv.t0.c("さ/sa", kv.t0.l(kv.y0.JpSyllableIntroL03ExampleNote01));
            kv.r rVarC12 = kv.t0.c("し/shi", kv.t0.l(kv.y0.JpSyllableIntroL03ExampleNote02));
            String str8 = "type";
            kv.r rVarC13 = kv.t0.c("す/su", kv.t0.l(kv.y0.JpSyllableIntroL03ExampleNote03));
            String str9 = "romanization";
            kv.r rVarC14 = kv.t0.c("せ/se", kv.t0.l(kv.y0.JpSyllableIntroL03ExampleNote04));
            String str10 = "character";
            kv.r rVarC15 = kv.t0.c("そ/so", kv.t0.l(kv.y0.JpSyllableIntroL03ExampleNote05));
            kv.w[] wVarArr3 = new kv.w[6];
            wVarArr3[0] = uVar6;
            wVarArr3[i17] = rVarC11;
            wVarArr3[2] = rVarC12;
            wVarArr3[3] = rVarC13;
            wVarArr3[4] = rVarC14;
            wVarArr3[5] = rVarC15;
            int i21 = iIntValue;
            kv.k0 k0VarD3 = kv.t0.d("L3", "さ(sa) row", v0VarJ3, ns.o.L(wVarArr3), listA3);
            kv.v0 v0VarJ4 = kv.t0.j("た・ち・つ・て・と");
            List listA4 = q0Var2.a("L4");
            kv.u uVar7 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL04P01));
            kv.r rVarC16 = kv.t0.c("た/ta", kv.t0.l(kv.y0.JpSyllableIntroL04ExampleNote01));
            kv.r rVarC17 = kv.t0.c("ち/chi", kv.t0.l(kv.y0.JpSyllableIntroL04ExampleNote02));
            kv.r rVarC18 = kv.t0.c("つ/tsu", kv.t0.l(kv.y0.JpSyllableIntroL04ExampleNote03));
            kv.r rVarC19 = kv.t0.c("て/te", kv.t0.l(kv.y0.JpSyllableIntroL04ExampleNote04));
            kv.r rVarC20 = kv.t0.c("と/to", kv.t0.l(kv.y0.JpSyllableIntroL04ExampleNote05));
            kv.w[] wVarArr4 = new kv.w[6];
            wVarArr4[0] = uVar7;
            wVarArr4[i17] = rVarC16;
            wVarArr4[2] = rVarC17;
            wVarArr4[3] = rVarC18;
            wVarArr4[4] = rVarC19;
            wVarArr4[5] = rVarC20;
            kv.k0 k0VarD4 = kv.t0.d("L4", "た(ta) row", v0VarJ4, ns.o.L(wVarArr4), listA4);
            kv.v0 v0VarJ5 = kv.t0.j("な・に・ぬ・ね・の");
            List listA5 = q0Var2.a("L5");
            kv.u uVar8 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL05P01));
            kv.r rVarC21 = kv.t0.c("な/na", kv.t0.l(kv.y0.JpSyllableIntroL05ExampleNote01));
            kv.r rVarC22 = kv.t0.c("に/ni", kv.t0.l(kv.y0.JpSyllableIntroL05ExampleNote02));
            kv.r rVarC23 = kv.t0.c("ぬ/nu", kv.t0.l(kv.y0.JpSyllableIntroL05ExampleNote03));
            kv.r rVarC24 = kv.t0.c("ね/ne", kv.t0.l(kv.y0.JpSyllableIntroL05ExampleNote04));
            kv.r rVarC25 = kv.t0.c("の/no", kv.t0.l(kv.y0.JpSyllableIntroL05ExampleNote05));
            kv.w[] wVarArr5 = new kv.w[6];
            wVarArr5[0] = uVar8;
            wVarArr5[i17] = rVarC21;
            wVarArr5[2] = rVarC22;
            wVarArr5[3] = rVarC23;
            wVarArr5[4] = rVarC24;
            wVarArr5[5] = rVarC25;
            kv.k0 k0VarD5 = kv.t0.d("L5", "な(na) row", v0VarJ5, ns.o.L(wVarArr5), listA5);
            kv.v0 v0VarJ6 = kv.t0.j("は・ひ・ふ・へ・ほ");
            List listA6 = q0Var2.a("L6");
            kv.u uVar9 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL06P01));
            kv.r rVarC26 = kv.t0.c("は/ha", kv.t0.l(kv.y0.JpSyllableIntroL06ExampleNote01));
            kv.r rVarC27 = kv.t0.c("ひ/hi", kv.t0.l(kv.y0.JpSyllableIntroL06ExampleNote02));
            kv.r rVarC28 = kv.t0.c("ふ/fu", kv.t0.l(kv.y0.JpSyllableIntroL06ExampleNote03));
            kv.r rVarC29 = kv.t0.c("へ/he", kv.t0.l(kv.y0.JpSyllableIntroL06ExampleNote04));
            kv.r rVarC30 = kv.t0.c("ほ/ho", kv.t0.l(kv.y0.JpSyllableIntroL06ExampleNote05));
            kv.t tVar2 = new kv.t(kv.t0.l(y0Var), kv.t0.l(kv.y0.JpSyllableIntroL06Note01Content), ry.l.k0(new kv.x[]{kv.t0.a("は/ha", "は/wa"), kv.t0.a("へ/he", "へ/e")}));
            kv.w[] wVarArr6 = new kv.w[7];
            wVarArr6[0] = uVar9;
            wVarArr6[i17] = rVarC26;
            wVarArr6[2] = rVarC27;
            wVarArr6[3] = rVarC28;
            wVarArr6[4] = rVarC29;
            wVarArr6[5] = rVarC30;
            wVarArr6[6] = tVar2;
            kv.k0 k0VarD6 = kv.t0.d("L6", "は(ha) row", v0VarJ6, ns.o.L(wVarArr6), listA6);
            kv.v0 v0VarJ7 = kv.t0.j("ま・み・む・め・も・や・ゆ・よ");
            List listA7 = q0Var2.a("L7");
            kv.u uVar10 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL07P01));
            kv.u uVar11 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL07P02));
            kv.r rVarC31 = kv.t0.c("ま/ma", kv.t0.l(kv.y0.JpSyllableIntroL07ExampleNote01));
            kv.r rVarC32 = kv.t0.c("み/mi", kv.t0.l(kv.y0.JpSyllableIntroL07ExampleNote02));
            kv.r rVarC33 = kv.t0.c("む/mu", kv.t0.l(kv.y0.JpSyllableIntroL07ExampleNote03));
            kv.r rVarC34 = kv.t0.c("め/me", kv.t0.l(kv.y0.JpSyllableIntroL07ExampleNote04));
            kv.r rVarC35 = kv.t0.c("も/mo", kv.t0.l(kv.y0.JpSyllableIntroL07ExampleNote05));
            kv.u uVar12 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL07P03));
            kv.r rVarC36 = kv.t0.c("や/ya", kv.t0.l(kv.y0.JpSyllableIntroL07ExampleNote06));
            kv.r rVarC37 = kv.t0.c("ゆ/yu", kv.t0.l(kv.y0.JpSyllableIntroL07ExampleNote07));
            kv.r rVarC38 = kv.t0.c("よ/yo", kv.t0.l(kv.y0.JpSyllableIntroL07ExampleNote08));
            kv.w[] wVarArr7 = new kv.w[11];
            wVarArr7[0] = uVar10;
            wVarArr7[i17] = uVar11;
            wVarArr7[2] = rVarC31;
            wVarArr7[3] = rVarC32;
            wVarArr7[4] = rVarC33;
            wVarArr7[5] = rVarC34;
            wVarArr7[6] = rVarC35;
            wVarArr7[7] = uVar12;
            wVarArr7[8] = rVarC36;
            wVarArr7[9] = rVarC37;
            wVarArr7[10] = rVarC38;
            kv.k0 k0VarD7 = kv.t0.d("L7", "ま(ma) and や(ya) rows", v0VarJ7, ns.o.L(wVarArr7), listA7);
            kv.v0 v0VarJ8 = kv.t0.j("ら・り・る・れ・ろ・わ・を・ん");
            List listA8 = q0Var2.a("L8");
            kv.u uVar13 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL08P01));
            kv.u uVar14 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL08P02));
            kv.r rVarC39 = kv.t0.c("ら/ra", kv.t0.l(kv.y0.JpSyllableIntroL08ExampleNote01));
            kv.r rVarC40 = kv.t0.c("り/ri", kv.t0.l(kv.y0.JpSyllableIntroL08ExampleNote02));
            kv.r rVarC41 = kv.t0.c("る/ru", kv.t0.l(kv.y0.JpSyllableIntroL08ExampleNote03));
            kv.r rVarC42 = kv.t0.c("れ/re", kv.t0.l(kv.y0.JpSyllableIntroL08ExampleNote04));
            kv.r rVarC43 = kv.t0.c("ろ/ro", kv.t0.l(kv.y0.JpSyllableIntroL08ExampleNote05));
            kv.u uVar15 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL08P03));
            kv.r rVarC44 = kv.t0.c("わ/wa", kv.t0.l(kv.y0.JpSyllableIntroL08ExampleNote06));
            kv.r rVarC45 = kv.t0.c("を/(w)o", kv.t0.l(kv.y0.JpSyllableIntroL08ExampleNote07));
            kv.r rVarC46 = kv.t0.c("ん/n", kv.t0.l(kv.y0.JpSyllableIntroL08ExampleNote08));
            kv.t tVar3 = new kv.t(kv.t0.l(y0Var), kv.t0.l(kv.y0.JpSyllableIntroL08Note01Content), ry.l.k0(new kv.x[0]));
            kv.u uVar16 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL08P04));
            kv.w[] wVarArr8 = new kv.w[13];
            wVarArr8[0] = uVar13;
            wVarArr8[i17] = uVar14;
            wVarArr8[2] = rVarC39;
            wVarArr8[3] = rVarC40;
            wVarArr8[4] = rVarC41;
            wVarArr8[5] = rVarC42;
            wVarArr8[6] = rVarC43;
            wVarArr8[7] = uVar15;
            wVarArr8[8] = rVarC44;
            wVarArr8[9] = rVarC45;
            wVarArr8[10] = rVarC46;
            wVarArr8[11] = tVar3;
            wVarArr8[12] = uVar16;
            List listL = ns.o.L(k0VarD, k0VarD2, k0VarD3, k0VarD4, k0VarD5, k0VarD6, k0VarD7, kv.t0.d("L8", "ら(ra), わ(wa), and ん(n)", v0VarJ8, ns.o.L(wVarArr8), listA8));
            kv.v0 v0VarJ9 = kv.t0.j("が・ぎ・ぐ・げ・ご");
            List listA9 = q0Var2.a("L9");
            kv.u uVar17 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL09P01));
            kv.u uVar18 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL09P02));
            kv.s sVar2 = new kv.s(ry.l.k0(new kv.x[]{kv.t0.a("か/ka", "が/ga"), kv.t0.a("き/ki", "ぎ/gi"), kv.t0.a("く/ku", "ぐ/gu"), kv.t0.a("け/ke", "げ/ge"), kv.t0.a("こ/ko", "ご/go")}));
            kv.r rVarC47 = kv.t0.c("が/ga", kv.t0.l(kv.y0.JpSyllableIntroL09ExampleNote01));
            kv.r rVarC48 = kv.t0.c("ぎ/gi", kv.t0.l(kv.y0.JpSyllableIntroL09ExampleNote02));
            kv.r rVarC49 = kv.t0.c("ぐ/gu", kv.t0.l(kv.y0.JpSyllableIntroL09ExampleNote03));
            kv.r rVarC50 = kv.t0.c("げ/ge", kv.t0.l(kv.y0.JpSyllableIntroL09ExampleNote04));
            kv.r rVarC51 = kv.t0.c("ご/go", kv.t0.l(kv.y0.JpSyllableIntroL09ExampleNote05));
            kv.t tVar4 = new kv.t(kv.t0.l(y0Var), kv.t0.l(kv.y0.JpSyllableIntroL09Note01Content), ry.l.k0(new kv.x[0]));
            kv.w[] wVarArr9 = new kv.w[9];
            wVarArr9[0] = uVar17;
            wVarArr9[i17] = uVar18;
            wVarArr9[2] = sVar2;
            wVarArr9[3] = rVarC47;
            wVarArr9[4] = rVarC48;
            wVarArr9[5] = rVarC49;
            wVarArr9[6] = rVarC50;
            wVarArr9[7] = rVarC51;
            wVarArr9[8] = tVar4;
            kv.k0 k0VarE = kv.t0.e("L9", "Voiced Sounds (Dakuon): が・ぎ・ぐ・げ ・ご", v0VarJ9, listA9, ns.o.L(wVarArr9));
            kv.v0 v0VarJ10 = kv.t0.j("ざ・じ・ず・ぜ・ぞ");
            List listA10 = q0Var2.a("L10");
            kv.u uVar19 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL10P01));
            kv.u uVar20 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL10P02));
            kv.s sVar3 = new kv.s(ry.l.k0(new kv.x[]{kv.t0.a("さ/sa", "ざ/za"), kv.t0.a("し/shi", "じ/ji"), kv.t0.a("す/su", "ず/zu"), kv.t0.a("せ/se", "ぜ/ze"), kv.t0.a("そ/so", "ぞ/zo")}));
            kv.r rVarC52 = kv.t0.c("ざ/za", kv.t0.l(kv.y0.JpSyllableIntroL10ExampleNote01));
            kv.r rVarC53 = kv.t0.c("じ/ji", kv.t0.l(kv.y0.JpSyllableIntroL10ExampleNote02));
            kv.r rVarC54 = kv.t0.c("ず/zu", kv.t0.l(kv.y0.JpSyllableIntroL10ExampleNote03));
            kv.r rVarC55 = kv.t0.c("ぜ/ze", kv.t0.l(kv.y0.JpSyllableIntroL10ExampleNote04));
            kv.r rVarC56 = kv.t0.c("ぞ/zo", kv.t0.l(kv.y0.JpSyllableIntroL10ExampleNote05));
            kv.t tVar5 = new kv.t(kv.t0.l(y0Var), kv.t0.l(kv.y0.JpSyllableIntroL10Note01Content), ry.l.k0(new kv.x[0]));
            kv.w[] wVarArr10 = new kv.w[9];
            wVarArr10[0] = uVar19;
            wVarArr10[i17] = uVar20;
            wVarArr10[2] = sVar3;
            wVarArr10[3] = rVarC52;
            wVarArr10[4] = rVarC53;
            wVarArr10[5] = rVarC54;
            wVarArr10[6] = rVarC55;
            wVarArr10[7] = rVarC56;
            wVarArr10[8] = tVar5;
            kv.k0 k0VarE2 = kv.t0.e("L10", "Voiced Sounds (Dakuon): ざ・じ・ず・ぜ・ぞ", v0VarJ10, listA10, ns.o.L(wVarArr10));
            kv.v0 v0VarJ11 = kv.t0.j("だ・ぢ・づ・で・ど");
            String str11 = SemtNwfPgIhi.KQddxKMkJVVv;
            List listA11 = q0Var2.a(str11);
            kv.u uVar21 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL11P01));
            kv.u uVar22 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL11P02));
            kv.s sVar4 = new kv.s(ry.l.k0(new kv.x[]{kv.t0.a("た/ta", "だ/da"), kv.t0.a("ち/chi", "ぢ/ji"), kv.t0.a("つ/tsu", "づ/zu"), kv.t0.a("て/te", "で/de"), kv.t0.a("と/to", "ど/do")}));
            kv.r rVarC57 = kv.t0.c("だ/da", kv.t0.l(kv.y0.JpSyllableIntroL11ExampleNote01));
            kv.r rVarC58 = kv.t0.c("ぢ/ji", kv.t0.l(kv.y0.JpSyllableIntroL11ExampleNote02));
            kv.r rVarC59 = kv.t0.c("づ/zu", kv.t0.l(kv.y0.JpSyllableIntroL11ExampleNote03));
            kv.r rVarC60 = kv.t0.c("で/de", kv.t0.l(kv.y0.JpSyllableIntroL11ExampleNote04));
            kv.r rVarC61 = kv.t0.c("ど/do", kv.t0.l(kv.y0.JpSyllableIntroL11ExampleNote05));
            kv.t tVar6 = new kv.t(kv.t0.l(y0Var), kv.t0.l(kv.y0.JpSyllableIntroL11Note01Content), ry.l.k0(new kv.x[0]));
            kv.w[] wVarArr11 = new kv.w[9];
            wVarArr11[0] = uVar21;
            wVarArr11[i17] = uVar22;
            wVarArr11[2] = sVar4;
            wVarArr11[3] = rVarC57;
            wVarArr11[4] = rVarC58;
            wVarArr11[5] = rVarC59;
            wVarArr11[6] = rVarC60;
            wVarArr11[7] = rVarC61;
            wVarArr11[8] = tVar6;
            kv.k0 k0VarE3 = kv.t0.e(str11, "Voiced Sounds (Dakuon): だ・ぢ・づ・で・ど", v0VarJ11, listA11, ns.o.L(wVarArr11));
            kv.v0 v0VarJ12 = kv.t0.j("ば・び・ぶ・べ・ぼ");
            List listA12 = q0Var2.a("L12");
            kv.u uVar23 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL12P01));
            kv.u uVar24 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL12P02));
            kv.s sVar5 = new kv.s(ry.l.k0(new kv.x[]{kv.t0.a("は/ha", "ば/ba"), kv.t0.a("ひ/hi", "び/bi"), kv.t0.a("ふ/fu", "ぶ/bu"), kv.t0.a("へ/he", "べ/be"), kv.t0.a("ほ/ho", "ぼ/bo")}));
            kv.r rVarC62 = kv.t0.c("ば/ba", kv.t0.l(kv.y0.JpSyllableIntroL12ExampleNote01));
            kv.r rVarC63 = kv.t0.c("び/bi", kv.t0.l(kv.y0.JpSyllableIntroL12ExampleNote02));
            kv.r rVarC64 = kv.t0.c("ぶ/bu", kv.t0.l(kv.y0.JpSyllableIntroL12ExampleNote03));
            kv.r rVarC65 = kv.t0.c("べ/be", kv.t0.l(kv.y0.JpSyllableIntroL12ExampleNote04));
            kv.r rVarC66 = kv.t0.c("ぼ/bo", kv.t0.l(kv.y0.JpSyllableIntroL12ExampleNote05));
            kv.w[] wVarArr12 = new kv.w[8];
            wVarArr12[0] = uVar23;
            wVarArr12[i17] = uVar24;
            wVarArr12[2] = sVar5;
            wVarArr12[3] = rVarC62;
            wVarArr12[4] = rVarC63;
            wVarArr12[5] = rVarC64;
            wVarArr12[6] = rVarC65;
            wVarArr12[7] = rVarC66;
            kv.k0 k0VarE4 = kv.t0.e("L12", "Voiced Sounds (Dakuon): ば・び・ぶ・べ・ぼ", v0VarJ12, listA12, ns.o.L(wVarArr12));
            kv.v0 v0VarJ13 = kv.t0.j("ぱ・ぴ・ぷ・ぺ・ぽ");
            List listA13 = q0Var2.a("L13");
            kv.u uVar25 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL13P01));
            kv.u uVar26 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL13P02));
            kv.s sVar6 = new kv.s(ry.l.k0(new kv.x[]{kv.t0.a("は/ha", "ぱ/pa"), kv.t0.a("ひ/hi", "ぴ/pi"), kv.t0.a("ふ/fu", "ぷ/pu"), kv.t0.a("へ/he", "ぺ/pe"), kv.t0.a("ほ/ho", "ぽ/po")}));
            kv.r rVarC67 = kv.t0.c("ぱ/pa", kv.t0.l(kv.y0.JpSyllableIntroL13ExampleNote01));
            kv.r rVarC68 = kv.t0.c("ぴ/pi", kv.t0.l(kv.y0.JpSyllableIntroL13ExampleNote02));
            kv.r rVarC69 = kv.t0.c("ぷ/pu", kv.t0.l(kv.y0.JpSyllableIntroL13ExampleNote03));
            kv.r rVarC70 = kv.t0.c("ぺ/pe", kv.t0.l(kv.y0.JpSyllableIntroL13ExampleNote04));
            kv.r rVarC71 = kv.t0.c("ぽ/po", kv.t0.l(kv.y0.JpSyllableIntroL13ExampleNote05));
            kv.w[] wVarArr13 = new kv.w[8];
            wVarArr13[0] = uVar25;
            wVarArr13[i17] = uVar26;
            wVarArr13[2] = sVar6;
            wVarArr13[3] = rVarC67;
            wVarArr13[4] = rVarC68;
            wVarArr13[5] = rVarC69;
            wVarArr13[6] = rVarC70;
            wVarArr13[7] = rVarC71;
            kv.k0 k0VarE5 = kv.t0.e("L13", "Semi-Voiced Sounds (Handakuon): ぱ・ぴ・ぷ・ぺ・ぽ", v0VarJ13, listA13, ns.o.L(wVarArr13));
            kv.u0 u0VarL = kv.t0.l(kv.y0.JpSyllableIntroL14Description);
            String str12 = "L14";
            List listA14 = q0Var2.a("L14");
            kv.t0 t0Var = kv.t0.f38818a;
            String str13 = "Long Vowels";
            kv.k0 k0VarE6 = kv.t0.e("L14", "Long Vowels", u0VarL, listA14, t0Var.f());
            kv.u0 u0VarL2 = kv.t0.l(kv.y0.JpSyllableIntroL15Description);
            String str14 = "L15";
            List listA15 = q0Var2.a("L15");
            kv.u uVar27 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL15P01));
            kv.u uVar28 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL15P02));
            kv.u uVar29 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL15P03));
            kv.y0 y0Var2 = kv.y0.JpSyllableForExample;
            kv.u uVar30 = new kv.u(kv.t0.l(y0Var2));
            kv.r rVarC72 = kv.t0.c("こっそり/ko s so ri", kv.t0.l(kv.y0.JpSyllableIntroL15ExampleNote01));
            kv.t tVar7 = new kv.t(kv.t0.l(y0Var), kv.t0.l(kv.y0.JpSyllableIntroL15Note01Content), ry.l.k0(new kv.x[0]));
            kv.w[] wVarArr14 = new kv.w[6];
            wVarArr14[0] = uVar27;
            wVarArr14[i17] = uVar28;
            wVarArr14[2] = uVar29;
            wVarArr14[3] = uVar30;
            wVarArr14[4] = rVarC72;
            wVarArr14[5] = tVar7;
            String str15 = "Double Consonants (Sokuon)";
            kv.k0 k0VarE7 = kv.t0.e("L15", "Double Consonants (Sokuon)", u0VarL2, listA15, ns.o.L(wVarArr14));
            kv.u0 u0VarL3 = kv.t0.l(kv.y0.JpSyllableIntroL16Description);
            List listA16 = q0Var2.a("L16");
            kv.u uVar31 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL16P01));
            kv.u uVar32 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL16P02));
            kv.u uVar33 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL16P03));
            kv.u uVar34 = new kv.u(kv.t0.l(y0Var2));
            kv.r rVarC73 = kv.t0.c("きゃ/kya", kv.t0.j("き + ゃ"));
            kv.r rVarC74 = kv.t0.c("しゅ/shu", kv.t0.j("し + ゅ"));
            kv.r rVarC75 = kv.t0.c("ちょ/cho", kv.t0.j("ち + ょ"));
            kv.r rVarC76 = kv.t0.c("にゃ/nya", kv.t0.j("に + ゃ"));
            kv.r rVarC77 = kv.t0.c("ひょ/hyo", kv.t0.j("ひ + ょ"));
            kv.r rVarC78 = kv.t0.c("みゅ/myu", kv.t0.j("み + ゅ"));
            kv.r rVarC79 = kv.t0.c("りょ/ryo", kv.t0.j("り + ょ"));
            kv.u uVar35 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL16P05));
            kv.u uVar36 = new kv.u(kv.t0.l(y0Var2));
            kv.r rVarC80 = kv.t0.c("ぎゃ/gya", kv.t0.j("ぎ + ゃ"));
            kv.r rVarC81 = kv.t0.c("ぴゃ/pya", kv.t0.j("ぴ + ゃ"));
            kv.u uVar37 = new kv.u(kv.t0.l(kv.y0.JpSyllableIntroL16P07));
            kv.r rVarC82 = kv.t0.c("きゃあ/kya a", kv.t0.j("ゃ+あ"));
            kv.r rVarC83 = kv.t0.c("きゅう/kyu u", kv.t0.j("ゅ+う"));
            kv.r rVarC84 = kv.t0.c("きょう/kyo u", kv.t0.j("ょ+う"));
            kv.t tVar8 = new kv.t(kv.t0.l(y0Var), kv.t0.l(kv.y0.JpSyllableIntroL16Note01Content), ry.l.k0(new kv.x[0]));
            kv.w[] wVarArr15 = new kv.w[20];
            wVarArr15[0] = uVar31;
            wVarArr15[i17] = uVar32;
            wVarArr15[2] = uVar33;
            wVarArr15[3] = uVar34;
            wVarArr15[4] = rVarC73;
            wVarArr15[5] = rVarC74;
            wVarArr15[6] = rVarC75;
            wVarArr15[7] = rVarC76;
            wVarArr15[8] = rVarC77;
            wVarArr15[9] = rVarC78;
            wVarArr15[10] = rVarC79;
            wVarArr15[11] = uVar35;
            wVarArr15[12] = uVar36;
            wVarArr15[13] = rVarC80;
            wVarArr15[14] = rVarC81;
            wVarArr15[15] = uVar37;
            wVarArr15[16] = rVarC82;
            wVarArr15[17] = rVarC83;
            wVarArr15[18] = rVarC84;
            wVarArr15[19] = tVar8;
            ArrayList arrayListH0 = ry.m.H0(listL, ns.o.L(k0VarE, k0VarE2, k0VarE3, k0VarE4, k0VarE5, k0VarE6, k0VarE7, kv.t0.e("L16", "Contracted Sounds (Yōon)", u0VarL3, listA16, ns.o.L(wVarArr15))));
            ArrayList arrayList7 = new ArrayList(ry.n.W(arrayListH0, 10));
            int size5 = arrayListH0.size();
            int i22 = 0;
            int i23 = 0;
            while (i23 < size5) {
                Object obj7 = arrayListH0.get(i23);
                i23++;
                int i24 = i22 + 1;
                if (i22 < 0) {
                    ns.o.V();
                    throw null;
                }
                kv.k0 k0Var = (kv.k0) obj7;
                int i25 = i21;
                arrayList7.add(new kv.j0(k0Var.f38771a, i24, k0Var.f38772b, k0Var.f38773c, k0Var.f38774d, k0Var.f38775e, i24 < i25 ? SyllableLessonStatus.COMPLETED : i24 == i25 ? SyllableLessonStatus.UNLOCKED : SyllableLessonStatus.LOCKED, kv.s0.HIRAGANA, false));
                i21 = i25;
                i22 = i24;
            }
            int i26 = i21;
            ArrayList arrayList8 = new ArrayList(ry.n.W(arrayList7, 10));
            int size6 = arrayList7.size();
            int i27 = 0;
            int i28 = 0;
            while (true) {
                String str16 = "K";
                if (i28 >= size6) {
                    ArrayList arrayListH1 = ry.m.H0(arrayList7, arrayList8);
                    List list2 = lv.c.f40337a;
                    int iW = ry.x.W(ry.n.W(arrayList7, 10));
                    if (iW < 16) {
                        iW = 16;
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iW);
                    int size7 = arrayList7.size();
                    int i29 = 0;
                    while (i29 < size7) {
                        Object obj8 = arrayList7.get(i29);
                        i29++;
                        linkedHashMap4.put(((kv.j0) obj8).f38760a, obj8);
                    }
                    int iW2 = ry.x.W(ry.n.W(arrayList8, 10));
                    if (iW2 < 16) {
                        iW2 = 16;
                    }
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(iW2);
                    int size8 = arrayList8.size();
                    int i30 = 0;
                    while (i30 < size8) {
                        Object obj9 = arrayList8.get(i30);
                        i30++;
                        linkedHashMap5.put(((kv.j0) obj9).f38760a, obj9);
                    }
                    List list3 = lv.c.f40337a;
                    ArrayList arrayList9 = new ArrayList();
                    int i31 = 0;
                    for (Object obj10 : list3) {
                        int i32 = i31 + 1;
                        if (i31 < 0) {
                            ns.o.V();
                            throw null;
                        }
                        lv.d dVar = (lv.d) obj10;
                        List<String> list4 = dVar.f40339b;
                        ArrayList arrayList10 = new ArrayList();
                        for (String str17 : list4) {
                            kv.j0 j0Var2 = dVar.f40338a == kv.s0.HIRAGANA ? (kv.j0) linkedHashMap4.get(str17) : (kv.j0) linkedHashMap5.get(str17 + str16);
                            if (j0Var2 != null) {
                                arrayList10.add(j0Var2);
                            }
                        }
                        if (arrayList10.isEmpty()) {
                            linkedHashMap = linkedHashMap4;
                        } else {
                            ArrayList arrayList11 = new ArrayList();
                            int size9 = arrayList10.size();
                            int i33 = 0;
                            while (i33 < size9) {
                                Object obj11 = arrayList10.get(i33);
                                i33++;
                                ry.m.d0(arrayList11, ((kv.j0) obj11).f38765f);
                            }
                            ArrayList arrayList12 = new ArrayList();
                            int size10 = arrayList11.size();
                            int i34 = 0;
                            while (i34 < size10) {
                                Object obj12 = arrayList11.get(i34);
                                i34++;
                                LinkedHashMap linkedHashMap6 = linkedHashMap4;
                                if (((kv.l0) obj12).f38777a == kv.m0.M6) {
                                    arrayList12.add(obj12);
                                }
                                linkedHashMap4 = linkedHashMap6;
                            }
                            linkedHashMap = linkedHashMap4;
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList13 = new ArrayList();
                            int size11 = arrayList12.size();
                            int i35 = 0;
                            while (i35 < size11) {
                                Object obj13 = arrayList12.get(i35);
                                i35++;
                                if (hashSet.add(((kv.l0) obj13).f38778b)) {
                                    arrayList13.add(obj13);
                                }
                            }
                            if (!arrayList13.isEmpty()) {
                                kv.j0 j0Var3 = (kv.j0) ry.m.q0(arrayList10);
                                String strJ = nv.p.j(i32, "H");
                                String strY0 = ry.m.y0(arrayList10, " / ", null, null, new lt.d(i17), 30);
                                kv.v0 v0Var = new kv.v0(ry.m.y0(arrayList13, "・", null, null, new lt.d(2), 30));
                                if (arrayList10.isEmpty()) {
                                    str = strJ;
                                    syllableLessonStatus = SyllableLessonStatus.COMPLETED;
                                } else {
                                    int size12 = arrayList10.size();
                                    int i36 = 0;
                                    while (true) {
                                        if (i36 < size12) {
                                            Object obj14 = arrayList10.get(i36);
                                            i36++;
                                            str = strJ;
                                            if (((kv.j0) obj14).f38766g == SyllableLessonStatus.COMPLETED) {
                                                strJ = str;
                                            } else {
                                                syllableLessonStatus = SyllableLessonStatus.UNLOCKED;
                                            }
                                        } else {
                                            str = strJ;
                                            syllableLessonStatus = SyllableLessonStatus.COMPLETED;
                                        }
                                    }
                                }
                                i11 = i32;
                                j0VarA = kv.j0.a(j0Var3, str, i11, strY0, v0Var, rVar, arrayList13, syllableLessonStatus, kv.s0.HANDWRITING, 256);
                            }
                            if (j0VarA != null) {
                                arrayList9.add(j0VarA);
                            }
                            i31 = i11;
                            str16 = str16;
                            linkedHashMap4 = linkedHashMap;
                        }
                        j0VarA = null;
                        i11 = i32;
                        if (j0VarA != null) {
                            arrayList9.add(j0VarA);
                        }
                        i31 = i11;
                        str16 = str16;
                        linkedHashMap4 = linkedHashMap;
                    }
                    return new lv.a(i26, ry.m.H0(arrayListH1, arrayList9));
                }
                Object obj15 = arrayList7.get(i28);
                int i37 = i28 + 1;
                int i38 = i27 + 1;
                if (i27 < 0) {
                    ns.o.V();
                    throw null;
                }
                kv.j0 j0Var4 = (kv.j0) obj15;
                String str18 = ((kv.k0) arrayListH0.get(i27)).f38771a;
                ?? arrayList14 = (List) q0Var2.f38811b.get(str18);
                if (str18.equals(str12)) {
                    q0Var = q0Var2;
                    str2 = str12;
                    listK = ns.o.K(new kv.z(kv.t0.j(str13), t0Var.f()));
                } else {
                    q0Var = q0Var2;
                    str2 = str12;
                    if (str18.equals(str14)) {
                        kv.u uVar38 = new kv.u(qx.p.L(kv.t0.l(kv.y0.JpSyllableIntroL15P01)));
                        kv.u uVar39 = new kv.u(qx.p.L(kv.t0.l(kv.y0.JpSyllableIntroL15P02)));
                        kv.u uVar40 = new kv.u(qx.p.L(kv.t0.l(kv.y0.JpSyllableIntroL15P03)));
                        kv.u uVar41 = new kv.u(kv.t0.l(kv.y0.JpSyllableForExample));
                        kv.r rVarC85 = kv.t0.c("ベッド/be d do", kv.t0.l(kv.y0.JpSyllableIntroL15KatakanaExampleNote01));
                        kv.t tVar9 = new kv.t(kv.t0.l(kv.y0.JpSyllableNoteTitle), new kv.w0(qx.p.L(kv.t0.l(kv.y0.JpSyllableIntroL15Note01Content)), "sso → ッソ", "ddo → ッド"), ry.l.k0(new kv.x[0]));
                        kv.w[] wVarArr16 = new kv.w[6];
                        wVarArr16[0] = uVar38;
                        wVarArr16[i17] = uVar39;
                        wVarArr16[2] = uVar40;
                        wVarArr16[3] = uVar41;
                        wVarArr16[4] = rVarC85;
                        wVarArr16[5] = tVar9;
                        listK = ns.o.K(new kv.z(kv.t0.j(str15), ns.o.L(wVarArr16)));
                    } else {
                        listK = null;
                    }
                }
                List list5 = lv.c.f40337a;
                String str19 = "<this>";
                kotlin.jvm.internal.m.f(j0Var4, "<this>");
                if (arrayList14 == 0) {
                    List list6 = j0Var4.f38765f;
                    arrayList14 = new ArrayList(ry.n.W(list6, 10));
                    Iterator it3 = list6.iterator();
                    while (it3.hasNext()) {
                        kv.l0 l0Var = (kv.l0) it3.next();
                        String strK = qx.p.K(l0Var.f38778b);
                        List list7 = l0Var.f38780d;
                        List list8 = listK;
                        Iterator it4 = it3;
                        int i39 = i37;
                        ArrayList arrayList15 = new ArrayList(ry.n.W(list7, 10));
                        Iterator it5 = list7.iterator();
                        while (it5.hasNext()) {
                            kv.n0 n0Var = (kv.n0) it5.next();
                            String strK2 = qx.p.K(n0Var.f38785a);
                            String str20 = n0Var.f38786b;
                            Iterator it6 = it5;
                            String str21 = str10;
                            kotlin.jvm.internal.m.f(strK2, str21);
                            int i40 = i38;
                            String str22 = str9;
                            kotlin.jvm.internal.m.f(str20, str22);
                            arrayList15.add(new kv.n0(strK2, str20));
                            str13 = str13;
                            str9 = str22;
                            i38 = i40;
                            str10 = str21;
                            it5 = it6;
                        }
                        String str23 = str10;
                        kv.m0 m0Var = l0Var.f38777a;
                        String str24 = l0Var.f38779c;
                        kotlin.jvm.internal.m.f(m0Var, str8);
                        kotlin.jvm.internal.m.f(strK, str23);
                        arrayList14.add(new kv.l0(m0Var, strK, str24, arrayList15));
                        listK = list8;
                        it3 = it4;
                        i37 = i39;
                        str13 = str13;
                        str9 = str9;
                        i38 = i38;
                        str10 = str23;
                    }
                }
                List list9 = listK;
                int i41 = i37;
                String str25 = str8;
                String str26 = str10;
                int i42 = i38;
                String str27 = str9;
                String str28 = str13;
                ?? r38 = arrayList14;
                String strConcat = j0Var4.f38760a.concat("K");
                String strK3 = qx.p.K(j0Var4.f38762c);
                kv.x0 x0VarL = qx.p.L(j0Var4.f38763d);
                if (list9 == null) {
                    List list10 = j0Var4.f38764e;
                    ArrayList arrayList16 = new ArrayList(ry.n.W(list10, 10));
                    Iterator it7 = list10.iterator();
                    while (it7.hasNext()) {
                        kv.z zVar = (kv.z) it7.next();
                        kotlin.jvm.internal.m.f(zVar, str19);
                        kv.x0 x0VarL2 = qx.p.L(zVar.f38836a);
                        List list11 = zVar.f38837b;
                        ArrayList arrayList17 = new ArrayList(ry.n.W(list11, 10));
                        Iterator it8 = list11.iterator();
                        while (it8.hasNext()) {
                            kv.w wVar = (kv.w) it8.next();
                            if (wVar instanceof kv.u) {
                                sVar = new kv.u(qx.p.L(((kv.u) wVar).f38819a));
                            } else {
                                if (wVar instanceof kv.v) {
                                    kv.v vVar = (kv.v) wVar;
                                    kv.x0 x0VarL3 = qx.p.L(vVar.f38823a);
                                    String str29 = vVar.f38824b;
                                    kv.a0 style = vVar.f38825c;
                                    kotlin.jvm.internal.m.f(style, "style");
                                    sVar = new kv.v(x0VarL3, str29, style);
                                } else {
                                    it7 = it7;
                                    str19 = str19;
                                    if (wVar instanceof kv.t) {
                                        kv.t tVar10 = (kv.t) wVar;
                                        kv.x0 x0VarL4 = qx.p.L(tVar10.f38815a);
                                        kv.x0 x0VarL5 = qx.p.L(tVar10.f38816b);
                                        List list12 = tVar10.f38817c;
                                        ArrayList arrayList18 = new ArrayList(ry.n.W(list12, 10));
                                        Iterator it9 = list12.iterator();
                                        while (it9.hasNext()) {
                                            arrayList18.add(qx.p.J((kv.x) it9.next()));
                                        }
                                        sVar = new kv.t(x0VarL4, x0VarL5, arrayList18);
                                        j0Var = j0Var4;
                                        str3 = str15;
                                    } else {
                                        it8 = it8;
                                        str25 = str25;
                                        if (wVar instanceof kv.r) {
                                            kv.f0 f0Var2 = ((kv.r) wVar).f38812a;
                                            String strK4 = qx.p.K(f0Var2.f38737a);
                                            kv.x0 x0VarL6 = qx.p.L(f0Var2.f38739c);
                                            List list13 = f0Var2.f38740d;
                                            ArrayList arrayList19 = new ArrayList(ry.n.W(list13, 10));
                                            Iterator it10 = list13.iterator();
                                            while (true) {
                                                boolean zHasNext2 = it10.hasNext();
                                                str4 = iFLeRCXvYCGdPW.SzZXRMVlwPPG;
                                                Iterator it11 = it10;
                                                str5 = "text";
                                                if (!zHasNext2) {
                                                    break;
                                                }
                                                kv.j jVar = (kv.j) it11.next();
                                                kv.j0 j0Var5 = j0Var4;
                                                String text = qx.p.K(jVar.f38757a);
                                                String str30 = str15;
                                                boolean z11 = jVar.f38758b;
                                                kv.i iVar = jVar.f38759c;
                                                kotlin.jvm.internal.m.f(text, "text");
                                                kotlin.jvm.internal.m.f(iVar, str4);
                                                arrayList19.add(new kv.j(text, z11, iVar));
                                                it10 = it11;
                                                j0Var4 = j0Var5;
                                                str15 = str30;
                                            }
                                            j0Var = j0Var4;
                                            str3 = str15;
                                            List list14 = f0Var2.f38741e;
                                            ArrayList arrayList20 = new ArrayList(ry.n.W(list14, 10));
                                            Iterator it12 = list14.iterator();
                                            while (it12.hasNext()) {
                                                kv.j jVar2 = (kv.j) it12.next();
                                                String strK5 = qx.p.K(jVar2.f38757a);
                                                Iterator it13 = it12;
                                                boolean z12 = jVar2.f38758b;
                                                kv.i iVar2 = jVar2.f38759c;
                                                kotlin.jvm.internal.m.f(strK5, str5);
                                                kotlin.jvm.internal.m.f(iVar2, str4);
                                                arrayList20.add(new kv.j(strK5, z12, iVar2));
                                                it12 = it13;
                                                str5 = str5;
                                            }
                                            String str31 = f0Var2.f38738b;
                                            kotlin.jvm.internal.m.f(strK4, str26);
                                            kotlin.jvm.internal.m.f(str31, str27);
                                            sVar = new kv.r(new kv.f0(strK4, str31, x0VarL6, arrayList19, arrayList20));
                                        } else {
                                            j0Var = j0Var4;
                                            str3 = str15;
                                            if (!(wVar instanceof kv.s)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            List list15 = ((kv.s) wVar).f38814a;
                                            ArrayList arrayList21 = new ArrayList(ry.n.W(list15, 10));
                                            Iterator it14 = list15.iterator();
                                            while (it14.hasNext()) {
                                                arrayList21.add(qx.p.J((kv.x) it14.next()));
                                            }
                                            sVar = new kv.s(arrayList21);
                                        }
                                    }
                                }
                                arrayList17.add(sVar);
                                it7 = it7;
                                str19 = str19;
                                it8 = it8;
                                str25 = str25;
                                j0Var4 = j0Var;
                                str15 = str3;
                            }
                            j0Var = j0Var4;
                            str3 = str15;
                            arrayList17.add(sVar);
                            it7 = it7;
                            str19 = str19;
                            it8 = it8;
                            str25 = str25;
                            j0Var4 = j0Var;
                            str15 = str3;
                        }
                        arrayList16.add(new kv.z(x0VarL2, arrayList17));
                        it7 = it7;
                    }
                    list = arrayList16;
                } else {
                    list = list9;
                }
                str8 = str25;
                String str32 = str15;
                arrayList8.add(kv.j0.a(j0Var4, strConcat, 0, strK3, x0VarL, list, r38, null, kv.s0.KATAKANA, 322));
                str12 = str2;
                i28 = i41;
                str14 = str14;
                str13 = str28;
                i27 = i42;
                arrayListH0 = arrayListH0;
                size6 = size6;
                str15 = str32;
                str10 = str26;
                str9 = str27;
                q0Var2 = q0Var;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ns.o.m(bufferedReader, th2);
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:381:0x0bd2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:384:0x0bdd  */
    /* JADX WARN: Code duplicated, block: B:385:0x0be2  */
    /* JADX WARN: Code duplicated, block: B:414:0x0c7a  */
    /* JADX WARN: Code duplicated, block: B:434:0x0cef  */
    /* JADX WARN: Code duplicated, block: B:445:0x0d16  */
    /* JADX WARN: Code duplicated, block: B:449:0x0d24  */
    /* JADX WARN: Code duplicated, block: B:457:0x0d3d  */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:380:0x0bd0 -> B:382:0x0bd3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:372:0x0baf
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 3512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
