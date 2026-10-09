package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class RequestDeduplicator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f20509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.e f20510b = new y.e(0);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface GetTokenRequest {
    }

    public RequestDeduplicator(ExecutorService executorService) {
        this.f20509a = executorService;
    }
}
