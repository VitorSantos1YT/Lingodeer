package com.github.javiersantos.piracychecker;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.p0;
import androidx.fragment.app.y;
import com.github.javiersantos.piracychecker.utils.LibraryUtilsKt;
import kotlin.jvm.internal.m;
import l.k;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PiracyCheckerDialog extends y {
    public static PiracyCheckerDialog S;
    public static String T;
    public static String U;
    public static final Companion V = new Companion(0);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i11) {
            this();
        }
    }

    @Override // androidx.fragment.app.y
    public final Dialog r(Bundle bundle) {
        k kVarA;
        super.r(bundle);
        this.f1875t = false;
        Dialog dialog = this.N;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        p0 activity = getActivity();
        if (activity != null) {
            String str = T;
            String str2 = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
            if (str == null) {
                str = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
            }
            String str3 = U;
            if (str3 != null) {
                str2 = str3;
            }
            kVarA = LibraryUtilsKt.a(activity, str, str2);
        } else {
            kVarA = null;
        }
        m.c(kVarA);
        return kVarA;
    }
}
