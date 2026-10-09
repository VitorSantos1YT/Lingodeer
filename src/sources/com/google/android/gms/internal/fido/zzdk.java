package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdk extends zzdr {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzdr zzdrVar = (zzdr) obj;
        int iZza = zzdrVar.zza();
        int iA = zzdr.a((byte) 64);
        if (iA != iZza) {
            return iA - zzdrVar.zza();
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdk.class != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.a((byte) 64)), null});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        zzcg zzcgVar = (zzcg) zzch.f9691a;
        if (zzcgVar.f9690d == null) {
            zzcd zzcdVar = zzcgVar.f9688b;
            char[] cArr = zzcdVar.f9680b;
            for (char c11 : cArr) {
                if (c11 >= 'a' && c11 <= 'z') {
                    int length = cArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            char[] cArr2 = new char[cArr.length];
                            for (int i12 = 0; i12 < cArr.length; i12++) {
                                char c12 = cArr[i12];
                                if (c12 >= 97 && c12 <= 122) {
                                    c12 ^= 32;
                                }
                                cArr2[i12] = (char) c12;
                            }
                            zzcd zzcdVar2 = new zzcd(zzcdVar.f9679a.concat(".upperCase()"), cArr2);
                            byte[] bArr = zzcdVar2.f9685g;
                            if (zzcdVar.f9686h && !zzcdVar2.f9686h) {
                                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                                for (int i13 = 65; i13 <= 90; i13++) {
                                    int i14 = i13 | 32;
                                    byte b3 = bArr[i13];
                                    byte b11 = bArr[i14];
                                    if (b3 == -1) {
                                        bArrCopyOf[i13] = b11;
                                    } else {
                                        char c13 = (char) i13;
                                        char c14 = (char) i14;
                                        if (b11 != -1) {
                                            throw new IllegalStateException(zzaq.a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                                        }
                                        bArrCopyOf[i14] = b3;
                                    }
                                }
                                zzcdVar = new zzcd(zzcdVar2.f9679a.concat(".ignoreCase()"), zzcdVar2.f9680b, bArrCopyOf, true);
                                break;
                            }
                            zzcdVar = zzcdVar2;
                            break;
                        }
                        char c15 = cArr[i11];
                        if (c15 >= 'A' && c15 <= 'Z') {
                            throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                        }
                        i11++;
                    }
                }
            }
            zzcgVar.f9690d = zzcdVar == zzcgVar.f9688b ? zzcgVar : zzcgVar.d(zzcdVar, zzcgVar.f9689c);
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zza() {
        return zzdr.a((byte) 64);
    }
}
