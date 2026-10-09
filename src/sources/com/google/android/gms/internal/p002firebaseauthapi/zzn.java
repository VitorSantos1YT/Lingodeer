package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzn extends zzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f10762a;

    public zzn(Matcher matcher) {
        matcher.getClass();
        this.f10762a = matcher;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzm
    public final int a() {
        return this.f10762a.end();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzm
    public final boolean b(int i11) {
        return this.f10762a.find(i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzm
    public final int c() {
        return this.f10762a.start();
    }
}
