package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class be extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f16148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f16149b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f16148a = context;
        this.f16149b = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        this.f16149b.f16175d.trySetResult(Integer.valueOf(com.google.android.play.integrity.internal.ai.a(this.f16148a)));
    }
}
