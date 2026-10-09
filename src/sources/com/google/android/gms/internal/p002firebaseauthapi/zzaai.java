package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzaai implements zzafd<zzahw> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzaht f9731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzagw f9732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzadx f9733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzahd f9734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzafd f9735e;

    public zzaai(zzaad zzaadVar, zzadx zzadxVar, zzafd zzafdVar, zzagw zzagwVar, zzahd zzahdVar, zzaht zzahtVar) {
        this.f9731a = zzahtVar;
        this.f9732b = zzagwVar;
        this.f9733c = zzadxVar;
        this.f9734d = zzahdVar;
        this.f9735e = zzafdVar;
        Objects.requireNonNull(zzaadVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void a(zzael zzaelVar) {
        zzahw zzahwVar = (zzahw) zzaelVar;
        Preconditions.d("EMAIL");
        zzaii zzaiiVar = this.f9731a.f9987b;
        boolean zContains = zzaiiVar.f10009a.contains("EMAIL");
        zzagw zzagwVar = this.f9732b;
        if (zContains) {
            zzagwVar.f9943b = null;
        }
        Preconditions.d("DISPLAY_NAME");
        if (zzaiiVar.f10009a.contains("DISPLAY_NAME")) {
            zzagwVar.f9945d = null;
        }
        Preconditions.d("PHOTO_URL");
        if (zzaiiVar.f10009a.contains("PHOTO_URL")) {
            zzagwVar.f9946e = null;
        }
        if (!TextUtils.isEmpty(null)) {
            byte[] bytes = "redacted".getBytes();
            Preconditions.d(bytes == null ? null : Base64.encodeToString(bytes, 0));
        }
        Preconditions.d("delete_passkey");
        if (zzaiiVar.f10009a.contains("delete_passkey")) {
            zzaz zzazVar = zzah.f9955b;
            zzah zzahVar = zzas.f10242e;
            Preconditions.g(zzahVar);
            zzagwVar.m = zzahVar;
        }
        zzahm zzahmVar = zzahwVar.f9991b;
        List arrayList = zzahmVar != null ? zzahmVar.f9981a : null;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        zzahm zzahmVar2 = new zzahm();
        zzagwVar.f9947f = zzahmVar2;
        zzahmVar2.f9981a.addAll(arrayList);
        zzahd zzahdVar = this.f9734d;
        Preconditions.g(zzahdVar);
        String str = zzahwVar.f9992c;
        String str2 = zzahwVar.f9993d;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            zzahdVar = new zzahd(str2, str, Long.valueOf(zzahwVar.f9994e), zzahdVar.f9961d);
        }
        this.f9733c.m(zzahdVar, zzagwVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafe
    public final void zza(String str) {
        this.f9735e.zza(str);
    }
}
