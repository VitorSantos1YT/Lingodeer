package ot;

import com.lingodeer.data.model.LearnProgress;
import com.lingodeer.data.model.TestModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import rt.r8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends xy.i implements fz.e {
    public int H;
    public int K;
    public long L;
    public int M;
    public /* synthetic */ Object N;
    public final /* synthetic */ LearnProgress O;
    public final /* synthetic */ r8 P;
    public final /* synthetic */ List Q;
    public final /* synthetic */ boolean R;
    public final /* synthetic */ boolean S;
    public final /* synthetic */ e0 T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f45777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r8 f45778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r8 f45779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f45780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f45781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f45782f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TestModel f45783t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(LearnProgress learnProgress, r8 r8Var, List list, boolean z11, boolean z12, e0 e0Var, vy.d dVar) {
        super(2, dVar);
        this.O = learnProgress;
        this.P = r8Var;
        this.Q = list;
        this.R = z11;
        this.S = z12;
        this.T = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean e(boolean z11, List list, TestModel testModel) {
        ?? R;
        if (z11) {
            List<Integer> list2 = testModel.typeList;
            R = b7.e0.r("typeList", list2);
            for (Object obj : list2) {
                Integer num = (Integer) obj;
                if (num == null || num.intValue() != 7) {
                    R.add(obj);
                }
            }
        } else {
            R = testModel.typeList;
        }
        if (R.isEmpty()) {
            return false;
        }
        ArrayList arrayListC1 = ry.m.c1(R);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TestModel testModel2 = (TestModel) it.next();
            if (testModel2.elemId == testModel.elemId) {
                arrayListC1.remove(Integer.valueOf(testModel2.modelType));
            }
        }
        if (arrayListC1.isEmpty()) {
            int size = R.size();
            if (size <= 0) {
                throw new RuntimeException();
            }
            Object obj2 = R.get(Math.abs(new Random().nextInt()) % size);
            kotlin.jvm.internal.m.e(obj2, "get(...)");
            testModel.modelType = ((Number) obj2).intValue();
            return true;
        }
        int size2 = arrayListC1.size();
        if (size2 <= 0) {
            throw new RuntimeException();
        }
        Object obj3 = arrayListC1.get(Math.abs(new Random().nextInt()) % size2);
        kotlin.jvm.internal.m.e(obj3, "get(...)");
        testModel.modelType = ((Number) obj3).intValue();
        return true;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        d0 d0Var = new d0(this.O, this.P, this.Q, this.R, this.S, this.T, dVar);
        d0Var.N = obj;
        return d0Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:106:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:108:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:158:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0204  */
    /* JADX WARN: Code duplicated, block: B:71:0x022c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0237  */
    /* JADX WARN: Code duplicated, block: B:77:0x0249  */
    /* JADX WARN: Code duplicated, block: B:79:0x0253  */
    /* JADX WARN: Code duplicated, block: B:80:0x0256  */
    /* JADX WARN: Code duplicated, block: B:85:0x026d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0278  */
    /* JADX WARN: Code duplicated, block: B:97:0x0294  */
    /* JADX WARN: Code duplicated, block: B:98:0x029c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x02a8 -> B:112:0x02d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x02ce -> B:92:0x0284). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x0322 -> B:123:0x0326). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x022c -> B:72:0x0231). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
