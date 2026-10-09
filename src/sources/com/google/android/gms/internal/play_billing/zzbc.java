package com.google.android.gms.internal.play_billing;

import com.android.billingclient.api.d0;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbb f12246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzbb f12247c;

    public /* synthetic */ zzbc(String str) {
        zzbb zzbbVar = new zzbb();
        this.f12246b = zzbbVar;
        this.f12247c = zzbbVar;
        this.f12245a = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f12245a);
        sb2.append('{');
        zzbb zzbbVar = this.f12246b.f12244b;
        String str = BuildConfig.VERSION_NAME;
        while (zzbbVar != null) {
            d0 d0Var = zzbbVar.f12243a;
            sb2.append(str);
            if (d0Var == null || !d0.class.isArray()) {
                sb2.append(d0Var);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{d0Var});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzbbVar = zzbbVar.f12244b;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
