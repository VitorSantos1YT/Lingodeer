package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzo extends zzl implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f10799a;

    public zzo(Pattern pattern) {
        pattern.getClass();
        this.f10799a = pattern;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzl
    public final zzm a(CharSequence charSequence) {
        return new zzn(this.f10799a.matcher(charSequence));
    }

    public final String toString() {
        return this.f10799a.toString();
    }
}
