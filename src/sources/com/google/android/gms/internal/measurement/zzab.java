package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzaa f11163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzaa f11164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11165c;

    public zzab() {
        this.f11163a = new zzaa(BuildConfig.VERSION_NAME, 0L, null);
        this.f11164b = new zzaa(BuildConfig.VERSION_NAME, 0L, null);
        this.f11165c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzab zzabVar = new zzab(this.f11163a.clone());
        ArrayList arrayList = this.f11165c;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            zzabVar.f11165c.add(((zzaa) obj).clone());
        }
        return zzabVar;
    }

    public zzab(zzaa zzaaVar) {
        this.f11163a = zzaaVar;
        this.f11164b = zzaaVar.clone();
        this.f11165c = new ArrayList();
    }
}
