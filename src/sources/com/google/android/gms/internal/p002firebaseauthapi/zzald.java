package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzald<K> implements Map.Entry<K, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map.Entry f10144a;

    public zzald(Map.Entry entry) {
        this.f10144a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10144a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzala zzalaVar = (zzala) this.f10144a.getValue();
        if (zzalaVar == null) {
            return null;
        }
        return zzalaVar.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzaly)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        zzaly zzalyVar = ((zzala) this.f10144a.getValue()).f10142b;
        this.f10144a.setValue(new zzala((zzaly) obj));
        return zzalyVar;
    }
}
