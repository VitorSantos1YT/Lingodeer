package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f1517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1520d = 0;

    public n(l lVar) {
        Charset charset = e0.f1463a;
        this.f1517a = lVar;
        lVar.f1510b = this;
    }

    public final int a() {
        int i11 = this.f1520d;
        if (i11 != 0) {
            this.f1518b = i11;
            this.f1520d = 0;
        } else {
            this.f1518b = this.f1517a.A();
        }
        int i12 = this.f1518b;
        if (i12 == 0 || i12 == this.f1519c) {
            return Integer.MAX_VALUE;
        }
        return i12 >>> 3;
    }

    public final void b(Object obj, d1 d1Var, q qVar) {
        int i11 = this.f1519c;
        this.f1519c = ((this.f1518b >>> 3) << 3) | 4;
        try {
            d1Var.i(obj, this, qVar);
            if (this.f1518b != this.f1519c) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            this.f1519c = i11;
        } catch (Throwable th2) {
            this.f1519c = i11;
            throw th2;
        }
    }

    public final void c(Object obj, d1 d1Var, q qVar) throws InvalidProtocolBufferException {
        l lVar = this.f1517a;
        int iB = lVar.B();
        if (lVar.f1509a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = lVar.j(iB);
        lVar.f1509a++;
        d1Var.i(obj, this, qVar);
        lVar.a(0);
        lVar.f1509a--;
        lVar.i(iJ);
    }

    public final void d(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 0) {
            do {
                ((b1) d0Var).add(Boolean.valueOf(lVar.k()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((b1) d0Var).add(Boolean.valueOf(lVar.k()));
        } while (lVar.b() < iB);
        v(iB);
    }

    public final i e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        w(2);
        return this.f1517a.l();
    }

    public final void f(d0 d0Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iA;
        if ((this.f1518b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((b1) d0Var).add(e());
            l lVar = this.f1517a;
            if (lVar.c()) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == this.f1518b);
        this.f1520d = iA;
    }

    public final void g(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 1) {
            do {
                ((b1) d0Var).add(Double.valueOf(lVar.n()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.B();
        if ((iB & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iB2 = lVar.b() + iB;
        do {
            ((b1) d0Var).add(Double.valueOf(lVar.n()));
        } while (lVar.b() < iB2);
    }

    public final void h(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 0) {
            do {
                ((b1) d0Var).add(Integer.valueOf(lVar.o()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((b1) d0Var).add(Integer.valueOf(lVar.o()));
        } while (lVar.b() < iB);
        v(iB);
    }

    public final Object i(y1 y1Var, Class cls, q qVar) throws InvalidProtocolBufferException {
        int i11 = m.f1513a[y1Var.ordinal()];
        l lVar = this.f1517a;
        switch (i11) {
            case 1:
                w(0);
                return Boolean.valueOf(lVar.k());
            case 2:
                return e();
            case 3:
                w(1);
                return Double.valueOf(lVar.n());
            case 4:
                w(0);
                return Integer.valueOf(lVar.o());
            case 5:
                w(5);
                return Integer.valueOf(lVar.p());
            case 6:
                w(1);
                return Long.valueOf(lVar.q());
            case 7:
                w(5);
                return Float.valueOf(lVar.r());
            case 8:
                w(0);
                return Integer.valueOf(lVar.s());
            case 9:
                w(0);
                return Long.valueOf(lVar.t());
            case 10:
                w(2);
                d1 d1VarA = a1.f1445c.a(cls);
                c0 c0VarD = d1VarA.d();
                c(c0VarD, d1VarA, qVar);
                d1VarA.b(c0VarD);
                return c0VarD;
            case 11:
                w(5);
                return Integer.valueOf(lVar.u());
            case 12:
                w(1);
                return Long.valueOf(lVar.v());
            case 13:
                w(0);
                return Integer.valueOf(lVar.w());
            case 14:
                w(0);
                return Long.valueOf(lVar.x());
            case 15:
                w(2);
                return lVar.z();
            case 16:
                w(0);
                return Integer.valueOf(lVar.B());
            case 17:
                w(0);
                return Long.valueOf(lVar.C());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void j(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 2) {
            int iB = lVar.B();
            if ((iB & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB2 = lVar.b() + iB;
            do {
                ((b1) d0Var).add(Integer.valueOf(lVar.p()));
            } while (lVar.b() < iB2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((b1) d0Var).add(Integer.valueOf(lVar.p()));
            if (lVar.c()) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == this.f1518b);
        this.f1520d = iA;
    }

    public final void k(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 1) {
            do {
                ((b1) d0Var).add(Long.valueOf(lVar.q()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.B();
        if ((iB & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iB2 = lVar.b() + iB;
        do {
            ((b1) d0Var).add(Long.valueOf(lVar.q()));
        } while (lVar.b() < iB2);
    }

    public final void l(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 2) {
            int iB = lVar.B();
            if ((iB & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB2 = lVar.b() + iB;
            do {
                ((b1) d0Var).add(Float.valueOf(lVar.r()));
            } while (lVar.b() < iB2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((b1) d0Var).add(Float.valueOf(lVar.r()));
            if (lVar.c()) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == this.f1518b);
        this.f1520d = iA;
    }

    public final void m(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 0) {
            do {
                ((b1) d0Var).add(Integer.valueOf(lVar.s()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((b1) d0Var).add(Integer.valueOf(lVar.s()));
        } while (lVar.b() < iB);
        v(iB);
    }

    public final void n(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 0) {
            do {
                ((b1) d0Var).add(Long.valueOf(lVar.t()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((b1) d0Var).add(Long.valueOf(lVar.t()));
        } while (lVar.b() < iB);
        v(iB);
    }

    public final void o(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 2) {
            int iB = lVar.B();
            if ((iB & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB2 = lVar.b() + iB;
            do {
                ((b1) d0Var).add(Integer.valueOf(lVar.u()));
            } while (lVar.b() < iB2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((b1) d0Var).add(Integer.valueOf(lVar.u()));
            if (lVar.c()) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == this.f1518b);
        this.f1520d = iA;
    }

    public final void p(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 1) {
            do {
                ((b1) d0Var).add(Long.valueOf(lVar.v()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.B();
        if ((iB & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iB2 = lVar.b() + iB;
        do {
            ((b1) d0Var).add(Long.valueOf(lVar.v()));
        } while (lVar.b() < iB2);
    }

    public final void q(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 0) {
            do {
                ((b1) d0Var).add(Integer.valueOf(lVar.w()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((b1) d0Var).add(Integer.valueOf(lVar.w()));
        } while (lVar.b() < iB);
        v(iB);
    }

    public final void r(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 0) {
            do {
                ((b1) d0Var).add(Long.valueOf(lVar.x()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((b1) d0Var).add(Long.valueOf(lVar.x()));
        } while (lVar.b() < iB);
        v(iB);
    }

    public final void s(d0 d0Var, boolean z11) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strY;
        int iA;
        if ((this.f1518b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            l lVar = this.f1517a;
            if (z11) {
                w(2);
                strY = lVar.z();
            } else {
                w(2);
                strY = lVar.y();
            }
            ((b1) d0Var).add(strY);
            if (lVar.c()) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == this.f1518b);
        this.f1520d = iA;
    }

    public final void t(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 0) {
            do {
                ((b1) d0Var).add(Integer.valueOf(lVar.B()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((b1) d0Var).add(Integer.valueOf(lVar.B()));
        } while (lVar.b() < iB);
        v(iB);
    }

    public final void u(d0 d0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1518b & 7;
        l lVar = this.f1517a;
        if (i11 == 0) {
            do {
                ((b1) d0Var).add(Long.valueOf(lVar.C()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1518b);
            this.f1520d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((b1) d0Var).add(Long.valueOf(lVar.C()));
        } while (lVar.b() < iB);
        v(iB);
    }

    public final void v(int i11) throws InvalidProtocolBufferException {
        if (this.f1517a.b() != i11) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void w(int i11) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f1518b & 7) != i11) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean x() {
        int i11;
        l lVar = this.f1517a;
        if (lVar.c() || (i11 = this.f1518b) == this.f1519c) {
            return false;
        }
        return lVar.D(i11);
    }
}
