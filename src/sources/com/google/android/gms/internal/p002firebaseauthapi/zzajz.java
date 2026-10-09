package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzajz implements zzamo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzajq f10098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10101d = 0;

    public zzajz(zzajq zzajqVar) {
        byte[] bArr = zzakw.f10134a;
        if (zzajqVar == null) {
            throw new NullPointerException("input");
        }
        this.f10098a = zzajqVar;
        zzajqVar.f10082e = this;
    }

    public static zzajz b(zzajq zzajqVar) {
        Object obj = zzajqVar.f10082e;
        return obj != null ? (zzajz) obj : new zzajz(zzajqVar);
    }

    public static void n(int i11) throws zzale {
        if ((i11 & 3) != 0) {
            throw zzale.f();
        }
    }

    public static void q(int i11) throws zzale {
        if ((i11 & 7) != 0) {
            throw zzale.f();
        }
    }

    public final int A() throws zzalh {
        j(0);
        return this.f10098a.o();
    }

    public final void B(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzaln;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(zzajqVar.s()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iG = zzajqVar.g() + zzajqVar.q();
            do {
                list.add(Long.valueOf(zzajqVar.s()));
            } while (zzajqVar.g() < iG);
            d(iG);
            return;
        }
        zzaln zzalnVar = (zzaln) list;
        int i12 = this.f10099b & 7;
        if (i12 == 0) {
            do {
                zzalnVar.b(zzajqVar.s());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iG2 = zzajqVar.g() + zzajqVar.q();
        do {
            zzalnVar.b(zzajqVar.s());
        } while (zzajqVar.g() < iG2);
        d(iG2);
    }

    public final int C() throws zzalh {
        j(0);
        return this.f10098a.q();
    }

    public final void D(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzakx;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 2) {
                int iQ = zzajqVar.q();
                n(iQ);
                int iG = zzajqVar.g() + iQ;
                do {
                    list.add(Integer.valueOf(zzajqVar.n()));
                } while (zzajqVar.g() < iG);
                return;
            }
            if (i11 != 5) {
                throw zzale.a();
            }
            do {
                list.add(Integer.valueOf(zzajqVar.n()));
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP = zzajqVar.p();
                }
            } while (iP == this.f10099b);
            this.f10101d = iP;
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        int i12 = this.f10099b & 7;
        if (i12 == 2) {
            int iQ2 = zzajqVar.q();
            n(iQ2);
            int iG2 = zzajqVar.g() + iQ2;
            do {
                zzakxVar.d(zzajqVar.n());
            } while (zzajqVar.g() < iG2);
            return;
        }
        if (i12 != 5) {
            throw zzale.a();
        }
        do {
            zzakxVar.d(zzajqVar.n());
            if (zzajqVar.A()) {
                return;
            } else {
                iP2 = zzajqVar.p();
            }
        } while (iP2 == this.f10099b);
        this.f10101d = iP2;
    }

    public final void E(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzaln;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(zzajqVar.t()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iQ = zzajqVar.q();
            q(iQ);
            int iG = zzajqVar.g() + iQ;
            do {
                list.add(Long.valueOf(zzajqVar.t()));
            } while (zzajqVar.g() < iG);
            return;
        }
        zzaln zzalnVar = (zzaln) list;
        int i12 = this.f10099b & 7;
        if (i12 == 1) {
            do {
                zzalnVar.b(zzajqVar.t());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iQ2 = zzajqVar.q();
        q(iQ2);
        int iG2 = zzajqVar.g() + iQ2;
        do {
            zzalnVar.b(zzajqVar.t());
        } while (zzajqVar.g() < iG2);
    }

    public final void F(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzakx;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(zzajqVar.o()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iG = zzajqVar.g() + zzajqVar.q();
            do {
                list.add(Integer.valueOf(zzajqVar.o()));
            } while (zzajqVar.g() < iG);
            d(iG);
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        int i12 = this.f10099b & 7;
        if (i12 == 0) {
            do {
                zzakxVar.d(zzajqVar.o());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iG2 = zzajqVar.g() + zzajqVar.q();
        do {
            zzakxVar.d(zzajqVar.o());
        } while (zzajqVar.g() < iG2);
        d(iG2);
    }

    public final long G() throws zzalh {
        j(1);
        return this.f10098a.t();
    }

    public final void H(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzaln;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(zzajqVar.u()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iG = zzajqVar.g() + zzajqVar.q();
            do {
                list.add(Long.valueOf(zzajqVar.u()));
            } while (zzajqVar.g() < iG);
            d(iG);
            return;
        }
        zzaln zzalnVar = (zzaln) list;
        int i12 = this.f10099b & 7;
        if (i12 == 0) {
            do {
                zzalnVar.b(zzajqVar.u());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iG2 = zzajqVar.g() + zzajqVar.q();
        do {
            zzalnVar.b(zzajqVar.u());
        } while (zzajqVar.g() < iG2);
        d(iG2);
    }

    public final long I() throws zzalh {
        j(0);
        return this.f10098a.u();
    }

    public final long J() throws zzalh {
        j(0);
        return this.f10098a.v();
    }

    public final void K(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzakx;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(zzajqVar.q()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iG = zzajqVar.g() + zzajqVar.q();
            do {
                list.add(Integer.valueOf(zzajqVar.q()));
            } while (zzajqVar.g() < iG);
            d(iG);
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        int i12 = this.f10099b & 7;
        if (i12 == 0) {
            do {
                zzakxVar.d(zzajqVar.q());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iG2 = zzajqVar.g() + zzajqVar.q();
        do {
            zzakxVar.d(zzajqVar.q());
        } while (zzajqVar.g() < iG2);
        d(iG2);
    }

    public final void L(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzaln;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(zzajqVar.v()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iG = zzajqVar.g() + zzajqVar.q();
            do {
                list.add(Long.valueOf(zzajqVar.v()));
            } while (zzajqVar.g() < iG);
            d(iG);
            return;
        }
        zzaln zzalnVar = (zzaln) list;
        int i12 = this.f10099b & 7;
        if (i12 == 0) {
            do {
                zzalnVar.b(zzajqVar.v());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iG2 = zzajqVar.g() + zzajqVar.q();
        do {
            zzalnVar.b(zzajqVar.v());
        } while (zzajqVar.g() < iG2);
        d(iG2);
    }

    public final boolean M() throws zzalh {
        j(0);
        return this.f10098a.B();
    }

    public final boolean N() {
        int i11;
        zzajq zzajqVar = this.f10098a;
        if (zzajqVar.A() || (i11 = this.f10099b) == this.f10100c) {
            return false;
        }
        return zzajqVar.l(i11);
    }

    public final double a() throws zzalh {
        j(1);
        return this.f10098a.a();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final String c() throws zzalh {
        j(2);
        return this.f10098a.x();
    }

    public final void d(int i11) throws zzale {
        if (this.f10098a.g() != i11) {
            throw zzale.g();
        }
    }

    public final void e(zzaly zzalyVar, zzamr zzamrVar, zzakj zzakjVar) throws zzalh {
        j(3);
        o(zzalyVar, zzamrVar, zzakjVar);
    }

    public final void f(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzajc;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(zzajqVar.B()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iG = zzajqVar.g() + zzajqVar.q();
            do {
                list.add(Boolean.valueOf(zzajqVar.B()));
            } while (zzajqVar.g() < iG);
            d(iG);
            return;
        }
        zzajc zzajcVar = (zzajc) list;
        int i12 = this.f10099b & 7;
        if (i12 == 0) {
            do {
                zzajcVar.b(zzajqVar.B());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iG2 = zzajqVar.g() + zzajqVar.q();
        do {
            zzajcVar.b(zzajqVar.B());
        } while (zzajqVar.g() < iG2);
        d(iG2);
    }

    public final void g(List list, zzamr zzamrVar, zzakj zzakjVar) throws zzalh {
        int iP;
        int i11 = this.f10099b;
        if ((i11 & 7) != 3) {
            throw zzale.a();
        }
        do {
            Object objZza = zzamrVar.zza();
            o(objZza, zzamrVar, zzakjVar);
            zzamrVar.c(objZza);
            list.add(objZza);
            zzajq zzajqVar = this.f10098a;
            if (zzajqVar.A() || this.f10101d != 0) {
                return;
            } else {
                iP = zzajqVar.p();
            }
        } while (iP == i11);
        this.f10101d = iP;
    }

    public final void h(List list, boolean z11) throws zzalh {
        int iP;
        int iP2;
        if ((this.f10099b & 7) != 2) {
            throw zzale.a();
        }
        boolean z12 = list instanceof zzalj;
        zzajq zzajqVar = this.f10098a;
        if (!z12 || z11) {
            do {
                list.add(z11 ? zzr() : c());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP = zzajqVar.p();
                }
            } while (iP == this.f10099b);
            this.f10101d = iP;
            return;
        }
        zzalj zzaljVar = (zzalj) list;
        do {
            zzp();
            zzaljVar.m203zza();
            if (zzajqVar.A()) {
                return;
            } else {
                iP2 = zzajqVar.p();
            }
        } while (iP2 == this.f10099b);
        this.f10101d = iP2;
    }

    public final float i() throws zzalh {
        j(5);
        return this.f10098a.e();
    }

    public final void j(int i11) throws zzalh {
        if ((this.f10099b & 7) != i11) {
            throw zzale.a();
        }
    }

    public final void k(zzaly zzalyVar, zzamr zzamrVar, zzakj zzakjVar) throws zzale {
        j(2);
        r(zzalyVar, zzamrVar, zzakjVar);
    }

    public final void l(List list) throws zzalh {
        int iP;
        if ((this.f10099b & 7) != 2) {
            throw zzale.a();
        }
        do {
            list.add(zzp());
            zzajq zzajqVar = this.f10098a;
            if (zzajqVar.A()) {
                return;
            } else {
                iP = zzajqVar.p();
            }
        } while (iP == this.f10099b);
        this.f10101d = iP;
    }

    public final void m(List list, zzamr zzamrVar, zzakj zzakjVar) throws zzale {
        int iP;
        int i11 = this.f10099b;
        if ((i11 & 7) != 2) {
            throw zzale.a();
        }
        do {
            Object objZza = zzamrVar.zza();
            r(objZza, zzamrVar, zzakjVar);
            zzamrVar.c(objZza);
            list.add(objZza);
            zzajq zzajqVar = this.f10098a;
            if (zzajqVar.A() || this.f10101d != 0) {
                return;
            } else {
                iP = zzajqVar.p();
            }
        } while (iP == i11);
        this.f10101d = iP;
    }

    public final void o(Object obj, zzamr zzamrVar, zzakj zzakjVar) {
        int i11 = this.f10100c;
        this.f10100c = ((this.f10099b >>> 3) << 3) | 4;
        try {
            zzamrVar.f(obj, this, zzakjVar);
            if (this.f10099b != this.f10100c) {
                throw zzale.f();
            }
            this.f10100c = i11;
        } catch (Throwable th2) {
            this.f10100c = i11;
            throw th2;
        }
    }

    public final void p(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzakh;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(zzajqVar.a()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iQ = zzajqVar.q();
            q(iQ);
            int iG = zzajqVar.g() + iQ;
            do {
                list.add(Double.valueOf(zzajqVar.a()));
            } while (zzajqVar.g() < iG);
            return;
        }
        zzakh zzakhVar = (zzakh) list;
        int i12 = this.f10099b & 7;
        if (i12 == 1) {
            do {
                zzakhVar.b(zzajqVar.a());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iQ2 = zzajqVar.q();
        q(iQ2);
        int iG2 = zzajqVar.g() + iQ2;
        do {
            zzakhVar.b(zzajqVar.a());
        } while (zzajqVar.g() < iG2);
    }

    public final void r(Object obj, zzamr zzamrVar, zzakj zzakjVar) throws zzale {
        zzajq zzajqVar = this.f10098a;
        int iQ = zzajqVar.q();
        if (zzajqVar.f10078a + zzajqVar.f10079b >= zzajqVar.f10080c) {
            throw new zzale("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iF = zzajqVar.f(iQ);
        zzajqVar.f10078a++;
        zzamrVar.f(obj, this, zzakjVar);
        zzajqVar.h(0);
        zzajqVar.f10078a--;
        zzajqVar.j(iF);
    }

    public final void s(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzakx;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(zzajqVar.i()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iG = zzajqVar.g() + zzajqVar.q();
            do {
                list.add(Integer.valueOf(zzajqVar.i()));
            } while (zzajqVar.g() < iG);
            d(iG);
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        int i12 = this.f10099b & 7;
        if (i12 == 0) {
            do {
                zzakxVar.d(zzajqVar.i());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iG2 = zzajqVar.g() + zzajqVar.q();
        do {
            zzakxVar.d(zzajqVar.i());
        } while (zzajqVar.g() < iG2);
        d(iG2);
    }

    public final int t() throws zzalh {
        j(0);
        return this.f10098a.i();
    }

    public final void u(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzakx;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 2) {
                int iQ = zzajqVar.q();
                n(iQ);
                int iG = zzajqVar.g() + iQ;
                do {
                    list.add(Integer.valueOf(zzajqVar.k()));
                } while (zzajqVar.g() < iG);
                return;
            }
            if (i11 != 5) {
                throw zzale.a();
            }
            do {
                list.add(Integer.valueOf(zzajqVar.k()));
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP = zzajqVar.p();
                }
            } while (iP == this.f10099b);
            this.f10101d = iP;
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        int i12 = this.f10099b & 7;
        if (i12 == 2) {
            int iQ2 = zzajqVar.q();
            n(iQ2);
            int iG2 = zzajqVar.g() + iQ2;
            do {
                zzakxVar.d(zzajqVar.k());
            } while (zzajqVar.g() < iG2);
            return;
        }
        if (i12 != 5) {
            throw zzale.a();
        }
        do {
            zzakxVar.d(zzajqVar.k());
            if (zzajqVar.A()) {
                return;
            } else {
                iP2 = zzajqVar.p();
            }
        } while (iP2 == this.f10099b);
        this.f10101d = iP2;
    }

    public final void v(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzaln;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(zzajqVar.r()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iQ = zzajqVar.q();
            q(iQ);
            int iG = zzajqVar.g() + iQ;
            do {
                list.add(Long.valueOf(zzajqVar.r()));
            } while (zzajqVar.g() < iG);
            return;
        }
        zzaln zzalnVar = (zzaln) list;
        int i12 = this.f10099b & 7;
        if (i12 == 1) {
            do {
                zzalnVar.b(zzajqVar.r());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iQ2 = zzajqVar.q();
        q(iQ2);
        int iG2 = zzajqVar.g() + iQ2;
        do {
            zzalnVar.b(zzajqVar.r());
        } while (zzajqVar.g() < iG2);
    }

    public final int w() throws zzalh {
        j(0);
        return this.f10098a.m();
    }

    public final void x(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzaks;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 2) {
                int iQ = zzajqVar.q();
                n(iQ);
                int iG = zzajqVar.g() + iQ;
                do {
                    list.add(Float.valueOf(zzajqVar.e()));
                } while (zzajqVar.g() < iG);
                return;
            }
            if (i11 != 5) {
                throw zzale.a();
            }
            do {
                list.add(Float.valueOf(zzajqVar.e()));
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP = zzajqVar.p();
                }
            } while (iP == this.f10099b);
            this.f10101d = iP;
            return;
        }
        zzaks zzaksVar = (zzaks) list;
        int i12 = this.f10099b & 7;
        if (i12 == 2) {
            int iQ2 = zzajqVar.q();
            n(iQ2);
            int iG2 = zzajqVar.g() + iQ2;
            do {
                zzaksVar.b(zzajqVar.e());
            } while (zzajqVar.g() < iG2);
            return;
        }
        if (i12 != 5) {
            throw zzale.a();
        }
        do {
            zzaksVar.b(zzajqVar.e());
            if (zzajqVar.A()) {
                return;
            } else {
                iP2 = zzajqVar.p();
            }
        } while (iP2 == this.f10099b);
        this.f10101d = iP2;
    }

    public final int y() throws zzalh {
        j(5);
        return this.f10098a.n();
    }

    public final void z(List list) throws zzale {
        int iP;
        int iP2;
        boolean z11 = list instanceof zzakx;
        zzajq zzajqVar = this.f10098a;
        if (!z11) {
            int i11 = this.f10099b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(zzajqVar.m()));
                    if (zzajqVar.A()) {
                        return;
                    } else {
                        iP = zzajqVar.p();
                    }
                } while (iP == this.f10099b);
                this.f10101d = iP;
                return;
            }
            if (i11 != 2) {
                throw zzale.a();
            }
            int iG = zzajqVar.g() + zzajqVar.q();
            do {
                list.add(Integer.valueOf(zzajqVar.m()));
            } while (zzajqVar.g() < iG);
            d(iG);
            return;
        }
        zzakx zzakxVar = (zzakx) list;
        int i12 = this.f10099b & 7;
        if (i12 == 0) {
            do {
                zzakxVar.d(zzajqVar.m());
                if (zzajqVar.A()) {
                    return;
                } else {
                    iP2 = zzajqVar.p();
                }
            } while (iP2 == this.f10099b);
            this.f10101d = iP2;
            return;
        }
        if (i12 != 2) {
            throw zzale.a();
        }
        int iG2 = zzajqVar.g() + zzajqVar.q();
        do {
            zzakxVar.d(zzajqVar.m());
        } while (zzajqVar.g() < iG2);
        d(iG2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final int zzc() {
        int i11 = this.f10101d;
        if (i11 != 0) {
            this.f10099b = i11;
            this.f10101d = 0;
        } else {
            this.f10099b = this.f10098a.p();
        }
        int i12 = this.f10099b;
        if (i12 == 0 || i12 == this.f10100c) {
            return Integer.MAX_VALUE;
        }
        return i12 >>> 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final int zzd() {
        return this.f10099b;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final int zzf() throws zzalh {
        j(5);
        return this.f10098a.k();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final long zzk() throws zzalh {
        j(1);
        return this.f10098a.r();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final long zzl() throws zzalh {
        j(0);
        return this.f10098a.s();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final zzaje zzp() throws zzalh {
        j(2);
        return this.f10098a.w();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamo
    public final String zzr() throws zzalh {
        j(2);
        return this.f10098a.y();
    }
}
