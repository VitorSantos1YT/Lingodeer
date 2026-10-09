package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzahk;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.MultiFactorInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzw implements ActionCodeResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18031a;

    public zzw(zzahn zzahnVar) {
        zzahnVar.getClass();
        String str = zzahnVar.f9984c;
        if (str == null) {
            this.f18031a = 3;
            return;
        }
        int i11 = 5;
        switch (str) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i11 = 6;
                break;
            case "PASSWORD_RESET":
                i11 = 0;
                break;
            case "VERIFY_EMAIL":
                i11 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i11 = 4;
                break;
            case "RECOVER_EMAIL":
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        this.f18031a = i11;
        if (i11 == 4 || i11 == 3) {
            return;
        }
        zzahk zzahkVar = zzahnVar.f9985d;
        if (zzahkVar != null) {
            String str2 = zzahnVar.f9982a;
            MultiFactorInfo multiFactorInfoA = zzbi.a(zzahkVar);
            new zzt();
            Preconditions.d(str2);
            Preconditions.g(multiFactorInfoA);
            return;
        }
        String str3 = zzahnVar.f9983b;
        if (str3 != null) {
            String str4 = zzahnVar.f9982a;
            new zzr();
            Preconditions.d(str3);
            Preconditions.d(str4);
            return;
        }
        String str5 = zzahnVar.f9982a;
        if (str5 != null) {
            new zzu();
            Preconditions.d(str5);
        }
    }
}
