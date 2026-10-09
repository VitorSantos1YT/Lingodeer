package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
class CreationContextFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f8053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f8054c;

    public CreationContextFactory(Context context, Clock clock, Clock clock2) {
        this.f8052a = context;
        this.f8053b = clock;
        this.f8054c = clock2;
    }
}
