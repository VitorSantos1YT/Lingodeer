package com.google.android.gms.common;

import b7.e0;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Hex;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzl implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f9153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzk f9155c;

    public /* synthetic */ zzl(boolean z11, String str, zzk zzkVar) {
        this.f9153a = z11;
        this.f9154b = str;
        this.f9155c = zzkVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[LOOP:1: B:17:0x0037->B:19:0x003a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0029 A[EDGE_INSN: B:26:0x0029->B:16:0x0029 BREAK  A[LOOP:0: B:10:0x001c->B:14:0x0025], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0025 A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i11;
        MessageDigest messageDigest;
        byte[] bArrDigest;
        char[] cArr;
        int i12;
        boolean z11 = this.f9153a;
        String str = this.f9154b;
        zzk zzkVar = this.f9155c;
        if (!z11) {
            String str2 = zzo.b(str, zzkVar, true, false).f9189a ? "debug cert rejected" : "not allowed";
            i11 = 0;
            while (true) {
                if (i11 < 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                    if (messageDigest == null) {
                        break;
                    }
                    i11++;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            Preconditions.g(messageDigest);
            bArrDigest = messageDigest.digest(zzkVar.f9152c);
            int length = bArrDigest.length;
            cArr = new char[length + length];
            i12 = 0;
            for (byte b3 : bArrDigest) {
                char[] cArr2 = Hex.f9123b;
                cArr[i12] = cArr2[(b3 & 255) >>> 4];
                cArr[i12 + 1] = cArr2[b3 & 15];
                i12 += 2;
            }
            StringBuilder sbQ = e0.q(str2, ": pkg=", str, ", sha256=", new String(cArr));
            sbQ.append(", atk=");
            sbQ.append(z11);
            sbQ.append(", ver=12451000.false");
            return sbQ.toString();
        }
        zzd zzdVar = zzo.f9161a;
        i11 = 0;
        while (true) {
            if (i11 < 2) {
                messageDigest = null;
                break;
            }
            messageDigest = MessageDigest.getInstance("SHA-256");
            if (messageDigest == null) {
                break;
                break;
            }
            i11++;
        }
        Preconditions.g(messageDigest);
        bArrDigest = messageDigest.digest(zzkVar.f9152c);
        int length2 = bArrDigest.length;
        cArr = new char[length2 + length2];
        i12 = 0;
        while (i < bArrDigest.length) {
            char[] cArr3 = Hex.f9123b;
            cArr[i12] = cArr3[(b3 & 255) >>> 4];
            cArr[i12 + 1] = cArr3[b3 & 15];
            i12 += 2;
        }
        StringBuilder sbQ2 = e0.q(str2, ": pkg=", str, ", sha256=", new String(cArr));
        sbQ2.append(", atk=");
        sbQ2.append(z11);
        sbQ2.append(", ver=12451000.false");
        return sbQ2.toString();
    }
}
