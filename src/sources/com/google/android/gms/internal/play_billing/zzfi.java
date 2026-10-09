package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzfi;
import defpackage.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfi<MessageType extends zzfi<MessageType, BuilderType>, BuilderType extends zzfe<MessageType, BuilderType>> extends zzds<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzhi zzc = zzhi.f12449f;

    public static final boolean e(zzfi zzfiVar, boolean z11) {
        byte bByteValue = ((Byte) zzfiVar.f(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zA = zzgs.f12418c.a(zzfiVar.getClass()).a(zzfiVar);
        if (z11) {
            zzfiVar.f(2);
        }
        return zA;
    }

    public static zzfi i(Class cls) {
        Map map = zzb;
        zzfi zzfiVar = (zzfi) map.get(cls);
        if (zzfiVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzfiVar = (zzfi) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (zzfiVar != null) {
            return zzfiVar;
        }
        zzfi zzfiVar2 = (zzfi) ((zzfi) zzho.g(cls)).f(6);
        if (zzfiVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzfiVar2);
        return zzfiVar2;
    }

    public static Object j(Method method, zzfi zzfiVar, Object... objArr) {
        try {
            return method.invoke(zzfiVar, objArr);
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

    public static void m(Class cls, zzfi zzfiVar) {
        zzfiVar.l();
        zzb.put(cls, zzfiVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final /* synthetic */ zzgk a() {
        return (zzfe) f(5);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final void c(zzep zzepVar) {
        zzgv zzgvVarA = zzgs.f12418c.a(getClass());
        zzeq zzeqVar = zzepVar.f12358a;
        if (zzeqVar == null) {
            zzeqVar = new zzeq(zzepVar);
        }
        zzgvVarA.b(this, zzeqVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzds
    public final int d(zzgv zzgvVar) {
        if (o()) {
            int iC = zzgvVar.c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException(p.j(iC, "serialized size must be non-negative, was "));
        }
        int i11 = this.zzd & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iC2 = zzgvVar.c(this);
        if (iC2 < 0) {
            throw new IllegalStateException(p.j(iC2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
        return iC2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzgs.f12418c.a(getClass()).f(this, (zzfi) obj);
    }

    public abstract Object f(int i11);

    public final zzfe g() {
        return (zzfe) f(5);
    }

    public final zzfe h() {
        zzfe zzfeVar = (zzfe) f(5);
        if (!zzfeVar.f12377a.equals(this)) {
            if (!zzfeVar.f12378b.o()) {
                zzfi zzfiVar = (zzfi) zzfeVar.f12377a.f(4);
                zzgs.f12418c.a(zzfiVar.getClass()).zzg(zzfiVar, zzfeVar.f12378b);
                zzfeVar.f12378b = zzfiVar;
            }
            zzfi zzfiVar2 = zzfeVar.f12378b;
            zzgs.f12418c.a(zzfiVar2.getClass()).zzg(zzfiVar2, this);
        }
        return zzfeVar;
    }

    public final int hashCode() {
        if (o()) {
            return zzgs.f12418c.a(getClass()).d(this);
        }
        int i11 = this.zza;
        if (i11 != 0) {
            return i11;
        }
        int iD = zzgs.f12418c.a(getClass()).d(this);
        this.zza = iD;
        return iD;
    }

    public final void k() {
        zzgs.f12418c.a(getClass()).zzf(this);
        l();
    }

    public final void l() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void n() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean o() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = zzgn.f12400a;
        StringBuilder sbR = e.r("# ", string);
        zzgn.c(this, sbR, 0);
        return sbR.toString();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final /* synthetic */ zzfi zzh() {
        return (zzfi) f(6);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgl
    public final int zzj() {
        if (o()) {
            int iC = zzgs.f12418c.a(getClass()).c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException(p.j(iC, "serialized size must be non-negative, was "));
        }
        int i11 = this.zzd & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int iC2 = zzgs.f12418c.a(getClass()).c(this);
        if (iC2 < 0) {
            throw new IllegalStateException(p.j(iC2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
        return iC2;
    }
}
