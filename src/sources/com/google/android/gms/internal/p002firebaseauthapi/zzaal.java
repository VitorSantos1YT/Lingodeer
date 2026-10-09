package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zzc;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaal implements zzafd<zzagt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzafe f9742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Boolean f9745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzc f9746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzadx f9747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zzahd f9748g;

    public zzaal(zzaad zzaadVar, zzafe zzafeVar, String str, String str2, Boolean bool, zzc zzcVar, zzadx zzadxVar, zzahd zzahdVar) {
        this.f9742a = zzafeVar;
        this.f9743b = str;
        this.f9744c = str2;
        this.f9745d = bool;
        this.f9746e = zzcVar;
        this.f9747f = zzadxVar;
        this.f9748g = zzahdVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        List list = ((zzagt) zzaelVar).f9939a.f9941a;
        if (list == null || list.isEmpty()) {
            this.f9742a.zza("No users.");
            return;
        }
        zzagw zzagwVar = (zzagw) list.get(0);
        zzahm zzahmVar = zzagwVar.f9947f;
        List list2 = zzahmVar != null ? zzahmVar.f9981a : null;
        if (list2 != null && !list2.isEmpty()) {
            String str = this.f9743b;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            String str2 = this.f9744c;
            if (zIsEmpty) {
                ((zzahj) list2.get(0)).f9973e = str2;
            } else {
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    if (((zzahj) list2.get(i11)).f9972d.equals(str)) {
                        ((zzahj) list2.get(i11)).f9973e = str2;
                        break;
                    }
                }
            }
        }
        zzagwVar.f9951j = this.f9745d.booleanValue();
        zzagwVar.f9952k = this.f9746e;
        this.f9747f.m(this.f9748g, zzagwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9742a.zza(str);
    }
}
