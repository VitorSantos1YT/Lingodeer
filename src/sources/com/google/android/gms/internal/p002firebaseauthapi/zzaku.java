package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.firebase-auth-api.zzaku.zzb;
import com.google.android.gms.internal.p002firebaseauthapi.zzaku;
import defpackage.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzaku<MessageType extends zzaku<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzaix<MessageType, BuilderType> {
    private static final Map<Class<?>, zzaku<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzani zzb = zzani.f10217f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zza<T extends zzaku<T, ?>> extends zzaiz<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class zzb<MessageType extends zzaku<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzaiw<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zzaku f10130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zzaku f10131b;

        public zzb(zzaku zzakuVar) {
            this.f10130a = zzakuVar;
            if (zzakuVar.u()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f10131b = zzakuVar.r();
        }

        public static void f(Object obj, Object obj2) {
            zzamn zzamnVar = zzamn.f10187c;
            zzamnVar.getClass();
            zzamnVar.a(obj.getClass()).b(obj, obj2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
        public final /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.f10130a.l(5);
            zzbVar.f10131b = h();
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
        /* JADX INFO: renamed from: d */
        public final /* synthetic */ zzb clone() {
            return (zzb) clone();
        }

        public final zzaku g() {
            zzaku zzakuVarH = h();
            zzakuVarH.getClass();
            if (zzaku.p(zzakuVarH, true)) {
                return zzakuVarH;
            }
            throw new zzang();
        }

        public final zzaku h() {
            if (!this.f10131b.u()) {
                return this.f10131b;
            }
            this.f10131b.s();
            return this.f10131b;
        }

        public final void i() {
            if (this.f10131b.u()) {
                return;
            }
            j();
        }

        public final void j() {
            zzaku zzakuVarR = this.f10130a.r();
            f(zzakuVarR, this.f10131b);
            this.f10131b = zzakuVarR;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class zzc implements zzako<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzako
        public final zzanr zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzako
        public final zzanu zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzako
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzaku<MessageType, BuilderType> implements zzama {
        protected zzakm<zzc> zzc = zzakm.f10119d;

        public final zzakm v() {
            zzakm<zzc> zzakmVar = this.zzc;
            if (zzakmVar.f10121b) {
                this.zzc = (zzakm) zzakmVar.clone();
            }
            return this.zzc;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final enum zze {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10132a = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f10132a.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class zzf<ContainingType extends zzaly, Type> extends zzakg<ContainingType, Type> {
    }

    public static zzaku h(zzaku zzakuVar, zzaje zzajeVar, zzakj zzakjVar) throws zzale {
        zzajq zzajqVarO = zzajeVar.o();
        zzaku zzakuVarI = i(zzakuVar, zzajqVarO, zzakjVar);
        zzajqVarO.h(0);
        o(zzakuVarI);
        return zzakuVarI;
    }

    public static zzaku i(zzaku zzakuVar, zzajq zzajqVar, zzakj zzakjVar) throws zzale {
        zzaku zzakuVarR = zzakuVar.r();
        try {
            zzamn zzamnVar = zzamn.f10187c;
            zzamnVar.getClass();
            zzamr zzamrVarA = zzamnVar.a(zzakuVarR.getClass());
            zzamrVarA.f(zzakuVarR, zzajz.b(zzajqVar), zzakjVar);
            zzamrVarA.c(zzakuVarR);
            return zzakuVarR;
        } catch (zzale e8) {
            if (e8.f10145a) {
                throw new zzale(e8.getMessage(), e8);
            }
            throw e8;
        } catch (zzang e10) {
            throw new zzale(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof zzale) {
                throw ((zzale) e11.getCause());
            }
            throw new zzale(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof zzale) {
                throw ((zzale) e12.getCause());
            }
            throw e12;
        }
    }

    public static zzaku j(zzaku zzakuVar, byte[] bArr, zzakj zzakjVar) throws zzale {
        int length = bArr.length;
        if (length != 0) {
            zzaku zzakuVarR = zzakuVar.r();
            try {
                zzamn zzamnVar = zzamn.f10187c;
                zzamnVar.getClass();
                zzamr zzamrVarA = zzamnVar.a(zzakuVarR.getClass());
                zzamrVarA.d(zzakuVarR, bArr, 0, length, new zzajd(zzakjVar));
                zzamrVarA.c(zzakuVarR);
                zzakuVar = zzakuVarR;
            } catch (zzale e8) {
                if (e8.f10145a) {
                    throw new zzale(e8.getMessage(), e8);
                }
                throw e8;
            } catch (zzang e10) {
                throw new zzale(e10.getMessage());
            } catch (IOException e11) {
                if (e11.getCause() instanceof zzale) {
                    throw ((zzale) e11.getCause());
                }
                throw new zzale(e11.getMessage(), e11);
            } catch (IndexOutOfBoundsException unused) {
                throw zzale.g();
            }
        }
        o(zzakuVar);
        return zzakuVar;
    }

    public static zzaku k(Class cls) {
        Map<Class<?>, zzaku<?, ?>> map = zzc;
        zzaku<?, ?> zzakuVar = map.get(cls);
        if (zzakuVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzakuVar = map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (zzakuVar != null) {
            return zzakuVar;
        }
        zzaku<?, ?> zzakuVar2 = (zzaku) ((zzaku) zzank.a(cls)).l(6);
        if (zzakuVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, zzakuVar2);
        return zzakuVar2;
    }

    public static Object m(Method method, zzaku zzakuVar, Object... objArr) {
        try {
            return method.invoke(zzakuVar, objArr);
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

    public static void n(Class cls, zzaku zzakuVar) {
        zzakuVar.t();
        zzc.put(cls, zzakuVar);
    }

    public static void o(zzaku zzakuVar) throws zzale {
        if (zzakuVar != null && !p(zzakuVar, true)) {
            throw new zzale(new zzang().getMessage());
        }
    }

    public static final boolean p(zzaku zzakuVar, boolean z11) {
        byte bByteValue = ((Byte) zzakuVar.l(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        zzamn zzamnVar = zzamn.f10187c;
        zzamnVar.getClass();
        boolean zA = zzamnVar.a(zzakuVar.getClass()).a(zzakuVar);
        if (z11) {
            zzakuVar.l(2);
        }
        return zA;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaly
    public final void a(zzakb zzakbVar) {
        zzamn zzamnVar = zzamn.f10187c;
        zzamnVar.getClass();
        zzamr zzamrVarA = zzamnVar.a(getClass());
        Object obj = zzakbVar.f10106a;
        zzamrVarA.e(this, obj != null ? (zzake) obj : new zzake(zzakbVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
    public final int b(zzamr zzamrVar) {
        int iH;
        int iH2;
        if (u()) {
            if (zzamrVar == null) {
                zzamn zzamnVar = zzamn.f10187c;
                zzamnVar.getClass();
                iH2 = zzamnVar.a(getClass()).h(this);
            } else {
                iH2 = zzamrVar.h(this);
            }
            if (iH2 >= 0) {
                return iH2;
            }
            throw new IllegalStateException(p.j(iH2, "serialized size must be non-negative, was "));
        }
        if (e() != Integer.MAX_VALUE) {
            return e();
        }
        if (zzamrVar == null) {
            zzamn zzamnVar2 = zzamn.f10187c;
            zzamnVar2.getClass();
            iH = zzamnVar2.a(getClass()).h(this);
        } else {
            iH = zzamrVar.h(this);
        }
        d(iH);
        return iH;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaly
    public final /* synthetic */ zzb c() {
        return (zzb) l(5);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
    public final void d(int i11) {
        if (i11 < 0) {
            throw new IllegalStateException(p.j(i11, "serialized size must be non-negative, was "));
        }
        this.zzd = (i11 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
    public final int e() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzamn zzamnVar = zzamn.f10187c;
        zzamnVar.getClass();
        return zzamnVar.a(getClass()).g(this, (zzaku) obj);
    }

    public final int hashCode() {
        if (u()) {
            zzamn zzamnVar = zzamn.f10187c;
            zzamnVar.getClass();
            return zzamnVar.a(getClass()).i(this);
        }
        if (this.zza == 0) {
            zzamn zzamnVar2 = zzamn.f10187c;
            zzamnVar2.getClass();
            this.zza = zzamnVar2.a(getClass()).i(this);
        }
        return this.zza;
    }

    public abstract Object l(int i11);

    public final zzb q() {
        return (zzb) l(5);
    }

    public final zzaku r() {
        return (zzaku) l(4);
    }

    public final void s() {
        zzamn zzamnVar = zzamn.f10187c;
        zzamnVar.getClass();
        zzamnVar.a(getClass()).c(this);
        t();
    }

    public final void t() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = zzamd.f10176a;
        StringBuilder sbR = e.r("# ", string);
        zzamd.b(this, sbR, 0);
        return sbR.toString();
    }

    public final boolean u() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaly
    public final int zzl() {
        return b(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzama
    public final /* synthetic */ zzaku zzs() {
        return (zzaku) l(6);
    }
}
