package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zaf extends zad {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zacd f8834c;

    public zaf(zacd zacdVar, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.f8834c = zacdVar;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] f(zabk zabkVar) {
        return this.f8834c.f8813a.f8745b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean g(zabk zabkVar) {
        return this.f8834c.f8813a.f8746c;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final int h(zabk zabkVar) {
        return this.f8834c.f8813a.f8747d;
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void i(zabk zabkVar) {
        zacd zacdVar = this.f8834c;
        RegisterListenerMethod registerListenerMethod = zacdVar.f8813a;
        registerListenerMethod.a(zabkVar.f8779b, this.f8832b);
        ListenerHolder.ListenerKey listenerKey = registerListenerMethod.f8744a.f8741b;
        if (listenerKey != null) {
            zabkVar.f8783f.put(listenerKey, zacdVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void c(zaaa zaaaVar, boolean z11) {
    }
}
