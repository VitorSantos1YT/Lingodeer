package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzacw implements zzafo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzacv f11232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11235d = 0;

    public zzacw(zzacv zzacvVar) {
        this.f11232a = zzacvVar;
        zzacvVar.f11231c = this;
    }

    public static final void v(int i11) throws zzaeh {
        if ((i11 & 3) != 0) {
            throw new zzaeh("Failed to parse the message.");
        }
    }

    public static final void w(int i11) throws zzaeh {
        if ((i11 & 7) != 0) {
            throw new zzaeh("Failed to parse the message.");
        }
    }

    public final long A() throws zzaeg {
        q(0);
        return this.f11232a.q();
    }

    public final long B() throws zzaeg {
        q(0);
        return this.f11232a.r();
    }

    public final int C() throws zzaeg {
        q(0);
        return this.f11232a.s();
    }

    public final long D() throws zzaeg {
        q(1);
        return this.f11232a.t();
    }

    public final int E() throws zzaeg {
        q(5);
        return this.f11232a.u();
    }

    public final boolean F() throws zzaeg {
        q(0);
        return this.f11232a.v();
    }

    public final String G() throws zzaeg {
        q(2);
        return this.f11232a.w();
    }

    public final String H() throws zzaeg {
        q(2);
        return this.f11232a.x();
    }

    public final void I(zzafc zzafcVar, zzafp zzafpVar, zzadf zzadfVar) throws zzaeh {
        q(2);
        r(zzafcVar, zzafpVar, zzadfVar);
    }

    public final void J(zzafc zzafcVar, zzafp zzafpVar, zzadf zzadfVar) throws zzaeg {
        q(3);
        s(zzafcVar, zzafpVar, zzadfVar);
    }

    public final zzacr K() throws zzaeg {
        q(2);
        return this.f11232a.y();
    }

    public final int L() throws zzaeg {
        q(0);
        return this.f11232a.A();
    }

    public final int M() throws zzaeg {
        q(0);
        return this.f11232a.B();
    }

    public final int N() throws zzaeg {
        q(5);
        return this.f11232a.C();
    }

    public final long O() throws zzaeg {
        q(1);
        return this.f11232a.D();
    }

    public final int P() throws zzaeg {
        q(0);
        return this.f11232a.E();
    }

    public final long Q() throws zzaeg {
        q(0);
        return this.f11232a.F();
    }

    public final void R(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzadc;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzadc zzadcVar = (zzadc) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iA = zzacvVar.A();
                w(iA);
                int iE = zzacvVar.e() + iA;
                do {
                    zzadcVar.d(zzacvVar.o());
                } while (zzacvVar.e() < iE);
                return;
            }
            do {
                zzadcVar.d(zzacvVar.o());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iA2 = zzacvVar.A();
                w(iA2);
                int iE2 = zzacvVar.e() + iA2;
                do {
                    zzaefVar.add(Double.valueOf(zzacvVar.o()));
                } while (zzacvVar.e() < iE2);
                return;
            }
            do {
                zzaefVar.add(Double.valueOf(zzacvVar.o()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void S(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzadm;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzadm zzadmVar = (zzadm) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 == 2) {
                int iA = zzacvVar.A();
                v(iA);
                int iE = zzacvVar.e() + iA;
                do {
                    zzadmVar.d(zzacvVar.p());
                } while (zzacvVar.e() < iE);
                return;
            }
            if (i11 != 5) {
                throw new zzaeg();
            }
            do {
                zzadmVar.d(zzacvVar.p());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 == 2) {
                int iA2 = zzacvVar.A();
                v(iA2);
                int iE2 = zzacvVar.e() + iA2;
                do {
                    zzaefVar.add(Float.valueOf(zzacvVar.p()));
                } while (zzacvVar.e() < iE2);
                return;
            }
            if (i12 != 5) {
                throw new zzaeg();
            }
            do {
                zzaefVar.add(Float.valueOf(zzacvVar.p()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void T(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzaeq;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzaeq zzaeqVar = (zzaeq) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iE = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaeqVar.d(zzacvVar.q());
                } while (zzacvVar.e() < iE);
                u(iE);
                return;
            }
            do {
                zzaeqVar.d(zzacvVar.q());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iE2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.q()));
                } while (zzacvVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.q()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void a(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzaeq;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzaeq zzaeqVar = (zzaeq) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iE = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaeqVar.d(zzacvVar.r());
                } while (zzacvVar.e() < iE);
                u(iE);
                return;
            }
            do {
                zzaeqVar.d(zzacvVar.r());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iE2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.r()));
                } while (zzacvVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.r()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void b(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iE = zzacvVar.e() + zzacvVar.A();
                do {
                    zzadvVar.zzh(zzacvVar.s());
                } while (zzacvVar.e() < iE);
                u(iE);
                return;
            }
            do {
                zzadvVar.zzh(zzacvVar.s());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iE2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.s()));
                } while (zzacvVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.s()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void c(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzaeq;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzaeq zzaeqVar = (zzaeq) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iA = zzacvVar.A();
                w(iA);
                int iE = zzacvVar.e() + iA;
                do {
                    zzaeqVar.d(zzacvVar.t());
                } while (zzacvVar.e() < iE);
                return;
            }
            do {
                zzaeqVar.d(zzacvVar.t());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iA2 = zzacvVar.A();
                w(iA2);
                int iE2 = zzacvVar.e() + iA2;
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.t()));
                } while (zzacvVar.e() < iE2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.t()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void d(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 == 2) {
                int iA = zzacvVar.A();
                v(iA);
                int iE = zzacvVar.e() + iA;
                do {
                    zzadvVar.zzh(zzacvVar.u());
                } while (zzacvVar.e() < iE);
                return;
            }
            if (i11 != 5) {
                throw new zzaeg();
            }
            do {
                zzadvVar.zzh(zzacvVar.u());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 == 2) {
                int iA2 = zzacvVar.A();
                v(iA2);
                int iE2 = zzacvVar.e() + iA2;
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.u()));
                } while (zzacvVar.e() < iE2);
                return;
            }
            if (i12 != 5) {
                throw new zzaeg();
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.u()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void e(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzaci;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzaci zzaciVar = (zzaci) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iE = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaciVar.d(zzacvVar.v());
                } while (zzacvVar.e() < iE);
                u(iE);
                return;
            }
            do {
                zzaciVar.d(zzacvVar.v());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iE2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Boolean.valueOf(zzacvVar.v()));
                } while (zzacvVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                zzaefVar.add(Boolean.valueOf(zzacvVar.v()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void f(zzaef zzaefVar, boolean z11) throws zzaeg {
        int iL;
        int iL2;
        if ((this.f11233b & 7) != 2) {
            throw new zzaeg();
        }
        boolean z12 = zzaefVar instanceof zzaen;
        zzacv zzacvVar = this.f11232a;
        if (z12 && !z11) {
            zzaen zzaenVar = (zzaen) zzaefVar;
            do {
                K();
                zzaenVar.zzb();
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            do {
                zzaefVar.add(z11 ? H() : G());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void g(zzaef zzaefVar, zzafp zzafpVar, zzadf zzadfVar) throws zzaeh {
        int iL;
        int i11 = this.f11233b;
        if ((i11 & 7) != 2) {
            throw new zzaeg();
        }
        do {
            Object objZza = zzafpVar.zza();
            r(objZza, zzafpVar, zzadfVar);
            zzafpVar.a(objZza);
            zzaefVar.add(objZza);
            zzacv zzacvVar = this.f11232a;
            if (zzacvVar.d() || this.f11235d != 0) {
                return;
            } else {
                iL = zzacvVar.l();
            }
        } while (iL == i11);
        this.f11235d = iL;
    }

    public final void h(zzaef zzaefVar, zzafp zzafpVar, zzadf zzadfVar) throws zzaeg {
        int iL;
        int i11 = this.f11233b;
        if ((i11 & 7) != 3) {
            throw new zzaeg();
        }
        do {
            Object objZza = zzafpVar.zza();
            s(objZza, zzafpVar, zzadfVar);
            zzafpVar.a(objZza);
            zzaefVar.add(objZza);
            zzacv zzacvVar = this.f11232a;
            if (zzacvVar.d() || this.f11235d != 0) {
                return;
            } else {
                iL = zzacvVar.l();
            }
        } while (iL == i11);
        this.f11235d = iL;
    }

    public final void i(zzaef zzaefVar) throws zzaeg {
        int iL;
        if ((this.f11233b & 7) != 2) {
            throw new zzaeg();
        }
        do {
            zzaefVar.add(K());
            zzacv zzacvVar = this.f11232a;
            if (zzacvVar.d()) {
                return;
            } else {
                iL = zzacvVar.l();
            }
        } while (iL == this.f11233b);
        this.f11235d = iL;
    }

    public final void j(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iE = zzacvVar.e() + zzacvVar.A();
                do {
                    zzadvVar.zzh(zzacvVar.A());
                } while (zzacvVar.e() < iE);
                u(iE);
                return;
            }
            do {
                zzadvVar.zzh(zzacvVar.A());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iE2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.A()));
                } while (zzacvVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.A()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void k(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iE = zzacvVar.e() + zzacvVar.A();
                do {
                    zzadvVar.zzh(zzacvVar.B());
                } while (zzacvVar.e() < iE);
                u(iE);
                return;
            }
            do {
                zzadvVar.zzh(zzacvVar.B());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iE2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.B()));
                } while (zzacvVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.B()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void l(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 == 2) {
                int iA = zzacvVar.A();
                v(iA);
                int iE = zzacvVar.e() + iA;
                do {
                    zzadvVar.zzh(zzacvVar.C());
                } while (zzacvVar.e() < iE);
                return;
            }
            if (i11 != 5) {
                throw new zzaeg();
            }
            do {
                zzadvVar.zzh(zzacvVar.C());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 == 2) {
                int iA2 = zzacvVar.A();
                v(iA2);
                int iE2 = zzacvVar.e() + iA2;
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.C()));
                } while (zzacvVar.e() < iE2);
                return;
            }
            if (i12 != 5) {
                throw new zzaeg();
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.C()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void m(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzaeq;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzaeq zzaeqVar = (zzaeq) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iA = zzacvVar.A();
                w(iA);
                int iE = zzacvVar.e() + iA;
                do {
                    zzaeqVar.d(zzacvVar.D());
                } while (zzacvVar.e() < iE);
                return;
            }
            do {
                zzaeqVar.d(zzacvVar.D());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iA2 = zzacvVar.A();
                w(iA2);
                int iE2 = zzacvVar.e() + iA2;
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.D()));
                } while (zzacvVar.e() < iE2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.D()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void n(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzadv;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzadv zzadvVar = (zzadv) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iE = zzacvVar.e() + zzacvVar.A();
                do {
                    zzadvVar.zzh(zzacvVar.E());
                } while (zzacvVar.e() < iE);
                u(iE);
                return;
            }
            do {
                zzadvVar.zzh(zzacvVar.E());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iE2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.E()));
                } while (zzacvVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                zzaefVar.add(Integer.valueOf(zzacvVar.E()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void o(zzaef zzaefVar) throws zzaeh {
        int iL;
        int iL2;
        boolean z11 = zzaefVar instanceof zzaeq;
        zzacv zzacvVar = this.f11232a;
        if (z11) {
            zzaeq zzaeqVar = (zzaeq) zzaefVar;
            int i11 = this.f11233b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzaeg();
                }
                int iE = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaeqVar.d(zzacvVar.F());
                } while (zzacvVar.e() < iE);
                u(iE);
                return;
            }
            do {
                zzaeqVar.d(zzacvVar.F());
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL2 = zzacvVar.l();
                }
            } while (iL2 == this.f11233b);
        } else {
            int i12 = this.f11233b & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    throw new zzaeg();
                }
                int iE2 = zzacvVar.e() + zzacvVar.A();
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.F()));
                } while (zzacvVar.e() < iE2);
                u(iE2);
                return;
            }
            do {
                zzaefVar.add(Long.valueOf(zzacvVar.F()));
                if (zzacvVar.d()) {
                    return;
                } else {
                    iL = zzacvVar.l();
                }
            } while (iL == this.f11233b);
            iL2 = iL;
        }
        this.f11235d = iL2;
    }

    public final void p(zzaew zzaewVar, zzaeu zzaeuVar, zzadf zzadfVar) throws zzaeg {
        int i11;
        int i12;
        q(2);
        zzacv zzacvVar = this.f11232a;
        int iA = zzacvVar.a(zzacvVar.A());
        Object obj = zzaeuVar.f11292c;
        Object objT = BuildConfig.VERSION_NAME;
        Object objT2 = obj;
        while (true) {
            try {
                int iX = x();
                if (iX == Integer.MAX_VALUE || zzacvVar.d()) {
                    break;
                }
                boolean zN = false;
                if (iX == 1) {
                    objT = t(zzaeuVar.f11290a, null, null);
                } else if (iX != 2) {
                    try {
                        if (!((zzacvVar.d() || (i12 = this.f11233b) == this.f11234c) ? false : zzacvVar.n(i12))) {
                            throw new zzaeh("Unable to parse map entry.");
                        }
                    } catch (zzaeg e8) {
                        if (!zzacvVar.d() && (i11 = this.f11233b) != this.f11234c) {
                            zN = zzacvVar.n(i11);
                        }
                        if (!zN) {
                            throw new zzaeh("Unable to parse map entry.", e8);
                        }
                    }
                } else {
                    objT2 = t(zzaeuVar.f11291b, obj.getClass(), zzadfVar);
                }
            } catch (Throwable th2) {
                zzacvVar.b(iA);
                throw th2;
            }
        }
        zzaewVar.put(objT, objT2);
        zzacvVar.b(iA);
    }

    public final void q(int i11) throws zzaeg {
        if ((this.f11233b & 7) != i11) {
            throw new zzaeg();
        }
    }

    public final void r(Object obj, zzafp zzafpVar, zzadf zzadfVar) throws zzaeh {
        zzacv zzacvVar = this.f11232a;
        int iA = zzacvVar.A();
        if (zzacvVar.f11229a + zzacvVar.f11230b >= 100) {
            throw new zzaeh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iA2 = zzacvVar.a(iA);
        zzacvVar.f11229a++;
        zzafpVar.g(obj, this, zzadfVar);
        zzacvVar.m(0);
        zzacvVar.f11229a--;
        zzacvVar.b(iA2);
    }

    public final void s(Object obj, zzafp zzafpVar, zzadf zzadfVar) {
        int i11 = this.f11234c;
        this.f11234c = ((this.f11233b >>> 3) << 3) | 4;
        try {
            zzafpVar.g(obj, this, zzadfVar);
            if (this.f11233b != this.f11234c) {
                throw new zzaeh("Failed to parse the message.");
            }
            this.f11234c = i11;
        } catch (Throwable th2) {
            this.f11234c = i11;
            throw th2;
        }
    }

    public final Object t(zzagm zzagmVar, Class cls, zzadf zzadfVar) throws zzaeh {
        zzagm zzagmVar2 = zzagm.zza;
        switch (zzagmVar.ordinal()) {
            case 0:
                return Double.valueOf(y());
            case 1:
                return Float.valueOf(z());
            case 2:
                return Long.valueOf(B());
            case 3:
                return Long.valueOf(A());
            case 4:
                return Integer.valueOf(C());
            case 5:
                return Long.valueOf(D());
            case 6:
                return Integer.valueOf(E());
            case 7:
                return Boolean.valueOf(F());
            case 8:
                return H();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                q(2);
                zzafp zzafpVarA = zzafl.f11317c.a(cls);
                Object objZza = zzafpVarA.zza();
                r(objZza, zzafpVarA, zzadfVar);
                zzafpVarA.a(objZza);
                return objZza;
            case 11:
                return K();
            case 12:
                return Integer.valueOf(L());
            case 13:
                return Integer.valueOf(M());
            case 14:
                return Integer.valueOf(N());
            case 15:
                return Long.valueOf(O());
            case 16:
                return Integer.valueOf(P());
            case 17:
                return Long.valueOf(Q());
        }
    }

    public final void u(int i11) throws zzaeh {
        if (this.f11232a.e() != i11) {
            throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final int x() {
        int iL = this.f11235d;
        if (iL != 0) {
            this.f11233b = iL;
            this.f11235d = 0;
        } else {
            iL = this.f11232a.l();
            this.f11233b = iL;
        }
        if (iL == 0 || iL == this.f11234c) {
            return Integer.MAX_VALUE;
        }
        return iL >>> 3;
    }

    public final double y() throws zzaeg {
        q(1);
        return this.f11232a.o();
    }

    public final float z() throws zzaeg {
        q(5);
        return this.f11232a.p();
    }
}
