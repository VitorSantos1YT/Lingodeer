package zu;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f59550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f59551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f59552d;

    public s(List achievements, List achievementLeaderBoards, ArrayList arrayList, int i11) {
        kotlin.jvm.internal.m.f(achievements, "achievements");
        kotlin.jvm.internal.m.f(achievementLeaderBoards, "achievementLeaderBoards");
        this.f59549a = achievements;
        this.f59550b = achievementLeaderBoards;
        this.f59551c = arrayList;
        this.f59552d = i11;
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
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        ry.r rVar = ry.r.f50854a;
        return rVar.equals(rVar) && kotlin.jvm.internal.m.a(this.f59549a, sVar.f59549a) && kotlin.jvm.internal.m.a(this.f59550b, sVar.f59550b) && this.f59551c.equals(sVar.f59551c) && this.f59552d == sVar.f59552d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59552d) + nv.p.b(this.f59551c, hh.p0.b(hh.p0.b(31, 31, this.f59549a), 31, this.f59550b), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Success(achievementRecords=");
        sb2.append(ry.r.f50854a);
        sb2.append(", achievements=");
        sb2.append(this.f59549a);
        sb2.append(", achievementLeaderBoards=");
        sb2.append(this.f59550b);
        sb2.append(", achievementLanguages=");
        sb2.append(this.f59551c);
        sb2.append(", count=");
        return hh.p0.i(this.f59552d, ")", sb2);
    }
}
