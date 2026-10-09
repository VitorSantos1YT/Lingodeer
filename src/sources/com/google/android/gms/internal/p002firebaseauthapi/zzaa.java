package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzaa extends zzd<String> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f9708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzf f9709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9710e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9711f;

    public zzaa(zzt zztVar, CharSequence charSequence) {
        this.f9709d = zztVar.f10952a;
        this.f9711f = zztVar.f10954c;
        this.f9708c = charSequence;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzd
    public final String a() {
        zzf zzfVar;
        int i11 = this.f9710e;
        while (true) {
            int i12 = this.f9710e;
            if (i12 == -1) {
                this.f10290a = 3;
                return null;
            }
            int iC = c(i12);
            CharSequence charSequence = this.f9708c;
            if (iC == -1) {
                iC = charSequence.length();
                this.f9710e = -1;
            } else {
                this.f9710e = b(iC);
            }
            int i13 = this.f9710e;
            if (i13 != i11) {
                while (true) {
                    zzfVar = this.f9709d;
                    if (i11 >= iC || !zzfVar.b(charSequence.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                while (iC > i11 && zzfVar.b(charSequence.charAt(iC - 1))) {
                    iC--;
                }
                int i14 = this.f9711f;
                if (i14 == 1) {
                    iC = charSequence.length();
                    this.f9710e = -1;
                    while (iC > i11 && zzfVar.b(charSequence.charAt(iC - 1))) {
                        iC--;
                    }
                } else {
                    this.f9711f = i14 - 1;
                }
                return charSequence.subSequence(i11, iC).toString();
            }
            int i15 = i13 + 1;
            this.f9710e = i15;
            if (i15 > charSequence.length()) {
                this.f9710e = -1;
            }
        }
    }

    public abstract int b(int i11);

    public abstract int c(int i11);
}
