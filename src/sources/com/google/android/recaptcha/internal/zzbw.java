package com.google.android.recaptcha.internal;

import fz.e;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.c0;
import kotlinx.coroutines.JobCancellationException;
import nz.l;
import ob.i;
import rz.g1;
import rz.h0;
import rz.n1;
import rz.o1;
import rz.p;
import rz.p1;
import rz.q0;
import rz.q1;
import rz.r;
import rz.s;
import rz.t;
import rz.z;
import vy.d;
import vy.g;
import vy.h;
import wy.a;
import zz.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbw implements h0 {
    private final /* synthetic */ s zza;

    public zzbw(s sVar) {
        this.zza = sVar;
    }

    @Override // rz.g1
    public final p attachChild(r rVar) {
        return this.zza.attachChild(rVar);
    }

    @Override // rz.h0
    public final Object await(d dVar) throws Throwable {
        Object objO = ((t) this.zza).o(dVar);
        a aVar = a.COROUTINE_SUSPENDED;
        return objO;
    }

    @Override // rz.g1
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // vy.i
    public final Object fold(Object obj, e eVar) {
        q1 q1Var = (q1) this.zza;
        q1Var.getClass();
        return ew.a.k(q1Var, obj, eVar);
    }

    @Override // vy.i
    public final g get(h hVar) {
        q1 q1Var = (q1) this.zza;
        q1Var.getClass();
        return ew.a.m(q1Var, hVar);
    }

    @Override // rz.g1
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // rz.g1
    public final l getChildren() {
        return this.zza.getChildren();
    }

    @Override // rz.h0
    public final Object getCompleted() {
        return ((t) this.zza).y();
    }

    @Override // rz.h0
    public final Throwable getCompletionExceptionOrNull() {
        return ((q1) this.zza).getCompletionExceptionOrNull();
    }

    @Override // vy.g
    public final h getKey() {
        this.zza.getClass();
        return z.f50978b;
    }

    public final zz.e getOnAwait() {
        t tVar = (t) this.zza;
        tVar.getClass();
        n1 n1Var = n1.f50937a;
        c0.d(3, n1Var);
        o1 o1Var = o1.f50941a;
        c0.d(3, o1Var);
        return new i(tVar, n1Var, o1Var, null, 18);
    }

    public final c getOnJoin() {
        ((q1) this.zza).getClass();
        c0.d(3, p1.f50943a);
        return new zz.d();
    }

    public final g1 getParent() {
        q1 q1Var = (q1) this.zza;
        q1Var.getClass();
        p pVar = (p) q1.f50946b.get(q1Var);
        if (pVar != null) {
            return pVar.getParent();
        }
        return null;
    }

    @Override // rz.g1
    public final q0 invokeOnCompletion(fz.c cVar) {
        return this.zza.invokeOnCompletion(cVar);
    }

    @Override // rz.g1
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // rz.g1
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isCompleted() {
        return ((q1) this.zza).H();
    }

    @Override // rz.g1
    public final Object join(d dVar) {
        return this.zza.join(dVar);
    }

    @Override // vy.i
    public final vy.i minusKey(h hVar) {
        return this.zza.minusKey(hVar);
    }

    @qy.c
    public final g1 plus(g1 g1Var) {
        this.zza.getClass();
        return g1Var;
    }

    @Override // rz.g1
    public final boolean start() {
        return this.zza.start();
    }

    @qy.c
    public final /* synthetic */ void cancel() {
        ((q1) this.zza).cancel(null);
    }

    @Override // rz.g1
    public final q0 invokeOnCompletion(boolean z11, boolean z12, fz.c cVar) {
        return ((q1) this.zza).invokeOnCompletion(z11, z12, cVar);
    }

    @Override // vy.i
    public final vy.i plus(vy.i iVar) {
        return this.zza.plus(iVar);
    }

    @qy.c
    public final /* synthetic */ boolean cancel(Throwable th2) {
        CancellationException jobCancellationException;
        q1 q1Var = (q1) this.zza;
        q1Var.getClass();
        if (th2 != null) {
            jobCancellationException = q1.U(q1Var, th2);
        } else {
            jobCancellationException = new JobCancellationException(q1Var.t(), null, q1Var);
        }
        q1Var.r(jobCancellationException);
        return true;
    }
}
