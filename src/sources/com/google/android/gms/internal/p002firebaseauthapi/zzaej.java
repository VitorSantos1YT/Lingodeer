package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class zzaej {
    private zzaej() {
    }

    public static String b(String str) throws zzabz {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            zzagb zzagbVar = new zzagb();
            zzagbVar.zza(str);
            if (TextUtils.isEmpty(zzagbVar.f9918a)) {
                throw new zzabz("No error message: ".concat(str));
            }
            return zzagbVar.f9918a;
        } catch (Exception e8) {
            throw new zzabz(a.e("Json conversion failed! ", e8.getMessage()), e8);
        }
    }

    public static zzael a(String str, zzael zzaelVar) throws zzabz {
        if (zzaelVar == null) {
            return null;
        }
        try {
            return zzaelVar.zza(str);
        } catch (Exception e8) {
            throw new zzabz(a.e(OCBJEWZHh.inJNkcRxPlt, e8.getMessage()), e8);
        }
    }
}
