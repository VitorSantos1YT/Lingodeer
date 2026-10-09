package rw;

import io.grpc.StatusRuntimeException;
import lw.c1;
import lw.q1;
import lw.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f50815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f50816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f50817c = false;

    public e(b bVar) {
        this.f50815a = bVar;
    }

    @Override // lw.y
    public final void h(q1 q1Var, c1 c1Var) {
        boolean zF = q1Var.f();
        b bVar = this.f50815a;
        if (!zF) {
            bVar.n(new StatusRuntimeException(q1Var, c1Var));
            return;
        }
        if (!this.f50817c) {
            bVar.n(new StatusRuntimeException(q1.f40441l.h("No value received for unary call"), c1Var));
        }
        bVar.m(this.f50816b);
    }

    @Override // lw.y
    public final void k(Object obj) {
        if (this.f50817c) {
            throw q1.f40441l.h("More than one value received for unary call").a();
        }
        this.f50816b = obj;
        this.f50817c = true;
    }

    @Override // lw.y
    public final void j(c1 c1Var) {
    }
}
