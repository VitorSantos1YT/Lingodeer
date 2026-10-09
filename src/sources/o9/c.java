package o9;

import ns.j;
import rz.b0;
import rz.e0;
import uz.x0;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f44753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(b bVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f44751a = i11;
        this.f44753c = bVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f44751a) {
            case 0:
                return new c(this.f44753c, dVar, 0);
            case 1:
                return new c(this.f44753c, dVar, 1);
            case 2:
                return new c(this.f44753c, dVar, 2);
            default:
                return new c(this.f44753c, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f44751a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((c) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f44751a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f44752b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f44752b = 1;
                    b bVar = this.f44753c;
                    Object objI = x0.i(bVar.f44747a, new j(bVar, null, 4), this);
                    if (objI != aVar) {
                        objI = b0Var;
                    }
                    if (objI == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f44752b;
                qy.b0 b0Var2 = qy.b0.f48488a;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vy.j jVar = vy.j.f54321a;
                    boolean zEquals = jVar.equals(jVar);
                    vy.d dVar = null;
                    b bVar2 = this.f44753c;
                    if (zEquals) {
                        this.f44752b = 1;
                        Object objI2 = x0.i(bVar2.f44747a, new j(bVar2, null, 4), this);
                        if (objI2 != aVar2) {
                            objI2 = b0Var2;
                        }
                        if (objI2 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        c cVar = new c(bVar2, dVar, 0);
                        this.f44752b = 2;
                        if (e0.M(jVar, cVar, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i12 != 1 && i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var2;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f44752b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f44752b = 1;
                    if (this.f44753c.a(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f44752b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vy.j jVar2 = vy.j.f54321a;
                    boolean zEquals2 = jVar2.equals(jVar2);
                    b bVar3 = this.f44753c;
                    if (zEquals2) {
                        this.f44752b = 1;
                        if (bVar3.a(this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        c cVar2 = new c(bVar3, null, 2);
                        this.f44752b = 2;
                        if (e0.M(jVar2, cVar2, this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i14 != 1 && i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
