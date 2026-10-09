package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import com.google.android.material.datepicker.d;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.tbruyelle.rxpermissions3.BuildConfig;
import defpackage.e;
import java.util.regex.Pattern;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11934b = "files";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11935c = "common";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Account f11936d = zzsa.f11943b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11937e = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImmutableList.Builder f11938f;

    public zzrz(Context context) {
        UnmodifiableListIterator unmodifiableListIterator = ImmutableList.f16771b;
        this.f11938f = new ImmutableList.Builder();
        zzsq.a(context != null, "Context cannot be null", new Object[0]);
        this.f11933a = context.getPackageName();
    }

    public final void a(String str) {
        zzsq.a(zzsa.f11942a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        zzsq.a(!zzsa.f11944c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f11935c = str;
    }

    public final void b(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = zzsa.f11942a;
        this.f11937e = str;
    }

    public final Uri c() {
        String strU;
        String str = this.f11934b;
        String str2 = this.f11935c;
        Account account = zzrv.f11927a;
        Account account2 = this.f11936d;
        zzsq.a(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        zzsq.a(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        zzsq.a(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (zzrv.f11927a.equals(account2)) {
            strU = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            strU = p.u(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = this.f11937e;
        StringBuilder sb2 = new StringBuilder(strU.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        d.w(sb2, "/", str, "/", str2);
        String strP = e.p(sb2, "/", strU, "/", str5);
        ImmutableList immutableListJ = this.f11938f.j();
        Pattern pattern = zzsp.f11954a;
        return new Uri.Builder().scheme("android").authority(this.f11933a).path(strP).encodedFragment(immutableListJ.isEmpty() ? null : "transform=".concat(String.valueOf(new Joiner("+").c(immutableListJ)))).build();
    }
}
