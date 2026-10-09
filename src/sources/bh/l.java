package bh;

import androidx.lifecycle.ViewModel;
import com.lingodeer.data.model.CoursePracticeType;
import f0.g2;
import f0.i2;
import java.util.List;
import rt.b4;
import rt.b5;
import rt.nf;
import rt.r5;
import rt.z4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f4277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f4278f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j11, t tVar, vy.d dVar) {
        super(2, dVar);
        this.f4273a = 1;
        this.f4275c = tVar;
        this.f4276d = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4273a) {
            case 0:
                return new l(this.f4276d, (t) this.f4275c, dVar, 0);
            case 1:
                return new l(this.f4276d, (t) this.f4275c, dVar);
            case 2:
                return new l((d0.f) this.f4278f, this.f4276d, (h0.i) this.f4275c, dVar, 2);
            case 3:
                return new l((d0.z) this.f4278f, this.f4276d, (h0.i) this.f4275c, dVar, 3);
            case 4:
                return new l((dh.a) this.f4278f, (String) this.f4275c, this.f4276d, dVar);
            case 5:
                l lVar = new l(this.f4276d, (ej.g) this.f4275c, dVar, 5);
                lVar.f4278f = obj;
                return lVar;
            case 6:
                l lVar2 = new l((i2) this.f4278f, this.f4276d, (kotlin.jvm.internal.v) this.f4275c, dVar, 6);
                lVar2.f4277e = obj;
                return lVar2;
            case 7:
                return new l((gp.l1) this.f4275c, dVar);
            case 8:
                return new l((kr.b0) this.f4277e, (List) this.f4278f, (kr.i) this.f4275c, dVar, 8);
            case 9:
                return new l((kotlin.jvm.internal.x) this.f4277e, (kotlin.jvm.internal.x) this.f4278f, (m6.f) this.f4275c, this.f4276d, dVar, 9);
            case 10:
                return new l((b4) this.f4277e, (rt.n0) this.f4278f, (nf) this.f4275c, dVar, 10);
            case 11:
                return new l((vt.k0) this.f4277e, this.f4276d, (vt.n0) this.f4278f, (vt.c) this.f4275c, dVar);
            case 12:
                return new l((r5) this.f4277e, (z4) this.f4278f, (b5) this.f4275c, this.f4276d, dVar, 12);
            case 13:
                return new l((l1.b1) this.f4278f, this.f4276d, (h0.i) this.f4275c, dVar, 13);
            case 14:
                l lVar3 = new l((List) this.f4278f, this.f4276d, (l1.b1) this.f4275c, dVar, 14);
                lVar3.f4277e = obj;
                return lVar3;
            default:
                l lVar4 = new l((wt.o0) this.f4278f, this.f4276d, (CoursePracticeType) this.f4275c, dVar, 15);
                lVar4.f4277e = obj;
                return lVar4;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4273a) {
            case 0:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((l) create((g2) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((l) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((l) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:248:0x0552  */
    /* JADX WARN: Code duplicated, block: B:254:0x058b  */
    /* JADX WARN: Code duplicated, block: B:494:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, qy.h] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:259:0x05b3 -> B:246:0x054a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 2592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(long j11, Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4273a = i11;
        this.f4276d = j11;
        this.f4275c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ViewModel viewModel, Object obj, Object obj2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4273a = i11;
        this.f4277e = viewModel;
        this.f4278f = obj;
        this.f4275c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dh.a aVar, String str, long j11, vy.d dVar) {
        super(2, dVar);
        this.f4273a = 4;
        this.f4278f = aVar;
        this.f4275c = str;
        this.f4276d = j11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(gp.l1 l1Var, vy.d dVar) {
        super(2, dVar);
        this.f4273a = 7;
        this.f4275c = l1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, long j11, Object obj2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4273a = i11;
        this.f4278f = obj;
        this.f4276d = j11;
        this.f4275c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, long j11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4273a = i11;
        this.f4277e = obj;
        this.f4278f = obj2;
        this.f4275c = obj3;
        this.f4276d = j11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vt.k0 k0Var, long j11, vt.n0 n0Var, vt.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f4273a = 11;
        this.f4277e = k0Var;
        this.f4276d = j11;
        this.f4278f = n0Var;
        this.f4275c = cVar;
    }
}
