package com.google.android.recaptcha.internal;

import android.content.Context;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import lz.b;
import lz.c;
import ns.o;
import oz.x;
import ry.m;
import ry.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                for (File file : fileArrListFiles) {
                    if (x.s0(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    ((File) obj).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(n.W(cVar, 10));
        Iterator it = cVar.iterator();
        while (true) {
            b bVar = (b) it;
            boolean z11 = bVar.f40528c;
            if (!z11) {
                String strY0 = m.y0(((ArrayList) o.S(arrayList)).subList(0, 8), BuildConfig.VERSION_NAME, null, null, null, 62);
                File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strY0)));
                zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
                file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
                return;
            }
            int i11 = bVar.f40529d;
            if (i11 != bVar.f40527b) {
                bVar.f40529d = bVar.f40526a + i11;
            } else {
                if (!z11) {
                    throw new NoSuchElementException();
                }
                bVar.f40528c = false;
            }
            arrayList.add(Character.valueOf((char) i11));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (kotlin.jvm.internal.m.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                }
            }
            return file != null;
        } catch (Exception unused) {
        }
    }
}
