package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.iid.QyE.SemtNwfPgIhi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum zzve implements zzakz {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzve(int i11) {
        this.zzh = i11;
    }

    public static zzve a(int i11) {
        if (i11 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i11 == 2) {
            return NIST_P256;
        }
        if (i11 == 3) {
            return NIST_P384;
        }
        if (i11 == 4) {
            return NIST_P521;
        }
        if (i11 != 5) {
            return null;
        }
        return CURVE25519;
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        zzakw.c();
        throw null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzve.class.getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb2.append(" number=");
            sb2.append(zza());
        }
        sb2.append(SemtNwfPgIhi.kmoXNK);
        sb2.append(name());
        sb2.append('>');
        return sb2.toString();
    }
}
