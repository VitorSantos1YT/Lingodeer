package io.grpc;

import lw.c1;
import lw.q1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class StatusRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f34502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f34503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34504c;

    public StatusRuntimeException(q1 q1Var, c1 c1Var) {
        super(q1.c(q1Var), q1Var.f40446c);
        this.f34502a = q1Var;
        this.f34503b = c1Var;
        this.f34504c = true;
        fillInStackTrace();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this.f34504c ? super.fillInStackTrace() : this;
    }
}
