package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzic f13674a;

    public zzx(zzic zzicVar) {
        this.f13674a = zzicVar;
    }

    public final void a(String str, Bundle bundle) {
        String string;
        zzic zzicVar = this.f13674a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzhh zzhhVar = zzicVar.f13098e;
        zzic.m(zzhzVar);
        zzhzVar.g();
        if (zzicVar.d()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        zzic.k(zzhhVar);
        zzhhVar.f13039w.b(string);
        zzhe zzheVar = zzhhVar.f13040x;
        zzicVar.f13104k.getClass();
        zzheVar.b(System.currentTimeMillis());
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        zzic zzicVar = this.f13674a;
        zzicVar.f13104k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzhh zzhhVar = zzicVar.f13098e;
        zzic.k(zzhhVar);
        return jCurrentTimeMillis - zzhhVar.f13040x.a() > zzicVar.f13097d.o(null, zzfy.f12859i0);
    }

    public final boolean c() {
        zzhh zzhhVar = this.f13674a.f13098e;
        zzic.k(zzhhVar);
        return zzhhVar.f13040x.a() > 0;
    }
}
