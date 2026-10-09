package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzame<T> implements zzamr<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzaly f10177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzanf f10178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzakl f10180d;

    public zzame(zzanf zzanfVar, zzakl zzaklVar, zzaly zzalyVar) {
        this.f10178b = zzanfVar;
        this.f10179c = zzaklVar.g(zzalyVar);
        this.f10180d = zzaklVar;
        this.f10177a = zzalyVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final boolean a(Object obj) {
        this.f10180d.b(obj).f();
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final void b(Object obj, Object obj2) {
        zzanh zzanhVar = zzamq.f10194a;
        zzanf zzanfVar = this.f10178b;
        zzanfVar.o(obj, zzanfVar.c(zzanfVar.p(obj), zzanfVar.p(obj2)));
        if (this.f10179c) {
            zzamq.b(this.f10180d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final void c(Object obj) {
        this.f10178b.r(obj);
        this.f10180d.j(obj);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098 A[EDGE_INSN: B:50:0x0098->B:37:0x0098 BREAK  A[LOOP:1: B:19:0x0058->B:29:0x0078], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final void d(Object obj, byte[] bArr, int i11, int i12, zzajd zzajdVar) throws zzale {
        zzaku zzakuVar = (zzaku) obj;
        zzani zzaniVarE = zzakuVar.zzb;
        if (zzaniVarE == zzani.f10217f) {
            zzaniVarE = zzani.e();
            zzakuVar.zzb = zzaniVarE;
        }
        zzani zzaniVar = zzaniVarE;
        ((zzaku.zzd) obj).v();
        int iA = i11;
        zzaku.zzf zzfVar = null;
        while (iA < i12) {
            zzaku.zzf zzfVarC = zzfVar;
            int iJ = zzaja.j(bArr, iA, zzajdVar);
            int i13 = zzajdVar.f10061a;
            zzakj zzakjVar = zzajdVar.f10064d;
            zzaly zzalyVar = this.f10177a;
            zzakl zzaklVar = this.f10180d;
            int i14 = 2;
            if (i13 == 11) {
                int i15 = 0;
                zzaje zzajeVar = null;
                while (iJ < i12) {
                    iJ = zzaja.j(bArr, iJ, zzajdVar);
                    int i16 = zzajdVar.f10061a;
                    int i17 = i16 >>> 3;
                    int i18 = i16 & 7;
                    if (i17 == i14) {
                        if (i18 != 0) {
                            if (i16 == 12) {
                                break;
                                break;
                            }
                            iJ = zzaja.a(i16, bArr, iJ, i12, zzajdVar);
                        } else {
                            iJ = zzaja.j(bArr, iJ, zzajdVar);
                            i15 = zzajdVar.f10061a;
                            zzfVarC = zzaklVar.c(zzakjVar, zzalyVar, i15);
                        }
                    } else if (i17 != 3) {
                        if (i16 == 12) {
                            break;
                            break;
                        }
                        iJ = zzaja.a(i16, bArr, iJ, i12, zzajdVar);
                    } else {
                        if (zzfVarC != null) {
                            zzamn zzamnVar = zzamn.f10187c;
                            throw new NoSuchMethodError();
                        }
                        if (i18 != 2) {
                            if (i16 == 12) {
                                break;
                            } else {
                                iJ = zzaja.a(i16, bArr, iJ, i12, zzajdVar);
                            }
                        } else {
                            iJ = zzaja.g(bArr, iJ, zzajdVar);
                            zzajeVar = (zzaje) zzajdVar.f10063c;
                        }
                    }
                    i14 = 2;
                }
                if (zzajeVar != null) {
                    zzaniVar.c((i15 << 3) | 2, zzajeVar);
                }
                iA = iJ;
            } else if ((i13 & 7) == 2) {
                zzfVarC = zzaklVar.c(zzakjVar, zzalyVar, i13 >>> 3);
                if (zzfVarC != null) {
                    zzamn zzamnVar2 = zzamn.f10187c;
                    throw new NoSuchMethodError();
                }
                iA = zzaja.c(i13, bArr, iJ, i12, zzaniVar, zzajdVar);
            } else {
                iA = zzaja.a(i13, bArr, iJ, i12, zzajdVar);
            }
            zzfVar = zzfVarC;
        }
        if (iA != i12) {
            throw zzale.f();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final void e(Object obj, zzake zzakeVar) {
        Iterator itC = this.f10180d.b(obj).c();
        if (itC.hasNext()) {
            ((zzako) ((Map.Entry) itC.next()).getKey()).zzc();
            throw null;
        }
        zzanf zzanfVar = this.f10178b;
        zzanfVar.h(zzanfVar.p(obj), zzakeVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final void f(Object obj, zzajz zzajzVar, zzakj zzakjVar) {
        boolean zN;
        zzanf zzanfVar = this.f10178b;
        zzani zzaniVarN = zzanfVar.n(obj);
        zzakl zzaklVar = this.f10180d;
        zzaklVar.i(obj);
        while (zzajzVar.zzc() != Integer.MAX_VALUE) {
            try {
                int i11 = zzajzVar.f10099b;
                int iC = 0;
                zzaly zzalyVar = this.f10177a;
                if (i11 == 11) {
                    zzaku.zzf zzfVarC = null;
                    zzaje zzajeVarZzp = null;
                    while (zzajzVar.zzc() != Integer.MAX_VALUE) {
                        int i12 = zzajzVar.f10099b;
                        if (i12 == 16) {
                            iC = zzajzVar.C();
                            zzfVarC = zzaklVar.c(zzakjVar, zzalyVar, iC);
                        } else if (i12 == 26) {
                            if (zzfVarC != null) {
                                zzaklVar.e(zzfVarC);
                                throw null;
                            }
                            zzajeVarZzp = zzajzVar.zzp();
                        } else if (i12 == 12 || !zzajzVar.N()) {
                            break;
                        }
                    }
                    if (zzajzVar.f10099b != 12) {
                        throw new zzale("Protocol message end-group tag did not match expected tag.");
                    }
                    if (zzajeVarZzp != null) {
                        if (zzfVarC != null) {
                            zzaklVar.h(zzfVarC);
                            throw null;
                        }
                        zzanfVar.f(zzaniVarN, iC, zzajeVarZzp);
                    }
                    zN = true;
                } else if ((i11 & 7) == 2) {
                    zzaku.zzf zzfVarC2 = zzaklVar.c(zzakjVar, zzalyVar, i11 >>> 3);
                    if (zzfVarC2 != null) {
                        zzaklVar.e(zzfVarC2);
                        throw null;
                    }
                    zN = zzanfVar.i(0, zzajzVar, zzaniVarN);
                } else {
                    zN = zzajzVar.N();
                }
                if (!zN) {
                    zzanfVar.m(obj, zzaniVarN);
                    return;
                }
            } catch (Throwable th2) {
                zzanfVar.m(obj, zzaniVarN);
                throw th2;
            }
        }
        zzanfVar.m(obj, zzaniVarN);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final boolean g(zzaku zzakuVar, zzaku zzakuVar2) {
        zzanf zzanfVar = this.f10178b;
        if (!zzanfVar.p(zzakuVar).equals(zzanfVar.p(zzakuVar2))) {
            return false;
        }
        if (!this.f10179c) {
            return true;
        }
        zzakl zzaklVar = this.f10180d;
        return zzaklVar.b(zzakuVar).equals(zzaklVar.b(zzakuVar2));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final int h(zzaix zzaixVar) {
        zzanf zzanfVar = this.f10178b;
        int iJ = zzanfVar.j(zzanfVar.p(zzaixVar));
        if (this.f10179c) {
            zzams zzamsVar = this.f10180d.b(zzaixVar).f10120a;
            if (zzamsVar.f10197b > 0) {
                zzakm.a(zzamsVar.c(0));
                throw null;
            }
            Iterator<T> it = zzamsVar.f().iterator();
            if (it.hasNext()) {
                zzakm.a((Map.Entry) it.next());
                throw null;
            }
        }
        return iJ;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final int i(zzaku zzakuVar) {
        int iHashCode = this.f10178b.p(zzakuVar).hashCode();
        return this.f10179c ? (iHashCode * 53) + this.f10180d.b(zzakuVar).f10120a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamr
    public final Object zza() {
        zzaly zzalyVar = this.f10177a;
        return zzalyVar instanceof zzaku ? ((zzaku) zzalyVar).r() : zzalyVar.c().h();
    }
}
