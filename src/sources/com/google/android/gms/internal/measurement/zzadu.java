package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzadp;
import com.google.android.gms.internal.measurement.zzadu;
import defpackage.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzadu<MessageType extends zzadu<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> extends zzacb<MessageType, BuilderType> {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb = -1;
    protected zzaga zzc = zzaga.f11345f;

    public static zzadu k(zzadu zzaduVar, byte[] bArr, zzadf zzadfVar) throws zzaeh {
        int length = bArr.length;
        if (length != 0) {
            zzadu zzaduVarN = zzaduVar.n();
            try {
                zzafp zzafpVarA = zzafl.f11317c.a(zzaduVarN.getClass());
                zzafpVarA.f(zzaduVarN, bArr, 0, length, new zzacg(zzadfVar));
                zzafpVarA.a(zzaduVarN);
                zzaduVar = zzaduVarN;
            } catch (zzaeh e8) {
                if (e8.f11277a) {
                    throw new zzaeh(e8.getMessage(), e8);
                }
                throw e8;
            } catch (zzafy e10) {
                throw e10.a();
            } catch (IOException e11) {
                if (e11.getCause() instanceof zzaeh) {
                    throw ((zzaeh) e11.getCause());
                }
                throw new zzaeh(e11.getMessage(), e11);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzaeh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        w(zzaduVar);
        return zzaduVar;
    }

    public static zzadu s(Class cls) {
        Map map = zze;
        zzadu zzaduVar = (zzadu) map.get(cls);
        if (zzaduVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzaduVar = (zzadu) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (zzaduVar != null) {
            return zzaduVar;
        }
        zzadu zzaduVar2 = (zzadu) ((zzadu) zzagg.d(cls)).x(6);
        if (zzaduVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzaduVar2);
        return zzaduVar2;
    }

    public static void t(Class cls, zzadu zzaduVar) {
        zzaduVar.m();
        zze.put(cls, zzaduVar);
    }

    public static Object u(Method method, zzadu zzaduVar, Object... objArr) {
        try {
            return method.invoke(zzaduVar, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean v(zzadu zzaduVar, boolean z11) {
        byte bByteValue = ((Byte) zzaduVar.x(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzafl.f11317c.a(zzaduVar.getClass()).zzl(zzaduVar);
        if (z11) {
            zzaduVar.x(2);
        }
        return zZzl;
    }

    public static void w(zzadu zzaduVar) throws zzaeh {
        if (zzaduVar != null && !v(zzaduVar, true)) {
            throw new zzafy().a();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzafd
    public final /* synthetic */ zzadu a() {
        return (zzadu) x(6);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final /* synthetic */ zzafb d() {
        return (zzadp) x(5);
    }

    @Override // com.google.android.gms.internal.measurement.zzacb
    public final int e(zzafp zzafpVar) {
        if (l()) {
            int iD = zzafpVar.d(this);
            if (iD >= 0) {
                return iD;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iD);
            throw new IllegalStateException(sb2.toString());
        }
        int i11 = this.zzb & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iD2 = zzafpVar.d(this);
        if (iD2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iD2;
            return iD2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iD2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iD2);
        throw new IllegalStateException(sb3.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzafl.f11317c.a(getClass()).e(this, (zzadu) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final zzafj f() {
        return (zzafj) x(7);
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final int h() {
        if (l()) {
            int iD = zzafl.f11317c.a(getClass()).d(this);
            if (iD >= 0) {
                return iD;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iD).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iD);
            throw new IllegalStateException(sb2.toString());
        }
        int i11 = this.zzb & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iD2 = zzafl.f11317c.a(getClass()).d(this);
        if (iD2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iD2;
            return iD2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iD2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iD2);
        throw new IllegalStateException(sb3.toString());
    }

    public final int hashCode() {
        if (l()) {
            return zzafl.f11317c.a(getClass()).h(this);
        }
        int i11 = this.zza;
        if (i11 != 0) {
            return i11;
        }
        int iH = zzafl.f11317c.a(getClass()).h(this);
        this.zza = iH;
        return iH;
    }

    @Override // com.google.android.gms.internal.measurement.zzafc
    public final void i(zzada zzadaVar) {
        zzafp zzafpVarA = zzafl.f11317c.a(getClass());
        Object obj = zzadaVar.f11246a;
        zzafpVarA.b(this, obj != null ? (zzadb) obj : new zzadb(zzadaVar));
    }

    public final boolean l() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void m() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final zzadu n() {
        return (zzadu) x(4);
    }

    public final void o() {
        zzafl.f11317c.a(getClass()).a(this);
        m();
    }

    public final zzadp p() {
        return (zzadp) x(5);
    }

    public final zzadp q() {
        zzadp zzadpVar = (zzadp) x(5);
        zzadpVar.q(this);
        return zzadpVar;
    }

    public final void r() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = zzafe.f11298a;
        StringBuilder sbR = e.r("# ", string);
        zzafe.b(this, sbR, 0);
        return sbR.toString();
    }

    public abstract Object x(int i11);
}
