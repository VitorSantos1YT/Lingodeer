package jt;

import com.lingodeer.data.model.CourseSentence;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends xy.i implements fz.e {
    public /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36944a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f36945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f36946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f36948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f36949f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f36950t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(x0 x0Var, av.i iVar, rz.b0 b0Var, String str, String str2, String str3, int i11, CourseSentence courseSentence, vt.n0 n0Var, List list, vy.d dVar) {
        super(2, dVar);
        this.f36949f = x0Var;
        this.f36950t = iVar;
        this.H = b0Var;
        this.K = str;
        this.L = str2;
        this.M = str3;
        this.f36947d = i11;
        this.N = courseSentence;
        this.f36948e = n0Var;
        this.f36945b = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f36944a) {
            case 0:
                return new g1((x0) this.f36949f, (av.i) this.f36950t, (rz.b0) this.H, (String) this.K, (String) this.L, (String) this.M, this.f36947d, (CourseSentence) this.N, this.f36948e, this.f36945b, dVar);
            default:
                g1 g1Var = new g1(this.f36948e, (wt.m) this.K, (vt.k0) this.L, (wt.b0) this.M, (rs.b) this.N, dVar);
                g1Var.H = obj;
                return g1Var;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36944a) {
            case 0:
                return ((g1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((g1) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(vt.n0 n0Var, wt.m mVar, vt.k0 k0Var, wt.b0 b0Var, rs.b bVar, vy.d dVar) {
        super(2, dVar);
        this.f36948e = n0Var;
        this.K = mVar;
        this.L = k0Var;
        this.M = b0Var;
        this.N = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:103:0x0307  */
    /* JADX WARN: Code duplicated, block: B:108:0x0316  */
    /* JADX WARN: Code duplicated, block: B:114:0x0336 A[LOOP:6: B:112:0x032d->B:114:0x0336, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0355  */
    /* JADX WARN: Code duplicated, block: B:119:0x036d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0393  */
    /* JADX WARN: Code duplicated, block: B:126:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:127:0x03af  */
    /* JADX WARN: Code duplicated, block: B:129:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:130:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:137:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:144:0x0424  */
    /* JADX WARN: Code duplicated, block: B:146:0x0435  */
    /* JADX WARN: Code duplicated, block: B:151:0x0450  */
    /* JADX WARN: Code duplicated, block: B:153:0x045f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0474  */
    /* JADX WARN: Code duplicated, block: B:163:0x0497 A[LOOP:12: B:162:0x0495->B:163:0x0497, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x04ef A[LOOP:13: B:165:0x04ed->B:166:0x04ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0349 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0370 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0462 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x046e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0111 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:38:0x0117  */
    /* JADX WARN: Code duplicated, block: B:46:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x016d A[LOOP:0: B:48:0x0167->B:50:0x016d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x018f  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c8 A[LOOP:2: B:60:0x01c6->B:61:0x01c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x01df  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x0212  */
    /* JADX WARN: Code duplicated, block: B:72:0x022e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0259  */
    /* JADX WARN: Code duplicated, block: B:83:0x028b A[LOOP:5: B:82:0x0289->B:83:0x028b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:94:0x02df  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0534, code lost:
    
        if (r11.emit(r21, r36) == r12) goto L169;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 1428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jt.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
