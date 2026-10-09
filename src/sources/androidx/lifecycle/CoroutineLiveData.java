package androidx.lifecycle;

import kotlin.jvm.internal.m;
import qy.b0;
import rz.b2;
import rz.e0;
import rz.g1;
import rz.o0;
import rz.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineLiveData<T> extends MediatorLiveData<T> {
    private BlockRunner<T> blockRunner;
    private EmittedSource emittedSource;

    public /* synthetic */ CoroutineLiveData(vy.i iVar, long j11, fz.e eVar, int i11, kotlin.jvm.internal.f fVar) {
        this((i11 & 1) != 0 ? vy.j.f54321a : iVar, (i11 & 2) != 0 ? 5000L : j11, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 _init_$lambda$0(CoroutineLiveData coroutineLiveData) {
        coroutineLiveData.blockRunner = null;
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object clearSource$lifecycle_livedata_release(vy.d<? super b0> dVar) {
        CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        if (dVar instanceof CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (CoroutineLiveData$clearSource$1) dVar;
            int i11 = coroutineLiveData$clearSource$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                coroutineLiveData$clearSource$1.label = i11 - Integer.MIN_VALUE;
            } else {
                coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, dVar);
            }
        } else {
            coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, dVar);
        }
        Object obj = coroutineLiveData$clearSource$1.result;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = coroutineLiveData$clearSource$1.label;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            EmittedSource emittedSource = this.emittedSource;
            if (emittedSource != null) {
                coroutineLiveData$clearSource$1.label = 1;
                if (emittedSource.disposeNow(coroutineLiveData$clearSource$1) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        this.emittedSource = null;
        return b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r7 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData<T> r6, vy.d<? super rz.q0> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.CoroutineLiveData$emitSource$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$emitSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.lifecycle.CoroutineLiveData$emitSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$emitSource$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.bumptech.glide.e.F(r7)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            androidx.lifecycle.LiveData r6 = (androidx.lifecycle.LiveData) r6
            com.bumptech.glide.e.F(r7)
            goto L48
        L3a:
            com.bumptech.glide.e.F(r7)
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r5.clearSource$lifecycle_livedata_release(r0)
            if (r7 != r1) goto L48
            goto L53
        L48:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = androidx.lifecycle.CoroutineLiveDataKt.addDisposableSource(r5, r6, r0)
            if (r7 != r1) goto L54
        L53:
            return r1
        L54:
            androidx.lifecycle.EmittedSource r7 = (androidx.lifecycle.EmittedSource) r7
            r5.emittedSource = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.emitSource$lifecycle_livedata_release(androidx.lifecycle.LiveData, vy.d):java.lang.Object");
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.maybeRun();
        }
    }

    @Override // androidx.lifecycle.MediatorLiveData, androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        BlockRunner<T> blockRunner = this.blockRunner;
        if (blockRunner != null) {
            blockRunner.cancel();
        }
    }

    public CoroutineLiveData(vy.i context, long j11, fz.e block) {
        m.f(context, "context");
        m.f(block, "block");
        b2 b2Var = new b2((g1) context.get(z.f50978b));
        yz.f fVar = o0.f50940a;
        this.blockRunner = new BlockRunner<>(this, block, j11, e0.c(wz.m.f55536a.f51961d.plus(context).plus(b2Var)), new b(this, 0));
    }
}
