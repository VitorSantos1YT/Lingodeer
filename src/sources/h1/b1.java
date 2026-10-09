package h1;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f30022f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f30023t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        super(1);
        this.f30017a = i11;
        this.f30018b = obj;
        this.f30019c = obj2;
        this.f30020d = obj3;
        this.f30021e = obj4;
        this.f30022f = obj5;
        this.f30023t = obj6;
    }

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
    @Override // fz.c
    public final Object invoke(Object obj) {
        float f5;
        i2.d dVar;
        float f11;
        int i11 = this.f30017a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f30023t;
        Object obj3 = this.f30022f;
        Object obj4 = this.f30021e;
        Object obj5 = this.f30020d;
        Object obj6 = this.f30019c;
        Object obj7 = this.f30018b;
        switch (i11) {
            case 0:
                i2.d dVar2 = (i2.d) obj;
                float fFloor = (float) Math.floor(dVar2.e0(e1.f30190c));
                long j11 = ((g2.x) ((l1.b3) obj7).getValue()).f28624a;
                long j12 = ((g2.x) ((l1.b3) obj6).getValue()).f28624a;
                float fE0 = dVar2.e0(e1.f30191d);
                float f12 = fFloor / 2.0f;
                i2.h hVar = new i2.h(fFloor, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30);
                float fD = f2.e.d(dVar2.d());
                boolean zD = g2.x.d(j11, j12);
                i2.g gVar = i2.g.f34126a;
                if (zD) {
                    dVar = dVar2;
                    i2.d.y(dVar, j11, 0L, com.bumptech.glide.g.b(fD, fD), c.a.b(fE0), gVar, 226);
                    f11 = fFloor;
                    f5 = 0.0f;
                } else {
                    float f13 = fD - (2 * fFloor);
                    f5 = 0.0f;
                    dVar = dVar2;
                    f11 = fFloor;
                    i2.d.y(dVar, j11, com.bumptech.glide.d.c(fFloor, fFloor), com.bumptech.glide.g.b(f13, f13), c.a.b(Math.max(CropImageView.DEFAULT_ASPECT_RATIO, fE0 - fFloor)), gVar, 224);
                    float f14 = fD - f11;
                    i2.d.y(dVar, j12, com.bumptech.glide.d.c(f12, f12), com.bumptech.glide.g.b(f14, f14), c.a.b(fE0 - f12), hVar, 224);
                }
                long j13 = ((g2.x) ((l1.b3) obj5).getValue()).f28624a;
                float fFloatValue = ((Number) ((l1.b3) obj4).getValue()).floatValue();
                float fFloatValue2 = ((Number) ((l1.b3) obj3).getValue()).floatValue();
                x0 x0Var = (x0) obj2;
                i2.h hVar2 = new i2.h(f11, CropImageView.DEFAULT_ASPECT_RATIO, 2, 0, null, 26);
                float fD2 = f2.e.d(dVar.d());
                float fA = android.support.v4.media.session.a.A(0.4f, 0.5f, fFloatValue2);
                float fA2 = android.support.v4.media.session.a.A(0.7f, 0.5f, fFloatValue2);
                float fA3 = android.support.v4.media.session.a.A(0.5f, 0.5f, fFloatValue2);
                float fA4 = android.support.v4.media.session.a.A(0.3f, 0.5f, fFloatValue2);
                x0Var.f31279a.j();
                g2.k kVar = x0Var.f31279a;
                kVar.g(0.2f * fD2, fA3 * fD2);
                kVar.f(fA * fD2, fA2 * fD2);
                kVar.f(0.8f * fD2, fD2 * fA4);
                g2.m mVar = x0Var.f31280b;
                mVar.c(kVar);
                g2.k kVar2 = x0Var.f31281c;
                kVar2.j();
                mVar.b(f5, mVar.f28582a.getLength() * fFloatValue, kVar2);
                i2.d.o0(dVar, x0Var.f31281c, j13, CropImageView.DEFAULT_ASPECT_RATIO, hVar2, 52);
                break;
            default:
                g3.b0 b0Var2 = (g3.b0) obj;
                e8 e8Var = (e8) obj7;
                String str = (String) obj5;
                String str2 = (String) obj4;
                rz.b0 b0Var3 = (rz.b0) obj2;
                x5 x5Var = new x5(0, (fz.a) obj3);
                mz.j[] jVarArr = g3.z.f28737a;
                b0Var2.b(g3.n.f28686v, new g3.a((String) obj6, x5Var));
                ob.s sVar = e8Var.f30211b;
                f8 f8Var = (f8) ((l1.k1) sVar.f44881g).getValue();
                f8 f8Var2 = f8.PartiallyExpanded;
                if (f8Var == f8Var2) {
                    b0Var2.b(g3.n.f28684t, new g3.a(str, new t5(e8Var, b0Var3, e8Var, 1)));
                } else if (sVar.h().f34055a.containsKey(f8Var2)) {
                    b0Var2.b(g3.n.f28685u, new g3.a(str2, new d2.c(3, e8Var, b0Var3)));
                }
                break;
        }
        return b0Var;
    }
}
