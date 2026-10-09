package km;

import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import rt.ae;
import rt.e3;
import rt.gd;
import rt.jd;
import zu.s2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38274b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38273a = i11;
        this.f38274b = obj;
    }

    private final Object e(Object obj) {
        xt.a aVar;
        ij.d dVar;
        vt.n0 n0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List listK;
        ArrayList arrayList4;
        Object obj2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        Integer num = 12;
        Integer num2 = 1;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        xt.a aVarA = xt.b.a();
        ArrayList arrayList8 = new ArrayList();
        ij.d dVar2 = (ij.d) this.f38274b;
        vt.n0 n0Var2 = (vt.n0) dVar2.f34423d;
        int iX = ((fr.o0) n0Var2).x();
        for (ot.j1 j1Var : (List) dVar2.f34422c) {
            if (j1Var instanceof ot.m0) {
                ot.m0 m0Var = (ot.m0) j1Var;
                ArrayList arrayListI = ot.l1.i(m0Var.f45892b, dVar2.f34421b, m0Var.a().c(), iX);
                ArrayList arrayList9 = new ArrayList();
                int size = arrayListI.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayListI.get(i11);
                    i11++;
                    if (!new File(((fv.a) obj3).a()).exists()) {
                        arrayList9.add(obj3);
                    }
                }
                arrayList8.addAll(arrayList9);
            } else {
                if (j1Var instanceof ot.p0) {
                    ot.p0 p0Var = (ot.p0) j1Var;
                    ArrayList arrayListI2 = ot.l1.i(p0Var.f45943b.f45828a, dVar2.f34421b, p0Var.a().c(), iX);
                    ArrayList arrayList10 = new ArrayList();
                    int size2 = arrayListI2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj4 = arrayListI2.get(i12);
                        i12++;
                        if (!new File(((fv.a) obj4).a()).exists()) {
                            arrayList10.add(obj4);
                        }
                    }
                    arrayList8.addAll(arrayList10);
                } else if (j1Var instanceof ot.n0) {
                    ot.n0 n0Var3 = (ot.n0) j1Var;
                    ot.c cVar = n0Var3.f45911b;
                    ArrayList arrayListI3 = ot.l1.i(cVar.f45761a, dVar2.f34421b, n0Var3.a().c(), iX);
                    ArrayList arrayList11 = new ArrayList();
                    int size3 = arrayListI3.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj5 = arrayListI3.get(i13);
                        i13++;
                        xt.a aVar3 = aVarA;
                        if (!new File(((fv.a) obj5).a()).exists()) {
                            arrayList11.add(obj5);
                        }
                        aVarA = aVar3;
                    }
                    aVar = aVarA;
                    arrayList8.addAll(arrayList11);
                    if (iX != -1) {
                        List<CourseWord> list = cVar.f45763c;
                        arrayList7 = new ArrayList();
                        for (CourseWord courseWord : list) {
                            qy.q qVar = fv.b.f28186a;
                            ry.m.d0(arrayList7, ns.o.L(new fv.a(fv.b.b0(courseWord.getWordId()), defpackage.e.m(aVar.j(), fv.b.X(courseWord.getWordId())), fv.b.X(courseWord.getWordId())), new fv.a(fv.b.a0(courseWord.getWordId()), defpackage.e.m(aVar.i(), fv.b.W(courseWord.getWordId())), fv.b.W(courseWord.getWordId()))));
                        }
                    } else {
                        List<CourseWord> list2 = cVar.f45763c;
                        arrayList7 = new ArrayList(ry.n.W(list2, 10));
                        for (CourseWord courseWord2 : list2) {
                            qy.q qVar2 = fv.b.f28186a;
                            arrayList7.add(new fv.a(2L, fv.b.Z(courseWord2.getWordId()), fv.b.V(courseWord2.getWordId())));
                        }
                    }
                    ArrayList arrayList12 = new ArrayList();
                    int size4 = arrayList7.size();
                    int i14 = 0;
                    while (i14 < size4) {
                        Object obj6 = arrayList7.get(i14);
                        i14++;
                        if (!new File(((fv.a) obj6).a()).exists()) {
                            arrayList12.add(obj6);
                        }
                    }
                    arrayList8.addAll(arrayList12);
                    dVar = dVar2;
                    n0Var = n0Var2;
                } else {
                    aVar = aVarA;
                    if (j1Var instanceof ot.o0) {
                        ot.o0 o0Var = (ot.o0) j1Var;
                        ot.f fVar = o0Var.f45930b;
                        ArrayList arrayListI4 = ot.l1.i(fVar.f45802a, dVar2.f34421b, o0Var.a().c(), iX);
                        ArrayList arrayList13 = new ArrayList();
                        int size5 = arrayListI4.size();
                        int i15 = 0;
                        while (i15 < size5) {
                            Object obj7 = arrayListI4.get(i15);
                            i15++;
                            if (!new File(((fv.a) obj7).a()).exists()) {
                                arrayList13.add(obj7);
                            }
                        }
                        arrayList8.addAll(arrayList13);
                        if (xt.d.u(dVar2.f34421b)) {
                            List<CourseWord> list3 = fVar.f45804c;
                            ArrayList arrayList14 = new ArrayList(ry.n.W(list3, 10));
                            for (CourseWord courseWord3 : list3) {
                                arrayList14.add(ry.l.D(new Integer[]{num, num2}, Integer.valueOf(dVar2.f34421b)) ? courseWord3.getLuoMa() : courseWord3.getZhuYin());
                            }
                            ArrayList arrayList15 = new ArrayList();
                            int size6 = arrayList14.size();
                            int i16 = 0;
                            while (i16 < size6) {
                                Object obj8 = arrayList14.get(i16);
                                i16++;
                                if (((String) obj8).length() > 0) {
                                    arrayList15.add(obj8);
                                }
                            }
                            ArrayList arrayList16 = new ArrayList(ry.n.W(arrayList15, 10));
                            int size7 = arrayList15.size();
                            int i17 = 0;
                            while (i17 < size7) {
                                Object obj9 = arrayList15.get(i17);
                                i17++;
                                String str = (String) obj9;
                                qy.q qVar3 = fv.b.f28186a;
                                arrayList16.add(new fv.a(1L, fv.b.k0(str), fv.b.j0(str)));
                                dVar2 = dVar2;
                            }
                            dVar = dVar2;
                            ArrayList arrayList17 = new ArrayList();
                            int size8 = arrayList16.size();
                            int i18 = 0;
                            while (i18 < size8) {
                                Object obj10 = arrayList16.get(i18);
                                i18++;
                                if (!new File(((fv.a) obj10).a()).exists()) {
                                    arrayList17.add(obj10);
                                }
                            }
                            arrayList8.addAll(arrayList17);
                        } else {
                            dVar = dVar2;
                        }
                    } else {
                        dVar = dVar2;
                        if (j1Var instanceof ot.q0) {
                            ot.q0 q0Var = (ot.q0) j1Var;
                            ArrayList arrayListI5 = ot.l1.i(q0Var.f45951b.f45858a, dVar.f34421b, q0Var.a().c(), iX);
                            ArrayList arrayList18 = new ArrayList();
                            int size9 = arrayListI5.size();
                            int i19 = 0;
                            while (i19 < size9) {
                                Object obj11 = arrayListI5.get(i19);
                                i19++;
                                if (!new File(((fv.a) obj11).a()).exists()) {
                                    arrayList18.add(obj11);
                                }
                            }
                            arrayList8.addAll(arrayList18);
                        } else if (j1Var instanceof ot.r0) {
                            ot.r0 r0Var = (ot.r0) j1Var;
                            ArrayList arrayListI6 = ot.l1.i(r0Var.f45966b.f45878a, dVar.f34421b, r0Var.a().c(), iX);
                            ArrayList arrayList19 = new ArrayList();
                            int size10 = arrayListI6.size();
                            int i21 = 0;
                            while (i21 < size10) {
                                Object obj12 = arrayListI6.get(i21);
                                i21++;
                                if (!new File(((fv.a) obj12).a()).exists()) {
                                    arrayList19.add(obj12);
                                }
                            }
                            arrayList8.addAll(arrayList19);
                        } else if (j1Var instanceof ot.s0) {
                            ot.s0 s0Var = (ot.s0) j1Var;
                            ot.n nVar = s0Var.f45985b;
                            ArrayList arrayListI7 = ot.l1.i(nVar.f45907a, dVar.f34421b, s0Var.a().c(), iX);
                            ArrayList arrayList20 = new ArrayList();
                            int size11 = arrayListI7.size();
                            int i22 = 0;
                            while (i22 < size11) {
                                Object obj13 = arrayListI7.get(i22);
                                i22++;
                                if (!new File(((fv.a) obj13).a()).exists()) {
                                    arrayList20.add(obj13);
                                }
                            }
                            arrayList8.addAll(arrayList20);
                            if (iX != -1) {
                                List<CourseWord> list4 = nVar.f45908b;
                                arrayList6 = new ArrayList();
                                for (CourseWord courseWord4 : list4) {
                                    qy.q qVar4 = fv.b.f28186a;
                                    ry.m.d0(arrayList6, ns.o.L(new fv.a(fv.b.b0(courseWord4.getWordId()), defpackage.e.m(aVar.j(), fv.b.X(courseWord4.getWordId())), fv.b.X(courseWord4.getWordId())), new fv.a(fv.b.a0(courseWord4.getWordId()), defpackage.e.m(aVar.i(), fv.b.W(courseWord4.getWordId())), fv.b.W(courseWord4.getWordId()))));
                                }
                            } else {
                                List<CourseWord> list5 = nVar.f45908b;
                                arrayList6 = new ArrayList(ry.n.W(list5, 10));
                                for (CourseWord courseWord5 : list5) {
                                    qy.q qVar5 = fv.b.f28186a;
                                    arrayList6.add(new fv.a(2L, fv.b.Z(courseWord5.getWordId()), fv.b.V(courseWord5.getWordId())));
                                }
                            }
                            ArrayList arrayList21 = new ArrayList();
                            int size12 = arrayList6.size();
                            int i23 = 0;
                            while (i23 < size12) {
                                Object obj14 = arrayList6.get(i23);
                                i23++;
                                if (!new File(((fv.a) obj14).a()).exists()) {
                                    arrayList21.add(obj14);
                                }
                            }
                            arrayList8.addAll(arrayList21);
                        } else if (j1Var instanceof ot.t0) {
                            ot.t0 t0Var = (ot.t0) j1Var;
                            ot.n nVar2 = t0Var.f45996b;
                            ArrayList arrayListI8 = ot.l1.i(nVar2.f45907a, dVar.f34421b, t0Var.a().c(), iX);
                            ArrayList arrayList22 = new ArrayList();
                            int size13 = arrayListI8.size();
                            int i24 = 0;
                            while (i24 < size13) {
                                Object obj15 = arrayListI8.get(i24);
                                i24++;
                                if (!new File(((fv.a) obj15).a()).exists()) {
                                    arrayList22.add(obj15);
                                }
                            }
                            arrayList8.addAll(arrayList22);
                            if (iX != -1) {
                                List<CourseWord> list6 = nVar2.f45908b;
                                arrayList5 = new ArrayList();
                                for (CourseWord courseWord6 : list6) {
                                    qy.q qVar6 = fv.b.f28186a;
                                    ry.m.d0(arrayList5, ns.o.L(new fv.a(fv.b.b0(courseWord6.getWordId()), defpackage.e.m(aVar.j(), fv.b.X(courseWord6.getWordId())), fv.b.X(courseWord6.getWordId())), new fv.a(fv.b.a0(courseWord6.getWordId()), defpackage.e.m(aVar.i(), fv.b.W(courseWord6.getWordId())), fv.b.W(courseWord6.getWordId()))));
                                }
                            } else {
                                List<CourseWord> list7 = nVar2.f45908b;
                                arrayList5 = new ArrayList(ry.n.W(list7, 10));
                                for (CourseWord courseWord7 : list7) {
                                    qy.q qVar7 = fv.b.f28186a;
                                    arrayList5.add(new fv.a(2L, fv.b.Z(courseWord7.getWordId()), fv.b.V(courseWord7.getWordId())));
                                }
                            }
                            ArrayList arrayList23 = new ArrayList();
                            int size14 = arrayList5.size();
                            int i25 = 0;
                            while (i25 < size14) {
                                Object obj16 = arrayList5.get(i25);
                                i25++;
                                if (!new File(((fv.a) obj16).a()).exists()) {
                                    arrayList23.add(obj16);
                                }
                            }
                            arrayList8.addAll(arrayList23);
                        } else if (j1Var instanceof ot.u0) {
                            ot.u0 u0Var = (ot.u0) j1Var;
                            ArrayList arrayListI9 = ot.l1.i(u0Var.f46011b.f45948a, dVar.f34421b, u0Var.a().c(), iX);
                            ArrayList arrayList24 = new ArrayList();
                            int size15 = arrayListI9.size();
                            int i26 = 0;
                            while (i26 < size15) {
                                Object obj17 = arrayListI9.get(i26);
                                i26++;
                                if (!new File(((fv.a) obj17).a()).exists()) {
                                    arrayList24.add(obj17);
                                }
                            }
                            arrayList8.addAll(arrayList24);
                        } else if (j1Var instanceof ot.v0) {
                            ot.v0 v0Var = (ot.v0) j1Var;
                            ot.s sVar = v0Var.f46021b;
                            ArrayList arrayListI10 = ot.l1.i(sVar.f45981a, dVar.f34421b, v0Var.a().c(), iX);
                            ArrayList arrayList25 = new ArrayList();
                            int size16 = arrayListI10.size();
                            int i27 = 0;
                            while (i27 < size16) {
                                Object obj18 = arrayListI10.get(i27);
                                i27++;
                                if (!new File(((fv.a) obj18).a()).exists()) {
                                    arrayList25.add(obj18);
                                }
                            }
                            arrayList8.addAll(arrayList25);
                            Iterator it = sVar.f45983c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                Object next = it.next();
                                if (((CourseSentence) next).getSentenceId() == sVar.f45982b) {
                                    obj2 = next;
                                    break;
                                }
                            }
                            CourseSentence courseSentence = (CourseSentence) obj2;
                            if (courseSentence != null) {
                                ArrayList arrayListI11 = ot.l1.i(courseSentence, dVar.f34421b, v0Var.a().c(), iX);
                                ArrayList arrayList26 = new ArrayList();
                                int size17 = arrayListI11.size();
                                int i28 = 0;
                                while (i28 < size17) {
                                    Object obj19 = arrayListI11.get(i28);
                                    i28++;
                                    if (!new File(((fv.a) obj19).a()).exists()) {
                                        arrayList26.add(obj19);
                                    }
                                }
                                arrayList8.addAll(arrayList26);
                            }
                        } else if (j1Var instanceof ot.x0) {
                            ot.x0 x0Var = (ot.x0) j1Var;
                            ot.w wVar = x0Var.f46041b;
                            ArrayList arrayListI12 = ot.l1.i(wVar.f46028b, dVar.f34421b, x0Var.a().c(), iX);
                            ArrayList arrayList27 = new ArrayList();
                            int size18 = arrayListI12.size();
                            int i29 = 0;
                            while (i29 < size18) {
                                Object obj20 = arrayListI12.get(i29);
                                i29++;
                                if (!new File(((fv.a) obj20).a()).exists()) {
                                    arrayList27.add(obj20);
                                }
                            }
                            arrayList8.addAll(arrayList27);
                            ArrayList arrayListI13 = ot.l1.i(wVar.f46029c, dVar.f34421b, x0Var.a().c(), iX);
                            ArrayList arrayList28 = new ArrayList();
                            int size19 = arrayListI13.size();
                            int i30 = 0;
                            while (i30 < size19) {
                                Object obj21 = arrayListI13.get(i30);
                                i30++;
                                if (!new File(((fv.a) obj21).a()).exists()) {
                                    arrayList28.add(obj21);
                                }
                            }
                            arrayList8.addAll(arrayList28);
                            if (iX != -1) {
                                List<CourseWord> list8 = wVar.f46031e;
                                arrayList4 = new ArrayList();
                                for (CourseWord courseWord8 : list8) {
                                    qy.q qVar8 = fv.b.f28186a;
                                    ry.m.d0(arrayList4, ns.o.L(new fv.a(fv.b.b0(courseWord8.getWordId()), defpackage.e.m(aVar.j(), fv.b.X(courseWord8.getWordId())), fv.b.X(courseWord8.getWordId())), new fv.a(fv.b.a0(courseWord8.getWordId()), defpackage.e.m(aVar.i(), fv.b.W(courseWord8.getWordId())), fv.b.W(courseWord8.getWordId()))));
                                }
                            } else {
                                List<CourseWord> list9 = wVar.f46031e;
                                arrayList4 = new ArrayList(ry.n.W(list9, 10));
                                for (CourseWord courseWord9 : list9) {
                                    qy.q qVar9 = fv.b.f28186a;
                                    arrayList4.add(new fv.a(2L, fv.b.Z(courseWord9.getWordId()), fv.b.V(courseWord9.getWordId())));
                                }
                            }
                            ArrayList arrayList29 = new ArrayList();
                            int size20 = arrayList4.size();
                            int i31 = 0;
                            while (i31 < size20) {
                                Object obj22 = arrayList4.get(i31);
                                i31++;
                                if (!new File(((fv.a) obj22).a()).exists()) {
                                    arrayList29.add(obj22);
                                }
                            }
                            arrayList8.addAll(arrayList29);
                        } else if (j1Var instanceof ot.w0) {
                            ot.w0 w0Var = (ot.w0) j1Var;
                            ArrayList arrayListI14 = ot.l1.i(w0Var.f46033b.a(), dVar.f34421b, w0Var.a().c(), iX);
                            ArrayList arrayList30 = new ArrayList();
                            int size21 = arrayListI14.size();
                            int i32 = 0;
                            while (i32 < size21) {
                                Object obj23 = arrayListI14.get(i32);
                                i32++;
                                if (!new File(((fv.a) obj23).a()).exists()) {
                                    arrayList30.add(obj23);
                                }
                            }
                            arrayList8.addAll(arrayList30);
                        } else if (j1Var instanceof ot.a1) {
                            ot.a1 a1Var = (ot.a1) j1Var;
                            ArrayList arrayListC = ot.l1.c(a1Var.b(), dVar.f34421b, a1Var.a().c(), iX);
                            ArrayList arrayList31 = new ArrayList();
                            int size22 = arrayListC.size();
                            int i33 = 0;
                            while (i33 < size22) {
                                Object obj24 = arrayListC.get(i33);
                                i33++;
                                if (!new File(((fv.a) obj24).a()).exists()) {
                                    arrayList31.add(obj24);
                                }
                            }
                            arrayList8.addAll(arrayList31);
                        } else if (j1Var instanceof ot.b1) {
                            ot.b1 b1Var = (ot.b1) j1Var;
                            ArrayList arrayListC2 = ot.l1.c(b1Var.b(), dVar.f34421b, b1Var.a().c(), iX);
                            ArrayList arrayList32 = new ArrayList();
                            int size23 = arrayListC2.size();
                            int i34 = 0;
                            while (i34 < size23) {
                                Object obj25 = arrayListC2.get(i34);
                                i34++;
                                if (!new File(((fv.a) obj25).a()).exists()) {
                                    arrayList32.add(obj25);
                                }
                            }
                            arrayList8.addAll(arrayList32);
                        } else if (j1Var instanceof ot.c1) {
                            ot.c1 c1Var = (ot.c1) j1Var;
                            ArrayList arrayListC3 = ot.l1.c(c1Var.b(), dVar.f34421b, c1Var.a().c(), iX);
                            ArrayList arrayList33 = new ArrayList();
                            int size24 = arrayListC3.size();
                            int i35 = 0;
                            while (i35 < size24) {
                                Object obj26 = arrayListC3.get(i35);
                                i35++;
                                if (!new File(((fv.a) obj26).a()).exists()) {
                                    arrayList33.add(obj26);
                                }
                            }
                            arrayList8.addAll(arrayList33);
                        } else if (j1Var instanceof ot.d1) {
                            ot.d1 d1Var = (ot.d1) j1Var;
                            ArrayList arrayListC4 = ot.l1.c(d1Var.b(), dVar.f34421b, d1Var.a().c(), iX);
                            ArrayList arrayList34 = new ArrayList();
                            int size25 = arrayListC4.size();
                            int i36 = 0;
                            while (i36 < size25) {
                                Object obj27 = arrayListC4.get(i36);
                                i36++;
                                if (!new File(((fv.a) obj27).a()).exists()) {
                                    arrayList34.add(obj27);
                                }
                            }
                            arrayList8.addAll(arrayList34);
                        } else {
                            if (j1Var instanceof ot.e1) {
                                ot.e1 e1Var = (ot.e1) j1Var;
                                String string = e1Var.b().c().getAudioUri().toString();
                                kotlin.jvm.internal.m.e(string, "toString(...)");
                                if (!oz.q.v0(string, "-zy-", false)) {
                                    if (iX != -1) {
                                        qy.q qVar10 = fv.b.f28186a;
                                        listK = ns.o.L(new fv.a(fv.b.b0(e1Var.b().c().getWordId()), defpackage.e.m(aVar.j(), fv.b.X(e1Var.b().c().getWordId())), fv.b.X(e1Var.b().c().getWordId())), new fv.a(fv.b.a0(e1Var.b().c().getWordId()), defpackage.e.m(aVar.i(), fv.b.W(e1Var.b().c().getWordId())), fv.b.W(e1Var.b().c().getWordId())));
                                    } else {
                                        qy.q qVar11 = fv.b.f28186a;
                                        listK = ns.o.K(new fv.a(2L, fv.b.Z(e1Var.b().c().getWordId()), fv.b.V(e1Var.b().c().getWordId())));
                                    }
                                    ArrayList arrayList35 = new ArrayList();
                                    for (Object obj28 : listK) {
                                        if (!new File(((fv.a) obj28).a()).exists()) {
                                            arrayList35.add(obj28);
                                        }
                                    }
                                    arrayList8.addAll(arrayList35);
                                } else if (e1Var.b().c().getTranslation().length() > 0) {
                                    qy.q qVar12 = fv.b.f28186a;
                                    String strE = fv.b.e(e1Var.b().c().getTranslation());
                                    String zhuyin = e1Var.b().c().getTranslation();
                                    kotlin.jvm.internal.m.f(zhuyin, "zhuyin");
                                    fv.a aVar4 = new fv.a(2L, strE, fv.b.a(zhuyin, null, null));
                                    if (!new File(aVar4.a()).exists()) {
                                        arrayList8.add(aVar4);
                                    }
                                }
                                if (xt.d.u(dVar.f34421b)) {
                                    List<CourseWord> listB = e1Var.b().b();
                                    ArrayList arrayList36 = new ArrayList(ry.n.W(listB, 10));
                                    for (CourseWord courseWord10 : listB) {
                                        arrayList36.add(ry.l.D(new Integer[]{num, num2}, Integer.valueOf(dVar.f34421b)) ? courseWord10.getLuoMa() : courseWord10.getZhuYin());
                                    }
                                    ArrayList arrayList37 = new ArrayList();
                                    int size26 = arrayList36.size();
                                    int i37 = 0;
                                    while (i37 < size26) {
                                        Object obj29 = arrayList36.get(i37);
                                        i37++;
                                        if (((String) obj29).length() > 0) {
                                            arrayList37.add(obj29);
                                        }
                                    }
                                    ArrayList arrayList38 = new ArrayList(ry.n.W(arrayList37, 10));
                                    int size27 = arrayList37.size();
                                    int i38 = 0;
                                    while (i38 < size27) {
                                        Object obj30 = arrayList37.get(i38);
                                        i38++;
                                        String str2 = (String) obj30;
                                        qy.q qVar13 = fv.b.f28186a;
                                        arrayList38.add(new fv.a(1L, fv.b.k0(str2), fv.b.j0(str2)));
                                        num = num;
                                        num2 = num2;
                                    }
                                    num = num;
                                    num2 = num2;
                                    ArrayList arrayList39 = new ArrayList();
                                    int size28 = arrayList38.size();
                                    int i39 = 0;
                                    while (i39 < size28) {
                                        Object obj31 = arrayList38.get(i39);
                                        i39++;
                                        if (!new File(((fv.a) obj31).a()).exists()) {
                                            arrayList39.add(obj31);
                                        }
                                    }
                                    arrayList8.addAll(arrayList39);
                                    if (((fr.o0) n0Var2).f27733a.enableNativeSpeakerVideos && e1Var.a().c()) {
                                        if (xt.d.g(((fr.o0) n0Var2).p())) {
                                            qy.q qVar14 = fv.b.f28186a;
                                            fv.a aVar5 = new fv.a(12L, fv.b.d0(e1Var.b().c().getWordId()), fv.b.c0(e1Var.b().c().getWordId()));
                                            if (!new File(aVar5.a()).exists()) {
                                                arrayList8.add(aVar5);
                                            }
                                        }
                                        if (xt.d.w(((fr.o0) n0Var2).p())) {
                                            qy.q qVar15 = fv.b.f28186a;
                                            fv.a aVar6 = new fv.a(11L, fv.b.i0(e1Var.b().c().getWordId()), fv.b.h0(e1Var.b().c().getWordId()));
                                            if (!new File(aVar6.a()).exists()) {
                                                arrayList8.add(aVar6);
                                            }
                                        }
                                    }
                                }
                            } else {
                                num = num;
                                num2 = num2;
                                if (j1Var instanceof ot.f1) {
                                    if (iX != -1) {
                                        List listB2 = ((ot.f1) j1Var).f45813b.b();
                                        ArrayList arrayList40 = new ArrayList();
                                        for (Object obj32 : listB2) {
                                            String string2 = ((CourseWord) obj32).getAudioUri().toString();
                                            kotlin.jvm.internal.m.e(string2, "toString(...)");
                                            if (!oz.q.v0(string2, "-zy-", false)) {
                                                arrayList40.add(obj32);
                                            }
                                        }
                                        arrayList3 = new ArrayList();
                                        int size29 = arrayList40.size();
                                        int i40 = 0;
                                        while (i40 < size29) {
                                            Object obj33 = arrayList40.get(i40);
                                            i40++;
                                            CourseWord courseWord11 = (CourseWord) obj33;
                                            qy.q qVar16 = fv.b.f28186a;
                                            ry.m.d0(arrayList3, ns.o.L(new fv.a(fv.b.b0(courseWord11.getWordId()), defpackage.e.m(aVar.j(), fv.b.X(courseWord11.getWordId())), fv.b.X(courseWord11.getWordId())), new fv.a(fv.b.a0(courseWord11.getWordId()), defpackage.e.m(aVar.i(), fv.b.W(courseWord11.getWordId())), fv.b.W(courseWord11.getWordId()))));
                                        }
                                    } else {
                                        List listB3 = ((ot.f1) j1Var).f45813b.b();
                                        ArrayList arrayList41 = new ArrayList();
                                        for (Object obj34 : listB3) {
                                            String string3 = ((CourseWord) obj34).getAudioUri().toString();
                                            kotlin.jvm.internal.m.e(string3, "toString(...)");
                                            if (!oz.q.v0(string3, "-zy-", false)) {
                                                arrayList41.add(obj34);
                                            }
                                        }
                                        arrayList3 = new ArrayList(ry.n.W(arrayList41, 10));
                                        int size30 = arrayList41.size();
                                        int i41 = 0;
                                        while (i41 < size30) {
                                            Object obj35 = arrayList41.get(i41);
                                            i41++;
                                            CourseWord courseWord12 = (CourseWord) obj35;
                                            qy.q qVar17 = fv.b.f28186a;
                                            arrayList3.add(new fv.a(2L, fv.b.Z(courseWord12.getWordId()), fv.b.V(courseWord12.getWordId())));
                                        }
                                    }
                                    ArrayList arrayList42 = new ArrayList();
                                    int size31 = arrayList3.size();
                                    int i42 = 0;
                                    while (i42 < size31) {
                                        Object obj36 = arrayList3.get(i42);
                                        i42++;
                                        if (!new File(((fv.a) obj36).a()).exists()) {
                                            arrayList42.add(obj36);
                                        }
                                    }
                                    arrayList8.addAll(arrayList42);
                                } else if (j1Var instanceof ot.g1) {
                                    if (iX != -1) {
                                        List<CourseWord> listB4 = ((ot.g1) j1Var).f45826b.b();
                                        arrayList2 = new ArrayList();
                                        for (CourseWord courseWord13 : listB4) {
                                            qy.q qVar18 = fv.b.f28186a;
                                            ry.m.d0(arrayList2, ns.o.L(new fv.a(fv.b.b0(courseWord13.getWordId()), defpackage.e.m(aVar.j(), fv.b.X(courseWord13.getWordId())), fv.b.X(courseWord13.getWordId())), new fv.a(fv.b.a0(courseWord13.getWordId()), defpackage.e.m(aVar.i(), fv.b.W(courseWord13.getWordId())), fv.b.W(courseWord13.getWordId()))));
                                        }
                                    } else {
                                        List<CourseWord> listB5 = ((ot.g1) j1Var).f45826b.b();
                                        arrayList2 = new ArrayList(ry.n.W(listB5, 10));
                                        for (CourseWord courseWord14 : listB5) {
                                            qy.q qVar19 = fv.b.f28186a;
                                            arrayList2.add(new fv.a(2L, fv.b.Z(courseWord14.getWordId()), fv.b.V(courseWord14.getWordId())));
                                        }
                                    }
                                    ArrayList arrayList43 = new ArrayList();
                                    int size32 = arrayList2.size();
                                    int i43 = 0;
                                    while (i43 < size32) {
                                        Object obj37 = arrayList2.get(i43);
                                        i43++;
                                        if (!new File(((fv.a) obj37).a()).exists()) {
                                            arrayList43.add(obj37);
                                        }
                                    }
                                    arrayList8.addAll(arrayList43);
                                } else if (j1Var instanceof ot.h1) {
                                    ot.h1 h1Var = (ot.h1) j1Var;
                                    ArrayList arrayListC5 = ot.l1.c(h1Var.b(), dVar.f34421b, h1Var.a().c(), iX);
                                    ArrayList arrayList44 = new ArrayList();
                                    int size33 = arrayListC5.size();
                                    int i44 = 0;
                                    while (i44 < size33) {
                                        Object obj38 = arrayListC5.get(i44);
                                        i44++;
                                        if (!new File(((fv.a) obj38).a()).exists()) {
                                            arrayList44.add(obj38);
                                        }
                                    }
                                    arrayList8.addAll(arrayList44);
                                } else if (j1Var instanceof ot.z0) {
                                    ot.z0 z0Var = (ot.z0) j1Var;
                                    ArrayList arrayListC6 = ot.l1.c(z0Var.b(), dVar.f34421b, z0Var.a().c(), iX);
                                    ArrayList arrayList45 = new ArrayList();
                                    int size34 = arrayListC6.size();
                                    int i45 = 0;
                                    while (i45 < size34) {
                                        Object obj39 = arrayListC6.get(i45);
                                        i45++;
                                        if (!new File(((fv.a) obj39).a()).exists()) {
                                            arrayList45.add(obj39);
                                        }
                                    }
                                    arrayList8.addAll(arrayList45);
                                } else if (j1Var instanceof ot.l0) {
                                    String str3 = "m";
                                    if (iX != -1) {
                                        List listB6 = ((ot.l0) j1Var).f45883b.b();
                                        arrayList = new ArrayList();
                                        for (Iterator it2 = listB6.iterator(); it2.hasNext(); it2 = it2) {
                                            CourseWord courseWord15 = (CourseWord) it2.next();
                                            qy.q qVar20 = fv.b.f28186a;
                                            ry.m.d0(arrayList, ns.o.L(new fv.a(fv.b.A(courseWord15.getWordId()), defpackage.e.m(aVar.j(), fv.g.m(courseWord15.getWordId(), str3)), fv.g.m(courseWord15.getWordId(), str3)), new fv.a(fv.b.z(courseWord15.getWordId()), defpackage.e.m(aVar.i(), fv.g.m(courseWord15.getWordId(), "f")), fv.g.m(courseWord15.getWordId(), "f"))));
                                            n0Var2 = n0Var2;
                                            str3 = str3;
                                        }
                                        n0Var = n0Var2;
                                    } else {
                                        n0Var = n0Var2;
                                        List<CourseWord> listB7 = ((ot.l0) j1Var).f45883b.b();
                                        arrayList = new ArrayList(ry.n.W(listB7, 10));
                                        for (CourseWord courseWord16 : listB7) {
                                            qy.q qVar21 = fv.b.f28186a;
                                            arrayList.add(new fv.a(2L, fv.b.y(courseWord16.getWordId()), fv.g.m(courseWord16.getWordId(), fv.b.w().d(null, null) ? "m" : "f")));
                                        }
                                    }
                                    ArrayList arrayList46 = new ArrayList();
                                    int size35 = arrayList.size();
                                    int i46 = 0;
                                    while (i46 < size35) {
                                        Object obj40 = arrayList.get(i46);
                                        i46++;
                                        if (!new File(((fv.a) obj40).a()).exists()) {
                                            arrayList46.add(obj40);
                                        }
                                    }
                                    arrayList8.addAll(arrayList46);
                                } else {
                                    n0Var = n0Var2;
                                    if (j1Var instanceof ot.j0) {
                                        ArrayList arrayListB = ot.l1.b(((ot.j0) j1Var).b(), ((fr.o0) n0Var).p());
                                        ArrayList arrayList47 = new ArrayList();
                                        int size36 = arrayListB.size();
                                        int i47 = 0;
                                        while (i47 < size36) {
                                            Object obj41 = arrayListB.get(i47);
                                            i47++;
                                            if (!new File(((fv.a) obj41).a()).exists()) {
                                                arrayList47.add(obj41);
                                            }
                                        }
                                        arrayList8.addAll(arrayList47);
                                    }
                                }
                            }
                            n0Var = n0Var2;
                        }
                    }
                    num = num;
                    num2 = num2;
                    n0Var = n0Var2;
                }
                n0Var2 = n0Var;
                num = num;
                dVar2 = dVar;
                aVarA = aVar;
                num2 = num2;
            }
            aVar = aVarA;
            dVar = dVar2;
            n0Var = n0Var2;
            n0Var2 = n0Var;
            num = num;
            dVar2 = dVar;
            aVarA = aVar;
            num2 = num2;
        }
        return ot.l1.h(dVar2.f34421b, arrayList8);
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38273a) {
            case 0:
                return new s0((t0) this.f38274b, dVar, 0);
            case 1:
                return new s0((kr.g0) this.f38274b, dVar, 1);
            case 2:
                return new s0((kr.r1) this.f38274b, dVar, 2);
            case 3:
                return new s0((mu.x) this.f38274b, dVar, 3);
            case 4:
                return new s0((rt.f2) this.f38274b, dVar, 4);
            case 5:
                return new s0((e3) this.f38274b, dVar, 5);
            case 6:
                return new s0((n9.z) this.f38274b, dVar, 6);
            case 7:
                return new s0((l1.a1) this.f38274b, dVar, 7);
            case 8:
                return new s0((ph.s) this.f38274b, dVar, 8);
            case 9:
                return new s0((ni.m) this.f38274b, dVar, 9);
            case 10:
                return new s0((ij.d) this.f38274b, dVar, 10);
            case 11:
                return new s0((po.a) this.f38274b, dVar, 11);
            case 12:
                return new s0((ob.p) this.f38274b, dVar, 12);
            case 13:
                return new s0((tu.m0) this.f38274b, dVar, 13);
            case 14:
                return new s0((l1.g1) this.f38274b, dVar, 14);
            case 15:
                return new s0((xg.d) this.f38274b, dVar, 15);
            case 16:
                return new s0((fz.c) this.f38274b, dVar, 16);
            case 17:
                return new s0((yb.e) this.f38274b, dVar, 17);
            case 18:
                return new s0((av.n) this.f38274b, dVar, 18);
            case 19:
                return new s0((jd) this.f38274b, dVar, 19);
            case 20:
                return new s0((zu.q) this.f38274b, dVar, 20);
            default:
                return new s0((s2) this.f38274b, dVar, 21);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38273a) {
            case 0:
                s0 s0Var = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                s0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                s0 s0Var2 = (s0) create((tt.a) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                s0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                return ((s0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                s0 s0Var3 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var3 = qy.b0.f48488a;
                s0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 4:
                return ((s0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                s0 s0Var4 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var4 = qy.b0.f48488a;
                s0Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 6:
                s0 s0Var5 = (s0) create((uz.j) obj, (vy.d) obj2);
                qy.b0 b0Var5 = qy.b0.f48488a;
                s0Var5.invokeSuspend(b0Var5);
                return b0Var5;
            case 7:
                s0 s0Var6 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var6 = qy.b0.f48488a;
                s0Var6.invokeSuspend(b0Var6);
                return b0Var6;
            case 8:
                s0 s0Var7 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var7 = qy.b0.f48488a;
                s0Var7.invokeSuspend(b0Var7);
                return b0Var7;
            case 9:
                s0 s0Var8 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var8 = qy.b0.f48488a;
                s0Var8.invokeSuspend(b0Var8);
                return b0Var8;
            case 10:
                return ((s0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                ((s0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
                return null;
            case 12:
                s0 s0Var9 = (s0) create((kb.c) obj, (vy.d) obj2);
                qy.b0 b0Var9 = qy.b0.f48488a;
                s0Var9.invokeSuspend(b0Var9);
                return b0Var9;
            case 13:
                s0 s0Var10 = (s0) create((qy.b0) obj, (vy.d) obj2);
                qy.b0 b0Var10 = qy.b0.f48488a;
                s0Var10.invokeSuspend(b0Var10);
                return b0Var10;
            case 14:
                s0 s0Var11 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var11 = qy.b0.f48488a;
                s0Var11.invokeSuspend(b0Var11);
                return b0Var11;
            case 15:
                s0 s0Var12 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var12 = qy.b0.f48488a;
                s0Var12.invokeSuspend(b0Var12);
                return b0Var12;
            case 16:
                s0 s0Var13 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var13 = qy.b0.f48488a;
                s0Var13.invokeSuspend(b0Var13);
                return b0Var13;
            case 17:
                return ((s0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                s0 s0Var14 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var14 = qy.b0.f48488a;
                s0Var14.invokeSuspend(b0Var14);
                return b0Var14;
            case 19:
                s0 s0Var15 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var15 = qy.b0.f48488a;
                s0Var15.invokeSuspend(b0Var15);
                return b0Var15;
            case 20:
                s0 s0Var16 = (s0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var16 = qy.b0.f48488a;
                s0Var16.invokeSuspend(b0Var16);
                return b0Var16;
            default:
                s0 s0Var17 = (s0) create((tt.a) obj, (vy.d) obj2);
                qy.b0 b0Var17 = qy.b0.f48488a;
                s0Var17.invokeSuspend(b0Var17);
                return b0Var17;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        zu.n0 n0Var = null;
        Object[] objArr = 0;
        switch (this.f38273a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                t0 t0Var = (t0) this.f38274b;
                t0Var.u().hasFindPerfectTime = Boolean.TRUE;
                t0Var.u().updateEntry("hasFindPerfectTime");
                t0Var.u().learnAlarmTime = new SimpleDateFormat("HH:mm").format(new Date(System.currentTimeMillis()));
                t0Var.u().updateEntry("learnAlarmTime");
                er.c.h();
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                kr.g0 g0Var = (kr.g0) this.f38274b;
                av.n nVar = g0Var.f38465c;
                vt.n0 n0Var2 = g0Var.f38463a;
                nVar.m(((fr.o0) n0Var2).f27733a.audioSpeed / 100.0f, true);
                uz.i1 i1Var = g0Var.f38467e;
                do {
                    value = i1Var.getValue();
                    objA = (kr.e0) value;
                    if (objA instanceof kr.d0) {
                        kr.d0 d0Var = (kr.d0) objA;
                        Env env = ((fr.o0) n0Var2).f27733a;
                        objA = kr.d0.a(d0Var, 0, 0, false, 0L, 0L, env.showStoryTrans, env.audioSpeed, null, false, false, false, false, 15999);
                    }
                } while (!i1Var.j(value, objA));
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                qy.q qVar = fv.b.f28186a;
                int i11 = ((kr.r1) this.f38274b).f38572b;
                List listL = ns.o.L(new fv.a(4L, fv.b.P(i11), fv.b.O(i11)), new fv.a(5L, fv.g.u(i11), fv.b.K(i11)));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listL) {
                    if (!new File(((fv.a) obj2).f28184c).exists()) {
                        arrayList.add(obj2);
                    }
                }
                return ry.m.c1(arrayList);
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((mu.x) this.f38274b).a(new mu.a());
                return qy.b0.f48488a;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                rt.f2 f2Var = (rt.f2) this.f38274b;
                int i12 = f2Var.f49718i;
                List list = f2Var.f49710a;
                List listU0 = f2Var.f49712c;
                boolean z11 = f2Var.f49719j;
                int i13 = f2Var.f49721l;
                int i14 = i12 / 2;
                int iMin = Math.min(i14, list.size());
                if (z11) {
                    listU0 = ns.o.S(listU0);
                }
                if (i13 != Integer.MAX_VALUE) {
                    listU0 = ry.m.U0(listU0, i13);
                }
                int iMin2 = Math.min(i14, listU0.size());
                List listU1 = ry.m.U0(list, iMin);
                List listU2 = ry.m.U0(listU0, iMin2);
                int size = i12 - (listU2.size() + listU1.size());
                if (size <= 0) {
                    return ry.m.H0(listU1, listU2);
                }
                List listU3 = ry.m.U0(ry.m.k0(list, iMin), size);
                if (listU3.size() < size) {
                    return ry.m.H0(ry.m.H0(ry.m.H0(listU1, listU2), listU3), ry.m.U0(ry.m.k0(listU0, iMin2), size - listU3.size()));
                }
                return ry.m.H0(ry.m.H0(listU1, listU2), listU3);
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                e3 e3Var = (e3) this.f38274b;
                if (!((ae) e3Var.B0.f53391a.getValue()).f49466a) {
                    rz.e0.B(ViewModelKt.getViewModelScope(e3Var), null, null, new hs.f(e3Var, null), 3);
                }
                return qy.b0.f48488a;
            case 6:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((n9.z) this.f38274b).getClass();
                return qy.b0.f48488a;
            case 7:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1.a1 a1Var = (l1.a1) this.f38274b;
                ((l1.h1) a1Var).m(((l1.h1) a1Var).l() + 1);
                return qy.b0.f48488a;
            case 8:
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var2 = ((ph.s) this.f38274b).f46913b;
                i1Var2.l(null, ph.p.a((ph.p) i1Var2.getValue(), null, false, null, 7));
                return qy.b0.f48488a;
            case 9:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Calendar calendar = Calendar.getInstance();
                calendar.add(6, 5);
                String str = new SimpleDateFormat("M d", Locale.getDefault()).format(calendar.getTime());
                ni.m mVar = (ni.m) this.f38274b;
                uz.i1 i1Var3 = mVar.Q;
                kotlin.jvm.internal.m.c(str);
                qy.l lVar = new qy.l(new Integer(Integer.parseInt((String) oz.q.W0(str, new String[]{" "}, 0, 6).get(0))), new Integer(Integer.parseInt((String) oz.q.W0(str, new String[]{" "}, 0, 6).get(1))));
                i1Var3.getClass();
                i1Var3.l(null, lVar);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(6, 7);
                String str2 = new SimpleDateFormat("M d", Locale.getDefault()).format(calendar2.getTime());
                uz.i1 i1Var4 = mVar.R;
                kotlin.jvm.internal.m.c(str2);
                qy.l lVar2 = new qy.l(new Integer(Integer.parseInt((String) oz.q.W0(str2, new String[]{" "}, 0, 6).get(0))), new Integer(Integer.parseInt((String) oz.q.W0(str2, new String[]{" "}, 0, 6).get(1))));
                i1Var4.getClass();
                i1Var4.l(null, lVar2);
                return qy.b0.f48488a;
            case 10:
                return e(obj);
            case 11:
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((po.a) this.f38274b).getClass();
                return null;
            case 12:
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                int i15 = rb.f.f49073a;
                ob.p pVar = (ob.p) this.f38274b;
                fb.l lVarB = fb.l.b();
                Objects.toString(pVar);
                lVarB.getClass();
                return qy.b0.f48488a;
            case 13:
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((tu.m0) this.f38274b).c();
                return qy.b0.f48488a;
            case 14:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((l1.g1) this.f38274b).m(1.0f);
                return qy.b0.f48488a;
            case 15:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                f.p.a((xg.d) this.f38274b, p20.c.g(0, 0), new f.h0(0, 0, 1, f.g0.f26148d));
                return qy.b0.f48488a;
            case 16:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((fz.c) this.f38274b).invoke(xu.s0.f56512a);
                return qy.b0.f48488a;
            case 17:
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                yb.e eVar = (yb.e) this.f38274b;
                synchronized (eVar) {
                    try {
                        if (!eVar.N || eVar.O) {
                            return qy.b0.f48488a;
                        }
                        try {
                            eVar.q();
                            break;
                        } catch (IOException unused) {
                            eVar.P = true;
                        }
                        try {
                            if (eVar.K >= 2000) {
                                eVar.x();
                            }
                            break;
                        } catch (IOException unused2) {
                            eVar.Q = true;
                            eVar.L = m00.b.b(new m00.f());
                        }
                        return qy.b0.f48488a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 18:
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                av.n nVar2 = (av.n) this.f38274b;
                re.e0 e0Var = new re.e0(15);
                nVar2.getClass();
                nVar2.f3172c = e0Var;
                nVar2.n();
                return qy.b0.f48488a;
            case 19:
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                jd jdVar = (jd) this.f38274b;
                if (!jdVar.L) {
                    jdVar.L = true;
                    jdVar.M = false;
                    jdVar.N = false;
                    uz.i1 i1Var5 = jdVar.f49945e;
                    gd gdVar = gd.f49798a;
                    i1Var5.getClass();
                    i1Var5.l(null, gdVar);
                    rz.z1 z1Var = jdVar.K;
                    if (z1Var != null) {
                        z1Var.cancel(null);
                    }
                    jdVar.K = rz.e0.B(ViewModelKt.getViewModelScope(jdVar), null, null, new ns.j(jdVar, objArr == true ? 1 : 0, 26), 3);
                }
                return qy.b0.f48488a;
            case 20:
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                uz.i1 i1Var6 = ((zu.q) this.f38274b).f59535f;
                do {
                    value2 = i1Var6.getValue();
                } while (!i1Var6.j(value2, zu.a.Idle));
                return qy.b0.f48488a;
            default:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                s2 s2Var = (s2) this.f38274b;
                zu.y0 y0Var = (zu.y0) s2Var.L.getValue();
                if (kotlin.jvm.internal.m.a(y0Var, zu.u0.f59565a)) {
                    n0Var = zu.l0.f59488a;
                } else if (kotlin.jvm.internal.m.a(y0Var, zu.w0.f59570a)) {
                    n0Var = zu.m0.f59490a;
                }
                if (n0Var != null) {
                    s2Var.a(n0Var);
                }
                return qy.b0.f48488a;
        }
    }
}
