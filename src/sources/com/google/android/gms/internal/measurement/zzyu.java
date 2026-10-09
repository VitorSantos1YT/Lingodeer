package com.google.android.gms.internal.measurement;

import com.google.android.material.datepicker.d;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzyu implements zzyd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzyd f12194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12195b;

    public zzyu(zzyd zzydVar, Object obj) {
        zzabr.a(zzydVar, "log site key");
        this.f12194a = zzydVar;
        zzabr.a(obj, "log site qualifier");
        this.f12195b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzyu)) {
            return false;
        }
        zzyu zzyuVar = (zzyu) obj;
        return this.f12194a.equals(zzyuVar.f12194a) && this.f12195b.equals(zzyuVar.f12195b);
    }

    public final int hashCode() {
        return this.f12194a.hashCode() ^ this.f12195b.hashCode();
    }

    public final String toString() {
        String string = this.f12194a.toString();
        int length = string.length();
        String string2 = this.f12195b.toString();
        StringBuilder sb2 = new StringBuilder(length + 47 + string2.length() + 3);
        d.w(sb2, kHfjNGauVgdF.ZuEImdjxUJj, string, "', qualifier='", string2);
        sb2.append("' }");
        return sb2.toString();
    }
}
