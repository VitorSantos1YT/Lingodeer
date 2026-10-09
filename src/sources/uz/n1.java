package uz;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class n1 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f53371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kr.w f53372b;

    public n1(w0 w0Var, kr.w wVar) {
        this.f53371a = w0Var;
        this.f53372b = wVar;
    }

    @Override // uz.s0
    public final List a() {
        return this.f53371a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // uz.i
    public final Object collect(j jVar, vy.d dVar) {
        m1 m1Var;
        if (dVar instanceof m1) {
            m1Var = (m1) dVar;
            int i11 = m1Var.f53362c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m1Var.f53362c = i11 - Integer.MIN_VALUE;
            } else {
                m1Var = new m1(this, dVar);
            }
        } else {
            m1Var = new m1(this, dVar);
        }
        Object obj = m1Var.f53360a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = m1Var.f53362c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            l1 l1Var = new l1(jVar, this.f53372b);
            m1Var.f53362c = 1;
            if (w0.l(this.f53371a, l1Var, m1Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        throw new KotlinNothingValueException();
    }
}
