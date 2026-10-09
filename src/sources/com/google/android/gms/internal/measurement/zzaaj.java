package com.google.android.gms.internal.measurement;

import android.os.Build;
import dalvik.system.VMStack;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaaj extends zzaad {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zzaac f11135b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    final class zza {
    }

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            zza.class.getName().equals(d());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        f11135b = new zzaac() { // from class: com.google.android.gms.internal.measurement.zzaaj.1
        };
    }

    public static String d() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public final zzaac a() {
        return f11135b;
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public final zzzf b() {
        zzzf zzzfVarZza;
        AtomicReference atomicReference = zzaao.f11143f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            return ((zzaai) atomicReference.get()).zza("Phlogger");
        }
        for (int i11 = 7; i11 >= 0; i11--) {
            char cCharAt = "Phlogger".charAt(i11);
            if (cCharAt == '$') {
                strReplace = "Phlogger".replace('$', '.');
                break;
            }
            if (cCharAt == '.') {
                break;
            }
        }
        zzaao zzaaoVar = new zzaao(strReplace);
        if (zzaao.f11140c || zzaao.f11141d) {
            new zzaah();
            zzaaoVar.f11146b = new zzaar(zzaaoVar.f11134a);
        } else {
            if (zzaao.f11142e) {
                zzaaq zzaaqVar = zzaas.f11157h;
                zzzfVarZza = new zzaaq(Level.OFF, zzaaqVar.f11150b, zzaaqVar.f11151c).zza(zzaaoVar.f11134a);
            } else {
                zzzfVarZza = null;
            }
            zzaaoVar.f11146b = zzzfVarZza;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = zzaam.f11137a;
        concurrentLinkedQueue.offer(zzaaoVar);
        if (atomicReference.get() != null) {
            while (true) {
                zzaao zzaaoVar2 = (zzaao) concurrentLinkedQueue.poll();
                if (zzaaoVar2 == null) {
                    break;
                }
                zzaaoVar2.f11146b = ((zzaai) atomicReference.get()).zza(zzaaoVar2.f11134a);
            }
            zzaao.e();
        }
        return zzaaoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzaad
    public final zzaat c() {
        return zzaap.f11147b;
    }
}
