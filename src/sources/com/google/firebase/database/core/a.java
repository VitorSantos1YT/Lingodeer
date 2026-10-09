package com.google.firebase.database.core;

import com.google.firebase.database.connection.ConnectionTokenProvider;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements ConnectionTokenProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TokenProvider f19381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorService f19382b;

    public /* synthetic */ a(TokenProvider tokenProvider, ScheduledExecutorService scheduledExecutorService) {
        this.f19381a = tokenProvider;
        this.f19382b = scheduledExecutorService;
    }

    public final void a(boolean z11, final ConnectionTokenProvider.GetTokenCallback getTokenCallback) {
        final ScheduledExecutorService scheduledExecutorService = this.f19382b;
        this.f19381a.a(z11, new TokenProvider.GetTokenCompletionListener() { // from class: com.google.firebase.database.core.Context.1
            @Override // com.google.firebase.database.core.TokenProvider.GetTokenCompletionListener
            public final void a(String str) {
                scheduledExecutorService.execute(new b(getTokenCallback, str, 0));
            }

            @Override // com.google.firebase.database.core.TokenProvider.GetTokenCompletionListener
            public final void b(String str) {
                scheduledExecutorService.execute(new b(getTokenCallback, str, 1));
            }
        });
    }
}
