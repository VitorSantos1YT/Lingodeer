package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zznn<E extends Enum<E>, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f10783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10784b;

    public /* synthetic */ zznn(int i11) {
        this();
    }

    public final zznk a() {
        return new zznk(Collections.unmodifiableMap(this.f10783a), Collections.unmodifiableMap(this.f10784b));
    }

    public final void b(Enum r9, Object obj) {
        this.f10783a.put(r9, obj);
        this.f10784b.put(obj, r9);
    }

    private zznn() {
        this.f10783a = new HashMap();
        this.f10784b = new HashMap();
    }
}
