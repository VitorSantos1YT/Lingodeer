package io.grpc;

import lw.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f34500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34501b;

    public StatusException(q1 q1Var) {
        super(q1.c(q1Var), q1Var.f40446c);
        this.f34500a = q1Var;
        this.f34501b = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f34501b ? super.fillInStackTrace() : this;
    }
}
