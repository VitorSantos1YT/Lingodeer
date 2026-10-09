package com.google.android.gms.internal.measurement;

import defpackage.e;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzwn f12123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f12124d = new HashMap(0);

    public zzwn(int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException();
        }
        this.f12121a = i11;
        this.f12122b = i12;
        this.f12123c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return e.g(iIdentityHashCode, "Node", new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4));
    }
}
