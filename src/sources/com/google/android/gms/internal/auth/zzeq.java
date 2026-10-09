package com.google.android.gms.internal.auth;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzeq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f9491c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzgl f9492a = new zzgl(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9493b;

    static {
        new zzeq(0);
    }

    private zzeq() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[RETURN] */
    public static final void c(zzep zzepVar, Object obj) {
        boolean z11;
        zzepVar.zzb();
        Charset charset = zzfa.f9501a;
        obj.getClass();
        zzho zzhoVar = zzho.zza;
        zzhp zzhpVar = zzhp.INT;
        switch (r0.a()) {
            case INT:
                z11 = obj instanceof Integer;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a(), obj.getClass().getName()));
            case LONG:
                z11 = obj instanceof Long;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a(), obj.getClass().getName()));
            case FLOAT:
                z11 = obj instanceof Float;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a(), obj.getClass().getName()));
            case DOUBLE:
                z11 = obj instanceof Double;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a(), obj.getClass().getName()));
            case BOOLEAN:
                z11 = obj instanceof Boolean;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a(), obj.getClass().getName()));
            case STRING:
                z11 = obj instanceof String;
                if (z11) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzef) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzex)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzfx) || (obj instanceof zzfc)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzepVar.zza()), zzepVar.zzb().a(), obj.getClass().getName()));
        }
    }

    public final void a() {
        if (this.f9493b) {
            return;
        }
        int i11 = 0;
        while (true) {
            zzgl zzglVar = this.f9492a;
            if (i11 >= zzglVar.f9556b.size()) {
                zzglVar.a();
                this.f9493b = true;
                return;
            }
            Map.Entry entry = (Map.Entry) zzglVar.f9556b.get(i11);
            if (entry.getValue() instanceof zzev) {
                zzev zzevVar = (zzev) entry.getValue();
                zzevVar.getClass();
                zzgf.f9532c.a(zzevVar.getClass()).a(zzevVar);
                zzevVar.c();
            }
            i11++;
        }
    }

    public final Object clone() {
        zzgl zzglVar;
        zzeq zzeqVar = new zzeq();
        int i11 = 0;
        while (true) {
            zzglVar = this.f9492a;
            if (i11 >= zzglVar.f9556b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) zzglVar.f9556b.get(i11);
            zzeqVar.b((zzep) entry.getKey(), entry.getValue());
            i11++;
        }
        for (Map.Entry entry2 : zzglVar.f9557c.isEmpty() ? zzgo.f9545b : zzglVar.f9557c.entrySet()) {
            zzeqVar.b((zzep) entry2.getKey(), entry2.getValue());
        }
        return zzeqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeq) {
            return this.f9492a.equals(((zzeq) obj).f9492a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9492a.hashCode();
    }

    public final void b(zzep zzepVar, Object obj) {
        if (zzepVar.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    c(zzepVar, arrayList.get(i11));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException(gkbGsXmgaxRjJ.hRkIAtLUBK);
            }
        } else {
            c(zzepVar, obj);
        }
        this.f9492a.put(zzepVar, obj);
    }

    public zzeq(int i11) {
        a();
        a();
    }
}
