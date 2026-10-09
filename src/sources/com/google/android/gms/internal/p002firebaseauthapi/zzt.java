package com.google.android.gms.internal.p002firebaseauthapi;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzf f10952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzz f10953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10954c;

    public zzt(zzz zzzVar) {
        zzf zzfVar = zzj.f10567b;
        this.f10953b = zzzVar;
        this.f10952a = zzfVar;
        this.f10954c = Integer.MAX_VALUE;
    }

    public static zzt a() {
        ((zzs) zzp.f10824a).getClass();
        zzo zzoVar = new zzo(Pattern.compile("[.-]"));
        if (((zzn) zzoVar.a(BuildConfig.VERSION_NAME)).f10762a.matches()) {
            throw new IllegalArgumentException(zzac.b("The pattern may not match the empty string: %s", zzoVar));
        }
        zzv zzvVar = new zzv();
        zzvVar.f10971a = zzoVar;
        return new zzt(zzvVar);
    }

    public static zzt b(char c11) {
        zzh zzhVar = new zzh(c11);
        zzw zzwVar = new zzw();
        zzwVar.f10980a = zzhVar;
        return new zzt(zzwVar);
    }

    public final List c(String str) {
        str.getClass();
        Iterator itA = this.f10953b.a(this, str);
        ArrayList arrayList = new ArrayList();
        while (itA.hasNext()) {
            arrayList.add((String) itA.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
