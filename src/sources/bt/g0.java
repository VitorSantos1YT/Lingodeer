package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f5418c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(l1.b1 b1Var, l1.b1 b1Var2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5416a = i11;
        this.f5417b = b1Var;
        this.f5418c = b1Var2;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5416a) {
            case 0:
                return new g0(this.f5417b, this.f5418c, dVar, 0);
            case 1:
                return new g0(this.f5417b, this.f5418c, dVar, 1);
            case 2:
                return new g0(this.f5417b, this.f5418c, dVar, 2);
            case 3:
                return new g0(this.f5417b, this.f5418c, dVar, 3);
            default:
                return new g0(this.f5417b, this.f5418c, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5416a) {
            case 0:
                g0 g0Var = (g0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                g0Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                g0 g0Var2 = (g0) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                g0Var2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                g0 g0Var3 = (g0) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                g0Var3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                g0 g0Var4 = (g0) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                g0Var4.invokeSuspend(b0Var5);
                return b0Var5;
            default:
                g0 g0Var5 = (g0) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                g0Var5.invokeSuspend(b0Var6);
                return b0Var6;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        CourseWord courseWord;
        String explain;
        CourseWord courseWord2;
        String explain2;
        int i11 = this.f5416a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f5418c;
        l1.b1 b1Var2 = this.f5417b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if ((b1Var2.getValue() instanceof ht.a) && ((Boolean) b1Var.getValue()).booleanValue()) {
                    b1Var.setValue(Boolean.FALSE);
                }
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (b1Var2.getValue() instanceof ht.a) {
                    int i12 = s5.f5993u;
                    if (((Boolean) b1Var.getValue()).booleanValue()) {
                        b1Var.setValue(Boolean.FALSE);
                    }
                }
                break;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                float f5 = dt.d4.f23745a;
                qy.l lVar = (qy.l) b1Var.getValue();
                boolean z11 = false;
                if (lVar != null && (courseWord = (CourseWord) lVar.f48495a) != null && (explain = courseWord.getExplain()) != null && explain.length() > 0) {
                    z11 = true;
                }
                b1Var2.setValue(Boolean.valueOf(z11));
                break;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!((Boolean) b1Var2.getValue()).booleanValue()) {
                    float f11 = dt.d4.f23745a;
                    qy.l lVar2 = (qy.l) b1Var.getValue();
                    if (lVar2 != null && (courseWord2 = (CourseWord) lVar2.f48495a) != null && (explain2 = courseWord2.getExplain()) != null && explain2.length() > 0) {
                        b1Var.setValue(null);
                    }
                }
                break;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                float f12 = mt.l5.f41627a;
                b1Var2.setValue(null);
                b1Var.setValue(Boolean.FALSE);
                break;
        }
        return b0Var;
    }
}
