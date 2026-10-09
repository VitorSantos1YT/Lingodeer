package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m7 implements fz.a {
    public final /* synthetic */ Object H;
    public final /* synthetic */ l1.b1 K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5730f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5731t;

    public /* synthetic */ m7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, l1.b1 b1Var, Object obj8, int i11) {
        this.f5725a = i11;
        this.f5726b = obj;
        this.f5727c = obj2;
        this.f5728d = obj3;
        this.f5729e = obj4;
        this.f5730f = obj5;
        this.f5731t = obj6;
        this.H = obj7;
        this.K = b1Var;
        this.L = obj8;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5725a) {
            case 0:
                e2.l lVar = (e2.l) this.f5726b;
                rz.b0 b0Var = (rz.b0) this.f5727c;
                jt.m1 m1Var = (jt.m1) this.f5728d;
                CourseWord courseWord = (CourseWord) this.f5729e;
                fz.c cVar = (fz.c) this.f5730f;
                fz.a aVar = (fz.a) this.f5731t;
                ht.o oVar = (ht.o) this.H;
                l1.i1 i1Var = (l1.i1) this.K;
                fz.e eVar = (fz.e) this.L;
                e2.l.a(lVar);
                rz.e0.B(b0Var, null, null, new av.e(m1Var, courseWord, cVar, aVar, oVar, i1Var, eVar, null, 4), 3);
                break;
            default:
                gi.d dVar = (gi.d) this.f5726b;
                l1.b1 b1Var = (l1.b1) this.f5727c;
                l1.b1 b1Var2 = (l1.b1) this.f5728d;
                l1.b1 b1Var3 = (l1.b1) this.f5729e;
                l1.b1 b1Var4 = (l1.b1) this.f5730f;
                l1.b1 b1Var5 = (l1.b1) this.f5731t;
                l1.b1 b1Var6 = (l1.b1) this.H;
                l1.b1 b1Var7 = (l1.b1) this.L;
                b1Var.setValue(Boolean.FALSE);
                b1Var2.setValue(null);
                b1Var3.setValue(null);
                b1Var4.setValue(null);
                b1Var5.setValue(null);
                b1Var6.setValue(null);
                this.K.setValue(null);
                b1Var7.setValue(null);
                dVar.a();
                break;
        }
        return qy.b0.f48488a;
    }
}
