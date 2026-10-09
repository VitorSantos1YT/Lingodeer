package ph;

import androidx.lifecycle.ViewModelKt;
import fr.o0;
import java.util.List;
import qy.b0;
import rz.e0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f46933b;

    public /* synthetic */ y(a0 a0Var, int i11) {
        this.f46932a = i11;
        this.f46933b = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(tt.a aVar, vy.d dVar) {
        x xVar;
        long j11;
        if (dVar instanceof x) {
            xVar = (x) dVar;
            int i11 = xVar.f46931d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                xVar.f46931d = i11 - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, dVar);
            }
        } else {
            xVar = new x(this, dVar);
        }
        Object obj = xVar.f46929b;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i12 = xVar.f46931d;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            long jLongValue = ((Number) aVar.f52531a).longValue();
            xVar.f46928a = jLongValue;
            xVar.f46931d = 1;
            Object objD = ve.i.D(jLongValue, xVar);
            if (objD == aVar2) {
                return aVar2;
            }
            obj = objD;
            j11 = jLongValue;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = xVar.f46928a;
            com.bumptech.glide.e.F(obj);
        }
        a0.a(this.f46933b, j11, ((Boolean) obj).booleanValue());
        return b0.f48488a;
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
    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        switch (this.f46932a) {
            case 0:
                return a((tt.a) obj, dVar);
            case 1:
                List listZ = nz.n.Z(new nz.c(nz.n.W(new cz.i(2, nz.n.R(ry.m.g0(oz.q.W0(((o0) xt.b.c()).i(), new String[]{";"}, 0, 6)), new st.a(13)), new th.i()), new st.a(14)), new st.a(15), 0));
                i1 i1Var = this.f46933b.f46844e;
                List list = (List) i1Var.getValue();
                if (!listZ.equals(list)) {
                    i1Var.getClass();
                    i1Var.l(null, listZ);
                    list.size();
                    listZ.size();
                }
                return b0.f48488a;
            default:
                a0 a0Var = this.f46933b;
                e0.B(ViewModelKt.getViewModelScope(a0Var), null, null, new z(a0Var, null, 3), 3);
                return b0.f48488a;
        }
    }
}
