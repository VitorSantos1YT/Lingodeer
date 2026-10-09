package rt;

import com.lingodeer.data.model.LearnProgress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b8 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vt.k0 f49523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f49524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8 f49525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f49526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f49527f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(vt.k0 k0Var, vt.n0 n0Var, x8 x8Var, ArrayList arrayList, boolean z11, vy.d dVar) {
        super(1, dVar);
        this.f49523b = k0Var;
        this.f49524c = n0Var;
        this.f49525d = x8Var;
        this.f49526e = arrayList;
        this.f49527f = z11;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new b8(this.f49523b, this.f49524c, this.f49525d, this.f49526e, this.f49527f, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((b8) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        String reviewSelectRecordChar;
        u8 u8VarH;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f49522a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            gp.r rVarE = ((bh.a1) this.f49523b).e(((fr.o0) this.f49524c).f27733a.keyLanguage, false);
            this.f49522a = 1;
            obj = uz.x0.u(rVarE, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        LearnProgress learnProgress = (LearnProgress) obj;
        kotlin.jvm.internal.m.f(learnProgress, "learnProgress");
        x8 reviewType = this.f49525d;
        kotlin.jvm.internal.m.f(reviewType, "reviewType");
        int i12 = w7.f50578b[reviewType.ordinal()];
        if (i12 == 1) {
            reviewSelectRecordChar = learnProgress.getReviewSelectRecordChar();
        } else if (i12 == 2) {
            reviewSelectRecordChar = learnProgress.getReviewSelectRecordWord();
        } else if (i12 == 3) {
            reviewSelectRecordChar = learnProgress.getReviewSelectRecordSent();
        } else {
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            reviewSelectRecordChar = learnProgress.getReviewSelectRecordWord();
        }
        int length = reviewSelectRecordChar.length();
        ArrayList arrayList = this.f49526e;
        int i13 = 0;
        if (length == 0) {
            u8VarH = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj2 = arrayList.get(i14);
                i14++;
                ry.m.d0(arrayList2, ((y8) obj2).f50700j);
            }
            int iW = ry.x.W(ry.n.W(arrayList2, 10));
            if (iW < 16) {
                iW = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
            int size2 = arrayList2.size();
            int i15 = 0;
            while (i15 < size2) {
                Object obj3 = arrayList2.get(i15);
                i15++;
                k6 k6Var = (k6) obj3;
                linkedHashMap.put(String.valueOf(k6Var.f49972c.getElemId()), k6Var.f49972c.getId());
            }
            List listW0 = oz.q.W0(reviewSelectRecordChar, new String[]{";"}, 0, 6);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : listW0) {
                if (!oz.q.K0((String) obj4)) {
                    arrayList3.add(obj4);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size3 = arrayList3.size();
            int i16 = 0;
            while (i16 < size3) {
                Object obj5 = arrayList3.get(i16);
                i16++;
                String str = (String) linkedHashMap.get((String) obj5);
                if (str != null) {
                    linkedHashSet.add(str);
                }
            }
            u8VarH = ef.e.h(arrayList, linkedHashSet);
        }
        if (u8VarH != null) {
            return u8VarH;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        Set linkedHashSet2 = ry.t.f50856a;
        if (!zIsEmpty) {
            ArrayList arrayList4 = new ArrayList();
            int size4 = arrayList.size();
            while (i13 < size4) {
                Object obj6 = arrayList.get(i13);
                i13++;
                if (((y8) obj6).f50699i) {
                    arrayList4.add(obj6);
                }
            }
            if (!arrayList4.isEmpty()) {
                List list = (this.f49527f ? (y8) ry.m.q0(arrayList4) : (y8) ry.m.z0(arrayList4)).f50700j;
                linkedHashSet2 = new LinkedHashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet2.add(((k6) it.next()).f49972c.getId());
                }
            }
        }
        return ef.e.h(arrayList, linkedHashSet2);
    }
}
