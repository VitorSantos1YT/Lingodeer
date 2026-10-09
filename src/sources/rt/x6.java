package rt;

import com.lingodeer.data.model.CourseCharacter;
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.n0 f50643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wt.m f50644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.b0 f50645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rs.b f50646d;

    public x6(vt.n0 n0Var, wt.m mVar, wt.b0 b0Var, rs.b bVar) {
        this.f50643a = n0Var;
        this.f50644b = mVar;
        this.f50645c = b0Var;
        this.f50646d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1 A[LOOP:0: B:21:0x009b->B:23:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d7 -> B:28:0x00dc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.io.Serializable a(rt.x6 r24, java.util.List r25, java.util.Set r26, xy.c r27) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.x6.a(rt.x6, java.util.List, java.util.Set, xy.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    public static final Object b(x6 x6Var, List courseUnits, Set reviewTypes, xy.c cVar) {
        n6 n6Var;
        if (cVar instanceof n6) {
            n6Var = (n6) cVar;
            int i11 = n6Var.f50132e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                n6Var.f50132e = i11 - Integer.MIN_VALUE;
            } else {
                n6Var = new n6(x6Var, cVar);
            }
        } else {
            n6Var = new n6(x6Var, cVar);
        }
        Object objU = n6Var.f50130c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = n6Var.f50132e;
        int i13 = 26;
        int i14 = 10;
        if (i12 == 0) {
            ArrayList arrayListO = ep.a.o(objU);
            for (Object obj : courseUnits) {
                CourseUnit courseUnit = (CourseUnit) obj;
                if (courseUnit.getUnitState() != UnitState.StateLocked && !courseUnit.isTestOut()) {
                    arrayListO.add(obj);
                }
            }
            List listS0 = ry.m.S0(arrayListO, new gu.g(26));
            if (listS0.isEmpty()) {
                return ry.r.f50854a;
            }
            wt.b0 b0Var = x6Var.f50645c;
            int i15 = ((fr.o0) x6Var.f50643a).f27733a.keyLanguage;
            Set set = reviewTypes;
            ArrayList arrayList = new ArrayList(ry.n.W(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(((x8) it.next()).a()));
            }
            ArrayList arrayList2 = new ArrayList(ry.n.W(listS0, 10));
            Iterator it2 = listS0.iterator();
            while (it2.hasNext()) {
                b7.e0.x(((CourseUnit) it2.next()).getUnitId(), arrayList2);
            }
            gp.r rVarG = b0Var.g(i15, arrayList, arrayList2);
            n6Var.f50128a = courseUnits;
            n6Var.f50129b = reviewTypes;
            n6Var.f50132e = 1;
            objU = uz.x0.u(rVarG, n6Var);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            reviewTypes = n6Var.f50129b;
            courseUnits = n6Var.f50128a;
            com.bumptech.glide.e.F(objU);
        }
        List reviews = (List) objU;
        int i16 = b7.f49521a;
        kotlin.jvm.internal.m.f(courseUnits, "courseUnits");
        kotlin.jvm.internal.m.f(reviews, "reviews");
        kotlin.jvm.internal.m.f(reviewTypes, "reviewTypes");
        nz.i iVarR = nz.n.R(new nz.i(ry.m.g0(reviews), false, new ro.e(25)), new q(3, reviewTypes));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nz.g gVar = new nz.g(iVarR);
        while (gVar.hasNext()) {
            Object next = gVar.next();
            SRSStatus sRSStatus = (SRSStatus) next;
            qy.l lVar = new qy.l(Long.valueOf(sRSStatus.getUnitId()), Integer.valueOf(sRSStatus.getElemType()));
            Object arrayList3 = linkedHashMap.get(lVar);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(lVar, arrayList3);
            }
            ((List) arrayList3).add(next);
        }
        return nz.n.Z(nz.n.W(new cz.i(2, nz.n.R(ry.m.g0(courseUnits), new ro.e(i13)), new gu.g(27)), new qp.n2(i14, reviewTypes, linkedHashMap)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(x8 x8Var, LinkedHashSet linkedHashSet, xy.c cVar) {
        o6 o6Var;
        if (cVar instanceof o6) {
            o6Var = (o6) cVar;
            int i11 = o6Var.f50196d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o6Var.f50196d = i11 - Integer.MIN_VALUE;
            } else {
                o6Var = new o6(this, cVar);
            }
        } else {
            o6Var = new o6(this, cVar);
        }
        Object objD = o6Var.f50194b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = o6Var.f50196d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objD);
            rs.a aVarA = b7.a(x8Var, linkedHashSet);
            o6Var.f50193a = x8Var;
            o6Var.f50196d = 1;
            objD = ((bh.s1) this.f50646d).d(aVarA, o6Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x8Var = o6Var.f50193a;
            com.bumptech.glide.e.F(objD);
        }
        rs.d dVar = (rs.d) objD;
        int i13 = l6.f50017a[x8Var.ordinal()];
        if (i13 == 1) {
            Map map = dVar.f49400c;
            LinkedHashMap linkedHashMap = new LinkedHashMap(ry.x.W(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), new WordSentenceCharacterType.CharacterType((CourseCharacter) entry.getValue()));
            }
            return linkedHashMap;
        }
        if (i13 == 2) {
            Map map2 = dVar.f49398a;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(ry.x.W(map2.size()));
            for (Map.Entry entry2 : map2.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), new WordSentenceCharacterType.WordType((CourseWord) entry2.getValue()));
            }
            return linkedHashMap2;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return ry.s.f50855a;
            }
            throw new NoWhenBranchMatchedException();
        }
        Map map3 = dVar.f49399b;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(ry.x.W(map3.size()));
        for (Map.Entry entry3 : map3.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), new WordSentenceCharacterType.SentenceType((CourseSentence) entry3.getValue()));
        }
        return linkedHashMap3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(x8 x8Var, Set set, xy.c cVar) {
        w6 w6Var;
        if (cVar instanceof w6) {
            w6Var = (w6) cVar;
            int i11 = w6Var.f50576d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                w6Var.f50576d = i11 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(this, cVar);
            }
        } else {
            w6Var = new w6(this, cVar);
        }
        Object objD = w6Var.f50574b;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = w6Var.f50576d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objD);
            rs.a aVarA = b7.a(x8Var, set);
            w6Var.f50573a = x8Var;
            w6Var.f50576d = 1;
            objD = ((bh.s1) this.f50646d).d(aVarA, w6Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x8Var = w6Var.f50573a;
            com.bumptech.glide.e.F(objD);
        }
        rs.d dVar = (rs.d) objD;
        int i13 = l6.f50017a[x8Var.ordinal()];
        if (i13 == 1) {
            return dVar.f49400c.keySet();
        }
        if (i13 == 2) {
            return dVar.f49398a.keySet();
        }
        if (i13 == 3) {
            return dVar.f49399b.keySet();
        }
        if (i13 == 4) {
            return ry.t.f50856a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
