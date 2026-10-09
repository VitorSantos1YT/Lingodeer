package app.rive;

import fz.f;
import qy.b0;
import uz.p0;
import uz.s0;
import vy.d;
import xy.e;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "app.rive.ViewModelInstance$getPropertyFlow$1$1", f = "ViewModelInstance.kt", l = {61, 65}, m = "invokeSuspend")
public final class ViewModelInstance$getPropertyFlow$1$1 extends i implements fz.e {
    final /* synthetic */ f $getter;
    final /* synthetic */ String $propertyPath;
    final /* synthetic */ p0 $state;
    final /* synthetic */ s0 $updateFlow;
    int label;
    final /* synthetic */ ViewModelInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelInstance$getPropertyFlow$1$1(f fVar, ViewModelInstance viewModelInstance, String str, p0 p0Var, s0 s0Var, d<? super ViewModelInstance$getPropertyFlow$1$1> dVar) {
        super(2, dVar);
        this.$getter = fVar;
        this.this$0 = viewModelInstance;
        this.$propertyPath = str;
        this.$state = p0Var;
        this.$updateFlow = s0Var;
    }

    @Override // xy.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new ViewModelInstance$getPropertyFlow$1$1(this.$getter, this.this$0, this.$propertyPath, this.$state, this.$updateFlow, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r4.collect(r7, r6) == r0) goto L15;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            com.bumptech.glide.e.F(r7)
            goto L58
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            com.bumptech.glide.e.F(r7)
            goto L36
        L1c:
            com.bumptech.glide.e.F(r7)
            fz.f r7 = r6.$getter
            app.rive.ViewModelInstance r1 = r6.this$0
            long r4 = r1.m43getInstanceHandleVPLto4w$kotlin_release()
            app.rive.core.ViewModelInstanceHandle r1 = app.rive.core.ViewModelInstanceHandle.m193boximpl(r4)
            java.lang.String r4 = r6.$propertyPath
            r6.label = r3
            java.lang.Object r7 = r7.invoke(r1, r4, r6)
            if (r7 != r0) goto L36
            goto L57
        L36:
            uz.p0 r1 = r6.$state
            uz.i1 r1 = (uz.i1) r1
            r1.k(r7)
            uz.s0 r7 = r6.$updateFlow
            app.rive.ViewModelInstance r1 = r6.this$0
            java.lang.String r3 = r6.$propertyPath
            app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$filter$1 r4 = new app.rive.ViewModelInstance$getPropertyFlow$1$1$invokeSuspend$$inlined$filter$1
            r4.<init>()
            app.rive.ViewModelInstance$getPropertyFlow$1$1$2 r7 = new app.rive.ViewModelInstance$getPropertyFlow$1$1$2
            uz.p0 r1 = r6.$state
            r7.<init>()
            r6.label = r2
            java.lang.Object r7 = r4.collect(r7, r6)
            if (r7 != r0) goto L58
        L57:
            return r0
        L58:
            qy.b0 r7 = qy.b0.f48488a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.rive.ViewModelInstance$getPropertyFlow$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // fz.e
    public final Object invoke(rz.b0 b0Var, d<? super b0> dVar) {
        return ((ViewModelInstance$getPropertyFlow$1$1) create(b0Var, dVar)).invokeSuspend(b0.f48488a);
    }
}
