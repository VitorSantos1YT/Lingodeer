package rt;

import com.lingodeer.data.model.BookmarkFolder;
import com.lingodeer.data.model.KnowledgeNote;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c8 extends xy.i implements fz.i {
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ ot.e2 L;
    public final /* synthetic */ uz.i1 M;
    public final /* synthetic */ a N;
    public final /* synthetic */ uz.i1 O;
    public final /* synthetic */ a P;
    public final /* synthetic */ a Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ g8 f49569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ he f49570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Set f49571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ s f49572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Map f49573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f49574f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f49575t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(boolean z11, boolean z12, boolean z13, boolean z14, ot.e2 e2Var, uz.i1 i1Var, a aVar, uz.i1 i1Var2, a aVar2, a aVar3, vy.d dVar) {
        super(6, dVar);
        this.f49574f = z11;
        this.f49575t = z12;
        this.H = z13;
        this.K = z14;
        this.L = e2Var;
        this.M = i1Var;
        this.N = aVar;
        this.O = i1Var2;
        this.P = aVar2;
        this.Q = aVar3;
    }

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        a aVar = this.P;
        a aVar2 = this.Q;
        c8 c8Var = new c8(this.f49574f, this.f49575t, this.H, this.K, this.L, this.M, this.N, this.O, aVar, aVar2, (vy.d) obj6);
        c8Var.f49569a = (g8) obj;
        c8Var.f49570b = (he) obj2;
        c8Var.f49571c = (Set) obj3;
        c8Var.f49572d = (s) obj4;
        c8Var.f49573e = (Map) obj5;
        return c8Var.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01c2  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        List list;
        uz.i1 i1Var;
        ArrayList arrayList2;
        List<y8> list2;
        uz.i1 i1Var2;
        String name;
        String str;
        Object obj2;
        int i11;
        y8 y8Var;
        k6 k6VarA;
        String note;
        int i12;
        a aVar = this.N;
        j8 j8Var = j8.f49923a;
        i8 i8Var = i8.f49878a;
        boolean z11 = this.f49574f;
        ot.e2 e2Var = this.L;
        ry.r rVar = ry.r.f50854a;
        uz.i1 i1Var3 = this.O;
        uz.i1 i1Var4 = this.M;
        g8 g8Var = this.f49569a;
        he heVar = this.f49570b;
        Set set = this.f49571c;
        s sVar = this.f49572d;
        Map map = this.f49573e;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        if (!(g8Var instanceof f8)) {
            return g8Var;
        }
        List list3 = sVar.f50352a;
        k8 k8Var = sVar.f50353b;
        Set favoriteIds = heVar.f49852a;
        Map map2 = heVar.f49853b;
        Set setD = z11 ? qx.b.D(favoriteIds, set) : favoriteIds;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : setD) {
            Set set2 = set;
            uz.i1 i1Var5 = i1Var3;
            uz.i1 i1Var6 = i1Var4;
            s sVar2 = sVar;
            if (map2.get(new Long(((Number) obj3).longValue())) == null) {
                arrayList3.add(obj3);
            }
            set = set2;
            sVar = sVar2;
            i1Var3 = i1Var5;
            i1Var4 = i1Var6;
        }
        uz.i1 i1Var7 = i1Var3;
        uz.i1 i1Var8 = i1Var4;
        Set set3 = set;
        s sVar3 = sVar;
        Set setF1 = ry.m.f1(arrayList3);
        f8 f8Var = (f8) g8Var;
        List list4 = f8Var.f49746e;
        ArrayList arrayList4 = new ArrayList(ry.n.W(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            y8 y8Var2 = (y8) it.next();
            kotlin.jvm.internal.m.f(y8Var2, "<this>");
            kotlin.jvm.internal.m.f(favoriteIds, "favoriteIds");
            List<k6> list5 = y8Var2.f50700j;
            Iterator it2 = it;
            a aVar3 = aVar;
            ArrayList arrayList5 = new ArrayList(ry.n.W(list5, 10));
            for (k6 k6Var : list5) {
                arrayList5.add(k6.a(k6Var, false, false, null, favoriteIds.contains(w8.c(k6Var.f49973d)), null, 47));
            }
            if (arrayList5.isEmpty()) {
                i12 = 0;
            } else {
                int size = arrayList5.size();
                i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj4 = arrayList5.get(i13);
                    i13++;
                    int i14 = size;
                    if (((k6) obj4).f49970a && (i12 = i12 + 1) < 0) {
                        ns.o.U();
                        throw null;
                    }
                    size = i14;
                }
            }
            arrayList4.add(y8.a(y8Var2, 0, i12, i12 == arrayList5.size(), false, false, arrayList5, 463));
            it = it2;
            aVar = aVar3;
        }
        a aVar4 = aVar;
        if (this.f49575t) {
            arrayList = new ArrayList();
            int size2 = arrayList4.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj5 = arrayList4.get(i15);
                int i16 = i15 + 1;
                y8 y8Var3 = (y8) obj5;
                List<k6> list6 = y8Var3.f50700j;
                ArrayList arrayList6 = new ArrayList();
                for (k6 k6Var2 : list6) {
                    int i17 = size2;
                    int i18 = i16;
                    KnowledgeNote knowledgeNote = (KnowledgeNote) map.get(w8.c(k6Var2.f49973d));
                    if (knowledgeNote == null || (note = knowledgeNote.getNote()) == null) {
                        k6VarA = null;
                    } else {
                        String str2 = !oz.q.K0(note) ? note : null;
                        if (str2 == null) {
                            k6VarA = null;
                        } else {
                            k6VarA = k6.a(k6Var2, false, false, null, false, str2, 28);
                        }
                    }
                    if (k6VarA != null) {
                        arrayList6.add(k6VarA);
                    }
                    i16 = i18;
                    size2 = i17;
                }
                int i19 = size2;
                int i21 = i16;
                y8 y8VarA = arrayList6.isEmpty() ? null : y8.a(y8Var3, arrayList6.size(), 0, false, false, false, arrayList6, 455);
                if (y8VarA != null) {
                    arrayList.add(y8VarA);
                }
                i15 = i21;
                size2 = i19;
            }
        } else if (z11) {
            arrayList = new ArrayList();
            int size3 = arrayList4.size();
            int i22 = 0;
            while (i22 < size3) {
                Object obj6 = arrayList4.get(i22);
                i22++;
                y8 y8VarD = w8.d((y8) obj6, setD);
                if (y8VarD != null) {
                    arrayList.add(y8VarD);
                }
            }
        } else {
            arrayList = arrayList4;
        }
        if (this.H) {
            Set setA0 = nz.n.a0(nz.n.X(nz.n.T(ry.m.g0(arrayList), new v7(3)), new v7(4)));
            h8 h8Var = k8Var instanceof h8 ? (h8) k8Var : null;
            String str3 = h8Var != null ? h8Var.f49836a : null;
            ArrayList arrayListE = c.a.e(list3, map2, setA0);
            ArrayList arrayList7 = new ArrayList(ry.n.W(arrayListE, 10));
            int size4 = arrayListE.size();
            int i23 = 0;
            while (i23 < size4) {
                Object obj7 = arrayListE.get(i23);
                i23++;
                r rVar2 = (r) obj7;
                ArrayList arrayList8 = arrayListE;
                String str4 = rVar2.f50318a;
                int i24 = size4;
                arrayList7.add(new l0(str4, rVar2.f50319b, rVar2.f50320c, rVar2.f50321d ? kotlin.jvm.internal.m.a(k8Var, i8Var) : kotlin.jvm.internal.m.a(str4, str3), rVar2.f50321d));
                arrayListE = arrayList8;
                size4 = i24;
            }
            list = arrayList7;
        } else {
            list = rVar;
        }
        if (!this.K) {
            k8Var = j8Var;
        }
        if (kotlin.jvm.internal.m.a(k8Var, j8Var)) {
            e2Var.invoke(null);
            list2 = arrayList;
            i1Var = i1Var8;
        } else if (kotlin.jvm.internal.m.a(k8Var, i8Var)) {
            ArrayList arrayList9 = new ArrayList();
            int size5 = arrayList4.size();
            int i25 = 0;
            while (i25 < size5) {
                Object obj8 = arrayList4.get(i25);
                i25++;
                y8 y8VarD2 = w8.d((y8) obj8, setF1);
                if (y8VarD2 != null) {
                    arrayList9.add(y8VarD2);
                }
            }
            if (arrayList9.isEmpty()) {
                i1Var = i1Var8;
                i1Var.k(u8.f50486b);
                list2 = rVar;
            } else {
                i1Var = i1Var8;
                if (!kotlin.jvm.internal.m.a(aVar4.f49411b.Z, "__default_bookmark_folder__")) {
                    i1Var.l(null, ef.e.j(arrayList9));
                    e2Var.invoke("__default_bookmark_folder__");
                }
                list2 = arrayList9;
            }
        } else {
            i1Var = i1Var8;
            if (!(k8Var instanceof h8)) {
                throw new NoWhenBranchMatchedException();
            }
            h8 h8Var2 = (h8) k8Var;
            Set setA1 = nz.n.a0(nz.n.W(nz.n.R(ry.x.T(map2), new ot.e2(h8Var2, 26)), new v7(8)));
            arrayList2 = new ArrayList();
            int size6 = arrayList.size();
            int i26 = 0;
            while (i26 < size6) {
                Object obj9 = arrayList.get(i26);
                i26++;
                y8 y8Var4 = (y8) obj9;
                List list7 = y8Var4.f50700j;
                ArrayList arrayList10 = new ArrayList();
                for (Object obj10 : list7) {
                    ArrayList arrayList11 = arrayList;
                    k6 k6Var3 = (k6) obj10;
                    Set set4 = setA1;
                    int i27 = size6;
                    if (ry.m.i0(set4, w8.c(k6Var3.f49973d)) || ry.m.i0(set3, w8.c(k6Var3.f49973d))) {
                        arrayList10.add(obj10);
                    }
                    arrayList = arrayList11;
                    setA1 = set4;
                    size6 = i27;
                }
                ArrayList arrayList12 = arrayList;
                Set set5 = setA1;
                int i28 = size6;
                y8 y8VarA2 = arrayList10.isEmpty() ? null : y8.a(y8Var4, arrayList10.size(), 0, false, false, false, arrayList10, 503);
                if (y8VarA2 != null) {
                    arrayList2.add(y8VarA2);
                }
                arrayList = arrayList12;
                setA1 = set5;
                size6 = i28;
            }
            if (arrayList2.isEmpty()) {
                i1Var.k(u8.f50486b);
                list2 = rVar;
            } else {
                String str5 = aVar4.f49411b.Z;
                String str6 = h8Var2.f49836a;
                if (!kotlin.jvm.internal.m.a(str5, str6)) {
                    list2 = arrayList2;
                    i1Var.l(null, ef.e.j(arrayList2));
                    e2Var.invoke(str6);
                    list2 = arrayList2;
                }
            }
        }
        list2 = arrayList2;
        ArrayList arrayList13 = new ArrayList(ry.n.W(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            b7.e0.x(((y8) it3.next()).f50691a, arrayList13);
        }
        List list8 = (List) i1Var7.getValue();
        ArrayList arrayList14 = new ArrayList();
        for (Object obj11 : list8) {
            if (arrayList13.contains(new Long(((Number) obj11).longValue()))) {
                arrayList14.add(obj11);
            }
        }
        if (arrayList14.equals(list8)) {
            i1Var2 = i1Var7;
        } else {
            i1Var2 = i1Var7;
            i1Var2.l(null, arrayList14);
        }
        if (!((Boolean) this.P.invoke()).booleanValue() && (y8Var = (y8) ry.m.s0(list2)) != null) {
            long j11 = y8Var.f50691a;
            a aVar5 = this.Q;
            i1Var2.l(null, ns.o.K(new Long(j11)));
            aVar5.invoke();
        }
        Set setKeySet = ((u8) i1Var.getValue()).f50487a.keySet();
        Set setF2 = ry.m.f1((Iterable) i1Var2.getValue());
        int i29 = 10;
        ArrayList arrayList15 = new ArrayList(ry.n.W(list2, 10));
        for (y8 y8Var5 : list2) {
            List<k6> list9 = y8Var5.f50700j;
            ArrayList arrayList16 = new ArrayList(ry.n.W(list9, i29));
            for (k6 k6Var4 : list9) {
                arrayList16.add(k6.a(k6Var4, setKeySet.contains(k6Var4.f49972c.getId()), false, null, false, null, 62));
            }
            if (arrayList16.isEmpty()) {
                i11 = 0;
            } else {
                int size7 = arrayList16.size();
                i11 = 0;
                int i30 = 0;
                while (i30 < size7) {
                    Object obj12 = arrayList16.get(i30);
                    i30++;
                    if (((k6) obj12).f49970a && (i11 = i11 + 1) < 0) {
                        ns.o.U();
                        throw null;
                    }
                }
            }
            arrayList15.add(y8.a(y8Var5, 0, i11, !arrayList16.isEmpty() && i11 == arrayList16.size(), setF2.contains(new Long(y8Var5.f50691a)), false, arrayList16, 399));
            i29 = 10;
        }
        ArrayList arrayList17 = new ArrayList();
        int size8 = arrayList15.size();
        int i31 = 0;
        while (i31 < size8) {
            Object obj13 = arrayList15.get(i31);
            i31++;
            List list10 = ((y8) obj13).f50700j;
            ArrayList arrayList18 = new ArrayList();
            for (Object obj14 : list10) {
                if (((k6) obj14).f49970a) {
                    arrayList18.add(obj14);
                }
            }
            ArrayList arrayList19 = new ArrayList(ry.n.W(arrayList18, 10));
            int size9 = arrayList18.size();
            int i32 = 0;
            while (i32 < size9) {
                Object obj15 = arrayList18.get(i32);
                i32++;
                arrayList19.add(((k6) obj15).f49972c);
            }
            ry.m.d0(arrayList17, arrayList19);
        }
        h8 h8Var3 = k8Var instanceof h8 ? (h8) k8Var : null;
        if (h8Var3 == null || (str = h8Var3.f49836a) == null) {
            name = null;
        } else {
            Iterator it4 = list3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next = it4.next();
                if (kotlin.jvm.internal.m.a(((BookmarkFolder) next).getId(), str)) {
                    obj2 = next;
                    break;
                }
            }
            BookmarkFolder bookmarkFolder = (BookmarkFolder) obj2;
            name = bookmarkFolder != null ? bookmarkFolder.getName() : null;
        }
        return f8.a(f8Var, arrayList17, arrayList15, null, k8Var, list, name, this.K, this.f49575t, sVar3.f50354c, 79);
    }
}
