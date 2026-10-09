package rt;

import android.media.session.MediaSession;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseUnit;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.UnitState;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r5 extends ViewModel {
    public final fv.c H;
    public final vt.h1 K;
    public final b6 L;
    public final uz.i1 M;
    public final uz.r0 N;
    public rz.z1 O;
    public rz.z1 P;
    public rz.z1 Q;
    public long R;
    public boolean S;
    public z4 T;
    public Object U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.m f50332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rs.b f50333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.b0 f50334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.c f50335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vt.n0 f50336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final av.n f50337f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o4 f50338t;

    public r5(wt.m mVar, rs.b bVar, wt.b0 b0Var, vt.c cVar, vt.n0 n0Var, av.n nVar, o4 o4Var, fv.c cVar2, vt.h1 h1Var) {
        this.f50332a = mVar;
        this.f50333b = bVar;
        this.f50334c = b0Var;
        this.f50335d = cVar;
        this.f50336e = n0Var;
        this.f50337f = nVar;
        this.f50338t = o4Var;
        this.H = cVar2;
        this.K = h1Var;
        this.L = new b6(n0Var, nVar, cVar2);
        uz.i1 i1VarC = uz.x0.c(a5.f49439a);
        this.M = i1VarC;
        this.N = new uz.r0(i1VarC);
        this.U = ry.r.f50854a;
        o4Var.f50184b = new lp.j(this, 27);
        vy.d dVar = null;
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new bp.t3(this, dVar, 16), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new j5(1, this, dVar), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new j5(2, this, dVar), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object a(r5 r5Var, List list, long j11, xy.c cVar) {
        f5 f5Var;
        List list2;
        long j12;
        if (cVar instanceof f5) {
            f5Var = (f5) cVar;
            int i11 = f5Var.f49734e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                f5Var.f49734e = i11 - Integer.MIN_VALUE;
            } else {
                f5Var = new f5(r5Var, cVar);
            }
        } else {
            f5Var = new f5(r5Var, cVar);
        }
        f5 f5Var2 = f5Var;
        Object objM = f5Var2.f49732c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = f5Var2.f49734e;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            yz.f fVar = rz.o0.f50940a;
            yz.e eVar = yz.e.f58387a;
            nu.b bVar = new nu.b(4, list, r5Var, dVar);
            f5Var2.f49730a = list;
            f5Var2.f49731b = j11;
            f5Var2.f49734e = 1;
            objM = rz.e0.M(eVar, bVar, f5Var2);
            if (objM != aVar) {
                list2 = list;
                j12 = j11;
            }
            return aVar;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objM);
            return b0Var;
        }
        j12 = f5Var2.f49731b;
        List list3 = f5Var2.f49730a;
        com.bumptech.glide.e.F(objM);
        list2 = list3;
        List list4 = (List) objM;
        if (j12 == r5Var.R) {
            fv.c cVar2 = r5Var.H;
            au.j jVar = new au.j(4, j12, r5Var, list2);
            f5Var2.f49730a = null;
            f5Var2.f49731b = j12;
            f5Var2.f49734e = 2;
            if (ia.a(cVar2, list4, jVar, f5Var2) == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0151  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x0182  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0210  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x021b  */
    /* JADX WARN: Code duplicated, block: B:86:0x011b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object b(r5 r5Var, xy.c cVar) {
        h5 h5Var;
        int i11;
        List courseUnits;
        List reviews;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i12;
        int i13;
        LinkedHashMap linkedHashMap;
        int size2;
        int i14;
        ArrayList arrayList3;
        int size3;
        int i15;
        LinkedHashMap linkedHashMap2;
        int size4;
        ArrayList arrayList4;
        List list;
        int size5;
        List list2;
        int size6;
        d5 d5Var;
        Long lValueOf;
        Object arrayList5;
        Object obj;
        Long lValueOf2;
        Object arrayList6;
        Object obj2;
        if (cVar instanceof h5) {
            h5Var = (h5) cVar;
            int i16 = h5Var.f49831e;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                h5Var.f49831e = i16 - Integer.MIN_VALUE;
            } else {
                h5Var = new h5(r5Var, cVar);
            }
        } else {
            h5Var = new h5(r5Var, cVar);
        }
        Object objU = h5Var.f49829c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i17 = h5Var.f49831e;
        ry.r rVar = ry.r.f50854a;
        if (i17 == 0) {
            com.bumptech.glide.e.F(objU);
            i11 = ((fr.o0) r5Var.f50336e).f27733a.keyLanguage;
            no.g gVar = r5Var.f50332a.f55321n;
            h5Var.f49827a = i11;
            h5Var.f49831e = 1;
            objU = uz.x0.u(gVar, h5Var);
            if (objU != aVar) {
            }
            return aVar;
        }
        if (i17 == 1) {
            i11 = h5Var.f49827a;
            com.bumptech.glide.e.F(objU);
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            courseUnits = h5Var.f49828b;
            com.bumptech.glide.e.F(objU);
        }
        reviews = (List) objU;
        kotlin.jvm.internal.m.f(courseUnits, "courseUnits");
        kotlin.jvm.internal.m.f(reviews, "reviews");
        arrayList = new ArrayList();
        for (Object obj3 : reviews) {
            if (!((SRSStatus) obj3).isExcludedFromReview()) {
                arrayList.add(obj3);
            }
        }
        arrayList2 = new ArrayList();
        size = arrayList.size();
        i12 = 0;
        i13 = 0;
        while (i13 < size) {
            obj2 = arrayList.get(i13);
            i13++;
            if (((SRSStatus) obj2).getElemType() == x8.SENTENCE.a()) {
                arrayList2.add(obj2);
            }
        }
        linkedHashMap = new LinkedHashMap();
        size2 = arrayList2.size();
        i14 = 0;
        while (i14 < size2) {
            Object obj4 = arrayList2.get(i14);
            i14++;
            lValueOf2 = Long.valueOf(((SRSStatus) obj4).getUnitId());
            arrayList6 = linkedHashMap.get(lValueOf2);
            if (arrayList6 == null) {
                arrayList6 = new ArrayList();
                linkedHashMap.put(lValueOf2, arrayList6);
            }
            ((List) arrayList6).add(obj4);
        }
        arrayList3 = new ArrayList();
        size3 = arrayList.size();
        i15 = 0;
        while (i15 < size3) {
            obj = arrayList.get(i15);
            i15++;
            if (((SRSStatus) obj).getElemType() == x8.WORD.a()) {
                arrayList3.add(obj);
            }
        }
        linkedHashMap2 = new LinkedHashMap();
        size4 = arrayList3.size();
        while (i12 < size4) {
            Object obj5 = arrayList3.get(i12);
            i12++;
            lValueOf = Long.valueOf(((SRSStatus) obj5).getUnitId());
            arrayList5 = linkedHashMap2.get(lValueOf);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap2.put(lValueOf, arrayList5);
            }
            ((List) arrayList5).add(obj5);
        }
        List<CourseUnit> listS0 = ry.m.S0(courseUnits, new gu.g(23));
        arrayList4 = new ArrayList();
        for (CourseUnit courseUnit : listS0) {
            list = (List) linkedHashMap.get(Long.valueOf(courseUnit.getUnitId()));
            if (list == null) {
                list = rVar;
            }
            size5 = list.size();
            list2 = (List) linkedHashMap2.get(Long.valueOf(courseUnit.getUnitId()));
            if (list2 == null) {
                list2 = rVar;
            }
            size6 = list2.size();
            if (size5 == 0 || size6 != 0) {
                d5Var = new d5(courseUnit.getUnitId(), courseUnit.getSortIndex(), courseUnit.getUnitName(), size5, size6, false, false);
            } else {
                d5Var = null;
            }
            if (d5Var != null) {
                arrayList4.add(d5Var);
            }
        }
        return new z4(arrayList4, linkedHashMap, linkedHashMap2);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj6 : (Iterable) objU) {
            CourseUnit courseUnit2 = (CourseUnit) obj6;
            if (courseUnit2.getUnitState() != UnitState.StateLocked && !courseUnit2.isTestOut()) {
                arrayList7.add(obj6);
            }
        }
        List listS1 = ry.m.S0(arrayList7, new gu.g(25));
        if (!listS1.isEmpty()) {
            wt.b0 b0Var = r5Var.f50334c;
            List listL = ns.o.L(new Integer(x8.SENTENCE.a()), new Integer(x8.WORD.a()));
            ArrayList arrayList8 = new ArrayList(ry.n.W(listS1, 10));
            Iterator it = listS1.iterator();
            while (it.hasNext()) {
                b7.e0.x(((CourseUnit) it.next()).getUnitId(), arrayList8);
            }
            gp.r rVarG = b0Var.g(i11, listL, arrayList8);
            h5Var.f49828b = listS1;
            h5Var.f49827a = i11;
            h5Var.f49831e = 2;
            Object objU2 = uz.x0.u(rVarG, h5Var);
            if (objU2 != aVar) {
                objU = objU2;
                courseUnits = listS1;
                reviews = (List) objU;
            }
            return aVar;
        }
        courseUnits = listS1;
        reviews = rVar;
        kotlin.jvm.internal.m.f(courseUnits, "courseUnits");
        kotlin.jvm.internal.m.f(reviews, "reviews");
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            if (!((SRSStatus) obj3).isExcludedFromReview()) {
                arrayList.add(obj3);
            }
        }
        arrayList2 = new ArrayList();
        size = arrayList.size();
        i12 = 0;
        i13 = 0;
        while (i13 < size) {
            obj2 = arrayList.get(i13);
            i13++;
            if (((SRSStatus) obj2).getElemType() == x8.SENTENCE.a()) {
                arrayList2.add(obj2);
            }
        }
        linkedHashMap = new LinkedHashMap();
        size2 = arrayList2.size();
        i14 = 0;
        while (i14 < size2) {
            Object obj7 = arrayList2.get(i14);
            i14++;
            lValueOf2 = Long.valueOf(((SRSStatus) obj7).getUnitId());
            arrayList6 = linkedHashMap.get(lValueOf2);
            if (arrayList6 == null) {
                arrayList6 = new ArrayList();
                linkedHashMap.put(lValueOf2, arrayList6);
            }
            ((List) arrayList6).add(obj7);
        }
        arrayList3 = new ArrayList();
        size3 = arrayList.size();
        i15 = 0;
        while (i15 < size3) {
            obj = arrayList.get(i15);
            i15++;
            if (((SRSStatus) obj).getElemType() == x8.WORD.a()) {
                arrayList3.add(obj);
            }
        }
        linkedHashMap2 = new LinkedHashMap();
        size4 = arrayList3.size();
        while (i12 < size4) {
            Object obj8 = arrayList3.get(i12);
            i12++;
            lValueOf = Long.valueOf(((SRSStatus) obj8).getUnitId());
            arrayList5 = linkedHashMap2.get(lValueOf);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap2.put(lValueOf, arrayList5);
            }
            ((List) arrayList5).add(obj8);
        }
        List<CourseUnit> listS2 = ry.m.S0(courseUnits, new gu.g(23));
        arrayList4 = new ArrayList();
        while (r0.hasNext()) {
            list = (List) linkedHashMap.get(Long.valueOf(courseUnit.getUnitId()));
            if (list == null) {
                list = rVar;
            }
            size5 = list.size();
            list2 = (List) linkedHashMap2.get(Long.valueOf(courseUnit.getUnitId()));
            if (list2 == null) {
                list2 = rVar;
            }
            size6 = list2.size();
            if (size5 == 0) {
                d5Var = new d5(courseUnit.getUnitId(), courseUnit.getSortIndex(), courseUnit.getUnitName(), size5, size6, false, false);
            } else {
                d5Var = new d5(courseUnit.getUnitId(), courseUnit.getSortIndex(), courseUnit.getUnitName(), size5, size6, false, false);
            }
            if (d5Var != null) {
                arrayList4.add(d5Var);
            }
        }
        return new z4(arrayList4, linkedHashMap, linkedHashMap2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable c(r5 r5Var, List list, xy.c cVar) {
        i5 i5Var;
        WordSentenceCharacterType wordSentenceCharacterType;
        WordSentenceCharacterType wordType;
        if (cVar instanceof i5) {
            i5Var = (i5) cVar;
            int i11 = i5Var.f49874d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i5Var.f49874d = i11 - Integer.MIN_VALUE;
            } else {
                i5Var = new i5(r5Var, cVar);
            }
        } else {
            i5Var = new i5(r5Var, cVar);
        }
        Object objD = i5Var.f49872b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = i5Var.f49874d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objD);
            rs.b bVar = r5Var.f50333b;
            ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((u4) it.next()).f50474c);
            }
            rs.a aVarC = rs.c.c(arrayList);
            i5Var.f49871a = list;
            i5Var.f49874d = 1;
            objD = ((bh.s1) bVar).d(aVarC, i5Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = i5Var.f49871a;
            com.bumptech.glide.e.F(objD);
        }
        rs.d dVar = (rs.d) objD;
        ArrayList arrayList2 = new ArrayList();
        for (u4 u4Var : list) {
            SRSStatus sRSStatus = u4Var.f50474c;
            int elemType = sRSStatus.getElemType();
            if (elemType == x8.SENTENCE.a()) {
                CourseSentence courseSentence = (CourseSentence) dVar.f49399b.get(new Long(sRSStatus.getElemId()));
                if (courseSentence != null) {
                    wordType = new WordSentenceCharacterType.SentenceType(courseSentence);
                } else {
                    wordType = null;
                }
                wordSentenceCharacterType = wordType;
            } else if (elemType == x8.WORD.a()) {
                CourseWord courseWord = (CourseWord) dVar.f49398a.get(new Long(sRSStatus.getElemId()));
                if (courseWord != null) {
                    wordType = new WordSentenceCharacterType.WordType(courseWord);
                } else {
                    wordType = null;
                }
                wordSentenceCharacterType = wordType;
            } else {
                wordSentenceCharacterType = null;
            }
            t4 t4Var = wordSentenceCharacterType != null ? new t4(sRSStatus.getElemType() + "_" + sRSStatus.getElemId(), u4Var.f50472a, u4Var.f50473b, wordSentenceCharacterType) : null;
            if (t4Var != null) {
                arrayList2.add(t4Var);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object d(r5 r5Var, boolean z11, vy.d dVar) {
        n5 n5Var;
        int i11;
        ArrayList arrayList;
        Object value;
        Object objA;
        boolean z12 = z11;
        uz.i1 i1Var = r5Var.M;
        if (dVar instanceof n5) {
            n5Var = (n5) dVar;
            int i12 = n5Var.f50127f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                n5Var.f50127f = i12 - Integer.MIN_VALUE;
            } else {
                n5Var = new n5(r5Var, dVar);
            }
        } else {
            n5Var = new n5(r5Var, dVar);
        }
        Object obj = n5Var.f50125d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i13 = n5Var.f50127f;
        if (i13 == 0) {
            com.bumptech.glide.e.F(obj);
            Object value2 = i1Var.getValue();
            b5 b5Var = value2 instanceof b5 ? (b5) value2 : null;
            if (b5Var != null) {
                int i14 = b5Var.f49508a;
                ArrayList arrayListG = g(i14, b5Var.f49510c, z12);
                ArrayList arrayList2 = new ArrayList(ry.n.W(arrayListG, 10));
                int size = arrayListG.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj2 = arrayListG.get(i15);
                    i15++;
                    d5 d5VarA = (d5) obj2;
                    if (!d5VarA.f49618f) {
                        d5VarA = d5.a(d5VarA, 0, 0, false, false, 63);
                    }
                    arrayList2.add(d5VarA);
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList2.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj3 = arrayList2.get(i16);
                    i16++;
                    d5 d5Var = (d5) obj3;
                    if (d5Var.f49619g && d5Var.f49618f) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(ry.n.W(arrayList3, 10));
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj4 = arrayList3.get(i17);
                    i17++;
                    b7.e0.x(((d5) obj4).f49613a, arrayList4);
                }
                Set setF1 = ry.m.f1(arrayList4);
                int i18 = (!b5Var.f49509b || z12 || (b5Var.f49513f.isEmpty() && b5Var.f49516i == null)) ? 0 : 1;
                if (i18 != 0) {
                    r5Var.j();
                    rz.z1 z1Var = r5Var.O;
                    if (z1Var != null) {
                        z1Var.cancel(null);
                    }
                    r5Var.f50337f.n();
                    r5Var.f50338t.f50185c.cancel(1042);
                }
                vt.n0 n0Var = r5Var.f50336e;
                n5Var.f50123b = arrayList2;
                n5Var.f50122a = z12;
                n5Var.f50124c = i18;
                n5Var.f50127f = 1;
                if (((fr.o0) n0Var).T(i14, setF1, n5Var) == aVar) {
                    return aVar;
                }
                i11 = i18;
                arrayList = arrayList2;
            }
            return qy.b0.f48488a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = n5Var.f50124c;
        z12 = n5Var.f50122a;
        ArrayList arrayList5 = n5Var.f50123b;
        com.bumptech.glide.e.F(obj);
        arrayList = arrayList5;
        boolean z13 = z12;
        do {
            value = i1Var.getValue();
            objA = (c5) value;
            if (objA instanceof b5) {
                b5 b5Var2 = (b5) objA;
                objA = b5.a(b5Var2, z13, arrayList, null, null, i11 != 0 ? ry.r.f50854a : b5Var2.f49513f, i11 != 0 ? 0 : b5Var2.f49514g, i11 != 0 ? v4.IDLE : b5Var2.f49515h, i11 != 0 ? null : b5Var2.f49516i, 25);
            }
        } while (!i1Var.j(value, objA));
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x021b  */
    /* JADX WARN: Code duplicated, block: B:104:0x023d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0245  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0150  */
    /* JADX WARN: Code duplicated, block: B:55:0x0155  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:61:0x0185  */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:65:0x018d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0193  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba A[PHI: r1 r6 r7 r8 r9 r10 r11 r13 r15
      0x01ba: PHI (r1v17 rt.t4) = (r1v22 rt.t4), (r1v38 rt.t4) binds: [B:66:0x0191, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r6v4 int) = (r6v7 int), (r6v16 int) binds: [B:66:0x0191, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r7v3 ??) = (r7v20 ??), (r7v21 ??) binds: [B:66:0x0191, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r8v5 int) = (r8v9 int), (r8v20 int) binds: [B:66:0x0191, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r9v7 int) = (r9v10 int), (r9v23 int) binds: [B:66:0x0191, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r10v7 int) = (r10v10 int), (r10v20 int) binds: [B:66:0x0191, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r11v1 int) = (r11v4 int), (r11v17 int) binds: [B:66:0x0191, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r13v4 qy.b0) = (r13v21 qy.b0), (r13v0 qy.b0) binds: [B:66:0x0191, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x01ba: PHI (r15v0 kotlin.jvm.internal.w) = (r15v4 kotlin.jvm.internal.w), (r15v10 kotlin.jvm.internal.w) binds: [B:66:0x0191, B:17:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:93:0x0200  */
    /* JADX WARN: Code duplicated, block: B:96:0x0208  */
    /* JADX WARN: Code duplicated, block: B:97:0x020f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0211  */
    /* JADX WARN: Code duplicated, block: B:99:0x0218  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v9, types: [rt.b5] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [rt.b5] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [rt.b5, rt.t4] */
    /* JADX WARN: Type inference failed for: r1v23, types: [rt.b5] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [rt.b5] */
    /* JADX WARN: Type inference failed for: r28v0, types: [rt.r5] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7, types: [rt.b5] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x023d -> B:105:0x0240). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0245 -> B:106:0x0241). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0139 -> B:48:0x0143). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object f(rt.r5 r28, int r29, xy.c r30) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.r5.f(rt.r5, int, xy.c):java.lang.Object");
    }

    public static ArrayList g(int i11, List list, boolean z11) {
        ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d5 d5Var = (d5) it.next();
            arrayList.add(d5.a(d5Var, 0, 0, fb.g0.g(i11, d5Var.f49614b, z11), false, 95));
        }
        return arrayList;
    }

    public static fv.a h(WordSentenceCharacterType wordSentenceCharacterType, vt.n0 n0Var) {
        xt.a aVarA = xt.b.a();
        int iX = ((fr.o0) n0Var).x();
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType) {
            qy.q qVar = fv.b.f28186a;
            WordSentenceCharacterType.CharacterType characterType = (WordSentenceCharacterType.CharacterType) wordSentenceCharacterType;
            return new fv.a(1L, fv.b.k0(characterType.getCharacter().getZhuYin()), fv.b.j0(characterType.getCharacter().getZhuYin()));
        }
        if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
            long sentenceId = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getSentenceId();
            if (iX == -1) {
                return new fv.a(2L, fv.b.H(sentenceId), fv.b.F(sentenceId));
            }
            if (xt.b.e().d(Long.valueOf(sentenceId), null)) {
                qy.q qVar2 = fv.b.f28186a;
                return new fv.a(fv.g.b(sentenceId, "m"), defpackage.e.m(aVarA.j(), fv.g.r(sentenceId, "m")), fv.g.r(sentenceId, "m"));
            }
            qy.q qVar3 = fv.b.f28186a;
            return new fv.a(fv.g.b(sentenceId, "f"), defpackage.e.m(aVarA.i(), fv.g.r(sentenceId, "f")), fv.g.r(sentenceId, "f"));
        }
        if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType)) {
            throw new NoWhenBranchMatchedException();
        }
        long wordId = ((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getWordId();
        if (iX == -1) {
            return new fv.a(2L, fv.b.Z(wordId), fv.b.V(wordId));
        }
        if (xt.b.e().d(Long.valueOf(wordId), null)) {
            qy.q qVar4 = fv.b.f28186a;
            return new fv.a(fv.g.c(wordId, "m"), defpackage.e.m(aVarA.j(), fv.g.z(wordId, "m")), fv.g.z(wordId, "m"));
        }
        qy.q qVar5 = fv.b.f28186a;
        return new fv.a(fv.g.c(wordId, "f"), defpackage.e.m(aVarA.i(), fv.g.z(wordId, "f")), fv.g.z(wordId, "f"));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (rz.e0.m(r11, r2) == r3) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0088 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r18, xy.c r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof rt.g5
            if (r2 == 0) goto L17
            r2 = r1
            rt.g5 r2 = (rt.g5) r2
            int r3 = r2.f49780e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f49780e = r3
            goto L1c
        L17:
            rt.g5 r2 = new rt.g5
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f49778c
            wy.a r3 = wy.a.COROUTINE_SUSPENDED
            int r4 = r2.f49780e
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L44
            if (r4 == r6) goto L3c
            if (r4 != r5) goto L34
            long r7 = r2.f49777b
            long r9 = r2.f49776a
            com.bumptech.glide.e.F(r1)
        L31:
            r4 = r2
            r1 = r9
            goto L50
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            long r7 = r2.f49777b
            long r9 = r2.f49776a
            com.bumptech.glide.e.F(r1)
            goto L69
        L44:
            com.bumptech.glide.e.F(r1)
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 + r18
            r4 = r2
            r1 = r18
        L50:
            long r9 = java.lang.System.currentTimeMillis()
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 >= 0) goto L8b
            r4.f49776a = r1
            r4.f49777b = r7
            r4.f49780e = r6
            java.lang.Object r9 = r0.t(r4)
            if (r9 != r3) goto L65
            goto L8a
        L65:
            r15 = r1
            r1 = r9
            r9 = r15
            r2 = r4
        L69:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L72
            goto L8b
        L72:
            long r11 = java.lang.System.currentTimeMillis()
            long r11 = r7 - r11
            r13 = 100
            long r11 = java.lang.Math.min(r13, r11)
            r2.f49776a = r9
            r2.f49777b = r7
            r2.f49780e = r5
            java.lang.Object r1 = rz.e0.m(r11, r2)
            if (r1 != r3) goto L31
        L8a:
            return r3
        L8b:
            qy.b0 r1 = qy.b0.f48488a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.r5.i(long, xy.c):java.lang.Object");
    }

    public final void j() {
        this.R++;
        rz.z1 z1Var = this.Q;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        this.Q = null;
        this.U = ry.r.f50854a;
    }

    public final void k() {
        uz.i1 i1Var;
        Object value;
        Object objA;
        this.f50337f.g();
        do {
            i1Var = this.M;
            value = i1Var.getValue();
            objA = (c5) value;
            if (objA instanceof b5) {
                objA = b5.a((b5) objA, false, null, null, null, null, 0, v4.PAUSED, null, 383);
            }
        } while (!i1Var.j(value, objA));
        q();
        rz.z1 z1Var = this.P;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r7.o(r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(rt.t4 r7, float r8, xy.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof rt.l5
            if (r0 == 0) goto L13
            r0 = r9
            rt.l5 r0 = (rt.l5) r0
            int r1 = r0.f50016e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50016e = r1
            goto L18
        L13:
            rt.l5 r0 = new rt.l5
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f50014c
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.f50016e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.bumptech.glide.e.F(r9)
            goto L72
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            float r8 = r0.f50013b
            rz.t r7 = r0.f50012a
            com.bumptech.glide.e.F(r9)
            goto L64
        L3a:
            com.bumptech.glide.e.F(r9)
            rz.t r9 = rz.e0.b()
            rt.m5 r2 = new rt.m5
            r5 = 0
            r2.<init>(r9, r5)
            av.n r5 = r6.f50337f
            r5.getClass()
            r5.f3172c = r2
            r2 = 0
            r5.m(r8, r2)
            com.lingodeer.data.model.uistate.WordSentenceCharacterType r7 = r7.f50424d
            r0.f50012a = r9
            r0.f50013b = r8
            r0.f50016e = r4
            rt.b6 r2 = r6.L
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L63
            goto L71
        L63:
            r7 = r9
        L64:
            r9 = 0
            r0.f50012a = r9
            r0.f50013b = r8
            r0.f50016e = r3
            java.lang.Object r7 = r7.o(r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            qy.b0 r7 = qy.b0.f48488a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.r5.l(rt.t4, float, xy.c):java.lang.Object");
    }

    public final void m() {
        z4 z4Var;
        Object value = this.M.getValue();
        b5 b5Var = value instanceof b5 ? (b5) value : null;
        if (b5Var == null || b5Var.f49516i != null || (z4Var = this.T) == null) {
            return;
        }
        rz.z1 z1Var = this.Q;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        long j11 = this.R + 1;
        this.R = j11;
        this.U = ry.r.f50854a;
        this.Q = rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new bh.l(this, z4Var, b5Var, j11, null, 12), 3);
    }

    public final void n() {
        Integer numB;
        rz.z1 z1Var = this.P;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        Object value = this.M.getValue();
        b5 b5Var = value instanceof b5 ? (b5) value : null;
        if (b5Var == null || (numB = b5Var.f49512e.f50628e.b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        v4 v4Var = b5Var.f49515h;
        if (v4Var == v4.PLAYING || v4Var == v4.PREPARING) {
            this.P = rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new o5(iIntValue, this, null), 3);
        }
    }

    public final void o() {
        Object value;
        Object objA;
        uz.i1 i1Var = this.M;
        Object value2 = i1Var.getValue();
        b5 b5Var = value2 instanceof b5 ? (b5) value2 : null;
        if (b5Var == null) {
            return;
        }
        float f5 = b5Var.f49512e.f50632i;
        av.n nVar = this.f50337f;
        nVar.m(f5, false);
        nVar.l();
        do {
            value = i1Var.getValue();
            objA = (c5) value;
            if (objA instanceof b5) {
                objA = b5.a((b5) objA, false, null, null, null, null, 0, v4.PLAYING, null, 383);
            }
        } while (!i1Var.j(value, objA));
        q();
        rz.z1 z1Var = this.O;
        if (z1Var == null || !z1Var.isActive()) {
            p(b5Var.f49514g);
        } else {
            n();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.R++;
        rz.z1 z1Var = this.O;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        rz.z1 z1Var2 = this.P;
        if (z1Var2 != null) {
            z1Var2.cancel(null);
        }
        rz.z1 z1Var3 = this.Q;
        if (z1Var3 != null) {
            z1Var3.cancel(null);
        }
        ia.e(this.H);
        this.f50337f.b();
        o4 o4Var = this.f50338t;
        MediaSession mediaSession = o4Var.f50188f;
        o4Var.f50184b = null;
        o4Var.f50185c.cancel(1042);
        if (o4Var.f50187e) {
            try {
                o4Var.f50183a.unregisterReceiver(o4Var.f50186d);
            } catch (Throwable th2) {
                com.bumptech.glide.e.l(th2);
            }
            o4Var.f50187e = false;
        }
        mediaSession.setActive(false);
        mediaSession.release();
        super.onCleared();
    }

    public final void p(int i11) {
        uz.i1 i1Var;
        Object value;
        Object objA;
        rz.z1 z1Var = this.O;
        vy.d dVar = null;
        if (z1Var != null) {
            z1Var.cancel(null);
        }
        do {
            i1Var = this.M;
            value = i1Var.getValue();
            objA = (c5) value;
            if (objA instanceof b5) {
                objA = b5.a((b5) objA, false, null, null, null, null, i11, v4.PREPARING, null, 319);
            }
        } while (!i1Var.j(value, objA));
        this.O = rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new o5(this, i11, dVar, 1), 3);
        n();
    }

    public final void q() {
        Object value = this.M.getValue();
        b5 b5Var = value instanceof b5 ? (b5) value : null;
        if (b5Var == null) {
            return;
        }
        v4 v4Var = b5Var.f49515h;
        t4 t4Var = (t4) ry.m.t0(b5Var.f49514g, b5Var.f49513f);
        o4 o4Var = this.f50338t;
        if (t4Var != null) {
            o4Var.b(t4Var, v4Var);
        } else {
            o4Var.c(v4Var);
            o4Var.f50185c.cancel(1042);
        }
    }

    public final void r(fz.c cVar) {
        uz.i1 i1Var;
        Object value;
        Object objA;
        do {
            i1Var = this.M;
            value = i1Var.getValue();
            objA = (c5) value;
            if (objA instanceof b5) {
                b5 b5Var = (b5) objA;
                x4 x4Var = (x4) cVar.invoke(b5Var.f49512e);
                rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new bp.t3(this, b5Var.f49508a, x4Var, (vy.d) null, 17), 3);
                objA = b5.a(b5Var, false, null, null, x4Var, null, 0, null, null, 495);
            }
        } while (!i1Var.j(value, objA));
    }

    public final void s(fz.c cVar) {
        uz.i1 i1Var;
        Object value;
        Object objA;
        j();
        do {
            i1Var = this.M;
            value = i1Var.getValue();
            objA = (c5) value;
            if (objA instanceof b5) {
                b5 b5Var = (b5) objA;
                List list = (List) cVar.invoke(b5Var.f49510c);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    d5 d5Var = (d5) obj;
                    if (d5Var.f49619g && d5Var.f49618f) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ry.n.W(arrayList, 10));
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj2 = arrayList.get(i11);
                    i11++;
                    arrayList2.add(Long.valueOf(((d5) obj2).f49613a));
                }
                Set setF1 = ry.m.f1(arrayList2);
                rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new bp.t3(this, b5Var.f49508a, setF1, (vy.d) null, 18), 3);
                objA = b5.a(b5Var, false, list, null, null, ry.r.f50854a, 0, v4.IDLE, null, 27);
            }
        } while (!i1Var.j(value, objA));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(xy.c cVar) {
        q5 q5Var;
        if (cVar instanceof q5) {
            q5Var = (q5) cVar;
            int i11 = q5Var.f50287c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                q5Var.f50287c = i11 - Integer.MIN_VALUE;
            } else {
                q5Var = new q5(this, cVar);
            }
        } else {
            q5Var = new q5(this, cVar);
        }
        Object obj = q5Var.f50285a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = q5Var.f50287c;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        do {
            Object value = this.M.getValue();
            b5 b5Var = value instanceof b5 ? (b5) value : null;
            if (b5Var == null) {
                return Boolean.FALSE;
            }
            int i13 = e5.f49680a[b5Var.f49515h.ordinal()];
            if (i13 == 1 || i13 == 2) {
                return Boolean.TRUE;
            }
            if (i13 != 3) {
                if (i13 == 4 || i13 == 5) {
                    return Boolean.FALSE;
                }
                throw new NoWhenBranchMatchedException();
            }
            q5Var.f50287c = 1;
        } while (rz.e0.m(100L, q5Var) != aVar);
        return aVar;
    }
}
