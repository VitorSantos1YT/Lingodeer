package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zah extends zad {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListenerHolder.ListenerKey f8838c;

    public zah(ListenerHolder.ListenerKey listenerKey, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.f8838c = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] f(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f8783f.get(this.f8838c);
        if (zacdVar == null) {
            return null;
        }
        return zacdVar.f8813a.f8745b;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean g(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f8783f.get(this.f8838c);
        return zacdVar != null && zacdVar.f8813a.f8746c;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final int h(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f8783f.get(this.f8838c);
        if (zacdVar != null) {
            return zacdVar.f8813a.f8747d;
        }
        return -1;
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void i(zabk zabkVar) {
        zacd zacdVar = (zacd) zabkVar.f8783f.remove(this.f8838c);
        if (zacdVar == null) {
            this.f8832b.trySetResult(Boolean.FALSE);
            return;
        }
        ((zacf) zacdVar.f8814b).f8817b.f8752b.a(zabkVar.f8779b, this.f8832b);
        zacdVar.f8813a.f8744a.f8741b = null;
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void c(zaaa zaaaVar, boolean z11) {
    }
}
