package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.l f1952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1955d = 0;

    public k(androidx.datastore.preferences.protobuf.l lVar) {
        Charset charset = b0.f1912a;
        this.f1952a = lVar;
        lVar.f1510b = this;
    }

    public final int a() {
        int i11 = this.f1955d;
        if (i11 != 0) {
            this.f1953b = i11;
            this.f1955d = 0;
        } else {
            this.f1953b = this.f1952a.A();
        }
        int i12 = this.f1953b;
        if (i12 == 0 || i12 == this.f1954c) {
            return Integer.MAX_VALUE;
        }
        return i12 >>> 3;
    }

    public final void b(Object obj, w0 w0Var, n nVar) {
        int i11 = this.f1954c;
        this.f1954c = ((this.f1953b >>> 3) << 3) | 4;
        try {
            w0Var.f(obj, this, nVar);
            if (this.f1953b != this.f1954c) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            this.f1954c = i11;
        } catch (Throwable th2) {
            this.f1954c = i11;
            throw th2;
        }
    }

    public final void c(Object obj, w0 w0Var, n nVar) throws InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        int iB = lVar.B();
        if (lVar.f1509a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iJ = lVar.j(iB);
        lVar.f1509a++;
        w0Var.f(obj, this, nVar);
        lVar.a(0);
        lVar.f1509a--;
        lVar.i(iJ);
    }

    public final void d(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 0) {
            do {
                ((u0) a0Var).add(Boolean.valueOf(lVar.k()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((u0) a0Var).add(Boolean.valueOf(lVar.k()));
        } while (lVar.b() < iB);
        u(iB);
    }

    public final h e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        v(2);
        return this.f1952a.m();
    }

    public final void f(a0 a0Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iA;
        if ((this.f1953b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((u0) a0Var).add(e());
            androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
            if (lVar.c()) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == this.f1953b);
        this.f1955d = iA;
    }

    public final void g(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 1) {
            do {
                ((u0) a0Var).add(Double.valueOf(lVar.n()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
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
            ((u0) a0Var).add(Double.valueOf(lVar.n()));
        } while (lVar.b() < iB2);
    }

    public final void h(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 0) {
            do {
                ((u0) a0Var).add(Integer.valueOf(lVar.o()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((u0) a0Var).add(Integer.valueOf(lVar.o()));
        } while (lVar.b() < iB);
        u(iB);
    }

    public final void i(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 2) {
            int iB = lVar.B();
            if ((iB & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB2 = lVar.b() + iB;
            do {
                ((u0) a0Var).add(Integer.valueOf(lVar.p()));
            } while (lVar.b() < iB2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((u0) a0Var).add(Integer.valueOf(lVar.p()));
            if (lVar.c()) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == this.f1953b);
        this.f1955d = iA;
    }

    public final void j(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 1) {
            do {
                ((u0) a0Var).add(Long.valueOf(lVar.q()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
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
            ((u0) a0Var).add(Long.valueOf(lVar.q()));
        } while (lVar.b() < iB2);
    }

    public final void k(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 2) {
            int iB = lVar.B();
            if ((iB & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB2 = lVar.b() + iB;
            do {
                ((u0) a0Var).add(Float.valueOf(lVar.r()));
            } while (lVar.b() < iB2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((u0) a0Var).add(Float.valueOf(lVar.r()));
            if (lVar.c()) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == this.f1953b);
        this.f1955d = iA;
    }

    public final void l(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 0) {
            do {
                ((u0) a0Var).add(Integer.valueOf(lVar.s()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((u0) a0Var).add(Integer.valueOf(lVar.s()));
        } while (lVar.b() < iB);
        u(iB);
    }

    public final void m(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 0) {
            do {
                ((u0) a0Var).add(Long.valueOf(lVar.t()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((u0) a0Var).add(Long.valueOf(lVar.t()));
        } while (lVar.b() < iB);
        u(iB);
    }

    public final void n(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 2) {
            int iB = lVar.B();
            if ((iB & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iB2 = lVar.b() + iB;
            do {
                ((u0) a0Var).add(Integer.valueOf(lVar.u()));
            } while (lVar.b() < iB2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            ((u0) a0Var).add(Integer.valueOf(lVar.u()));
            if (lVar.c()) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == this.f1953b);
        this.f1955d = iA;
    }

    public final void o(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 1) {
            do {
                ((u0) a0Var).add(Long.valueOf(lVar.v()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
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
            ((u0) a0Var).add(Long.valueOf(lVar.v()));
        } while (lVar.b() < iB2);
    }

    public final void p(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 0) {
            do {
                ((u0) a0Var).add(Integer.valueOf(lVar.w()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((u0) a0Var).add(Integer.valueOf(lVar.w()));
        } while (lVar.b() < iB);
        u(iB);
    }

    public final void q(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 0) {
            do {
                ((u0) a0Var).add(Long.valueOf(lVar.x()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((u0) a0Var).add(Long.valueOf(lVar.x()));
        } while (lVar.b() < iB);
        u(iB);
    }

    public final void r(a0 a0Var, boolean z11) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strY;
        int iA;
        if ((this.f1953b & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
            if (z11) {
                v(2);
                strY = lVar.z();
            } else {
                v(2);
                strY = lVar.y();
            }
            ((u0) a0Var).add(strY);
            if (lVar.c()) {
                return;
            } else {
                iA = lVar.A();
            }
        } while (iA == this.f1953b);
        this.f1955d = iA;
    }

    public final void s(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 0) {
            do {
                ((u0) a0Var).add(Integer.valueOf(lVar.B()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((u0) a0Var).add(Integer.valueOf(lVar.B()));
        } while (lVar.b() < iB);
        u(iB);
    }

    public final void t(a0 a0Var) throws InvalidProtocolBufferException {
        int iA;
        int i11 = this.f1953b & 7;
        androidx.datastore.preferences.protobuf.l lVar = this.f1952a;
        if (i11 == 0) {
            do {
                ((u0) a0Var).add(Long.valueOf(lVar.C()));
                if (lVar.c()) {
                    return;
                } else {
                    iA = lVar.A();
                }
            } while (iA == this.f1953b);
            this.f1955d = iA;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.b();
        }
        int iB = lVar.b() + lVar.B();
        do {
            ((u0) a0Var).add(Long.valueOf(lVar.C()));
        } while (lVar.b() < iB);
        u(iB);
    }

    public final void u(int i11) throws InvalidProtocolBufferException {
        if (this.f1952a.b() != i11) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final void v(int i11) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f1953b & 7) != i11) {
            throw InvalidProtocolBufferException.b();
        }
    }
}
