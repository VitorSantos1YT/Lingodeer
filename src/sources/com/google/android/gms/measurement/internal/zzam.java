package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
enum zzam {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    zzam(char c11) {
        this.zzk = c11;
    }

    public static zzam a(char c11) {
        for (zzam zzamVar : values()) {
            if (zzamVar.zzk == c11) {
                return zzamVar;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char b() {
        return this.zzk;
    }
}
