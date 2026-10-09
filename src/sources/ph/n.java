package ph;

import androidx.lifecycle.ViewModelKt;
import fr.o0;
import java.util.List;
import qy.b0;
import rz.e0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f46895b;

    public /* synthetic */ n(o oVar, int i11) {
        this.f46894a = i11;
        this.f46895b = oVar;
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
        switch (this.f46894a) {
            case 0:
                ((Number) ((tt.a) obj).f52531a).longValue();
                o oVar = this.f46895b;
                e0.B(ViewModelKt.getViewModelScope(oVar), null, null, new m(oVar, null, 0), 3);
                break;
            default:
                List listZ = nz.n.Z(new nz.c(nz.n.W(new cz.i(2, nz.n.R(ry.m.g0(oz.q.W0(((o0) xt.b.c()).i(), new String[]{";"}, 0, 6)), new st.a(13)), new th.i()), new st.a(14)), new st.a(15), 0));
                i1 i1Var = this.f46895b.K;
                List list = (List) i1Var.getValue();
                if (!listZ.equals(list)) {
                    i1Var.getClass();
                    i1Var.l(null, listZ);
                    list.size();
                    listZ.size();
                }
                break;
        }
        return b0.f48488a;
    }
}
