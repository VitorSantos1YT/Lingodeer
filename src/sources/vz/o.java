package vz;

import qy.b0;
import rz.e0;
import rz.w;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends xy.c implements uz.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uz.j f54354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vy.i f54355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public vy.i f54357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public vy.d f54358e;

    public o(uz.j jVar, vy.i iVar) {
        super(m.f54352a, vy.j.f54321a);
        this.f54354a = jVar;
        this.f54355b = iVar;
        this.f54356c = ((Number) iVar.fold(0, new w(23))).intValue();
    }

    public final Object e(vy.d dVar, Object obj) {
        vy.i context = dVar.getContext();
        e0.n(context);
        vy.i iVar = this.f54357d;
        if (iVar != context) {
            if (iVar instanceof k) {
                throw new IllegalStateException(oz.r.g0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((k) iVar).f54351b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new mt.r(this, 19))).intValue() != this.f54356c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f54355b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f54357d = context;
        }
        this.f54358e = dVar;
        fz.f fVar = q.f54360a;
        uz.j jVar = this.f54354a;
        kotlin.jvm.internal.m.d(jVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = fVar.invoke(jVar, obj, this);
        if (!kotlin.jvm.internal.m.a(objInvoke, wy.a.COROUTINE_SUSPENDED)) {
            this.f54358e = null;
        }
        return objInvoke;
    }

    @Override // uz.j
    public final Object emit(Object obj, vy.d dVar) {
        try {
            Object objE = e(dVar, obj);
            return objE == wy.a.COROUTINE_SUSPENDED ? objE : b0.f48488a;
        } catch (Throwable th2) {
            this.f54357d = new k(th2, dVar.getContext());
            throw th2;
        }
    }

    @Override // xy.a, xy.d
    public final xy.d getCallerFrame() {
        vy.d dVar = this.f54358e;
        if (dVar instanceof xy.d) {
            return (xy.d) dVar;
        }
        return null;
    }

    @Override // xy.c, vy.d
    public final vy.i getContext() {
        vy.i iVar = this.f54357d;
        return iVar == null ? vy.j.f54321a : iVar;
    }

    @Override // xy.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = qy.o.a(obj);
        if (thA != null) {
            this.f54357d = new k(thA, getContext());
        }
        vy.d dVar = this.f54358e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return wy.a.COROUTINE_SUSPENDED;
    }
}
